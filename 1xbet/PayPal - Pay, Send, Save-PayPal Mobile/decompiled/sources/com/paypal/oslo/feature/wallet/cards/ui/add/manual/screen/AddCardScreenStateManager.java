package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u00020\t\"\b\b\u0000\u0010\f*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u00020\t\"\b\b\u0000\u0010\f*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\r\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenStateManager;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardScreenState;", "uiState", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "Lkotlin/Function0;", "block", "", "transition", "(Lkotlin/jvm/functions/Function0;)V", "T", "Lkotlin/reflect/KClass;", "targetStateType", "Lkotlin/Function1;", "updateWhen", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "effectWhen", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardScreenStateManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState>, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> getHighSpeedVideoFpsRanges;

    public AddCardScreenStateManager(kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> mutableStateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        this.getHighSpeedVideoFpsRanges = mutableStateFlow;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r1.getClass() != r2.getClass()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void transition(kotlin.jvm.functions.Function0<? extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> block) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState value = this.getHighSpeedVideoFpsRanges.getValue();
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady invoke = block.invoke();
        if (!(value instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady)) {
            if (!(value instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (!(invoke instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady)) {
                if (!(invoke instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            this.getHighSpeedVideoFpsRangesFor.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()), value);
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState addCardScreenState = this.getHighSpeedVideoFpsRangesFor.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(invoke.getClass()));
        boolean z = invoke instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady;
        if (z) {
            if (addCardScreenState != null) {
                if (z) {
                    if (!(addCardScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady)) {
                        formReady = (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) invoke;
                    } else {
                        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady2 = (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) invoke;
                        copy = r6.copy((r24 & 1) != 0 ? r6.firstName : null, (r24 & 2) != 0 ? r6.lastName : null, (r24 & 4) != 0 ? r6.cardNumberField : null, (r24 & 8) != 0 ? r6.expirationDateField : null, (r24 & 16) != 0 ? r6.cvvField : null, (r24 & 32) != 0 ? r6.address : null, (r24 & 64) != 0 ? r6.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(formReady2.getFormState().getCardBrandField(), null, null, false, ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) addCardScreenState).getFormState().getCardBrandField().getShowSelectionGuidance(), 7, null), (r24 & 128) != 0 ? r6.showCardBrandDropDown : false, (r24 & 256) != 0 ? r6.cardBrandDropdownState : null, (r24 & 512) != 0 ? r6.isSubmitting : false, (r24 & 1024) != 0 ? formReady2.getFormState().bannerState : null);
                        formReady = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady2, copy, null, null, null, 14, null);
                    }
                    invoke = formReady;
                } else if (!(invoke instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        } else if (!(invoke instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow.setValue(invoke);
    }

    public final <T extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> void updateWhen(kotlin.reflect.KClass<T> targetStateType, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetStateType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState value = this.getHighSpeedVideoFpsRanges.getValue();
        if (targetStateType.isInstance(value)) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            mutableStateFlow.setValue(block.invoke(value));
        }
    }

    public final <T extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> void effectWhen(kotlin.reflect.KClass<T> targetStateType, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetStateType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState value = this.getHighSpeedVideoFpsRanges.getValue();
        if (targetStateType.isInstance(value)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            block.invoke(value);
        }
    }
}
