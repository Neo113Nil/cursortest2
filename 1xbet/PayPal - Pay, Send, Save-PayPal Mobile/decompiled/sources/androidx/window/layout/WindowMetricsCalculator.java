package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Landroidx/window/layout/WindowMetrics;", "computeMaximumWindowMetrics", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WindowMetricsCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.WindowMetricsCalculator.Companion INSTANCE = androidx.window.layout.WindowMetricsCalculator.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.app.Activity activity);

    androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.app.Activity activity);

    default androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        throw new kotlin.NotImplementedError("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    default androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        throw new kotlin.NotImplementedError("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "<init>", "()V", "Landroidx/window/layout/WindowMetricsCalculator;", "getOrCreate", "()Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/layout/WindowMetricsCalculatorDecorator;)V", "reset", "Landroid/view/WindowMetrics;", "windowMetrics", "", "density", "Landroidx/window/layout/WindowMetrics;", "translateWindowMetrics$window_release", "(Landroid/view/WindowMetrics;F)Landroidx/window/layout/WindowMetrics;", "Landroid/util/DisplayMetrics;", "displayMetrics", "fromDisplayMetrics$window_release", "(Landroid/util/DisplayMetrics;)Landroidx/window/layout/WindowMetrics;", "Lkotlin/Function1;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/layout/WindowMetricsCalculatorCompat;", "getHighSpeedVideoSizes", "Landroidx/window/layout/WindowMetricsCalculatorCompat;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.window.layout.WindowMetricsCalculator.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.window.layout.WindowMetricsCalculator.Companion();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static kotlin.jvm.functions.Function1<? super androidx.window.layout.WindowMetricsCalculator, ? extends androidx.window.layout.WindowMetricsCalculator> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.window.layout.WindowMetricsCalculator.Companion.m9462$r8$lambda$iinoVzzZF0Hr8Lph3ec_Te_FwY((androidx.window.layout.WindowMetricsCalculator) obj);
            }
        };

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static final androidx.window.layout.WindowMetricsCalculatorCompat getHighSpeedVideoFpsRangesFor = new androidx.window.layout.WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.layout.WindowMetricsCalculator getOrCreate() {
            return getHighResolutionOutputSizeshNQ4ISI.invoke(getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.jvm.JvmStatic
        public final void overrideDecorator(androidx.window.layout.WindowMetricsCalculatorDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "");
            getHighResolutionOutputSizeshNQ4ISI = new androidx.window.layout.WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @kotlin.jvm.JvmStatic
        public final void reset() {
            getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.window.layout.WindowMetricsCalculator.Companion.$r8$lambda$suT24Mc293rBra82jtADj7bIMdk((androidx.window.layout.WindowMetricsCalculator) obj);
                }
            };
        }

        public final androidx.window.layout.WindowMetrics translateWindowMetrics$window_release(android.view.WindowMetrics windowMetrics, float density) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
            return androidx.window.layout.util.WindowMetricsCompatHelper.INSTANCE.getInstance().translateWindowMetrics(windowMetrics, density);
        }

        public final androidx.window.layout.WindowMetrics fromDisplayMetrics$window_release(android.util.DisplayMetrics displayMetrics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMetrics, "");
            return new androidx.window.layout.WindowMetrics(new androidx.window.core.Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels), displayMetrics.density);
        }

        /* renamed from: $r8$lambda$i-inoVzzZF0Hr8Lph3ec_Te_FwY, reason: not valid java name */
        public static /* synthetic */ androidx.window.layout.WindowMetricsCalculator m9462$r8$lambda$iinoVzzZF0Hr8Lph3ec_Te_FwY(androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetricsCalculator, "");
            return windowMetricsCalculator;
        }

        public static /* synthetic */ androidx.window.layout.WindowMetricsCalculator $r8$lambda$suT24Mc293rBra82jtADj7bIMdk(androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetricsCalculator, "");
            return windowMetricsCalculator;
        }
    }

    @kotlin.jvm.JvmStatic
    static void reset() {
        INSTANCE.reset();
    }

    @kotlin.jvm.JvmStatic
    static void overrideDecorator(androidx.window.layout.WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        INSTANCE.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @kotlin.jvm.JvmStatic
    static androidx.window.layout.WindowMetricsCalculator getOrCreate() {
        return INSTANCE.getOrCreate();
    }
}
