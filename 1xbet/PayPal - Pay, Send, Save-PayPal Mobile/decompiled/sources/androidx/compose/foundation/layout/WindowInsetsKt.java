package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u001a\u001a5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u001b2\b\b\u0002\u0010\u0018\u001a\u00020\u001b2\b\b\u0002\u0010\u0019\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "insets", "union", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "exclude", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "Landroidx/compose/foundation/layout/WindowInsetsSides;", "sides", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "only", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Density;", "density", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/layout/PaddingValues;", "asInsets", "(Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/foundation/layout/WindowInsets;", "WindowInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "(IIII)Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Dp;", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/FixedIntInsets;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/FixedIntInsets;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    private static final androidx.compose.foundation.layout.FixedIntInsets getHighSpeedVideoFpsRanges = new androidx.compose.foundation.layout.FixedIntInsets(0, 0, 0, 0);

    public static final androidx.compose.foundation.layout.WindowInsets union(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets2) {
        return new androidx.compose.foundation.layout.UnionInsets(windowInsets, windowInsets2);
    }

    public static final androidx.compose.foundation.layout.WindowInsets exclude(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets2) {
        return new androidx.compose.foundation.layout.ExcludeInsets(windowInsets, windowInsets2);
    }

    public static final androidx.compose.foundation.layout.WindowInsets add(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets2) {
        return new androidx.compose.foundation.layout.AddedInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg(androidx.compose.foundation.layout.WindowInsets windowInsets, int i) {
        return new androidx.compose.foundation.layout.LimitInsets(windowInsets, i, null);
    }

    public static final androidx.compose.foundation.layout.PaddingValues asPaddingValues(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:221)");
        }
        androidx.compose.foundation.layout.InsetsPaddingValues insetsPaddingValues = new androidx.compose.foundation.layout.InsetsPaddingValues(windowInsets, (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final androidx.compose.foundation.layout.PaddingValues asPaddingValues(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.Density density) {
        return new androidx.compose.foundation.layout.InsetsPaddingValues(windowInsets, density);
    }

    public static final androidx.compose.foundation.layout.WindowInsets asInsets(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        return new androidx.compose.foundation.layout.PaddingValuesInsets(paddingValues);
    }

    public static final androidx.compose.foundation.layout.WindowInsets WindowInsets() {
        return getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.WindowInsets WindowInsets$default(int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return WindowInsets(i, i2, i3, i4);
    }

    public static final androidx.compose.foundation.layout.WindowInsets WindowInsets(int i, int i2, int i3, int i4) {
        return new androidx.compose.foundation.layout.FixedIntInsets(i, i2, i3, i4);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final androidx.compose.foundation.layout.WindowInsets m1750WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.layout.FixedDpInsets(f, f2, f3, f4, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.layout.WindowInsets m1751WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m1750WindowInsetsa9UjIt4(f, f2, f3, f4);
    }
}
