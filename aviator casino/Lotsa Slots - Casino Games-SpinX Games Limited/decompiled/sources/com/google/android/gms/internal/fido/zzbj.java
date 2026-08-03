package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public final class zzbj extends com.google.android.gms.internal.fido.zzbk {
    private final java.lang.String zza;

    zzbj(java.lang.String str) {
        this.zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzbk zzbkVar = (com.google.android.gms.internal.fido.zzbk) obj;
        zzbkVar.zza();
        java.lang.String str = this.zza;
        int length = str.length();
        java.lang.String str2 = ((com.google.android.gms.internal.fido.zzbj) zzbkVar).zza;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzbj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{3, this.zza});
    }

    public final java.lang.String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.fido.zzbk
    protected final int zza() {
        return 3;
    }
}
