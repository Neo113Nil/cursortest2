package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzcno implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcno(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    public static zzcxi zzc(ScheduledExecutorService scheduledExecutorService, InterfaceC1436a interfaceC1436a) {
        return new zzcxi(scheduledExecutorService, interfaceC1436a);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxi zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (InterfaceC1436a) this.zzb.zzb());
    }
}
