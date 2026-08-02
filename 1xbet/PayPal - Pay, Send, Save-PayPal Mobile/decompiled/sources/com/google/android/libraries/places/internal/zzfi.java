package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzfi {
    private final java.lang.String zza;

    public static com.google.android.libraries.places.internal.zzfi zza(java.lang.String str) {
        return new com.google.android.libraries.places.internal.zzfi((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
    }

    public static com.google.android.libraries.places.internal.zzfi zzb(com.google.android.libraries.places.internal.zzfi zzfiVar, com.google.android.libraries.places.internal.zzfi zzfiVar2) {
        return new com.google.android.libraries.places.internal.zzfi(java.lang.String.valueOf(zzfiVar.zza).concat(java.lang.String.valueOf(zzfiVar2.zza)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzfi) {
            return this.zza.equals(((com.google.android.libraries.places.internal.zzfi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    private zzfi(java.lang.String str) {
        this.zza = str;
    }
}
