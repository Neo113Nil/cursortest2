package com.zettle.sdk.extensions;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0002\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "", "zReversed", "(Ljava/lang/Iterable;)Ljava/util/List;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleCollectionsExtKt {
    public static final <T> java.util.List<T> zReversed(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(0, it.next());
        }
        return arrayList;
    }
}
