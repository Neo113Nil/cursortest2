package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0019\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0011\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0014\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0017\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u001a\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010 \u001a-\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010!\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\"\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010#\u001a]\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010$\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatIntMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/FloatIntMap;", "buildFloatIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatIntMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatIntMap;", "emptyFloatIntMap", "()Landroidx/collection/FloatIntMap;", "floatIntMapOf", "", "key1", "value1", "(FI)Landroidx/collection/FloatIntMap;", "key2", "value2", "(FIFI)Landroidx/collection/FloatIntMap;", "key3", "value3", "(FIFIFI)Landroidx/collection/FloatIntMap;", "key4", "value4", "(FIFIFIFI)Landroidx/collection/FloatIntMap;", "key5", "value5", "(FIFIFIFIFI)Landroidx/collection/FloatIntMap;", "mutableFloatIntMapOf", "()Landroidx/collection/MutableFloatIntMap;", "(FI)Landroidx/collection/MutableFloatIntMap;", "(FIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableFloatIntMap;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatIntMapKt {
    private static final androidx.collection.MutableFloatIntMap getHighSpeedVideoSizes = new androidx.collection.MutableFloatIntMap(0);

    public static final androidx.collection.FloatIntMap emptyFloatIntMap() {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf() {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf(float f, int i) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf(float f, int i, float f2, int i2) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf() {
        return new androidx.collection.MutableFloatIntMap(0, 1, null);
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf(float f, int i) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap buildFloatIntMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatIntMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(0, 1, null);
        function1.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final androidx.collection.FloatIntMap buildFloatIntMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatIntMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = new androidx.collection.MutableFloatIntMap(i);
        function1.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }
}
