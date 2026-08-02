package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aK\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"DeletePhoneScreen", "", "phoneId", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeletePhoneViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeletePhoneViewModel;Landroidx/compose/runtime/Composer;II)V", "DeletePhoneContent", "phone", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "isLoading", "", "isError", "onConfirm", "Lkotlin/Function0;", "onCancel", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;", "isSuccess"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeletePhoneScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeletePhoneScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel2;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.Object obj;
        com.paypal.oslo.core.userstore.model.User user;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones;
        java.lang.Object obj2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-471554151);
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
                    deletePhoneViewModel2 = deletePhoneViewModel;
                    if (startRestartGroup.changedInstance(deletePhoneViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    deletePhoneViewModel2 = deletePhoneViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                deletePhoneViewModel2 = deletePhoneViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    deletePhoneViewModel3 = deletePhoneViewModel2;
                    i4 = 0;
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
                        i4 = 0;
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel4 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i5 = i3 & (-57345);
                        deletePhoneViewModel3 = deletePhoneViewModel4;
                    } else {
                        i4 = 0;
                        i5 = i3;
                        deletePhoneViewModel3 = deletePhoneViewModel2;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-471554151, i5, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreen (DeletePhoneScreen.kt:62)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(userStore.getUserState(), null, startRestartGroup, i4, 1);
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(deletePhoneViewModel3.isLoading(), null, startRestartGroup, i4, 1);
                androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(deletePhoneViewModel3.isSuccess(), null, startRestartGroup, i4, 1);
                androidx.compose.runtime.State collectAsState4 = androidx.compose.runtime.SnapshotStateKt.collectAsState(deletePhoneViewModel3.isError(), null, startRestartGroup, i4, 1);
                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) collectAsState.getValue();
                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
                if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (profilePhones = user.getProfilePhones()) == null) {
                    obj = null;
                } else {
                    java.util.Iterator<T> it = profilePhones.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfilePhone) obj2).getId(), str)) {
                                break;
                            }
                        }
                    }
                    obj = (com.paypal.oslo.core.userstore.model.ProfilePhone) obj2;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) obj;
                boolean booleanValue = ((java.lang.Boolean) collectAsState3.getValue()).booleanValue();
                boolean changed = startRestartGroup.changed(collectAsState3);
                boolean changedInstance = startRestartGroup.changedInstance(profilePhone);
                int i8 = i5 & 112;
                boolean z = i8 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z | changed | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$DeletePhoneScreen$1$1(profilePhone, appNavigator, collectAsState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                if (profilePhone != null) {
                    startRestartGroup.startReplaceGroup(769401497);
                    boolean booleanValue2 = ((java.lang.Boolean) collectAsState2.getValue()).booleanValue();
                    boolean booleanValue3 = ((java.lang.Boolean) collectAsState4.getValue()).booleanValue();
                    boolean changedInstance2 = startRestartGroup.changedInstance(deletePhoneViewModel3);
                    boolean z2 = (i5 & 14) == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.m20553$r8$lambda$fM6iS5dwmc_vNDks1Xk0euLLo(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel.this, str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean z3 = i8 == 32;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.m20552$r8$lambda$ByF4T4KHkssKwbSSxLELpy7ekk(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    getHighSpeedVideoFpsRangesFor(profilePhone, booleanValue2, booleanValue3, function0, (kotlin.jvm.functions.Function0) rememberedValue4, modifier3, startRestartGroup, (i5 << 6) & 458752, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(769724393);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                deletePhoneViewModel3 = deletePhoneViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.$r8$lambda$TbDcNx8MHsGI2XTvqpwHxvrBnTc(str, appNavigator, userStore, modifier4, deletePhoneViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-967544795);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(profilePhone) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-967544795, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneContent (DeletePhoneScreen.kt:103)");
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
                if (z2) {
                    startRestartGroup.startReplaceGroup(-1267548453);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong, startRestartGroup, 0);
                    modifier3 = modifier4;
                    i4 = 0;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, (java.lang.String) null, stringResource, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 116);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    i4 = 0;
                    startRestartGroup.startReplaceGroup(-1267238701);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetKt.ConfirmationBottomSheet(com.paypal.pds.core.Icon.Trash.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_photo_title, startRestartGroup, i4), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_phone_description, new java.lang.Object[]{profilePhone.getMaskedPhoneNumber()}, startRestartGroup, i4), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton[]{new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_remove, startRestartGroup, i4), com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, function0, "delete_phone_confirm_button", z, null, 32, null), new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_cancel_button, startRestartGroup, i4), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, function02, "delete_phone_cancel_button", false, null, 48, null)}), null, null, "delete_phone_confirmation_bottom_sheet", null, null, startRestartGroup, 1572870, 432);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.$r8$lambda$m3wjom1i2Hg1O2bzt1UpE6tCvAQ(com.paypal.oslo.core.userstore.model.ProfilePhone.this, z, z2, function0, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$ByF4T4KHkssKwbS-SxLELpy7ekk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20552$r8$lambda$ByF4T4KHkssKwbSSxLELpy7ekk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.$r8$lambda$NDJIehITwggZzCWFzVRK0DS62bk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NDJIehITwggZzCWFzVRK0DS62bk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.PhoneBottomSheetDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TbDcNx8MHsGI2XTvqpwHxvrBnTc(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeletePhoneScreen(str, appNavigator, userStore, modifier, deletePhoneViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fM6iS-5dw-mc_vNDks1Xk0euLLo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20553$r8$lambda$fM6iS5dwmc_vNDks1Xk0euLLo(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel deletePhoneViewModel, java.lang.String str) {
        deletePhoneViewModel.deletePhone(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m3wjom1i2Hg1O2bzt1UpE6tCvAQ(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(profilePhone, z, z2, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
