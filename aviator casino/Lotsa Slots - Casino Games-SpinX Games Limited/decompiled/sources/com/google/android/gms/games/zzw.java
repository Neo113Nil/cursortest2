package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.games.zzo implements com.google.android.gms.games.PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzw(com.google.android.gms.common.data.DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.zzu.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.PlayerRelationshipInfo freeze() {
        return new com.google.android.gms.games.zzu(this);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return zzq(this.zza.zzH, -1);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.zzu.zzd(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.zzu.zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.zzv.zza(new com.google.android.gms.games.zzu(this), parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zza() {
        return zzj(this.zza.zzJ, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzb() {
        return zzj(this.zza.zzI, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzc() {
        return zzj(this.zza.zzK, null);
    }
}
