package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzau extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.games_v2.zzau> CREATOR = new com.google.android.gms.internal.games_v2.zzav();

    @java.lang.Deprecated
    private final java.lang.String zza;
    private final java.lang.String zzb;

    zzau(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.games_v2.zzau)) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzau zzauVar = (com.google.android.gms.internal.games_v2.zzau) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzauVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzauVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("serverAuthCode", this.zza).add(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zzb;
    }
}
