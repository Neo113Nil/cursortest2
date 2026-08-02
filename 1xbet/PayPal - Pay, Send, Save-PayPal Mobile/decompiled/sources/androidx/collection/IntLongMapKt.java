package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0014\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0017\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u001a\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010 \u001a-\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010!\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\"\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010#\u001a]\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010$\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntLongMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/IntLongMap;", "buildIntLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntLongMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntLongMap;", "emptyIntLongMap", "()Landroidx/collection/IntLongMap;", "intLongMapOf", "key1", "", "value1", "(IJ)Landroidx/collection/IntLongMap;", "key2", "value2", "(IJIJ)Landroidx/collection/IntLongMap;", "key3", "value3", "(IJIJIJ)Landroidx/collection/IntLongMap;", "key4", "value4", "(IJIJIJIJ)Landroidx/collection/IntLongMap;", "key5", "value5", "(IJIJIJIJIJ)Landroidx/collection/IntLongMap;", "mutableIntLongMapOf", "()Landroidx/collection/MutableIntLongMap;", "(IJ)Landroidx/collection/MutableIntLongMap;", "(IJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableIntLongMap;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntLongMapKt {
    private static final androidx.collection.MutableIntLongMap getHighSpeedVideoFpsRangesFor = new androidx.collection.MutableIntLongMap(0);

    public static final androidx.collection.IntLongMap emptyIntLongMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.collection.IntLongMap intLongMapOf() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int i, long j) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int i, long j, int i2, long j2) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf() {
        return new androidx.collection.MutableIntLongMap(0, 1, null);
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int i, long j) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap buildIntLongMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableIntLongMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(0, 1, null);
        function1.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    public static final androidx.collection.IntLongMap buildIntLongMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableIntLongMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableIntLongMap mutableIntLongMap = new androidx.collection.MutableIntLongMap(i);
        function1.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }
}
