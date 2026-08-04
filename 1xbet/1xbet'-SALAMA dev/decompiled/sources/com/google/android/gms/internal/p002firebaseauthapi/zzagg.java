package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzagg implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public zzagg(int i7) {
        this.zza = zza(i7);
    }

    public static zzagg zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        D.e(str);
        D.e(str2);
        D.i(actionCodeSettings);
        return new zzagg(7, actionCodeSettings, null, str2, str, null, null);
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzagg zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagg zzd(String str) {
        D.e(str);
        this.zzd = str;
        return this;
    }

    public final zzagg zzb(String str) {
        D.e(str);
        this.zzb = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzagg(int i7, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        D.i(actionCodeSettings);
        this.zze = actionCodeSettings;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzagg zza(ActionCodeSettings actionCodeSettings) {
        D.i(actionCodeSettings);
        this.zze = actionCodeSettings;
        return this;
    }

    public final zzagg zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i7) {
        if (i7 == 1) {
            return "PASSWORD_RESET";
        }
        if (i7 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i7 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i7 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        int i7 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i7 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i7 = 7;
                break;
            case "EMAIL_SIGNIN":
                i7 = 6;
                break;
            default:
                i7 = 0;
                break;
        }
        jSONObject.put("requestType", i7);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.f11836e);
            jSONObject.put("canHandleCodeInApp", this.zze.f11838x);
            String str5 = this.zze.f11832a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f11833b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f11834c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f11835d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f11837f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f11830A;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f11831B;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzaid.zza(jSONObject, "captchaResp", str13);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
