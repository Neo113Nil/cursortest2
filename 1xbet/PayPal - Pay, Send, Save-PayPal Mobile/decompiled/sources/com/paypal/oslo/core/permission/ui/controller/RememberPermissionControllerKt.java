package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u001a\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u000b²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u008e\u0002"}, d2 = {"LocalPermissionViewModelOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/core/permission/ui/viewmodel/PermissionViewModel;", "getLocalPermissionViewModelOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPlatformPermissionDelegateOverride", "Lcom/paypal/oslo/core/permission/ui/controller/PlatformPermissionDelegate;", "getLocalPlatformPermissionDelegateOverride", "rememberPermissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "permission_release", "pendingContinuation", "Lkotlinx/coroutines/CancellableContinuation;", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RememberPermissionControllerKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel> getHighSpeedVideoFpsRanges = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.$r8$lambda$SLlPOyyTNX2eWNShNQeVlaaujlg();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.m11667$r8$lambda$H1jFuhtyufocsGnDnpccGJgmks();
        }
    });

    /* renamed from: $r8$lambda$H1jFuh-tyufocsGnDnpccGJgmks, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate m11667$r8$lambda$H1jFuhtyufocsGnDnpccGJgmks() {
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel $r8$lambda$SLlPOyyTNX2eWNShNQeVlaaujlg() {
        return null;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel> getLocalPermissionViewModelOverride() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate> getLocalPlatformPermissionDelegateOverride() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final com.paypal.oslo.core.permission.ui.controller.PermissionController rememberPermissionController(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-470735058, i, -1, "com.paypal.oslo.core.permission.ui.controller.rememberPermissionController (RememberPermissionController.kt:71)");
        }
        java.lang.Object obj = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        boolean changed = composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
            if (rememberedValue == null) {
                throw new java.lang.IllegalStateException("rememberPermissionController: LocalContext.current is not an Activity".toString());
            }
            composer.updateRememberedValue(rememberedValue);
        }
        android.app.Activity activity = (android.app.Activity) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.m11668$r8$lambda$p3jPawHUUIE2qY4jGaD9qR8cUc(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 48);
        com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate androidPlatformPermissionDelegate = (com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate) composer.consume(getHighSpeedVideoFpsRangesFor);
        if (androidPlatformPermissionDelegate == null) {
            composer.startReplaceGroup(-599192944);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate();
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            androidPlatformPermissionDelegate = (com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate) rememberedValue4;
        } else {
            composer.startReplaceGroup(-1404803955);
            composer.endReplaceGroup();
        }
        com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate platformPermissionDelegate = androidPlatformPermissionDelegate;
        com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel = (com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel) composer.consume(getHighSpeedVideoFpsRanges);
        if (permissionViewModel == null) {
            composer.startReplaceGroup(-1404797219);
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            permissionViewModel = (com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        } else {
            composer.startReplaceGroup(-1404798583);
        }
        com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel2 = permissionViewModel;
        composer.endReplaceGroup();
        boolean changed2 = composer.changed(platformPermissionDelegate);
        boolean changed3 = composer.changed(permissionViewModel2);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1(permissionViewModel2, platformPermissionDelegate, activity, rememberLauncherForActivityResult, mutableState);
            composer.updateRememberedValue(rememberedValue5);
        }
        com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1 rememberPermissionControllerKt$rememberPermissionController$1$1 = (com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1) rememberedValue5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberPermissionControllerKt$rememberPermissionController$1$1;
    }

    /* renamed from: $r8$lambda$p-3jPawHUUIE2qY4jGaD9qR8cUc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11668$r8$lambda$p3jPawHUUIE2qY4jGaD9qR8cUc(androidx.compose.runtime.MutableState mutableState, boolean z) {
        kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) mutableState.getValue();
        if (cancellableContinuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(z)));
        }
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }
}
