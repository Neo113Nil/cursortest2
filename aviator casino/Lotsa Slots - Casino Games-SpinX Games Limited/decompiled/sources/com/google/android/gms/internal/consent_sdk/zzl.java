package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzl {
    private final com.google.android.gms.internal.consent_sdk.zzam zza;
    private final android.content.Context zzb;

    zzl(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzam zzamVar) {
        this.zza = zzamVar;
        this.zzb = application.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zza(java.util.Map map) {
        char c;
        java.lang.String str;
        java.lang.String str2;
        com.google.android.gms.internal.consent_sdk.zzam zzamVar = this.zza;
        if (zzamVar.zzd()) {
            zzamVar.zzb(this.zzb);
            java.lang.Integer num = (java.lang.Integer) map.get(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str3 : map.keySet()) {
                if (!str3.equals(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES)) {
                    switch (str3.hashCode()) {
                        case -1926457382:
                            if (str3.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -142866440:
                            if (str3.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1068702385:
                            if (str3.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1479307131:
                            if (str3.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str = "google_analytics_default_allow_ad_storage";
                        str2 = "AD_STORAGE";
                    } else if (c == 1) {
                        str = "google_analytics_default_allow_ad_user_data";
                        str2 = "AD_USER_DATA";
                    } else if (c == 2) {
                        str = "google_analytics_default_allow_ad_personalization_signals";
                        str2 = "AD_PERSONALIZATION";
                    } else if (c == 3) {
                        str = "google_analytics_default_allow_analytics_storage";
                        str2 = "ANALYTICS_STORAGE";
                    }
                    int intValue = ((java.lang.Integer) map.get(str3)).intValue();
                    if (intValue != -1) {
                        if (intValue == 1) {
                            hashMap.put(str2, "GRANTED");
                        } else if (intValue == 2) {
                            hashMap.put(str2, "DENIED");
                        } else if (intValue != 4) {
                            if (intValue != 5) {
                                android.util.Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + intValue);
                            } else {
                                java.lang.Object zza = zzamVar.zza(str);
                                if (zza == null) {
                                    android.util.Log.w("UserMessagingPlatform", "No default metadata");
                                } else if (zza instanceof java.lang.Boolean) {
                                    hashMap.put(str2, true != ((java.lang.Boolean) zza).booleanValue() ? "DENIED" : "GRANTED");
                                } else if ((zza instanceof java.lang.String) && zza.equals("eu_consent_policy") && ((str2.equals("AD_PERSONALIZATION") || str2.equals("AD_USER_DATA")) && num != null)) {
                                    hashMap.put(str2, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                } else {
                                    android.util.Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                }
                            }
                        }
                    }
                }
            }
            zzamVar.zzc(hashMap);
        }
    }
}
