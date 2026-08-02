package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzbd {
    private final boolean zza;
    private final java.util.List zzb;
    private final int zzc;
    private final int zzd;

    public final int zzd() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final java.util.List zzb() {
        return this.zzb;
    }

    public final boolean zza() {
        return this.zza;
    }

    public final java.lang.String toString() {
        boolean z = this.zza;
        int length = java.lang.String.valueOf(z).length();
        java.util.List list = this.zzb;
        int length2 = java.lang.String.valueOf(list).length();
        int i = this.zzc;
        int length3 = java.lang.String.valueOf(i).length();
        int i2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 51 + length2 + 29 + length3 + 29 + java.lang.String.valueOf(i2).length() + 1);
        sb.append("RequestConfiguration(mediaRequested=");
        sb.append(z);
        sb.append(", fieldsToLoad=");
        sb.append(list);
        sb.append(", thumbSizeDimensionInPixels=");
        sb.append(i);
        sb.append(", screenMaxDimensionInPixels=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.zza) * 31) + this.zzb.hashCode()) * 31) + java.lang.Integer.hashCode(this.zzc)) * 31) + java.lang.Integer.hashCode(this.zzd);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbd)) {
            return false;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzbd zzbdVar = (com.google.android.libraries.places.widget.internal.placedetails.zzbd) obj;
        return this.zza == zzbdVar.zza && kotlin.jvm.internal.Intrinsics.areEqual(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd;
    }

    public zzbd(boolean z, java.util.List list, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = z;
        this.zzb = list;
        this.zzc = i;
        this.zzd = i2;
    }
}
