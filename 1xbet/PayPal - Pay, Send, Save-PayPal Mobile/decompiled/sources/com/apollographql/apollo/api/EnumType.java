package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/api/EnumType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "name", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "getValues", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumType extends com.apollographql.apollo.api.CompiledNamedType {
    private final java.util.List<java.lang.String> values;

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumType(java.lang.String str, java.util.List<java.lang.String> list) {
        super(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.values = list;
    }
}
