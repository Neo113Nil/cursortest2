package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhn extends com.google.android.gms.internal.fido.zzhp {
    private final java.lang.String zza;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        int length;
        int length2;
        com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) obj;
        if (zzd(com.visa.cbp.getEncExpo.IResultReceiver2) != zzhpVar.zza()) {
            length = zzhpVar.zza();
            length2 = zzd(com.visa.cbp.getEncExpo.IResultReceiver2);
        } else {
            java.lang.String str = this.zza;
            java.lang.String str2 = ((com.google.android.gms.internal.fido.zzhn) zzhpVar).zza;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzhn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        int zzd = zzd(com.visa.cbp.getEncExpo.IResultReceiver2);
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(zzd), this.zza});
    }

    public final java.lang.String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(com.visa.cbp.getEncExpo.IResultReceiver2);
    }

    zzhn(java.lang.String str) {
        this.zza = str;
    }
}
