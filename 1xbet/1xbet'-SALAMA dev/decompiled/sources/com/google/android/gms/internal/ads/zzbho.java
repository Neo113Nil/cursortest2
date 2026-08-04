package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import Y4.D;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbho implements zzbiz {
    private final zzbhp zza;

    public zzbho(zzbhp zzbhpVar) {
        this.zza = zzbhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i7 = J.f3546b;
            j.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleY0 = null;
        if (map.containsKey("info")) {
            try {
                bundleY0 = D.y0(new JSONObject((String) map.get("info")));
            } catch (JSONException e7) {
                int i8 = J.f3546b;
                j.e("Failed to convert ad metadata to JSON.", e7);
            }
        }
        if (bundleY0 != null) {
            this.zza.zza(str, bundleY0);
        } else {
            int i9 = J.f3546b;
            j.d("Failed to convert ad metadata to Bundle.");
        }
    }
}
