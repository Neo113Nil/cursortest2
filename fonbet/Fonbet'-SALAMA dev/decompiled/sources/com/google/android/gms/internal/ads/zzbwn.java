package com.google.android.gms.internal.ads;

import F2.C0219b;
import F2.C0247p;
import F2.C0252s;
import F2.F0;
import F2.M0;
import F2.f1;
import F2.g1;
import F2.k1;
import J2.j;
import S2.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import o3.BinderC1507b;
import y2.m;
import y2.r;
import y2.s;
import y2.v;

/* loaded from: classes.dex */
public final class zzbwn extends T2.a {
    private final String zza;
    private final zzbvt zzb;
    private final Context zzc;
    private final zzbwl zzd;
    private m zze;
    private S2.a zzf;
    private r zzg;
    private final long zzh = System.currentTimeMillis();

    public zzbwn(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        this.zzb = (zzbvt) new C0219b(context, str, zzbokVar).d(context, false);
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
        return this.zze;
    }

    public final S2.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final r getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // T2.a
    public final v getResponseInfo() {
        F0 f02 = null;
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                f02 = zzbvtVar.zzc();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        return new v(f02);
    }

    public final S2.b getRewardItem() {
        try {
            zzbvt zzbvtVar = this.zzb;
            zzbvq zzd = zzbvtVar != null ? zzbvtVar.zzd() : null;
            if (zzd != null) {
                return new zzbwd(zzd);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        return S2.b.j;
    }

    @Override // T2.a
    public final void setFullScreenContentCallback(m mVar) {
        this.zze = mVar;
        this.zzd.zzb(mVar);
    }

    @Override // T2.a
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

    @Override // T2.a
    public final void setOnAdMetadataChangedListener(S2.a aVar) {
        this.zzf = aVar;
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzi(new f1(aVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // T2.a
    public final void setOnPaidEventListener(r rVar) {
        this.zzg = rVar;
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzj(new g1(rVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // T2.a
    public final void setServerSideVerificationOptions(e eVar) {
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzl(new zzbwh(eVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // T2.a
    public final void show(Activity activity, s sVar) {
        this.zzd.zzc(sVar);
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                zzbvtVar.zzk(this.zzd);
                this.zzb.zzm(new BinderC1507b(activity));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zza(M0 m02, T2.b bVar) {
        try {
            zzbvt zzbvtVar = this.zzb;
            if (zzbvtVar != null) {
                m02.f2612m = this.zzh;
                zzbvtVar.zzg(k1.a(this.zzc, m02), new zzbwm(bVar, this));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }
}
