package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzblk {
    private final android.content.Context zza;

    public zzblk(android.content.Context context) {
        this.zza = context;
    }

    public final void zza(com.google.android.gms.internal.ads.zzcae zzcaeVar) {
        try {
            ((com.google.android.gms.internal.ads.zzbll) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", com.google.android.gms.internal.ads.zzblj.zza)).zze(zzcaeVar);
        } catch (android.os.RemoteException e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(java.lang.String.valueOf(message)));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            java.lang.String message2 = e2.getMessage();
            java.lang.String.valueOf(message2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(java.lang.String.valueOf(message2)));
        }
    }
}
