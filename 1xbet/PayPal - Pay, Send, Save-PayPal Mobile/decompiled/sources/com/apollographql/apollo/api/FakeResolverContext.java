package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/api/FakeResolverContext;", "", "", "path", "", "id", "Lcom/apollographql/apollo/api/CompiledField;", "mergedField", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/CompiledField;)V", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/CompiledField;", "getMergedField", "()Lcom/apollographql/apollo/api/CompiledField;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FakeResolverContext {
    private final java.lang.String id;
    private final com.apollographql.apollo.api.CompiledField mergedField;
    private final java.util.List<java.lang.Object> path;

    public FakeResolverContext(java.util.List<? extends java.lang.Object> list, java.lang.String str, com.apollographql.apollo.api.CompiledField compiledField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledField, "");
        this.path = list;
        this.id = str;
        this.mergedField = compiledField;
    }

    public final java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.apollographql.apollo.api.CompiledField getMergedField() {
        return this.mergedField;
    }
}
