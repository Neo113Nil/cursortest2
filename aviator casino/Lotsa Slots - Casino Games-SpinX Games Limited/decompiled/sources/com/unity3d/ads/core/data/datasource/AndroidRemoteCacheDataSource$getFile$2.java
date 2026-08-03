package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {51, 52}, m = "invokeSuspend", n = {"$this$withContext", "file", "etagFile", "request", "fileSizeBefore", "$this$withContext", "file", "etagFile", "fileSizeBefore"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes5.dex */
final class AndroidRemoteCacheDataSource$getFile$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult>, java.lang.Object> {
    final /* synthetic */ java.io.File $cachePath;
    final /* synthetic */ java.lang.String $fileName;
    final /* synthetic */ java.lang.Integer $priority;
    final /* synthetic */ java.lang.String $url;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidRemoteCacheDataSource$getFile$2(java.lang.String str, com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource androidRemoteCacheDataSource, java.io.File file, java.lang.String str2, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2 androidRemoteCacheDataSource$getFile$2 = new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, continuation);
        androidRemoteCacheDataSource$getFile$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFile$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return ((com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x017c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.unity3d.ads.core.domain.CreateFile createFile;
        long length;
        com.unity3d.ads.core.domain.CreateFile createFile2;
        java.io.File invoke;
        com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
        java.lang.Object invoke2;
        java.io.File file;
        com.unity3d.services.core.network.model.HttpRequest httpRequest;
        java.lang.Object execute;
        com.unity3d.services.core.network.model.HttpResponse httpResponse;
        java.lang.String str;
        java.lang.Object m10798constructorimpl;
        java.lang.Object m10798constructorimpl2;
        com.unity3d.ads.core.domain.GetFileExtensionFromUrl getFileExtensionFromUrl;
        okio.BufferedSink bufferedSink;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            java.lang.String str3 = this.$url;
            if (str3 != null && str3.length() != 0) {
                createFile = this.this$0.createFile;
                java.io.File invoke3 = createFile.invoke(this.$cachePath, this.$fileName + ".part");
                if (!invoke3.exists()) {
                    invoke3.createNewFile();
                }
                length = invoke3.length();
                createFile2 = this.this$0.createFile;
                invoke = createFile2.invoke(this.$cachePath, this.$fileName + ".etag");
                java.io.File file2 = invoke.exists() ? invoke : null;
                java.lang.String readText$default = file2 != null ? kotlin.io.FilesKt.readText$default(file2, null, 1, null) : null;
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                if (length > 0) {
                    createMapBuilder.put(com.google.common.net.HttpHeaders.RANGE, kotlin.collections.CollectionsKt.listOf("bytes=" + length + '-'));
                }
                if (readText$default != null) {
                    createMapBuilder.put(com.google.common.net.HttpHeaders.IF_RANGE, kotlin.collections.CollectionsKt.listOf("\"" + readText$default + '\"'));
                }
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                java.lang.Integer num = this.$priority;
                com.unity3d.services.core.network.model.HttpRequest httpRequest2 = new com.unity3d.services.core.network.model.HttpRequest(this.$url, null, null, null, build, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
                httpClientProvider = this.this$0.httpClientProvider;
                this.L$0 = coroutineScope;
                this.L$1 = invoke3;
                this.L$2 = invoke;
                this.L$3 = httpRequest2;
                this.J$0 = length;
                this.label = 1;
                invoke2 = httpClientProvider.invoke(this);
                if (invoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file = invoke3;
                httpRequest = httpRequest2;
            } else {
                return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.MALFORMED_URL, com.unity3d.ads.core.data.model.CacheSource.REMOTE, null, 4, null);
            }
        } else if (i == 1) {
            length = this.J$0;
            httpRequest = (com.unity3d.services.core.network.model.HttpRequest) this.L$3;
            java.io.File file3 = (java.io.File) this.L$2;
            file = (java.io.File) this.L$1;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke2 = obj;
            invoke = file3;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.J$0;
            java.io.File file4 = (java.io.File) this.L$2;
            java.io.File file5 = (java.io.File) this.L$1;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = file4;
            file = file5;
            execute = obj;
            httpResponse = (com.unity3d.services.core.network.model.HttpResponse) execute;
            if (com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(httpResponse)) {
                return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, new java.lang.Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            java.util.List<java.lang.String> list = httpResponse.getHeaders().get(com.google.common.net.HttpHeaders.ETAG);
            if (list == null || (str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null || (str = kotlin.text.StringsKt.trim(str2, '\"')) == null) {
                str = "";
            }
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                kotlin.io.FilesKt.writeText$default(invoke, str, null, 2, null);
            }
            if (length > 0 && httpResponse.getStatusCode() == 200) {
                file.delete();
                file.createNewFile();
            }
            java.lang.Object body = httpResponse.getBody();
            java.io.InputStream inputStream = body instanceof java.io.InputStream ? (java.io.InputStream) body : null;
            if (inputStream == null) {
                return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, new java.lang.Exception("Response body is not an InputStream"));
            }
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                bufferedSink = inputStream;
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            try {
                java.io.InputStream inputStream2 = bufferedSink;
                byte[] bArr = new byte[8192];
                okio.Sink appendingSink = okio.Okio.appendingSink(file);
                try {
                    bufferedSink = okio.Okio.buffer(appendingSink);
                    try {
                        okio.BufferedSink bufferedSink2 = bufferedSink;
                        while (true) {
                            int read = inputStream2.read(bArr);
                            java.io.InputStream inputStream3 = inputStream2;
                            if (read == -1) {
                                break;
                            }
                            bufferedSink2.write(bArr, 0, read);
                            bufferedSink2.flush();
                            intRef.element += read;
                            inputStream2 = inputStream3;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(bufferedSink, null);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(appendingSink, null);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(bufferedSink, null);
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                        if (m10801exceptionOrNullimpl != null) {
                            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, m10801exceptionOrNullimpl);
                        }
                        if (httpResponse.getStatusCode() != 206 ? httpResponse.getContentSize() == -1 ? file.length() <= 0 : file.length() != httpResponse.getContentSize() : file.length() != httpResponse.getContentSize() + length) {
                            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, null, 4, null);
                        }
                        java.io.File file6 = new java.io.File(this.$cachePath, this.$fileName);
                        try {
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            if (file6.exists() && !file6.delete()) {
                                throw new java.lang.IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
                            }
                        } catch (java.lang.Throwable th2) {
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                        }
                        if (!file.renameTo(file6)) {
                            throw new java.lang.IllegalStateException("Could not rename temporary file to final file".toString());
                        }
                        if (invoke.exists() && !invoke.delete()) {
                            throw new java.lang.IllegalStateException("Could not delete Etag file after successful download".toString());
                        }
                        m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                        java.lang.Throwable m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl2);
                        if (m10801exceptionOrNullimpl2 != null) {
                            return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_STATE_WRONG, com.unity3d.ads.core.data.model.CacheSource.REMOTE, m10801exceptionOrNullimpl2);
                        }
                        java.lang.String str4 = this.$url;
                        java.lang.String str5 = this.$fileName;
                        getFileExtensionFromUrl = this.this$0.getFileExtensionFromUrl;
                        java.lang.String invoke4 = getFileExtensionFromUrl.invoke(this.$url);
                        java.lang.String str6 = invoke4 == null ? "" : invoke4;
                        long j = intRef.element;
                        java.lang.String protocol = httpResponse.getProtocol();
                        java.lang.Integer num2 = this.$priority;
                        return new com.unity3d.ads.core.data.model.CacheResult.Success(new com.unity3d.ads.core.data.model.CachedFile(str4, str5, file6, str6, j, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), com.unity3d.ads.core.data.model.CacheSource.REMOTE);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        this.L$0 = coroutineScope;
        this.L$1 = file;
        this.L$2 = invoke;
        this.L$3 = null;
        this.J$0 = length;
        this.label = 2;
        execute = ((com.unity3d.services.core.network.core.HttpClient) invoke2).execute(httpRequest, true, this);
        if (execute == coroutine_suspended) {
            return coroutine_suspended;
        }
        httpResponse = (com.unity3d.services.core.network.model.HttpResponse) execute;
        if (com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(httpResponse)) {
        }
    }
}
