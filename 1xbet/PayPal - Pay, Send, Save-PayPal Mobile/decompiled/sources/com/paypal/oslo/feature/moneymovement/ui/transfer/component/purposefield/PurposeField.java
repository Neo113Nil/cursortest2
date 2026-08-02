package com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposefield/PurposeField;", "", "<init>", "()V", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeField {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PurposeField() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeFieldCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2146692216);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(purposeFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(purposeFieldCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2146692216, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.Content (PurposeField.kt:43)");
                }
                if (purposeFieldConfig instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Loading) {
                    startRestartGroup.startReplaceGroup(44975661);
                    com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldLoadingKt.PurposeFieldLoading(modifier4, startRestartGroup, (i3 >> 6) & 14, 0);
                } else if (purposeFieldConfig instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) {
                    startRestartGroup.startReplaceGroup(45113859);
                    com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) purposeFieldConfig;
                    if (!ready.getEnabled()) {
                        startRestartGroup.startReplaceGroup(45121981);
                        com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldDisabledKt.PurposeFieldDisabled(ready, modifier4, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(45387713);
                        boolean z = ready.getValue().length() > 0;
                        boolean isExpanded = ready.isExpanded();
                        boolean changedInstance = startRestartGroup.changedInstance(purposeFieldConfig);
                        boolean z2 = (i3 & 112) == 32;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.$r8$lambda$YO028h5zo8oaybmbJpuZMBd9TAs(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.this, purposeFieldCallbacks);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int i5 = ((i3 >> 6) & 14) | 1769520;
                        modifier3 = modifier4;
                        com.paypal.oslo.core.commonui.components.ProgressiveDisclosureAccordionKt.ProgressiveDisclosureAccordion(modifier4, true, z, isExpanded, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2116148193, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.$r8$lambda$c9sKD2ar0DSFnKloTkG_mGHz7Oo(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1342024160, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.$r8$lambda$MRLASlhU4uqkNJ2OGuXhVDN4DG4(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.this, purposeFieldCallbacks, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, i5, 0);
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                } else {
                    startRestartGroup.startReplaceGroup(1386923440);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                modifier3 = modifier4;
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.m15748$r8$lambda$0V4EMOwPeAdKRtKs_o8UdYlppY(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.this, purposeFieldConfig, purposeFieldCallbacks, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$0V4EMOwPeA-dKRtKs_o8UdYlppY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15748$r8$lambda$0V4EMOwPeAdKRtKs_o8UdYlppY(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField purposeField, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        purposeField.Content(purposeFieldConfig, purposeFieldCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MRLASlhU4uqkNJ2OGuXhVDN4DG4(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1342024160, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.Content.<anonymous> (PurposeField.kt:71)");
            }
            com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldExpandedKt.PurposeFieldExpanded((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) purposeFieldConfig, purposeFieldCallbacks, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YO028h5zo8oaybmbJpuZMBd9TAs(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks) {
        if (((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) purposeFieldConfig).isExpanded()) {
            purposeFieldCallbacks.getOnCollapse().invoke();
        } else {
            purposeFieldCallbacks.getOnExpand().invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c9sKD2ar0DSFnKloTkG_mGHz7Oo(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2116148193, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField.Content.<anonymous> (PurposeField.kt:68)");
            }
            com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeFieldCollapsedKt.PurposeFieldCollapsed((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) purposeFieldConfig, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
