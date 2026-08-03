package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzac {
    public static void zza(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            com.google.android.gms.internal.ads.zzgck zzh = com.google.android.gms.internal.ads.zzgck.zzh(context);
            com.google.android.gms.internal.ads.zzgcl zzh2 = com.google.android.gms.internal.ads.zzgcl.zzh(context);
            com.google.android.gms.internal.ads.zzgcm zza = com.google.android.gms.internal.ads.zzgcm.zza(context);
            zzh.zzk();
            zzh.zzl();
            zzh2.zzj();
            zza.zzb(null);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "clearStorageOnIdlessMode");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.os.Bundle zzb(android.content.Context context, java.lang.String str) {
        org.json.JSONArray jSONArray;
        java.lang.Object obj;
        android.content.SharedPreferences sharedPreferences;
        java.lang.String str2;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONArray = new org.json.JSONArray(str);
            } catch (org.json.JSONException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("JSON parsing error", e);
            }
            if (jSONArray != null) {
                return android.os.Bundle.EMPTY;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                java.lang.String optString = optJSONObject.optString("bk");
                java.lang.String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i3 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!android.text.TextUtils.isEmpty(optString) && !android.text.TextUtils.isEmpty(optString2) && i3 != 0) {
                    java.util.List zze = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.io.files.FileSystemKt.UnixPathSeparator)).zze(optString2);
                    if (zze.size() > 2 || zze.isEmpty()) {
                        obj = null;
                    } else {
                        if (zze.size() == 1) {
                            sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (java.lang.String) zze.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((java.lang.String) zze.get(0), 0);
                            str2 = (java.lang.String) zze.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i4 = i3 - 1;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (obj instanceof java.lang.Boolean) {
                                    bundle.putBoolean(optString, ((java.lang.Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof java.lang.Integer) {
                                bundle.putInt(optString, ((java.lang.Integer) obj).intValue());
                            } else if (obj instanceof java.lang.Long) {
                                bundle.putLong(optString, ((java.lang.Long) obj).longValue());
                            } else if (obj instanceof java.lang.Float) {
                                bundle.putFloat(optString, ((java.lang.Float) obj).floatValue());
                            }
                        } else if (obj instanceof java.lang.String) {
                            bundle.putString(optString, (java.lang.String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static android.os.Bundle zzc(android.content.Context context, java.lang.String str, android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (android.text.TextUtils.isEmpty(str)) {
            return android.os.Bundle.EMPTY;
        }
        android.preference.PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }
}
