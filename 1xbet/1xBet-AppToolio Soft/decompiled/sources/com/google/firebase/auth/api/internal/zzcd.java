package com.google.firebase.auth.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class zzcd extends GmsClient<zzck> implements zzcc {
    private static Logger zzdx = new Logger("FirebaseAuth", "FirebaseAuth:");
    private final Context zzgs;
    private final zzcp zzhi;

    public zzcd(Context context, Looper looper, ClientSettings clientSettings, zzcp zzcpVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 112, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzgs = (Context) Preconditions.checkNotNull(context);
        this.zzhi = zzcpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzcm(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        if (getServiceRequestExtraArgs == null) {
            getServiceRequestExtraArgs = new Bundle();
        }
        zzcp zzcpVar = this.zzhi;
        if (zzcpVar != null) {
            getServiceRequestExtraArgs.putString("com.google.firebase.auth.API_KEY", zzcpVar.getApiKey());
        }
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServicePackage() {
        char c;
        String property = zzdo.getProperty("firebear.preference");
        if (TextUtils.isEmpty(property)) {
            property = "default";
        }
        int hashCode = property.hashCode();
        char c2 = 65535;
        if (hashCode != 103145323) {
            if (hashCode == 1544803905 && property.equals("default")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (property.equals(ImagesContract.LOCAL)) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
                break;
            default:
                property = "default";
                break;
        }
        if (property.hashCode() == 103145323 && property.equals(ImagesContract.LOCAL)) {
            c2 = 0;
        }
        if (c2 == 0) {
            zzdx.i("Loading fallback module override.", new Object[0]);
            return this.zzgs.getPackageName();
        }
        zzdx.i("Loading module via FirebaseOptions.", new Object[0]);
        if (this.zzhi.zzgn) {
            zzdx.i("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.zzgs.getPackageName();
        }
        zzdx.i("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return DynamiteModule.getLocalVersion(this.zzgs, "com.google.firebase.auth") == 0;
    }

    @Override // com.google.firebase.auth.api.internal.zzcc
    public final /* synthetic */ zzck zzaf() throws DeadObjectException {
        return (zzck) super.getService();
    }
}
