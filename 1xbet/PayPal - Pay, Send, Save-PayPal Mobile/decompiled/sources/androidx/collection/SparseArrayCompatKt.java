package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a0\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a(\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a(\u0010\u0015\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001a\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u001a\u0010\u0014\u001a0\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001b\u0010\u0007\u001a0\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0012\u001a'\u0010 \u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001a2\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\"H\u0080\b¢\u0006\u0004\b \u0010#\u001a(\u0010$\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b$\u0010!\u001a0\u0010&\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b&\u0010'\u001a2\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b(\u0010\u0012\u001a8\u0010(\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b(\u0010+\u001a0\u0010,\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b,\u0010\u0007\u001a \u0010-\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b-\u0010.\u001a \u00100\u001a\u00020/\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b0\u00101\u001a(\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b2\u0010\u0010\u001a\u001f\u00103\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b3\u0010\t\"\u0014\u00106\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"E", "Landroidx/collection/SparseArrayCompat;", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "commonAppend", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "(Landroidx/collection/SparseArrayCompat;)V", "", "commonContainsKey", "(Landroidx/collection/SparseArrayCompat;I)Z", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "(Landroidx/collection/SparseArrayCompat;I)I", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "(Landroidx/collection/SparseArrayCompat;)Z", "index", "commonKeyAt", "commonPut", "other", "commonPutAll", "(Landroidx/collection/SparseArrayCompat;Landroidx/collection/SparseArrayCompat;)V", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/SparseArrayCompat;I)V", "", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "commonRemoveAt", io.ktor.http.ContentDisposition.Parameters.Size, "commonRemoveAtRange", "(Landroidx/collection/SparseArrayCompat;II)V", "commonReplace", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "(Landroidx/collection/SparseArrayCompat;)I", "", "commonToString", "(Landroidx/collection/SparseArrayCompat;)Ljava/lang/String;", "commonValueAt", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

    public static final <E> void commonRemove(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch >= 0) {
            java.lang.Object obj = sparseArrayCompat.values[binarySearch];
            java.lang.Object obj2 = getHighSpeedVideoFpsRangesFor;
            if (obj != obj2) {
                sparseArrayCompat.values[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> boolean commonRemove(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }

    public static final <E> void commonRemoveAt(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.values[i] != getHighSpeedVideoFpsRangesFor) {
            sparseArrayCompat.values[i] = getHighSpeedVideoFpsRangesFor;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int min = java.lang.Math.min(i2, i + i2);
        while (i < min) {
            sparseArrayCompat.removeAt(i);
            i++;
        }
    }

    public static final <E> E commonReplace(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        E e2 = (E) sparseArrayCompat.values[indexOfKey];
        sparseArrayCompat.values[indexOfKey] = e;
        return e2;
    }

    public static final <E> boolean commonReplace(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e, E e2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(sparseArrayCompat.values[indexOfKey], e)) {
            return false;
        }
        sparseArrayCompat.values[indexOfKey] = e2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void getHighSpeedVideoSizes(androidx.collection.SparseArrayCompat<E> sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        java.lang.Object[] objArr = sparseArrayCompat.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != getHighSpeedVideoFpsRangesFor) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i2;
    }

    public static final <E> void commonPut(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 < sparseArrayCompat.size && sparseArrayCompat.values[i2] == getHighSpeedVideoFpsRangesFor) {
            sparseArrayCompat.keys[i2] = i;
            sparseArrayCompat.values[i2] = e;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            getHighSpeedVideoSizes(sparseArrayCompat);
            i2 = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        }
        if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
            int[] copyOf = java.util.Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            sparseArrayCompat.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            sparseArrayCompat.values = copyOf2;
        }
        if (sparseArrayCompat.size - i2 != 0) {
            int i3 = i2 + 1;
            kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i3, i2, sparseArrayCompat.size);
            kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i3, i2, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i2] = i;
        sparseArrayCompat.values[i2] = e;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, androidx.collection.SparseArrayCompat<? extends E> sparseArrayCompat2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat2, "");
        int size = sparseArrayCompat2.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArrayCompat2.keyAt(i);
            E valueAt = sparseArrayCompat2.valueAt(i);
            int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i2 = ~binarySearch;
                if (i2 < sparseArrayCompat.size && sparseArrayCompat.values[i2] == getHighSpeedVideoFpsRangesFor) {
                    sparseArrayCompat.keys[i2] = keyAt;
                    sparseArrayCompat.values[i2] = valueAt;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        getHighSpeedVideoSizes(sparseArrayCompat);
                        i2 = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
                        int[] copyOf = java.util.Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                        sparseArrayCompat.keys = copyOf;
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                        sparseArrayCompat.values = copyOf2;
                    }
                    if (sparseArrayCompat.size - i2 != 0) {
                        int i3 = i2 + 1;
                        kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i3, i2, sparseArrayCompat.size);
                        kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i3, i2, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i2] = keyAt;
                    sparseArrayCompat.values[i2] = valueAt;
                    sparseArrayCompat.size++;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        E e2 = (E) commonGet(sparseArrayCompat, i);
        if (e2 == null) {
            int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e;
                return e2;
            }
            int i2 = ~binarySearch;
            if (i2 < sparseArrayCompat.size && sparseArrayCompat.values[i2] == getHighSpeedVideoFpsRangesFor) {
                sparseArrayCompat.keys[i2] = i;
                sparseArrayCompat.values[i2] = e;
                return e2;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                getHighSpeedVideoSizes(sparseArrayCompat);
                i2 = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            }
            if (sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(sparseArrayCompat.size + 1);
                int[] copyOf = java.util.Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                sparseArrayCompat.keys = copyOf;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                sparseArrayCompat.values = copyOf2;
            }
            if (sparseArrayCompat.size - i2 != 0) {
                int i3 = i2 + 1;
                kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.keys, sparseArrayCompat.keys, i3, i2, sparseArrayCompat.size);
                kotlin.collections.ArraysKt.copyInto(sparseArrayCompat.values, sparseArrayCompat.values, i3, i2, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i2] = i;
            sparseArrayCompat.values[i2] = e;
            sparseArrayCompat.size++;
        }
        return e2;
    }

    public static final <E> int commonSize(androidx.collection.SparseArrayCompat<E> sparseArrayCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> boolean commonIsEmpty(androidx.collection.SparseArrayCompat<E> sparseArrayCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i];
    }

    public static final <E> E commonValueAt(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        if (i >= sparseArrayCompat.values.length) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return (E) sparseArrayCompat.values[i];
    }

    public static final <E> void commonSetValueAt(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        sparseArrayCompat.values[i] = e;
    }

    public static final <E> int commonIndexOfKey(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        return androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
    }

    public static final <E> int commonIndexOfValue(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (sparseArrayCompat.values[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        return sparseArrayCompat.indexOfKey(i) >= 0;
    }

    public static final <E> void commonClear(androidx.collection.SparseArrayCompat<E> sparseArrayCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int i = sparseArrayCompat.size;
        java.lang.Object[] objArr = sparseArrayCompat.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> void commonAppend(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.size != 0 && i <= sparseArrayCompat.keys[sparseArrayCompat.size - 1]) {
            sparseArrayCompat.put(i, e);
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        if (i2 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i2 + 1);
            int[] copyOf = java.util.Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            sparseArrayCompat.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            sparseArrayCompat.values = copyOf2;
        }
        sparseArrayCompat.keys[i2] = i;
        sparseArrayCompat.values[i2] = e;
        sparseArrayCompat.size = i2 + 1;
    }

    public static final <E> java.lang.String commonToString(androidx.collection.SparseArrayCompat<E> sparseArrayCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(sparseArrayCompat.size * 28);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        int i = sparseArrayCompat.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i2));
            sb.append('=');
            E valueAt = sparseArrayCompat.valueAt(i2);
            if (valueAt != sparseArrayCompat) {
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

    public static final <E> E commonGet(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch < 0 || sparseArrayCompat.values[binarySearch] == getHighSpeedVideoFpsRangesFor) {
            return null;
        }
        return (E) sparseArrayCompat.values[binarySearch];
    }

    public static final <E> E commonGet(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (binarySearch < 0 || sparseArrayCompat.values[binarySearch] == getHighSpeedVideoFpsRangesFor) ? e : (E) sparseArrayCompat.values[binarySearch];
    }

    public static final <E> boolean commonContainsValue(androidx.collection.SparseArrayCompat<E> sparseArrayCompat, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArrayCompat, "");
        if (sparseArrayCompat.garbage) {
            getHighSpeedVideoSizes(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (sparseArrayCompat.values[i2] != e) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }
}
