package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzaf extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.safetynet.zzh> {
    private final android.content.Context zze;

    public zzaf(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 45, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = context;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof com.google.android.gms.internal.safetynet.zzh ? (com.google.android.gms.internal.safetynet.zzh) queryLocalInterface : new com.google.android.gms.internal.safetynet.zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    protected final java.lang.String zzp(java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        try {
            android.content.pm.PackageManager packageManager = this.zze.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zze.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return "";
            }
            java.lang.String str2 = (java.lang.String) bundle.get(str);
            return str2 == null ? "" : str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(com.google.android.gms.internal.safetynet.zzg zzgVar, java.util.List<java.lang.Integer> list, int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = zzp("com.google.android.safetynet.API_KEY");
        }
        java.lang.String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        ((com.google.android.gms.internal.safetynet.zzh) getService()).zzh(zzgVar, str3, iArr, i, str);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }
}
