package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\b\u001a0\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a(\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u000f\u0010\t\u001a*\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0013\u001a,\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0014H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0013\u001a(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u0019\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010\u001e\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a0\u0010 \u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b \u0010\u0007\u001a0\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a2\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b$\u0010\u0013\u001a(\u0010%\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b%\u0010&\u001a0\u0010%\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b%\u0010'\u001a(\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b(\u0010)\u001a2\u0010*\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010\u0013\u001a8\u0010*\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010-\u001a0\u0010.\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a \u00100\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b0\u00101\u001a \u00103\u001a\u000202\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b3\u00104\u001a(\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b5\u00106\u001a(\u00108\u001a\u00020\n\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b8\u0010\f\u001aG\u0010<\u001a\u00020\u0005\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010;\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b:\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b:\u0012\u0004\u0012\u00020\u000509H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a0\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b>\u0010\u0013\u001a9\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a \u0010B\u001a\u00020\n\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\bB\u0010\u001c\u001a\u001d\u0010D\u001a\u00020C\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E\u001a4\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bF\u0010G\u001a/\u0010H\u001a\u00020\n\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0007¢\u0006\u0004\bH\u0010'\u001a0\u0010I\u001a\u00020\u0005\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bI\u0010\u0007\u001a#\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bK\u0010L\"\u0014\u0010O\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N\"(\u0010R\u001a\u00020\u0016\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\f\u0012\u0004\bQ\u0010\t\u001a\u0004\bP\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"E", "Landroidx/collection/LongSparseArray;", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "commonAppend", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "(Landroidx/collection/LongSparseArray;)V", "", "commonContainsKey", "(Landroidx/collection/LongSparseArray;J)Z", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "", "commonGetInternal", "", "commonIndexOfKey", "(Landroidx/collection/LongSparseArray;J)I", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "(Landroidx/collection/LongSparseArray;)Z", "index", "commonKeyAt", "(Landroidx/collection/LongSparseArray;I)J", "commonPut", "other", "commonPutAll", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)V", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;J)V", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "(Landroidx/collection/LongSparseArray;I)V", "commonReplace", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "(Landroidx/collection/LongSparseArray;)I", "", "commonToString", "(Landroidx/collection/LongSparseArray;)Ljava/lang/String;", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "T", "contains", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "action", "forEach", "(Landroidx/collection/LongSparseArray;Lkotlin/jvm/functions/Function2;)V", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "Lkotlin/collections/LongIterator;", "keyIterator", "(Landroidx/collection/LongSparseArray;)Lkotlin/collections/LongIterator;", "plus", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)Landroidx/collection/LongSparseArray;", "remove", "set", "", "valueIterator", "(Landroidx/collection/LongSparseArray;)Ljava/util/Iterator;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getSize", "getSize$annotations", io.ktor.http.ContentDisposition.Parameters.Size}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    public static /* synthetic */ void getSize$annotations(androidx.collection.LongSparseArray longSparseArray) {
    }

    public static final java.lang.Object commonGetInternal(androidx.collection.LongSparseArray<?> longSparseArray, long j, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == Camera2StreamConfigurationMap) ? obj : longSparseArray.values[binarySearch];
    }

    public static final <E> void commonRemove(androidx.collection.LongSparseArray<E> longSparseArray, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == Camera2StreamConfigurationMap) {
            return;
        }
        longSparseArray.values[binarySearch] = Camera2StreamConfigurationMap;
        longSparseArray.garbage = true;
    }

    public static final <E> boolean commonRemove(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(e, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <E> void commonRemoveAt(androidx.collection.LongSparseArray<E> longSparseArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.values[i] != Camera2StreamConfigurationMap) {
            longSparseArray.values[i] = Camera2StreamConfigurationMap;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0) {
            return null;
        }
        E e2 = (E) longSparseArray.values[indexOfKey];
        longSparseArray.values[indexOfKey] = e;
        return e2;
    }

    public static final <E> boolean commonReplace(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e, E e2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(longSparseArray.values[indexOfKey], e)) {
            return false;
        }
        longSparseArray.values[indexOfKey] = e2;
        return true;
    }

    public static final <E> void commonGc(androidx.collection.LongSparseArray<E> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int i = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        java.lang.Object[] objArr = longSparseArray.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != Camera2StreamConfigurationMap) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i2;
    }

    public static final <E> void commonPut(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch >= 0) {
            longSparseArray.values[binarySearch] = e;
            return;
        }
        int i = ~binarySearch;
        if (i < longSparseArray.size && longSparseArray.values[i] == Camera2StreamConfigurationMap) {
            longSparseArray.keys[i] = j;
            longSparseArray.values[i] = e;
            return;
        }
        if (longSparseArray.garbage && longSparseArray.size >= longSparseArray.keys.length) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
            i = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        }
        if (longSparseArray.size >= longSparseArray.keys.length) {
            int idealLongArraySize = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(longSparseArray.size + 1);
            long[] copyOf = java.util.Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            longSparseArray.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            longSparseArray.values = copyOf2;
        }
        if (longSparseArray.size - i != 0) {
            int i5 = i + 1;
            kotlin.collections.ArraysKt.copyInto(longSparseArray.keys, longSparseArray.keys, i5, i, longSparseArray.size);
            kotlin.collections.ArraysKt.copyInto(longSparseArray.values, longSparseArray.values, i5, i, longSparseArray.size);
        }
        longSparseArray.keys[i] = j;
        longSparseArray.values[i] = e;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(androidx.collection.LongSparseArray<E> longSparseArray, androidx.collection.LongSparseArray<? extends E> longSparseArray2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray2, "");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <E> E commonPutIfAbsent(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        E e2 = longSparseArray.get(j);
        if (e2 == null) {
            longSparseArray.put(j, e);
        }
        return e2;
    }

    public static final <E> int commonSize(androidx.collection.LongSparseArray<E> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        return longSparseArray.size;
    }

    public static final <E> boolean commonIsEmpty(androidx.collection.LongSparseArray<E> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(androidx.collection.LongSparseArray<E> longSparseArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (i < 0 || i >= longSparseArray.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(i)));
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return longSparseArray.keys[i];
    }

    public static final <E> E commonValueAt(androidx.collection.LongSparseArray<E> longSparseArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (i < 0 || i >= longSparseArray.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(i)));
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        return (E) longSparseArray.values[i];
    }

    public static final <E> void commonSetValueAt(androidx.collection.LongSparseArray<E> longSparseArray, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (i < 0 || i >= longSparseArray.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(i)));
        }
        if (longSparseArray.garbage) {
            int i2 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i3;
        }
        longSparseArray.values[i] = e;
    }

    public static final <E> int commonIndexOfKey(androidx.collection.LongSparseArray<E> longSparseArray, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        return androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
    }

    public static final <E> int commonIndexOfValue(androidx.collection.LongSparseArray<E> longSparseArray, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        int i4 = longSparseArray.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (longSparseArray.values[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(androidx.collection.LongSparseArray<E> longSparseArray, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <E> boolean commonContainsValue(androidx.collection.LongSparseArray<E> longSparseArray, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.indexOfValue(e) >= 0;
    }

    public static final <E> void commonClear(androidx.collection.LongSparseArray<E> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int i = longSparseArray.size;
        java.lang.Object[] objArr = longSparseArray.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> void commonAppend(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.size != 0 && j <= longSparseArray.keys[longSparseArray.size - 1]) {
            longSparseArray.put(j, e);
            return;
        }
        if (longSparseArray.garbage && longSparseArray.size >= longSparseArray.keys.length) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            java.lang.Object[] objArr = longSparseArray.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i2;
        }
        int i4 = longSparseArray.size;
        if (i4 >= longSparseArray.keys.length) {
            int idealLongArraySize = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(i4 + 1);
            long[] copyOf = java.util.Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            longSparseArray.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            longSparseArray.values = copyOf2;
        }
        longSparseArray.keys[i4] = j;
        longSparseArray.values[i4] = e;
        longSparseArray.size = i4 + 1;
    }

    public static final <E> java.lang.String commonToString(androidx.collection.LongSparseArray<E> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(longSparseArray.size * 28);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        int i = longSparseArray.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i2));
            sb.append('=');
            E valueAt = longSparseArray.valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final <T> int getSize(androidx.collection.LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.size();
    }

    public static final <T> boolean contains(androidx.collection.LongSparseArray<T> longSparseArray, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.containsKey(j);
    }

    public static final <T> void set(androidx.collection.LongSparseArray<T> longSparseArray, long j, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        longSparseArray.put(j, t);
    }

    public static final <T> androidx.collection.LongSparseArray<T> plus(androidx.collection.LongSparseArray<T> longSparseArray, androidx.collection.LongSparseArray<T> longSparseArray2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray2, "");
        androidx.collection.LongSparseArray<T> longSparseArray3 = new androidx.collection.LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        longSparseArray3.putAll(longSparseArray);
        longSparseArray3.putAll(longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> T getOrDefault(androidx.collection.LongSparseArray<T> longSparseArray, long j, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.get(j, t);
    }

    public static final <T> T getOrElse(androidx.collection.LongSparseArray<T> longSparseArray, long j, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        T t = longSparseArray.get(j);
        return t == null ? function0.invoke() : t;
    }

    public static final <T> boolean isNotEmpty(androidx.collection.LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return !longSparseArray.isEmpty();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(androidx.collection.LongSparseArray longSparseArray, long j, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return longSparseArray.remove(j, obj);
    }

    public static final <T> void forEach(androidx.collection.LongSparseArray<T> longSparseArray, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super T, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> kotlin.collections.LongIterator keyIterator(final androidx.collection.LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return new kotlin.collections.LongIterator() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
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
                androidx.collection.LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }
        };
    }

    public static final <T> java.util.Iterator<T> valueIterator(androidx.collection.LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        return new androidx.collection.LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <E> E commonGet(androidx.collection.LongSparseArray<E> longSparseArray, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == Camera2StreamConfigurationMap) {
            return null;
        }
        return (E) longSparseArray.values[binarySearch];
    }

    public static final <E> E commonGet(androidx.collection.LongSparseArray<E> longSparseArray, long j, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSparseArray, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == Camera2StreamConfigurationMap) ? e : (E) longSparseArray.values[binarySearch];
    }
}
