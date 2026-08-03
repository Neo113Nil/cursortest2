package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class BillingFlowParams {
    public static final java.lang.String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    private boolean zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzai zze;
    private java.util.ArrayList zzf;
    private boolean zzg;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.util.List zzc;
        private java.util.ArrayList zzd;
        private boolean zze;
        private com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }

        public com.android.billingclient.api.BillingFlowParams build() {
            java.util.ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            java.util.List list = this.zzc;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new java.lang.IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new java.lang.IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            com.android.billingclient.api.zzca zzcaVar = null;
            if (!z2) {
                com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zzc.get(0);
                for (int i = 0; i < this.zzc.size(); i++) {
                    com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams2 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zzc.get(i);
                    if (productDetailsParams2 == null) {
                        throw new java.lang.IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                        throw new java.lang.IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                java.lang.String zza = productDetailsParams.zza().zza();
                for (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams3 : this.zzc) {
                    if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams3.zza().zza())) {
                        throw new java.lang.IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.zzd.contains(null)) {
                    throw new java.lang.IllegalArgumentException("SKU cannot be null.");
                }
                if (this.zzd.size() > 1) {
                    com.android.billingclient.api.SkuDetails skuDetails = (com.android.billingclient.api.SkuDetails) this.zzd.get(0);
                    java.lang.String type = skuDetails.getType();
                    java.util.ArrayList arrayList2 = this.zzd;
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) arrayList2.get(i2);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new java.lang.IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    java.lang.String zzd = skuDetails.zzd();
                    java.util.ArrayList arrayList3 = this.zzd;
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        com.android.billingclient.api.SkuDetails skuDetails3 = (com.android.billingclient.api.SkuDetails) arrayList3.get(i3);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzd.equals(skuDetails3.zzd())) {
                            throw new java.lang.IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            com.android.billingclient.api.BillingFlowParams billingFlowParams = new com.android.billingclient.api.BillingFlowParams(zzcaVar);
            if ((!z2 || ((com.android.billingclient.api.SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                z = false;
            }
            billingFlowParams.zza = z;
            billingFlowParams.zzb = this.zza;
            billingFlowParams.zzc = this.zzb;
            billingFlowParams.zzd = this.zzf.build();
            java.util.ArrayList arrayList4 = this.zzd;
            billingFlowParams.zzf = arrayList4 != null ? new java.util.ArrayList(arrayList4) : new java.util.ArrayList();
            billingFlowParams.zzg = this.zze;
            java.util.List list2 = this.zzc;
            billingFlowParams.zze = list2 != null ? com.google.android.gms.internal.play_billing.zzai.zzj(list2) : com.google.android.gms.internal.play_billing.zzai.zzk();
            return billingFlowParams;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setObfuscatedAccountId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setObfuscatedProfileId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setProductDetailsParamsList(java.util.List<com.android.billingclient.api.BillingFlowParams.ProductDetailsParams> list) {
            this.zzc = new java.util.ArrayList(list);
            return this;
        }

        @java.lang.Deprecated
        public com.android.billingclient.api.BillingFlowParams.Builder setSkuDetails(com.android.billingclient.api.SkuDetails skuDetails) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setSubscriptionUpdateParams(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzbv zzbvVar) {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class ProductDetailsParams {
        private final com.android.billingclient.api.ProductDetails zza;
        private final java.lang.String zzb;

        /* compiled from: com.android.billingclient:billing@@7.0.0 */
        public static class Builder {
            private com.android.billingclient.api.ProductDetails zza;
            private java.lang.String zzb;

            private Builder() {
                throw null;
            }

            /* synthetic */ Builder(com.android.billingclient.api.zzbw zzbwVar) {
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzaa.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.zza.getSubscriptionOfferDetails() != null) {
                    com.google.android.gms.internal.play_billing.zzaa.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new com.android.billingclient.api.BillingFlowParams.ProductDetailsParams(this, null);
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder setOfferToken(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("offerToken can not be empty");
                }
                this.zzb = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder setProductDetails(com.android.billingclient.api.ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zza() != null) {
                        this.zzb = oneTimePurchaseOfferDetails.zza();
                    }
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder builder, com.android.billingclient.api.zzbx zzbxVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder newBuilder() {
            return new com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder(null);
        }

        public final com.android.billingclient.api.ProductDetails zza() {
            return this.zza;
        }

        public final java.lang.String zzb() {
            return this.zzb;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class SubscriptionUpdateParams {
        private java.lang.String zza;
        private java.lang.String zzb;
        private int zzc = 0;

        /* compiled from: com.android.billingclient:billing@@7.0.0 */
        public static class Builder {
            private java.lang.String zza;
            private java.lang.String zzb;
            private boolean zzc;
            private int zzd = 0;

            private Builder() {
            }

            /* synthetic */ Builder(com.android.billingclient.api.zzby zzbyVar) {
            }

            static /* synthetic */ com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zza(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder builder) {
                builder.zzc = true;
                return builder;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams build() {
                com.android.billingclient.api.zzbz zzbzVar = null;
                boolean z = (android.text.TextUtils.isEmpty(this.zza) && android.text.TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ android.text.TextUtils.isEmpty(this.zzb);
                if (z && isEmpty) {
                    throw new java.lang.IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z && !isEmpty) {
                    throw new java.lang.IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams = new com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams(zzbzVar);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzc = this.zzd;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setOldPurchaseToken(java.lang.String str) {
                this.zza = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setOriginalExternalTransactionId(java.lang.String str) {
                this.zzb = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setSubscriptionReplacementMode(int i) {
                this.zzd = i;
                return this;
            }

            @java.lang.Deprecated
            public final com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzb(java.lang.String str) {
                this.zza = str;
                return this;
            }
        }

        /* compiled from: com.android.billingclient:billing@@7.0.0 */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(com.android.billingclient.api.zzbz zzbzVar) {
        }

        public static com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder() {
            return new com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder(null);
        }

        static /* bridge */ /* synthetic */ com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzb(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder = newBuilder();
            newBuilder.zzb(subscriptionUpdateParams.zza);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzc);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return newBuilder;
        }

        final int zza() {
            return this.zzc;
        }

        final java.lang.String zzc() {
            return this.zza;
        }

        final java.lang.String zzd() {
            return this.zzb;
        }
    }

    private BillingFlowParams() {
        throw null;
    }

    /* synthetic */ BillingFlowParams(com.android.billingclient.api.zzca zzcaVar) {
    }

    public static com.android.billingclient.api.BillingFlowParams.Builder newBuilder() {
        return new com.android.billingclient.api.BillingFlowParams.Builder(null);
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final java.lang.String zzd() {
        return this.zzd.zzc();
    }

    public final java.lang.String zze() {
        return this.zzd.zzd();
    }

    public final java.util.ArrayList zzf() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final java.util.List zzg() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    final boolean zzp() {
        return (this.zzb == null && this.zzc == null && this.zzd.zzd() == null && this.zzd.zza() == 0 && !this.zza && !this.zzg) ? false : true;
    }
}
