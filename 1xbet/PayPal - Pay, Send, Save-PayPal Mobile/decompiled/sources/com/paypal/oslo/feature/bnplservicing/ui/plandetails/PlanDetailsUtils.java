package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0019\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0018\u0012\u0004\u0012\u00020\r0\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J1\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "addFiType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "mapAddFiTypeToSupportedType", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "", "paymentUpdated", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "onEvent", "handleChangeFiDismiss", "(ZLkotlin/jvm/functions/Function1;)V", "handleNewlyAddedFiConsume", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "createOnNewlyAddedFiConsumeCallback", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "Lkotlin/Function4;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "", "createOnDismissCallback", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function4;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addCardRequestId", "addBankRequestId", "handleNavigateToAddFundingInstrument-hEdsvIk", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;)V", "handleNavigateToAddFundingInstrument", "createOnNavigateToAddFundingInstrumentCallback-ssJHk08", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "createOnNavigateToAddFundingInstrumentCallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils();

    private PlanDetailsUtils() {
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition mapAddFiTypeToSupportedType(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFiType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFiType, "");
        int i = com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils.WhenMappings.$EnumSwitchMapping$0[addFiType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.CREDIT_CARD;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.BANK;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void handleChangeFiDismiss(boolean paymentUpdated, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        onEvent.invoke(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiDismissed.INSTANCE);
        if (paymentUpdated) {
            onEvent.invoke(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentMethodUpdatedSuccessfully.INSTANCE);
        }
    }

    public final void handleNewlyAddedFiConsume(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        onEvent.invoke(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnNewFiConsumed.INSTANCE);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> createOnNewlyAddedFiConsumeCallback(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils.$r8$lambda$CE3CXrq5OSghzWbRqaA0wu9niZ8(kotlin.jvm.functions.Function1.this);
            }
        };
    }

    public final kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> createOnDismissCallback(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        return new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils.m12642$r8$lambda$7YiCzO5StY6BDLbqmqykJfmVzc(kotlin.jvm.functions.Function1.this, (java.lang.Boolean) obj, (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj2, ((java.lang.Boolean) obj3).booleanValue(), (java.util.List) obj4);
            }
        };
    }

    /* renamed from: handleNavigateToAddFundingInstrument-hEdsvIk, reason: not valid java name */
    public final void m12644handleNavigateToAddFundingInstrumenthEdsvIk(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFiType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String addCardRequestId, java.lang.String addBankRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFiType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankRequestId, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition mapAddFiTypeToSupportedType = mapAddFiTypeToSupportedType(addFiType);
        if (mapAddFiTypeToSupportedType != null) {
            com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12541navigateToAddFundingInstrumenthEdsvIk(mapAddFiTypeToSupportedType, appNavigator, addCardRequestId, addBankRequestId);
        }
    }

    /* renamed from: createOnNavigateToAddFundingInstrumentCallback-ssJHk08, reason: not valid java name */
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> m12643createOnNavigateToAddFundingInstrumentCallbackssJHk08(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String addCardRequestId, final java.lang.String addBankRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankRequestId, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUtils.$r8$lambda$HxKDeXmNxaZ1MmfvUHT4y1lp2h0(com.paypal.oslo.core.navigation.AppNavigator.this, addCardRequestId, addBankRequestId, (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$7Y-iCzO5StY6BDLbqmqykJfmVzc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12642$r8$lambda$7YiCzO5StY6BDLbqmqykJfmVzc(kotlin.jvm.functions.Function1 function1, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        INSTANCE.handleChangeFiDismiss(z, function1);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CE3CXrq5OSghzWbRqaA0wu9niZ8(kotlin.jvm.functions.Function1 function1) {
        INSTANCE.handleNewlyAddedFiConsume(function1);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HxKDeXmNxaZ1MmfvUHT4y1lp2h0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
        INSTANCE.m12644handleNavigateToAddFundingInstrumenthEdsvIk(addFundingInstrumentType, appNavigator, str, str2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
