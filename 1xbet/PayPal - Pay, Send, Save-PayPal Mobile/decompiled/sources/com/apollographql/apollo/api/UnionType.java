package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/UnionType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "name", "Lcom/apollographql/apollo/api/ObjectType;", "members", "<init>", "(Ljava/lang/String;[Lcom/apollographql/apollo/api/ObjectType;)V", "", "[Lcom/apollographql/apollo/api/ObjectType;", "getMembers", "()[Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnionType extends com.apollographql.apollo.api.CompiledNamedType {
    private final com.apollographql.apollo.api.ObjectType[] members;

    public final com.apollographql.apollo.api.ObjectType[] getMembers() {
        return this.members;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionType(java.lang.String str, com.apollographql.apollo.api.ObjectType... objectTypeArr) {
        super(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectTypeArr, "");
        this.members = objectTypeArr;
    }
}
