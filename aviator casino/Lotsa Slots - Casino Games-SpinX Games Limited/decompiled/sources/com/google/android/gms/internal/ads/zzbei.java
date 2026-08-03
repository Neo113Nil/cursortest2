package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbei extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbej {
    public static com.google.android.gms.internal.ads.zzbej zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbej ? (com.google.android.gms.internal.ads.zzbej) queryLocalInterface : new com.google.android.gms.internal.ads.zzbeh(iBinder);
    }
}
