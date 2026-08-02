package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018R1\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\r\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/PlanAccordion;", "", "<init>", "()V", "mapperFactory", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanAccordionMapper;", "Landroidx/compose/runtime/Composable;", "getMapperFactory$money_movement_prodRelease$annotations", "getMapperFactory$money_movement_prodRelease", "()Lkotlin/jvm/functions/Function2;", "setMapperFactory$money_movement_prodRelease", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanAccordion {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.m15713$r8$lambda$mC_eezQV6nvpOCwObUr2FZriQI((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    };

    public static /* synthetic */ void getMapperFactory$money_movement_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public PlanAccordion() {
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> getMapperFactory$money_movement_prodRelease() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setMapperFactory$money_movement_prodRelease(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoSizes = function2;
    }

    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig, final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks planAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1182793154);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(planAccordionConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(planAccordionData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(planAccordionCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1182793154, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.Content (PlanAccordion.kt:117)");
            }
            final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper invoke = this.getHighSpeedVideoSizes.invoke(startRestartGroup, 0);
            final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state = planAccordionData.getState();
            if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading) {
                startRestartGroup.startReplaceGroup(-678846505);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.Camera2StreamConfigurationMap(modifier, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2125965930, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.$r8$lambda$ZJm5fojfdmXxjVX5FqORKMJZjFY(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 14) | 48, 0);
            } else if (state instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready) {
                startRestartGroup.startReplaceGroup(-678442668);
                com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready) state;
                if (ready.getPlans().isEmpty()) {
                    startRestartGroup.startReplaceGroup(-678451813);
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoFpsRanges(planAccordionConfig, ready, planAccordionCallbacks, modifier, startRestartGroup, i3 & 8078, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-678047170);
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.Camera2StreamConfigurationMap(modifier, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1784990121, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.m15712$r8$lambda$GT7z0s5Zjsg2QSSOfrO5kjoeo(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.this, invoke, planAccordionConfig, planAccordionCallbacks, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 14) | 48, 0);
                    startRestartGroup.endReplaceGroup();
                }
            } else {
                startRestartGroup.startReplaceGroup(1502121993);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.$r8$lambda$8GvUypcNVpjY2f3XZh_TU1XRy44(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.this, planAccordionConfig, planAccordionData, planAccordionCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8GvUypcNVpjY2f3XZh_TU1XRy44(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion planAccordion, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks planAccordionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        planAccordion.Content(planAccordionConfig, planAccordionData, planAccordionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GT7z0s5Zjs-g2QSSOfr-O5kjoeo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15712$r8$lambda$GT7z0s5Zjsg2QSSOfrO5kjoeo(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks planAccordionCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1784990121, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.Content.<anonymous> (PlanAccordion.kt:144)");
            }
            com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready) state;
            com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData banner = ready.getBanner();
            if (banner == null) {
                composer.startReplaceGroup(650724704);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(650724705);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoSizes(banner, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (!ready.getEnabled()) {
                composer.startReplaceGroup(651017810);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoSizes(ready, planAccordionMapper, null, planAccordionConfig.isInternationalFormat(), composer, 0, 4);
                composer.endReplaceGroup();
            } else if (ready.isExpanded() && planAccordionConfig.getShowChevron()) {
                composer.startReplaceGroup(651360608);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoFpsRanges(planAccordionConfig, ready, planAccordionCallbacks, planAccordionMapper, null, composer, 0, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(651679753);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoFpsRangesFor(planAccordionConfig, ready, planAccordionCallbacks, planAccordionMapper, null, planAccordionConfig.isInternationalFormat(), composer, 0, 16);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZJm5fojfdmXxjVX5FqORKMJZjFY(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2125965930, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.Content.<anonymous> (PlanAccordion.kt:123)");
            }
            if (((com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading) state).isExpanded()) {
                composer.startReplaceGroup(-1063227746);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.getHighSpeedVideoFpsRanges(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1063144387);
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt.Camera2StreamConfigurationMap(null, composer, 0, 1);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mC_eezQV6nvpOCwObUr2-FZriQI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper m15713$r8$lambda$mC_eezQV6nvpOCwObUr2FZriQI(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        composer.startReplaceGroup(-1060304198);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1060304198, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion.mapperFactory.<anonymous> (PlanAccordion.kt:107)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper mapper = ((com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0)).getMapper();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mapper;
    }
}
