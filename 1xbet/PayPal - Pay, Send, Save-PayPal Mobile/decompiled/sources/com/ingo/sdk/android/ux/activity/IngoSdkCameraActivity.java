package com.ingo.sdk.android.ux.activity;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJE\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/ingo/sdk/android/ux/activity/IngoSdkCameraActivity;", "Lcom/ingo/sdk/kotlin/common/platform/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Context;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "outputDirectory", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function1;", "Landroid/net/Uri;", "onImageCaptured", "Landroidx/camera/core/ImageCaptureException;", "onError", "CameraView", "(Ljava/io/File;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoSdkCameraActivity extends com.ingo.sdk.kotlin.common.platform.BaseActivity {
    public static final java.lang.String ICON_TINT = "icon_tint";
    public static final java.lang.String SELFIE_URI = "selfie_uri";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.concurrent.ExecutorService getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @Override // com.ingo.sdk.kotlin.common.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getHighSpeedVideoSizes = java.util.concurrent.Executors.newSingleThreadExecutor();
        java.io.File selfieDirectory = getSelfieDirectory();
        createDirectory(selfieDirectory);
        androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-39775433, true, new com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$onCreate$1(this, selfieDirectory)), 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        java.util.concurrent.ExecutorService executorService = this.getHighSpeedVideoSizes;
        if (executorService == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executorService = null;
        }
        executorService.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> companion = androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE.getInstance(context);
            companion.addListener(new java.lang.Runnable() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$getCameraProvider$2$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kotlin.coroutines.Continuation<androidx.camera.lifecycle.ProcessCameraProvider> continuation2 = safeContinuation2;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation2.resumeWith(kotlin.Result.m23436constructorimpl(companion.get()));
                    } catch (java.lang.Exception e) {
                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error getting camera provider", null, e, 2, null);
                        kotlin.coroutines.Continuation<androidx.camera.lifecycle.ProcessCameraProvider> continuation3 = safeContinuation2;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        continuation3.resumeWith(kotlin.Result.m23436constructorimpl(null));
                    }
                }
            }, androidx.core.content.ContextCompat.getMainExecutor(context));
        } catch (java.lang.Exception e) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error getting camera provider instance", null, e, 2, null);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(null));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void CameraView(final java.io.File file, final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super androidx.camera.core.ImageCaptureException, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1188618882);
        android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        androidx.camera.core.Preview build = new androidx.camera.core.Preview.Builder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.camera.view.PreviewView(context);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        androidx.camera.view.PreviewView previewView = (androidx.camera.view.PreviewView) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.camera.core.ImageCapture.Builder().setCaptureMode(0).build();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final androidx.camera.core.ImageCapture imageCapture = (androidx.camera.core.ImageCapture) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageCapture);
        androidx.camera.core.CameraSelector build2 = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.MutableState<java.lang.String> mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) 0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$CameraView$1(this, context, mutableState, lifecycleOwner, build2, build, imageCapture, previewView, null), startRestartGroup, 70);
        new com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider().View(previewView, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.$r8$lambda$4XLAjsiB7KIaa2xl2bAgo9b9P4g(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.this, imageCapture, file, executor, function1, function12);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.$r8$lambda$oFmlysJRKmwmzj_NQivM2Mb7AJw(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.this);
            }
        }, getIntent().getBooleanExtra(ICON_TINT, true), mutableState, startRestartGroup, (com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider.$stable << 15) | 24584);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.m10655$r8$lambda$5TTUWi92YmLOgiW_MVCTeSSqVo(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.this, file, executor, function1, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4XLAjsiB7KIaa2xl2bAgo9b9P4g(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity, androidx.camera.core.ImageCapture imageCapture, java.io.File file, java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12) {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", java.util.Locale.US).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(format);
        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
        final java.io.File file2 = new java.io.File(file, sb.toString());
        androidx.camera.core.ImageCapture.Metadata metadata = new androidx.camera.core.ImageCapture.Metadata();
        metadata.setReversedHorizontal(false);
        androidx.camera.core.ImageCapture.OutputFileOptions build = new androidx.camera.core.ImageCapture.OutputFileOptions.Builder(file2).setMetadata(metadata).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        imageCapture.takePicture(build, executor, new androidx.camera.core.ImageCapture.OnImageSavedCallback() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$takePhoto$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onError(androidx.camera.core.ImageCaptureException exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                function12.invoke(exception);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputFileResults, "");
                android.net.Uri savedUri = outputFileResults.getSavedUri();
                if (savedUri == null) {
                    savedUri = android.net.Uri.fromFile(file2);
                }
                kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> function13 = function1;
                kotlin.jvm.internal.Intrinsics.checkNotNull(savedUri);
                function13.invoke(savedUri);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5TTUWi92YmL-OgiW_MVCTeSSqVo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10655$r8$lambda$5TTUWi92YmLOgiW_MVCTeSSqVo(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity, java.io.File file, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        ingoSdkCameraActivity.CameraView(file, executor, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oFmlysJRKmwmzj_NQivM2Mb7AJw(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity) {
        ingoSdkCameraActivity.onBackPressed();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
