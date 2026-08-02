package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {62}, m = "animateScrollBy-ubNVwUQ", n = {"previousValue"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollExtensionsKt$animateScrollBy$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ScrollExtensionsKt.m1518animateScrollByubNVwUQ(null, 0L, null, this);
    }

    ScrollExtensionsKt$animateScrollBy$3(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3> continuation) {
        super(continuation);
    }
}
