package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbxo {
    public static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i7 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i7) + str2 + "=" + str3 + "&" + str.substring(i7));
    }

    public static String zzb(Uri uri, Context context, Map map) {
        o oVar = o.f1952C;
        if (!oVar.f1978y.zzp(context)) {
            return uri.toString();
        }
        String strZzb = oVar.f1978y.zzb(context);
        if (strZzb == null) {
            return uri.toString();
        }
        zzbbp zzbbpVar = zzbby.zzav;
        C0254t c0254t = C0254t.f2723d;
        String str = (String) c0254t.f2726c.zzb(zzbbpVar);
        String string = uri.toString();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzau)).booleanValue() && string.contains(str)) {
            oVar.f1978y.zzj(context, strZzb, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZzb);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzat)).booleanValue()) {
            return string;
        }
        String string2 = zza(zzd(string, context), "fbs_aeid", strZzb).toString();
        oVar.f1978y.zzj(context, strZzb, (Map) map.get("_ac"));
        return string2;
    }

    public static String zzc(String str, Context context, boolean z4, Map map) {
        zzbxm zzbxmVar;
        String strZzb;
        zzbbp zzbbpVar = zzbby.zzaC;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && !z4) {
            return str;
        }
        o oVar = o.f1952C;
        if (!oVar.f1978y.zzp(context) || TextUtils.isEmpty(str) || (strZzb = (zzbxmVar = oVar.f1978y).zzb(context)) == null) {
            return str;
        }
        zzbbp zzbbpVar2 = zzbby.zzav;
        zzbbw zzbbwVar = c0254t.f2726c;
        String str2 = (String) zzbbwVar.zzb(zzbbpVar2);
        boolean zBooleanValue = ((Boolean) zzbbwVar.zzb(zzbby.zzau)).booleanValue();
        P p5 = oVar.f1957c;
        if (zBooleanValue && str.contains(str2)) {
            p5.getClass();
            if (P.v(str, p5.f3580a, (String) c0254t.f2726c.zzb(zzbby.zzar))) {
                zzbxmVar.zzj(context, strZzb, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzb);
            }
            p5.getClass();
            if (!P.v(str, p5.f3581b, (String) c0254t.f2726c.zzb(zzbby.zzas))) {
                return str;
            }
            zzbxmVar.zzk(context, strZzb, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzb);
        }
        if (str.contains("fbs_aeid") || ((Boolean) zzbbwVar.zzb(zzbby.zzat)).booleanValue()) {
            return str;
        }
        p5.getClass();
        if (P.v(str, p5.f3580a, (String) c0254t.f2726c.zzb(zzbby.zzar))) {
            zzbxmVar.zzj(context, strZzb, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", strZzb).toString();
        }
        p5.getClass();
        if (!P.v(str, p5.f3581b, (String) c0254t.f2726c.zzb(zzbby.zzas))) {
            return str;
        }
        zzbxmVar.zzk(context, strZzb, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", strZzb).toString();
    }

    private static String zzd(String str, Context context) {
        o oVar = o.f1952C;
        String strZze = oVar.f1978y.zze(context);
        String strZzc = oVar.f1978y.zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZze)) {
            str = zza(str, "gmp_app_id", strZze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzc)) ? str : zza(str, "fbs_aiid", strZzc).toString();
    }
}
