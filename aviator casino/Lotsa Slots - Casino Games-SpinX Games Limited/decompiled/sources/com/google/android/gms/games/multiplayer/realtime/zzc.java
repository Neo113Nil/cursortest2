package com.google.android.gms.games.multiplayer.realtime;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzc extends com.google.android.gms.games.multiplayer.realtime.zzd {
    zzc() {
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd
    /* renamed from: zza */
    public final com.google.android.gms.games.multiplayer.realtime.RoomEntity createFromParcel(android.os.Parcel parcel) {
        java.lang.Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = com.google.android.gms.games.multiplayer.realtime.RoomEntity.getUnparcelClientVersion();
        zzp = com.google.android.gms.games.multiplayer.realtime.RoomEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = com.google.android.gms.games.multiplayer.realtime.RoomEntity.canUnparcelSafely(com.google.android.gms.games.multiplayer.realtime.RoomEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                return new com.google.android.gms.games.multiplayer.realtime.RoomEntity();
            }
        }
        return super.createFromParcel(parcel);
    }
}
