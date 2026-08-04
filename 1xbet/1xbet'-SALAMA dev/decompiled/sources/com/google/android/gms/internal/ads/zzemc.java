package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import I2.P;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzemc implements zzesg {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final L zze;
    private final String zzf;
    private final zzcrz zzg;

    public zzemc(Context context, Bundle bundle, String str, String str2, L l7, String str3, zzcrz zzcrzVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = l7;
        this.zzf = str3;
        this.zzg = zzcrzVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfF)).booleanValue()) {
            try {
                P p5 = o.f1952C.f1957c;
                bundle.putString("_app_id", P.F(this.zza));
            } catch (RemoteException | RuntimeException e7) {
                o.f1952C.f1961g.zzw(e7, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        zzctsVar.zzb.putBundle("quality_signals", this.zzb);
        zzc(zzctsVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!((M) this.zze).k()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !((M) this.zze).k());
        zzc(bundle);
        if (this.zzf != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.zzg.zzb(this.zzf));
            bundle2.putInt("pcc", this.zzg.zza(this.zzf));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjK)).booleanValue()) {
            o oVar = o.f1952C;
            if (oVar.f1961g.zza() > 0) {
                bundle.putInt("nrwv", oVar.f1961g.zza());
            }
        }
    }
}
