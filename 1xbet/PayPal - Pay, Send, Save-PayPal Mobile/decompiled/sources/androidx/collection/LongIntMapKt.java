package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0011\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0014\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0017\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u001a\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010 \u001a-\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010!\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\"\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010#\u001a]\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010$\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableLongIntMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/LongIntMap;", "buildLongIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongIntMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongIntMap;", "emptyLongIntMap", "()Landroidx/collection/LongIntMap;", "longIntMapOf", "", "key1", "value1", "(JI)Landroidx/collection/LongIntMap;", "key2", "value2", "(JIJI)Landroidx/collection/LongIntMap;", "key3", "value3", "(JIJIJI)Landroidx/collection/LongIntMap;", "key4", "value4", "(JIJIJIJI)Landroidx/collection/LongIntMap;", "key5", "value5", "(JIJIJIJIJI)Landroidx/collection/LongIntMap;", "mutableLongIntMapOf", "()Landroidx/collection/MutableLongIntMap;", "(JI)Landroidx/collection/MutableLongIntMap;", "(JIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJIJI)Landroidx/collection/MutableLongIntMap;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableLongIntMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongIntMapKt {
    private static final androidx.collection.MutableLongIntMap Camera2StreamConfigurationMap = new androidx.collection.MutableLongIntMap(0);

    public static final androidx.collection.LongIntMap emptyLongIntMap() {
        return Camera2StreamConfigurationMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf() {
        return Camera2StreamConfigurationMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf(long j, int i) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf(long j, int i, long j2, int i2) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        mutableLongIntMap.set(j5, i5);
        return mutableLongIntMap;
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf() {
        return new androidx.collection.MutableLongIntMap(0, 1, null);
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf(long j, int i) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        return mutableLongIntMap;
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        return mutableLongIntMap;
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        return mutableLongIntMap;
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        return mutableLongIntMap;
    }

    public static final androidx.collection.MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5) {
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        mutableLongIntMap.set(j5, i5);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap buildLongIntMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongIntMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(0, 1, null);
        function1.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final androidx.collection.LongIntMap buildLongIntMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongIntMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongIntMap mutableLongIntMap = new androidx.collection.MutableLongIntMap(i);
        function1.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }
}
