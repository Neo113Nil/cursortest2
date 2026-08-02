package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzh extends com.google.android.libraries.places.widget.internal.placedetails.zzi {
    private final java.lang.String zza;

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 20);
        sb.append("SectionTitle(title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.libraries.places.widget.internal.placedetails.zzh) && kotlin.jvm.internal.Intrinsics.areEqual(this.zza, ((com.google.android.libraries.places.widget.internal.placedetails.zzh) obj).zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
    }
}
