package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\n\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\n\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/core/ImageCapture;", "Lkotlin/Function0;", "", "onCaptureStarted", "Lkotlin/Function1;", "", "onCaptureProcessProgressed", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "Landroidx/camera/core/ImageProxy;", "takePicture", "(Landroidx/camera/core/ImageCapture;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "outputFileOptions", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/imagecapture/TakePictureRequest;", "getTakePictureRequest", "(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCaptureExtKt {
    public static /* synthetic */ java.lang.Object takePicture$default(androidx.camera.core.ImageCapture imageCapture, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        return takePicture(imageCapture, function0, function1, function12, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    public static final java.lang.Object takePicture(androidx.camera.core.ImageCapture imageCapture, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super androidx.camera.core.ImageProxy> continuation) {
        java.util.concurrent.Executor directExecutor;
        kotlin.coroutines.CoroutineContext.Element element = continuation.getGetHighSpeedVideoSizes().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        androidx.camera.core.DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = element instanceof kotlinx.coroutines.CoroutineDispatcher ? (kotlinx.coroutines.CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (directExecutor = kotlinx.coroutines.ExecutorsKt.asExecutor(coroutineDispatcher)) == null) {
            directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(directExecutor, "");
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new androidx.camera.core.DelegatingImageCapturedCallback(new androidx.camera.core.ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureStarted() {
                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureProcessProgressed(int progress) {
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(java.lang.Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
                kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onCaptureSuccess(androidx.camera.core.ImageProxy imageProxy) {
                androidx.camera.core.DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageProxy, "");
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.getHighResolutionOutputSizeshNQ4ISI.set(null);
                kotlinx.coroutines.CancellableContinuation<androidx.camera.core.ImageProxy> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public final void onError(androidx.camera.core.ImageCaptureException exception) {
                androidx.camera.core.DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.getHighResolutionOutputSizeshNQ4ISI.set(null);
                kotlinx.coroutines.CancellableContinuation<androidx.camera.core.ImageProxy> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exception)));
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                androidx.camera.core.DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.getHighResolutionOutputSizeshNQ4ISI.set(null);
                return kotlin.Unit.INSTANCE;
            }
        });
        if (objectRef.element == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            delegatingImageCapturedCallback = (androidx.camera.core.DelegatingImageCapturedCallback) objectRef.element;
        }
        imageCapture.takePicture(directExecutor, delegatingImageCapturedCallback);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    public static final java.lang.Object takePicture(androidx.camera.core.ImageCapture imageCapture, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super androidx.camera.core.ImageCapture.OutputFileResults> continuation) {
        java.util.concurrent.Executor directExecutor;
        kotlin.coroutines.CoroutineContext.Element element = continuation.getGetHighSpeedVideoSizes().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        androidx.camera.core.DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = element instanceof kotlinx.coroutines.CoroutineDispatcher ? (kotlinx.coroutines.CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (directExecutor = kotlinx.coroutines.ExecutorsKt.asExecutor(coroutineDispatcher)) == null) {
            directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(directExecutor, "");
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new androidx.camera.core.DelegatingImageSavedCallback(new androidx.camera.core.ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onCaptureStarted() {
                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onCaptureProcessProgressed(int progress) {
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(java.lang.Integer.valueOf(progress));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
                kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
                androidx.camera.core.DelegatingImageSavedCallback delegatingImageSavedCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputFileResults, "");
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.getHighSpeedVideoFpsRanges.set(null);
                kotlinx.coroutines.CancellableContinuation<androidx.camera.core.ImageCapture.OutputFileResults> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public final void onError(androidx.camera.core.ImageCaptureException exception) {
                androidx.camera.core.DelegatingImageSavedCallback delegatingImageSavedCallback2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.getHighSpeedVideoFpsRanges.set(null);
                kotlinx.coroutines.CancellableContinuation<androidx.camera.core.ImageCapture.OutputFileResults> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exception)));
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                androidx.camera.core.DelegatingImageSavedCallback delegatingImageSavedCallback2;
                if (objectRef.element == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.getHighSpeedVideoFpsRanges.set(null);
                return kotlin.Unit.INSTANCE;
            }
        });
        if (objectRef.element == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            delegatingImageSavedCallback = (androidx.camera.core.DelegatingImageSavedCallback) objectRef.element;
        }
        imageCapture.takePicture(outputFileOptions, directExecutor, delegatingImageSavedCallback);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final androidx.camera.core.imagecapture.TakePictureRequest getTakePictureRequest(androidx.camera.core.ImageCapture imageCapture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageCapture, "");
        androidx.camera.core.imagecapture.RequestWithCallback capturingRequest = ((androidx.camera.core.imagecapture.TakePictureManager) java.util.Objects.requireNonNull(imageCapture.getHighSpeedVideoSizes)).getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }
}
