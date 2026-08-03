package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public class ProfileSettingsEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.zzx {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.ProfileSettingsEntity> CREATOR = new com.google.android.gms.games.internal.player.zzg();
    private final com.google.android.gms.common.api.Status zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final com.google.android.gms.games.internal.player.StockProfileImageEntity zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final com.google.android.gms.games.internal.player.zzh zzo;

    public ProfileSettingsEntity(com.google.android.gms.common.api.Status status, java.lang.String str, boolean z, boolean z2, boolean z3, com.google.android.gms.games.internal.player.StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3, boolean z8, com.google.android.gms.games.internal.player.zzh zzhVar) {
        this.zza = status;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = z3;
        this.zzf = stockProfileImageEntity;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = i;
        this.zzj = z6;
        this.zzk = z7;
        this.zzl = i2;
        this.zzm = i3;
        this.zzn = z8;
        this.zzo = zzhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.zzx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.zzx zzxVar = (com.google.android.gms.games.zzx) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzxVar.zzf()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(zzxVar.zzj())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(zzxVar.zzl())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(zzxVar.zzn())) && com.google.android.gms.common.internal.Objects.equal(this.zza, zzxVar.getStatus()) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzxVar.zze()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(zzxVar.zzk())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(zzxVar.zzi())) && this.zzi == zzxVar.zzb() && this.zzj == zzxVar.zzm() && this.zzk == zzxVar.zzg() && this.zzl == zzxVar.zzc() && this.zzm == zzxVar.zza() && this.zzn == zzxVar.zzh() && com.google.android.gms.common.internal.Objects.equal(this.zzo, zzxVar.zzd());
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze), this.zza, this.zzf, java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl), java.lang.Integer.valueOf(this.zzm), java.lang.Boolean.valueOf(this.zzn), this.zzo);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("GamerTag", this.zzb).add("IsGamerTagExplicitlySet", java.lang.Boolean.valueOf(this.zzc)).add("IsProfileVisible", java.lang.Boolean.valueOf(this.zzd)).add("IsVisibilityExplicitlySet", java.lang.Boolean.valueOf(this.zze)).add("Status", this.zza).add("StockProfileImage", this.zzf).add("IsProfileDiscoverable", java.lang.Boolean.valueOf(this.zzg)).add("AutoSignIn", java.lang.Boolean.valueOf(this.zzh)).add("httpErrorCode", java.lang.Integer.valueOf(this.zzi)).add("IsSettingsChangesProhibited", java.lang.Boolean.valueOf(this.zzj)).add("AllowFriendInvites", java.lang.Boolean.valueOf(this.zzk)).add("ProfileVisibility", java.lang.Integer.valueOf(this.zzl)).add("global_friends_list_visibility", java.lang.Integer.valueOf(this.zzm)).add("always_auto_sign_in", java.lang.Boolean.valueOf(this.zzn)).add("profileless_recall_summary", this.zzo).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.games.zzx
    public final int zza() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.zzx
    public final int zzb() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.zzx
    public final int zzc() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.zzx
    public final com.google.android.gms.games.internal.player.zzh zzd() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.zzx
    public final com.google.android.gms.games.internal.player.StockProfileImage zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.zzx
    public final java.lang.String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzg() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzh() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzi() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzk() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzm() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.zzx
    public final boolean zzn() {
        return this.zze;
    }
}
