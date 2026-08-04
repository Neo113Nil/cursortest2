package com.google.android.gms.internal.ads;

import P2.AbstractC0377c;
import P2.C0388n;
import P2.InterfaceC0376b;

/* JADX INFO: loaded from: classes.dex */
final class zzcim implements InterfaceC0376b {
    private final zzchl zza;
    private zzctz zzb;
    private C0388n zzc;

    public /* synthetic */ zzcim(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // P2.InterfaceC0376b
    public final /* bridge */ /* synthetic */ InterfaceC0376b zza(zzctz zzctzVar) {
        this.zzb = zzctzVar;
        return this;
    }

    @Override // P2.InterfaceC0376b
    public final /* bridge */ /* synthetic */ InterfaceC0376b zzb(C0388n c0388n) {
        this.zzc = c0388n;
        return this;
    }

    @Override // P2.InterfaceC0376b
    public final AbstractC0377c zzc() {
        zzheo.zzc(this.zzb, zzctz.class);
        zzheo.zzc(this.zzc, C0388n.class);
        return new zzcin(this.zza, this.zzc, new zzcrc(), new zzctb(), new zzdrf(), this.zzb, null, null);
    }
}
