package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxi {
    private final java.lang.String zza;

    static {
        new com.google.android.libraries.places.internal.zzxi("");
        new com.google.android.libraries.places.internal.zzxi("<br>");
        new com.google.android.libraries.places.internal.zzxi("<!DOCTYPE html>");
    }

    zzxi(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzxi) {
            return this.zza.equals(((com.google.android.libraries.places.internal.zzxi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 867184553;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 10);
        sb.append("SafeHtml{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
