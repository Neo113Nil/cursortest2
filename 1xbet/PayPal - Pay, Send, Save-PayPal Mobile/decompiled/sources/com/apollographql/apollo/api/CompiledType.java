package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0001\u0003\b\u0004\t"}, d2 = {"Lcom/apollographql/apollo/api/CompiledType;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledNamedType;", "leafType", "()Lcom/apollographql/apollo/api/CompiledNamedType;", "rawType", "Lcom/apollographql/apollo/api/CompiledListType;", "Lcom/apollographql/apollo/api/CompiledNotNullType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompiledType {
    @kotlin.Deprecated(message = "Use rawType instead", replaceWith = @kotlin.ReplaceWith(expression = "rawType()", imports = {}))
    public abstract com.apollographql.apollo.api.CompiledNamedType leafType();

    public abstract com.apollographql.apollo.api.CompiledNamedType rawType();

    private CompiledType() {
    }

    public /* synthetic */ CompiledType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
