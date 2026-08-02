package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1", f = "PhoneNumberHintLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult, kotlin.Unit>> Camera2StreamConfigurationMap;
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.app.Activity activity;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.getHasRequestedHint() || (activity = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            return kotlin.Unit.INSTANCE;
        }
        com.google.android.gms.tasks.Task<android.app.PendingIntent> phoneNumberHintIntent = this.getHighSpeedVideoFpsRangesFor.getPhoneNumberHintIntent(activity);
        final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.getHighSpeedVideoFpsRanges;
        final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult, kotlin.Unit>> state = this.Camera2StreamConfigurationMap;
        final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState phoneNumberHintLauncherState = this.getHighSpeedVideoSizes;
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1.getHighSpeedVideoFpsRanges(androidx.view.compose.ManagedActivityResultLauncher.this, state, phoneNumberHintLauncherState, (android.app.PendingIntent) obj2);
            }
        };
        com.google.android.gms.tasks.Task<android.app.PendingIntent> addOnSuccessListener = phoneNumberHintIntent.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj2) {
                kotlin.jvm.functions.Function1.this.invoke(obj2);
            }
        });
        final kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit> createRequestErrorHandler = com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.createRequestErrorHandler(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.access$PhoneNumberHintEffect$lambda$0(this.Camera2StreamConfigurationMap));
        addOnSuccessListener.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                kotlin.jvm.functions.Function1.this.invoke(exc);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(final androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, androidx.compose.runtime.State state, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState phoneNumberHintLauncherState, final androidx.view.result.IntentSenderRequest intentSenderRequest) {
        arrow.core.Either<java.lang.IllegalStateException, kotlin.Unit> safeLaunchIntentSender = com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.safeLaunchIntentSender(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1.getHighSpeedVideoFpsRangesFor(androidx.view.compose.ManagedActivityResultLauncher.this, intentSenderRequest);
            }
        });
        if (safeLaunchIntentSender instanceof arrow.core.Either.Right) {
            phoneNumberHintLauncherState.markHintRequested();
        } else if (safeLaunchIntentSender instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.createLaunchErrorHandler(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.access$PhoneNumberHintEffect$lambda$0(state)).invoke((java.lang.IllegalStateException) ((arrow.core.Either.Left) safeLaunchIntentSender).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(final androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, final androidx.compose.runtime.State state, final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState phoneNumberHintLauncherState, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(pendingIntent);
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.handlePhoneHintSuccess(pendingIntent, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1.getHighSpeedVideoSizes(androidx.view.compose.ManagedActivityResultLauncher.this, state, phoneNumberHintLauncherState, (androidx.view.result.IntentSenderRequest) obj);
            }
        }, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.createLaunchErrorHandler(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt.access$PhoneNumberHintEffect$lambda$0(state)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, androidx.view.result.IntentSenderRequest intentSenderRequest) {
        managedActivityResultLauncher.launch(intentSenderRequest);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherState phoneNumberHintLauncherState, android.app.Activity activity, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient phoneHintIdentityClient, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintLauncherKt$PhoneNumberHintEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = phoneNumberHintLauncherState;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
        this.getHighSpeedVideoFpsRangesFor = phoneHintIdentityClient;
        this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
        this.Camera2StreamConfigurationMap = state;
    }
}
