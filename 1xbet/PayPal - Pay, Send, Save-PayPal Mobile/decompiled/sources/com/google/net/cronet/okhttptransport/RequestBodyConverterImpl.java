package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
final class RequestBodyConverterImpl implements com.google.net.cronet.okhttptransport.RequestBodyConverter {
    private final com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter inMemoryRequestBodyConverter;
    private final com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter streamingRequestBodyConverter;

    RequestBodyConverterImpl(com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter inMemoryRequestBodyConverter, com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter streamingRequestBodyConverter) {
        this.inMemoryRequestBodyConverter = inMemoryRequestBodyConverter;
        this.streamingRequestBodyConverter = streamingRequestBodyConverter;
    }

    static com.google.net.cronet.okhttptransport.RequestBodyConverterImpl create(java.util.concurrent.ExecutorService executorService) {
        return new com.google.net.cronet.okhttptransport.RequestBodyConverterImpl(new com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter(), new com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter(executorService));
    }

    @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
    public final org.chromium.net.UploadDataProvider convertRequestBody(okhttp3.RequestBody requestBody, int i) throws java.io.IOException {
        long contentLength = requestBody.getContentLength();
        if (contentLength == -1 || contentLength > com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) {
            return this.streamingRequestBodyConverter.convertRequestBody(requestBody, i);
        }
        return this.inMemoryRequestBodyConverter.convertRequestBody(requestBody, i);
    }

    static final class StreamingRequestBodyConverter implements com.google.net.cronet.okhttptransport.RequestBodyConverter {
        private final java.util.concurrent.ExecutorService readerExecutor;

        StreamingRequestBodyConverter(java.util.concurrent.ExecutorService executorService) {
            this.readerExecutor = executorService;
        }

        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public final org.chromium.net.UploadDataProvider convertRequestBody(okhttp3.RequestBody requestBody, int i) {
            return new com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider(requestBody, new com.google.net.cronet.okhttptransport.UploadBodyDataBroker(), this.readerExecutor, i, null);
        }

        static class StreamingUploadDataProvider extends org.chromium.net.UploadDataProvider {
            private final com.google.net.cronet.okhttptransport.UploadBodyDataBroker broker;
            private final okhttp3.RequestBody okHttpRequestBody;
            private final com.google.common.util.concurrent.ListeningExecutorService readTaskExecutor;
            private com.google.common.util.concurrent.ListenableFuture readTaskFuture;
            private long totalBytesReadFromOkHttp;
            private final long writeTimeoutMillis;

            private StreamingUploadDataProvider(okhttp3.RequestBody requestBody, com.google.net.cronet.okhttptransport.UploadBodyDataBroker uploadBodyDataBroker, java.util.concurrent.ExecutorService executorService, long j) {
                this.okHttpRequestBody = requestBody;
                this.broker = uploadBodyDataBroker;
                if (executorService instanceof com.google.common.util.concurrent.ListeningExecutorService) {
                    this.readTaskExecutor = (com.google.common.util.concurrent.ListeningExecutorService) executorService;
                } else {
                    this.readTaskExecutor = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(executorService);
                }
                this.writeTimeoutMillis = j == 0 ? androidx.collection.SieveCacheKt.NodeLinkMask : j;
            }

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() throws java.io.IOException {
                return this.okHttpRequestBody.getContentLength();
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
                ensureReadTaskStarted();
                if (getLength() == -1) {
                    readUnknownBodyLength(uploadDataSink, byteBuffer);
                } else {
                    readKnownBodyLength(uploadDataSink, byteBuffer);
                }
            }

            private void readKnownBodyLength(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
                try {
                    com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult readFromOkHttp = readFromOkHttp(byteBuffer);
                    if (this.totalBytesReadFromOkHttp > getLength()) {
                        throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
                    }
                    if (this.totalBytesReadFromOkHttp < getLength()) {
                        int i = com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.AnonymousClass1.$SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[readFromOkHttp.ordinal()];
                        if (i == 1) {
                            uploadDataSink.onReadSucceeded(false);
                            return;
                        } else {
                            if (i == 2) {
                                throw new java.io.IOException("The source has been exhausted but we expected more data!");
                            }
                            return;
                        }
                    }
                    handleLastBodyRead(uploadDataSink, byteBuffer);
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new java.io.IOException(e));
                }
            }

            private void handleLastBodyRead(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
                int position = byteBuffer.position();
                byteBuffer.position(0);
                if (!readFromOkHttp(byteBuffer).equals(com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.END_OF_BODY)) {
                    throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
                }
                com.google.common.base.Verify.verify(byteBuffer.position() == 0, "END_OF_BODY reads shouldn't write anything to the buffer", new java.lang.Object[0]);
                byteBuffer.position(position);
                uploadDataSink.onReadSucceeded(false);
            }

            private void readUnknownBodyLength(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
                try {
                    uploadDataSink.onReadSucceeded(readFromOkHttp(byteBuffer).equals(com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.END_OF_BODY));
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new java.io.IOException(e));
                }
            }

            private void ensureReadTaskStarted() {
                if (this.readTaskFuture == null) {
                    com.google.common.util.concurrent.ListenableFuture submit = this.readTaskExecutor.submit(new java.util.concurrent.Callable() { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl$StreamingRequestBodyConverter$StreamingUploadDataProvider$$ExternalSyntheticLambda0
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            java.lang.Void lambda$ensureReadTaskStarted$0;
                            lambda$ensureReadTaskStarted$0 = com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider.this.lambda$ensureReadTaskStarted$0();
                            return lambda$ensureReadTaskStarted$0;
                        }
                    });
                    this.readTaskFuture = submit;
                    com.google.common.util.concurrent.Futures.addCallback(submit, new com.google.common.util.concurrent.FutureCallback(this) { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider.1
                        final /* synthetic */ com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider this$0;

                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onSuccess(java.lang.Object obj) {
                        }

                        {
                            java.util.Objects.requireNonNull(this);
                            this.this$0 = this;
                        }

                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onFailure(java.lang.Throwable th) {
                            this.this$0.com$google$net$cronet$okhttptransportRequestBodyConverterImpl$StreamingRequestBodyConverter$StreamingUploadDataProvider$broker$ar$desugaring_accessor().setBackgroundReadError(th);
                        }
                    }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ java.lang.Void lambda$ensureReadTaskStarted$0() throws java.lang.Exception {
                okio.BufferedSink buffer = okio.Okio.buffer(this.broker);
                this.okHttpRequestBody.writeTo(buffer);
                buffer.flush();
                this.broker.handleEndOfStreamSignal();
                return null;
            }

            private com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult readFromOkHttp(java.nio.ByteBuffer byteBuffer) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
                int position = byteBuffer.position();
                com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult readResult = (com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.broker.enqueueBodyRead(byteBuffer), this.writeTimeoutMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
                this.totalBytesReadFromOkHttp += byteBuffer.position() - position;
                return readResult;
            }

            private static java.io.IOException prepareBodyTooLongException(long j, long j2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ".length() + java.lang.String.valueOf(j).length() + " bytes but got at least ".length() + java.lang.String.valueOf(j2).length());
                sb.append("Expected ");
                sb.append(j);
                sb.append(" bytes but got at least ");
                sb.append(j2);
                return new java.io.IOException(sb.toString());
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new java.lang.UnsupportedOperationException("Rewind is not supported!"));
            }

            /* synthetic */ com.google.net.cronet.okhttptransport.UploadBodyDataBroker com$google$net$cronet$okhttptransportRequestBodyConverterImpl$StreamingRequestBodyConverter$StreamingUploadDataProvider$broker$ar$desugaring_accessor() {
                return this.broker;
            }

            /* synthetic */ StreamingUploadDataProvider(okhttp3.RequestBody requestBody, com.google.net.cronet.okhttptransport.UploadBodyDataBroker uploadBodyDataBroker, java.util.concurrent.ExecutorService executorService, long j, byte[] bArr) {
                this(requestBody, uploadBodyDataBroker, executorService, j);
            }
        }
    }

    /* renamed from: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult;

        static {
            int[] iArr = new int[com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.values().length];
            $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult = iArr;
            try {
                iArr[com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.END_OF_BODY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static final class InMemoryRequestBodyConverter implements com.google.net.cronet.okhttptransport.RequestBodyConverter {
        InMemoryRequestBodyConverter() {
        }

        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public final org.chromium.net.UploadDataProvider convertRequestBody(final okhttp3.RequestBody requestBody, int i) throws java.io.IOException {
            final long contentLength = requestBody.getContentLength();
            if (contentLength < 0 || contentLength > com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected definite length less than 1048576but got ".length() + java.lang.String.valueOf(contentLength).length());
                sb.append("Expected definite length less than 1048576but got ");
                sb.append(contentLength);
                throw new java.io.IOException(sb.toString());
            }
            return new org.chromium.net.UploadDataProvider(this) { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter.1
                private volatile boolean isMaterialized;
                private final okio.Buffer materializedBody;

                {
                    java.util.Objects.requireNonNull(this);
                    this.isMaterialized = false;
                    this.materializedBody = new okio.Buffer();
                }

                @Override // org.chromium.net.UploadDataProvider
                public long getLength() {
                    return contentLength;
                }

                @Override // org.chromium.net.UploadDataProvider
                public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
                    if (!this.isMaterialized) {
                        requestBody.writeTo(this.materializedBody);
                        this.materializedBody.flush();
                        this.isMaterialized = true;
                        long length = getLength();
                        long size = this.materializedBody.size();
                        if (size != length) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected ".length() + java.lang.String.valueOf(length).length() + " bytes but got ".length() + java.lang.String.valueOf(size).length());
                            sb2.append("Expected ");
                            sb2.append(length);
                            sb2.append(" bytes but got ");
                            sb2.append(size);
                            throw new java.io.IOException(sb2.toString());
                        }
                    }
                    if (this.materializedBody.read(byteBuffer) == -1) {
                        throw new java.lang.IllegalStateException("The source has been exhausted but we expected more!");
                    }
                    uploadDataSink.onReadSucceeded(false);
                }

                @Override // org.chromium.net.UploadDataProvider
                public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
                    uploadDataSink.onRewindError(new java.lang.UnsupportedOperationException());
                }
            };
        }
    }
}
