package androidx.compose.runtime.collection;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a8\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a.\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0006H\u0080\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", "Landroidx/collection/ScatterSet;", "", "wrapIntoSet", "(Landroidx/collection/ScatterSet;)Ljava/util/Set;", "", "Lkotlin/Function1;", "", "block", "fastForEach", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "", "fastAny", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    public static final <T> java.util.Set<T> wrapIntoSet(androidx.collection.ScatterSet<T> scatterSet) {
        return new androidx.compose.runtime.collection.ScatterSetWrapper(scatterSet);
    }

    public static final <T> void fastForEach(java.util.Set<? extends T> set, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (set instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
            androidx.collection.ScatterSet<T> set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) set).getSet$runtime();
            java.lang.Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            function1.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }

    public static final boolean fastAny(java.util.Set<? extends java.lang.Object> set, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        if (set instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
            androidx.collection.ScatterSet set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) set).getSet$runtime();
            java.lang.Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128 && function1.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                                return true;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return false;
        }
        java.util.Set<? extends java.lang.Object> set2 = set;
        if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
