package com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"CryptoTermsViewComponentContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/cryptoterms/domain/CryptoTermsViewComponentConfig;", "onAccept", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "modifier", "Landroidx/compose/ui/Modifier;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/cryptoterms/domain/CryptoTermsViewComponentConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/runtime/Composer;II)V", "CryptoTermsViewComponentContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoTermsViewComponentContentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTermsViewComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId2;
        final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoTermsViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2122202833);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoTermsViewComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                intentId2 = intentId;
                i3 |= startRestartGroup.changedInstance(intentId2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    intentId3 = intentId2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        intentId2 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2122202833, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContent (CryptoTermsViewComponentContent.kt:76)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId4 = intentId2;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_subtitle_ppi, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1002);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    com.paypal.oslo.feature.oneonboarding.ui.common.BulletPointListKt.BulletPointList(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_1_ppi, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_2, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_3_ppi, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_4, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_5_ppi, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_bullet_6, startRestartGroup, 0)}), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), startRestartGroup, 0, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_agreement_ppi, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_link_e_communication, startRestartGroup, 0), "https://www.paypal.com/us/webapps/mpp/ua/esign-full"), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_subtitle_ppi, startRestartGroup, 0), "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc"), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_link_state_disclosures, startRestartGroup, 0), com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.StateDisclosure), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_link_privacy, startRestartGroup, 0), com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.PrivacyStatement)})), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
                    boolean changedInstance = startRestartGroup.changedInstance(intentId4);
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.$r8$lambda$AzFQQqjTKTgia0Eho9uzO3QpAwg(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, context, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    boolean z = true;
                    com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, null, null, (kotlin.jvm.functions.Function3) rememberedValue, null, startRestartGroup, com.paypal.pds.components.LegalConsentItem.$stable, 22);
                    startRestartGroup.endNode();
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_crypto_terms_agree_button, startRestartGroup, 0);
                    com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("agree_and_continue", 0, 2, null));
                    boolean z2 = (i3 & 112) == 32;
                    if ((i3 & 14) != 4) {
                        z = false;
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.m16987$r8$lambda$9pCgOcZaRGrIvpHHc3vDgcoK2A(kotlin.jvm.functions.Function1.this, cryptoTermsViewComponentConfig);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource, item, null, null, primary, large, false, false, startRestartGroup, 1769472, 408);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    intentId3 = intentId4;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.$r8$lambda$qHHEepmyxJoF8DHZcR2tCAjkrIw(com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig.this, function1, modifier5, intentId3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            intentId2 = intentId;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        intentId2 = intentId;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$9pCgOcZaRGrIvpHHc3vD-gcoK2A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16987$r8$lambda$9pCgOcZaRGrIvpHHc3vDgcoK2A(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig) {
        function1.invoke(new com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsCollectedItem(cryptoTermsViewComponentConfig.mo16702getIdfHLlpbY(), true, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AzFQQqjTKTgia0Eho9uzO3QpAwg(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        java.lang.String resolveLinkItemName$one_onboarding_prodRelease;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (intentId != null && (resolveLinkItemName$one_onboarding_prodRelease = com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.analytics.CryptoTermsAnalytics.INSTANCE.resolveLinkItemName$one_onboarding_prodRelease(str2)) != null) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.analytics.CryptoTermsAnalytics.INSTANCE.trackLinkClick$one_onboarding_prodRelease(intentId, resolveLinkItemName$one_onboarding_prodRelease);
        }
        com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.launchUrlInBrowser(str2, context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iU7v3FUilQL8Lf2KMFPihLgB_qY(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nNKRjFU1N-1fwc7bAOCVVxxrDF0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16988$r8$lambda$nNKRjFU1N1fwc7bAOCVVxxrDF0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(283434522);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(283434522, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentPreview (CryptoTermsViewComponentContent.kt:159)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-id"), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.$r8$lambda$iU7v3FUilQL8Lf2KMFPihLgB_qY((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoTermsViewComponentContent(cryptoTermsViewComponentConfig, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.m16988$r8$lambda$nNKRjFU1N1fwc7bAOCVVxxrDF0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qHHEepmyxJoF8DHZcR2tCAjkrIw(com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoTermsViewComponentContent(cryptoTermsViewComponentConfig, function1, modifier, intentId, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
