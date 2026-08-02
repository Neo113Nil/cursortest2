package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"PreviewNameAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentContentAttacher;", "SignUpWithGoogleStepScreenContent", "", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "onSubmit", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "onStepForward", "Lkotlin/Function0;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "onBack", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "nationality", "", "nameAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "SignUpWithGoogleStepScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignUpWithGoogleStepScreenContentKt {
    private static final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentContentAttacher Camera2StreamConfigurationMap = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentContentAttacher(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.UsNameLayoutProvider.INSTANCE.createUsNameLayout());

    /* JADX WARN: Removed duplicated region for block: B:101:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x043b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignUpWithGoogleStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.lang.String str2;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher2;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher3;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        boolean changed;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        int i5;
        java.lang.Object obj;
        java.util.Iterator<T> it;
        com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig googleAccountInfoDisplayComponentConfig;
        float f;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig;
        java.util.Iterator<T> it2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig2;
        float f2;
        final boolean[] zArr;
        androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap;
        int[] iArr;
        int i6;
        final androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap2;
        kotlin.jvm.functions.Function1 function12;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signUpWithGoogleStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1568762145);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signUpWithGoogleStepComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(topBarConfig) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            if ((i2 & 256) == 0) {
                if ((134217728 & i) == 0 ? startRestartGroup.changed(nameViewComponentAttacher) : startRestartGroup.changedInstance(nameViewComponentAttacher)) {
                    i7 = 67108864;
                    i3 |= i7;
                }
            }
            i7 = 33554432;
            i3 |= i7;
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                companion = modifier;
                str3 = str;
            } else {
                companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                str3 = i9 != 0 ? null : str;
                if ((i2 & 256) != 0) {
                    str4 = str3;
                    nameViewComponentAttacher3 = Camera2StreamConfigurationMap;
                    modifier3 = companion;
                    i4 = (-234881025) & i3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1568762145, i4, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContent (SignUpWithGoogleStepScreenContent.kt:108)");
                    }
                    changed = startRestartGroup.changed(intentId);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAnalyticsContexts(intentId);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    java.util.List list = (java.util.List) rememberedValue;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap3 = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue2;
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new int[]{0};
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final int[] iArr2 = (int[]) rememberedValue3;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i5 = 1;
                        boolean[] zArr2 = {true};
                        startRestartGroup.updateRememberedValue(zArr2);
                        obj = zArr2;
                    } else {
                        i5 = 1;
                        obj = rememberedValue4;
                    }
                    boolean[] zArr3 = (boolean[]) obj;
                    composer2 = startRestartGroup;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, i5, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    int i10 = (i4 >> 6) & 896;
                    int i11 = i4;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.OnboardingTopBar(topBarConfig, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, list), function02, null, composer2, ((i4 >> 9) & 14) | i10, 8);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_signup_with_google_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer2, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_signup_with_google_subtitle, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer2, 0);
                    composer2.startReplaceGroup(-1559679467);
                    it = signUpWithGoogleStepComponentConfig.getComponents().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            googleAccountInfoDisplayComponentConfig = null;
                            break;
                        }
                        com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next();
                        if (!(viewComponentConfig instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig)) {
                            viewComponentConfig = null;
                        }
                        googleAccountInfoDisplayComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig) viewComponentConfig;
                        if (googleAccountInfoDisplayComponentConfig != null) {
                            break;
                        }
                    }
                    if (googleAccountInfoDisplayComponentConfig == null) {
                        nameViewComponentConfig = null;
                        f = 0.0f;
                        com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.ui.GoogleAccountInfoDisplayContentKt.GoogleAccountInfoDisplayContent(googleAccountInfoDisplayComponentConfig, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), function02, composer2, i10 | 48, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } else {
                        f = 0.0f;
                        nameViewComponentConfig = null;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1559664830);
                    it2 = signUpWithGoogleStepComponentConfig.getComponents().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            nameViewComponentConfig2 = nameViewComponentConfig;
                            break;
                        }
                        com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig2 = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it2.next();
                        if (!(viewComponentConfig2 instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig)) {
                            viewComponentConfig2 = nameViewComponentConfig;
                        }
                        nameViewComponentConfig2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig) viewComponentConfig2;
                        if (nameViewComponentConfig2 != null) {
                            break;
                        }
                    }
                    if (nameViewComponentConfig2 == null) {
                        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig3 = nameViewComponentConfig2;
                        boolean changedInstance = composer2.changedInstance(nameViewComponentConfig3);
                        java.lang.Object rememberedValue5 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            snapshotStateMap2 = snapshotStateMap3;
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$7APxXVayttT3uGr9B3d3quO7Zt0(androidx.compose.runtime.snapshots.SnapshotStateMap.this, nameViewComponentConfig3, (com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem) obj2);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        } else {
                            snapshotStateMap2 = snapshotStateMap3;
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
                        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, nameViewComponentConfig);
                        kotlin.jvm.functions.Function1 function14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$voQv5dP1EW6lydFLI_9KsrfrLY4(kotlin.jvm.internal.Ref.ObjectRef.this, (kotlin.jvm.functions.Function0) obj2);
                            }
                        };
                        boolean changedInstance2 = composer2.changedInstance(iArr2);
                        boolean changedInstance3 = composer2.changedInstance(zArr3);
                        boolean z = (i11 & 112) == 32;
                        boolean changedInstance4 = composer2.changedInstance(signUpWithGoogleStepComponentConfig);
                        boolean z2 = (i11 & 896) == 256;
                        java.lang.Object rememberedValue6 = composer2.rememberedValue();
                        if (((changedInstance2 | changedInstance3 | z | changedInstance4) || z2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            zArr = zArr3;
                            iArr = iArr2;
                            function12 = function14;
                            final androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap4 = snapshotStateMap2;
                            snapshotStateMap = snapshotStateMap2;
                            f2 = 0.0f;
                            java.lang.Object obj2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.m16838$r8$lambda$M7oLqiV7OxKI0_FV7y7bbz68as(iArr2, zArr, snapshotStateMap4, function1, signUpWithGoogleStepComponentConfig, function0, ((java.lang.Boolean) obj3).booleanValue());
                                }
                            };
                            composer2.updateRememberedValue(obj2);
                            rememberedValue6 = obj2;
                        } else {
                            function12 = function14;
                            iArr = iArr2;
                            snapshotStateMap = snapshotStateMap2;
                            zArr = zArr3;
                            f2 = 0.0f;
                        }
                        com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher.ComposeDefaultImpls.Attach$default(nameViewComponentConfig3, function13, str4, emptyMap, fillMaxWidth$default, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, nameViewComponentAttacher3, composer2, ((i11 >> 15) & 896) | 27648 | (234881024 & i11), 128);
                        i6 = 0;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    } else {
                        f2 = f;
                        zArr = zArr3;
                        snapshotStateMap = snapshotStateMap3;
                        iArr = iArr2;
                        i6 = 0;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    final int[] iArr3 = iArr;
                    final boolean[] zArr4 = zArr;
                    final androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap5 = snapshotStateMap;
                    com.paypal.pds.components.ButtonKt.Button(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$GrG9lS4Kiz5MCBbJETj5wEf98uo(iArr3, zArr4, signUpWithGoogleStepComponentConfig, objectRef, snapshotStateMap5, function1, function0);
                        }
                    }, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_next_button_label, composer2, i6), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), f2, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 5, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, 1769472, 408);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str2 = str4;
                    nameViewComponentAttacher2 = nameViewComponentAttacher3;
                    modifier2 = modifier4;
                }
            }
            nameViewComponentAttacher3 = nameViewComponentAttacher;
            modifier3 = companion;
            i4 = i3;
            str4 = str3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changed = startRestartGroup.changed(intentId);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAnalyticsContexts(intentId);
            startRestartGroup.updateRememberedValue(rememberedValue);
            java.util.List list2 = (java.util.List) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap32 = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue2;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final int[] iArr22 = (int[]) rememberedValue3;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            boolean[] zArr32 = (boolean[]) obj;
            composer2 = startRestartGroup;
            androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, i5, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            int i102 = (i4 >> 6) & 896;
            int i112 = i4;
            androidx.compose.ui.Modifier modifier42 = modifier3;
            com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.OnboardingTopBar(topBarConfig, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, list2), function02, null, composer2, ((i4 >> 9) & 14) | i102, 8);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance3, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_signup_with_google_title, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer2, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_signup_with_google_subtitle, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer2, 0);
            composer2.startReplaceGroup(-1559679467);
            it = signUpWithGoogleStepComponentConfig.getComponents().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            if (googleAccountInfoDisplayComponentConfig == null) {
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1559664830);
            it2 = signUpWithGoogleStepComponentConfig.getComponents().iterator();
            while (true) {
                if (it2.hasNext()) {
                }
            }
            if (nameViewComponentConfig2 == null) {
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            final int[] iArr32 = iArr;
            final boolean[] zArr42 = zArr;
            final androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap52 = snapshotStateMap;
            com.paypal.pds.components.ButtonKt.Button(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$GrG9lS4Kiz5MCBbJETj5wEf98uo(iArr32, zArr42, signUpWithGoogleStepComponentConfig, objectRef2, snapshotStateMap52, function1, function0);
                }
            }, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_next_button_label, composer2, i6), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), f2, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 5, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, 1769472, 408);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            str2 = str4;
            nameViewComponentAttacher2 = nameViewComponentAttacher3;
            modifier2 = modifier42;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            str2 = str;
            nameViewComponentAttacher2 = nameViewComponentAttacher;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$wkzxvzTk0GoosNiUxqm_NIY0Peg(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig.this, function1, function0, topBarConfig, function02, intentId, modifier2, str2, nameViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.snapshots.SnapshotStateMap<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem> snapshotStateMap, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        java.util.Iterator<T> it = snapshotStateMap.values().iterator();
        while (it.hasNext()) {
            function1.invoke((com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem) it.next());
        }
        function1.invoke(new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepCollectedItem(signUpWithGoogleStepComponentConfig.mo16702getIdfHLlpbY(), null));
        function0.invoke();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7APxXVayttT3uGr9B3d3quO7Zt0(androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem nameCollectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameCollectedItem, "");
        snapshotStateMap.put(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(nameViewComponentConfig.mo16702getIdfHLlpbY()), nameCollectedItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GrG9lS4Kiz5MCBbJETj5wEf98uo(int[] iArr, boolean[] zArr, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0) {
        java.lang.Object obj;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig;
        if (iArr[0] <= 0) {
            zArr[0] = true;
            java.util.Iterator<T> it = signUpWithGoogleStepComponentConfig.getComponents().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    nameViewComponentConfig = null;
                    break;
                }
                com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next();
                if (!(viewComponentConfig instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig)) {
                    viewComponentConfig = null;
                }
                nameViewComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig) viewComponentConfig;
                if (nameViewComponentConfig != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig2 = nameViewComponentConfig;
            java.lang.Object obj2 = objectRef.element;
            if (nameViewComponentConfig2 != null && nameViewComponentConfig2.isEditable()) {
                obj = obj2;
            }
            java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull(obj);
            iArr[0] = listOfNotNull.size();
            if (listOfNotNull.isEmpty()) {
                getHighResolutionOutputSizeshNQ4ISI(snapshotStateMap, function1, signUpWithGoogleStepComponentConfig, function0);
            } else {
                java.util.Iterator it2 = listOfNotNull.iterator();
                while (it2.hasNext()) {
                    ((kotlin.jvm.functions.Function0) it2.next()).invoke();
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M7oLqiV7OxKI0_FV7y7bbz68a-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16838$r8$lambda$M7oLqiV7OxKI0_FV7y7bbz68as(int[] iArr, boolean[] zArr, androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, kotlin.jvm.functions.Function0 function0, boolean z) {
        int i = iArr[0];
        if (i > 0) {
            if (!z) {
                zArr[0] = false;
            }
            int i2 = i - 1;
            iArr[0] = i2;
            if (i2 == 0 && zArr[0]) {
                getHighResolutionOutputSizeshNQ4ISI(snapshotStateMap, function1, signUpWithGoogleStepComponentConfig, function0);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aW0jE7DK9XqDBYOBxRsWicfkvpk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-991790364);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-991790364, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentPreview (SignUpWithGoogleStepScreenContent.kt:248)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-step"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig[]{new com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-google-account"), com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16627constructorimpl("john.doe@gmail.com"), com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.ProfilePictureUrl.m17080constructorimpl("https://lh3.googleusercontent.com/a/default-user"), (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-name-input"), com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.PRIMARY_USER, true, new com.paypal.oslo.core.i18n.domain.model.PersonName(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl("John"), null, com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl("Doe"), null, 10, null), (kotlin.jvm.internal.DefaultConstructorMarker) null)}), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.m16839$r8$lambda$dBIHn2kXubrip6m9IfJHh1Xqc4((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, null, 6, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            SignUpWithGoogleStepScreenContent(signUpWithGoogleStepComponentConfig, function1, function0, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId(), null, null, Camera2StreamConfigurationMap, startRestartGroup, 25008, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.$r8$lambda$aW0jE7DK9XqDBYOBxRsWicfkvpk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dBIHn2kXubrip6m9-IfJHh1Xqc4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16839$r8$lambda$dBIHn2kXubrip6m9IfJHh1Xqc4(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$voQv5dP1EW6lydFLI_9KsrfrLY4(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        objectRef.element = function0;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wkzxvzTk0GoosNiUxqm_NIY0Peg(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignUpWithGoogleStepScreenContent(signUpWithGoogleStepComponentConfig, function1, function0, topBarConfig, function02, intentId, modifier, str, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
