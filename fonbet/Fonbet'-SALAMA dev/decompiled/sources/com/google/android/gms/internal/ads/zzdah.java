package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import H2.m;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import z2.e;

/* loaded from: classes.dex */
public final class zzdah {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzext zzo;

    public final zzdah zza(InterfaceC0217a interfaceC0217a, Executor executor) {
        this.zzc.add(new zzdch(interfaceC0217a, executor));
        return this;
    }

    public final zzdah zzb(zzcut zzcutVar, Executor executor) {
        this.zzi.add(new zzdch(zzcutVar, executor));
        return this;
    }

    public final zzdah zzc(zzcvg zzcvgVar, Executor executor) {
        this.zzl.add(new zzdch(zzcvgVar, executor));
        return this;
    }

    public final zzdah zzd(zzcvk zzcvkVar, Executor executor) {
        this.zzf.add(new zzdch(zzcvkVar, executor));
        return this;
    }

    public final zzdah zze(zzcuq zzcuqVar, Executor executor) {
        this.zze.add(new zzdch(zzcuqVar, executor));
        return this;
    }

    public final zzdah zzf(zzcwe zzcweVar, Executor executor) {
        this.zzh.add(new zzdch(zzcweVar, executor));
        return this;
    }

    public final zzdah zzg(zzcwp zzcwpVar, Executor executor) {
        this.zzg.add(new zzdch(zzcwpVar, executor));
        return this;
    }

    public final zzdah zzh(m mVar, Executor executor) {
        this.zzn.add(new zzdch(mVar, executor));
        return this;
    }

    public final zzdah zzi(zzcxb zzcxbVar, Executor executor) {
        this.zzm.add(new zzdch(zzcxbVar, executor));
        return this;
    }

    public final zzdah zzj(zzcxn zzcxnVar, Executor executor) {
        this.zzb.add(new zzdch(zzcxnVar, executor));
        return this;
    }

    public final zzdah zzk(e eVar, Executor executor) {
        this.zzk.add(new zzdch(eVar, executor));
        return this;
    }

    public final zzdah zzl(zzdcp zzdcpVar, Executor executor) {
        this.zzd.add(new zzdch(zzdcpVar, executor));
        return this;
    }

    public final zzdah zzm(zzext zzextVar) {
        this.zzo = zzextVar;
        return this;
    }

    public final zzdaj zzn() {
        return new zzdaj(this, null);
    }
}
