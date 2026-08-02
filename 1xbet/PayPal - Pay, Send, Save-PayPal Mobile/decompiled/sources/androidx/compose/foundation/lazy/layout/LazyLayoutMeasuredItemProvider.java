package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "", "<init>", "()V", "", "index", "lane", "span", "Landroidx/compose/ui/unit/Constraints;", "constraints", "getAndMeasure--hBUhpc", "(IIIJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "getAndMeasure", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables-3p2s80s", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJ)Ljava/util/List;", "getPlaceables", "Landroidx/collection/MutableIntObjectMap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableIntObjectMap;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LazyLayoutMeasuredItemProvider<T extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Placeable>> Camera2StreamConfigurationMap = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();

    /* renamed from: getAndMeasure--hBUhpc */
    public abstract T mo1796getAndMeasurehBUhpc(int index, int lane, int span, long constraints);

    /* renamed from: getPlaceables-3p2s80s, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.layout.Placeable> m1858getPlaceables3p2s80s(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j) {
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.Camera2StreamConfigurationMap.get(i);
        if (list != null) {
            return list;
        }
        java.util.List<androidx.compose.ui.layout.Measurable> compose = lazyLayoutMeasureScope.compose(i);
        int size = compose.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(compose.get(i2).mo7353measureBRTryo0(j));
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.Camera2StreamConfigurationMap.set(i, arrayList2);
        return arrayList2;
    }
}
