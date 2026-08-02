package com.paypal.oslo.feature.subscriptions.details.manage.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType;", "", "<init>", "()V", "MerchantClick", "UnlinkSubscription", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType$MerchantClick;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType$UnlinkSubscription;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ManageItemType {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType$MerchantClick;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType;", "", "merchantUrl", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType$MerchantClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantUrl", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantClick extends com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        private final java.lang.String merchantUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantClick(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.merchantUrl = str;
            this.agreementType = agreementType;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantUrl;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantClick(merchantUrl=");
            sb.append(str);
            sb.append(", agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.merchantUrl.hashCode() * 31) + this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick merchantClick = (com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantUrl, merchantClick.merchantUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, merchantClick.agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick copy(java.lang.String merchantUrl, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick(merchantUrl, agreementType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick copy$default(com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick merchantClick, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchantClick.merchantUrl;
            }
            if ((i & 2) != 0) {
                agreementType = merchantClick.agreementType;
            }
            return merchantClick.copy(str, agreementType);
        }
    }

    private ManageItemType() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType$UnlinkSubscription;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkSubscription extends com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.UnlinkSubscription INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.UnlinkSubscription();

        public final int hashCode() {
            return -514994602;
        }

        private UnlinkSubscription() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnlinkSubscription";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.UnlinkSubscription)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ManageItemType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
