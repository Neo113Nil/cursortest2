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
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtf {
    private static zzbxy zza;
    private final Context zzb;
    private final EnumC1058b zzc;
    private final M0 zzd;
    private final String zze;

    public zzbtf(Context context, EnumC1058b enumC1058b, M0 m7, String str) {
        this.zzb = context;
        this.zzc = enumC1058b;
        this.zzd = m7;
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
        com.google.android.gms.ads.internal.client.zzm zzmVarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzbxy zzbxyVarZza = zza(this.zzb);
        if (zzbxyVarZza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        M0 m7 = this.zzd;
        p105o3.b bVar2 = new p105o3.b(context);
        if (m7 == null) {
            zzmVarA = new com.google.android.gms.ads.internal.client.zzm(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis);
        } else {
            m7.f2612m = jCurrentTimeMillis;
            zzmVarA = k1.a(this.zzb, this.zzd);
        }
        try {
            zzbxyVarZza.zzf(bVar2, new zzbyc(this.zze, this.zzc.name(), null, zzmVarA, 0, null), new zzbte(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
