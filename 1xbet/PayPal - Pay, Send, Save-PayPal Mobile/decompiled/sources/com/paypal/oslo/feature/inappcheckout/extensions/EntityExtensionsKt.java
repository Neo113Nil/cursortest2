package com.paypal.oslo.feature.inappcheckout.extensions;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "", "returnUrl", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;)Ljava/lang/String;", "cancelUrl", "merchantName", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lcom/paypal/pds/components/AvatarSource;", "fallbackAvatarSource", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)Lcom/paypal/pds/components/AvatarSource;", "withoutEConsentContingency", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "toErrorScreenType", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntityExtensionsKt {
    public static final java.lang.String returnUrl(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity) {
        if (initializeCheckoutEntity == null) {
            return null;
        }
        return initializeCheckoutEntity.getCheckoutContext().getIntegrationDetails().getReturnUrl();
    }

    public static final java.lang.String cancelUrl(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity) {
        if (initializeCheckoutEntity == null) {
            return null;
        }
        return initializeCheckoutEntity.getCheckoutContext().getIntegrationDetails().getCancelUrl();
    }

    public static final java.lang.String merchantName(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity) {
        if (initializeCheckoutEntity == null) {
            return null;
        }
        return initializeCheckoutEntity.getCheckoutContext().getMerchant().getName();
    }

    public static final com.paypal.pds.components.AvatarSource fallbackAvatarSource(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
        if (buyerInfoEntity == null) {
            return new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
        }
        java.lang.String givenName = buyerInfoEntity.getName().getGivenName();
        java.lang.String obj = givenName != null ? kotlin.text.StringsKt.trim(givenName).toString() : null;
        if (obj == null) {
            obj = "";
        }
        java.lang.String surname = buyerInfoEntity.getName().getSurname();
        java.lang.String obj2 = surname != null ? kotlin.text.StringsKt.trim(surname).toString() : null;
        if (obj2 == null) {
            obj2 = "";
        }
        java.lang.String str = obj;
        if (str.length() != 0) {
            java.lang.String str2 = obj2;
            if (str2.length() != 0) {
                java.lang.String valueOf = java.lang.String.valueOf(kotlin.text.StringsKt.first(str));
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                java.lang.String valueOf2 = java.lang.String.valueOf(kotlin.text.StringsKt.first(str2));
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2, "");
                java.lang.String upperCase2 = valueOf2.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(upperCase2);
                return new com.paypal.pds.components.AvatarSource.Initials(sb.toString());
            }
        }
        return new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity withoutEConsentContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity> contingencies = buyerInfoEntity.getContingencies();
        if (contingencies != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : contingencies) {
                if (!(((com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity) obj) instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.copy$default(buyerInfoEntity, null, null, null, arrayList, null, 23, null);
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType toErrorScreenType(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
        if (nativeXOErrorEntity == null) {
            return com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(nativeXOErrorEntity.getErrorName(), "BUYER_RESTRICTION")) {
            return com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION;
        }
        if (nativeXOErrorEntity.isRecoverable()) {
            return com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.RECOVERABLE;
        }
        return com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE;
    }
}
