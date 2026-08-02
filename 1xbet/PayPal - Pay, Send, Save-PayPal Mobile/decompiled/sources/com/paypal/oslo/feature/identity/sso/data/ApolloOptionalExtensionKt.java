package com.paypal.oslo.feature.identity.sso.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lcom/apollographql/apollo/api/Optional;", "toOptional", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApolloOptionalExtensionKt {
    public static final <T> com.apollographql.apollo.api.Optional<T> toOptional(T t) {
        return t != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(t) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
    }
}
