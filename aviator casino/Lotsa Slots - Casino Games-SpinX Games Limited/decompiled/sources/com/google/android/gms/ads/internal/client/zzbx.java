package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzbx extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzby {
    public static com.google.android.gms.ads.internal.client.zzby zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbw(iBinder);
    }
}
