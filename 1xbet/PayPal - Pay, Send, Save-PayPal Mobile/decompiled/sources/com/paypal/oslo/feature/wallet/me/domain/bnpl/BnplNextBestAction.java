package com.paypal.oslo.feature.wallet.me.domain.bnpl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "", "ApplyForPayLaterToGoPlan", "ManageReadyToUsePlan", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ApplyForPayLaterToGoPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ManageReadyToUsePlan;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BnplNextBestAction {

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ApplyForPayLaterToGoPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProductId;", "productIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ApplyForPayLaterToGoPlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getProductIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplyForPayLaterToGoPlan implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> productIds;

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyForPayLaterToGoPlan(java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.productIds = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> getProductIds() {
            return this.productIds;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> list = this.productIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplyForPayLaterToGoPlan(productIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.productIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.productIds, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan) other).productIds);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan copy(java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> productIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productIds, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan(productIds);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId> component1() {
            return this.productIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan applyForPayLaterToGoPlan, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = applyForPayLaterToGoPlan.productIds;
            }
            return applyForPayLaterToGoPlan.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ManageReadyToUsePlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "", "validityDuration", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ManageReadyToUsePlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValidityDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageReadyToUsePlan implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction {
        public static final int $stable = 0;
        private final java.lang.String validityDuration;

        public ManageReadyToUsePlan(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.validityDuration = str;
        }

        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.validityDuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ManageReadyToUsePlan(validityDuration=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validityDuration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.validityDuration, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan) other).validityDuration);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan copy(java.lang.String validityDuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validityDuration, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan(validityDuration);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan manageReadyToUsePlan, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = manageReadyToUsePlan.validityDuration;
            }
            return manageReadyToUsePlan.copy(str);
        }
    }
}
