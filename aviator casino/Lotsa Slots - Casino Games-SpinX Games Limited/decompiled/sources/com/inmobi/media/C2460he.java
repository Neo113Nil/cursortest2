package com.inmobi.media;

/* renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2460he extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2486ie f5240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2460he(com.inmobi.media.C2486ie c2486ie, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5240a = c2486ie;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2460he(this.f5240a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2460he(this.f5240a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f5240a.f.e()) {
            com.inmobi.media.C2486ie c2486ie = this.f5240a;
            android.media.MediaPlayer mediaPlayer = c2486ie.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (java.lang.IllegalStateException unused) {
            }
            c2486ie.a(c2486ie.k, c2486ie.j);
            com.inmobi.media.T4.a(c2486ie.e, c2486ie.b, new com.inmobi.media.S1(1.0f, false));
            c2486ie.i = false;
        } else {
            this.f5240a.a();
        }
        return kotlin.Unit.INSTANCE;
    }
}
