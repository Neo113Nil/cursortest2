package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "name", "className", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomScalarType extends com.apollographql.apollo.api.CompiledNamedType {
    private final java.lang.String className;

    public final java.lang.String getClassName() {
        return this.className;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomScalarType(java.lang.String str, java.lang.String str2) {
        super(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.className = str2;
    }
}
