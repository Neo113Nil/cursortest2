package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import Y4.D;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzedt implements zzebx {
    private final Context zza;
    private final zzder zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzedt(Context context, VersionInfoParcel versionInfoParcel, zzder zzderVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzderVar;
        this.zzd = executor;
    }

    public static void zzc(zzedt zzedtVar, zzebu zzebuVar, boolean z4, Context context, zzcvd zzcvdVar) {
        try {
            ((zzfby) zzebuVar.zzb).zzv(z4);
            if (zzedtVar.zzc.f10836c < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzaV)).intValue()) {
                ((zzfby) zzebuVar.zzb).zzx();
            } else {
                ((zzfby) zzebuVar.zzb).zzy(context);
            }
        } catch (zzfbh e7) {
            int i7 = J.f3546b;
            j.f("Cannot show interstitial.");
            throw new zzdey(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, final zzebu zzebuVar) {
        zzddo zzd = this.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(new zzdez() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
                zzedt.zzc(zzedt.this, zzebuVar, z4, context, zzcvdVar);
            }
        }, null));
        zzd.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzd);
        ((zzedi) zzebuVar.zzc).zzc(zzd.zzk());
        return zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        zzfba zzfbaVar = zzfarVar.zza.zza;
        String jSONObject = zzfafVar.zzv.toString();
        String I02 = D.I0(zzfafVar.zzs);
        zzfbyVar.zzo(this.zza, zzfbaVar.zzd, jSONObject, I02, (zzbou) zzebuVar.zzc);
    }
}
