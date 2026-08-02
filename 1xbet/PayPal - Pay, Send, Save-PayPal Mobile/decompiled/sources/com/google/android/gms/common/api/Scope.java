package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new com.google.android.gms.common.api.zzd();
    final int zza;
    private final java.lang.String zzb;

    Scope(int i, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.api.Scope) {
            return this.zzb.equals(((com.google.android.gms.common.api.Scope) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getScopeUri(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Scope(java.lang.String str) {
        this(1, str);
    }

    public final java.lang.String toString() {
        return this.zzb;
    }

    public final java.lang.String getScopeUri() {
        return this.zzb;
    }
}
