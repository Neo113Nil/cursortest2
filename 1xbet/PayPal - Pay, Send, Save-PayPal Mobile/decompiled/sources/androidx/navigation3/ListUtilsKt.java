package androidx.navigation3;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "Lkotlin/Function1;", "", "predicate", "fastAnyOrAny", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListUtilsKt {
    public static final <T> boolean fastAnyOrAny(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        if (!(list instanceof java.util.RandomAccess)) {
            java.util.List<? extends T> list2 = list;
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (function1.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
