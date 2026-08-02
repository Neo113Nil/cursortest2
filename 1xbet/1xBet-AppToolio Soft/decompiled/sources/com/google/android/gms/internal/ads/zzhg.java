package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes.dex */
final class zzhg implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzhd zzajt;

    zzhg(zzhd zzhdVar) {
        this.zzajt = zzhdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        Object obj2;
        zzhk zzhkVar;
        zzhk zzhkVar2;
        obj = this.zzajt.mLock;
        synchronized (obj) {
            try {
                zzhkVar = this.zzajt.zzajr;
                if (zzhkVar != null) {
                    zzhd zzhdVar = this.zzajt;
                    zzhkVar2 = this.zzajt.zzajr;
                    zzhdVar.zzajs = zzhkVar2.zzhl();
                }
            } catch (DeadObjectException e) {
                zzakb.zzb("Unable to obtain a cache service instance.", e);
                this.zzajt.disconnect();
            }
            obj2 = this.zzajt.mLock;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzajt.mLock;
        synchronized (obj) {
            this.zzajt.zzajs = null;
            obj2 = this.zzajt.mLock;
            obj2.notifyAll();
        }
    }
}
