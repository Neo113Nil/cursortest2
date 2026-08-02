package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes5.dex */
public class SmartList<E> extends java.util.AbstractList<E> implements java.util.RandomAccess {
    private int Camera2StreamConfigurationMap;
    private java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.Camera2StreamConfigurationMap)) {
            if (i2 == 1) {
                return (E) this.getHighSpeedVideoFpsRangesFor;
            }
            return (E) ((java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor)[i];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.Camera2StreamConfigurationMap);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            this.getHighSpeedVideoFpsRangesFor = e;
        } else if (i == 1) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor, e};
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[i2];
                this.getHighSpeedVideoFpsRangesFor = objArr2;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.Camera2StreamConfigurationMap] = e;
        }
        this.Camera2StreamConfigurationMap++;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.Camera2StreamConfigurationMap)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = e;
        } else if (i2 == 1 && i == 0) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.Object[]{e, this.getHighSpeedVideoFpsRangesFor};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.getHighSpeedVideoFpsRangesFor;
            } else {
                java.lang.Object[] objArr2 = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
                java.lang.System.arraycopy(objArr2, 0, objArr, 0, i);
                java.lang.System.arraycopy(objArr2, i, objArr, i + 1, this.Camera2StreamConfigurationMap - i);
            }
            objArr[i] = e;
            this.getHighSpeedVideoFpsRangesFor = objArr;
        }
        this.Camera2StreamConfigurationMap++;
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = 0;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.Camera2StreamConfigurationMap)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 1) {
            E e2 = (E) this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = e;
            return e2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.Camera2StreamConfigurationMap)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 == 1) {
            e = (E) this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj = objArr[i];
            if (i2 == 2) {
                this.getHighSpeedVideoFpsRangesFor = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    java.lang.System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.Camera2StreamConfigurationMap - 1] = null;
            }
            e = (E) obj;
        }
        this.Camera2StreamConfigurationMap--;
        this.modCount++;
        return e;
    }

    static class EmptyIterator<T> implements java.util.Iterator<T> {
        private static final kotlin.reflect.jvm.internal.impl.utils.SmartList.EmptyIterator getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.utils.SmartList.EmptyIterator();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        private EmptyIterator() {
        }

        public static <T> kotlin.reflect.jvm.internal.impl.utils.SmartList.EmptyIterator<T> getHighSpeedVideoFpsRangesFor() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.reflect.jvm.internal.impl.utils.SmartList.EmptyIterator highSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.utils.SmartList.EmptyIterator.getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor == null) {
                getHighResolutionOutputSizeshNQ4ISI(2);
            }
            return highSpeedVideoFpsRangesFor;
        }
        if (i == 1) {
            return new kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIterator();
        }
        java.util.Iterator<E> it = super.iterator();
        if (it == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        return it;
    }

    static abstract class SingletonIteratorBase<T> implements java.util.Iterator<T> {
        private boolean getHighSpeedVideoFpsRanges;

        protected abstract T getHighResolutionOutputSizeshNQ4ISI();

        protected abstract void getHighSpeedVideoSizes();

        private SingletonIteratorBase() {
        }

        /* synthetic */ SingletonIteratorBase(byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.getHighSpeedVideoFpsRanges) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoSizes();
            return getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    class SingletonIterator extends kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase<E> {
        private final int Camera2StreamConfigurationMap;

        public SingletonIterator() {
            super((byte) 0);
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.utils.SmartList.this.modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        protected final E getHighResolutionOutputSizeshNQ4ISI() {
            return (E) kotlin.reflect.jvm.internal.impl.utils.SmartList.this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        protected final void getHighSpeedVideoSizes() {
            if (kotlin.reflect.jvm.internal.impl.utils.SmartList.this.modCount == this.Camera2StreamConfigurationMap) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ModCount: ");
            sb.append(kotlin.reflect.jvm.internal.impl.utils.SmartList.this.modCount);
            sb.append("; expected: ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.util.ConcurrentModificationException(sb.toString());
        }

        @Override // java.util.Iterator
        public void remove() {
            getHighSpeedVideoSizes();
            kotlin.reflect.jvm.internal.impl.utils.SmartList.this.clear();
        }
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super E> comparator) {
        int i = this.Camera2StreamConfigurationMap;
        if (i >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        int length = tArr.length;
        int i = this.Camera2StreamConfigurationMap;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.getHighSpeedVideoFpsRangesFor;
            } else {
                T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.getHighSpeedVideoFpsRangesFor;
                if (tArr2 == 0) {
                    getHighResolutionOutputSizeshNQ4ISI(5);
                }
                return tArr2;
            }
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) java.util.Arrays.copyOf((java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor, i, tArr.getClass());
                if (tArr3 == null) {
                    getHighResolutionOutputSizeshNQ4ISI(6);
                }
                return tArr3;
            }
            if (i != 0) {
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, tArr, 0, i);
            }
        }
        int i2 = this.Camera2StreamConfigurationMap;
        if (length > i2) {
            tArr[i2] = 0;
        }
        if (tArr == 0) {
            getHighResolutionOutputSizeshNQ4ISI(7);
        }
        return tArr;
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
