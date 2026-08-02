package androidx.collection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0012\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0015\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0018\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u001b\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010!\u001a-\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\"\u001a=\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010#\u001aM\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010$\u001a]\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010%\"\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableLongFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/LongFloatMap;", "buildLongFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongFloatMap;", "emptyLongFloatMap", "()Landroidx/collection/LongFloatMap;", "longFloatMapOf", "", "key1", "", "value1", "(JF)Landroidx/collection/LongFloatMap;", "key2", "value2", "(JFJF)Landroidx/collection/LongFloatMap;", "key3", "value3", "(JFJFJF)Landroidx/collection/LongFloatMap;", "key4", "value4", "(JFJFJFJF)Landroidx/collection/LongFloatMap;", "key5", "value5", "(JFJFJFJFJF)Landroidx/collection/LongFloatMap;", "mutableLongFloatMapOf", "()Landroidx/collection/MutableLongFloatMap;", "(JF)Landroidx/collection/MutableLongFloatMap;", "(JFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableLongFloatMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongFloatMapKt {
    private static final androidx.collection.MutableLongFloatMap getHighSpeedVideoFpsRanges = new androidx.collection.MutableLongFloatMap(0);

    public static final androidx.collection.LongFloatMap emptyLongFloatMap() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long j, float f) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long j, float f, long j2, float f2) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf() {
        return new androidx.collection.MutableLongFloatMap(0, 1, null);
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long j, float f) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap buildLongFloatMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(0, 1, null);
        function1.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    public static final androidx.collection.LongFloatMap buildLongFloatMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = new androidx.collection.MutableLongFloatMap(i);
        function1.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }
}
