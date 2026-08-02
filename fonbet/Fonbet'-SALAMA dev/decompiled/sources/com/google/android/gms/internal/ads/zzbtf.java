package com.google.android.gms.internal.ads;

import F2.C0225e;
import F2.C0247p;
import F2.C0252s;
import F2.M0;
import F2.k1;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzbtf {
    private static zzbxy zza;
    private final Context zzb;
    private final EnumC1798b zzc;
    private final M0 zzd;
    private final String zze;

    public zzbtf(Context context, EnumC1798b enumC1798b, M0 m02, String str) {
        this.zzb = context;
        this.zzc = enumC1798b;
        this.zzd = m02;
        this.zze = str;
    }

    public static zzbxy zza(Context context) {
        zzbxy zzbxyVar;
        synchronized (zzbtf.class) {
            try {
                if (zza == null) {
                    C0247p c0247p = C0252s.f2717f.f2719b;
                    zzbok zzbokVar = new zzbok();
                    c0247p.getClass();
                    zza = (zzbxy) new C0225e(context, zzbokVar).d(context, false);
                }
                zzbxyVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbxyVar;
    }

    public final void zzb(R2.b bVar) {
        BinderC1507b binderC1507b;
        zzbxy zzbxyVar;
        com.google.android.gms.ads.internal.client.zzm a2;
        long currentTimeMillis = System.currentTimeMillis();
        zzbxy zza2 = zza(this.zzb);
        if (zza2 == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        M0 m02 = this.zzd;
        BinderC1507b binderC1507b2 = new BinderC1507b(context);
        if (m02 == null) {
            binderC1507b = binderC1507b2;
            zzbxyVar = zza2;
            a2 = new com.google.android.gms.ads.internal.client.zzm(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, currentTimeMillis);
        } else {
            binderC1507b = binderC1507b2;
            zzbxyVar = zza2;
            m02.f2612m = currentTimeMillis;
            a2 = k1.a(this.zzb, this.zzd);
        }
        try {
            zzbxy zzbxyVar2 = zzbxyVar;
            zzbxyVar2.zzf(binderC1507b, new zzbyc(this.zze, this.zzc.name(), null, a2, 0, null), new zzbte(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
