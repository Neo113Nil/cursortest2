package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState;", "", "Manage", "Disable", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Disable;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManageAgreementUiState {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "merchantType", "", "merchantName", "agreementType", "merchantContact", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "getMerchantType", "Ljava/lang/String;", "getMerchantName", "getAgreementType", "getMerchantContact", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Manage implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.Companion(null);
        private final java.lang.String agreementType;
        private final java.lang.String merchantContact;
        private final java.lang.String merchantName;
        private final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantType;

        public Manage(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.merchantType = merchantManagementType;
            this.merchantName = str;
            this.agreementType = str2;
            this.merchantContact = str3;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getMerchantType() {
            return this.merchantType;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String getMerchantContact() {
            return this.merchantContact;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;", "destination", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;", "fromManageAgreementBottomSheetDestination", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage fromManageAgreementBottomSheetDestination(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.merchantManagementTypeFromString(destination.getManagementType()), destination.getMerchantName(), destination.getAgreementType(), destination.getMerchantWebsiteUrl());
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType = this.merchantType;
            java.lang.String str = this.merchantName;
            java.lang.String str2 = this.agreementType;
            java.lang.String str3 = this.merchantContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Manage(merchantType=");
            sb.append(merchantManagementType);
            sb.append(", merchantName=");
            sb.append(str);
            sb.append(", agreementType=");
            sb.append(str2);
            sb.append(", merchantContact=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.merchantType.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = this.agreementType.hashCode();
            java.lang.String str = this.merchantContact;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage) other;
            return this.merchantType == manage.merchantType && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, manage.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, manage.agreementType) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantContact, manage.merchantContact);
        }

        public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage copy(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantType, java.lang.String merchantName, java.lang.String agreementType, java.lang.String merchantContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage(merchantType, merchantName, agreementType, merchantContact);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMerchantContact() {
            return this.merchantContact;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getMerchantType() {
            return this.merchantType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage copy$default(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantManagementType = manage.merchantType;
            }
            if ((i & 2) != 0) {
                str = manage.merchantName;
            }
            if ((i & 4) != 0) {
                str2 = manage.agreementType;
            }
            if ((i & 8) != 0) {
                str3 = manage.merchantContact;
            }
            return manage.copy(merchantManagementType, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Disable;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "merchantManagementType", "", "merchantName", "", "isDisabling", "isError", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;ZZLcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;ZZLcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Disable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "getMerchantManagementType", "Ljava/lang/String;", "getMerchantName", "Z", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disable implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;
        private final boolean isDisabling;
        private final boolean isError;
        private final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType;
        private final java.lang.String merchantName;

        public Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str, boolean z, boolean z2, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.merchantManagementType = merchantManagementType;
            this.merchantName = str;
            this.isDisabling = z;
            this.isError = z2;
            this.errorContext = errorContext;
        }

        public /* synthetic */ Disable(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str, boolean z, boolean z2, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(merchantManagementType, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getMerchantManagementType() {
            return this.merchantManagementType;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final boolean isDisabling() {
            return this.isDisabling;
        }

        public final boolean isError() {
            return this.isError;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType = this.merchantManagementType;
            java.lang.String str = this.merchantName;
            boolean z = this.isDisabling;
            boolean z2 = this.isError;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Disable(merchantManagementType=");
            sb.append(merchantManagementType);
            sb.append(", merchantName=");
            sb.append(str);
            sb.append(", isDisabling=");
            sb.append(z);
            sb.append(", isError=");
            sb.append(z2);
            sb.append(", errorContext=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.merchantManagementType.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isDisabling);
            int hashCode4 = java.lang.Boolean.hashCode(this.isError);
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (errorContext == null ? 0 : errorContext.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) other;
            return this.merchantManagementType == disable.merchantManagementType && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, disable.merchantName) && this.isDisabling == disable.isDisabling && this.isError == disable.isError && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, disable.errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable copy(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String merchantName, boolean isDisabling, boolean isError, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(merchantManagementType, merchantName, isDisabling, isError, errorContext);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDisabling() {
            return this.isDisabling;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getMerchantManagementType() {
            return this.merchantManagementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable copy$default(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str, boolean z, boolean z2, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantManagementType = disable.merchantManagementType;
            }
            if ((i & 2) != 0) {
                str = disable.merchantName;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                z = disable.isDisabling;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = disable.isError;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                errorContext = disable.errorContext;
            }
            return disable.copy(merchantManagementType, str2, z3, z4, errorContext);
        }
    }
}
