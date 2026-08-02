package androidx.compose.runtime.collection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a@\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\t\u0010\u0006\u001a4\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001aE\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u000b\u001aE\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/collection/ObjectList;", "Lkotlin/Function1;", "transform", "fastMap", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", "predicate", "fastFilter", "all", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/collection/MutableObjectList;", "toMutableObjectList", "(Landroidx/collection/ObjectList;)Landroidx/collection/MutableObjectList;", "", "K", "selector", "sortedBy", "isSorted", "", "sortBy", "(Landroidx/collection/MutableObjectList;Lkotlin/jvm/functions/Function1;)V", "removeLast", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtensionsKt {
    public static final <T, R> androidx.collection.ObjectList<R> fastMap(androidx.collection.ObjectList<T> objectList, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(objectList.getSize());
        java.lang.Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            mutableObjectList.add(function1.invoke(objArr[i2]));
        }
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.collection.MutableObjectList<T> toMutableObjectList(androidx.collection.ObjectList<T> objectList) {
        androidx.collection.MutableObjectList<T> mutableObjectList = (androidx.collection.MutableObjectList<T>) new androidx.collection.MutableObjectList(objectList.getSize());
        java.lang.Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            mutableObjectList.add(objArr[i2]);
        }
        return mutableObjectList;
    }

    public static final <T, K extends java.lang.Comparable<? super K>> androidx.collection.ObjectList<T> sortedBy(androidx.collection.ObjectList<T> objectList, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        if (isSorted(objectList, function1)) {
            return objectList;
        }
        androidx.collection.MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, function1);
        return mutableObjectList;
    }

    public static final <T, K extends java.lang.Comparable<? super K>> boolean isSorted(androidx.collection.ObjectList<T> objectList, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        K invoke = function1.invoke(objectList.get(0));
        if (invoke == null) {
            return false;
        }
        int size = objectList.getSize();
        int i = 1;
        while (i < size) {
            K invoke2 = function1.invoke(objectList.get(i));
            if (invoke2 == null || invoke.compareTo(invoke2) > 0) {
                return false;
            }
            i++;
            invoke = invoke2;
        }
        return true;
    }

    public static final <T, K extends java.lang.Comparable<? super K>> void sortBy(androidx.collection.MutableObjectList<T> mutableObjectList, final kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        java.util.List<T> asMutableList = mutableObjectList.asMutableList();
        if (asMutableList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(asMutableList, new java.util.Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    kotlin.jvm.functions.Function1 function12 = kotlin.jvm.functions.Function1.this;
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) function12.invoke(t), (java.lang.Comparable) function12.invoke(t2));
                }
            });
        }
    }

    public static final <T> T removeLast(androidx.collection.MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t;
    }

    public static final <T> androidx.collection.ObjectList<T> fastFilter(androidx.collection.ObjectList<T> objectList, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        java.lang.Object[] objArr = objectList.content;
        int i = objectList._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (!function1.invoke(objArr[i3]).booleanValue()) {
                androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(i2, 1, null);
                java.lang.Object[] objArr2 = objectList.content;
                int i4 = objectList._size;
                while (i2 < i4) {
                    java.lang.Object obj = objArr2[i2];
                    if (function1.invoke(obj).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                    i2++;
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    public static final <T> boolean all(androidx.collection.ObjectList<T> objectList, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        java.lang.Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!function1.invoke(objArr[i2]).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
