package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/KClass;", "", "normalizedCacheName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloStore_concurrentKt {
    public static final java.lang.String normalizedCacheName(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.String qualifiedName = kClass.getQualifiedName();
        return qualifiedName == null ? kClass.toString() : qualifiedName;
    }
}
