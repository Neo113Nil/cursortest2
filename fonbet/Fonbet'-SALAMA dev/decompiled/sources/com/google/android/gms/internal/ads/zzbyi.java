package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
final class zzbyi {
    final /* synthetic */ zzbyj zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbyi(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        InterfaceC1436a interfaceC1436a;
        interfaceC1436a = this.zza.zza;
        ((m3.b) interfaceC1436a).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzd() {
        InterfaceC1436a interfaceC1436a;
        interfaceC1436a = this.zza.zza;
        ((m3.b) interfaceC1436a).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }
}
