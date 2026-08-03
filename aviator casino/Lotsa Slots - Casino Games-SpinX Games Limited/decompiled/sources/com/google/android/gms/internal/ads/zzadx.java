package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzadx implements android.hardware.display.DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final android.view.Choreographer zza;
    final android.hardware.display.DisplayManager zzb;
    volatile long zzc = -9223372036854775807L;
    volatile long zzd = -9223372036854775807L;

    /* synthetic */ zzadx(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    void zza() {
        this.zzb.registerDisplayListener(this, com.google.android.gms.internal.ads.zzfl.zzd(null));
    }

    void zzb() {
        throw null;
    }
}
