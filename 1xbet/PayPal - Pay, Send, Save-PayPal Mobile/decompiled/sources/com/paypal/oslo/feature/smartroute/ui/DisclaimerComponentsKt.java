package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"CryptoTermsUrl", "", "PyusdCryptoTermsDisclaimer", "", "modifier", "Landroidx/compose/ui/Modifier;", "context", "Landroid/content/Context;", "(Landroidx/compose/ui/Modifier;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "AutoReloadDisclaimer", "autoReloadText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "smart-route_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DisclaimerComponentsKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PyusdCryptoTermsDisclaimer(androidx.compose.ui.Modifier modifier, android.content.Context context, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final android.content.Context context2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier modifier4;
        final android.content.Context context3;
        boolean changed;
        boolean changed2;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(221576646);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                context2 = context;
                if (startRestartGroup.changedInstance(context2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                context2 = context;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            context2 = context;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = modifier2;
            } else {
                companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    modifier4 = companion;
                    context3 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(221576646, i3, -1, "com.paypal.oslo.feature.smartroute.ui.PyusdCryptoTermsDisclaimer (DisclaimerComponents.kt:34)");
                    }
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_crypto_terms_disclaimer, startRestartGroup, 0);
                    java.lang.Object stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_crypto_terms_link_text, startRestartGroup, 0);
                    changed = startRestartGroup.changed(stringResource);
                    changed2 = startRestartGroup.changed(stringResource2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = com.paypal.pds.core.RichTextKt.toRichText(stringResource, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource2, "https://www.paypal.com/US/legalhub/paypal/cryptocurrencies-tnc?locale.x=en_US#cryptocurrencies-tnc-rewards")));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue;
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.smartroute.ui.DisclaimerTestTags.PYUSD_CRYPTO_TERMS_DISCLAIMER);
                    com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
                    changedInstance = startRestartGroup.changedInstance(context3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt.m19682$r8$lambda$aEjhzvyl1I2z9O89f8Z3VfeGE(context3, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    android.content.Context context4 = context3;
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall, null, composer2, 384, 48, 5112);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    context2 = context4;
                }
            }
            modifier4 = companion;
            context3 = context2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_crypto_terms_disclaimer, startRestartGroup, 0);
            java.lang.Object stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_crypto_terms_link_text, startRestartGroup, 0);
            changed = startRestartGroup.changed(stringResource3);
            changed2 = startRestartGroup.changed(stringResource22);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changed | changed2)) {
            }
            rememberedValue = com.paypal.pds.core.RichTextKt.toRichText(stringResource3, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource22, "https://www.paypal.com/US/legalhub/paypal/cryptocurrencies-tnc?locale.x=en_US#cryptocurrencies-tnc-rewards")));
            startRestartGroup.updateRememberedValue(rememberedValue);
            com.paypal.pds.core.RichText richText2 = (com.paypal.pds.core.RichText) rememberedValue;
            com.paypal.pds.core.Typography.BodySmall bodySmall2 = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase3 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.smartroute.ui.DisclaimerTestTags.PYUSD_CRYPTO_TERMS_DISCLAIMER);
            com.paypal.pds.core.Color.ContentBase contentBase22 = contentBase3;
            changedInstance = startRestartGroup.changedInstance(context3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt.m19682$r8$lambda$aEjhzvyl1I2z9O89f8Z3VfeGE(context3, (java.lang.String) obj, (java.lang.String) obj2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            android.content.Context context42 = context3;
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText2, testTag2, contentBase22, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall2, null, composer2, 384, 48, 5112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            context2 = context42;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt.m19681$r8$lambda$bPzz5FZ9nFN6KS0fvdmwDjD1ps(androidx.compose.ui.Modifier.this, context2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoReloadDisclaimer(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1696466095);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1696466095, i3, -1, "com.paypal.oslo.feature.smartroute.ui.AutoReloadDisclaimer (DisclaimerComponents.kt:70)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.smartroute.ui.DisclaimerTestTags.AUTO_RELOAD_DISCLAIMER), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.smartroute.ui.DisclaimerComponentsKt.$r8$lambda$byCmwnPcVS9cfZMpBGunokTp0TI(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-bPzz5FZ9nFN6KS0fvdmwDjD1ps, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19681$r8$lambda$bPzz5FZ9nFN6KS0fvdmwDjD1ps(androidx.compose.ui.Modifier modifier, android.content.Context context, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PyusdCryptoTermsDisclaimer(modifier, context, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aEjhzvyl-1I-2z9O89f8Z3VfeGE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19682$r8$lambda$aEjhzvyl1I2z9O89f8Z3VfeGE(android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.smartroute.utils.UrlUtils.INSTANCE.launchUrlInBrowser$smart_route_prodRelease(str2, context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$byCmwnPcVS9cfZMpBGunokTp0TI(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoReloadDisclaimer(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
