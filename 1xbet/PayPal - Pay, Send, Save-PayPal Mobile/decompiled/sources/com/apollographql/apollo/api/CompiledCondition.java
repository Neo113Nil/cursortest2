package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/api/CompiledCondition;", "", "", "name", "", "inverted", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/CompiledCondition;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Z", "getInverted"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CompiledCondition {
    private final boolean inverted;
    private final java.lang.String name;

    public CompiledCondition(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.inverted = z;
    }

    public final boolean getInverted() {
        return this.inverted;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompiledCondition(name=");
        sb.append(this.name);
        sb.append(", inverted=");
        sb.append(this.inverted);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + java.lang.Boolean.hashCode(this.inverted);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.apollographql.apollo.api.CompiledCondition)) {
            return false;
        }
        com.apollographql.apollo.api.CompiledCondition compiledCondition = (com.apollographql.apollo.api.CompiledCondition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, compiledCondition.name) && this.inverted == compiledCondition.inverted;
    }

    public final com.apollographql.apollo.api.CompiledCondition copy(java.lang.String name2, boolean inverted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.apollographql.apollo.api.CompiledCondition(name2, inverted);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInverted() {
        return this.inverted;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.apollographql.apollo.api.CompiledCondition copy$default(com.apollographql.apollo.api.CompiledCondition compiledCondition, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = compiledCondition.name;
        }
        if ((i & 2) != 0) {
            z = compiledCondition.inverted;
        }
        return compiledCondition.copy(str, z);
    }
}
