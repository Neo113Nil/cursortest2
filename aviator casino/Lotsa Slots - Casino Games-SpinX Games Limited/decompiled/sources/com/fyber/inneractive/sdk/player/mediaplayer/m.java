package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p f4154a;

    public m(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        this.f4154a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f4154a;
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.media.AudioManager audioManager = (android.media.AudioManager) pVar.f4155a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        com.fyber.inneractive.sdk.util.IAlog.a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", pVar.b(), java.lang.Integer.valueOf(streamMaxVolume), java.lang.Integer.valueOf(streamVolume), java.lang.Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        pVar.setVolume(f, f);
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: unmute took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }
}
