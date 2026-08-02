package com.google.android.gms.common;

/* loaded from: classes3.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = new com.google.android.gms.common.zzb();
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;
    private final boolean zzd;

    public Feature(java.lang.String str, int i, long j) {
        this(str, i, j, false);
    }

    public Feature(java.lang.String str, long j) {
        this(str, -1, j, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.Feature)) {
            return false;
        }
        com.google.android.gms.common.Feature feature = (com.google.android.gms.common.Feature) obj;
        return matches(feature) && getIsFullyRolledOut() == feature.getIsFullyRolledOut();
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getName(), java.lang.Long.valueOf(getVersion()), java.lang.Boolean.valueOf(getIsFullyRolledOut()));
    }

    public boolean matches(com.google.android.gms.common.Feature feature) {
        return feature != null && com.google.android.gms.common.internal.Objects.equal(getName(), feature.getName()) && getVersion() == feature.getVersion();
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", java.lang.Long.valueOf(getVersion()));
        stringHelper.add("is_fully_rolled_out", java.lang.Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, getIsFullyRolledOut());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Feature(java.lang.String str, long j, boolean z) {
        this(str, -1, j, z);
    }

    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public java.lang.String getName() {
        return this.zza;
    }

    public boolean getIsFullyRolledOut() {
        return this.zzd;
    }

    public Feature(java.lang.String str, int i, long j, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }
}
