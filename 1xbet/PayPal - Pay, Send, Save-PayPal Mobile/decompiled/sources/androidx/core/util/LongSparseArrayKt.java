package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aD\u0010!\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010 \u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u001f\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u001f\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b$\u0010%\u001a#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010(\"\"\u0010,\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "contains", "(Landroid/util/LongSparseArray;J)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "plus", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "containsKey", "containsValue", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/LongSparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "putAll", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "action", "forEach", "(Landroid/util/LongSparseArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/LongIterator;", "keyIterator", "(Landroid/util/LongSparseArray;)Lkotlin/collections/LongIterator;", "", "valueIterator", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "getSize", "(Landroid/util/LongSparseArray;)I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LongSparseArrayKt {
    public static final <T> int getSize(android.util.LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean contains(android.util.LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> void set(android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        longSparseArray.put(j, t);
    }

    public static final <T> android.util.LongSparseArray<T> plus(android.util.LongSparseArray<T> longSparseArray, android.util.LongSparseArray<T> longSparseArray2) {
        android.util.LongSparseArray<T> longSparseArray3 = new android.util.LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> boolean containsKey(android.util.LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsValue(android.util.LongSparseArray<T> longSparseArray, T t) {
        return longSparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T getOrDefault(android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(android.util.LongSparseArray<T> longSparseArray, long j, kotlin.jvm.functions.Function0<? extends T> function0) {
        T t = longSparseArray.get(j);
        return t == null ? function0.invoke() : t;
    }

    public static final <T> boolean isEmpty(android.util.LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(android.util.LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    public static final <T> boolean remove(android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void forEach(android.util.LongSparseArray<T> longSparseArray, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super T, kotlin.Unit> function2) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> kotlin.collections.LongIterator keyIterator(final android.util.LongSparseArray<T> longSparseArray) {
        return new kotlin.collections.LongIterator() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.LongIterator
            public final long nextLong() {
                android.util.LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> java.util.Iterator<T> valueIterator(android.util.LongSparseArray<T> longSparseArray) {
        return new androidx.core.util.LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <T> void putAll(android.util.LongSparseArray<T> longSparseArray, android.util.LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }
}
