package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbrb extends com.google.android.gms.ads.internal.zzc {
    zzbrb(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(com.google.android.gms.internal.ads.zzcbn.zza(context), looper, 166, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbri ? (com.google.android.gms.internal.ads.zzbri) queryLocalInterface : new com.google.android.gms.internal.ads.zzbri(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final com.google.android.gms.internal.ads.zzbri zzp() throws android.os.DeadObjectException {
        return (com.google.android.gms.internal.ads.zzbri) super.getService();
    }
}
