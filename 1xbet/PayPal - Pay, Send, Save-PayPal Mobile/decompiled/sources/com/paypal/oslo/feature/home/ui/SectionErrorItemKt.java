package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0010"}, d2 = {"DefaultErrorSectionMinHeight", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "SectionErrorItem", "", "sectionError", "Lcom/paypal/oslo/feature/home/domain/model/SectionError;", "isExhausted", "", "onRetry", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "minHeight", "SectionErrorItem-FJfuzF0", "(Lcom/paypal/oslo/feature/home/domain/model/SectionError;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SectionErrorItemKt {
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(500.0f);

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006d  */
    /* renamed from: SectionErrorItem-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14925SectionErrorItemFJfuzF0(final com.paypal.oslo.feature.home.domain.model.SectionError sectionError, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        float f2;
        final float f3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1736352108);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sectionError) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    f3 = f2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    float f4 = i4 != 0 ? getHighResolutionOutputSizeshNQ4ISI : f2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1736352108, i3, -1, "com.paypal.oslo.feature.home.ui.SectionErrorItem (SectionErrorItem.kt:50)");
                    }
                    androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f4, 0.0f, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1728heightInVpY3zN4$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.core.Icon.ArrowClockwise arrowClockwise = com.paypal.pds.core.Icon.ArrowClockwise.INSTANCE;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.home.R.string.feature_home_error_title, startRestartGroup, 0);
                    java.lang.String message = sectionError.getMessage();
                    if (z) {
                        startRestartGroup.startReplaceGroup(-691958973);
                        startRestartGroup.endReplaceGroup();
                        str = null;
                    } else {
                        startRestartGroup.startReplaceGroup(-853607399);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.home.R.string.feature_home_error_reload_button_title, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        str = stringResource2;
                    }
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    com.paypal.pds.core.Icon.ArrowClockwise arrowClockwise2 = arrowClockwise;
                    boolean z2 = (i3 & 112) == 32;
                    boolean z3 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.SectionErrorItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.home.ui.SectionErrorItemKt.$r8$lambda$IccQ71U3rm06ZkiQPnOE3tyEG1w(z, function0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    float f5 = f4;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.EmptyStateKt.EmptyState(arrowClockwise2, m1708paddingVpY3zN4$default, null, stringResource, message, str, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 4);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    f3 = f5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.SectionErrorItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.ui.SectionErrorItemKt.$r8$lambda$kkm7K9YRPgLaD314sDcK6lrSykw(com.paypal.oslo.feature.home.domain.model.SectionError.this, z, function0, modifier5, f3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IccQ71U3rm06ZkiQPnOE3tyEG1w(boolean z, kotlin.jvm.functions.Function0 function0) {
        if (!z) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kkm7K9YRPgLaD314sDcK6lrSykw(com.paypal.oslo.feature.home.domain.model.SectionError sectionError, boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m14925SectionErrorItemFJfuzF0(sectionError, z, function0, modifier, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
