package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbxo {
    public static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(str.substring(0, i7) + str2 + "=" + str3 + "&" + str.substring(i7));
    }

    public static String zzb(Uri uri, Context context, Map map) {
        o oVar = o.f1952C;
        if (!oVar.f1978y.zzp(context)) {
            return uri.toString();
        }
        String zzb = oVar.f1978y.zzb(context);
        if (zzb == null) {
            return uri.toString();
        }
        zzbbp zzbbpVar = zzbby.zzav;
        C0254t c0254t = C0254t.f2723d;
        String str = (String) c0254t.f2726c.zzb(zzbbpVar);
        String uri2 = uri.toString();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzau)).booleanValue() && uri2.contains(str)) {
            oVar.f1978y.zzj(context, zzb, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzb);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzat)).booleanValue()) {
            return uri2;
        }
        String uri3 = zza(zzd(uri2, context), "fbs_aeid", zzb).toString();
        oVar.f1978y.zzj(context, zzb, (Map) map.get("_ac"));
        return uri3;
    }

    public static String zzc(String str, Context context, boolean z4, Map map) {
        zzbxm zzbxmVar;
        String zzb;
        zzbbp zzbbpVar = zzbby.zzaC;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && !z4) {
            return str;
        }
        o oVar = o.f1952C;
        if (!oVar.f1978y.zzp(context) || TextUtils.isEmpty(str) || (zzb = (zzbxmVar = oVar.f1978y).zzb(context)) == null) {
            return str;
        }
        zzbbp zzbbpVar2 = zzbby.zzav;
        zzbbw zzbbwVar = c0254t.f2726c;
        String str2 = (String) zzbbwVar.zzb(zzbbpVar2);
        boolean booleanValue = ((Boolean) zzbbwVar.zzb(zzbby.zzau)).booleanValue();
        P p5 = oVar.f1957c;
        if (booleanValue && str.contains(str2)) {
            p5.getClass();
            if (P.v(str, p5.f3580a, (String) c0254t.f2726c.zzb(zzbby.zzar))) {
                zzbxmVar.zzj(context, zzb, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zzb);
            }
            p5.getClass();
            if (!P.v(str, p5.f3581b, (String) c0254t.f2726c.zzb(zzbby.zzas))) {
                return str;
            }
            zzbxmVar.zzk(context, zzb, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzb);
        }
        if (str.contains("fbs_aeid") || ((Boolean) zzbbwVar.zzb(zzbby.zzat)).booleanValue()) {
            return str;
        }
        p5.getClass();
        if (P.v(str, p5.f3580a, (String) c0254t.f2726c.zzb(zzbby.zzar))) {
            zzbxmVar.zzj(context, zzb, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", zzb).toString();
        }
        p5.getClass();
        if (!P.v(str, p5.f3581b, (String) c0254t.f2726c.zzb(zzbby.zzas))) {
            return str;
        }
        zzbxmVar.zzk(context, zzb, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", zzb).toString();
    }

    private static String zzd(String str, Context context) {
        o oVar = o.f1952C;
        String zze = oVar.f1978y.zze(context);
        String zzc = oVar.f1978y.zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzc)) ? str : zza(str, "fbs_aiid", zzc).toString();
    }
}
