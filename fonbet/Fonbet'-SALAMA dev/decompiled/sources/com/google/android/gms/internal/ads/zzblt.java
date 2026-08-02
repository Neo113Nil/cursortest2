package com.google.android.gms.internal.ads;

import F2.BinderC0256u;
import F2.C0237k;
import F2.C0247p;
import F2.C0252s;
import F2.F0;
import F2.M;
import F2.M0;
import F2.g1;
import F2.i1;
import F2.k1;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import o3.BinderC1507b;
import y2.m;
import y2.n;
import y2.r;
import y2.v;
import z2.c;
import z2.e;

/* loaded from: classes.dex */
public final class zzblt extends c {
    private final Context zza;
    private final k1 zzb;
    private final M zzc;
    private final String zzd;
    private final zzbok zze;
    private final long zzf;
    private e zzg;
    private m zzh;
    private r zzi;

    public zzblt(Context context, String str) {
        zzbok zzbokVar = new zzbok();
        this.zze = zzbokVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = k1.f2692a;
        C0247p c0247p = C0252s.f2717f.f2719b;
        com.google.android.gms.ads.internal.client.zzr zzrVar = new com.google.android.gms.ads.internal.client.zzr();
        c0247p.getClass();
        this.zzc = (M) new C0237k(c0247p, context, zzrVar, str, zzbokVar).d(context, false);
    }

    public final String getAdUnitId() {
        return this.zzd;
    }

    public final e getAppEventListener() {
        return this.zzg;
    }

    public final m getFullScreenContentCallback() {
        return this.zzh;
    }

    public final r getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // K2.a
    public final v getResponseInfo() {
        F0 f02 = null;
        try {
            M m7 = this.zzc;
            if (m7 != null) {
                f02 = m7.zzk();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        return new v(f02);
    }

    @Override // z2.c
    public final void setAppEventListener(e eVar) {
        try {
            this.zzg = eVar;
            M m7 = this.zzc;
            if (m7 != null) {
                m7.zzG(eVar != null ? new zzayl(eVar) : null);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // K2.a
    public final void setFullScreenContentCallback(m mVar) {
        try {
            this.zzh = mVar;
            M m7 = this.zzc;
            if (m7 != null) {
                m7.zzJ(new BinderC0256u(mVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // K2.a
    public final void setImmersiveMode(boolean z4) {
        try {
            M m7 = this.zzc;
            if (m7 != null) {
                m7.zzL(z4);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // K2.a
    public final void setOnPaidEventListener(r rVar) {
        try {
            this.zzi = rVar;
            M m7 = this.zzc;
            if (m7 != null) {
                m7.zzP(new g1(rVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // K2.a
    public final void show(Activity activity) {
        if (activity == null) {
            j.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            M m7 = this.zzc;
            if (m7 != null) {
                m7.zzW(new BinderC1507b(activity));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(M0 m02, y2.e eVar) {
        try {
            M m7 = this.zzc;
            if (m7 != null) {
                m02.f2612m = this.zzf;
                k1 k1Var = this.zzb;
                Context context = this.zza;
                k1Var.getClass();
                m7.zzy(k1.a(context, m02), new i1(eVar, this));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            eVar.onAdFailedToLoad(new n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public zzblt(Context context, String str, M m7) {
        this.zze = new zzbok();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = k1.f2692a;
        this.zzc = m7;
    }
}
