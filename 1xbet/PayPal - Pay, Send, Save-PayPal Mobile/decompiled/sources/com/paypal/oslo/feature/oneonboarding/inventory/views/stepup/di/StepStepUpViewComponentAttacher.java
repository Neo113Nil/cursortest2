package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/di/StepStepUpViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/di/StepUpViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;", "config", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lkotlin/Function0;", "", "onStepForward", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepStepUpViewComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepUpViewComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher();

    private StepStepUpViewComponentAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepUpViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpViewComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1928796239);
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
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1928796239, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher.Attach (StepUpViewComponentAttacher.kt:64)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentContentKt.StepUpViewComponentContent(stepUpViewComponentConfig, intentId, function0, (com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher.m17088$r8$lambda$L2sdsegFltC9qaOKi0b8cRlIfI(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher.this, stepUpViewComponentConfig, intentId, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$L2sdseg-FltC9qaOKi0b8cRlIfI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17088$r8$lambda$L2sdsegFltC9qaOKi0b8cRlIfI(com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher stepStepUpViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpViewComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepStepUpViewComponentAttacher.Attach(stepUpViewComponentConfig, intentId, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
