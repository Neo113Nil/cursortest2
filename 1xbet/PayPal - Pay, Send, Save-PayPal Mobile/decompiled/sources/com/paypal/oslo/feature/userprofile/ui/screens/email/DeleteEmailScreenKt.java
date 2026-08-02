package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aM\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, d2 = {"DeleteEmailScreen", "", "emailId", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeleteEmailViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeleteEmailViewModel;Landroidx/compose/runtime/Composer;II)V", "DeleteEmailContent", "email", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "isLoading", "", "errorStrategy", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "onConfirm", "Lkotlin/Function0;", "onCancel", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;ZLcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;", "isSuccess"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeleteEmailScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeleteEmailScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel2;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        java.lang.Object rememberedValue;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        boolean changed;
        boolean z;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        boolean z2;
        java.lang.Object rememberedValue4;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail2;
        com.paypal.oslo.core.userstore.model.User user;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails;
        java.lang.Object obj;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1762767335);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(userStore) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    deleteEmailViewModel2 = deleteEmailViewModel;
                    if (startRestartGroup.changedInstance(deleteEmailViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    deleteEmailViewModel2 = deleteEmailViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                deleteEmailViewModel2 = deleteEmailViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = 2;
                } else {
                    modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i4 = 2;
                        i5 = i3 & (-57345);
                        deleteEmailViewModel3 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1762767335, i5, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreen (DeleteEmailScreen.kt:63)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.isSuccess(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.getErrorStrategy(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
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
                        changedInstance = startRestartGroup.changedInstance(profileEmail);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$1$1(profileEmail, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(profileEmail, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                        boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue();
                        changed = startRestartGroup.changed(collectAsStateWithLifecycle3);
                        int i8 = i5 & 112;
                        z = i8 != 32;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(changed | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$2$1(appNavigator, collectAsStateWithLifecycle3, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance2 = startRestartGroup.changedInstance(deleteEmailViewModel3);
                        z2 = i8 != 32;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!(changedInstance2 | z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1(deleteEmailViewModel3, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                        profileEmail2 = (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
                        if (profileEmail2 != null) {
                            startRestartGroup.startReplaceGroup(-34804391);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-34804390);
                            boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy) collectAsStateWithLifecycle4.getValue();
                            boolean changedInstance3 = startRestartGroup.changedInstance(deleteEmailViewModel3);
                            boolean z3 = (i5 & 14) == 4;
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((changedInstance3 | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.$r8$lambda$MBgw5JAXtgg4I568yo0pDepPYB8(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel.this, str);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                            boolean z4 = i8 == 32;
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.$r8$lambda$FpQSRs6sqb4ur3Lo_Uae8L499oE(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            getHighSpeedVideoFpsRangesFor(profileEmail2, booleanValue2, emailErrorStrategy, function0, (kotlin.jvm.functions.Function0) rememberedValue6, modifier3, startRestartGroup, (i5 << 6) & 458752, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        i4 = 2;
                        modifier2 = modifier3;
                    }
                }
                i5 = i3;
                modifier3 = modifier2;
                deleteEmailViewModel3 = deleteEmailViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle5 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle32 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.isSuccess(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle42 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(deleteEmailViewModel3.getErrorStrategy(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) collectAsStateWithLifecycle5.getValue();
                if (!(userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                }
                if (profileLoaded != null) {
                }
                profileEmail = null;
                changedInstance = startRestartGroup.changedInstance(profileEmail);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$1$1(profileEmail, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(profileEmail, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                boolean booleanValue3 = ((java.lang.Boolean) collectAsStateWithLifecycle32.getValue()).booleanValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle32);
                int i82 = i5 & 112;
                if (i82 != 32) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changed | z)) {
                }
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$2$1(appNavigator, collectAsStateWithLifecycle32, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue3), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(deleteEmailViewModel3);
                if (i82 != 32) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z2)) {
                }
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1(deleteEmailViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                profileEmail2 = (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState2.getValue();
                if (profileEmail2 != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                deleteEmailViewModel3 = deleteEmailViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.m20517$r8$lambda$49HScj_UYwUmzCtNfUBhHO4qos(str, appNavigator, userStore, modifier4, deleteEmailViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, final boolean z, final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1327247044);
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1327247044, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailContent (DeleteEmailScreen.kt:120)");
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
                    startRestartGroup.startReplaceGroup(-1043999338);
                    com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable retryable = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) emailErrorStrategy;
                    int i5 = ((i3 << 3) & 57344) | 1769478;
                    modifier3 = modifier4;
                    com.paypal.oslo.feature.userprofile.ui.components.common.GenericErrorHalfSheetKt.GenericErrorHalfSheet(com.paypal.pds.core.Icon.Info.INSTANCE, retryable.getTitle(), retryable.getSubtitle(), retryable.getButtonText(), function0, "delete_email_retry_button", "delete_email_error_half_sheet", null, startRestartGroup, i5, 128);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-1043567446);
                    com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetKt.ConfirmationBottomSheet(com.paypal.pds.core.Icon.Trash.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_this_email, startRestartGroup, 0), profileEmail.getEmailAddress(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton[]{new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_yes_delete, startRestartGroup, 0), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, function0, "delete_email_confirm_button", z, null, 32, null), new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_no_keep_it, startRestartGroup, 0), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, function02, "delete_email_cancel_button", false, null, 48, null)}), null, null, "delete_email_confirmation_bottom_sheet", null, null, startRestartGroup, 1572870, 432);
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.m20518$r8$lambda$uLfxenqU6gVBl9bVZinPoJvVZU(com.paypal.oslo.core.userstore.model.ProfileEmail.this, z, emailErrorStrategy, function0, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$49HScj_U-YwUmzCtNfUBhHO4qos, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20517$r8$lambda$49HScj_UYwUmzCtNfUBhHO4qos(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeleteEmailScreen(str, appNavigator, userStore, modifier, deleteEmailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FpQSRs6sqb4ur3Lo_Uae8L499oE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.$r8$lambda$h9VDP7SMNCmKUh9_JHOcvayCq_I((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MBgw5JAXtgg4I568yo0pDepPYB8(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, java.lang.String str) {
        deleteEmailViewModel.deleteEmail(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h9VDP7SMNCmKUh9_JHOcvayCq_I(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailBottomSheetDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uLfxenqU6gVBl-9bVZinPoJvVZU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20518$r8$lambda$uLfxenqU6gVBl9bVZinPoJvVZU(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, boolean z, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy emailErrorStrategy, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(profileEmail, z, emailErrorStrategy, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.core.userstore.model.ProfileEmail access$DeleteEmailScreen$lambda$5(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.core.userstore.model.ProfileEmail) mutableState.getValue();
    }
}
