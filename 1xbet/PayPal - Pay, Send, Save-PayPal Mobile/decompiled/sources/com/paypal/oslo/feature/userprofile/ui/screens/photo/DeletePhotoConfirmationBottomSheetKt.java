package com.paypal.oslo.feature.userprofile.ui.screens.photo;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"DeletePhotoConfirmationScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeletePhotoConfirmationBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeletePhotoConfirmationScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        int i6;
        java.lang.Object rememberedValue;
        int i7;
        java.lang.Object rememberedValue2;
        int i8;
        java.lang.Object rememberedValue3;
        boolean z;
        java.lang.Object rememberedValue4;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(796239626);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    photoUploadViewModel2 = photoUploadViewModel;
                    if (startRestartGroup.changedInstance(photoUploadViewModel2)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    photoUploadViewModel2 = photoUploadViewModel;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                photoUploadViewModel2 = photoUploadViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier4 = modifier2;
                } else {
                    modifier4 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, startRestartGroup, 0);
                        if (componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = componentActivity.getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        i5 = 0;
                        i6 = i4 & (-897);
                        photoUploadViewModel3 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.class), componentActivity, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(796239626, i6, -1, "com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationScreen (DeletePhotoConfirmationBottomSheet.kt:51)");
                        }
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_photo_title, startRestartGroup, i5);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_remove_warning, startRestartGroup, i5);
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_confirm_button, startRestartGroup, i5);
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_cancel_button, startRestartGroup, i5);
                        com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
                        com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto deletePhoto = com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto.INSTANCE;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$8OiuMwpsTg_Lv4WcpQ14IdYhXk4((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) obj));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                        int i11 = i6 & 14;
                        i7 = i11 != 4 ? 1 : i5;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (i7 == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$uobc9OUuYiySYr7wHiTHBeXqnQc(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        i8 = i11 != 4 ? 1 : i5;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (i8 == 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$Ib6U5t0RITINfXHLrkTir92fflE(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        z = i11 != 4;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.m20570$r8$lambda$crkJnFV9XOHf2KxX5opQXsHe0(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.StatefulConfirmationSheet(trash, stringResource, stringResource2, stringResource3, deletePhoto, "delete_photo_confirm_button", function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, modifier5, stringResource4, "delete_photo_cancel_button", photoUploadViewModel3, startRestartGroup, 1794054, ((i6 >> 3) & 14) | 384 | ((i6 << 3) & 7168), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                }
                i5 = 0;
                photoUploadViewModel3 = photoUploadViewModel2;
                i6 = i4;
                androidx.compose.ui.Modifier modifier52 = modifier4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_photo_title, startRestartGroup, i5);
                java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_remove_warning, startRestartGroup, i5);
                java.lang.String stringResource32 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_confirm_button, startRestartGroup, i5);
                java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_cancel_button, startRestartGroup, i5);
                com.paypal.pds.core.Icon.Trash trash2 = com.paypal.pds.core.Icon.Trash.INSTANCE;
                com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto deletePhoto2 = com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto.INSTANCE;
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                int i112 = i6 & 14;
                if (i112 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (i7 == 0) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$uobc9OUuYiySYr7wHiTHBeXqnQc(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                if (i112 != 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (i8 == 0) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$Ib6U5t0RITINfXHLrkTir92fflE(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue3;
                if (i112 != 4) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.m20570$r8$lambda$crkJnFV9XOHf2KxX5opQXsHe0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.StatefulConfirmationSheet(trash2, stringResource5, stringResource22, stringResource32, deletePhoto2, "delete_photo_confirm_button", function12, function03, function022, (kotlin.jvm.functions.Function0) rememberedValue4, modifier52, stringResource42, "delete_photo_cancel_button", photoUploadViewModel3, startRestartGroup, 1794054, ((i6 >> 3) & 14) | 384 | ((i6 << 3) & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                photoUploadViewModel3 = photoUploadViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel4 = photoUploadViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$WYf1n1OdithjMvZMU_Ck64X_JZY(com.paypal.oslo.core.navigation.AppNavigator.this, modifier3, photoUploadViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-crkJnF-V9XOHf2KxX5opQXsHe0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20570$r8$lambda$crkJnFV9XOHf2KxX5opQXsHe0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.m20572$r8$lambda$utIsDeIYKQzPNG7okwJU9PzOTk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4HeO9mT7tj4eSMofw1ZiKvgVoM0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$8OiuMwpsTg_Lv4WcpQ14IdYhXk4(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadUiState, "");
        return photoUploadUiState instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.DeletingInProgress;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ib6U5t0RITINfXHLrkTir92fflE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.m20571$r8$lambda$o7uwyovwO6vx0vqYxRZ9I7AqAQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WYf1n1OdithjMvZMU_Ck64X_JZY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeletePhotoConfirmationScreen(appNavigator, modifier, photoUploadViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o7uwyovwO6vx0vqYxRZ9I7A-qAQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20571$r8$lambda$o7uwyovwO6vx0vqYxRZ9I7AqAQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uobc9OUuYiySYr7wHiTHBeXqnQc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.$r8$lambda$4HeO9mT7tj4eSMofw1ZiKvgVoM0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$utIs-DeIYKQzPNG7okwJU9PzOTk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20572$r8$lambda$utIsDeIYKQzPNG7okwJU9PzOTk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
