package com.unity3d.ads.core.domain.om;

/* compiled from: AndroidOmFinishSession.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.om.AndroidOmFinishSession", f = "AndroidOmFinishSession.kt", i = {0, 0}, l = {17}, m = "invoke", n = {"this", "adObject"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class AndroidOmFinishSession$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.om.AndroidOmFinishSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOmFinishSession$invoke$1(com.unity3d.ads.core.domain.om.AndroidOmFinishSession androidOmFinishSession, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidOmFinishSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
