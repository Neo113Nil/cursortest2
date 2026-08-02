package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "", "Landroidx/compose/ui/unit/Density;", "", "viewport", "calculateAheadWindow", "(Landroidx/compose/ui/unit/Density;I)I", "calculateBehindWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyLayoutCacheWindow {
    default int calculateAheadWindow(androidx.compose.ui.unit.Density density, int i) {
        return 0;
    }

    default int calculateBehindWindow(androidx.compose.ui.unit.Density density, int i) {
        return 0;
    }
}
