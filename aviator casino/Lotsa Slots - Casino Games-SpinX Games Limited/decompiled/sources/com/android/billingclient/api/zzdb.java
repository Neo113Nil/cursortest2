package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzdb {
    static com.android.billingclient.api.zzda zza(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzce.zzj;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("%s got null owned items list", str2));
            return new com.android.billingclient.api.zzda(billingResult, 54);
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        java.lang.String zzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult.Builder newBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        newBuilder.setResponseCode(zzb);
        newBuilder.setDebugMessage(zzg);
        com.android.billingclient.api.BillingResult build = newBuilder.build();
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("%s failed. Response code: %s", str2, java.lang.Integer.valueOf(zzb)));
            return new com.android.billingclient.api.zzda(build, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new com.android.billingclient.api.zzda(billingResult, 55);
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new com.android.billingclient.api.zzda(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("Bundle returned from %s contains null purchases list.", str2));
            return new com.android.billingclient.api.zzda(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new com.android.billingclient.api.zzda(com.android.billingclient.api.zzce.zzl, 1);
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", java.lang.String.format("Bundle returned from %s contains null signatures list.", str2));
        return new com.android.billingclient.api.zzda(billingResult, 58);
    }
}
