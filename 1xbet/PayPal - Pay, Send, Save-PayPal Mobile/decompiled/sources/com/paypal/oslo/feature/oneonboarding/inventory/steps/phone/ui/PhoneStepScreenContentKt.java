package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0016H\u0001¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"PhoneStepScreenContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneStepComponentConfig;", "dialingCode", "", "phoneNumber", "phoneError", "onPhoneNumberChange", "Lkotlin/Function1;", "onValidatePhone", "Lkotlin/Function0;", "onPhoneNumberHintResult", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "onBack", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "contextualInfoMap", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneStepComponentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Ljava/util/Map;Landroidx/compose/runtime/Composer;III)V", "PreviewConfig", "PhoneStepScreenContentEmptyPreview", "(Landroidx/compose/runtime/Composer;I)V", "PhoneStepScreenContentWithNumberPreview", "PhoneStepScreenContentWithErrorPreview", "PhoneStepScreenContentWithContextualErrorBannerPreview", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneStepScreenContentKt {
    private static final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("phone-step-preview"), new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("phone-view-preview"), com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant.PRIMARY_USER, true, (com.paypal.oslo.feature.oneonboarding.api.domain.Phone) null, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final void PhoneStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult, kotlin.Unit> function12, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        final androidx.compose.ui.Modifier modifier3;
        final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map2;
        com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage;
        com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage2;
        java.lang.Object obj;
        int i6;
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-718441565);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(phoneStepComponentConfig) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(topBarConfig) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(intentId) ? 536870912 : 268435456;
        }
        int i7 = i4;
        int i8 = i3 & 1024;
        if (i8 != 0) {
            modifier2 = modifier;
            i5 = i2 | 6;
        } else {
            modifier2 = modifier;
            if ((i2 & 6) == 0) {
                i5 = i2 | (startRestartGroup.changed(modifier2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i9 = i3 & 2048;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(map) ? 32 : 16;
        }
        int i10 = i5;
        if (!startRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            map2 = map;
        } else {
            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> emptyMap = i9 != 0 ? kotlin.collections.MapsKt.emptyMap() : map;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-718441565, i7, i10, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContent (PhoneStepScreenContent.kt:104)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState rememberPhoneNumberHintLauncherState = com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.rememberPhoneNumberHintLauncherState(startRestartGroup, 0);
            java.lang.String mo16702getIdfHLlpbY = phoneStepComponentConfig.getPhoneView().mo16702getIdfHLlpbY();
            boolean changed = startRestartGroup.changed(emptyMap);
            boolean changed2 = startRestartGroup.changed(mo16702getIdfHLlpbY);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed2 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (java.util.List) emptyMap.get(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(phoneStepComponentConfig.getPhoneView().mo16702getIdfHLlpbY()));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            java.util.List list2 = (java.util.List) rememberedValue2;
            if (list2 == null) {
                startRestartGroup.startReplaceGroup(-1269546131);
                startRestartGroup.endReplaceGroup();
                contextualErrorMessage2 = null;
            } else {
                startRestartGroup.startReplaceGroup(-1269546130);
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        contextualErrorMessage = null;
                        break;
                    } else {
                        contextualErrorMessage = com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.toPhoneErrorMessage((com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) it.next(), startRestartGroup, 0);
                        if (contextualErrorMessage != null) {
                            break;
                        }
                    }
                }
                startRestartGroup.endReplaceGroup();
                contextualErrorMessage2 = contextualErrorMessage;
            }
            int i11 = i7 >> 15;
            java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map3 = emptyMap;
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.PhoneNumberHintEffect(rememberPhoneNumberHintLauncherState, function12, null, startRestartGroup, i11 & 112, 4);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$PhoneStepScreenContent$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$PhoneStepScreenContent$1$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            boolean changed3 = startRestartGroup.changed(intentId);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAnalyticsContexts(intentId);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            java.util.List list3 = (java.util.List) rememberedValue4;
            boolean changed4 = startRestartGroup.changed(contextualErrorMessage2);
            boolean changedInstance = startRestartGroup.changedInstance(intentId);
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$PhoneStepScreenContent$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changed4 || changedInstance) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                obj = null;
                rememberedValue5 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$PhoneStepScreenContent$2$1(contextualErrorMessage2, intentId, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                obj = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(contextualErrorMessage2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, obj))), list3);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            androidx.compose.ui.Modifier modifier4 = companion;
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
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.oneonboarding.api.testtags.PreOnboardingTestTags.PhoneEntry.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
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
            com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.OnboardingTopBar(topBarConfig, null, function02, null, startRestartGroup, ((i7 >> 21) & 14) | ((i7 >> 18) & 896), 10);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            if (contextualErrorMessage2 == null) {
                startRestartGroup.startReplaceGroup(-578146480);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-578146479);
                com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.m17141ContextualErrorBanner4WJoFQ(contextualErrorMessage2, intentId, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.oneonboarding.api.testtags.PreOnboardingTestTags.PhoneEntry.CONTEXTUAL_ERROR_BANNER), null, 0, startRestartGroup, (i7 >> 24) & 112, 24);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                startRestartGroup.endReplaceGroup();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_entry_title, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
            boolean z = (i7 & 7168) == 2048;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.pds.components.textinput.ValidationAlert invoke = str3 != null ? com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$sD6P5eJM5RJoTV_165hML3EH_0U(str3, (java.lang.String) obj2);
                    }
                }) : null;
                startRestartGroup.updateRememberedValue(invoke);
                rememberedValue6 = invoke;
            }
            com.paypal.pds.components.textinput.ValidationAlert validationAlert = (com.paypal.pds.components.textinput.ValidationAlert) rememberedValue6;
            if (validationAlert != null) {
                startRestartGroup.startReplaceGroup(1253716493);
                startRestartGroup.endReplaceGroup();
                list = kotlin.collections.CollectionsKt.listOf(validationAlert);
                i6 = 0;
            } else {
                startRestartGroup.startReplaceGroup(1253718491);
                i6 = 0;
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.pds.components.textinput.ValidationAlert.HelpedText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_entry_helper, startRestartGroup, 0)));
                startRestartGroup.endReplaceGroup();
                list = listOf;
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_phone_entry_label, startRestartGroup, i6);
            java.lang.String concat = "+".concat(java.lang.String.valueOf(str));
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean isEditable = phoneStepComponentConfig.isEditable();
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), focusRequester), com.paypal.oslo.feature.oneonboarding.api.testtags.PreOnboardingTestTags.PhoneEntry.PHONE_INPUT);
            int i12 = (57344 & i7) == 16384 ? 1 : i6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (i12 != 0 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$dIvYEloLm6lEYKK1Oet2H55HqZU(kotlin.jvm.functions.Function1.this, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.pds.components.TextInputKt.TextInput(str2, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue7, testTag2, stringResource, concat, (java.lang.String) null, isEditable, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, ((i7 >> 6) & 14) | 100663296, 0, 114336);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_next_button_label, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getITEM_CONTINUE()), com.paypal.oslo.feature.oneonboarding.api.testtags.PreOnboardingTestTags.PhoneEntry.NEXT_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, (i11 & 14) | 1769472, 408);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            map2 = map3;
            modifier3 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$c53ACHS9HxsTnWh5eahVoYWidN0(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig.this, str, str2, str3, function1, function0, function12, topBarConfig, function02, intentId, modifier3, map2, i, i2, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0Tjwubt6Y-HHh-8QVY56c7zJo48, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16801$r8$lambda$0Tjwubt6YHHh8QVY56c7zJo48(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BPNGBYvzMQ3Vx-1gpQVk-FeybVw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16802$r8$lambda$BPNGBYvzMQ3Vx1gpQVkFeybVw(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-356136220);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-356136220, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentWithNumberPreview (PhoneStepScreenContent.kt:271)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig = getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(null, null, null, 7, null);
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId previewAccountCreationIntentId = com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$FIrfyqA47sBVEq1QZJBDGWU2xTk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda10
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
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$CORoHjxw9XzHLmZVz47KIslJqkw((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            composer2 = startRestartGroup;
            PhoneStepScreenContent(phoneStepComponentConfig, "1", "(415) 555-1234", null, function1, function0, function12, topBarConfig, function02, previewAccountCreationIntentId, null, emptyMap, startRestartGroup, 102460848, 48, 1024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16802$r8$lambda$BPNGBYvzMQ3Vx1gpQVkFeybVw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CORoHjxw9XzHLmZVz47KIslJqkw(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult phoneNumberHintResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberHintResult, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EcyoJPMiziO2nJJQDkuFvjIt9H8(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(587981363);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(587981363, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentWithErrorPreview (PhoneStepScreenContent.kt:291)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig = getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(null, null, null, 7, null);
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId previewAccountCreationIntentId = com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16807$r8$lambda$tkTFqslySDLQqeNHBEW6BUdLQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda22
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
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$HN76mdlvlO9hkzDDBSYZJ792cMc((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            composer2 = startRestartGroup;
            PhoneStepScreenContent(phoneStepComponentConfig, "1", "123", "The phone number is too short", function1, function0, function12, topBarConfig, function02, previewAccountCreationIntentId, null, emptyMap, startRestartGroup, 102460848, 48, 1024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$EcyoJPMiziO2nJJQDkuFvjIt9H8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FIrfyqA47sBVEq1QZJBDGWU2xTk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HN76mdlvlO9hkzDDBSYZJ792cMc(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult phoneNumberHintResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberHintResult, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JBAd403ab9ITGWVCU9UyLYkuXFc(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult phoneNumberHintResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberHintResult, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kg9l4T0EKplnl-Nc1ZMpo95ZYiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16803$r8$lambda$Kg9l4T0EKplnlNc1ZMpo95ZYiQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1371690392);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1371690392, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentWithContextualErrorBannerPreview (PhoneStepScreenContent.kt:311)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig = getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(null, null, null, 7, null);
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(phoneStepComponentConfig.getPhoneView().mo16702getIdfHLlpbY()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(phoneStepComponentConfig.getPhoneView().mo16702getIdfHLlpbY(), com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateFail, null, 4, null))));
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId previewAccountCreationIntentId = com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16801$r8$lambda$0Tjwubt6YHHh8QVY56c7zJo48((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda5
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
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$VgUOEGfDxzsFLFjwdpU4poVYOS8((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            composer2 = startRestartGroup;
            PhoneStepScreenContent(phoneStepComponentConfig, "1", "", null, function1, function0, function12, topBarConfig, function02, previewAccountCreationIntentId, null, mapOf, startRestartGroup, 102460848, 0, 1024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16803$r8$lambda$Kg9l4T0EKplnlNc1ZMpo95ZYiQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R7PF0Q-1wHjqgrh1KB3pHXLMOl0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16805$r8$lambda$R7PF0Q1wHjqgrh1KB3pHXLMOl0(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1236533992);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1236533992, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentEmptyPreview (PhoneStepScreenContent.kt:251)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig = getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(null, null, null, 7, null);
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId previewAccountCreationIntentId = com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16806$r8$lambda$Z7UscAbzNJGulifJX2HdQq9BUw((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda17
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
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.$r8$lambda$JBAd403ab9ITGWVCU9UyLYkuXFc((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            composer2 = startRestartGroup;
            PhoneStepScreenContent(phoneStepComponentConfig, "1", "", null, function1, function0, function12, topBarConfig, function02, previewAccountCreationIntentId, null, emptyMap, startRestartGroup, 102460848, 48, 1024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepScreenContentKt.m16805$r8$lambda$R7PF0Q1wHjqgrh1KB3pHXLMOl0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VgUOEGfDxzsFLFjwdpU4poVYOS8(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult phoneNumberHintResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberHintResult, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z-7UscAbzNJGulifJX2HdQq9BUw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16806$r8$lambda$Z7UscAbzNJGulifJX2HdQq9BUw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c53ACHS9HxsTnWh5eahVoYWidN0(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig phoneStepComponentConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, java.util.Map map, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PhoneStepScreenContent(phoneStepComponentConfig, str, str2, str3, function1, function0, function12, topBarConfig, function02, intentId, modifier, map, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dIvYEloLm6lEYKK1Oet2H55HqZU(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        function1.invoke(sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$sD6P5eJM5RJoTV_165hML3EH_0U(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$tkTF-qslySDLQqeNHBEW6BUdL-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16807$r8$lambda$tkTFqslySDLQqeNHBEW6BUdLQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
