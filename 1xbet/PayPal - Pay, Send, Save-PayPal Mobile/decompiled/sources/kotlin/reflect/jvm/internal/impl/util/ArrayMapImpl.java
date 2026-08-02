package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class ArrayMapImpl<T> extends kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> {
    public static final kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.Companion(null);
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Object[] getHighSpeedVideoSizes;

    private ArrayMapImpl(java.lang.Object[] objArr) {
        super(null);
        this.getHighSpeedVideoSizes = objArr;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ArrayMapImpl() {
        this(new java.lang.Object[20]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final T get(int i) {
        return (T) kotlin.collections.ArraysKt.getOrNull(this.getHighSpeedVideoSizes, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new kotlin.collections.AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1
            private int getHighResolutionOutputSizeshNQ4ISI = -1;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl<T> getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public final void computeNext() {
                java.lang.Object[] objArr;
                java.lang.Object[] objArr2;
                java.lang.Object[] objArr3;
                java.lang.Object[] objArr4;
                do {
                    int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = i;
                    objArr = ((kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                    if (i >= objArr.length) {
                        break;
                    } else {
                        objArr4 = ((kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                    }
                } while (objArr4[this.getHighResolutionOutputSizeshNQ4ISI] == null);
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr2 = ((kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                if (i2 < objArr2.length) {
                    objArr3 = ((kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                    java.lang.Object obj = objArr3[this.getHighResolutionOutputSizeshNQ4ISI];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    setNext(obj);
                    return;
                }
                done();
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void set(int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighSpeedVideoSizes = copyOf;
        }
        if (this.getHighSpeedVideoSizes[i] == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = getSize() + 1;
        }
        this.getHighSpeedVideoSizes[i] = t;
    }
}
