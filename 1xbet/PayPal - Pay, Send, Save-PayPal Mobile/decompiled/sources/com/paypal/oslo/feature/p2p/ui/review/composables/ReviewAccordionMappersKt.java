package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;", "accordionType", "", "AccordionHeader", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;Landroidx/compose/runtime/Composer;I)V", "AccordionBody", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ReviewUiState;", "uiState", "", "getAccordionExpansionState", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;Lcom/paypal/oslo/feature/p2p/ui/review/state/ReviewUiState;)Z", "type", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "getToggleEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewAccordionMappersKt {
    public static final void AccordionHeader(final com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1921470174);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(accordionType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1921470174, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.AccordionHeader (ReviewAccordionMappers.kt:36)");
            }
            int i3 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.WhenMappings.$EnumSwitchMapping$0[accordionType.ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.$r8$lambda$MtjQ4EVxxQA_WXQfqArEHr1_7qY(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccordionBody(final com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1362230131);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(accordionType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1362230131, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.AccordionBody (ReviewAccordionMappers.kt:64)");
            }
            int i3 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.WhenMappings.$EnumSwitchMapping$0[accordionType.ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.$r8$lambda$LU0Fuk6_e9gUAMQhFBrNXPsT0O8(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean getAccordionExpansionState(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType, com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState reviewUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewUiState, "");
        int i = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.WhenMappings.$EnumSwitchMapping$0[accordionType.ordinal()];
        if (i == 1) {
            return reviewUiState.getPaymentTypeSection().isExpanded();
        }
        if (i == 2) {
            return reviewUiState.getShippingSection().isExpanded();
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return reviewUiState.getPaymentMethodSection().isExpanded();
    }

    public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent getToggleEvent(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionType, "");
        int i = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionMappersKt.WhenMappings.$EnumSwitchMapping$0[accordionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection.INSTANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LU0Fuk6_e9gUAMQhFBrNXPsT0O8(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccordionBody(accordionType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MtjQ4EVxxQA_WXQfqArEHr1_7qY(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccordionHeader(accordionType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.SHIPPING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_METHOD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
