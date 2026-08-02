package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzao implements zzd {
    private final Application zza;
    private final zzaq zzb;
    private final zzl zzc;
    private final Executor zzd;

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.zza = application;
        this.zzb = zzaqVar;
        this.zzd = executor;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c3;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c3 = 0;
            }
            c3 = 65535;
        } else {
            if (str.equals("clear")) {
                c3 = 1;
            }
            c3 = 65535;
        }
        if (c3 != 0) {
            if (c3 != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    String optString = optJSONArray.optString(i7);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i7);
                    } else {
                        hashSet.add(optString);
                    }
                }
                zzcp.zzb(this.zza, hashSet);
            }
            return true;
        }
        zzco zzcoVar = new zzco(this.zza);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            if (zzcoVar.zze(next, opt)) {
                this.zzb.zzd().add(next);
            } else {
                Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
            }
        }
        this.zzb.zzf();
        zzcoVar.zzc();
        Map zzb = zzcoVar.zzb();
        if (zzb.size() > 1) {
            this.zzc.zza(zzb);
            zzcoVar.zzd();
        }
        return true;
    }
}
