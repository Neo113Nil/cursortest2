package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import H2.m;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzdfa implements zzcwe, m, zzcvk {
    zzebm zza;
    private final Context zzb;
    private final zzceb zzc;
    private final zzfaf zzd;
    private final VersionInfoParcel zze;
    private final zzebk zzf;

    public zzdfa(Context context, zzceb zzcebVar, zzfaf zzfafVar, VersionInfoParcel versionInfoParcel, zzebk zzebkVar) {
        this.zzb = context;
        this.zzc = zzcebVar;
        this.zzd = zzfafVar;
        this.zze = versionInfoParcel;
        this.zzf = zzebkVar;
    }

    private final boolean zzg() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfn)).booleanValue() && this.zzf.zzd();
    }

    @Override // H2.m
    public final void zzdE() {
    }

    @Override // H2.m
    public final void zzdi() {
    }

    @Override // H2.m
    public final void zzdo() {
    }

    @Override // H2.m
    public final void zzdp() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfq)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new r.b());
            } else {
                this.zzf.zzb();
            }
        }
    }

    @Override // H2.m
    public final void zzdr() {
    }

    @Override // H2.m
    public final void zzds(int i7) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        if (zzg()) {
            this.zzf.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfq)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new r.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        zzebj zzebjVar;
        zzebi zzebiVar;
        if (!this.zzd.zzT || this.zzc == null) {
            return;
        }
        Context context = this.zzb;
        o oVar = o.f1952C;
        if (oVar.f1977x.zzl(context)) {
            if (zzg()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            String str = versionInfoParcel.f10835b + "." + versionInfoParcel.f10836c;
            zzfbd zzfbdVar = this.zzd.zzV;
            String zza = zzfbdVar.zza();
            if (zzfbdVar.zzc() == 1) {
                zzebiVar = zzebi.VIDEO;
                zzebjVar = zzebj.DEFINED_BY_JAVASCRIPT;
            } else {
                zzebjVar = this.zzd.zzY == 2 ? zzebj.UNSPECIFIED : zzebj.BEGIN_TO_RENDER;
                zzebiVar = zzebi.HTML_DISPLAY;
            }
            this.zza = oVar.f1977x.zza(str, this.zzc.zzG(), "", "javascript", zza, zzebjVar, zzebiVar, this.zzd.zzal);
            View zzF = this.zzc.zzF();
            zzebm zzebmVar = this.zza;
            if (zzebmVar != null) {
                zzfjh zza2 = zzebmVar.zza();
                boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfm)).booleanValue();
                zzebg zzebgVar = oVar.f1977x;
                if (booleanValue) {
                    zzebgVar.zzj(zza2, this.zzc.zzG());
                    Iterator it = this.zzc.zzV().iterator();
                    while (it.hasNext()) {
                        o.f1952C.f1977x.zzg(zza2, (View) it.next());
                    }
                } else {
                    zzebgVar.zzj(zza2, zzF);
                }
                this.zzc.zzat(this.zza);
                o.f1952C.f1977x.zzk(zza2);
                this.zzc.zzd("onSdkLoaded", new r.b());
            }
        }
    }
}
