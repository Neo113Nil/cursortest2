package com.google.android.gms.internal.ads;

import I2.J;
import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzehv {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdog zzb;

    public zzehv(zzdog zzdogVar) {
        this.zzb = zzdogVar;
    }

    public final zzbqn zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqn) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e7) {
            J.l("Couldn't create RTB adapter : ", e7);
        }
    }
}
