package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzq extends com.google.android.gms.games.zzr {
    zzq() {
    }

    @Override // com.google.android.gms.games.zzr, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzr
    /* renamed from: zza */
    public final com.google.android.gms.games.PlayerEntity createFromParcel(android.os.Parcel parcel) {
        java.lang.Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = com.google.android.gms.games.PlayerEntity.getUnparcelClientVersion();
        zzp = com.google.android.gms.games.PlayerEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = com.google.android.gms.games.PlayerEntity.canUnparcelSafely(com.google.android.gms.games.PlayerEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                return new com.google.android.gms.games.PlayerEntity(readString, readString2, readString3 == null ? null : android.net.Uri.parse(readString3), readString4 == null ? null : android.net.Uri.parse(readString4), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1L, null, null, false, null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
