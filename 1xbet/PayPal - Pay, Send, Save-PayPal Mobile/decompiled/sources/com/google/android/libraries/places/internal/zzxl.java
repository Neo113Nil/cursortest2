package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxl {
    public static final com.google.android.libraries.places.internal.zzxl zza = new com.google.android.libraries.places.internal.zzxl("about:invalid#zGuavaz");
    private final java.lang.String zzb;

    zzxl(java.lang.String str) {
        this.zzb = str;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzxl) {
            return this.zzb.equals(((com.google.android.libraries.places.internal.zzxl) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 9);
        sb.append("SafeUrl{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final java.lang.String zza() {
        return this.zzb;
    }
}
