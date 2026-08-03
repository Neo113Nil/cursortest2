package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbyw extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbyx {
    public static com.google.android.gms.internal.ads.zzbyx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyx ? (com.google.android.gms.internal.ads.zzbyx) queryLocalInterface : new com.google.android.gms.internal.ads.zzbyv(iBinder);
    }
}
