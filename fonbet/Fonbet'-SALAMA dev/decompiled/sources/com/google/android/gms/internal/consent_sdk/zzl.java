package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzl {
    private final zzam zza;
    private final Context zzb;

    public zzl(Application application, zzam zzamVar) {
        this.zza = zzamVar;
        this.zzb = application.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zza(Map map) {
        char c3;
        String str;
        String str2;
        zzam zzamVar = this.zza;
        if (zzamVar.zzd()) {
            zzamVar.zzb(this.zzb);
            Integer num = (Integer) map.get("IABTCF_gdprApplies");
            HashMap hashMap = new HashMap();
            for (String str3 : map.keySet()) {
                if (!str3.equals("IABTCF_gdprApplies")) {
                    switch (str3.hashCode()) {
                        case -1926457382:
                            if (str3.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -142866440:
                            if (str3.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1068702385:
                            if (str3.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1479307131:
                            if (str3.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        str = "google_analytics_default_allow_ad_storage";
                        str2 = "AD_STORAGE";
                    } else if (c3 == 1) {
                        str = "google_analytics_default_allow_ad_user_data";
                        str2 = "AD_USER_DATA";
                    } else if (c3 == 2) {
                        str = "google_analytics_default_allow_ad_personalization_signals";
                        str2 = "AD_PERSONALIZATION";
                    } else if (c3 == 3) {
                        str = "google_analytics_default_allow_analytics_storage";
                        str2 = "ANALYTICS_STORAGE";
                    }
                    int intValue = ((Integer) map.get(str3)).intValue();
                    if (intValue != -1) {
                        if (intValue == 1) {
                            hashMap.put(str2, "GRANTED");
                        } else if (intValue == 2) {
                            hashMap.put(str2, "DENIED");
                        } else if (intValue != 4) {
                            if (intValue != 5) {
                                AbstractC1663a.j(intValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                            } else {
                                Object zza = zzamVar.zza(str);
                                if (zza == null) {
                                    Log.w("UserMessagingPlatform", "No default metadata");
                                } else if (zza instanceof Boolean) {
                                    hashMap.put(str2, true != ((Boolean) zza).booleanValue() ? "DENIED" : "GRANTED");
                                } else if ((zza instanceof String) && zza.equals("eu_consent_policy") && ((str2.equals("AD_PERSONALIZATION") || str2.equals("AD_USER_DATA")) && num != null)) {
                                    hashMap.put(str2, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                } else {
                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
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
