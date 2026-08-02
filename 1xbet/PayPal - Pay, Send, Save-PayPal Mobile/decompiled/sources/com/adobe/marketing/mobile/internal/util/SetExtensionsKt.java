package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "isAllString", "(Ljava/util/Set;)Z"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SetExtensionsKt {
    public static final boolean isAllString(java.util.Set<?> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (set.isEmpty()) {
            return false;
        }
        java.util.Set<?> set2 = set;
        if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.lang.String)) {
                return false;
            }
        }
        return true;
    }
}
