package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"StepUpViewComponentContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "onStepForward", "Lkotlin/Function0;", "stepViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/ui/StepUpViewComponentViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/ui/StepUpViewComponentViewModel;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "hasTriggered", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepUpViewComponentContentKt {
    public static final void StepUpViewComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpViewComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel stepUpViewComponentViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpViewComponentViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1314882314);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(stepUpViewComponentConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(stepUpViewComponentViewModel) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1314882314, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContent (StepUpViewComponentContent.kt:47)");
            }
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            java.lang.String stepUpContextId = stepUpViewComponentConfig.getStepUpContextId();
            boolean changed = startRestartGroup.changed(mutableState);
            boolean changedInstance = startRestartGroup.changedInstance(stepUpViewComponentViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(intentId);
            boolean z = (i3 & 14) == 4;
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$StepUpViewComponentContent$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed | changedInstance | changedInstance2) || z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                str = stepUpContextId;
                rememberedValue2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$StepUpViewComponentContent$1$1(stepUpViewComponentViewModel, intentId, stepUpViewComponentConfig, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                str = stepUpContextId;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(stepUpViewComponentViewModel);
            boolean z2 = (i3 & 896) == 256;
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$StepUpViewComponentContent$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$StepUpViewComponentContent$2$1(stepUpViewComponentViewModel, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt.m17092$r8$lambda$KN1C8P5Lbb2dEAL856BRRqEQLY(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig.this, intentId, function0, stepUpViewComponentViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$KN1-C8P5Lbb2dEAL856BRRqEQLY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17092$r8$lambda$KN1C8P5Lbb2dEAL856BRRqEQLY(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpViewComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel stepUpViewComponentViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        StepUpViewComponentContent(stepUpViewComponentConfig, intentId, function0, stepUpViewComponentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
