package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Aa extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ca f4598a;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef b;
    public final /* synthetic */ java.util.concurrent.CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aa(com.inmobi.media.Ca ca, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.concurrent.CountDownLatch countDownLatch, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4598a = ca;
        this.b = objectRef;
        this.c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Aa(this.f4598a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Aa) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState obj2 = this.f4598a.f4638a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState();
            }
            kotlin.jvm.internal.Ref.ObjectRef objectRef = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
            objectRef.element = com.inmobi.media.AbstractC2773ta.a(obj2, com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState.class);
            this.c.countDown();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.c.countDown();
            throw th;
        }
    }
}
