package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/FakeResolver;", "", "Lcom/apollographql/apollo/api/FakeResolverContext;", "context", "resolveLeaf", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Ljava/lang/Object;", "", "resolveListSize", "(Lcom/apollographql/apollo/api/FakeResolverContext;)I", "", "resolveMaybeNull", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Z", "", "resolveTypename", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Ljava/lang/String;", "", "obj", "Lcom/apollographql/apollo/api/CompiledField;", "mergedField", "stableIdForObject", "(Ljava/util/Map;Lcom/apollographql/apollo/api/CompiledField;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FakeResolver {
    java.lang.Object resolveLeaf(com.apollographql.apollo.api.FakeResolverContext context);

    int resolveListSize(com.apollographql.apollo.api.FakeResolverContext context);

    boolean resolveMaybeNull(com.apollographql.apollo.api.FakeResolverContext context);

    java.lang.String resolveTypename(com.apollographql.apollo.api.FakeResolverContext context);

    java.lang.String stableIdForObject(java.util.Map<java.lang.String, ? extends java.lang.Object> obj, com.apollographql.apollo.api.CompiledField mergedField);
}
