package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/apollographql/apollo/api/CompiledNamedType;", "Lcom/apollographql/apollo/api/CompiledType;", "", "p0", "<init>", "(Ljava/lang/String;)V", "leafType", "()Lcom/apollographql/apollo/api/CompiledNamedType;", "rawType", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/CustomScalarType;", "Lcom/apollographql/apollo/api/EnumType;", "Lcom/apollographql/apollo/api/InputObjectType;", "Lcom/apollographql/apollo/api/InterfaceType;", "Lcom/apollographql/apollo/api/ObjectType;", "Lcom/apollographql/apollo/api/ScalarType;", "Lcom/apollographql/apollo/api/UnionType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompiledNamedType extends com.apollographql.apollo.api.CompiledType {
    private final java.lang.String name;

    @Override // com.apollographql.apollo.api.CompiledType
    @kotlin.Deprecated(message = "Use rawType instead", replaceWith = @kotlin.ReplaceWith(expression = "rawType()", imports = {}))
    public com.apollographql.apollo.api.CompiledNamedType leafType() {
        return this;
    }

    @Override // com.apollographql.apollo.api.CompiledType
    public com.apollographql.apollo.api.CompiledNamedType rawType() {
        return this;
    }

    private CompiledNamedType(java.lang.String str) {
        super(null);
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ CompiledNamedType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
