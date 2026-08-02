package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.ErrorBoundary$logException$1", f = "ErrorBoundary.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ErrorBoundary$logException$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $configName;
    final /* synthetic */ java.lang.Throwable $exception;
    final /* synthetic */ java.lang.String $tag;
    int label;
    final /* synthetic */ com.statsig.androidsdk.ErrorBoundary this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.this$0.apiKey;
            if (str != null) {
                str2 = this.this$0.apiKey;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String canonicalName = this.$exception.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = this.$exception.getClass().getName();
                }
                hashSet = this.this$0.seen;
                if (!hashSet.contains(canonicalName)) {
                    hashSet2 = this.this$0.seen;
                    hashSet2.add(canonicalName);
                    statsigMetadata = this.this$0.statsigMetadata;
                    if (statsigMetadata == null) {
                        statsigMetadata = new com.statsig.androidsdk.StatsigMetadata("", null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                    }
                    java.net.URL url = new java.net.URL(this.this$0.getUrlString());
                    kotlin.Pair[] pairArr = new kotlin.Pair[5];
                    pairArr[0] = kotlin.TuplesKt.to("exception", canonicalName);
                    pairArr[1] = kotlin.TuplesKt.to("info", kotlin.ExceptionsKt.stackTraceToString(new java.lang.RuntimeException(this.$exception)));
                    pairArr[2] = kotlin.TuplesKt.to("statsigMetadata", statsigMetadata);
                    java.lang.String str3 = this.$tag;
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    pairArr[3] = kotlin.TuplesKt.to("tag", str3);
                    pairArr[4] = kotlin.TuplesKt.to("configName", this.$configName);
                    java.lang.String json = new com.google.gson.Gson().toJson(kotlin.collections.MapsKt.mapOf(pairArr));
                    okhttp3.OkHttpClient httpClient$android_sdk_release = com.statsig.androidsdk.HttpUtils.INSTANCE.getHttpClient$android_sdk_release();
                    okhttp3.Request.Builder url2 = new okhttp3.Request.Builder().url(url);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(json);
                    httpClient$android_sdk_release.newCall(com.statsig.androidsdk.HttpUtilsKt.addStatsigHeaders(url2.post(com.statsig.androidsdk.HttpUtilsKt.toJsonRequestBody(json)), str2).build()).enqueue(new okhttp3.Callback() { // from class: com.statsig.androidsdk.ErrorBoundary$logException$1.1
                        @Override // okhttp3.Callback
                        public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                            response.close();
                        }

                        @Override // okhttp3.Callback
                        public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                        }
                    });
                    return kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.ErrorBoundary$logException$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.ErrorBoundary$logException$1(this.this$0, this.$exception, this.$tag, this.$configName, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorBoundary$logException$1(com.statsig.androidsdk.ErrorBoundary errorBoundary, java.lang.Throwable th, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.ErrorBoundary$logException$1> continuation) {
        super(2, continuation);
        this.this$0 = errorBoundary;
        this.$exception = th;
        this.$tag = str;
        this.$configName = str2;
    }
}
