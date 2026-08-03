package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcbu extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcbv {
    public static com.google.android.gms.internal.ads.zzcbv zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcbv ? (com.google.android.gms.internal.ads.zzcbv) queryLocalInterface : new com.google.android.gms.internal.ads.zzcbt(iBinder);
    }
}
