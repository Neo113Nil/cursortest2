package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0005\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aD\u0010!\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010 \u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u001f\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u001f\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b$\u0010%\u001a#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010(\"\"\u0010+\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "contains", "(Landroid/util/SparseArray;I)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "plus", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/util/SparseArray;", "containsKey", "containsValue", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/SparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "putAll", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "action", "forEach", "(Landroid/util/SparseArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/IntIterator;", "keyIterator", "(Landroid/util/SparseArray;)Lkotlin/collections/IntIterator;", "", "valueIterator", "(Landroid/util/SparseArray;)Ljava/util/Iterator;", "getSize", "(Landroid/util/SparseArray;)I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SparseArrayKt {
    public static final <T> int getSize(android.util.SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean contains(android.util.SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> void set(android.util.SparseArray<T> sparseArray, int i, T t) {
        sparseArray.put(i, t);
    }

    public static final <T> android.util.SparseArray<T> plus(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> sparseArray2) {
        android.util.SparseArray<T> sparseArray3 = new android.util.SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> boolean containsKey(android.util.SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsValue(android.util.SparseArray<T> sparseArray, T t) {
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T getOrDefault(android.util.SparseArray<T> sparseArray, int i, T t) {
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(android.util.SparseArray<T> sparseArray, int i, kotlin.jvm.functions.Function0<? extends T> function0) {
        T t = sparseArray.get(i);
        return t == null ? function0.invoke() : t;
    }

    public static final <T> boolean isEmpty(android.util.SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(android.util.SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    public static final <T> boolean remove(android.util.SparseArray<T> sparseArray, int i, T t) {
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void forEach(android.util.SparseArray<T> sparseArray, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> function2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> kotlin.collections.IntIterator keyIterator(final android.util.SparseArray<T> sparseArray) {
        return new kotlin.collections.IntIterator() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public final int nextInt() {
                android.util.SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = i + 1;
                return sparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> java.util.Iterator<T> valueIterator(android.util.SparseArray<T> sparseArray) {
        return new androidx.core.util.SparseArrayKt$valueIterator$1(sparseArray);
    }

    public static final <T> void putAll(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }
}
