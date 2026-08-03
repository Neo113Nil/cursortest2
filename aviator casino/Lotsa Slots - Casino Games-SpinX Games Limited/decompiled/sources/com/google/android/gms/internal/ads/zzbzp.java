package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbzp extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbzq {
    public static com.google.android.gms.internal.ads.zzbzq zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbzq ? (com.google.android.gms.internal.ads.zzbzq) queryLocalInterface : new com.google.android.gms.internal.ads.zzbzo(iBinder);
    }
}
