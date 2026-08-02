package com.paypal.oslo.feature.inappcheckout.ui.util;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000\u001a=\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013H\u0001¢\u0006\u0002\u0010\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0001\u001a$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u001e²\u0006\u0016\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"determineBillingAddressState", "Lkotlin/Pair;", "", "", "cardFormData", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "isLoading", "getCardValidations", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "cardBrand", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardMetadata;", "fiMetadata", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "buildMaskedCardNumber", "last4Digits", "grouping", "", "", "rememberDigitsOnlyChangeHandler", "Lkotlin/Function1;", "", "currentValue", "maxLength", "onValueChange", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "getCardFormScreenTitle", "operationType", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "shouldLoadCardFormData", "lastDigits", "inappcheckout_prodRelease", "updatedOnChange", "updatedCurrentValue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardUtilsKt {
    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> determineBillingAddressState(com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, boolean z) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress;
        java.lang.String str = null;
        if (z) {
            return kotlin.TuplesKt.to(java.lang.Boolean.FALSE, null);
        }
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> addresses = cardFormDataEntity != null ? cardFormDataEntity.getAddresses() : null;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list = addresses;
        boolean z2 = list == null || list.isEmpty();
        if (!z2 && (savedAddress = (com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) addresses)) != null) {
            str = savedAddress.getId();
        }
        return kotlin.TuplesKt.to(java.lang.Boolean.valueOf(z2), str);
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition getCardValidations(com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata cardMetadata, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity) {
        java.lang.Object obj;
        if (cardMetadata == null || fIMetadataEntity == null) {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntityKt.getDefaultCardMetadata();
        }
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType> financialInstrumentMetadataTypeList = fIMetadataEntity.getFinancialInstrumentMetadataTypeList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = financialInstrumentMetadataTypeList.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType) it.next()).getFinancialInstrumentMetadataActionList());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction) it2.next()).getFinancialInstrumentMetadataDefinitionList());
        }
        java.util.Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition) obj).getBrand(), cardMetadata.getBrand())) {
                break;
            }
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition = (com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition) obj;
        return financialInstrumentMetadataDefinition == null ? com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntityKt.getDefaultCardMetadata() : financialInstrumentMetadataDefinition;
    }

    public static final java.lang.String buildMaskedCardNumber(java.lang.String str, java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.String repeat = kotlin.text.StringsKt.repeat("•", java.lang.Math.max(0, kotlin.collections.CollectionsKt.sumOfInt(list) - str.length()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(repeat);
        sb.append(str);
        return sb.toString();
    }

    public static final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> rememberDigitsOnlyChangeHandler(java.lang.String str, final int i, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1623461235, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.util.rememberDigitsOnlyChangeHandler (CardUtils.kt:99)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i2 >> 6) & 14);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(str, composer, i2 & 14);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.$r8$lambda$nSIMXB8LmPNFrPjwW3OzjetAC2Y(i, rememberUpdatedState2, rememberUpdatedState, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function12;
    }

    public static final int getCardFormScreenTitle(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
        int i = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_title;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_update_card_title;
    }

    public static final boolean shouldLoadCardFormData(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
        return (operationType == com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE) && (str == null || str2 == null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nSIMXB8LmPNFrPjwW3OzjetAC2Y(int i, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String take = kotlin.text.StringsKt.take(sb.toString(), i);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(take, (java.lang.String) state.getValue())) {
            ((kotlin.jvm.functions.Function1) state2.getValue()).invoke(take);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
