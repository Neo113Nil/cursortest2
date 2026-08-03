package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbmw {
    private final com.google.android.gms.internal.ads.zzbmv zza;

    public zzbmw(com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        android.content.Context context;
        this.zza = zzbmvVar;
        try {
            context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzbmvVar.zzm());
        } catch (android.os.RemoteException | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(new com.google.android.gms.ads.formats.MediaView(context)));
            } catch (android.os.RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzbmv zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        try {
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }
}
