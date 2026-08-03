package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class ProductDetails {
    private final java.lang.String zza;
    private final org.json.JSONObject zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.util.List zzl;
    private final java.util.List zzm;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class InstallmentPlanDetails {
        private final int commitmentPaymentsCount;
        private final int subsequentCommitmentPaymentsCount;

        InstallmentPlanDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.commitmentPaymentsCount = jSONObject.getInt("commitmentPaymentsCount");
            this.subsequentCommitmentPaymentsCount = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class OneTimePurchaseOfferDetails {
        private final java.lang.String zza;
        private final long zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final java.lang.String zzf;
        private final com.google.android.gms.internal.play_billing.zzai zzg;
        private final java.lang.Long zzh;
        private final com.android.billingclient.api.zzcq zzi;
        private final com.android.billingclient.api.zzcu zzj;
        private final com.android.billingclient.api.zzcr zzk;
        private final com.android.billingclient.api.zzcs zzl;
        private final com.android.billingclient.api.zzct zzm;

        OneTimePurchaseOfferDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            java.lang.String optString = jSONObject.optString("offerIdToken");
            this.zzd = true == optString.isEmpty() ? null : optString;
            java.lang.String optString2 = jSONObject.optString("offerId");
            this.zze = true == optString2.isEmpty() ? null : optString2;
            java.lang.String optString3 = jSONObject.optString("purchaseOptionId");
            this.zzf = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt("offerType");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zzg = com.google.android.gms.internal.play_billing.zzai.zzj(arrayList);
            this.zzh = jSONObject.has("fullPriceMicros") ? java.lang.Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.zzi = optJSONObject == null ? null : new com.android.billingclient.api.zzcq(optJSONObject);
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.zzj = optJSONObject2 == null ? null : new com.android.billingclient.api.zzcu(optJSONObject2);
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.zzk = optJSONObject3 == null ? null : new com.android.billingclient.api.zzcr(optJSONObject3);
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.zzl = optJSONObject4 == null ? null : new com.android.billingclient.api.zzcs(optJSONObject4);
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.zzm = optJSONObject5 != null ? new com.android.billingclient.api.zzct(optJSONObject5) : null;
        }

        public java.lang.String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public java.lang.String getPriceCurrencyCode() {
            return this.zzc;
        }

        public final java.lang.String zza() {
            return this.zzd;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class PricingPhase {
        private final java.lang.String zza;
        private final long zzb;
        private final java.lang.String zzc;
        private final java.lang.String zzd;
        private final int zze;
        private final int zzf;

        PricingPhase(org.json.JSONObject jSONObject) {
            this.zzd = jSONObject.optString("billingPeriod");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzf = jSONObject.optInt("recurrenceMode");
            this.zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.zze;
        }

        public java.lang.String getBillingPeriod() {
            return this.zzd;
        }

        public java.lang.String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public java.lang.String getPriceCurrencyCode() {
            return this.zzc;
        }

        public int getRecurrenceMode() {
            return this.zzf;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class PricingPhases {
        private final java.util.List zza;

        PricingPhases(org.json.JSONArray jSONArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new com.android.billingclient.api.ProductDetails.PricingPhase(optJSONObject));
                    }
                }
            }
            this.zza = arrayList;
        }

        public java.util.List<com.android.billingclient.api.ProductDetails.PricingPhase> getPricingPhaseList() {
            return this.zza;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class SubscriptionOfferDetails {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String zzc;
        private final com.android.billingclient.api.ProductDetails.PricingPhases zzd;
        private final java.util.List zze;
        private final com.android.billingclient.api.ProductDetails.InstallmentPlanDetails zzf;
        private final com.android.billingclient.api.zzcv zzg;

        SubscriptionOfferDetails(org.json.JSONObject jSONObject) throws org.json.JSONException {
            this.zza = jSONObject.optString("basePlanId");
            java.lang.String optString = jSONObject.optString("offerId");
            this.zzb = true == optString.isEmpty() ? null : optString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new com.android.billingclient.api.ProductDetails.PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.zzf = optJSONObject == null ? null : new com.android.billingclient.api.ProductDetails.InstallmentPlanDetails(optJSONObject);
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.zzg = optJSONObject2 != null ? new com.android.billingclient.api.zzcv(optJSONObject2) : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zze = arrayList;
        }

        public java.lang.String getBasePlanId() {
            return this.zza;
        }

        public com.android.billingclient.api.ProductDetails.InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.zzf;
        }

        public java.lang.String getOfferId() {
            return this.zzb;
        }

        public java.util.List<java.lang.String> getOfferTags() {
            return this.zze;
        }

        public java.lang.String getOfferToken() {
            return this.zzc;
        }

        public com.android.billingclient.api.ProductDetails.PricingPhases getPricingPhases() {
            return this.zzd;
        }
    }

    ProductDetails(java.lang.String str) throws org.json.JSONException {
        this.zza = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.zzb = jSONObject;
        java.lang.String optString = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzc = optString;
        java.lang.String optString2 = jSONObject.optString("type");
        this.zzd = optString2;
        if (android.text.TextUtils.isEmpty(optString)) {
            throw new java.lang.IllegalArgumentException("Product id cannot be empty.");
        }
        if (android.text.TextUtils.isEmpty(optString2)) {
            throw new java.lang.IllegalArgumentException("Product type cannot be empty.");
        }
        this.zze = jSONObject.optString("title");
        this.zzf = jSONObject.optString("name");
        this.zzg = jSONObject.optString("description");
        this.zzi = jSONObject.optString("packageDisplayName");
        this.zzj = jSONObject.optString("iconUrl");
        this.zzh = jSONObject.optString("skuDetailsToken");
        this.zzk = jSONObject.optString("serializedDocid");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));
            }
            this.zzl = arrayList;
        } else {
            this.zzl = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new java.util.ArrayList() : null;
        }
        org.json.JSONObject optJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
        org.json.JSONArray optJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));
            }
            this.zzm = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.zzm = null;
        } else {
            arrayList2.add(new com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails(optJSONObject));
            this.zzm = arrayList2;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.billingclient.api.ProductDetails) {
            return android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.ProductDetails) obj).zza);
        }
        return false;
    }

    public java.lang.String getDescription() {
        return this.zzg;
    }

    public java.lang.String getName() {
        return this.zzf;
    }

    public com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        java.util.List list = this.zzm;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails) this.zzm.get(0);
    }

    public java.lang.String getProductId() {
        return this.zzc;
    }

    public java.lang.String getProductType() {
        return this.zzd;
    }

    public java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.zzl;
    }

    public java.lang.String getTitle() {
        return this.zze;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public java.lang.String toString() {
        java.util.List list = this.zzl;
        return "ProductDetails{jsonString='" + this.zza + "', parsedJson=" + this.zzb.toString() + ", productId='" + this.zzc + "', productType='" + this.zzd + "', title='" + this.zze + "', productDetailsToken='" + this.zzh + "', subscriptionOfferDetails=" + java.lang.String.valueOf(list) + "}";
    }

    public final java.lang.String zza() {
        return this.zzb.optString("packageName");
    }

    final java.lang.String zzb() {
        return this.zzh;
    }

    public java.lang.String zzc() {
        return this.zzk;
    }
}
