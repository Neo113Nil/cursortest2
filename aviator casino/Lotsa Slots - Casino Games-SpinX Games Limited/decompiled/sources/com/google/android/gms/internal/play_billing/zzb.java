package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzb {
    public static final int zza = java.lang.Runtime.getRuntime().availableProcessors();

    public static int zza(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            return zzm(intent.getExtras(), "ProxyBillingActivity");
        }
        zzk("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 6;
        }
        java.lang.Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzj(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        zzk(str, "Unexpected type for bundle response code: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
        return 6;
    }

    public static android.os.Bundle zzc(boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static android.os.Bundle zzd(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static com.android.billingclient.api.BillingResult zze(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            com.android.billingclient.api.BillingResult.Builder newBuilder = com.android.billingclient.api.BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb(intent.getExtras(), str));
            newBuilder.setDebugMessage(zzg(intent.getExtras(), str));
            return newBuilder.build();
        }
        zzk("BillingHelper", "Got null intent!");
        com.android.billingclient.api.BillingResult.Builder newBuilder2 = com.android.billingclient.api.BillingResult.newBuilder();
        newBuilder2.setResponseCode(6);
        newBuilder2.setDebugMessage("An internal error occurred.");
        return newBuilder2.build();
    }

    public static com.android.billingclient.api.InAppMessageResult zzf(android.os.Bundle bundle, java.lang.String str) {
        return bundle == null ? new com.android.billingclient.api.InAppMessageResult(0, null) : new com.android.billingclient.api.InAppMessageResult(zzm(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static java.lang.String zzg(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return "";
        }
        java.lang.Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzj(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        zzk(str, "Unexpected type for debug message: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
        return "";
    }

    public static java.lang.String zzh(int i) {
        return com.google.android.gms.internal.play_billing.zza.zza(i).toString();
    }

    public static java.util.List zzi(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            com.android.billingclient.api.Purchase zzn = zzn(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzn == null) {
                zzj("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzn);
        } else {
            zzj("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                com.android.billingclient.api.Purchase zzn2 = zzn(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzn2 != null) {
                    arrayList.add(zzn2);
                }
            }
        }
        return arrayList;
    }

    public static void zzj(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                android.util.Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = java.lang.Math.min(str2.length(), java.lang.Math.min(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, i));
                android.util.Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void zzk(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void zzl(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2, th);
        }
    }

    private static int zzm(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzk(str, "Unexpected null bundle received!");
        return 0;
    }

    private static com.android.billingclient.api.Purchase zzn(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            zzj("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new com.android.billingclient.api.Purchase(str, str2);
        } catch (org.json.JSONException e) {
            zzk("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
