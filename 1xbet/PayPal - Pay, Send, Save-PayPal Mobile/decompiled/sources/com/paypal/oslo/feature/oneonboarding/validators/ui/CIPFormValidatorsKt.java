package com.paypal.oslo.feature.oneonboarding.validators.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0011\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "dobConfig", "", "dobValue", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdViewComponentConfig;", "taxpayerConfig", "taxpayerIdValue", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "taxpayerIdType", "", "isAddressRequired", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "addressSelected", "Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;", "messages", "invalidSsnMessage", "Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationResult;", "validateCIPW9Form", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdViewComponentConfig;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;ZLcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPFormValidatorsKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult validateCIPW9Form(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig dateOfBirthViewComponentConfig, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, boolean z, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages, java.lang.String str3) {
        boolean z2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String taxpayerIdRequiredSsn;
        boolean z3;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPValidationMessages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str6 = null;
        if (dateOfBirthViewComponentConfig != null) {
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult validateDateOfBirth = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentValidatorKt.validateDateOfBirth(str, cIPValidationMessages.getDateOfBirthRequired(), cIPValidationMessages.getDateOfBirthFormat(), cIPValidationMessages.getDateOfBirthFuture(), cIPValidationMessages.getDateOfBirthMinAge(), cIPValidationMessages.getDateOfBirthMaxAge());
            boolean z4 = validateDateOfBirth instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.RequiredButEmpty;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (z4) {
                pair2 = kotlin.TuplesKt.to(((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.RequiredButEmpty) validateDateOfBirth).getErrorMessage(), bool);
            } else if (validateDateOfBirth instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Invalid) {
                pair2 = kotlin.TuplesKt.to(((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Invalid) validateDateOfBirth).getErrorMessage(), bool);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(validateDateOfBirth, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Valid.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                pair2 = kotlin.TuplesKt.to(null, java.lang.Boolean.FALSE);
            }
            java.lang.String str7 = (java.lang.String) pair2.component1();
            z2 = ((java.lang.Boolean) pair2.component2()).booleanValue();
            str4 = str7;
        } else {
            z2 = false;
            str4 = null;
        }
        if (taxpayerIdViewComponentConfig != null) {
            int i = com.paypal.oslo.feature.oneonboarding.validators.ui.CIPFormValidatorsKt.WhenMappings.$EnumSwitchMapping$0[taxpayerIdType.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 || i == 4) {
                    taxpayerIdRequiredSsn = cIPValidationMessages.getTaxpayerIdRequiredItin();
                    com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult validateTaxpayerId = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.validateTaxpayerId(str2, taxpayerIdType, taxpayerIdRequiredSsn, str3, cIPValidationMessages.getTaxpayerIdInvalidItin(), cIPValidationMessages.getTaxpayerIdLengthSsn(), cIPValidationMessages.getTaxpayerIdLengthItin(), cIPValidationMessages.getTaxpayerIdLengthSsn4(), cIPValidationMessages.getTaxpayerIdLengthItin4());
                    z3 = validateTaxpayerId instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    if (!z3) {
                        pair = kotlin.TuplesKt.to(((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty) validateTaxpayerId).getErrorMessage(), bool2);
                    } else if (validateTaxpayerId instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid) {
                        pair = kotlin.TuplesKt.to(((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid) validateTaxpayerId).getErrorMessage(), bool2);
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(validateTaxpayerId, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        pair = kotlin.TuplesKt.to(null, java.lang.Boolean.FALSE);
                    }
                    str5 = (java.lang.String) pair.component1();
                    z2 = !z2 || ((java.lang.Boolean) pair.component2()).booleanValue();
                } else if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            taxpayerIdRequiredSsn = cIPValidationMessages.getTaxpayerIdRequiredSsn();
            com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult validateTaxpayerId2 = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.validateTaxpayerId(str2, taxpayerIdType, taxpayerIdRequiredSsn, str3, cIPValidationMessages.getTaxpayerIdInvalidItin(), cIPValidationMessages.getTaxpayerIdLengthSsn(), cIPValidationMessages.getTaxpayerIdLengthItin(), cIPValidationMessages.getTaxpayerIdLengthSsn4(), cIPValidationMessages.getTaxpayerIdLengthItin4());
            z3 = validateTaxpayerId2 instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty;
            java.lang.Boolean bool22 = java.lang.Boolean.TRUE;
            if (!z3) {
            }
            str5 = (java.lang.String) pair.component1();
            z2 = !z2 || ((java.lang.Boolean) pair.component2()).booleanValue();
        } else {
            str5 = null;
        }
        if (z && address == null) {
            str6 = cIPValidationMessages.getAddressRequired();
            z2 = true;
        }
        return new com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult(!z2, str4, str5, str6);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN4.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
