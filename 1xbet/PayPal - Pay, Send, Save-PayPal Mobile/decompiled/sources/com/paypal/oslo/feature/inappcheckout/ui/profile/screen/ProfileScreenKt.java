package com.paypal.oslo.feature.inappcheckout.ui.profile.screen;

@kotlin.Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\u001a:\u0010\f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0010H\u0082@¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, d2 = {"ProfileScreen", "", "buyerInfoEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/viewmodel/ProfileViewModel;", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/ui/profile/viewmodel/ProfileViewModel;Landroidx/compose/runtime/Composer;II)V", "rememberProfileEventHandlers", "com/paypal/oslo/feature/inappcheckout/ui/profile/screen/ProfileScreenKt$rememberProfileEventHandlers$1$1", "(Lcom/paypal/oslo/feature/inappcheckout/ui/profile/viewmodel/ProfileViewModel;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/screen/ProfileScreenKt$rememberProfileEventHandlers$1$1;", "handleProfileEffects", "navigatingBackMsg", "", "onToastMessageChange", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/inappcheckout/ui/profile/viewmodel/ProfileViewModel;Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;", "toastMessage"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleProfileEffects(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final java.lang.String str, final kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$1 profileScreenKt$handleProfileEffects$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$1) {
            profileScreenKt$handleProfileEffects$1 = (com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$1) continuation;
            if ((profileScreenKt$handleProfileEffects$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                profileScreenKt$handleProfileEffects$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = profileScreenKt$handleProfileEffects$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = profileScreenKt$handleProfileEffects$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> effect = profileViewModel.getEffect();
                    kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation2) {
                            com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect) obj2;
                            if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateBack) {
                                function1.invoke(str);
                                com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateBack$default(inAppCheckoutCoordinator, null, false, 3, null);
                            } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView) {
                                inAppCheckoutCoordinator.navigateToNativeInAppWebView(((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView) effect2).getData());
                            } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage) {
                                function1.invoke(((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage) effect2).getMessage());
                            } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutSuccess) {
                                com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateBack$default(inAppCheckoutCoordinator, null, false, 3, null);
                            } else {
                                if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                function1.invoke(((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError) effect2).getErrorMessage());
                                com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateBack$default(inAppCheckoutCoordinator, null, false, 3, null);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    profileScreenKt$handleProfileEffects$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileViewModel);
                    profileScreenKt$handleProfileEffects$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(inAppCheckoutCoordinator);
                    profileScreenKt$handleProfileEffects$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    profileScreenKt$handleProfileEffects$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    profileScreenKt$handleProfileEffects$1.Camera2StreamConfigurationMap = 1;
                    if (effect.collect(flowCollector, profileScreenKt$handleProfileEffects$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        profileScreenKt$handleProfileEffects$1 = new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$1(continuation);
        java.lang.Object obj2 = profileScreenKt$handleProfileEffects$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = profileScreenKt$handleProfileEffects$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileScreen(final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState;
        boolean changed;
        java.lang.Object rememberedValue2;
        android.content.res.Configuration configuration;
        kotlin.Unit unit;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z;
        boolean changed2;
        java.lang.Object rememberedValue3;
        com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel4;
        kotlin.Unit unit2;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.Composer composer3;
        com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State state;
        java.lang.String str;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1249615713);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(buyerInfoEntity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(inAppCheckoutCoordinator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                profileViewModel2 = profileViewModel;
                if (startRestartGroup.changedInstance(profileViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                profileViewModel2 = profileViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            profileViewModel2 = profileViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
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
                i4 = 0;
                i3 &= -897;
                profileViewModel2 = (com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1249615713, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreen (ProfileScreen.kt:58)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(profileViewModel2.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_navigating_back, new java.lang.Object[i4], startRestartGroup, i4);
                java.lang.String rememberStringValue2 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_profile, new java.lang.Object[i4], startRestartGroup, i4);
                int i6 = (i3 >> 6) & 14;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1952698682, i6, -1, "com.paypal.oslo.feature.inappcheckout.ui.profile.screen.rememberProfileEventHandlers (ProfileScreen.kt:140)");
                }
                changed = startRestartGroup.changed(profileViewModel2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1(profileViewModel2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1 profileScreenKt$rememberProfileEventHandlers$1$1 = (com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1) rememberedValue2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                android.app.Activity activity = (android.app.Activity) startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                configuration = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(profileViewModel2);
                changedInstance2 = startRestartGroup.changedInstance(buyerInfoEntity);
                z = (i3 & 112) != 32;
                changed2 = startRestartGroup.changed(rememberStringValue);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if ((!(changedInstance | changedInstance2 | z) && !changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    profileViewModel4 = profileViewModel2;
                    unit2 = unit;
                    mutableState2 = mutableState;
                    composer3 = startRestartGroup;
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1(profileViewModel2, buyerInfoEntity, inAppCheckoutCoordinator, rememberStringValue, mutableState, null);
                    composer3.updateRememberedValue(rememberedValue3);
                } else {
                    profileViewModel4 = profileViewModel2;
                    unit2 = unit;
                    mutableState2 = mutableState;
                    composer3 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer3, 6);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.PROFILE_SCREEN_TAG);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, testTag);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (com.paypal.oslo.feature.inappcheckout.UtilsKt.isDarkMode(configuration)) {
                    com.paypal.oslo.feature.inappcheckout.UtilsKt.setupStatusBar(activity, com.paypal.oslo.feature.inappcheckout.R.color.feature_inappcheckout_status_bar_color_light, true);
                } else {
                    com.paypal.oslo.feature.inappcheckout.UtilsKt.setupStatusBar(activity, com.paypal.oslo.feature.inappcheckout.R.color.feature_inappcheckout_status_bar_color_dark, false);
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(composer3, 0), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1710paddingqDBjuR0$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                final androidx.compose.runtime.MutableState mutableState3 = mutableState2;
                composer2 = composer3;
                com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderKt.InAppCheckoutHeader(new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderLeftContent.IconContent(com.paypal.pds.core.Icon.ChevronLeft.INSTANCE, profileScreenKt$rememberProfileEventHandlers$1$1.getOnBackPress(), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.IAC_TOPBAR_LEFT_ICON, null, 8, null), new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title(rememberStringValue2, null, 2, null), null, null, composer3, 0, 12);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                state = (com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State) collectAsStateWithLifecycle.getValue();
                if (state != null) {
                    composer2.startReplaceGroup(-2060781368);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-2060781367);
                    com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenContentKt.ProfileScreenContent(state, profileScreenKt$rememberProfileEventHandlers$1$1.getOnLogout(), profileScreenKt$rememberProfileEventHandlers$1$1.getOnNavigateToTerms(), profileScreenKt$rememberProfileEventHandlers$1$1.getOnNavigateToPolicies(), profileScreenKt$rememberProfileEventHandlers$1$1.getOnNavigateToPrivacy(), composer2, 0);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                }
                composer2.endNode();
                str = (java.lang.String) mutableState3.getValue();
                if (str != null) {
                    composer2.startReplaceGroup(1979136028);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1979136029);
                    java.lang.Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt.$r8$lambda$nLu1ilki5zXHpqdDi62k4f04B7w(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.inappcheckout.UtilsKt.ShowToast(str, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.RYP_PROFILE_TOAST_TAG, (kotlin.jvm.functions.Function0) rememberedValue4, composer2, 432);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                profileViewModel3 = profileViewModel4;
            }
            i4 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(profileViewModel2.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String rememberStringValue3 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context2, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_navigating_back, new java.lang.Object[i4], startRestartGroup, i4);
            java.lang.String rememberStringValue22 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context2, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_profile, new java.lang.Object[i4], startRestartGroup, i4);
            int i62 = (i3 >> 6) & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changed = startRestartGroup.changed(profileViewModel2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1(profileViewModel2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1 profileScreenKt$rememberProfileEventHandlers$1$12 = (com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1) rememberedValue2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            android.app.Activity activity2 = (android.app.Activity) startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            configuration = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
            unit = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(profileViewModel2);
            changedInstance2 = startRestartGroup.changedInstance(buyerInfoEntity);
            if ((i3 & 112) != 32) {
            }
            changed2 = startRestartGroup.changed(rememberStringValue3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2 | z | changed2)) {
            }
            profileViewModel4 = profileViewModel2;
            unit2 = unit;
            mutableState2 = mutableState;
            composer3 = startRestartGroup;
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1(profileViewModel2, buyerInfoEntity, inAppCheckoutCoordinator, rememberStringValue3, mutableState, null);
            composer3.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer3, 6);
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.PROFILE_SCREEN_TAG);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, testTag2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer3.startReusableNode();
            if (!composer3.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (com.paypal.oslo.feature.inappcheckout.UtilsKt.isDarkMode(configuration)) {
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(composer3, 0), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1710paddingqDBjuR0$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer3.startReusableNode();
            if (!composer3.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            final androidx.compose.runtime.MutableState mutableState32 = mutableState2;
            composer2 = composer3;
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderKt.InAppCheckoutHeader(new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderLeftContent.IconContent(com.paypal.pds.core.Icon.ChevronLeft.INSTANCE, profileScreenKt$rememberProfileEventHandlers$1$12.getOnBackPress(), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.IAC_TOPBAR_LEFT_ICON, null, 8, null), new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title(rememberStringValue22, null, 2, null), null, null, composer3, 0, 12);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            state = (com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State) collectAsStateWithLifecycle2.getValue();
            if (state != null) {
            }
            composer2.endNode();
            str = (java.lang.String) mutableState32.getValue();
            if (str != null) {
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            profileViewModel3 = profileViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            profileViewModel3 = profileViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt.m15549$r8$lambda$Yd7v0w3hEm3jeE1tJLJiak5c(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.this, inAppCheckoutCoordinator, profileViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$Yd7v0w3hEm-3jeE-1tJLJiak-5c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15549$r8$lambda$Yd7v0w3hEm3jeE1tJLJiak5c(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProfileScreen(buyerInfoEntity, inAppCheckoutCoordinator, profileViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nLu1ilki5zXHpqdDi62k4f04B7w(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }
}
