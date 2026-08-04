package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzcpj implements zzcwe, zzcvk {
    private final Context zza;
    private final zzceb zzb;
    private final zzfaf zzc;
    private final VersionInfoParcel zzd;
    private zzebm zze;
    private boolean zzf;
    private final zzebk zzg;

    public zzcpj(Context context, zzceb zzcebVar, zzfaf zzfafVar, VersionInfoParcel versionInfoParcel, zzebk zzebkVar) {
        this.zza = context;
        this.zzb = zzcebVar;
        this.zzc = zzfafVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzebkVar;
    }

    private final synchronized void zza() {
        zzebj zzebjVar;
        zzebi zzebiVar;
        try {
            if (this.zzc.zzT && this.zzb != null) {
                Context context = this.zza;
                o oVar = o.f1952C;
                if (oVar.f1977x.zzl(context)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = versionInfoParcel.f10835b + "." + versionInfoParcel.f10836c;
                    zzfbd zzfbdVar = this.zzc.zzV;
                    String strZza = zzfbdVar.zza();
                    if (zzfbdVar.zzc() == 1) {
                        zzebiVar = zzebi.VIDEO;
                        zzebjVar = zzebj.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzfaf zzfafVar = this.zzc;
                        zzebi zzebiVar2 = zzebi.HTML_DISPLAY;
                        zzebjVar = zzfafVar.zze == 1 ? zzebj.ONE_PIXEL : zzebj.BEGIN_TO_RENDER;
                        zzebiVar = zzebiVar2;
                    }
                    this.zze = oVar.f1977x.zza(str, this.zzb.zzG(), "", "javascript", strZza, zzebjVar, zzebiVar, this.zzc.zzal);
                    View viewZzF = this.zzb.zzF();
                    zzebm zzebmVar = this.zze;
                    if (zzebmVar != null) {
                        zzfjh zzfjhVarZza = zzebmVar.zza();
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfm)).booleanValue()) {
                            oVar.f1977x.zzj(zzfjhVarZza, this.zzb.zzG());
                            Iterator it = this.zzb.zzV().iterator();
                            while (it.hasNext()) {
                                o.f1952C.f1977x.zzg(zzfjhVarZza, (View) it.next());
                            }
                        } else {
                            oVar.f1977x.zzj(zzfjhVarZza, viewZzF);
                        }
                        this.zzb.zzat(this.zze);
                        o.f1952C.f1977x.zzk(zzfjhVarZza);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new p122r.b());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfn)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final synchronized void zzr() {
        zzceb zzcebVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcebVar = this.zzb) == null) {
            return;
        }
        zzcebVar.zzd("onSdkImpression", new p122r.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
