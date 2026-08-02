package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0080@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "result", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/request/Options;", "options", "Lcoil3/EventListener;", "eventListener", "Lcoil3/util/Logger;", "logger", "transform", "(Lcoil3/intercept/EngineInterceptor$ExecuteResult;Lcoil3/request/ImageRequest;Lcoil3/request/Options;Lcoil3/EventListener;Lcoil3/util/Logger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EngineInterceptorKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e9 -> B:10:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object transform(coil3.intercept.EngineInterceptor.ExecuteResult executeResult, coil3.view.ImageRequest imageRequest, coil3.view.Options options, coil3.EventListener eventListener, coil3.content.Logger logger, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor.ExecuteResult> continuation) {
        coil3.intercept.EngineInterceptorKt$transform$1 engineInterceptorKt$transform$1;
        int i;
        coil3.view.Options options2;
        coil3.view.ImageRequest imageRequest2;
        coil3.EventListener eventListener2;
        coil3.intercept.EngineInterceptor.ExecuteResult executeResult2;
        java.util.List<coil3.graphics.Transformation> list;
        android.graphics.Bitmap bitmap;
        int i2;
        int i3;
        if (continuation instanceof coil3.intercept.EngineInterceptorKt$transform$1) {
            engineInterceptorKt$transform$1 = (coil3.intercept.EngineInterceptorKt$transform$1) continuation;
            if ((engineInterceptorKt$transform$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                engineInterceptorKt$transform$1.getInputFormats -= 2147483648;
                java.lang.Object obj = engineInterceptorKt$transform$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptorKt$transform$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<coil3.graphics.Transformation> transformations = coil3.view.ImageRequestsKt.getTransformations(imageRequest);
                    if (!transformations.isEmpty()) {
                        coil3.Image image = executeResult.getImage();
                        if ((image instanceof coil3.BitmapImage) || coil3.view.ImageRequestsKt.getAllowConversionToBitmap(imageRequest)) {
                            options2 = options;
                            android.graphics.Bitmap convertImageToBitmap = coil3.intercept.EngineInterceptor_androidKt.convertImageToBitmap(image, options2, transformations, logger);
                            imageRequest2 = imageRequest;
                            eventListener2 = eventListener;
                            eventListener2.transformStart(imageRequest2, convertImageToBitmap);
                            int size = transformations.size();
                            executeResult2 = executeResult;
                            list = transformations;
                            bitmap = convertImageToBitmap;
                            i2 = size;
                            i3 = 0;
                            if (i3 < i2) {
                            }
                        } else if (logger != null) {
                            coil3.util.Logger.Level level = coil3.util.Logger.Level.Info;
                            if (logger.getMinLevel().compareTo(level) <= 0) {
                                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(executeResult.getImage().getClass()).getSimpleName();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("allowConversionToBitmap=false, skipping transformations for type ");
                                sb.append(simpleName);
                                sb.append(".");
                                logger.log(coil3.intercept.EngineInterceptor.TAG, level, sb.toString(), null);
                            }
                        }
                    }
                    return executeResult;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = engineInterceptorKt$transform$1.getHighSpeedVideoFpsRangesFor;
                int i4 = engineInterceptorKt$transform$1.getHighSpeedVideoFpsRanges;
                java.util.List<coil3.graphics.Transformation> list2 = (java.util.List) engineInterceptorKt$transform$1.getHighSpeedVideoSizesFor;
                eventListener2 = (coil3.EventListener) engineInterceptorKt$transform$1.getOutputMinFrameDuration;
                coil3.view.Options options3 = (coil3.view.Options) engineInterceptorKt$transform$1.getHighResolutionOutputSizeshNQ4ISI;
                coil3.view.ImageRequest imageRequest3 = (coil3.view.ImageRequest) engineInterceptorKt$transform$1.getHighSpeedVideoSizes;
                coil3.intercept.EngineInterceptor.ExecuteResult executeResult3 = (coil3.intercept.EngineInterceptor.ExecuteResult) engineInterceptorKt$transform$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<coil3.graphics.Transformation> list3 = list2;
                options2 = options3;
                bitmap = (android.graphics.Bitmap) obj;
                kotlinx.coroutines.JobKt.ensureActive(engineInterceptorKt$transform$1.getGetHighSpeedVideoSizes());
                java.util.List<coil3.graphics.Transformation> list4 = list3;
                i3 = i4 + 1;
                imageRequest2 = imageRequest3;
                executeResult2 = executeResult3;
                list = list4;
                if (i3 < i2) {
                    coil3.graphics.Transformation transformation = list.get(i3);
                    coil3.view.Size size2 = options2.getSize();
                    engineInterceptorKt$transform$1.Camera2StreamConfigurationMap = executeResult2;
                    engineInterceptorKt$transform$1.getHighSpeedVideoSizes = imageRequest2;
                    engineInterceptorKt$transform$1.getHighResolutionOutputSizeshNQ4ISI = options2;
                    engineInterceptorKt$transform$1.getOutputMinFrameDuration = eventListener2;
                    engineInterceptorKt$transform$1.getHighSpeedVideoSizesFor = list;
                    engineInterceptorKt$transform$1.getHighSpeedVideoFpsRanges = i3;
                    engineInterceptorKt$transform$1.getHighSpeedVideoFpsRangesFor = i2;
                    engineInterceptorKt$transform$1.getInputFormats = 1;
                    obj = transformation.transform(bitmap, size2, engineInterceptorKt$transform$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coil3.intercept.EngineInterceptor.ExecuteResult executeResult4 = executeResult2;
                    imageRequest3 = imageRequest2;
                    i4 = i3;
                    list3 = list;
                    executeResult3 = executeResult4;
                    bitmap = (android.graphics.Bitmap) obj;
                    kotlinx.coroutines.JobKt.ensureActive(engineInterceptorKt$transform$1.getGetHighSpeedVideoSizes());
                    java.util.List<coil3.graphics.Transformation> list42 = list3;
                    i3 = i4 + 1;
                    imageRequest2 = imageRequest3;
                    executeResult2 = executeResult3;
                    list = list42;
                    if (i3 < i2) {
                        eventListener2.transformEnd(imageRequest2, bitmap);
                        return coil3.intercept.EngineInterceptor.ExecuteResult.copy$default(executeResult2, coil3.Image_androidKt.asImage$default(bitmap, false, 1, null), false, null, null, 14, null);
                    }
                }
            }
        }
        engineInterceptorKt$transform$1 = new coil3.intercept.EngineInterceptorKt$transform$1(continuation);
        java.lang.Object obj2 = engineInterceptorKt$transform$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptorKt$transform$1.getInputFormats;
        if (i != 0) {
        }
    }
}
