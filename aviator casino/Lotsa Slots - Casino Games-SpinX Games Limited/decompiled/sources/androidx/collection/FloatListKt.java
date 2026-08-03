package androidx.collection;

/* compiled from: FloatList.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyFloatList", "Landroidx/collection/FloatList;", "emptyFloatList", "floatListOf", "element1", "", "element2", "element3", "elements", "", "mutableFloatListOf", "Landroidx/collection/MutableFloatList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatListKt {
    private static final androidx.collection.FloatList EmptyFloatList = new androidx.collection.MutableFloatList(0);

    public static final androidx.collection.FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    public static final androidx.collection.FloatList floatListOf() {
        return EmptyFloatList;
    }

    public static final androidx.collection.FloatList floatListOf(float f) {
        return mutableFloatListOf(f);
    }

    public static final androidx.collection.FloatList floatListOf(float f, float f2) {
        return mutableFloatListOf(f, f2);
    }

    public static final androidx.collection.FloatList floatListOf(float f, float f2, float f3) {
        return mutableFloatListOf(f, f2, f3);
    }

    public static final androidx.collection.FloatList floatListOf(float... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        androidx.collection.MutableFloatList mutableFloatList = new androidx.collection.MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf() {
        return new androidx.collection.MutableFloatList(0, 1, null);
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float f) {
        androidx.collection.MutableFloatList mutableFloatList = new androidx.collection.MutableFloatList(1);
        mutableFloatList.add(f);
        return mutableFloatList;
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float f, float f2) {
        androidx.collection.MutableFloatList mutableFloatList = new androidx.collection.MutableFloatList(2);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        return mutableFloatList;
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float f, float f2, float f3) {
        androidx.collection.MutableFloatList mutableFloatList = new androidx.collection.MutableFloatList(3);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        mutableFloatList.add(f3);
        return mutableFloatList;
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        androidx.collection.MutableFloatList mutableFloatList = new androidx.collection.MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }
}
