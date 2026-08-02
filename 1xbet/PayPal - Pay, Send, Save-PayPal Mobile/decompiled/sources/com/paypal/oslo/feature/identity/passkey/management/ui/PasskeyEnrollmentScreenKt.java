package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001ae\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"PasskeyEnrollmentScreen", "", "onNavigateUp", "Lkotlin/Function0;", "onEnrollmentSuccess", "onHowPasskeysWorkClick", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentViewModel;Landroidx/compose/runtime/Composer;II)V", "PasskeyEnrollmentContent", "onBackClick", "onAddPasskeyClick", "isLoading", "", "createError", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "onDismissError", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PasskeyFeatureBullet", "icon", "Lcom/paypal/pds/core/Icon;", "text", "", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PasskeyEnrollmentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "PasskeyEnrollmentScreenLoadingPreview", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "screenContentReady"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyEnrollmentScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasskeyEnrollmentScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel2;
        int i4;
        final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r15;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel4;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError error;
        boolean z;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError2;
        ?? r6;
        androidx.compose.ui.Modifier.Companion companion;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        boolean changedInstance3;
        java.lang.Object rememberedValue2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1346380047);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    passkeyEnrollmentViewModel2 = passkeyEnrollmentViewModel;
                    if (startRestartGroup.changedInstance(passkeyEnrollmentViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    passkeyEnrollmentViewModel2 = passkeyEnrollmentViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                passkeyEnrollmentViewModel2 = passkeyEnrollmentViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    passkeyEnrollmentViewModel4 = passkeyEnrollmentViewModel2;
                    r15 = 0;
                    i5 = i4;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        r15 = 0;
                        passkeyEnrollmentViewModel4 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i5 = i4 & (-57345);
                        modifier4 = modifier5;
                    } else {
                        r15 = 0;
                        passkeyEnrollmentViewModel4 = passkeyEnrollmentViewModel2;
                        modifier4 = modifier5;
                        i5 = i4;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1346380047, i5, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreen (PasskeyEnrollmentScreen.kt:103)");
                }
                boolean z2 = (i5 & 14) == 4 ? true : r15;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15244$r8$lambda$Z7H5zS_tNnCUNtBxnkh4EkSBMM(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(r15, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, r15, 1);
                int i8 = i5;
                final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel5 = passkeyEnrollmentViewModel4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(passkeyEnrollmentViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                boolean z3 = (i8 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$PasskeyEnrollmentScreen$2$1(passkeyEnrollmentViewModel5, function02, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                boolean z4 = ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling;
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState passkeyEnrollmentUiState = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState) collectAsStateWithLifecycle.getValue();
                if (passkeyEnrollmentUiState instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) {
                    error = ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) passkeyEnrollmentUiState).getError();
                } else if (passkeyEnrollmentUiState instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) {
                    error = ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) passkeyEnrollmentUiState).getError();
                } else {
                    passkeyCreateError = null;
                    z = passkeyCreateError == null && com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.isActionableError(passkeyCreateError);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    androidx.compose.ui.Modifier modifier6 = modifier4;
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    if (!z) {
                        startRestartGroup.startReplaceGroup(-141625763);
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15240$r8$lambda$QHF38G4aTBK9wEsmxjCo2TPtQM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        passkeyCreateError2 = null;
                        r6 = 0;
                        companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        passkeyCreateError2 = null;
                        r6 = 0;
                        startRestartGroup.startReplaceGroup(-141543613);
                        startRestartGroup.endReplaceGroup();
                        companion = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r6);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r6));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15237$r8$lambda$0rDT9tLYuylhlxoctT0Ec1Ez5I(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this, context);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError3 = (passkeyCreateError != null || com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.isActionableError(passkeyCreateError)) ? passkeyCreateError2 : passkeyCreateError;
                    changedInstance3 = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15239$r8$lambda$NUC3uFssjcYSW34ISL2d5e7Y3c(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    getHighResolutionOutputSizeshNQ4ISI(function0, function04, function03, z4, null, passkeyCreateError3, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, i8 & 910, 16);
                    startRestartGroup.endNode();
                    if (passkeyCreateError != null) {
                        startRestartGroup.startReplaceGroup(-140681008);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-140681007);
                        if (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.isActionableError(passkeyCreateError)) {
                            startRestartGroup.startReplaceGroup(-1063119898);
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.getErrorHeading(passkeyCreateError), startRestartGroup, 0);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.getErrorDescription(passkeyCreateError), startRestartGroup, 0);
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_got_it_button, startRestartGroup, 0);
                            boolean changedInstance5 = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.$r8$lambda$HEAGbXDyUHtcDtIKobT7oCyaj4I(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
                            boolean changedInstance6 = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changedInstance6 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.$r8$lambda$KYxcdA8SSKLLDj8T_X4IDGOseuI(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyErrorScreenKt.PasskeyErrorContent(stringResource, stringResource2, stringResource3, function05, (kotlin.jvm.functions.Function0) rememberedValue7, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Enrollment.SCREEN_ERROR, 0, null, null, 14, null)), startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1062422212);
                            startRestartGroup.endReplaceGroup();
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    passkeyEnrollmentViewModel3 = passkeyEnrollmentViewModel5;
                    modifier3 = modifier6;
                }
                passkeyCreateError = error;
                if (passkeyCreateError == null) {
                }
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                androidx.compose.ui.Modifier modifier62 = modifier4;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (!z) {
                }
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r6);
                int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r6));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                changedInstance2 = startRestartGroup.changedInstance(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2)) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15237$r8$lambda$0rDT9tLYuylhlxoctT0Ec1Ez5I(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this, context);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function0 function042 = (kotlin.jvm.functions.Function0) rememberedValue;
                if (passkeyCreateError != null) {
                }
                changedInstance3 = startRestartGroup.changedInstance(passkeyEnrollmentViewModel5);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15239$r8$lambda$NUC3uFssjcYSW34ISL2d5e7Y3c(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                getHighResolutionOutputSizeshNQ4ISI(function0, function042, function03, z4, null, passkeyCreateError3, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, i8 & 910, 16);
                startRestartGroup.endNode();
                if (passkeyCreateError != null) {
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                passkeyEnrollmentViewModel3 = passkeyEnrollmentViewModel5;
                modifier3 = modifier62;
            } else {
                startRestartGroup.skipToGroupEnd();
                passkeyEnrollmentViewModel3 = passkeyEnrollmentViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15245$r8$lambda$_TzgOM1qp9Bl8L88xXlwC3hb00(kotlin.jvm.functions.Function0.this, function02, function03, modifier3, passkeyEnrollmentViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final boolean z, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        java.lang.String str;
        java.lang.String stringResource;
        int i6;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError4;
        androidx.compose.ui.Modifier modifier3;
        int i7;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(605820586);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                passkeyCreateError2 = passkeyCreateError;
                i3 |= startRestartGroup.changed(passkeyCreateError2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function05 = function04;
                    passkeyCreateError3 = passkeyCreateError2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        passkeyCreateError2 = null;
                    }
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function06 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function06 = function04;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(605820586, i3, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentContent (PasskeyEnrollmentScreen.kt:205)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    boolean z2 = (i3 & 7168) == 2048;
                    boolean z3 = (458752 & i3) == 131072;
                    com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$PasskeyEnrollmentContent$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$PasskeyEnrollmentContent$2$1(z, passkeyCreateError2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), passkeyCreateError2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 12) & 112));
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    if (z) {
                        str = com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Enrollment.SCREEN_ENROLLING;
                    } else {
                        str = com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Enrollment.SCREEN_IDLE;
                    }
                    androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(fillMaxSize$default, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str, 0, null, null, 14, null));
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                boolean booleanValue;
                                booleanValue = ((java.lang.Boolean) androidx.compose.runtime.MutableState.this.getValue()).booleanValue();
                                return java.lang.Boolean.valueOf(booleanValue);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.ui.Modifier available = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(module, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 48);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, available);
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
                    com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(null, new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_common_back, startRestartGroup, 0)), null, 5, null), null, startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable, 2);
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                    if (passkeyCreateError2 == null) {
                        startRestartGroup.startReplaceGroup(-1688405402);
                        startRestartGroup.endReplaceGroup();
                        i6 = i3;
                        passkeyCreateError4 = passkeyCreateError2;
                        modifier3 = modifier4;
                        i7 = 1;
                        defaultConstructorMarker = null;
                    } else {
                        startRestartGroup.startReplaceGroup(-1688405401);
                        if (passkeyCreateError2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NetworkError) {
                            startRestartGroup.startReplaceGroup(900002571);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_banner_network, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (passkeyCreateError2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.TimeoutError) {
                            startRestartGroup.startReplaceGroup(900008555);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_banner_timeout, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (passkeyCreateError2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ServerInternalError) {
                            startRestartGroup.startReplaceGroup(900014762);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_banner_server, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (passkeyCreateError2 instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AuthenticationError) {
                            startRestartGroup.startReplaceGroup(900020936);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_banner_auth, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(900025813);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_banner_generic, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String str2 = stringResource;
                        com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.$r8$lambda$VgGlTGakbZA57kgey5eQrunAvDM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        i6 = i3;
                        passkeyCreateError4 = passkeyCreateError2;
                        modifier3 = modifier4;
                        i7 = 1;
                        defaultConstructorMarker = null;
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null), negative, (java.lang.String) null, str2, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function06, startRestartGroup, (i3 & 3670016) | 48, 52);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_empty_state_title, startRestartGroup, 0);
                    com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15242$r8$lambda$UvvLIztq7rk1tdf7L0QYdogSc8((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue6, i7, defaultConstructorMarker), contentBase, null, null, null, false, 0, 0, null, headingMedium, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_empty_state_description, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    getHighSpeedVideoSizes(com.paypal.pds.core.Icon.StarSealPercentage.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_feature_easy_setup, startRestartGroup, 0), null, startRestartGroup, 6, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    getHighSpeedVideoSizes(com.paypal.pds.core.Icon.ShieldCheck.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_feature_secure_logins, startRestartGroup, 0), null, startRestartGroup, 6, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    getHighSpeedVideoSizes(com.paypal.pds.core.Icon.Mobile.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_feature_cross_device, startRestartGroup, 0), null, startRestartGroup, 6, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_how_passkeys_work, startRestartGroup, 0);
                    com.paypal.pds.core.Typography.LabelMedium labelMedium = com.paypal.pds.core.Typography.LabelMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    androidx.compose.ui.text.style.TextDecoration underline = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline();
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15246$r8$lambda$an1faF0eKFZAiyjKgTxkMQU2EQ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue7, i7, defaultConstructorMarker), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.ItemName.HOW_PASSKEYS_WORK_LINK, 0, 2, defaultConstructorMarker)), null, null, false, null, null, function03, startRestartGroup, (i6 << 12) & 3670016, 31), contentBase2, underline, null, null, false, 0, 0, null, labelMedium, startRestartGroup, 3456, 6, 1008);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_add_button, startRestartGroup, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, defaultConstructorMarker)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.ItemName.ADD_PASSKEY_BUTTON, 0, 2, defaultConstructorMarker)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, z, startRestartGroup, ((i6 >> 3) & 14) | 1769472 | ((i6 << 15) & 234881024), 152);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier5;
                    function05 = function06;
                    passkeyCreateError3 = passkeyCreateError4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.$r8$lambda$VQXU4s38qsGqmZzXGqrIgHIcdds(kotlin.jvm.functions.Function0.this, function02, function03, z, modifier2, passkeyCreateError3, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            passkeyCreateError2 = passkeyCreateError;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        passkeyCreateError2 = passkeyCreateError;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.pds.core.Icon icon, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1691497773);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1691497773, i3, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyFeatureBullet (PasskeyEnrollmentScreen.kt:351)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15238$r8$lambda$GMRH8fuq_DKf2DHdQ8Y_q0hBGM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier4, true, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(icon, null, null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, (i3 & 14) | 24624, 12);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 384, 6, 1018);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15243$r8$lambda$W8wL43PlGBlm8Q_JVzLw0KhRGI(com.paypal.pds.core.Icon.this, str, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$0rDT9tLYuylhlxoc-tT0Ec1Ez5I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15237$r8$lambda$0rDT9tLYuylhlxoctT0Ec1Ez5I(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel, android.content.Context context) {
        passkeyEnrollmentViewModel.onEvent(new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.CreatePasskey(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.getActivityContext(context), null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8uLySj_TbbNN5a2E5TtY24vSOFY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2042192046);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2042192046, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenPreview (PasskeyEnrollmentScreen.kt:374)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda15
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            getHighResolutionOutputSizeshNQ4ISI(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, false, null, null, null, startRestartGroup, 3510, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.$r8$lambda$8uLySj_TbbNN5a2E5TtY24vSOFY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GMRH8fuq_DKf2DHdQ8Y_q0-hBGM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15238$r8$lambda$GMRH8fuq_DKf2DHdQ8Y_q0hBGM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HEAGbXDyUHtcDtIKobT7oCyaj4I(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel) {
        passkeyEnrollmentViewModel.onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KYxcdA8SSKLLDj8T_X4IDGOseuI(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel) {
        passkeyEnrollmentViewModel.onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissGotIt.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NUC3uFssjcYSW34I-SL2d5e7Y3c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15239$r8$lambda$NUC3uFssjcYSW34ISL2d5e7Y3c(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel) {
        passkeyEnrollmentViewModel.onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentEvent.DismissBannerError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QHF38G4aTBK9wEsmxjCo2TPt-QM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15240$r8$lambda$QHF38G4aTBK9wEsmxjCo2TPtQM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QsQqataiI0kKvor_3Si2B7lYm-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15241$r8$lambda$QsQqataiI0kKvor_3Si2B7lYmc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2005777942);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2005777942, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenLoadingPreview (PasskeyEnrollmentScreen.kt:387)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda3
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            getHighResolutionOutputSizeshNQ4ISI(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, true, null, null, null, startRestartGroup, 3510, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentScreenKt.m15241$r8$lambda$QsQqataiI0kKvor_3Si2B7lYmc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UvvLIztq7rk1-tdf7L0QYdogSc8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15242$r8$lambda$UvvLIztq7rk1tdf7L0QYdogSc8(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VQXU4s38qsGqmZzXGqrIgHIcdds(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, kotlin.jvm.functions.Function0 function04, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(function0, function02, function03, z, modifier, passkeyCreateError, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VgGlTGakbZA57kgey5eQrunAvDM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W8wL43PlGBlm8Q_JVzLw-0KhRGI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15243$r8$lambda$W8wL43PlGBlm8Q_JVzLw0KhRGI(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(icon, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z7H5zS_tNnC-UNtBxnkh4EkSBMM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15244$r8$lambda$Z7H5zS_tNnCUNtBxnkh4EkSBMM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_TzgOM1qp9Bl8L88xXlwC3hb0-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15245$r8$lambda$_TzgOM1qp9Bl8L88xXlwC3hb00(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PasskeyEnrollmentScreen(function0, function02, function03, modifier, passkeyEnrollmentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$an1faF-0eKFZAiyjKgTxkMQU2EQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15246$r8$lambda$an1faF0eKFZAiyjKgTxkMQU2EQ(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }
}
