package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1", f = "AepAsyncImage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AepAsyncImageKt$AepAsyncImage$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<android.graphics.Bitmap> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AepAsyncImageKt$AepAsyncImage$3$1(java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1, androidx.compose.runtime.MutableState<android.graphics.Bitmap> mutableState2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = mutableState2;
        this.Camera2StreamConfigurationMap = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                com.adobe.marketing.mobile.messaging.ContentCardImageManager contentCardImageManager = com.adobe.marketing.mobile.messaging.ContentCardImageManager.INSTANCE;
                java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                final kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.runtime.MutableState<android.graphics.Bitmap> mutableState = this.getHighSpeedVideoSizes;
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.getHighSpeedVideoFpsRanges;
                final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function12 = this.Camera2StreamConfigurationMap;
                com.adobe.marketing.mobile.messaging.ContentCardImageManager.getContentCardImageBitmap$messaging_phoneRelease$default(contentCardImageManager, str2, null, new kotlin.jvm.functions.Function1<kotlin.Result<? extends android.graphics.Bitmap>, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt$AepAsyncImage$3$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends android.graphics.Bitmap> result) {
                        java.lang.Object camera2StreamConfigurationMap = result.getCamera2StreamConfigurationMap();
                        kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> function13 = function1;
                        androidx.compose.runtime.MutableState<android.graphics.Bitmap> mutableState3 = mutableState;
                        androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4 = mutableState2;
                        if (kotlin.Result.m23442isSuccessimpl(camera2StreamConfigurationMap)) {
                            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) camera2StreamConfigurationMap;
                            mutableState3.setValue(bitmap);
                            mutableState4.setValue(java.lang.Boolean.valueOf(false));
                            function13.invoke(bitmap);
                        }
                        kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function14 = function12;
                        androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState5 = mutableState2;
                        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(camera2StreamConfigurationMap);
                        if (m23439exceptionOrNullimpl != null) {
                            mutableState5.setValue(java.lang.Boolean.valueOf(false));
                            function14.invoke(m23439exceptionOrNullimpl);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                }, 2, null);
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
