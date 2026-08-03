package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbqv extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbqw {
    public static com.google.android.gms.internal.ads.zzbqw zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbqw ? (com.google.android.gms.internal.ads.zzbqw) queryLocalInterface : new com.google.android.gms.internal.ads.zzbqu(iBinder);
    }
}
