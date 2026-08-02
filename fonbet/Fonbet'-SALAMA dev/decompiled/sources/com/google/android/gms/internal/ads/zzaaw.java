package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class zzaaw implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaay zza;
    private final DisplayManager zzb;

    public zzaaw(zzaay zzaayVar, DisplayManager displayManager) {
        this.zza = zzaayVar;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            zzaay.zzb(this.zza, zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzen.zzy(null));
        zzaay.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
