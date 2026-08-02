package com.paypal.oslo.feature.p2p.ui.success.views;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "successState", "Lkotlin/Function0;", "", "onActivityClick", "BottomDisclaimer", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomDisclaimerKt {
    public static final void BottomDisclaimer(final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1951924348);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(successState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1951924348, i2, -1, "com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimer (BottomDisclaimer.kt:29)");
            }
            int i3 = com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimerKt.WhenMappings.$EnumSwitchMapping$0[successState.getFlowType().ordinal()];
            if (i3 == 1) {
                com.paypal.oslo.feature.p2p.ui.success.state.UiContact receiver = successState.getReceiver();
                java.lang.String name2 = receiver != null ? receiver.getName() : null;
                java.lang.String str = name2 != null ? name2 : "";
                java.lang.StringBuilder sb = new java.lang.StringBuilder("We'll let ");
                sb.append(str);
                sb.append(" know right away. Check your activity for details.");
                obj = sb.toString();
            } else if (i3 == 2) {
                obj = "The money will appear in your PayPal balance. Check your activity for details.";
            } else {
                if (i3 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                obj = "Share your link to get paid. Check your activity to manage it.";
            }
            com.paypal.pds.core.RichText richText = com.paypal.pds.utils.BackwardCompatibleRichTextKt.toRichText(obj, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(lib.android.paypal.com.magnessdk.c.b.i, "activity")));
            com.paypal.pds.core.Typography.LabelMedium labelMedium = com.paypal.pds.core.Typography.LabelMedium.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.DISCLAIMER);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimerKt.$r8$lambda$YURFmx5v3Ktr5x5EKx0v2fl1KY8(kotlin.jvm.functions.Function0.this, (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, labelMedium, null, composer2, 0, 48, 5116);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.p2p.ui.success.views.BottomDisclaimerKt.$r8$lambda$Dyj1GOqHsK3uC5Yk6B0IjhjcDjI(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState.this, function0, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dyj1GOqHsK3uC5Yk6B0IjhjcDjI(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        BottomDisclaimer(successState, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YURFmx5v3Ktr5x5EKx0v2fl1KY8(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.success.state.FlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.success.state.FlowType.SEND_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.success.state.FlowType.REQUEST_MONEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.success.state.FlowType.PAYPAL_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
