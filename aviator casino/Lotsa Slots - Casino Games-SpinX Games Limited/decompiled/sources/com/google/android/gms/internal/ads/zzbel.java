package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbel extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbem {
    public static com.google.android.gms.internal.ads.zzbem zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbem ? (com.google.android.gms.internal.ads.zzbem) queryLocalInterface : new com.google.android.gms.internal.ads.zzbek(iBinder);
    }
}
