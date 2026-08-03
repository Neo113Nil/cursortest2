package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzarz extends com.google.android.gms.internal.ads.zzarx {
    private int zza = 0;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzbej zzd;
    private android.content.ServiceConnection zze;

    public zzarz(android.content.Context context) {
        this.zzb = context.getApplicationContext();
        this.zzc = (!androidx.core.os.BuildCompat.isAtLeastU() || android.os.ext.SdkExtensions.getExtensionVersion(34) < 8) ? context.getPackageName() : android.os.Process.isSdkSandbox() ? ((android.app.sdksandbox.sdkprovider.SdkSandboxController) context.getSystemService(android.app.sdksandbox.sdkprovider.SdkSandboxController.class)).getClientPackageName() : context.getPackageName();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzb(com.google.android.gms.internal.ads.zzasa zzasaVar) {
        if (zza()) {
            com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzasaVar.zza(0);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzasaVar.zza(3);
            return;
        }
        if (i == 3) {
            com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzasaVar.zza(3);
            return;
        }
        com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Starting install referrer service setup.");
        android.content.Intent intent = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        android.content.Context context = this.zzb;
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                java.lang.String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            android.content.Intent intent2 = new android.content.Intent(intent);
                            com.google.android.gms.internal.ads.zzary zzaryVar = new com.google.android.gms.internal.ads.zzary(this, zzasaVar, null);
                            this.zze = zzaryVar;
                            try {
                                if (this.zzb.bindService(intent2, zzaryVar, 1)) {
                                    com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Service was bonded successfully.");
                                    return;
                                }
                                com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "Connection to service is blocked.");
                                this.zza = 0;
                                zzasaVar.zza(1);
                                return;
                            } catch (java.lang.SecurityException unused) {
                                com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "No permission to connect to service.");
                                this.zza = 0;
                                zzasaVar.zza(4);
                                return;
                            }
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    }
                }
                com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.zza = 0;
                zzasaVar.zza(2);
                return;
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
        zzasaVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            com.google.android.gms.internal.ads.zzasc.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final com.google.android.gms.internal.ads.zzasb zzd() throws android.os.RemoteException {
        if (!zza()) {
            throw new java.lang.IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new com.google.android.gms.internal.ads.zzasb(this.zzd.zze(bundle));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.internal.ads.zzasc.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e;
        }
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzbej zzbejVar) {
        this.zzd = zzbejVar;
    }
}
