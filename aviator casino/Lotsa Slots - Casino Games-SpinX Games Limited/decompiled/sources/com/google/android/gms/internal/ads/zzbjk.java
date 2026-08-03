package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbjk extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbjl {
    public static com.google.android.gms.internal.ads.zzbjl zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbjl ? (com.google.android.gms.internal.ads.zzbjl) queryLocalInterface : new com.google.android.gms.internal.ads.zzbjj(iBinder);
    }
}
