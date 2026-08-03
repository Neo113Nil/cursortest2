package com.unity3d.ads.core.domain;

/* compiled from: AndroidInitializeBoldSDK.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", i = {0, 1, 2}, l = {135, 136, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "initializationSuccess", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class AndroidInitializeBoldSDK$initializationSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInitializeBoldSDK$initializationSuccess$1(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1> continuation) {
        super(continuation);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object initializationSuccess;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializationSuccess = this.this$0.initializationSuccess(null, null, false, this);
        return initializationSuccess;
    }
}
