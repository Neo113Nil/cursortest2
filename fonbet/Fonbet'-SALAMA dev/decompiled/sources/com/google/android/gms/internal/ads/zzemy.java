package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
final class zzemy {
    public final I3.b zza;
    private final long zzb;
    private final InterfaceC1436a zzc;

    public zzemy(I3.b bVar, long j, InterfaceC1436a interfaceC1436a) {
        this.zza = bVar;
        this.zzc = interfaceC1436a;
        ((m3.b) interfaceC1436a).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        InterfaceC1436a interfaceC1436a = this.zzc;
        long j = this.zzb;
        ((m3.b) interfaceC1436a).getClass();
        return j < SystemClock.elapsedRealtime();
    }
}
