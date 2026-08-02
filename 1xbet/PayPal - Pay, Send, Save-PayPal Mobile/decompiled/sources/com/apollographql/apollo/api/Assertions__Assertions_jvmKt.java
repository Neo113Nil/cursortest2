package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a;\u0010\u0004\u001a\u00020\u00032*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00010\u0000\"\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/util/Optional;", "p0", "", "assertOneOf", "([Ljava/util/Optional;)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/Assertions")
/* loaded from: classes7.dex */
final /* synthetic */ class Assertions__Assertions_jvmKt {
    @java.lang.SafeVarargs
    public static final void assertOneOf(java.util.Optional<? extends java.util.Optional<?>>... optionalArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Optional<? extends java.util.Optional<?>> optional : optionalArr) {
            if (optional.isPresent()) {
                arrayList.add(optional);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("@oneOf input must have one field set (got ");
            sb.append(arrayList2.size());
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!((java.util.Optional) ((java.util.Optional) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).get()).isPresent()) {
            throw new java.lang.IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }
}
