package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"LinkAgreementsSearchScreenContent", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchEvent;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "state", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getStringsForSearch", "Lkotlin/Pair;", "", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "LinkAgreementsSearchScreenContentPreview", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsSearchScreenContentKt {
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkAgreementsSearchScreenContent(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsSearchScreenState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-713487983);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(agreementType) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(linkAgreementsSearchScreenState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-713487983, i4, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContent (LinkAgreementsSearchScreenContent.kt:41)");
                }
                int i6 = (i4 >> 3) & 14;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-967671818, i6, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.getStringsForSearch (LinkAgreementsSearchScreenContent.kt:124)");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(2075290715);
                    pair = new kotlin.Pair(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_agreements_search_subscriptions_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_agreements_search_subscriptions_popular_header, startRestartGroup, 0));
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(2075289237);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(2075300085);
                    pair = new kotlin.Pair(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_agreements_search_businesses_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_search_businesses_popular_header, startRestartGroup, 0));
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                java.lang.String str = (java.lang.String) pair.component1();
                java.lang.String str2 = (java.lang.String) pair.component2();
                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                modifier3 = modifier4;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1461997931, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$nU6t2o9U9UvFCUhYLrTaGvTtpuk(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                int i7 = i4 & 14;
                boolean z = i7 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$gRWLkv1MgOnXgn__RNsABDOb2SU(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean z2 = i7 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.m19907$r8$lambda$oO5twUTfqnay9fcH2Ifn8IivKI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.SearchKt.Search(m1708paddingVpY3zN4$default, null, function12, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, startRestartGroup, 0, 114);
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent content = linkAgreementsSearchScreenState.getContent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(content, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(2115609019);
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 6);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(content, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1159436646);
                    com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkedAgreementSearchPopularShimmerKt.LinkedAgreementSearchPopularShimmer(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                } else if (content instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants) {
                    startRestartGroup.startReplaceGroup(1159617562);
                    java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> merchants = ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants) content).getMerchants();
                    boolean z3 = i7 == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$ljtXdY7SS81nfagqbXmkdb5CVBM(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchPopularListKt.LinkAgreementsSearchPopularList(merchants, str2, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 3072, 0);
                } else if (content instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults) {
                    startRestartGroup.startReplaceGroup(1160083461);
                    java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> suggestions = ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults) content).getSuggestions();
                    boolean z4 = i7 == 4;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.m19906$r8$lambda$NuDKMOeKKvKzX0VdzqQltwgiXY(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.LinkAgreementsSuggestedSearchList(suggestions, (kotlin.jvm.functions.Function1) rememberedValue4, null, rememberLazyListState, startRestartGroup, 0, 4);
                } else {
                    if (!(content instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error)) {
                        startRestartGroup.startReplaceGroup(2115608648);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1160571401);
                    int i8 = com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error) content).getType().ordinal()];
                    if (i8 == 1) {
                        startRestartGroup.startReplaceGroup(2115649755);
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } else if (i8 == 2) {
                        startRestartGroup.startReplaceGroup(2115652609);
                        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchNotFoundKt.MerchantSearchNotFound(linkAgreementsSearchScreenState.getSearchQuery(), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } else {
                        if (i8 != 3) {
                            startRestartGroup.startReplaceGroup(2115647769);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(2115662751);
                        boolean z5 = i7 == 4;
                        boolean z6 = (i4 & 896) == 256;
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((z5 | z6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$r6gmdlRqPTURWB_aLfazYEDaP8s(kotlin.jvm.functions.Function1.this, linkAgreementsSearchScreenState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen((kotlin.jvm.functions.Function0) rememberedValue5, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, startRestartGroup, 48, 4);
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$8QA_1IIdGtIIGozPr1ZaP6WhRYk(kotlin.jvm.functions.Function1.this, agreementType, linkAgreementsSearchScreenState, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8QA_1IIdGtIIGozPr1ZaP6WhRYk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementsSearchScreenContent(function1, agreementType, linkAgreementsSearchScreenState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NuDKMOeKKvKzX0VdzqQltwgi-XY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19906$r8$lambda$NuDKMOeKKvKzX0VdzqQltwgiXY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantSelected(consumerAgreementMerchant));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q1QBD5D68ZnXWeoftsI3xPl7Fp0(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent linkAgreementsSearchEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsSearchEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_nBCQtbRKzTyoJkRwoq65jVT_9w(final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-444509441);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(linkAgreementsSearchScreenState) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-444509441, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentPreview (LinkAgreementsSearchScreenContent.kt:188)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$Q1QBD5D68ZnXWeoftsI3xPl7Fp0((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsSearchScreenContent((kotlin.jvm.functions.Function1) rememberedValue, subscription, linkAgreementsSearchScreenState, fillMaxSize$default, startRestartGroup, ((i3 << 6) & 896) | 3078, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$_nBCQtbRKzTyoJkRwoq65jVT_9w(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gRWLkv1MgOnXgn__RNsABDOb2SU(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchQueryChanged(str, false, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ljtXdY7SS81nfagqbXmkdb5CVBM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantLinkClicked(consumerAgreementMerchant));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nU6t2o9U9UvFCUhYLrTaGvTtpuk(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1461997931, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContent.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsSearchScreenContent.kt:48)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenContentKt.$r8$lambda$qYt2v816aXioLOq6ZeQ4uEzcd2M(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oO5twUTfqnay9fcH2If-n8IivKI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19907$r8$lambda$oO5twUTfqnay9fcH2Ifn8IivKI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchCleared.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qYt2v816aXioLOq6ZeQ4uEzcd2M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnBackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r6gmdlRqPTURWB_aLfazYEDaP8s(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState) {
        function1.invoke(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchQueryChanged(linkAgreementsSearchScreenState.getSearchQuery(), false));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.ERROR_FETCH_POPULAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.SEARCH_NOT_FOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.GENERIC_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
