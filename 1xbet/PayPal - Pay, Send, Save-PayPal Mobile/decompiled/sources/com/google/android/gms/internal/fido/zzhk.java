package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhk extends com.google.android.gms.internal.fido.zzhp {
    private final long zza;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zza() != zzhpVar.zza()) {
            return zza() - zzhpVar.zza();
        }
        long abs = java.lang.Math.abs(this.zza);
        long abs2 = java.lang.Math.abs(((com.google.android.gms.internal.fido.zzhk) zzhpVar).zza);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((com.google.android.gms.internal.fido.zzhk) obj).zza;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zza()), java.lang.Long.valueOf(this.zza)});
    }

    public final java.lang.String toString() {
        return java.lang.Long.toString(this.zza);
    }

    public final long zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(this.zza >= 0 ? (byte) 0 : (byte) 32);
    }

    zzhk(long j) {
        this.zza = j;
    }
}
