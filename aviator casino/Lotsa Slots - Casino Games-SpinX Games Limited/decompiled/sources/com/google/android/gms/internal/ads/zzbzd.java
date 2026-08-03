package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbzd extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbze {
    public static com.google.android.gms.internal.ads.zzbze zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbze ? (com.google.android.gms.internal.ads.zzbze) queryLocalInterface : new com.google.android.gms.internal.ads.zzbzc(iBinder);
    }
}
