package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a.\u0010\u000b\u001a\u00020\u00022\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0082@¢\u0006\u0004\b\u000b\u0010\u0006\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "withBlocking", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "()Z", "p0", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Method;", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BlockingBridgeKt {
    private static final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.BlockingBridgeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.lang.reflect.Method highSpeedVideoSizes;
            highSpeedVideoSizes = io.ktor.http.content.BlockingBridgeKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Method getHighSpeedVideoSizes() {
        try {
            return java.lang.Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", new java.lang.Class[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.Object withBlocking(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (Camera2StreamConfigurationMap()) {
            java.lang.Object invoke = function1.invoke(continuation);
            return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function1, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2(function1, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    private static final boolean Camera2StreamConfigurationMap() {
        try {
            java.lang.reflect.Method method = (java.lang.reflect.Method) getHighSpeedVideoFpsRangesFor.getValue();
            if (method != null) {
                return kotlin.jvm.internal.Intrinsics.areEqual(method.invoke(null, new java.lang.Object[0]), java.lang.Boolean.TRUE);
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
