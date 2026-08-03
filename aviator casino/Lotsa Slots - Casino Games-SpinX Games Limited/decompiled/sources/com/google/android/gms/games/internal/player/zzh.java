package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzh extends com.google.android.gms.games.internal.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.zzh> CREATOR = new com.google.android.gms.games.internal.player.zzi();
    private final java.lang.String zza;

    public zzh(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.player.zzh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.games.internal.player.zzh) obj).zza);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
