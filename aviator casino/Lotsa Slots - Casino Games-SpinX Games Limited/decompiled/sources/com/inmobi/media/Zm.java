package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Zm implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 f5089a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl c;

    public Zm(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, java.lang.String str, kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl) {
        this.f5089a = interfaceC2772t9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5089a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.b);
        }
        com.inmobi.media.T4.a(this.c, java.lang.Boolean.TRUE);
    }
}
