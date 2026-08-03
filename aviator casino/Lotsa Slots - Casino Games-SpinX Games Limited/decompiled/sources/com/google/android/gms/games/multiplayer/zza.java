package com.google.android.gms.games.multiplayer;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zza extends com.google.android.gms.games.multiplayer.zzb {
    zza() {
    }

    @Override // com.google.android.gms.games.multiplayer.zzb, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.zzb
    /* renamed from: zza */
    public final com.google.android.gms.games.multiplayer.ParticipantEntity createFromParcel(android.os.Parcel parcel) {
        java.lang.Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = com.google.android.gms.games.multiplayer.ParticipantEntity.getUnparcelClientVersion();
        zzp = com.google.android.gms.games.multiplayer.ParticipantEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = com.google.android.gms.games.multiplayer.ParticipantEntity.canUnparcelSafely(com.google.android.gms.games.multiplayer.ParticipantEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                return new com.google.android.gms.games.multiplayer.ParticipantEntity();
            }
        }
        return super.createFromParcel(parcel);
    }
}
