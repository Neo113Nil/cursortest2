package com.google.android.gms.internal.ads;

import E2.o;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class zzbip implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzcebVar.getContext()).edit();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                editorEdit.remove(jSONArray.getString(i7));
            }
            editorEdit.apply();
        } catch (JSONException e7) {
            o.f1952C.f1961g.zzw(e7, "GMSG clear local storage keys handler");
        }
    }
}
