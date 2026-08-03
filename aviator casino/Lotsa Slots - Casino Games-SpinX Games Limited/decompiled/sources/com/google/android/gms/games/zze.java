package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zze extends com.google.android.gms.games.zzf {
    zze() {
    }

    @Override // com.google.android.gms.games.zzf, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzf
    /* renamed from: zza */
    public final com.google.android.gms.games.GameEntity createFromParcel(android.os.Parcel parcel) {
        java.lang.Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = com.google.android.gms.games.GameEntity.getUnparcelClientVersion();
        zzp = com.google.android.gms.games.GameEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = com.google.android.gms.games.GameEntity.canUnparcelSafely(com.google.android.gms.games.GameEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                java.lang.String readString5 = parcel.readString();
                java.lang.String readString6 = parcel.readString();
                java.lang.String readString7 = parcel.readString();
                android.net.Uri parse = readString7 == null ? null : android.net.Uri.parse(readString7);
                java.lang.String readString8 = parcel.readString();
                android.net.Uri parse2 = readString8 == null ? null : android.net.Uri.parse(readString8);
                java.lang.String readString9 = parcel.readString();
                return new com.google.android.gms.games.GameEntity(readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : android.net.Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false, false);
            }
        }
        return super.createFromParcel(parcel);
    }
}
