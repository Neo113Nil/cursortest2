package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzebk {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfaf zzc;
    private final zzceb zzd;
    private final zzdqq zze;
    private zzfjs zzf;

    public zzebk(Context context, VersionInfoParcel versionInfoParcel, zzfaf zzfafVar, zzceb zzcebVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfafVar;
        this.zzd = zzcebVar;
        this.zze = zzdqqVar;
    }

    public final synchronized void zza(View view) {
        zzfjs zzfjsVar = this.zzf;
        if (zzfjsVar != null) {
            o.f1952C.f1977x.zzh(zzfjsVar, view);
        }
    }

    public final synchronized void zzb() {
        zzceb zzcebVar;
        if (this.zzf == null || (zzcebVar = this.zzd) == null) {
            return;
        }
        zzcebVar.zzd("onSdkImpression", zzfwk.zzd());
    }

    public final synchronized void zzc() {
        zzceb zzcebVar;
        try {
            zzfjs zzfjsVar = this.zzf;
            if (zzfjsVar == null || (zzcebVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcebVar.zzV().iterator();
            while (it.hasNext()) {
                o.f1952C.f1977x.zzh(zzfjsVar, (View) it.next());
            }
            this.zzd.zzd("onSdkLoaded", zzfwk.zzd());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z4) {
        if (this.zzc.zzT) {
            zzbbp zzbbpVar = zzbby.zzfk;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfn)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        int i7 = J.f3546b;
                        j.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.zza;
                    o oVar = o.f1952C;
                    if (!oVar.f1977x.zzl(context)) {
                        int i8 = J.f3546b;
                        j.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        zzfjs zzfjsVarZze = oVar.f1977x.zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfo)).booleanValue()) {
                            zzdqq zzdqqVar = this.zze;
                            String str = zzfjsVarZze != null ? "1" : "0";
                            zzdqp zzdqpVarZza = zzdqqVar.zza();
                            zzdqpVarZza.zzb("omid_js_session_success", str);
                            zzdqpVarZza.zzj();
                        }
                        if (zzfjsVarZze == null) {
                            int i9 = J.f3546b;
                            j.g("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = J.f3546b;
                        j.f("Created omid javascript session service.");
                        this.zzf = zzfjsVarZze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzces zzcesVar) {
        zzfjs zzfjsVar = this.zzf;
        if (zzfjsVar == null || this.zzd == null) {
            return;
        }
        o.f1952C.f1977x.zzm(zzfjsVar, zzcesVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
