package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public abstract class zzas extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.internal.games_v2.zzat {
    public static com.google.android.gms.internal.games_v2.zzat zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.recall.IRecallService");
        return queryLocalInterface instanceof com.google.android.gms.internal.games_v2.zzat ? (com.google.android.gms.internal.games_v2.zzat) queryLocalInterface : new com.google.android.gms.internal.games_v2.zzar(iBinder);
    }
}
