package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzww {
    private final com.google.android.libraries.places.internal.zzvp zza;
    private int zzb = 0;
    private int zzc = -1;

    public zzww(com.google.android.libraries.places.internal.zzvp zzvpVar) {
        com.google.android.libraries.places.internal.zzxb.zza(zzvpVar, "context");
        this.zza = zzvpVar;
    }

    protected abstract void zzb(int i, int i2, com.google.android.libraries.places.internal.zzwr zzwrVar);

    protected abstract java.lang.Object zzg();

    public final void zzk(int i, int i2, com.google.android.libraries.places.internal.zzwr zzwrVar) {
        if (zzwrVar.zzc() < 32) {
            this.zzb |= 1 << zzwrVar.zzc();
        }
        this.zzc = java.lang.Math.max(this.zzc, zzwrVar.zzc());
        zzb(i, i2, zzwrVar);
    }

    public final java.lang.Object zzl() {
        com.google.android.libraries.places.internal.zzvp zzvpVar = this.zza;
        zzvpVar.zza().zzc(this);
        int i = this.zzb;
        if (((i + 1) & i) != 0 || (this.zzc > 31 && i != -1)) {
            throw com.google.android.libraries.places.internal.zzwy.zzd(java.lang.String.format("unreferenced arguments [first missing index=%d]", java.lang.Integer.valueOf(java.lang.Integer.numberOfTrailingZeros(~i))), zzvpVar.zzb());
        }
        return zzg();
    }

    public final int zzj() {
        return this.zzc + 1;
    }

    public final java.lang.String zzi() {
        return this.zza.zzb();
    }

    public final com.google.android.libraries.places.internal.zzwx zzh() {
        return this.zza.zza();
    }
}
