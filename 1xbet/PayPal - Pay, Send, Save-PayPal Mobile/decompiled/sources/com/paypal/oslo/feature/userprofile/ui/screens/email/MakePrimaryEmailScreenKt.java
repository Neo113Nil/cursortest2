package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001aM\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002"}, d2 = {"MakePrimaryEmailScreen", "", "emailId", "", "confirm", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/MakePrimaryEmailViewModel;", "(Ljava/lang/String;ZLcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/MakePrimaryEmailViewModel;Landroidx/compose/runtime/Composer;II)V", "MakePrimaryEmailContent", "email", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "isLoading", "errorStrategy", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "onConfirm", "Lkotlin/Function0;", "onCancel", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;ZLcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;", "isSuccess"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MakePrimaryEmailScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MakePrimaryEmailScreen(final java.lang.String str, final boolean z, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel4;
        java.lang.Object rememberedValue;
        final androidx.compose.runtime.MutableState mutableState;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail;
        boolean z2;
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$1$1 rememberedValue2;
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel5;
        boolean changedInstance;
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$2$1 rememberedValue4;
        boolean changed;
        boolean z3;
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1 rememberedValue5;
        boolean changedInstance2;
        boolean z4;
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$4$1 rememberedValue6;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail2;
        int i4;
        boolean z5;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel6;
        com.paypal.oslo.core.userstore.model.User user;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails;
        java.lang.Object obj;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(635097576);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(userStore) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    makePrimaryEmailViewModel2 = makePrimaryEmailViewModel;
                    if (startRestartGroup.changedInstance(makePrimaryEmailViewModel2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    makePrimaryEmailViewModel2 = makePrimaryEmailViewModel;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                makePrimaryEmailViewModel2 = makePrimaryEmailViewModel;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
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
                        i3 &= -458753;
                        modifier4 = companion;
                        makePrimaryEmailViewModel4 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(635097576, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreen (MakePrimaryEmailScreen.kt:68)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.isSuccess(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.getErrorStrategy(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) collectAsStateWithLifecycle.getValue();
                        profileLoaded = !(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
                        if (profileLoaded != null || (user = profileLoaded.getUser()) == null || (profileEmails = user.getProfileEmails()) == null) {
                            profileEmail = null;
                        } else {
                            java.util.Iterator<T> it = profileEmails.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfileEmail) obj).getId(), str)) {
                                        break;
                                    }
                                }
                            }
                            profileEmail = (com.paypal.oslo.core.userstore.model.ProfileEmail) obj;
                        }
                        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        int i7 = i3 & 896;
                        z2 = i7 != 256;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$1$1(appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m20527invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20527invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        int i8 = i3;
                        makePrimaryEmailViewModel5 = makePrimaryEmailViewModel4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                        changedInstance = composer2.changedInstance(profileEmail);
                        rememberedValue4 = composer2.rememberedValue();
                        if (!changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$2$1(profileEmail, mutableState, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(profileEmail, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
                        boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue();
                        changed = composer2.changed(collectAsStateWithLifecycle3);
                        z3 = i7 != 256;
                        rememberedValue5 = composer2.rememberedValue();
                        if (!(changed | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1(appNavigator, collectAsStateWithLifecycle3, mutableState, null);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer2, 0);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance2 = composer2.changedInstance(makePrimaryEmailViewModel5);
                        z4 = i7 != 256;
                        rememberedValue6 = composer2.rememberedValue();
                        if (!(changedInstance2 | z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$4$1(makePrimaryEmailViewModel5, appNavigator, null);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer2, 6);
                        profileEmail2 = (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
                        if (profileEmail2 != null) {
                            composer2.startReplaceGroup(862988591);
                            composer2.endReplaceGroup();
                            makePrimaryEmailViewModel6 = makePrimaryEmailViewModel5;
                        } else {
                            composer2.startReplaceGroup(862988592);
                            boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy) collectAsStateWithLifecycle4.getValue();
                            boolean z6 = (i8 & 112) == 32;
                            boolean z7 = i7 == 256;
                            boolean changed2 = composer2.changed(rememberNavResultRequestId);
                            boolean changedInstance3 = composer2.changedInstance(makePrimaryEmailViewModel5);
                            boolean z8 = (i8 & 14) == 4;
                            java.lang.Object rememberedValue7 = composer2.rememberedValue();
                            if (((z7 | z6 | changed2 | changedInstance3) || z8) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                i4 = i7;
                                z5 = false;
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.$r8$lambda$wJEw_tucBwnx0r5OyCIP53IAgUA(z, appNavigator, rememberNavResultRequestId, makePrimaryEmailViewModel5, str, mutableState);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue7);
                            } else {
                                i4 = i7;
                                z5 = false;
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                            boolean z9 = i4 != 256 ? z5 : true;
                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                            if (z9 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.$r8$lambda$OCAje1vj8XXa9C7a9IxgpjiBlbs(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue8);
                            }
                            makePrimaryEmailViewModel6 = makePrimaryEmailViewModel5;
                            getHighResolutionOutputSizeshNQ4ISI(profileEmail2, booleanValue2, emailErrorStrategy, function0, (kotlin.jvm.functions.Function0) rememberedValue8, modifier4, composer2, (i8 << 3) & 458752, 0);
                            composer2.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        makePrimaryEmailViewModel3 = makePrimaryEmailViewModel6;
                        modifier3 = modifier4;
                    } else {
                        modifier4 = companion;
                    }
                }
                makePrimaryEmailViewModel4 = makePrimaryEmailViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle5 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle32 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.isSuccess(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle42 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makePrimaryEmailViewModel4.getErrorStrategy(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) collectAsStateWithLifecycle5.getValue();
                if (!(userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                }
                if (profileLoaded != null) {
                }
                profileEmail = null;
                final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                int i72 = i3 & 896;
                if (i72 != 256) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$1$1(appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                int i82 = i3;
                makePrimaryEmailViewModel5 = makePrimaryEmailViewModel4;
                composer2 = startRestartGroup;
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                changedInstance = composer2.changedInstance(profileEmail);
                rememberedValue4 = composer2.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$2$1(profileEmail, mutableState, null);
                composer2.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(profileEmail, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
                boolean booleanValue3 = ((java.lang.Boolean) collectAsStateWithLifecycle32.getValue()).booleanValue();
                changed = composer2.changed(collectAsStateWithLifecycle32);
                if (i72 != 256) {
                }
                rememberedValue5 = composer2.rememberedValue();
                if (!(changed | z3)) {
                }
                rememberedValue5 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1(appNavigator, collectAsStateWithLifecycle32, mutableState, null);
                composer2.updateRememberedValue(rememberedValue5);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue3), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer2, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance2 = composer2.changedInstance(makePrimaryEmailViewModel5);
                if (i72 != 256) {
                }
                rememberedValue6 = composer2.rememberedValue();
                if (!(changedInstance2 | z4)) {
                }
                rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$4$1(makePrimaryEmailViewModel5, appNavigator, null);
                composer2.updateRememberedValue(rememberedValue6);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer2, 6);
                profileEmail2 = (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
                if (profileEmail2 != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                makePrimaryEmailViewModel3 = makePrimaryEmailViewModel6;
                modifier3 = modifier4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                makePrimaryEmailViewModel3 = makePrimaryEmailViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.m20525$r8$lambda$fGpDgoy2NkrRjpodEinyUsPA7c(str, z, appNavigator, userStore, modifier3, makePrimaryEmailViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, final boolean z, final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1225213934);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(profileEmail) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(emailErrorStrategy) : startRestartGroup.changedInstance(emailErrorStrategy) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1225213934, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailContent (MakePrimaryEmailScreen.kt:150)");
                }
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
                if (emailErrorStrategy instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) {
                    startRestartGroup.startReplaceGroup(-1138706854);
                    com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable retryable = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) emailErrorStrategy;
                    int i5 = ((i3 << 3) & 57344) | 1769478;
                    modifier3 = modifier4;
                    com.paypal.oslo.feature.userprofile.ui.components.common.GenericErrorHalfSheetKt.GenericErrorHalfSheet(com.paypal.pds.core.Icon.Info.INSTANCE, retryable.getTitle(), retryable.getSubtitle(), retryable.getButtonText(), function0, "set_primary_email_retry_button", "set_primary_email_error_half_sheet", null, startRestartGroup, i5, 128);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-1138259803);
                    com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetKt.ConfirmationBottomSheet(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_change_primary_email_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_change_primary_email_confirmation_dialog_message, new java.lang.Object[]{profileEmail.getEmailAddress()}, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton[]{new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_confirm_button, startRestartGroup, 0), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, function0, "set_primary_email_confirm_button", z, null, 32, null), new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_cancel_button, startRestartGroup, 0), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, function02, "set_primary_email_cancel_button", false, null, 48, null)}), null, null, "set_primary_email_confirmation_bottom_sheet", null, null, startRestartGroup, 1572870, 432);
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
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.$r8$lambda$Bj8rWdjShmziAiMZ8GtzV0EnyiQ(com.paypal.oslo.core.userstore.model.ProfileEmail.this, z, emailErrorStrategy, function0, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bj8rWdjShmziAiMZ8GtzV0EnyiQ(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, boolean z, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(profileEmail, z, emailErrorStrategy, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OCAje1vj8XXa9C7a9IxgpjiBlbs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.m20526$r8$lambda$qbGLOEX1deJfhKD7Hx4tLiYL0o((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$cM0PQYEm7kp7yjmUQ23zJY2X9-o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20524$r8$lambda$cM0PQYEm7kp7yjmUQ23zJY2X9o(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
        if (profileEmail != null) {
            navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination(profileEmail.getId(), profileEmail.getEmailAddress(), true, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fGpDgoy2NkrRjpodEiny-UsPA7c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20525$r8$lambda$fGpDgoy2NkrRjpodEinyUsPA7c(java.lang.String str, boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MakePrimaryEmailScreen(str, z, appNavigator, userStore, modifier, makePrimaryEmailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qbGLOEX1deJfhKD7Hx4-tLiYL0o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20526$r8$lambda$qbGLOEX1deJfhKD7Hx4tLiYL0o(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailBottomSheetDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wJEw_tucBwnx0r5OyCIP53IAgUA(boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel, java.lang.String str2, final androidx.compose.runtime.MutableState mutableState) {
        if (z) {
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.m20524$r8$lambda$cM0PQYEm7kp7yjmUQ23zJY2X9o(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            makePrimaryEmailViewModel.makePrimaryEmail(str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.core.userstore.model.ProfileEmail access$MakePrimaryEmailScreen$lambda$5(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
    }
}
