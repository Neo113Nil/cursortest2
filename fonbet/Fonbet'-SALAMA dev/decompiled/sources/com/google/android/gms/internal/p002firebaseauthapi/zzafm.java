package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import io.sentry.protocol.ViewHierarchyNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafm implements zzadq {
    private String zza;
    private String zzb;
    private final String zzc;

    public zzafm(String str, String str2) {
        D.e(str);
        this.zza = str;
        this.zzb = "http://localhost";
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ViewHierarchyNode.JsonKeys.IDENTIFIER, this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
