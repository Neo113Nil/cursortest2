package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\n\u0010\u0015"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/TransactionInReviewFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lkotlin/Function0;", "", "failureAction", "retryAction", "", "isFromVoidUpload", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction", "Z", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionInReviewFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;
    private final boolean isFromVoidUpload;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction;

    public /* synthetic */ TransactionInReviewFragmentViewProvider(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableState, mutableState2, mutableState3, (i & 8) != 0 ? false : z);
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.failure;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getFailureAction() {
        return this.failureAction;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getRetryAction() {
        return this.retryAction;
    }

    /* renamed from: isFromVoidUpload, reason: from getter */
    public final boolean getIsFromVoidUpload() {
        return this.isFromVoidUpload;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionInReviewFragmentViewProvider(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, boolean z) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        this.failure = mutableState;
        this.failureAction = mutableState2;
        this.retryAction = mutableState3;
        this.isFromVoidUpload = z;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1597027949);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
            if (obj != null) {
                com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(867414065, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                        androidx.compose.runtime.Composer composer3 = composer2;
                        if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
                            currentTheme = com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider.this.currentTheme(composer3, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                            androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$TransactionInReviewFragmentViewProviderKt.INSTANCE.getLambda$767410165$androidSdkUx_release(), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1106707712, true, new com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1.AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider.this), composer3, 54), composer3, 805306416, 444);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                        final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider getHighSpeedVideoFpsRangesFor;

                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            int i;
                            androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                            androidx.compose.runtime.Composer composer2 = composer;
                            int intValue = num.intValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                            if ((intValue & 14) == 0) {
                                intValue |= composer2.changed(paddingValues2) ? 4 : 2;
                            }
                            if ((intValue & 91) != 18 || !composer2.getSkipping()) {
                                androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
                                com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider transactionInReviewFragmentViewProvider = this.getHighSpeedVideoFpsRangesFor;
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, padding);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoCircularProgressIndicator(null, composer2, 0, 1);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer2, 6);
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.6f), androidx.compose.ui.res.StringResources_androidKt.stringResource(transactionInReviewFragmentViewProvider.getIsFromVoidUpload() ? com.ingo.sdk.android.ux.R.string.ingo_on_your_way_to_bigger_balance : com.ingo.sdk.android.ux.R.string.ingo_transaction_in_review_title, composer2, 0), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                                composer2.endNode();
                                composer2.startReplaceGroup(1086093848);
                                if (transactionInReviewFragmentViewProvider.getFailure().getValue() != null) {
                                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "FAILURE NOT NULL ".concat(java.lang.String.valueOf(transactionInReviewFragmentViewProvider.getFailure().getValue())), null, 2, null);
                                    com.ingo.sdk.kotlin.common.core.exception.Failure value = transactionInReviewFragmentViewProvider.getFailure().getValue();
                                    java.lang.String camera2StreamConfigurationMap = value != null ? value.getCamera2StreamConfigurationMap() : null;
                                    composer2.startReplaceGroup(1086099219);
                                    if (camera2StreamConfigurationMap == null) {
                                        i = 0;
                                        camera2StreamConfigurationMap = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_unknown_failure_title, composer2, 0);
                                    } else {
                                        i = 0;
                                    }
                                    java.lang.String str = camera2StreamConfigurationMap;
                                    composer2.endReplaceGroup();
                                    com.ingo.sdk.kotlin.common.core.exception.Failure value2 = transactionInReviewFragmentViewProvider.getFailure().getValue();
                                    java.lang.String getHighSpeedVideoFpsRangesFor = value2 != null ? value2.getGetHighSpeedVideoFpsRangesFor() : null;
                                    composer2.startReplaceGroup(1086104410);
                                    java.lang.String stringResource = getHighSpeedVideoFpsRangesFor == null ? androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_unknown_failure_description, composer2, i) : getHighSpeedVideoFpsRangesFor;
                                    composer2.endReplaceGroup();
                                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_retry, composer2, i);
                                    kotlin.jvm.functions.Function0<kotlin.Unit> value3 = transactionInReviewFragmentViewProvider.getRetryAction().getValue();
                                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_dismiss, composer2, i);
                                    kotlin.jvm.functions.Function0<kotlin.Unit> value4 = transactionInReviewFragmentViewProvider.getFailureAction().getValue();
                                    composer2.startReplaceGroup(1086118218);
                                    if (value4 == null) {
                                        composer2.startReplaceGroup(1849434622);
                                        java.lang.Object rememberedValue = composer2.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0262: CONSTRUCTOR (r0v49 'rememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:2161) call: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1.1.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 39 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 641
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$View$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                        }

                                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges() {
                                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider transactionInReviewFragmentViewProvider) {
                                            this.getHighSpeedVideoFpsRangesFor = transactionInReviewFragmentViewProvider;
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }
                        }
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider.$r8$lambda$W1qRSgkg81ng_cRfkEiq9OpiLR4(com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                        }
                    }

                    public static /* synthetic */ kotlin.Unit $r8$lambda$W1qRSgkg81ng_cRfkEiq9OpiLR4(com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider transactionInReviewFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
                        transactionInReviewFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                        return kotlin.Unit.INSTANCE;
                    }
                }
