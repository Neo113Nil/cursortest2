package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "ahead", "behind", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "LazyLayoutCacheWindow-YgX7TsA", "(FF)Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "LazyLayoutCacheWindow", "", "aheadFraction", "behindFraction"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutCacheWindowKt {
    /* renamed from: LazyLayoutCacheWindow-YgX7TsA, reason: not valid java name */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow m1840LazyLayoutCacheWindowYgX7TsA(float f, float f2) {
        return new androidx.compose.foundation.lazy.layout.DpLazyLayoutCacheWindow(f, f2, null);
    }

    public static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow LazyLayoutCacheWindow$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return LazyLayoutCacheWindow(f, f2);
    }

    public static final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow LazyLayoutCacheWindow(float f, float f2) {
        return new androidx.compose.foundation.lazy.layout.FractionLazyLayoutCacheWindow(f, f2);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow m1841LazyLayoutCacheWindowYgX7TsA$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m1840LazyLayoutCacheWindowYgX7TsA(f, f2);
    }
}
