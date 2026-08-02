package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect;", "", "DismissModal", "NavigateToDisablementSuccess", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$DismissModal;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$NavigateToDisablementSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManageAgreementUiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$DismissModal;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissModal implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal();

        public final int hashCode() {
            return 325406669;
        }

        private DismissModal() {
        }

        public final java.lang.String toString() {
            return "DismissModal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$NavigateToDisablementSuccess;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect;", "", "merchantName", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "managementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$NavigateToDisablementSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantName", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "getManagementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDisablementSuccess implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        private final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType managementType;
        private final java.lang.String merchantName;

        public NavigateToDisablementSuccess(java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.merchantName = str;
            this.managementType = merchantManagementType;
            this.agreementType = agreementType;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getManagementType() {
            return this.managementType;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantName;
            com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType = this.managementType;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDisablementSuccess(merchantName=");
            sb.append(str);
            sb.append(", managementType=");
            sb.append(merchantManagementType);
            sb.append(", agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.merchantName.hashCode() * 31) + this.managementType.hashCode()) * 31) + this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess navigateToDisablementSuccess = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, navigateToDisablementSuccess.merchantName) && this.managementType == navigateToDisablementSuccess.managementType && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, navigateToDisablementSuccess.agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess copy(java.lang.String merchantName, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType managementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess(merchantName, managementType, agreementType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getManagementType() {
            return this.managementType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess copy$default(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess navigateToDisablementSuccess, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDisablementSuccess.merchantName;
            }
            if ((i & 2) != 0) {
                merchantManagementType = navigateToDisablementSuccess.managementType;
            }
            if ((i & 4) != 0) {
                agreementType = navigateToDisablementSuccess.agreementType;
            }
            return navigateToDisablementSuccess.copy(str, merchantManagementType, agreementType);
        }
    }
}
