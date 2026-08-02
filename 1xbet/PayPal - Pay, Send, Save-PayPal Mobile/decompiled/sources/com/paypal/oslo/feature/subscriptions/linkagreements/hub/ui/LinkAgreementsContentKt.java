package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"LinkAgreementsContent", "", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "items", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "onLinkClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "LinkAgreementsContentBusinessPreview", "(Landroidx/compose/runtime/Composer;I)V", "LinkAgreementsContentSubscriptionPreview", "LinkAgreementsContentSingleItemPreview", "LinkAgreementsContentEmptyPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsContentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkAgreementsContent(final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.lazy.LazyListState rememberLazyListState;
        kotlin.Pair pair;
        boolean changed;
        boolean changed2;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z;
        java.lang.Object rememberedValue;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2064346644);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(agreementType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    lazyListState2 = lazyListState;
                    if (startRestartGroup.changed(lazyListState2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    lazyListState2 = lazyListState;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                lazyListState2 = lazyListState;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        i4 = i3 & (-57345);
                        modifier3 = companion;
                        rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2064346644, i4, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContent (LinkAgreementsContent.kt:56)");
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                            startRestartGroup.startReplaceGroup(437779093);
                            pair = new kotlin.Pair(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_header_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_agreements_header_description, startRestartGroup, 0));
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                                startRestartGroup.startReplaceGroup(437777441);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(437786642);
                            pair = new kotlin.Pair(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_header_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_header_description, startRestartGroup, 0));
                            startRestartGroup.endReplaceGroup();
                        }
                        final java.lang.String str = (java.lang.String) pair.component1();
                        final java.lang.String str2 = (java.lang.String) pair.component2();
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), "link_agreements_list");
                        androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null);
                        changed = startRestartGroup.changed(str);
                        changed2 = startRestartGroup.changed(str2);
                        changedInstance = startRestartGroup.changedInstance(list);
                        changedInstance2 = startRestartGroup.changedInstance(agreementType);
                        z = (i4 & 896) != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changed | changed2 | changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.$r8$lambda$EPplEdFPaST54ZT12QAeLxQ94ls(list, str, str2, agreementType, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        modifier2 = modifier3;
                        composer2 = startRestartGroup;
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, rememberLazyListState, m1703PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, (i4 >> 9) & 112, 504);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        lazyListState2 = rememberLazyListState;
                    } else {
                        modifier2 = companion;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                rememberLazyListState = lazyListState2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                }
                final java.lang.String str3 = (java.lang.String) pair.component1();
                final java.lang.String str22 = (java.lang.String) pair.component2();
                androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), "link_agreements_list");
                androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default2 = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null);
                changed = startRestartGroup.changed(str3);
                changed2 = startRestartGroup.changed(str22);
                changedInstance = startRestartGroup.changedInstance(list);
                changedInstance2 = startRestartGroup.changedInstance(agreementType);
                if ((i4 & 896) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | changed2 | changedInstance | changedInstance2 | z)) {
                }
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.$r8$lambda$EPplEdFPaST54ZT12QAeLxQ94ls(list, str3, str22, agreementType, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                modifier2 = modifier3;
                composer2 = startRestartGroup;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag2, rememberLazyListState, m1703PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, (i4 >> 9) & 112, 504);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                lazyListState2 = rememberLazyListState;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19929$r8$lambda$zhYjPnmF3fDXQ0GE_zkUz6fPzE(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, list, function1, modifier2, lazyListState2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$2qN6pfPWrHs2nbkwMc-HySARjEo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19921$r8$lambda$2qN6pfPWrHs2nbkwMcHySARjEo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-654021561);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-654021561, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentBusinessPreview (LinkAgreementsContent.kt:117)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business business = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant[]{new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("1", "AliExpress", null, "https://aliexpress.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Google", null, "https://google.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Instacart", null, "https://instacart.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("4", "DoorDash", null, "https://doordash.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("5", "Meta", null, "https://meta.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("6", "Microsoft", null, "https://microsoft.com")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19927$r8$lambda$oFS3VFfGZ4k_titfGvNEtkaOi4((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsContent(business, listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 384, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19921$r8$lambda$2qN6pfPWrHs2nbkwMcHySARjEo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9PST4fDe1L-YKDzQn66r3zQML-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19922$r8$lambda$9PST4fDe1LYKDzQn66r3zQMLs(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9myIWzq0l_nFwqJVtx9oTj-LTuQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19923$r8$lambda$9myIWzq0l_nFwqJVtx9oTjLTuQ(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AMm0lrlizPIqQWmg6WC_-LyDi7E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19924$r8$lambda$AMm0lrlizPIqQWmg6WC_LyDi7E(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        function1.invoke(consumerAgreementMerchant);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EPplEdFPaST54ZT12QAeLxQ94ls(final java.util.List list, final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(232906049, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.$r8$lambda$v33ttsQODqfK_fURNBkUcqGPQeE(str, str2, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object id;
                id = ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) list.get(((java.lang.Integer) obj).intValue())).getId();
                return id;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(932376536, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.$r8$lambda$Qb4hvyxrTHQovT5j12YXS4ry2q4(list, agreementType, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GG9TJ3qsFf-E6Xtetbh4wK1sW68, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19925$r8$lambda$GG9TJ3qsFfE6Xtetbh4wK1sW68(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qb4hvyxrTHQovT5j12YXS4ry2q4(java.util.List list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = (composer.changed(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(932376536, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsContent.kt:93)");
            }
            final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) list.get(i);
            boolean z = i < list.size() - 1;
            androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics(agreementType).getMerchantListAnalyticsModule().linkButton(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(consumerAgreementMerchant.getId(), consumerAgreementMerchant.getName())));
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(consumerAgreementMerchant);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19924$r8$lambda$AMm0lrlizPIqQWmg6WC_LyDi7E(kotlin.jvm.functions.Function1.this, consumerAgreementMerchant);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkMerchantItemKt.LinkMerchantItem(consumerAgreementMerchant, z, (kotlin.jvm.functions.Function0) rememberedValue, i, subscriptionsAnalyticsItem, composer, (i3 << 6) & 7168, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cPdqRNjZrkDs2--oTNtum4UDgXo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19926$r8$lambda$cPdqRNjZrkDs2oTNtum4UDgXo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-675320470);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-675320470, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentEmptyPreview (LinkAgreementsContent.kt:229)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business business = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19922$r8$lambda$9PST4fDe1LYKDzQn66r3zQMLs((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsContent(business, emptyList, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19926$r8$lambda$cPdqRNjZrkDs2oTNtum4UDgXo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mh8zhXx1mkGaJTjU_AdvfbJRGTw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-215247158);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-215247158, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentSubscriptionPreview (LinkAgreementsContent.kt:167)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant[]{new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("1", "Netflix", null, "https://netflix.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Spotify", null, "https://spotify.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Hulu", null, "https://hulu.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("4", "Disney+", null, "https://disneyplus.com"), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("5", "Adobe", null, "https://adobe.com")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19923$r8$lambda$9myIWzq0l_nFwqJVtx9oTjLTuQ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsContent(subscription, listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 384, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.$r8$lambda$mh8zhXx1mkGaJTjU_AdvfbJRGTw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oFS3VFfGZ4k_titfGvNEtkaO-i4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19927$r8$lambda$oFS3VFfGZ4k_titfGvNEtkaOi4(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oO8ot-QylLaYzrLKbrSd4UaefZ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19928$r8$lambda$oO8otQylLaYzrLKbrSd4UaefZ8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-559339604);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-559339604, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentSingleItemPreview (LinkAgreementsContent.kt:210)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business business = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("1", "AliExpress", null, "https://aliexpress.com"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19925$r8$lambda$GG9TJ3qsFfE6Xtetbh4wK1sW68((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsContent(business, listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 384, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContentKt.m19928$r8$lambda$oO8otQylLaYzrLKbrSd4UaefZ8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v33ttsQODqfK_fURNBkUcqGPQeE(java.lang.String str, java.lang.String str2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(232906049, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsContent.kt:81)");
            }
            com.paypal.pds.components.HeaderKt.Header(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), str2, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 24576, 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zhYjPnmF-3fDXQ0GE_zkUz6fPzE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19929$r8$lambda$zhYjPnmF3fDXQ0GE_zkUz6fPzE(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementsContent(agreementType, list, function1, modifier, lazyListState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
