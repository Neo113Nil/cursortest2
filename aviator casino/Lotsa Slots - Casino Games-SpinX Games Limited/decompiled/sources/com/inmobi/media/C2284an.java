package com.inmobi.media;

/* renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2284an implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 f5109a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl c;

    public C2284an(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, java.lang.String str, kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl) {
        this.f5109a = interfaceC2772t9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5109a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "Video Load Error URL: " + this.b);
        }
        com.inmobi.media.T4.a(this.c, java.lang.Boolean.FALSE);
        return true;
    }
}
