package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a!\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"ScrollAnimationDurationMs", "", "ScrollOverLayButton", "", "Landroidx/compose/foundation/layout/BoxScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/layout/BoxScope;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "isNotAtBottom", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollOverLayButtonKt {
    public static final void ScrollOverLayButton(final androidx.compose.foundation.layout.BoxScope boxScope, final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1221184246);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(coroutineScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(scrollState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1221184246, i2, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButton (ScrollOverLayButton.kt:54)");
            }
            boolean z = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt.$r8$lambda$CJYvoNzsDVdUAOSsO_t6zPEIKSc(androidx.compose.foundation.ScrollState.this));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(((java.lang.Boolean) ((androidx.compose.runtime.State) rememberedValue).getValue()).booleanValue(), boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1755331278, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt.$r8$lambda$Qdl0CkMxALPaeQ4DG9IEqAQ0Vgc(kotlinx.coroutines.CoroutineScope.this, scrollState, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 200064, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt.m17159$r8$lambda$G7AGVYdueyIsZJ_fBUlDc9khY(androidx.compose.foundation.layout.BoxScope.this, coroutineScope, scrollState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ boolean $r8$lambda$CJYvoNzsDVdUAOSsO_t6zPEIKSc(androidx.compose.foundation.ScrollState scrollState) {
        return scrollState.getValue() < scrollState.getMaxValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FWCddCTMm9me_6Qjmvz2k0LnEcs(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.ScrollState scrollState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt$ScrollOverLayButton$1$1$1$1(scrollState, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G7A-GVYduey-IsZJ_fBUlDc9khY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17159$r8$lambda$G7AGVYdueyIsZJ_fBUlDc9khY(androidx.compose.foundation.layout.BoxScope boxScope, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.ScrollState scrollState, int i, androidx.compose.runtime.Composer composer, int i2) {
        ScrollOverLayButton(boxScope, coroutineScope, scrollState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qdl0CkMxALPaeQ4DG9IEqAQ0Vgc(final kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.foundation.ScrollState scrollState, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1755331278, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButton.<anonymous> (ScrollOverLayButton.kt:67)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_scroll_to_review, composer, 0);
        com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion2 = companion;
        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(companion2, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing128(), 2, null), "scroll_to_review_button");
        boolean changedInstance = composer.changedInstance(coroutineScope);
        boolean changed = composer.changed(scrollState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ScrollOverLayButtonKt.$r8$lambda$FWCddCTMm9me_6Qjmvz2k0LnEcs(kotlinx.coroutines.CoroutineScope.this, scrollState);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, testTag, null, null, primary, large, false, false, composer, 1769472, 408);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
