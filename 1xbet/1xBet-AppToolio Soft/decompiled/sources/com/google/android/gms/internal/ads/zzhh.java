package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes.dex */
final class zzhh implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzhd zzajt;

    zzhh(zzhd zzhdVar) {
        this.zzajt = zzhdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        zzhk zzhkVar;
        Object obj2;
        obj = this.zzajt.mLock;
        synchronized (obj) {
            this.zzajt.zzajs = null;
            zzhkVar = this.zzajt.zzajr;
            if (zzhkVar != null) {
                zzhd.zza(this.zzajt, (zzhk) null);
            }
            obj2 = this.zzajt.mLock;
            obj2.notifyAll();
        }
    }
}
