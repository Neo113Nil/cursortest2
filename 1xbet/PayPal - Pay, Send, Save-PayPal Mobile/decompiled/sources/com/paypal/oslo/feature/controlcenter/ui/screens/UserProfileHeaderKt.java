package com.paypal.oslo.feature.controlcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001aI\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002\u001a\f\u0010\u0018\u001a\u00020\u000f*\u00020\u000fH\u0002\u001a\f\u0010\u0019\u001a\u00020\u000f*\u00020\u0003H\u0002\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"UserProfileHeader", "", "userProfile", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "showChevron", "", "onAvatarClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UserProfileAvatar", "profilePhotoUrl", "", "fullName", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "onClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "buildInitials", "whitespaceRegex", "Lkotlin/text/Regex;", "toInitials", "getDisplayName", "UserProfileSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "control-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserProfileHeaderKt {
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("\\s+");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005b  */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserProfileHeader(final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r15;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-61930777);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(userProfile) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        z3 = z2;
                        function03 = function02;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 != 0 ? false : z2;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i5 != 0 ? null : function02;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-61930777, i3, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeader (UserProfileHeader.kt:81)");
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(modifier3, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i3 >> 6) & 14) | 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null), "user_profile_container_tag");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        if (z4) {
                            startRestartGroup.startReplaceGroup(-521887356);
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            boolean z5 = (i3 & 112) == 32;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.$r8$lambda$XDwfvp9w6qL5UtZrhkc92hEjD_0(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.$r8$lambda$f3jwl5XzzQbaK1nNU22oz4N6WlY((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            r15 = 0;
                            companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            r15 = 0;
                            startRestartGroup.startReplaceGroup(-521400129);
                            startRestartGroup.endReplaceGroup();
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(weight$default.then(companion), "user_profile_dropdown_container_tag");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r15));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        int i7 = r15;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(Camera2StreamConfigurationMap(userProfile), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, r15), "user_profile_name_tag"), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 12779520, 6, 860);
                        if (z4) {
                            startRestartGroup.startReplaceGroup(1526691786);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), "user_profile_dropdown_spacer_tag"), startRestartGroup, i7);
                            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronDown.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_switch_account_chevron, startRestartGroup, i7), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "user_profile_chevron_icon_tag"), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, startRestartGroup, 28038, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1527315475);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), "profile_spacer_tag"), startRestartGroup, i7);
                        UserProfileAvatar(userProfile.getProfilePhotoUrl(), Camera2StreamConfigurationMap(userProfile), userProfile.getGivenName(), userProfile.getSurname(), function04, startRestartGroup, i3 & 57344, 0);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z3 = z4;
                        function03 = function04;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.$r8$lambda$4tH9UGZVhIP5ZPPU_f3sO2QLAhw(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile.this, appNavigator, modifier4, z3, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserProfileAvatar(final java.lang.String str, final java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str5;
        int i4;
        java.lang.String str6;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str7;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.AvatarSource.Image initials;
        java.lang.String str8;
        java.lang.String obj;
        java.lang.Character firstOrNull;
        java.lang.String obj2;
        java.lang.Character firstOrNull2;
        java.lang.String str9 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1509055452);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str5 = str3;
            i3 |= startRestartGroup.changed(str5) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str6 = str4;
                i3 |= startRestartGroup.changed(str6) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        str7 = str5;
                        function03 = function02;
                    } else {
                        java.lang.String str10 = i6 != 0 ? null : str5;
                        java.lang.String str11 = i4 != 0 ? null : str6;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i5 != 0 ? null : function02;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1509055452, i3, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileAvatar (UserProfileHeader.kt:185)");
                        }
                        com.paypal.oslo.core.commonui.components.ConstraintsSizeResolver rememberConstraintsSizeResolver = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberConstraintsSizeResolver(startRestartGroup, 0);
                        java.lang.String str12 = str;
                        if (str12 != null && str12.length() != 0) {
                            startRestartGroup.startReplaceGroup(-847826823);
                            com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).size(rememberConstraintsSizeResolver).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null);
                            startRestartGroup.endReplaceGroup();
                            initials = image;
                            str8 = "profile_avatar_tag";
                        } else {
                            startRestartGroup.startReplaceGroup(-847499711);
                            startRestartGroup.endReplaceGroup();
                            java.lang.String valueOf = (str10 == null || (obj2 = kotlin.text.StringsKt.trim(str10).toString()) == null || (firstOrNull2 = kotlin.text.StringsKt.firstOrNull(obj2)) == null) ? null : java.lang.String.valueOf(java.lang.Character.toTitleCase(firstOrNull2.charValue()));
                            if (valueOf == null) {
                                valueOf = "";
                            }
                            java.lang.String valueOf2 = (str11 == null || (obj = kotlin.text.StringsKt.trim(str11).toString()) == null || (firstOrNull = kotlin.text.StringsKt.firstOrNull(obj)) == null) ? null : java.lang.String.valueOf(java.lang.Character.toTitleCase(firstOrNull.charValue()));
                            if (valueOf2 == null) {
                                valueOf2 = "";
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(valueOf);
                            sb.append(valueOf2);
                            java.lang.String obj3 = sb.toString();
                            if (obj3.length() == 0) {
                                java.lang.String obj4 = kotlin.text.StringsKt.trim(str2).toString();
                                if (obj4.length() != 0) {
                                    java.util.List<java.lang.String> split = Camera2StreamConfigurationMap.split(obj4, 0);
                                    if (split.size() == 1) {
                                        str9 = java.lang.String.valueOf(java.lang.Character.toTitleCase(kotlin.text.StringsKt.first((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) split))));
                                    } else {
                                        java.lang.Character[] chArr = new java.lang.Character[2];
                                        java.lang.String str13 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) split);
                                        chArr[0] = str13 != null ? kotlin.text.StringsKt.firstOrNull(str13) : null;
                                        java.lang.String str14 = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) split);
                                        chArr[1] = str14 != null ? kotlin.text.StringsKt.firstOrNull(str14) : null;
                                        str9 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) chArr), "", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                                java.lang.CharSequence valueOf3;
                                                valueOf3 = java.lang.String.valueOf(java.lang.Character.toTitleCase(((java.lang.Character) obj5).charValue()));
                                                return valueOf3;
                                            }
                                        }, 30, null);
                                    }
                                }
                                obj3 = str9;
                            }
                            initials = new com.paypal.pds.components.AvatarSource.Initials(obj3);
                            str8 = "profile_avatar_initials_tag";
                        }
                        com.paypal.pds.components.AvatarKt.Avatar(initials, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()).then(rememberConstraintsSizeResolver), str8), null, null, null, function04, startRestartGroup, (i3 << 3) & 458752, 28);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str7 = str10;
                        str6 = str11;
                        function03 = function04;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final java.lang.String str15 = str6;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                                return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.m13729$r8$lambda$G2LUIJVXi8rVwRYQECAcw9ZGSg(str, str2, str7, str15, function03, i, i2, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str6 = str4;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str5 = str3;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str6 = str4;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile) {
        java.lang.String fullName = userProfile.getFullName();
        if (fullName == null) {
            return "User";
        }
        if (fullName.length() <= 0) {
            fullName = null;
        }
        return fullName != null ? fullName : "User";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4tH9UGZVhIP5ZPPU_f3sO2QLAhw(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UserProfileHeader(userProfile, appNavigator, modifier, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ZXdGL16PHLWc01F0dIkmnz0iMU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G2L-UIJVXi8rVwRYQECAcw9ZGSg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13729$r8$lambda$G2LUIJVXi8rVwRYQECAcw9ZGSg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UserProfileAvatar(str, str2, str3, str4, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QQsBTBLMe46lbHTz9xIOzrNm70Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-402311168);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-402311168, updateChangedFlags, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileSectionPreview (UserProfileHeader.kt:276)");
            }
            UserProfileHeader(new com.paypal.oslo.feature.controlcenter.domain.model.UserProfile("user123456", null, null, null, null, null, null, null, com.paypal.oslo.feature.controlcenter.domain.model.AccountType.PERSONAL, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), new com.paypal.oslo.core.navigation.result.NavResultManager()), null, false, null, startRestartGroup, 0, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.$r8$lambda$QQsBTBLMe46lbHTz9xIOzrNm70Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XDwfvp9w6qL5UtZrhkc92hEjD_0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileHeaderKt.$r8$lambda$6ZXdGL16PHLWc01F0dIkmnz0iMU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f3jwl5XzzQbaK1nNU22oz4N6WlY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, "Username and dropdown options");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }
}
