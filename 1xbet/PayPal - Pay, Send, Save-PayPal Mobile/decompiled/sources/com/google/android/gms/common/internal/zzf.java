package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(baseGmsClient, i, bundle);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
        try {
            android.os.IBinder iBinder = this.zze;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(iBinder);
            android.os.IBinder iBinder2 = iBinder;
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzf;
            if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
                java.lang.String serviceDescriptor = baseGmsClient.getServiceDescriptor();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(serviceDescriptor).length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                android.util.Log.w("GmsClient", sb.toString());
                return false;
            }
            android.os.IInterface createServiceInterface = baseGmsClient.createServiceInterface(this.zze);
            if (createServiceInterface == null || !(baseGmsClient.zze(2, 4, createServiceInterface) || baseGmsClient.zze(3, 4, createServiceInterface))) {
                return false;
            }
            baseGmsClient.zzn(null);
            com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzk = baseGmsClient.zzk();
            android.os.Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (zzk == null) {
                return true;
            }
            baseGmsClient.zzk().onConnected(connectionHint);
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzf;
        if (baseGmsClient.zzl() != null) {
            baseGmsClient.zzl().onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }
}
