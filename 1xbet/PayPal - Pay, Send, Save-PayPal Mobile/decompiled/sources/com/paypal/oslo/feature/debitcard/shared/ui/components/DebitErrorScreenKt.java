package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"DebitErrorScreen", "", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "onAction", "Lkotlin/Function0;", "onDismiss", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "modifier", "Landroidx/compose/ui/Modifier;", "showCloseIcon", "", "retryCount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorFlowType;", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorFlowType;Landroidx/compose/runtime/Composer;II)V", "getEffectiveErrorType", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorFlowType;)Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "previewUserIntent", "RecoverableErrorPreview", "(Landroidx/compose/runtime/Composer;I)V", "RetriesExhaustedPreview", "NoNetworkErrorPreview", "FatalErrorPreview", "ContactCustomerErrorPreview", "InContextRecoverableErrorPreview", "InContextNoNetworkErrorPreview", "InContextFatalErrorPreview", "InContextContactCustomerErrorPreview", "InContextIneligibleErrorPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorScreenKt {
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_CONSUMER_DEBIT_CARD, "debit_card", "error");

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitErrorScreen(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, boolean z, java.lang.Integer num, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        java.lang.Integer num2;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z3;
        final java.lang.Integer num3;
        final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        java.lang.Integer num4;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType3;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis;
        final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig debitErrorConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(198317718);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitErrorType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    num2 = num;
                } else {
                    num2 = num;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(num2) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(debitErrorFlowType == null ? -1 : debitErrorFlowType.ordinal()) ? 8388608 : 4194304;
                }
                i7 = i3;
                if (!startRestartGroup.shouldExecute((4793491 & i7) != 4793490, i7 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z2;
                    num3 = num2;
                    debitErrorFlowType2 = debitErrorFlowType;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    boolean z4 = i4 != 0 ? true : z2;
                    if (i5 != 0) {
                        num2 = null;
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType4 = i6 != 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.DEFAULT : debitErrorFlowType;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(198317718, i7, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreen (DebitErrorScreen.kt:89)");
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig config = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.toConfig(getEffectiveErrorType(debitErrorType, num2, debitErrorFlowType4), debitErrorFlowType4);
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.pds.core.ModifierExtensionsKt.background(companion, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i7 >> 12) & 14) | 48, 2), kotlin.collections.CollectionsKt.listOf(userIntentContext)), com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getERROR_SCREEN());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, component);
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
                    if (z4) {
                        startRestartGroup.startReplaceGroup(2062156305);
                        i8 = i7;
                        num4 = num2;
                        debitErrorFlowType3 = debitErrorFlowType4;
                        com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.XMark.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_close, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getCLOSE_BUTTON()), com.paypal.pds.core.ConstantsKt.getSize24()), androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), null, null, false, null, null, function02, startRestartGroup, (i7 << 12) & 3670016, 31), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_ERROR_CLOSE_ICON), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 24582, 8);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        i8 = i7;
                        num4 = num2;
                        debitErrorFlowType3 = debitErrorFlowType4;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(2062680050);
                        composer2.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(config.getTitle(), composer2, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(config.getSubtitle(), composer2, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(config.getButtonText(), composer2, 0);
                    androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.actionButtonItem(config));
                    com.paypal.pds.core.Icon icon = config.getIcon();
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType5 = debitErrorFlowType3;
                    if (debitErrorFlowType5 == com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW && debitErrorType != com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK) {
                        debitErrorConfig = config;
                        avatarEmphasis = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
                    } else {
                        avatarEmphasis = com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
                        debitErrorConfig = config;
                    }
                    boolean changed = composer2.changed(debitErrorConfig);
                    int i10 = i8;
                    boolean z5 = (i10 & 896) == 256;
                    boolean changedInstance = composer2.changedInstance(context);
                    boolean z6 = (i10 & 112) == 32;
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if ((z6 | changed | z5 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$s4E53_2MYbDKfY78jOundoZA3lI(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.this, function02, context, function0);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.EmptyStateKt.EmptyState(icon, item, avatarEmphasis, stringResource, stringResource2, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue, composer2, 0, 0);
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    debitErrorFlowType2 = debitErrorFlowType5;
                    z3 = z4;
                    num3 = num4;
                    modifier2 = companion;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$3e93T1onI4Z9bwzbO3CyDrmZBQY(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, function0, function02, userIntentContext, modifier2, z3, num3, debitErrorFlowType2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((4793491 & i7) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((4793491 & i7) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getEffectiveErrorType$default(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.Integer num, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.DEFAULT;
        }
        return getEffectiveErrorType(debitErrorType, num, debitErrorFlowType);
    }

    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getEffectiveErrorType(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.Integer num, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorFlowType, "");
        return (num == null || num.intValue() < com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.toConfig(debitErrorType, debitErrorFlowType).getMaxRetriesAllowed() || debitErrorType != com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE) ? debitErrorType : com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3e93T1onI4Z9bwzbO3CyDrmZBQY(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.ui.Modifier modifier, boolean z, java.lang.Integer num, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitErrorScreen(debitErrorType, function0, function02, userIntentContext, modifier, z, num, debitErrorFlowType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3lBJNPCvAlbzck9dqT5ZOGddqcg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(256228320);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(256228320, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.InContextFatalErrorPreview (DebitErrorScreen.kt:277)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, null, debitErrorFlowType, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 12583350, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$3lBJNPCvAlbzck9dqT5ZOGddqcg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6P8-ICaoBpQ4JGU6VxI53wz2EB0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14614$r8$lambda$6P8ICaoBpQ4JGU6VxI53wz2EB0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-382183153);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-382183153, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.RetriesExhaustedPreview (DebitErrorScreen.kt:199)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, 2, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 1573302, 176);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.m14614$r8$lambda$6P8ICaoBpQ4JGU6VxI53wz2EB0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7OfGxN5cvuhNHzmvz1aQ3xXLj5s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(978423625);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(978423625, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.InContextNoNetworkErrorPreview (DebitErrorScreen.kt:262)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, null, debitErrorFlowType, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 12583350, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$7OfGxN5cvuhNHzmvz1aQ3xXLj5s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7gDAPW80D0upYQ2KHhhqpBh5z4c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1520703770);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1520703770, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.InContextRecoverableErrorPreview (DebitErrorScreen.kt:247)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, null, debitErrorFlowType, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 12583350, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$7gDAPW80D0upYQ2KHhhqpBh5z4c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EqRFCQLCuGtel2nk3B7UtfIgU_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1319198040);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1319198040, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.RecoverableErrorPreview (DebitErrorScreen.kt:185)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, getHighSpeedVideoFpsRangesFor, null, false, null, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 438, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$EqRFCQLCuGtel2nk3B7UtfIgU_U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I15-k8cS9ipnjPIEqRc-BxIQDeE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14617$r8$lambda$I15k8cS9ipnjPIEqRcBxIQDeE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(899490903);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(899490903, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.NoNetworkErrorPreview (DebitErrorScreen.kt:211)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, getHighSpeedVideoFpsRangesFor, null, false, null, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 438, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.m14617$r8$lambda$I15k8cS9ipnjPIEqRcBxIQDeE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rf2z73FjCgjGqGGet4TgBQfs3-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14618$r8$lambda$Rf2z73FjCgjGqGGet4TgBQfs3w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2133719058);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2133719058, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.FatalErrorPreview (DebitErrorScreen.kt:222)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, getHighSpeedVideoFpsRangesFor, null, false, null, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 438, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.m14618$r8$lambda$Rf2z73FjCgjGqGGet4TgBQfs3w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ba-u0tRMBUXfM0VXwVOSUm3VaU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14619$r8$lambda$bau0tRMBUXfM0VXwVOSUm3VaU4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1035052666);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1035052666, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.InContextContactCustomerErrorPreview (DebitErrorScreen.kt:292)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, null, debitErrorFlowType, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 12583350, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.m14619$r8$lambda$bau0tRMBUXfM0VXwVOSUm3VaU4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$heRfrOSGeX9BPinvCmsjYnrvBkA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1544558672);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1544558672, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.InContextIneligibleErrorPreview (DebitErrorScreen.kt:307)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, false, null, debitErrorFlowType, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 12583350, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$heRfrOSGeX9BPinvCmsjYnrvBkA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m6sCzmdsv0QVPF0gjuz1JjOhFEs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(969980168);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(969980168, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.ContactCustomerErrorPreview (DebitErrorScreen.kt:233)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, getHighSpeedVideoFpsRangesFor, null, false, null, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 438, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.$r8$lambda$m6sCzmdsv0QVPF0gjuz1JjOhFEs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s4E53_2MYbDKfY78jOundoZA3lI(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig debitErrorConfig, kotlin.jvm.functions.Function0 function0, android.content.Context context, kotlin.jvm.functions.Function0 function02) {
        if ((debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible)) {
            function0.invoke();
        } else if ((debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService)) {
            com.paypal.oslo.feature.debitcard.shared.ui.utils.UrlUtils.INSTANCE.launchUrlInBrowser$debit_card_prodRelease("https://www.paypal.com/us/smarthelp/contact-us", context);
        } else {
            if (!(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable) && !(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork) && !(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable) && !(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
