package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import p109p.k;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class zzedg implements zzebr {
    private final Context zza;
    private final zzder zzb;
    private final Executor zzc;
    private final zzfae zzd;
    private final zzdqq zze;

    public zzedg(Context context, Executor executor, zzder zzderVar, zzfae zzfaeVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = zzderVar;
        this.zzc = executor;
        this.zzd = zzfaeVar;
        this.zze = zzdqqVar;
    }

    public static I3.b zzc(final zzedg zzedgVar, Uri uri, zzfar zzfarVar, zzfaf zzfafVar, zzfai zzfaiVar, Object obj) {
        try {
            Intent intent = new k().a().f15656a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            final zzbzf zzbzfVar = new zzbzf();
            zzddo zzddoVarZzd = zzedgVar.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, null), new zzddr(new zzdez() { // from class: com.google.android.gms.internal.ads.zzedf
                @Override // com.google.android.gms.internal.ads.zzdez
                public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
                    zzedg.zzd(this.zza, zzbzfVar, z4, context, zzcvdVar);
                }
            }, null));
            zzbzfVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzddoVarZzd.zza(), null, new VersionInfoParcel(0, 0, false, false), null, null, zzfaiVar.zzb));
            zzedgVar.zzd.zza();
            return zzgbc.zzh(zzddoVarZzd.zzg());
        } catch (Throwable th) {
            int i7 = J.f3546b;
            j.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public static void zzd(zzedg zzedgVar, zzbzf zzbzfVar, boolean z4, Context context, zzcvd zzcvdVar) {
        try {
            C1009l0 c1009l0 = o.f1952C.f1956b;
            C1009l0.o(context, (AdOverlayInfoParcel) zzbzfVar.get(), true, zzedgVar.zze);
        } catch (Exception unused) {
        }
    }

    private static String zze(zzfaf zzfafVar) {
        try {
            return zzfafVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmY)).booleanValue()) {
            zzdqp zzdqpVarZza = this.zze.zza();
            zzdqpVarZza.zzb("action", "cstm_tbs_rndr");
            zzdqpVarZza.zzj();
        }
        String strZze = zze(zzfafVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfai zzfaiVar = zzfarVar.zzb.zzb;
        return zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzedg.zzc(this.zza, uri, zzfarVar, zzfafVar, zzfaiVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbcz.zzg(context) && !TextUtils.isEmpty(zze(zzfafVar));
    }
}
