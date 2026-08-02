package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes5.dex */
public final class SmartSet<T> extends kotlin.collections.AbstractMutableSet<T> {
    public static final kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion Companion = new kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion(null);
    private int getHighSpeedVideoFpsRanges;
    private java.lang.Object getHighSpeedVideoSizes;

    private SmartSet() {
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create() {
            return new kotlin.reflect.jvm.internal.impl.utils.SmartSet<>(null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create(java.util.Collection<? extends T> collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> smartSet = new kotlin.reflect.jvm.internal.impl.utils.SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setSize(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return java.util.Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new kotlin.reflect.jvm.internal.impl.utils.SmartSet.SingletonIterator(this.getHighSpeedVideoSizes);
        }
        if (size() < 5) {
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return new kotlin.reflect.jvm.internal.impl.utils.SmartSet.ArrayIterator((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableSet(obj2).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        java.lang.Object[] objArr;
        if (size() == 0) {
            this.getHighSpeedVideoSizes = t;
        } else if (size() == 1) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, t)) {
                return false;
            }
            this.getHighSpeedVideoSizes = new java.lang.Object[]{this.getHighSpeedVideoSizes, t};
        } else if (size() < 5) {
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
            if (kotlin.collections.ArraysKt.contains(objArr2, t)) {
                return false;
            }
            if (size() == 4) {
                ?? linkedSetOf = kotlin.collections.SetsKt.linkedSetOf(java.util.Arrays.copyOf(objArr2, objArr2.length));
                linkedSetOf.add(t);
                objArr = linkedSetOf;
            } else {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, size() + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.getHighSpeedVideoSizes = objArr;
        } else {
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            if (!kotlin.jvm.internal.TypeIntrinsics.asMutableSet(obj2).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.getHighSpeedVideoSizes = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, obj);
        }
        if (size() < 5) {
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            return kotlin.collections.ArraysKt.contains((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
        return ((java.util.Set) obj3).contains(obj);
    }

    static final class SingletonIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
        private final T getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor = true;

        public SingletonIterator(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = false;
                return this.getHighSpeedVideoFpsRanges;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static final class ArrayIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
        private final java.util.Iterator<T> getHighSpeedVideoSizes;

        public ArrayIterator(T[] tArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
            this.getHighSpeedVideoSizes = kotlin.jvm.internal.ArrayIteratorKt.iterator(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.getHighSpeedVideoSizes.next();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create() {
        return Companion.create();
    }

    public /* synthetic */ SmartSet(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
