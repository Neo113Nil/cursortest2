package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2275ae f5047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(com.inmobi.media.C2275ae c2275ae, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5047a = c2275ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Xd(this.f5047a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Xd(this.f5047a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2275ae c2275ae = this.f5047a;
        if (c2275ae.b.b) {
            com.inmobi.media.C2865wn c2865wn = c2275ae.j;
            c2865wn.c();
            c2865wn.g = -1;
            c2865wn.b();
            android.media.MediaPlayer mediaPlayer = this.f5047a.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (java.lang.IllegalStateException unused) {
            }
            android.media.MediaPlayer mediaPlayer2 = this.f5047a.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
            try {
                mediaPlayer2.start();
            } catch (java.lang.IllegalStateException unused2) {
            }
        } else {
            c2275ae.j.c();
            com.inmobi.media.Fg fg = (com.inmobi.media.Fg) this.f5047a.k.i.d.getValue();
            fg.f.set(true);
            com.inmobi.media.L6.a(fg.e);
            fg.e = null;
            this.f5047a.e = com.inmobi.media.Bg.f;
        }
        return kotlin.Unit.INSTANCE;
    }
}
