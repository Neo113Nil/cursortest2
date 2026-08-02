package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class MemberScopeKt {
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> flatMapClassifierNamesOrNull(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> classifierNames = it.next().getClassifierNames();
            if (classifierNames == null) {
                hashSet = null;
                break;
            }
            kotlin.collections.CollectionsKt.addAll(hashSet, classifierNames);
        }
        return hashSet;
    }
}
