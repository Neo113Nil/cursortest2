package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhh extends com.google.android.gms.internal.fido.zzhp {
    private final boolean zza;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zzd((byte) -32) != zzhpVar.zza()) {
            return zzd((byte) -32) - zzhpVar.zza();
        }
        return (true != this.zza ? 20 : 21) - (true != ((com.google.android.gms.internal.fido.zzhh) zzhpVar).zza ? 20 : 21);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((com.google.android.gms.internal.fido.zzhh) obj).zza;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zzd((byte) -32)), java.lang.Boolean.valueOf(this.zza)});
    }

    public final java.lang.String toString() {
        return java.lang.Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd((byte) -32);
    }

    zzhh(boolean z) {
        this.zza = z;
    }
}
