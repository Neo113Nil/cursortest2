package com.google.android.gms.internal.ads;

import H2.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzcqr implements m {
    private final zzcvx zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcqr(zzcvx zzcvxVar) {
        this.zza = zzcvxVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // H2.m
    public final void zzdE() {
    }

    @Override // H2.m
    public final void zzdi() {
    }

    @Override // H2.m
    public final void zzdo() {
        zzh();
    }

    @Override // H2.m
    public final void zzdp() {
        this.zza.zzc();
    }

    @Override // H2.m
    public final void zzdr() {
    }

    @Override // H2.m
    public final void zzds(int i7) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
