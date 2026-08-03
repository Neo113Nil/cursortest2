package androidx.compose.foundation.layout;

/* compiled from: WindowInsets.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsKt {
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
    public static final androidx.compose.foundation.layout.WindowInsets m643onlybOOhFvg(androidx.compose.foundation.layout.WindowInsets windowInsets, int i) {
        return new androidx.compose.foundation.layout.LimitInsets(windowInsets, i, null);
    }

    public static final androidx.compose.foundation.layout.PaddingValues asPaddingValues(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1485016250, "C(asPaddingValues)244@9228L7:WindowInsets.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.foundation.layout.InsetsPaddingValues insetsPaddingValues = new androidx.compose.foundation.layout.InsetsPaddingValues(windowInsets, (androidx.compose.ui.unit.Density) consume);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return insetsPaddingValues;
    }

    public static final androidx.compose.foundation.layout.PaddingValues asPaddingValues(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.Density density) {
        return new androidx.compose.foundation.layout.InsetsPaddingValues(windowInsets, density);
    }

    public static final androidx.compose.foundation.layout.WindowInsets asInsets(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        return new androidx.compose.foundation.layout.PaddingValuesInsets(paddingValues);
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
    public static final androidx.compose.foundation.layout.WindowInsets m641WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.layout.FixedDpInsets(f, f2, f3, f4, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.layout.WindowInsets m642WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m641WindowInsetsa9UjIt4(f, f2, f3, f4);
    }
}
