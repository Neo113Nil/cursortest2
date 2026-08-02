package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbi {
    private static final a zza = new a("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map hashMap;
        try {
            hashMap = zzbh.zza(str);
        } catch (zzaao unused) {
            zza.b("Error parsing token claims", new Object[0]);
            hashMap = new HashMap();
        }
        return new GetTokenResult(str, hashMap);
    }
}
