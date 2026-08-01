package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzaeg implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final Choreographer zza;
    final DisplayManager zzb;
    volatile long zzc = -9223372036854775807L;
    volatile long zzd = -9223372036854775807L;

    /* synthetic */ zzaeg(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
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
        this.zzb.registerDisplayListener(this, zzfm.zzd(null));
    }

    void zzb() {
        throw null;
    }
}
