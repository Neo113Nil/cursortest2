package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"TestTagSuccessScreenContainer", "", "TestTagSuccessScreenIconContainer", "TestTagSuccessScreenMessage", "TestTagSuccessScreenDescription", "TestTagSuccessScreenButton", "SuccessScreen", "", "message", "buttonText", "onButtonClick", "Lkotlin/Function0;", "icon", "Lcom/paypal/pds/core/Icon;", "modifier", "Landroidx/compose/ui/Modifier;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "iconContentDescription", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "SuccessScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuccessScreenKt {
    public static final java.lang.String TestTagSuccessScreenButton = "TestTagSuccessScreenButton";
    public static final java.lang.String TestTagSuccessScreenContainer = "TestTagSuccessScreenRoot";
    public static final java.lang.String TestTagSuccessScreenDescription = "TestTagSuccessScreenDescription";
    public static final java.lang.String TestTagSuccessScreenIconContainer = "TestTagSuccessScreenIconContainer";
    public static final java.lang.String TestTagSuccessScreenMessage = "TestTagSuccessScreenMessage";

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0424  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuccessScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, java.lang.String str3, java.lang.String str4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final java.lang.String str5;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str6;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        java.lang.String str8;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(971569391);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(str3) ? 131072 : 65536;
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) == 0) {
                        str5 = str4;
                        if (startRestartGroup.changed(str5)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    } else {
                        str5 = str4;
                    }
                    i6 = 524288;
                    i3 |= i6;
                } else {
                    str5 = str4;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        str8 = str3;
                        i5 = i3;
                        modifier4 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str9 = i4 != 0 ? null : str3;
                        if ((i2 & 64) != 0) {
                            i5 = i3 & (-3670017);
                            modifier4 = companion;
                            str8 = str9;
                            str5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_success, startRestartGroup, 0);
                        } else {
                            i5 = i3;
                            modifier4 = companion;
                            str8 = str9;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(971569391, i5, -1, "com.paypal.oslo.feature.wallet.common.ui.SuccessScreen (SuccessScreen.kt:95)");
                    }
                    boolean z = (i5 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt.$r8$lambda$_C31rS5iw6cdxbw8E7tojc5fn3Q(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 0);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16())), "TestTagSuccessScreenRoot");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.AvatarSource.Icon icon2 = new com.paypal.pds.components.AvatarSource.Icon(icon);
                    com.paypal.pds.components.AvatarSize.Large large = com.paypal.pds.components.AvatarSize.Large.INSTANCE;
                    com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE);
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    boolean z2 = (((3670016 & i5) ^ 1572864) > 1048576 && startRestartGroup.changed(str5)) || (i5 & 1572864) == 1048576;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt.$r8$lambda$hnc__tUoqXbWVVJfNb6nPP3qFzA(str5, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    int i8 = i5;
                    java.lang.String str10 = str5;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    com.paypal.pds.components.AvatarKt.Avatar(icon2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing48(), 7, null), "TestTagSuccessScreenIconContainer"), large, custom, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 48);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), "TestTagSuccessScreenMessage"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, (i8 & 14) | 384, 6, 1000);
                    if (str8 == null) {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1883998503);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1883998504);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str8, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), "TestTagSuccessScreenDescription"), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 0, 6, 1004);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        composer2.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    composer2.endNode();
                    com.paypal.pds.components.ButtonKt.Button(function0, str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "TestTagSuccessScreenButton"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i8 >> 6) & 14) | 1769856 | (i8 & 112), 408);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str6 = str8;
                    str7 = str10;
                    modifier3 = modifier5;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    str6 = str3;
                    modifier3 = modifier2;
                    str7 = str5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt.m21214$r8$lambda$1m9Bsvy5FMWiujmG5oPfzNewec(str, str2, function0, icon, modifier3, str6, str7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void SuccessScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-658002783);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-658002783, i, -1, "com.paypal.oslo.feature.wallet.common.ui.SuccessScreenPreview (SuccessScreen.kt:167)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SuccessScreen("Your $10\nis available now", "Done", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.Check.INSTANCE, null, "For transfers over $1,000, the full amount will be available in 3 to 5 days.", "Success checkmark", startRestartGroup, 1772982, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.SuccessScreenKt.m21215$r8$lambda$dlLriKh42sfzij7hWcyLmmeaUE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1m9Bsvy5FMWiujmG5oP-fzNewec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21214$r8$lambda$1m9Bsvy5FMWiujmG5oPfzNewec(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, java.lang.String str3, java.lang.String str4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SuccessScreen(str, str2, function0, icon, modifier, str3, str4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_C31rS5iw6cdxbw8E7tojc5fn3Q(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dlLriKh42sfzij7hWcyL-mmeaUE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21215$r8$lambda$dlLriKh42sfzij7hWcyLmmeaUE(int i, androidx.compose.runtime.Composer composer, int i2) {
        SuccessScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hnc__tUoqXbWVVJfNb6nPP3qFzA(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
