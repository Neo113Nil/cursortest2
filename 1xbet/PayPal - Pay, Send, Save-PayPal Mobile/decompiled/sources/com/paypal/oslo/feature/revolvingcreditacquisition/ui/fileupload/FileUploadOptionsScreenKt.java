package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aA\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"FileUploadOptionsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsViewModel;", "permissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsViewModel;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Landroidx/compose/runtime/Composer;II)V", "FileUploadOptionsContent", "onTakePhoto", "Lkotlin/Function0;", "onChoosePhoto", "onChooseDocument", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionRow", "icon", "Lcom/paypal/pds/core/Icon;", "text", "", "onClick", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-acquisition_prodRelease", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;", "photoFile", "Ljava/io/File;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FileUploadOptionsScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0178, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FileUploadOptionsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel2;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel3;
        final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel4;
        final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel5;
        com.paypal.oslo.core.permission.ui.controller.PermissionController rememberPermissionController;
        int i6;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        boolean changed;
        java.lang.Object obj;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        java.lang.Object rememberedValue4;
        boolean changedInstance3;
        java.lang.Object rememberedValue5;
        boolean changedInstance4;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$1$1 rememberedValue6;
        boolean changedInstance5;
        boolean changedInstance6;
        boolean changedInstance7;
        boolean changed2;
        boolean changedInstance8;
        boolean changedInstance9;
        boolean changedInstance10;
        java.lang.Object rememberedValue7;
        int i7;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState fileUploadOptionsState;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1565038883);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    fileUploadOptionsViewModel2 = fileUploadOptionsViewModel;
                    if (startRestartGroup.changedInstance(fileUploadOptionsViewModel2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    fileUploadOptionsViewModel2 = fileUploadOptionsViewModel;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                fileUploadOptionsViewModel2 = fileUploadOptionsViewModel;
            }
            if ((i & 3072) != 0) {
                permissionController2 = permissionController;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(permissionController2)) ? 2048 : 1024;
            } else {
                permissionController2 = permissionController;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier4 = modifier2;
                    fileUploadOptionsViewModel4 = fileUploadOptionsViewModel2;
                    i5 = 0;
                } else {
                    modifier4 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        i5 = 0;
                        fileUploadOptionsViewModel4 = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 &= -897;
                    } else {
                        i5 = 0;
                        fileUploadOptionsViewModel4 = fileUploadOptionsViewModel2;
                    }
                    if ((i2 & 8) != 0) {
                        int i10 = i4 & (-7169);
                        fileUploadOptionsViewModel5 = fileUploadOptionsViewModel4;
                        rememberPermissionController = com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.rememberPermissionController(startRestartGroup, i5);
                        i6 = i10;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1565038883, i6, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreen (FileUploadOptionsScreen.kt:83)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(fileUploadOptionsViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    java.io.File createImageFile;
                                    createImageFile = com.paypal.oslo.feature.revolvingcreditacquisition.utils.ContextExtensionsKt.createImageFile(context);
                                    return createImageFile;
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final kotlin.Lazy lazy = (kotlin.Lazy) rememberedValue2;
                        changed = startRestartGroup.changed(context);
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changed) {
                            obj = rememberedValue8;
                        }
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$n3AnBgsRJbUTRjirmSbPV8woRsI(context, lazy);
                            }
                        };
                        startRestartGroup.updateRememberedValue(function0);
                        obj = function0;
                        final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj;
                        androidx.activity.result.contract.ActivityResultContracts.TakePicture takePicture = new androidx.activity.result.contract.ActivityResultContracts.TakePicture();
                        changedInstance = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$8k6AodU7obQ7Ygn5iEs0UOSdaek(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, i5);
                        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia pickVisualMedia = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia();
                        changedInstance2 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.m17989$r8$lambda$S43WaS2o8Umg4TbM4MMKg0ZrT8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, (android.net.Uri) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i5);
                        androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
                        changedInstance3 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$LqkTmIiojCmJ8YxKIBsLzhCSODk(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, (androidx.view.result.ActivityResult) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult3 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, i5);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance4 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$1$1(fileUploadOptionsViewModel5, null);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect> uiEffect = fileUploadOptionsViewModel5.getUiEffect();
                        changedInstance5 = startRestartGroup.changedInstance(coroutineScope);
                        changedInstance6 = startRestartGroup.changedInstance(rememberPermissionController);
                        changedInstance7 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                        changed2 = startRestartGroup.changed(function02);
                        changedInstance8 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                        changedInstance9 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
                        changedInstance10 = startRestartGroup.changedInstance(rememberLauncherForActivityResult3);
                        if ((i6 & 14) == 4) {
                            i5 = 1;
                        }
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (((changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0) | (changedInstance7 ? 1 : 0) | (changed2 ? 1 : 0) | (changedInstance8 ? 1 : 0) | (changedInstance9 ? 1 : 0) | (changedInstance10 ? 1 : 0) | i5) == 0 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel6 = fileUploadOptionsViewModel5;
                            final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController4 = rememberPermissionController;
                            i7 = i6;
                            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope.this, function02, fileUploadOptionsViewModel6, rememberLauncherForActivityResult, rememberLauncherForActivityResult2, rememberLauncherForActivityResult3, permissionController4, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect) obj2);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function1);
                            rememberedValue7 = function1;
                        } else {
                            i7 = i6;
                        }
                        com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect, null, null, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, 0, 6);
                        fileUploadOptionsState = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState) collectAsStateWithLifecycle.getValue();
                        if (!(fileUploadOptionsState instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial)) {
                            startRestartGroup.startReplaceGroup(2095850289);
                            startRestartGroup.endReplaceGroup();
                        } else if (fileUploadOptionsState instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready) {
                            startRestartGroup.startReplaceGroup(2095987557);
                            boolean changedInstance11 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (changedInstance11 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$vBgSWL2884EF6FO91RQwh2as93U(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue9;
                            boolean changedInstance12 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (changedInstance12 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$SUgLw5FpOppq7zQiBcAtxsMwTb8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue10;
                            boolean changedInstance13 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                            if (changedInstance13 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.m17987$r8$lambda$66GYv5V_nFOp6vFbdsJ4yHymXg(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                            }
                            getHighSpeedVideoFpsRanges(function03, function04, (kotlin.jvm.functions.Function0) rememberedValue11, modifier4, startRestartGroup, (i7 << 6) & 7168, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-763677375);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        fileUploadOptionsViewModel3 = fileUploadOptionsViewModel5;
                        permissionController3 = rememberPermissionController;
                        modifier3 = modifier4;
                    }
                }
                i6 = i4;
                rememberPermissionController = permissionController2;
                fileUploadOptionsViewModel5 = fileUploadOptionsViewModel4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(fileUploadOptionsViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final kotlin.Lazy lazy2 = (kotlin.Lazy) rememberedValue2;
                changed = startRestartGroup.changed(context2);
                java.lang.Object rememberedValue82 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$n3AnBgsRJbUTRjirmSbPV8woRsI(context2, lazy2);
                    }
                };
                startRestartGroup.updateRememberedValue(function05);
                obj = function05;
                final kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) obj;
                androidx.activity.result.contract.ActivityResultContracts.TakePicture takePicture2 = new androidx.activity.result.contract.ActivityResultContracts.TakePicture();
                changedInstance = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$8k6AodU7obQ7Ygn5iEs0UOSdaek(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult4 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture2, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, i5);
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia pickVisualMedia2 = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia();
                changedInstance2 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.m17989$r8$lambda$S43WaS2o8Umg4TbM4MMKg0ZrT8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, (android.net.Uri) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult22 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia2, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i5);
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult2 = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
                changedInstance3 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$LqkTmIiojCmJ8YxKIBsLzhCSODk(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel.this, (androidx.view.result.ActivityResult) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult32 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, i5);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance4 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue6 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$1$1(fileUploadOptionsViewModel5, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect> uiEffect2 = fileUploadOptionsViewModel5.getUiEffect();
                changedInstance5 = startRestartGroup.changedInstance(coroutineScope2);
                changedInstance6 = startRestartGroup.changedInstance(rememberPermissionController);
                changedInstance7 = startRestartGroup.changedInstance(fileUploadOptionsViewModel5);
                changed2 = startRestartGroup.changed(function022);
                changedInstance8 = startRestartGroup.changedInstance(rememberLauncherForActivityResult4);
                changedInstance9 = startRestartGroup.changedInstance(rememberLauncherForActivityResult22);
                changedInstance10 = startRestartGroup.changedInstance(rememberLauncherForActivityResult32);
                if ((i6 & 14) == 4) {
                }
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (((changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0) | (changedInstance7 ? 1 : 0) | (changed2 ? 1 : 0) | (changedInstance8 ? 1 : 0) | (changedInstance9 ? 1 : 0) | (changedInstance10 ? 1 : 0) | i5) == 0) {
                }
                final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel62 = fileUploadOptionsViewModel5;
                final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController42 = rememberPermissionController;
                i7 = i6;
                kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope.this, function022, fileUploadOptionsViewModel62, rememberLauncherForActivityResult4, rememberLauncherForActivityResult22, rememberLauncherForActivityResult32, permissionController42, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect) obj2);
                        return highSpeedVideoFpsRangesFor;
                    }
                };
                startRestartGroup.updateRememberedValue(function12);
                rememberedValue7 = function12;
                com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect2, null, null, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, 0, 6);
                fileUploadOptionsState = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState) collectAsStateWithLifecycle2.getValue();
                if (!(fileUploadOptionsState instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial)) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                fileUploadOptionsViewModel3 = fileUploadOptionsViewModel5;
                permissionController3 = rememberPermissionController;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                fileUploadOptionsViewModel3 = fileUploadOptionsViewModel2;
                permissionController3 = permissionController2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$N47uL_LGNH4cvF_NxsW8Q097Eg8(com.paypal.oslo.core.navigation.AppNavigator.this, modifier3, fileUploadOptionsViewModel3, permissionController3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher2, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher3, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect fileUploadOptionsUiEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUploadOptionsUiEffect, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fileUploadOptionsUiEffect, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.RequestCameraPermission.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1(permissionController, fileUploadOptionsViewModel, null), 3, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fileUploadOptionsUiEffect, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchCamera.INSTANCE)) {
            try {
                android.net.Uri uri = (android.net.Uri) function0.invoke();
                kotlin.jvm.internal.Intrinsics.checkNotNull(uri);
                fileUploadOptionsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated(uri));
                managedActivityResultLauncher.launch(uri);
            } catch (java.lang.IllegalArgumentException e) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, "FileProvider not available in test environment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
                fileUploadOptionsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult(false, null, 2, null));
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fileUploadOptionsUiEffect, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchPhotoPicker.INSTANCE)) {
            managedActivityResultLauncher2.launch(androidx.view.result.PickVisualMediaRequestKt.PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fileUploadOptionsUiEffect, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchDocumentPicker.INSTANCE)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
            intent.setType("application/pdf");
            intent.addCategory("android.intent.category.OPENABLE");
            managedActivityResultLauncher3.launch(intent);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fileUploadOptionsUiEffect, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.NavigateToSettings.INSTANCE)) {
            permissionController.navigateToPermissionSettings();
        } else {
            if (!(fileUploadOptionsUiEffect instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.$r8$lambda$c7ZmqIZI1nOJZxyMThgYfckq5wI(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(564836742);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(564836742, i3, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsContent (FileUploadOptionsScreen.kt:215)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                Camera2StreamConfigurationMap(com.paypal.pds.core.Icon.Camera.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditacquisition.R.string.feature_revolvingcredit_acquisition_file_upload_take_photo, startRestartGroup, 0), function0, null, startRestartGroup, ((i3 << 6) & 896) | 6, 8);
                Camera2StreamConfigurationMap(com.paypal.pds.core.Icon.Image.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditacquisition.R.string.feature_revolvingcredit_acquisition_file_upload_photo_library, startRestartGroup, 0), function02, null, startRestartGroup, ((i3 << 3) & 896) | 6, 8);
                Camera2StreamConfigurationMap(com.paypal.pds.core.Icon.Document.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditacquisition.R.string.feature_revolvingcredit_acquisition_file_upload_browse, startRestartGroup, 0), function03, null, startRestartGroup, (i3 & 896) | 6, 8);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.m17986$r8$lambda$RUfJevX4UQst9fF_kdAOi12UtQ(kotlin.jvm.functions.Function0.this, function02, function03, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.pds.core.Icon icon, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1277849141);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1277849141, i3, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.OptionRow (FileUploadOptionsScreen.kt:245)");
                }
                modifier3 = modifier4;
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, false, null, null, function0, startRestartGroup, (i3 << 12) & 3670016, 31), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                com.paypal.pds.components.IconKt.Icon(icon, str, null, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112), 12);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, (i3 >> 3) & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.m17988$r8$lambda$8LrcwuUYTDBPlxBGtYfKdI748g(com.paypal.pds.core.Icon.this, str, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-RUfJevX4UQst9fF_kdAOi12UtQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17986$r8$lambda$RUfJevX4UQst9fF_kdAOi12UtQ(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(function0, function02, function03, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$66GYv5V_nFOp6vFbdsJ4y-HymXg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17987$r8$lambda$66GYv5V_nFOp6vFbdsJ4yHymXg(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel) {
        fileUploadOptionsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChooseDocumentClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8LrcwuUYTDBPlxB-GtYfKdI748g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17988$r8$lambda$8LrcwuUYTDBPlxBGtYfKdI748g(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(icon, str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8k6AodU7obQ7Ygn5iEs0UOSdaek(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, boolean z) {
        fileUploadOptionsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult(z, null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LqkTmIiojCmJ8YxKIBsLzhCSODk(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        android.content.Intent data = activityResult.getData();
        fileUploadOptionsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult(data != null ? data.getData() : null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N47uL_LGNH4cvF_NxsW8Q097Eg8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FileUploadOptionsScreen(appNavigator, modifier, fileUploadOptionsViewModel, permissionController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S43WaS2o8U-mg4TbM4MMKg0ZrT8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17989$r8$lambda$S43WaS2o8Umg4TbM4MMKg0ZrT8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, android.net.Uri uri) {
        fileUploadOptionsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult(uri));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SUgLw5FpOppq7zQiBcAtxsMwTb8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel) {
        fileUploadOptionsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChoosePhotoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c7ZmqIZI1nOJZxyMThgYfckq5wI(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect fileUploadOptionsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.result.FileUploadPhotoResultNavResult(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult) fileUploadOptionsUiEffect).getUri()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ android.net.Uri $r8$lambda$n3AnBgsRJbUTRjirmSbPV8woRsI(android.content.Context context, kotlin.Lazy lazy) {
        java.lang.String packageName = context.getPackageName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(packageName);
        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.FILE_PROVIDER_AUTHORITY_SUFFIX);
        return androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), (java.io.File) lazy.getValue());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vBgSWL2884EF6FO91RQwh2as93U(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel) {
        fileUploadOptionsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnTakePhotoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
