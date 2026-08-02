package com.paypal.oslo.downloads.impl.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/DownloadHttpClientImpl;", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "Lcom/paypal/oslo/downloads/impl/di/DownloadOkHttpClientProvider;", "downloadOkHttpClientProvider", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "dispatchers", "<init>", "(Lcom/paypal/oslo/downloads/impl/di/DownloadOkHttpClientProvider;Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;)V", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError;", "Lokhttp3/Response;", "download", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;)Larrow/core/Either;", "downloadAsync", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/downloads/impl/di/DownloadOkHttpClientProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadHttpClientImpl implements com.paypal.oslo.downloads.api.DownloadHttpClient {
    private static final com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl.Companion Companion = new com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.di.DownloadDispatchers Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DownloadHttpClientImpl(com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider downloadOkHttpClientProvider, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadOkHttpClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDispatchers, "");
        this.getHighSpeedVideoSizes = downloadOkHttpClientProvider;
        this.Camera2StreamConfigurationMap = downloadDispatchers;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/DownloadHttpClientImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.downloads.api.DownloadHttpClient
    public final arrow.core.Either<com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response> download(com.paypal.oslo.downloads.api.model.DownloadRequest request) {
        com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch mimeTypeMismatch;
        arrow.core.Either<com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response> left;
        java.lang.String substringBefore$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        try {
            java.lang.String url = request.getUrl();
            com.paypal.oslo.downloads.api.model.DownloadAuthType authType = request.getAuthType();
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(request.getHeaders());
            if (request.getExpectedMimeType() != null && !mutableMap.containsKey("Accept")) {
                mutableMap.put("Accept", request.getExpectedMimeType());
            }
            okhttp3.Request.Builder url2 = new okhttp3.Request.Builder().url(url);
            for (java.util.Map.Entry entry : mutableMap.entrySet()) {
                url2.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            if (authType instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth) {
                url2.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.NoAuthTag.class, (java.lang.Class) com.paypal.oslo.core.identity.NoAuthTag.INSTANCE);
            } else if (authType instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth) {
                com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth userAuth = (com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth) authType;
                url2.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.UserAuthTag.class, (java.lang.Class) new com.paypal.oslo.core.identity.UserAuthTag(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(userAuth.getAuthenticationState(), new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(userAuth.getSource(), (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))));
            } else {
                if (!(authType instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                url2.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.ClientAuthTag.class, (java.lang.Class) new com.paypal.oslo.core.identity.ClientAuthTag(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(((com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth) authType).getSource(), (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            okhttp3.Response execute = this.getHighSpeedVideoSizes.getCallFactory().newCall(url2.build()).execute();
            try {
                java.lang.String expectedMimeType = request.getExpectedMimeType();
                if (expectedMimeType != null && execute.getIsSuccessful()) {
                    java.lang.String header$default = okhttp3.Response.header$default(execute, "Content-Type", null, 2, null);
                    java.lang.String obj = (header$default == null || (substringBefore$default = kotlin.text.StringsKt.substringBefore$default(header$default, ';', (java.lang.String) null, 2, (java.lang.Object) null)) == null) ? null : kotlin.text.StringsKt.trim(substringBefore$default).toString();
                    if (obj != null && !com.paypal.oslo.downloads.impl.util.MimeTypeUtilsKt.mimeTypesMatch(obj, expectedMimeType)) {
                        execute.close();
                        mimeTypeMismatch = new com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch(expectedMimeType, obj);
                        return (mimeTypeMismatch != null || (left = arrow.core.EitherKt.left(mimeTypeMismatch)) == null) ? arrow.core.EitherKt.right(execute) : left;
                    }
                }
                mimeTypeMismatch = null;
                if (mimeTypeMismatch != null) {
                }
            } catch (java.lang.RuntimeException e) {
                execute.close();
                return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError(new java.io.IOException("Error during response validation: ".concat(java.lang.String.valueOf(e.getMessage())), e), null, 2, null));
            }
        } catch (java.io.IOException e2) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError(e2, null, 2, null));
        } catch (java.lang.RuntimeException e3) {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e3.getClass()).getSimpleName();
            java.lang.String message = e3.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected error (");
            sb.append(simpleName);
            sb.append("): ");
            sb.append(message);
            return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError(new java.io.IOException(sb.toString(), e3), null, 2, null));
        } catch (java.net.SocketTimeoutException e4) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError(e4, null, 2, null));
        }
    }

    @Override // com.paypal.oslo.downloads.api.DownloadHttpClient
    public final java.lang.Object downloadAsync(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap.getDispatcher(), new com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl$downloadAsync$2(this, downloadRequest, null), continuation);
    }
}
