package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

@zzadh
/* loaded from: classes.dex */
public final class zzsm implements zzm {
    private final Context mContext;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    @Nullable
    private zzsf zzbnl;

    @GuardedBy("mLock")
    private boolean zzbnm;

    public zzsm(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.mLock) {
            if (this.zzbnl == null) {
                return;
            }
            this.zzbnl.disconnect();
            this.zzbnl = null;
            Binder.flushPendingCommands();
        }
    }

    static /* synthetic */ boolean zza(zzsm zzsmVar, boolean z) {
        zzsmVar.zzbnm = true;
        return true;
    }

    private final Future<ParcelFileDescriptor> zzb(zzsg zzsgVar) {
        zzsn zzsnVar = new zzsn(this);
        zzso zzsoVar = new zzso(this, zzsnVar, zzsgVar);
        zzsr zzsrVar = new zzsr(this, zzsnVar);
        synchronized (this.mLock) {
            this.zzbnl = new zzsf(this.mContext, com.google.android.gms.ads.internal.zzbv.zzez().zzsa(), zzsoVar, zzsrVar);
            this.zzbnl.checkAvailabilityAndConnect();
        }
        return zzsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final zzp zzc(zzr<?> zzrVar) throws zzae {
        zzp zzpVar;
        zzsg zzh = zzsg.zzh(zzrVar);
        long intValue = ((Integer) zzkb.zzik().zzd(zznk.zzbdx)).intValue();
        long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
        try {
            try {
                zzsi zzsiVar = (zzsi) new zzaev(zzb(zzh).get(intValue, TimeUnit.MILLISECONDS)).zza(zzsi.CREATOR);
                if (zzsiVar.zzbnj) {
                    throw new zzae(zzsiVar.zzbnk);
                }
                if (zzsiVar.zzbnh.length != zzsiVar.zzbni.length) {
                    zzpVar = null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < zzsiVar.zzbnh.length; i++) {
                        hashMap.put(zzsiVar.zzbnh[i], zzsiVar.zzbni[i]);
                    }
                    zzpVar = new zzp(zzsiVar.statusCode, zzsiVar.data, hashMap, zzsiVar.zzac, zzsiVar.zzad);
                }
                return zzpVar;
            } finally {
                long j = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime() - elapsedRealtime;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Http assets remote cache took ");
                sb.append(j);
                sb.append("ms");
                zzakb.v(sb.toString());
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }
}
