package com.google.android.gms.internal.ads;

import F2.C0252s;
import I2.J;
import J2.j;
import e1.k;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zzblv {
    public static void zza(zzblw zzblwVar, String str, Map map) {
        try {
            zzblwVar.zze(str, C0252s.f2717f.f2718a.k(map));
        } catch (JSONException unused) {
            int i7 = J.f3546b;
            j.g("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzblw zzblwVar, String str, JSONObject jSONObject) {
        StringBuilder l7 = k.l("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String sb = l7.toString();
        int i7 = J.f3546b;
        j.b("Dispatching AFMA event: ".concat(sb));
        zzblwVar.zza(l7.toString());
    }

    public static void zzc(zzblw zzblwVar, String str, String str2) {
        zzblwVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzblw zzblwVar, String str, JSONObject jSONObject) {
        zzblwVar.zzb(str, jSONObject.toString());
    }
}
