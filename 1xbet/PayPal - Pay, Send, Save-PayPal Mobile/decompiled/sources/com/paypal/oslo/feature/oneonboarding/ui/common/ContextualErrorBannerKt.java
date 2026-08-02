package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001aE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u0017\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010!¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"bannerStyleForIntent", "Lcom/paypal/pds/components/BannerStyle;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "ContextualErrorBannerIfVisible", "", "isBannerVisible", "", "contextualInfo", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLjava/util/List;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContextualErrorBanner", "message", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "liveRegionMode", "Landroidx/compose/ui/semantics/LiveRegionMode;", "ContextualErrorBanner-4-WJoFQ", "(Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;II)V", "ContextualFocusAndAnalyticsEffects", "screenId", "", "context", "Landroid/content/Context;", "titleFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "bannerFocusRequester", "(Ljava/util/List;ZLcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "ContextualErrorBannerNegativePreview", "(Landroidx/compose/runtime/Composer;I)V", "ContextualErrorBannerWarningPreview", "one-onboarding_prodRelease", "isFirstBannerEffect"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContextualErrorBannerKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualErrorBannerIfVisible(final boolean z, final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-419327204);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-419327204, i3, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerIfVisible (ContextualErrorBanner.kt:68)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                if (z) {
                    startRestartGroup.startReplaceGroup(753493589);
                    com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage errorMessage = (list == null || (contextualInfo = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) ? null : com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMapperKt.toErrorMessage(contextualInfo, context);
                    if (errorMessage != null) {
                        startRestartGroup.startReplaceGroup(1883464781);
                        m17141ContextualErrorBanner4WJoFQ(errorMessage, intentId, modifier3, function0, 0, startRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | (i3 & 7168), 16);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1883464780);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1883740774);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.$r8$lambda$YYon8b6mbiP_PaDxm0J11VooR8Y(z, list, intentId, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005a  */
    /* renamed from: ContextualErrorBanner-4-WJoFQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17141ContextualErrorBanner4WJoFQ(final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final int m7790getAssertive0phEisY;
        int i7;
        boolean z;
        java.lang.Object rememberedValue;
        com.paypal.pds.components.BannerStyle.Negative negative;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualErrorMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(332716186);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(contextualErrorMessage) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        if (startRestartGroup.changed(i6)) {
                            i8 = 16384;
                            i4 |= i8;
                        }
                    } else {
                        i6 = i;
                    }
                    i8 = 8192;
                    i4 |= i8;
                } else {
                    i6 = i;
                }
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        companion = modifier2;
                    } else {
                        companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            function02 = null;
                        }
                        if ((i3 & 16) != 0) {
                            m7790getAssertive0phEisY = androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7790getAssertive0phEisY();
                            i7 = i4 & (-57345);
                            function03 = function02;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(332716186, i7, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBanner (ContextualErrorBanner.kt:99)");
                            }
                            z = (((57344 & i7) ^ 24576) <= 16384 && startRestartGroup.changed(m7790getAssertive0phEisY)) || (i7 & 24576) == 16384;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.$r8$lambda$F8rf09zvNAvcfxEpTPZM03etxJQ(m7790getAssertive0phEisY, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                            if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
                                negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                            } else if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto)) {
                                negative = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
                            } else {
                                negative = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
                            }
                            int i10 = m7790getAssertive0phEisY;
                            com.paypal.pds.components.BannerKt.Banner(semantics$default, negative, contextualErrorMessage.getTitle(), contextualErrorMessage.getDescription(), (com.paypal.pds.components.BannerTrailingElement) null, function03, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, (i7 << 6) & 458752, 80);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            i6 = i10;
                        }
                    }
                    i7 = i4;
                    function03 = function02;
                    m7790getAssertive0phEisY = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (((57344 & i7) ^ 24576) <= 16384) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.$r8$lambda$F8rf09zvNAvcfxEpTPZM03etxJQ(m7790getAssertive0phEisY, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.ui.Modifier semantics$default2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                    if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle)) {
                    }
                    negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                    int i102 = m7790getAssertive0phEisY;
                    com.paypal.pds.components.BannerKt.Banner(semantics$default2, negative, contextualErrorMessage.getTitle(), contextualErrorMessage.getDescription(), (com.paypal.pds.components.BannerTrailingElement) null, function03, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, (i7 << 6) & 458752, 80);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i6 = i102;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function03 = function02;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final int i11 = i6;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.m17140$r8$lambda$SiQT0h5oPn4CcNgq99QzlBqQnA(com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage.this, intentId, modifier3, function03, i11, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i2 & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i2 & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ContextualFocusAndAnalyticsEffects(final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, final boolean z, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final java.lang.String str, final android.content.Context context, final androidx.compose.ui.focus.FocusRequester focusRequester, final androidx.compose.ui.focus.FocusRequester focusRequester2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.Unit unit;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(253314133);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(intentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester2) ? 1048576 : 524288;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(253314133, i5, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualFocusAndAnalyticsEffects (ContextualErrorBanner.kt:126)");
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            int i6 = i5 & 3670016;
            boolean z2 = i6 == 1048576;
            boolean z3 = (i5 & 458752) == 131072;
            com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | z2) || z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                unit = unit2;
                i4 = 2048;
                rememberedValue = new com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$1$1(list, context, focusRequester2, focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = i5;
                unit = unit2;
                i4 = 2048;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            int i7 = i3;
            boolean z4 = (i7 & 112) == 32;
            boolean changedInstance3 = startRestartGroup.changedInstance(list);
            boolean changedInstance4 = startRestartGroup.changedInstance(context);
            boolean z5 = i6 == 1048576;
            com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z4 | changedInstance3 | changedInstance4 | z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1(z, list, context, focusRequester2, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i7 >> 3) & 14);
            boolean changedInstance5 = startRestartGroup.changedInstance(list);
            boolean changedInstance6 = startRestartGroup.changedInstance(context);
            boolean changedInstance7 = startRestartGroup.changedInstance(intentId);
            boolean z6 = (i7 & 7168) == i4;
            com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changedInstance6 | changedInstance7 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1(list, context, intentId, str, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(list, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i7 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.$r8$lambda$vM9czziOBl54aHAXeoixnosocPg(list, z, intentId, str, context, focusRequester, focusRequester2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$6Bch0jWc_3VkzWnx-aFhMw6xRjI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17139$r8$lambda$6Bch0jWc_3VkzWnxaFhMw6xRjI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(399219152);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(399219152, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerNegativePreview (ContextualErrorBanner.kt:164)");
            }
            m17141ContextualErrorBanner4WJoFQ(new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage("This SSN is already linked to another account.", null, 2, null), new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(null, 1, null), null, null, 0, startRestartGroup, 0, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.m17139$r8$lambda$6Bch0jWc_3VkzWnxaFhMw6xRjI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F8rf09zvNAvcfxEpTPZM03etxJQ(int i, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HMYuFkgjA77PlTehCH5YrpGUSRo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1173760429);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1173760429, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerWarningPreview (ContextualErrorBanner.kt:176)");
            }
            m17141ContextualErrorBanner4WJoFQ(new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage("Couldn't confirm your info", "We weren't able to confirm your info. Please check and try again."), new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(null, 1, null), null, null, 0, startRestartGroup, 0, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.$r8$lambda$HMYuFkgjA77PlTehCH5YrpGUSRo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SiQT0h-5oPn4CcNgq99QzlBqQnA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17140$r8$lambda$SiQT0h5oPn4CcNgq99QzlBqQnA(com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m17141ContextualErrorBanner4WJoFQ(contextualErrorMessage, intentId, modifier, function0, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YYon8b6mbiP_PaDxm0J11VooR8Y(boolean z, java.util.List list, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContextualErrorBannerIfVisible(z, list, intentId, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vM9czziOBl54aHAXeoixnosocPg(java.util.List list, boolean z, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, android.content.Context context, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.focus.FocusRequester focusRequester2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ContextualFocusAndAnalyticsEffects(list, z, intentId, str, context, focusRequester, focusRequester2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
