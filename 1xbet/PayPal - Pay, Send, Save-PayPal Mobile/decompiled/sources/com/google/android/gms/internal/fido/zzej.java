package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzej implements com.google.android.gms.internal.fido.zzek {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fido.zzdn zzb;

    public zzej() {
        com.google.android.gms.internal.fido.zzdo zzdoVar = com.google.android.gms.internal.fido.zzdo.NO_OP;
        this.zza = "";
        this.zzb = zzdoVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final com.google.android.gms.internal.fido.zzdp zza(java.lang.String str) {
        return new com.google.android.gms.internal.fido.zzes(this.zza, str, true, this.zzb, true, true);
    }
}
