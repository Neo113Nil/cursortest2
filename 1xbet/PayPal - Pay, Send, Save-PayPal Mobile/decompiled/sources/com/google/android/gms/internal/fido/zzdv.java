package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzdv {
    private static final com.google.android.gms.internal.fido.zzdz zza = new com.google.android.gms.internal.fido.zzds();
    private static final com.google.android.gms.internal.fido.zzdy zzb = new com.google.android.gms.internal.fido.zzdt();
    private final com.google.android.gms.internal.fido.zzdz zze;
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.gms.internal.fido.zzdy zzf = null;

    public final com.google.android.gms.internal.fido.zzea zzd() {
        return new com.google.android.gms.internal.fido.zzdx(this, null);
    }

    final void zzg(com.google.android.gms.internal.fido.zzdk zzdkVar) {
        com.google.android.gms.internal.fido.zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            com.google.android.gms.internal.fido.zzdz zzdzVar = zza;
            com.google.android.gms.internal.fido.zzfk.zza(zzdkVar, "key");
            this.zzd.remove(zzdkVar);
            this.zzc.put(zzdkVar, zzdzVar);
            return;
        }
        com.google.android.gms.internal.fido.zzdy zzdyVar = zzb;
        com.google.android.gms.internal.fido.zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            throw new java.lang.IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzdkVar);
        this.zzd.put(zzdkVar, zzdyVar);
    }

    public final com.google.android.gms.internal.fido.zzdv zza(com.google.android.gms.internal.fido.zzdy zzdyVar) {
        this.zzf = zzdyVar;
        return this;
    }
}
