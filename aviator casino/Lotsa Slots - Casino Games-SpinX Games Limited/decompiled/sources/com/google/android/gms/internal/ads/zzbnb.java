package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbnb extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbnc {
    public static com.google.android.gms.internal.ads.zzbnc zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbnc ? (com.google.android.gms.internal.ads.zzbnc) queryLocalInterface : new com.google.android.gms.internal.ads.zzbna(iBinder);
    }
}
