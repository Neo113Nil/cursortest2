package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0005\u001a\u00020\u00008GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getHighSpeedVideoSizes"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/ActualAndroid_androidKt")
/* loaded from: classes6.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.runtime.MonotonicFrameClock Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt.Camera2StreamConfigurationMap();
            return Camera2StreamConfigurationMap;
        }
    });

    public static final androidx.compose.runtime.MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (androidx.compose.runtime.MonotonicFrameClock) getHighSpeedVideoFpsRanges.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.MonotonicFrameClock Camera2StreamConfigurationMap() {
        return android.os.Looper.getMainLooper() != null ? androidx.compose.runtime.DefaultChoreographerFrameClock.INSTANCE : androidx.compose.runtime.FallbackFrameClock.INSTANCE;
    }
}
