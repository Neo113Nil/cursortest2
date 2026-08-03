package com.unity3d.ads.core.domain.billing;

/* compiled from: ProductDetailsResult.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "", "()V", "Failure", "NotFound", com.inmobi.unification.sdk.InitializationStatus.SUCCESS, "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ProductDetailsResult {
    public /* synthetic */ ProductDetailsResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProductDetailsResult.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "productDetailsJson", "", "(Ljava/lang/String;)V", "getProductDetailsJson", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends com.unity3d.ads.core.domain.billing.ProductDetailsResult {
        private final java.lang.String productDetailsJson;

        public static /* synthetic */ com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success copy$default(com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public final com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success copy(java.lang.String productDetailsJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            return new com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success(productDetailsJson);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.productDetailsJson, ((com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) other).productDetailsJson);
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        public java.lang.String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String productDetailsJson) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public final java.lang.String getProductDetailsJson() {
            return this.productDetailsJson;
        }
    }

    private ProductDetailsResult() {
    }

    /* compiled from: ProductDetailsResult.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;)V", "getBillingResult", "()Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.unity3d.ads.core.domain.billing.ProductDetailsResult {
        private final com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult;

        public static /* synthetic */ com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure copy$default(com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure failure, com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.unity3d.services.store.gpbl.bridges.BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public final com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure copy(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure(billingResult);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingResult, ((com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure) other).billingResult);
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public final com.unity3d.services.store.gpbl.bridges.BillingResultBridge getBillingResult() {
            return this.billingResult;
        }
    }

    /* compiled from: ProductDetailsResult.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends com.unity3d.ads.core.domain.billing.ProductDetailsResult {
        public static final com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound INSTANCE = new com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound();

        private NotFound() {
            super(null);
        }
    }
}
