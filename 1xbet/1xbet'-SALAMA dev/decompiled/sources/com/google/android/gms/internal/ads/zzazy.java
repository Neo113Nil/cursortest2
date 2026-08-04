package com.google.android.gms.internal.ads;

import F2.C0233i;
import F2.C0247p;
import F2.C0252s;
import F2.M;
import F2.M0;
import F2.k1;
import J2.j;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzazy {
    private M zza;
    private final Context zzb;
    private final String zzc;
    private final M0 zzd;
    private final A2.a zze;
    private final zzbok zzf = new zzbok();
    private final k1 zzg = k1.f2692a;

    public zzazy(Context context, String str, M0 m7, A2.a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = m7;
        this.zze = aVar;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzrVarJ = com.google.android.gms.ads.internal.client.zzr.j();
            C0247p c0247p = C0252s.f2717f.f2719b;
            Context context = this.zzb;
            String str = this.zzc;
            zzbok zzbokVar = this.zzf;
            c0247p.getClass();
            M m7 = (M) new C0233i(c0247p, context, zzrVarJ, str, zzbokVar).d(context, false);
            this.zza = m7;
            if (m7 != null) {
                this.zzd.f2612m = jCurrentTimeMillis;
                m7.zzH(new zzazl(this.zze, this.zzc));
                M m8 = this.zza;
                k1 k1Var = this.zzg;
                Context context2 = this.zzb;
                M0 m9 = this.zzd;
                k1Var.getClass();
                m8.zzab(k1.a(context2, m9));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }
}
