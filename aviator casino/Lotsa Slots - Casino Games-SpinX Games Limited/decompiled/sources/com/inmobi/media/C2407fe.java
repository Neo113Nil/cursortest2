package com.inmobi.media;

/* renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2407fe extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2486ie f5199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2407fe(com.inmobi.media.C2486ie c2486ie, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5199a = c2486ie;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2407fe(this.f5199a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2407fe(this.f5199a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f5199a.g.setActivated(false);
        this.f5199a.g.setFocusable(false);
        android.media.MediaPlayer mediaPlayer = this.f5199a.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (java.lang.IllegalStateException unused) {
        }
        this.f5199a.f.a();
        return kotlin.Unit.INSTANCE;
    }
}
