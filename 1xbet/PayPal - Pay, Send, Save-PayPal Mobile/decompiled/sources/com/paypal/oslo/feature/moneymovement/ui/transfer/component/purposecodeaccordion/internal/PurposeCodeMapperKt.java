package com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "", "toDisplayNameResId", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;)Ljava/lang/Integer;", "", "toDisplayName", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeCodeMapperKt {
    public static final java.lang.Integer toDisplayNameResId(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCode, "");
        switch (com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.internal.PurposeCodeMapperKt.WhenMappings.$EnumSwitchMapping$0[purposeCode.ordinal()]) {
            case 1:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_bills_utilities);
            case 2:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_education);
            case 3:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_entertainment_games);
            case 4:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_food_drinks);
            case 5:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_healthcare);
            case 6:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_general_merchandise);
            case 7:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_transport);
            case 8:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_purpose_travel_accommodation);
            case 9:
                return null;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.String toDisplayName(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCode, "");
        composer.startReplaceGroup(294709236);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(294709236, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.internal.toDisplayName (PurposeCodeMapper.kt:33)");
        }
        java.lang.Integer displayNameResId = toDisplayNameResId(purposeCode);
        if (displayNameResId == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return "";
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(displayNameResId.intValue(), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.BILLS_AND_UTILITIES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.EDUCATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.ENTERTAINMENT_AND_GAMES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.FOOD_AND_DRINKS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.HEALTHCARE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.PURCHASE_OF_GENERAL_MERCHANDISE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.TRANSPORT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.TRAVEL_AND_ACCOMMODATION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.UNKNOWN.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
