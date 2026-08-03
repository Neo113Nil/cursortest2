package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbzm extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbzn {
    public static com.google.android.gms.internal.ads.zzbzn zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbzn ? (com.google.android.gms.internal.ads.zzbzn) queryLocalInterface : new com.google.android.gms.internal.ads.zzbzl(iBinder);
    }
}
