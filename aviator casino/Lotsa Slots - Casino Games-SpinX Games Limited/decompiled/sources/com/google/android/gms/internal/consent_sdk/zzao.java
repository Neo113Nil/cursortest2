package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzao implements com.google.android.gms.internal.consent_sdk.zzd {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzaq zzb;
    private final com.google.android.gms.internal.consent_sdk.zzl zzc;
    private final java.util.concurrent.Executor zzd;

    public zzao(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzaq zzaqVar, com.google.android.gms.internal.consent_sdk.zzl zzlVar, java.util.concurrent.Executor executor) {
        this.zza = application;
        this.zzb = zzaqVar;
        this.zzd = executor;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final java.util.concurrent.Executor zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                android.util.Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(java.lang.String.valueOf(jSONObject.toString())));
            } else {
                java.util.HashSet hashSet = new java.util.HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    java.lang.String optString = optJSONArray.optString(i);
                    if (android.text.TextUtils.isEmpty(optString)) {
                        android.util.Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                    } else {
                        hashSet.add(optString);
                    }
                }
                com.google.android.gms.internal.consent_sdk.zzcw.zzb(this.zza, hashSet);
            }
            return true;
        }
        com.google.android.gms.internal.consent_sdk.zzcv zzcvVar = new com.google.android.gms.internal.consent_sdk.zzcv(this.zza);
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object opt = jSONObject.opt(next);
            android.util.Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + java.lang.String.valueOf(opt));
            if (zzcvVar.zze(next, opt)) {
                this.zzb.zzd().add(next);
            } else {
                android.util.Log.d("UserMessagingPlatform", "Failed writing key: ".concat(java.lang.String.valueOf(next)));
            }
        }
        this.zzb.zzf();
        zzcvVar.zzc();
        java.util.Map zzb = zzcvVar.zzb();
        if (zzb.size() > 1) {
            this.zzc.zza(zzb);
            zzcvVar.zzd();
        }
        return true;
    }
}
