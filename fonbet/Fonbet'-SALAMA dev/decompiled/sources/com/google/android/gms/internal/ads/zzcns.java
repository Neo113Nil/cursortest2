package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.I0;
import F2.M;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import o3.BinderC1507b;

/* loaded from: classes.dex */
final class zzcns extends zzcnp {
    private final Context zzc;
    private final View zzd;
    private final zzceb zze;
    private final zzfag zzf;
    private final zzcpu zzg;
    private final zzdhn zzh;
    private final zzdcr zzi;
    private final zzhea zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzcns(zzcpv zzcpvVar, Context context, zzfag zzfagVar, View view, zzceb zzcebVar, zzcpu zzcpuVar, zzdhn zzdhnVar, zzdcr zzdcrVar, zzhea zzheaVar, Executor executor) {
        super(zzcpvVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcebVar;
        this.zzf = zzfagVar;
        this.zzg = zzcpuVar;
        this.zzh = zzdhnVar;
        this.zzi = zzdcrVar;
        this.zzj = zzheaVar;
        this.zzk = executor;
    }

    public static void zzj(zzcns zzcnsVar) {
        zzbgu zze = zzcnsVar.zzh.zze();
        if (zze == null) {
            return;
        }
        try {
            zze.zze((M) zzcnsVar.zzj.zzb(), new BinderC1507b(zzcnsVar.zzc));
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.e("RemoteException when notifyAdLoad is called", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final int zzc() {
        zzbbp zzbbpVar = zzbby.zzhQ;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzhR)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final I0 zze() {
        try {
            return this.zzg.zza();
        } catch (zzfbh unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final zzfag zzf() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfbg.zzb(zzrVar);
        }
        zzfaf zzfafVar = this.zzb;
        if (zzfafVar.zzac) {
            for (String str : zzfafVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfag(view.getWidth(), view.getHeight(), false);
        }
        return (zzfag) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final zzfag zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzceb zzcebVar;
        if (viewGroup == null || (zzcebVar = this.zze) == null) {
            return;
        }
        zzcebVar.zzaj(zzcfv.zzc(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.f10773c);
        viewGroup.setMinimumWidth(zzrVar.f10776f);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpw
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
            @Override // java.lang.Runnable
            public final void run() {
                zzcns.zzj(zzcns.this);
            }
        });
        super.zzk();
    }
}
