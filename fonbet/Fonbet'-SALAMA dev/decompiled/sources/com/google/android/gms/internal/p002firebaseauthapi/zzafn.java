package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.EmailAuthCredential;
import e4.C1027a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafn implements zzadq {
    private static final String zza = "zzafn";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i7 = 2; i7 <= 7 && !Log.isLoggable(zza, i7); i7++) {
        }
    }

    public zzafn(EmailAuthCredential emailAuthCredential, String str, String str2) {
        D.i(emailAuthCredential);
        this.zzd = emailAuthCredential;
        String str3 = emailAuthCredential.f11841a;
        D.e(str3);
        this.zzb = str3;
        String str4 = emailAuthCredential.f11843c;
        D.e(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        C1027a c1027a;
        String str = this.zzc;
        zzap zzapVar = C1027a.f12669d;
        D.e(str);
        try {
            c1027a = new C1027a(str);
        } catch (IllegalArgumentException unused) {
            c1027a = null;
        }
        String str2 = c1027a != null ? c1027a.f12670a : null;
        String str3 = c1027a != null ? c1027a.f12672c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzaid.zza(jSONObject, "captchaResp", str5);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
