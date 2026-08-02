package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007\"\u0010\b\u0002\u0010\t*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00028\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"T", "", "Lkotlin/Function1;", "", "action", "fastForEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "transform", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "Lkotlin/Function2;", "fastZipWithNext", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final <T, R> java.util.List<R> fastZipWithNext(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        amex.AMEXKernel aMEXKernel = list.get(0);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        while (i < lastIndex) {
            i++;
            T t = list.get(i);
            arrayList.add(function2.invoke(aMEXKernel, t));
            aMEXKernel = t;
        }
        return arrayList;
    }

    public static final <T, R, C extends java.util.Collection<? super R>> C fastMapTo(java.util.List<? extends T> list, C c, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(function1.invoke(list.get(i)));
        }
        return c;
    }
}
