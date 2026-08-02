package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/CompiledNotNullType;", "Lcom/apollographql/apollo/api/CompiledType;", "ofType", "<init>", "(Lcom/apollographql/apollo/api/CompiledType;)V", "Lcom/apollographql/apollo/api/CompiledNamedType;", "leafType", "()Lcom/apollographql/apollo/api/CompiledNamedType;", "rawType", "Lcom/apollographql/apollo/api/CompiledType;", "getOfType", "()Lcom/apollographql/apollo/api/CompiledType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompiledNotNullType extends com.apollographql.apollo.api.CompiledType {
    private final com.apollographql.apollo.api.CompiledType ofType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompiledNotNullType(com.apollographql.apollo.api.CompiledType compiledType) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledType, "");
        this.ofType = compiledType;
    }

    public final com.apollographql.apollo.api.CompiledType getOfType() {
        return this.ofType;
    }

    @Override // com.apollographql.apollo.api.CompiledType
    @kotlin.Deprecated(message = "Use rawType instead", replaceWith = @kotlin.ReplaceWith(expression = "rawType()", imports = {}))
    public final com.apollographql.apollo.api.CompiledNamedType leafType() {
        return this.ofType.rawType();
    }

    @Override // com.apollographql.apollo.api.CompiledType
    public final com.apollographql.apollo.api.CompiledNamedType rawType() {
        return this.ofType.rawType();
    }
}
