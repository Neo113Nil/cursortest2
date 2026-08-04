package com.google.android.gms.internal.ads;

import B4.V;
import F2.C0219b;
import F2.C0247p;
import F2.C0252s;
import F2.F0;
import F2.M0;
import F2.f1;
import F2.g1;
import F2.k1;
import J2.j;
import S2.c;
import S2.d;
import S2.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p167y2.m;
import p167y2.r;
import p167y2.s;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwc extends c {
    private final String zza;
    private final zzbvt zzb;
    private final Context zzc;
    private final zzbwl zzd;
    private S2.a zze;
    private r zzf;
    private m zzg;
    private final long zzh;

    public zzbwc(Context context, String str, zzbvt zzbvtVar) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbvtVar;
        this.zzd = new zzbwl();
    }

    public final Bundle getAdMetadata() {
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                return zzbvtVar.zzb();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final m getFullScreenContentCallback() {
        return this.zzg;
    }

    public final S2.a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final r getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // S2.c
    public final v getResponseInfo() {
        F0 f0Zzc = null;
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                f0Zzc = zzbvtVar.zzc();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        return new v(f0Zzc);
    }

    public final S2.b getRewardItem() {
        V v6 = S2.b.j;
        try {
            zzbvt zzbvtVar = this.zzb;
            zzbvq zzbvqVarZzd = zzbvtVar != null ? zzbvtVar.zzd() : null;
            return zzbvqVarZzd == null ? v6 : new zzbwd(zzbvqVarZzd);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            return v6;
        }
    }

    @Override // S2.c
    public final void setFullScreenContentCallback(m mVar) {
        this.zzg = mVar;
        this.zzd.zzb(mVar);
    }

    @Override // S2.c
    public final void setImmersiveMode(boolean z4) {
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzh(z4);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // S2.c
    public final void setOnAdMetadataChangedListener(S2.a aVar) {
        try {
            this.zze = aVar;
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzi(new f1(aVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // S2.c
    public final void setOnPaidEventListener(r rVar) {
        try {
            this.zzf = rVar;
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzj(new g1(rVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // S2.c
    public final void setServerSideVerificationOptions(e eVar) {
        if (eVar != null) {
            try {
                zzbvt zzbvtVar = this.zzb;
                if (zzbvtVar != null) {
                    zzbvtVar.zzl(new zzbwh(eVar));
                }
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // S2.c
    public final void show(Activity activity, s sVar) {
        this.zzd.zzc(sVar);
        if (activity == null) {
            j.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzk(this.zzd);
                this.zzb.zzm(new p105o3.b(activity));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(M0 m7, d dVar) {
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                m7.f2612m = this.zzh;
                zzbvtVar.zzf(k1.a(this.zzc, m7), new zzbwg(dVar, this));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public zzbwc(Context context, String str) {
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        this(context, str, (zzbvt) new C0219b(context, str, zzbokVar).d(context, false));
    }
}
