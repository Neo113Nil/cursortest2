package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b28\b\u0002\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0018\u001aJ\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0001¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"PrivacyBanner", "", "bannerState", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "onDismiss", "Lkotlin/Function0;", "testTagPrefix", "", "modifier", "Landroidx/compose/ui/Modifier;", "dismissible", "", "onLinkClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "text", "tag", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrivacyErrorBanner", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrivacySuccessToast", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Success;", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Success;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BannerAutoDismissTimeoutMillis", "", "PrivacyToastHost", "banner", "content", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PrivacyBannerStateKt {
    public static final long BannerAutoDismissTimeoutMillis = 7000;

    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrivacyBanner(final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        boolean z4;
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig bannerConfig;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyBannerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1774742541);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(privacyBannerState) : startRestartGroup.changedInstance(privacyBannerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function22 = function2;
                    i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function23 = function22;
                    } else {
                        androidx.compose.ui.Modifier modifier5 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 != 0 ? false : z2;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.m13510$r8$lambda$TC8NS4EbPqkQAKJs9vvWr1__Ok((java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                        } else {
                            function24 = function22;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1774742541, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBanner (PrivacyBannerState.kt:121)");
                        }
                        if (privacyBannerState instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success) {
                            z4 = true;
                            bannerConfig = new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig(com.paypal.pds.components.BannerStyle.Positive.INSTANCE, "success_banner", true, ((com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success) privacyBannerState).getLinkConfig());
                        } else {
                            z4 = true;
                            if (privacyBannerState instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) {
                                bannerConfig = new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig(com.paypal.pds.components.BannerStyle.Negative.INSTANCE, com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_ERROR_BANNER, false, ((com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) privacyBannerState).getLinkConfig());
                            } else {
                                if (!(privacyBannerState instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                bannerConfig = new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig(com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.feature.taptopay.ui.setup.verification.CardVerificationScreenKt.CardVerificationWarningBannerTestTag, false, ((com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning) privacyBannerState).getLinkConfig());
                            }
                        }
                        if (bannerConfig.Camera2StreamConfigurationMap) {
                            startRestartGroup.startReplaceGroup(-306607346);
                            if ((i3 & 112) != 32) {
                                z4 = false;
                            }
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$PrivacyBanner$2$1(function0, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(privacyBannerState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3 & 14);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-306483377);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String str2 = bannerConfig.getHighSpeedVideoFpsRangesFor;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("_");
                        sb.append(str2);
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier5, sb.toString()), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(privacyBannerState.getMessageResId(), startRestartGroup, 0);
                        if (bannerConfig.getHighResolutionOutputSizeshNQ4ISI != null) {
                            startRestartGroup.startReplaceGroup(-306185715);
                            java.lang.Object linkText = bannerConfig.getHighResolutionOutputSizeshNQ4ISI.getLinkText();
                            boolean changed = startRestartGroup.changed(stringResource);
                            boolean changed2 = startRestartGroup.changed(linkText);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((changed2 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = com.paypal.pds.core.RichTextKt.toRichText(stringResource, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(bannerConfig.getHighResolutionOutputSizeshNQ4ISI.getLinkText(), bannerConfig.getHighResolutionOutputSizeshNQ4ISI.getTag())));
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue3;
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-305914589);
                                modifier4 = modifier5;
                                com.paypal.pds.components.BannerKt.Banner(m1710paddingqDBjuR0$default, bannerConfig.getHighSpeedVideoSizes, (com.paypal.pds.core.RichText) null, richText, com.paypal.pds.components.BannerTrailingElement.Close, function24, function0, startRestartGroup, (458752 & i3) | 24576 | ((i3 << 15) & 3670016), 4);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                modifier4 = modifier5;
                                startRestartGroup.startReplaceGroup(-305590391);
                                com.paypal.pds.components.BannerKt.Banner(m1710paddingqDBjuR0$default, bannerConfig.getHighSpeedVideoSizes, (com.paypal.pds.core.RichText) null, richText, (com.paypal.pds.components.BannerTrailingElement) null, function24, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, i3 & 458752, 84);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                        } else {
                            modifier4 = modifier5;
                            startRestartGroup.startReplaceGroup(-305363874);
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-305330177);
                                com.paypal.pds.components.BannerKt.Banner(m1710paddingqDBjuR0$default, bannerConfig.getHighSpeedVideoSizes, stringResource, (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.Close, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function0, startRestartGroup, ((i3 << 15) & 3670016) | 24576, 40);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-305065499);
                                com.paypal.pds.components.BannerKt.Banner(m1710paddingqDBjuR0$default, bannerConfig.getHighSpeedVideoSizes, stringResource, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 120);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z5;
                        function23 = function24;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.m13509$r8$lambda$RcVNeK9HFKgeqeGZ4A4zXX0Gec(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.this, function0, str, modifier3, z3, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function22 = function2;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function22 = function2;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function22 = function2;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrivacyErrorBanner(final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1365973912);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(error) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1365973912, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyErrorBanner (PrivacyBannerState.kt:216)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(error.getMessageResId(), startRestartGroup, 0);
                com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("_error_banner");
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier3, sb.toString()), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.m13507$r8$lambda$G2_k_Q_AkEySXVItup5a5Sbvc((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), negative, stringResource, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.$r8$lambda$4hZt7I9WzhVzJnsqXv3dQ6oMXvc(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error.this, str, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1414155491);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1414155491, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacySuccessToast (PrivacyBannerState.kt:246)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(success.getMessageResId(), startRestartGroup, 0);
                com.paypal.pds.core.Icon.CheckCircleFill checkCircleFill = com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("_success_toast");
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier3, sb.toString()), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.m13511$r8$lambda$pEVPvV0EYdL_czx8huxSL4bU((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                com.paypal.pds.core.Icon.CheckCircleFill checkCircleFill2 = checkCircleFill;
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.$r8$lambda$gHcj2oAYg6RLi8YoHbMtE756JKs(kotlin.jvm.functions.Function0.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ToastKt.Toast(stringResource, semantics$default, checkCircleFill2, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 384, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.m13508$r8$lambda$LclR3U3aLPzyOk74ExgfCIBsOg(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success.this, function0, str, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrivacyToastHost(final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1436637081);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(privacyBannerState) : startRestartGroup.changedInstance(privacyBannerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1436637081, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToastHost (PrivacyBannerState.kt:289)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 12) & 14));
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success = privacyBannerState instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success ? (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success) privacyBannerState : null;
                if (success != null) {
                    startRestartGroup.startReplaceGroup(-1332261934);
                    getHighSpeedVideoFpsRanges(success, function0, str, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), startRestartGroup, i3 & 1008, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1332261935);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.$r8$lambda$MTmt7A53Ha2gkxbJM2ncIzWsGa0(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.this, function0, str, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4hZt7I9WzhVzJnsqXv3dQ6oMXvc(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PrivacyErrorBanner(error, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G2_k-_Q_AkEySXVItup5a5S-bvc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13507$r8$lambda$G2_k_Q_AkEySXVItup5a5Sbvc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LclR3U-3aLPzyOk74ExgfCIBsOg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13508$r8$lambda$LclR3U3aLPzyOk74ExgfCIBsOg(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(success, function0, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MTmt7A53Ha2gkxbJM2ncIzWsGa0(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PrivacyToastHost(privacyBannerState, function0, str, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RcVNeK9HFKgeqeGZ4A-4zXX0Gec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13509$r8$lambda$RcVNeK9HFKgeqeGZ4A4zXX0Gec(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PrivacyBanner(privacyBannerState, function0, str, modifier, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TC8NS4EbPqkQAKJs9vvWr1__-Ok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13510$r8$lambda$TC8NS4EbPqkQAKJs9vvWr1__Ok(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gHcj2oAYg6RLi8YoHbMtE756JKs(kotlin.jvm.functions.Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pEVPvV0EYd-L_czx8h-uxSL4-bU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13511$r8$lambda$pEVPvV0EYdL_czx8huxSL4bU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }
}
