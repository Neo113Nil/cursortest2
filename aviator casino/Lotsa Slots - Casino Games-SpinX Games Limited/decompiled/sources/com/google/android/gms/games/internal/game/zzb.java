package com.google.android.gms.games.internal.game;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzb extends com.google.android.gms.games.internal.game.zzc {
    zzb() {
    }

    @Override // com.google.android.gms.games.internal.game.zzc, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.internal.game.zzc
    /* renamed from: zza */
    public final com.google.android.gms.games.internal.game.GameBadgeEntity createFromParcel(android.os.Parcel parcel) {
        java.lang.Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = com.google.android.gms.games.internal.game.GameBadgeEntity.getUnparcelClientVersion();
        zzp = com.google.android.gms.games.internal.game.GameBadgeEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = com.google.android.gms.games.internal.game.GameBadgeEntity.canUnparcelSafely(com.google.android.gms.games.internal.game.GameBadgeEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                int readInt = parcel.readInt();
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                return new com.google.android.gms.games.internal.game.GameBadgeEntity(readInt, readString, readString2, readString3 == null ? null : android.net.Uri.parse(readString3));
            }
        }
        return super.createFromParcel(parcel);
    }
}
