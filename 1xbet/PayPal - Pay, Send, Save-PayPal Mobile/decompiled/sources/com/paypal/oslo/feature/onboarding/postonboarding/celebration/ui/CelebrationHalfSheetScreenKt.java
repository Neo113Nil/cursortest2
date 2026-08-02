package com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001am\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"CelebrationHalfSheetScreen", "", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/navigation/CelebrationHalfSheetDestination;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/navigation/CelebrationHalfSheetDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CelebrationHalfSheetContent", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "primaryButtonText", "imageUrl", "onPrimaryButtonClick", "Lkotlin/Function0;", "primaryButtonItem", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "closeButtonItem", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/runtime/Composer;II)V", "CelebrationHalfSheetScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CelebrationHalfSheetScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CelebrationHalfSheetScreen(final com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item dismiss_item;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(celebrationHalfSheetDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1027312888);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(celebrationHalfSheetDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
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
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1027312888, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreen (CelebrationHalfSheetScreen.kt:105)");
                }
                boolean changedInstance = startRestartGroup.changedInstance(postOnboardingNavigator);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.$r8$lambda$bzumqnXpb8mjrFwzLf6DrE1iMh0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent celebrationHalfSheetContent = com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationContentResolverKt.getCelebrationHalfSheetContent(celebrationHalfSheetDestination.getStep());
                com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig celebrationAnalyticsConfig = com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfigKt.getCelebrationAnalyticsConfig(celebrationHalfSheetDestination.getStep());
                if (celebrationHalfSheetContent != null) {
                    startRestartGroup.startReplaceGroup(1259420928);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(celebrationHalfSheetContent.getTitleRes(), startRestartGroup, 0);
                    java.lang.Integer descriptionRes = celebrationHalfSheetContent.getDescriptionRes();
                    if (descriptionRes == null) {
                        startRestartGroup.startReplaceGroup(1259528063);
                        startRestartGroup.endReplaceGroup();
                        stringResource = null;
                    } else {
                        startRestartGroup.startReplaceGroup(1259528064);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(descriptionRes.intValue(), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(celebrationHalfSheetContent.getButtonTextRes(), startRestartGroup, 0);
                    java.lang.String imageUrl = celebrationHalfSheetContent.getImageUrl();
                    com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item lets_go_item = com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getLETS_GO_ITEM();
                    if (celebrationAnalyticsConfig == null || (dismiss_item = celebrationAnalyticsConfig.getCloseButtonItem()) == null) {
                        dismiss_item = com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getDISMISS_ITEM();
                    }
                    CelebrationHalfSheetContent(stringResource2, stringResource, stringResource3, imageUrl, function0, modifier3, lets_go_item, dismiss_item, celebrationAnalyticsConfig != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, celebrationAnalyticsConfig.getFeature(), celebrationAnalyticsConfig.getAction()) : null, startRestartGroup, ((i3 << 9) & 458752) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable << 18) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable << 21) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 24), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1260231206);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changed = startRestartGroup.changed(function0);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$CelebrationHalfSheetScreen$3$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.$r8$lambda$7mJWlttucVv0j37f80D3qc5tWAo(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination.this, postOnboardingNavigator, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:137:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CelebrationHalfSheetContent(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item3;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item4;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        float f;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item5;
        int i7;
        java.lang.Object obj;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item6;
        androidx.compose.ui.Modifier item7;
        androidx.compose.ui.Modifier item8;
        androidx.compose.ui.Modifier context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(278803157);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            int i9 = 1572864;
            if (i4 == 0) {
                if ((i & 1572864) == 0) {
                    i9 = (i & 2097152) == 0 ? startRestartGroup.changed(item) : startRestartGroup.changedInstance(item) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                int i10 = 12582912;
                if (i5 == 0) {
                    if ((i & 12582912) == 0) {
                        i10 = (i & 16777216) == 0 ? startRestartGroup.changed(item2) : startRestartGroup.changedInstance(item2) ? 8388608 : 4194304;
                    }
                    i6 = i2 & 256;
                    int i11 = 100663296;
                    if (i6 == 0) {
                        if ((i & 100663296) == 0) {
                            i11 = (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 67108864 : 33554432;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            item3 = item;
                            item4 = item2;
                            userIntentContext2 = userIntentContext;
                        } else {
                            if (i8 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item9 = i4 != 0 ? null : item;
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item10 = i5 != 0 ? null : item2;
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext3 = i6 != 0 ? null : userIntentContext;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(278803157, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetContent (CelebrationHalfSheetScreen.kt:177)");
                            }
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.Celebration.SCREEN);
                            if (userIntentContext3 != null && (context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(testTag, kotlin.collections.CollectionsKt.listOf(userIntentContext3))) != null) {
                                testTag = context;
                            }
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item11 = item10;
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (str4 == null) {
                                startRestartGroup.startReplaceGroup(-486706149);
                                startRestartGroup.endReplaceGroup();
                                item5 = item11;
                                i7 = i3;
                                modifier3 = modifier2;
                                item6 = item9;
                                boxScopeInstance = boxScopeInstance2;
                                obj = null;
                                f = 0.0f;
                            } else {
                                startRestartGroup.startReplaceGroup(-486706148);
                                boxScopeInstance = boxScopeInstance2;
                                f = 0.0f;
                                item5 = item11;
                                i7 = i3;
                                obj = null;
                                modifier3 = modifier2;
                                item6 = item9;
                                com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str4, null, null, null, null, startRestartGroup, 0, 30), "", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), null, com.paypal.pds.components.ImageAspectRatio.Square, null, startRestartGroup, 200112, 80);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.$r8$lambda$57bOVrthv7tn8euKJIuEpYLCyX8((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item12 = item6;
                            float f2 = f;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, obj), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.DisplaySmall.INSTANCE, startRestartGroup, (i7 & 14) | 384, 6, 1000);
                            if (str2 == null) {
                                startRestartGroup.startReplaceGroup(-485663495);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-485663494);
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1000);
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            }
                            composer2 = startRestartGroup;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                            composer2.endNode();
                            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.Celebration.PRIMARY_BUTTON);
                            if (item12 != null && (item8 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(testTag2, item12)) != null) {
                                testTag2 = item8;
                            }
                            com.paypal.pds.components.ButtonKt.Button(function0, str3, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(testTag2, com.paypal.pds.core.ConstantsKt.getSpacing16()), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, composer2, ((i7 >> 12) & 14) | 1769472 | ((i7 >> 3) & 112), 408);
                            composer2.endNode();
                            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.Celebration.CLOSE_BUTTON);
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item13 = item5;
                            if (item13 != null && (item7 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(testTag3, item13)) != null) {
                                testTag3 = item7;
                            }
                            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(testTag3, com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, "Close celebration modal", null, false, false, composer2, ((i7 >> 9) & 112) | 224262, 448);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            item3 = item12;
                            item4 = item13;
                            userIntentContext2 = userIntentContext3;
                            modifier2 = modifier3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.$r8$lambda$QxJRdhG5E9VgWf4PxZ94IL7tXUg(str, str2, str3, str4, function0, modifier2, item3, item4, userIntentContext2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i3 |= i10;
                i6 = i2 & 256;
                int i112 = 100663296;
                if (i6 == 0) {
                }
                i3 |= i112;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i3 |= i9;
            i5 = i2 & 128;
            int i102 = 12582912;
            if (i5 == 0) {
            }
            i3 |= i102;
            i6 = i2 & 256;
            int i1122 = 100663296;
            if (i6 == 0) {
            }
            i3 |= i1122;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        int i92 = 1572864;
        if (i4 == 0) {
        }
        i3 |= i92;
        i5 = i2 & 128;
        int i1022 = 12582912;
        if (i5 == 0) {
        }
        i3 |= i1022;
        i6 = i2 & 256;
        int i11222 = 100663296;
        if (i6 == 0) {
        }
        i3 |= i11222;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$57bOVrthv7tn8euKJIuEpYLCyX8(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7mJWlttucVv0j37f80D3qc5tWAo(com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination celebrationHalfSheetDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CelebrationHalfSheetScreen(celebrationHalfSheetDestination, postOnboardingNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CnjWG4fktvhz1tqh9Az9c7uJj0c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2082507359);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2082507359, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenPreview (CelebrationHalfSheetScreen.kt:276)");
            }
            CelebrationHalfSheetScreen(new com.paypal.oslo.feature.onboarding.postonboarding.celebration.navigation.CelebrationHalfSheetDestination(new com.paypal.oslo.feature.onboarding.steps.nav.domain.Step(com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("POST_ONBOARDING"), com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16021constructorimpl("POST_ONBOARDING"), com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("CELEBRATION_HALF_SHEET"), kotlin.collections.SetsKt.emptySet(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataKeys.VARIATION, com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.P2P_INTENT_CELEBRATION)), null, 32, null)), new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator(new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null)), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.celebration.ui.CelebrationHalfSheetScreenKt.$r8$lambda$CnjWG4fktvhz1tqh9Az9c7uJj0c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QxJRdhG5E9VgWf4PxZ94IL7tXUg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CelebrationHalfSheetContent(str, str2, str3, str4, function0, modifier, item, item2, userIntentContext, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bzumqnXpb8mjrFwzLf6DrE1iMh0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        postOnboardingNavigator.navigateBack();
        return kotlin.Unit.INSTANCE;
    }
}
