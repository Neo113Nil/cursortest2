package androidx.window.layout;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.window.layout.WindowMetricsCalculator, androidx.window.layout.WindowMetricsCalculator> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final androidx.window.layout.WindowMetricsCalculator invoke(androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetricsCalculator, "");
        return ((androidx.window.layout.WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }

    WindowMetricsCalculator$Companion$overrideDecorator$1(java.lang.Object obj) {
        super(1, obj, androidx.window.layout.WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }
}
