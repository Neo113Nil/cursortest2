package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/permission/ui/controller/RememberPermissionControllerKt$rememberPermissionController$1$1;", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;", "request", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "requestPermission", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "navigateToPermissionSettings", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RememberPermissionControllerKt$rememberPermissionController$1$1 implements com.paypal.oslo.core.permission.ui.controller.PermissionController {
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlinx.coroutines.CancellableContinuation<java.lang.Boolean>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel getHighSpeedVideoSizes;

    RememberPermissionControllerKt$rememberPermissionController$1$1(com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel, com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate platformPermissionDelegate, android.app.Activity activity, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher, androidx.compose.runtime.MutableState<kotlinx.coroutines.CancellableContinuation<java.lang.Boolean>> mutableState) {
        this.getHighSpeedVideoSizes = permissionViewModel;
        this.getHighSpeedVideoFpsRangesFor = platformPermissionDelegate;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
        this.Camera2StreamConfigurationMap = managedActivityResultLauncher;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ae, code lost:
    
        if (r7.updatePermissionRequestedState(r15, true, r2) != r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r4.updatePermissionRequestedState(r1, true, r2) != r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // com.paypal.oslo.core.permission.ui.controller.PermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestPermission(com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.permission.domain.model.PermissionStatus> continuation) {
        com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1 rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1;
        int i;
        boolean shouldShowRationale;
        com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest2;
        java.lang.String str;
        boolean booleanValue;
        java.lang.Object launchPermissionRequest;
        boolean z;
        com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest3;
        boolean z2;
        boolean booleanValue2;
        boolean shouldShowRationale2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (continuation instanceof com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1) {
            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1 = (com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1) continuation;
            if ((rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String permission = permissionRequest.getType().getPermission();
                    if (permission.length() == 0) {
                        return this.getHighSpeedVideoSizes.evaluatePermissionStatus(true, false, false);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.isPermissionGranted(this.getHighResolutionOutputSizeshNQ4ISI, permission)) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.permission.LoggerKt.log, "Permission granted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, permission), kotlin.TuplesKt.to("reason", permissionRequest.getReason()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, permissionRequest.getModuleName())), null, 4, null);
                        com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel = this.getHighSpeedVideoSizes;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(permissionRequest);
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(permission);
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 1;
                    } else {
                        shouldShowRationale = this.getHighSpeedVideoFpsRangesFor.shouldShowRationale(this.getHighResolutionOutputSizeshNQ4ISI, permission);
                        com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel2 = this.getHighSpeedVideoSizes;
                        permissionRequest2 = permissionRequest;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = permissionRequest2;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = permission;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap = shouldShowRationale;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 2;
                        java.lang.Object hasPermissionBeenRequested = permissionViewModel2.hasPermissionBeenRequested(permission, rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1);
                        if (hasPermissionBeenRequested != coroutine_suspended) {
                            str = permission;
                            obj = hasPermissionBeenRequested;
                            booleanValue = ((java.lang.Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                            com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate platformPermissionDelegate = this.getHighSpeedVideoFpsRangesFor;
                            androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher = this.Camera2StreamConfigurationMap;
                            final androidx.compose.runtime.MutableState<kotlinx.coroutines.CancellableContinuation<java.lang.Boolean>> mutableState = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1.m11669$r8$lambda$IJdZJ2JLQkUZ93YRT0MK762i4(androidx.compose.runtime.MutableState.this, (kotlinx.coroutines.CancellableContinuation) obj2);
                                }
                            };
                            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = permissionRequest2;
                            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = str;
                            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap = shouldShowRationale;
                            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges = booleanValue;
                            rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 3;
                            launchPermissionRequest = platformPermissionDelegate.launchPermissionRequest(managedActivityResultLauncher, function1, str, rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1);
                            if (launchPermissionRequest != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return this.getHighSpeedVideoSizes.evaluatePermissionStatus(true, false, false);
                }
                if (i == 2) {
                    shouldShowRationale = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap;
                    java.lang.String str2 = (java.lang.String) rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes;
                    permissionRequest2 = (com.paypal.oslo.core.permission.domain.model.PermissionRequest) rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str2;
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    if (booleanValue || shouldShowRationale) {
                        com.paypal.oslo.core.permission.ui.controller.PlatformPermissionDelegate platformPermissionDelegate2 = this.getHighSpeedVideoFpsRangesFor;
                        androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher2 = this.Camera2StreamConfigurationMap;
                        final androidx.compose.runtime.MutableState mutableState2 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1.m11669$r8$lambda$IJdZJ2JLQkUZ93YRT0MK762i4(androidx.compose.runtime.MutableState.this, (kotlinx.coroutines.CancellableContinuation) obj2);
                            }
                        };
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = permissionRequest2;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = str;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap = shouldShowRationale;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges = booleanValue;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 3;
                        launchPermissionRequest = platformPermissionDelegate2.launchPermissionRequest(managedActivityResultLauncher2, function12, str, rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1);
                        if (launchPermissionRequest != coroutine_suspended) {
                            boolean z6 = shouldShowRationale;
                            z = booleanValue;
                            obj = launchPermissionRequest;
                            permissionRequest3 = permissionRequest2;
                            z2 = z6;
                            booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                            if (!booleanValue2) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.permission.LoggerKt.log, "Permission permanently denied", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, str), kotlin.TuplesKt.to("reason", permissionRequest2.getReason()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, permissionRequest2.getModuleName())), null, 4, null);
                    return this.getHighSpeedVideoSizes.evaluatePermissionStatus(false, false, true);
                }
                if (i != 3) {
                    if (i == 4) {
                        boolean z7 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRangesFor;
                        boolean z8 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges;
                        boolean z9 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z5 = true;
                        return this.getHighSpeedVideoSizes.evaluatePermissionStatus(z5, false, false);
                    }
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getOutputMinFrameDuration;
                    boolean z10 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRangesFor;
                    z = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges;
                    boolean z11 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z3 = false;
                    shouldShowRationale2 = z4;
                    return this.getHighSpeedVideoSizes.evaluatePermissionStatus(z3, shouldShowRationale2, z);
                }
                z = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges;
                z2 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap;
                str = (java.lang.String) rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes;
                permissionRequest3 = (com.paypal.oslo.core.permission.domain.model.PermissionRequest) rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                if (!booleanValue2) {
                    com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel3 = this.getHighSpeedVideoSizes;
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(permissionRequest3);
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap = z2;
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges = z;
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRangesFor = booleanValue2;
                    rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 4;
                    z5 = true;
                } else {
                    shouldShowRationale2 = this.getHighSpeedVideoFpsRangesFor.shouldShowRationale(this.getHighResolutionOutputSizeshNQ4ISI, str);
                    if (shouldShowRationale2 || z) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.permission.LoggerKt.log, "Permission should show rationale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, str), kotlin.TuplesKt.to("reason", permissionRequest3.getReason()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, permissionRequest3.getModuleName())), null, 4, null);
                        com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel4 = this.getHighSpeedVideoSizes;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(permissionRequest3);
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.Camera2StreamConfigurationMap = z2;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRanges = z;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoFpsRangesFor = booleanValue2;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getOutputMinFrameDuration = shouldShowRationale2;
                        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor = 5;
                        z3 = false;
                        if (permissionViewModel4.updatePermissionRequestedState(str, false, rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1) != coroutine_suspended) {
                            z4 = shouldShowRationale2;
                            shouldShowRationale2 = z4;
                            return this.getHighSpeedVideoSizes.evaluatePermissionStatus(z3, shouldShowRationale2, z);
                        }
                    } else {
                        z3 = false;
                        return this.getHighSpeedVideoSizes.evaluatePermissionStatus(z3, shouldShowRationale2, z);
                    }
                }
                return coroutine_suspended;
            }
        }
        rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1 = new com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1(this, continuation);
        java.lang.Object obj2 = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberPermissionControllerKt$rememberPermissionController$1$1$requestPermission$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
    }

    @Override // com.paypal.oslo.core.permission.ui.controller.PermissionController
    public final void navigateToPermissionSettings() {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", this.getHighResolutionOutputSizeshNQ4ISI.getPackageName(), null));
        intent.addFlags(268435456);
        this.getHighResolutionOutputSizeshNQ4ISI.startActivity(intent);
    }

    /* renamed from: $r8$lambda$IJdZJ2JLQkUZ93YR--T0MK762i4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11669$r8$lambda$IJdZJ2JLQkUZ93YRT0MK762i4(androidx.compose.runtime.MutableState mutableState, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        mutableState.setValue(cancellableContinuation);
        return kotlin.Unit.INSTANCE;
    }
}
