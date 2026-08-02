package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

/* loaded from: classes5.dex */
public final class ScopeUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Collection<T> concat(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> collection2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection2, "");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> listOfNonEmptyScopes(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList<>();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : iterable) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope2 = memberScope;
            if (memberScope2 != null && memberScope2 != kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE) {
                smartList.add(memberScope);
            }
        }
        return smartList;
    }
}
