package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0018\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0014\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0017\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u001a\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010 \u001a-\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010!\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\"\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010#\u001a]\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010$\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/IntFloatMap;", "buildIntFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "()Landroidx/collection/IntFloatMap;", "intFloatMapOf", "key1", "", "value1", "(IF)Landroidx/collection/IntFloatMap;", "key2", "value2", "(IFIF)Landroidx/collection/IntFloatMap;", "key3", "value3", "(IFIFIF)Landroidx/collection/IntFloatMap;", "key4", "value4", "(IFIFIFIF)Landroidx/collection/IntFloatMap;", "key5", "value5", "(IFIFIFIFIF)Landroidx/collection/IntFloatMap;", "mutableIntFloatMapOf", "()Landroidx/collection/MutableIntFloatMap;", "(IF)Landroidx/collection/MutableIntFloatMap;", "(IFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableIntFloatMap;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntFloatMapKt {
    private static final androidx.collection.MutableIntFloatMap getHighSpeedVideoFpsRanges = new androidx.collection.MutableIntFloatMap(0);

    public static final androidx.collection.IntFloatMap emptyIntFloatMap() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf(int i, float f) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf(int i, float f, int i2, float f2) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4, int i5, float f5) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        mutableIntFloatMap.set(i5, f5);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf() {
        return new androidx.collection.MutableIntFloatMap(0, 1, null);
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf(int i, float f) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4, int i5, float f5) {
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        mutableIntFloatMap.set(i5, f5);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap buildIntFloatMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableIntFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(0, 1, null);
        function1.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    public static final androidx.collection.IntFloatMap buildIntFloatMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableIntFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableIntFloatMap mutableIntFloatMap = new androidx.collection.MutableIntFloatMap(i);
        function1.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }
}
