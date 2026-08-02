package com.paypal.oslo.feature.userprofile.ui.screens.photo;

@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aI\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a6\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a=\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010'\u001a\u00020$2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010(¨\u0006)²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"ProfilePhotoOptionsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "modifier", "Landroidx/compose/ui/Modifier;", "permissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;Landroidx/compose/runtime/Composer;II)V", "HandleUploadStateChanges", "uploadState", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "previousUploadState", "Landroidx/compose/runtime/MutableState;", "ugcmSheetShown", "", "context", "Landroid/content/Context;", "(Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "HandleUgcmError", "ugcmError", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$UgcmError;", "createCameraResultHandler", "Lkotlin/Function1;", "photoFile", "Ljava/io/File;", "createPhotoPickerResultHandler", "Landroid/net/Uri;", "OptionRow", "icon", "Lcom/paypal/pds/core/Icon;", "text", "", "onClick", "Lkotlin/Function0;", "testTag", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfilePhotoOptionsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfilePhotoOptionsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController3;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer composer3;
        int i4;
        java.lang.String str;
        final android.content.Context context;
        boolean z;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController5;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1339318239);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(userStore) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    permissionController2 = permissionController;
                    if (startRestartGroup.changedInstance(permissionController2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    permissionController2 = permissionController;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                permissionController2 = permissionController;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    photoUploadViewModel2 = photoUploadViewModel;
                    if (startRestartGroup.changedInstance(photoUploadViewModel2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    photoUploadViewModel2 = photoUploadViewModel;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                photoUploadViewModel2 = photoUploadViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    permissionController4 = permissionController2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        permissionController3 = com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.rememberPermissionController(startRestartGroup, 0);
                        i3 &= -7169;
                    } else {
                        permissionController3 = permissionController2;
                    }
                    if ((i2 & 16) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, startRestartGroup, 0);
                        if (componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = componentActivity.getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        i3 &= -57345;
                        photoUploadViewModel2 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.class), componentActivity, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    }
                    modifier3 = companion;
                    permissionController4 = permissionController3;
                }
                com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel4 = photoUploadViewModel2;
                int i8 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1339318239, i8, -1, "com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreen (ProfilePhotoOptionsScreen.kt:112)");
                }
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(photoUploadViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = 2;
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    composer3 = startRestartGroup;
                    composer3.updateRememberedValue(rememberedValue2);
                } else {
                    composer3 = startRestartGroup;
                    i4 = 2;
                }
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                java.lang.Object rememberedValue3 = composer3.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle.INSTANCE, null, i4, null);
                    composer3.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.Composer composer4 = composer3;
                getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) collectAsStateWithLifecycle.getValue(), (androidx.compose.runtime.MutableState) rememberedValue3, mutableState, appNavigator, photoUploadViewModel4, context2, composer3, ((i8 << 9) & 7168) | 432 | (57344 & i8));
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer4, 0, 7);
                if (((com.paypal.oslo.core.userstore.model.UserState) collectAsStateWithLifecycle2.getValue()) instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                    com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) collectAsStateWithLifecycle2.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(userState, "");
                    str = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfileImageURL();
                } else {
                    str = null;
                }
                java.lang.String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    context = context2;
                    composer2 = composer4;
                    z = true;
                } else {
                    context = context2;
                    composer2 = composer4;
                    z = false;
                }
                boolean changedInstance = composer2.changedInstance(context);
                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            java.io.File createImageFile;
                            createImageFile = com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.createImageFile(context);
                            return createImageFile;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                final kotlin.Lazy lazy = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0) rememberedValue4);
                boolean changedInstance2 = composer2.changedInstance(context);
                boolean changedInstance3 = composer2.changedInstance(lazy);
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if ((changedInstance2 | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$WYcojTG1z4JaZ139mLQInZpxEQY(context, lazy);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.TakePicture(), createCameraResultHandler((java.io.File) lazy.getValue(), photoUploadViewModel4), composer2, 0);
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia(), createPhotoPickerResultHandler(photoUploadViewModel4), composer2, 0);
                boolean changedInstance4 = composer2.changedInstance(coroutineScope);
                boolean changedInstance5 = composer2.changedInstance(permissionController4);
                boolean changed = composer2.changed(function0);
                boolean changedInstance6 = composer2.changedInstance(rememberLauncherForActivityResult);
                java.lang.Object rememberedValue6 = composer2.rememberedValue();
                if ((changedInstance4 | changedInstance5 | changed | changedInstance6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$AYiMRFD0p5fIA0_1Od5WzWeWjgs(kotlinx.coroutines.CoroutineScope.this, permissionController4, function0, rememberLauncherForActivityResult);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance7 = composer2.changedInstance(rememberLauncherForActivityResult2);
                java.lang.Object rememberedValue7 = composer2.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$cEmW2tfRQ0cd4ClcnJyCp8pdNEY(androidx.view.compose.ManagedActivityResultLauncher.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
                if (((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Uploading) {
                    composer2.startReplaceGroup(621472152);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing48());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
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
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion2);
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
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer2, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    photoUploadViewModel3 = photoUploadViewModel4;
                    permissionController5 = permissionController4;
                    modifier4 = modifier3;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_uploading_text, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    photoUploadViewModel3 = photoUploadViewModel4;
                    permissionController5 = permissionController4;
                    modifier4 = modifier3;
                    composer2.startReplaceGroup(622172504);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.runtime.Composer composer5 = composer2;
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.core.Icon.Camera.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_take, composer2, 0), function02, "photo_option_take_new_photo", null, composer5, 3078, 16);
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.core.Icon.Image.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_choose_existing, composer2, 0), function03, "photo_option_choose_existing", null, composer5, 3078, 16);
                    if (!z) {
                        composer2.startReplaceGroup(827947597);
                        com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_photo_delete, composer2, 0);
                        boolean z2 = (i8 & 14) == 4;
                        java.lang.Object rememberedValue8 = composer2.rememberedValue();
                        if (z2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$LfhmXtUXXmBoHsWx5xyGTIxAZ1I(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        getHighResolutionOutputSizeshNQ4ISI(trash, stringResource, (kotlin.jvm.functions.Function0) rememberedValue8, "photo_option_delete_photo", null, composer2, 3078, 16);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(828372359);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                permissionController2 = permissionController5;
                modifier2 = modifier4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                photoUploadViewModel3 = photoUploadViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.m20574$r8$lambda$S2mfq7qmzY0a8kc9ILMW_jn4(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, modifier2, permissionController2, photoUploadViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState, final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableState, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, final android.content.Context context, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1724163508);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(photoUploadUiState) : startRestartGroup.changedInstance(photoUploadUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(photoUploadViewModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1724163508, i2, -1, "com.paypal.oslo.feature.userprofile.ui.screens.photo.HandleUploadStateChanges (ProfilePhotoOptionsScreen.kt:283)");
            }
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(photoUploadUiState));
            boolean z2 = (i2 & 7168) == 2048;
            boolean changedInstance = startRestartGroup.changedInstance(photoUploadViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            boolean z3 = (i2 & 896) == 256;
            boolean z4 = (i2 & 112) == 32;
            com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z | z2 | changedInstance | changedInstance2 | z3) || z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                rememberedValue = new com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1(photoUploadUiState, appNavigator, photoUploadViewModel, context, mutableState2, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = i4;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(photoUploadUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$kgYAfQ1LrKwo6Jw76YJmrzX04ow(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.this, mutableState, mutableState2, appNavigator, photoUploadViewModel, context, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> createCameraResultHandler(final java.io.File file, final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadViewModel, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$Hn9t9nWo5BbyMVkVmsHC0fFgSAg(file, photoUploadViewModel, ((java.lang.Boolean) obj).booleanValue());
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> createPhotoPickerResultHandler(final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadViewModel, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$4vEFe2VbXuSXWwaw2SxyCSpRMHU(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.this, (android.net.Uri) obj);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.pds.core.Icon icon, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1923629874);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1923629874, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.photo.OptionRow (ProfilePhotoOptionsScreen.kt:383)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, false, null, null, function0, startRestartGroup, (i3 << 12) & 3670016, 31), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16()), str2);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                com.paypal.pds.components.IconKt.Icon(icon, null, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i3 & 14) | 24624, 8);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, (i3 >> 3) & 14, 0, 2046);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$MF_U4gse0nZ9fi3g3vZSt9Yd3dA(com.paypal.pds.core.Icon.this, str, function0, str2, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4vEFe2VbXuSXWwaw2SxyCSpRMHU(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, android.net.Uri uri) {
        com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.handlePhotoPickerResult(uri, photoUploadViewModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AYiMRFD0p5fIA0_1Od5WzWeWjgs(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, kotlin.jvm.functions.Function0 function0, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1(permissionController, function0, managedActivityResultLauncher, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D2L8gL5K13ASSINdJkGMDSBo1TE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hn9t9nWo5BbyMVkVmsHC0fFgSAg(java.io.File file, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, boolean z) {
        com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.handleCameraCaptureResult(z, file, photoUploadViewModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LfhmXtUXXmBoHsWx5xyGTIxAZ1I(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$mwQOomMULXJTv5iQJuMfOV2JFqY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MF_U4gse0nZ9fi3g3vZSt9Yd3dA(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(icon, str, function0, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S2mfq7--qmzY0a8k-c9ILMW_jn4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20574$r8$lambda$S2mfq7qmzY0a8kc9ILMW_jn4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProfilePhotoOptionsScreen(appNavigator, userStore, modifier, permissionController, photoUploadViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ android.net.Uri $r8$lambda$WYcojTG1z4JaZ139mLQInZpxEQY(android.content.Context context, kotlin.Lazy lazy) {
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(packageName);
        sb.append(".feature.userprofile.fileprovider");
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), (java.io.File) lazy.getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriForFile, "");
        return uriForFile;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cEmW2tfRQ0cd4ClcnJyCp8pdNEY(androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(androidx.view.result.PickVisualMediaRequestKt.PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kgYAfQ1LrKwo6Jw76YJmrzX04ow(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, android.content.Context context, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(photoUploadUiState, mutableState, mutableState2, appNavigator, photoUploadViewModel, context, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mwQOomMULXJTv5iQJuMfOV2JFqY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pJqLhNNpTzv4tjnZ0ZRIMZ_VVig(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$HandleUgcmError(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError ugcmError, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, android.content.Context context) {
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(ugcmError.getErrorCode(), com.paypal.oslo.feature.userprofile.domain.model.FailureMessage.UGCM_CSAM_ERROR_CODE)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$pJqLhNNpTzv4tjnZ0ZRIMZ_VVig((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else {
            android.widget.Toast.makeText(context, ugcmError.getErrorMessage(), 1).show();
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.$r8$lambda$D2L8gL5K13ASSINdJkGMDSBo1TE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            photoUploadViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset.INSTANCE);
        }
    }
}
