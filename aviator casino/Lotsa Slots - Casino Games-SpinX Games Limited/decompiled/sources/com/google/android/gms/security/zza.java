package com.google.android.gms.security;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
final class zza extends android.os.AsyncTask {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.security.ProviderInstaller.ProviderInstallListener zzb;

    zza(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(this.zza);
            return 0;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
            return java.lang.Integer.valueOf(e.errorCode);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e2) {
            return java.lang.Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.onProviderInstalled();
            return;
        }
        android.content.Context context = this.zza;
        java.lang.String str = com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME;
        int intValue = num.intValue();
        googleApiAvailabilityLight = com.google.android.gms.security.ProviderInstaller.zza;
        this.zzb.onProviderInstallFailed(num.intValue(), googleApiAvailabilityLight.getErrorResolutionIntent(context, intValue, "pi"));
    }
}
