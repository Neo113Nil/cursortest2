package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/apollographql/apollo/api/BPossibleTypes;", "Lcom/apollographql/apollo/api/BTerm;", "", "", "possibleTypes", "<init>", "(Ljava/util/Set;)V", "types", "([Ljava/lang/String;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/apollographql/apollo/api/BPossibleTypes;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getPossibleTypes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BPossibleTypes extends com.apollographql.apollo.api.BTerm {
    private final java.util.Set<java.lang.String> possibleTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPossibleTypes(java.util.Set<java.lang.String> set) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.possibleTypes = set;
    }

    public final java.util.Set<java.lang.String> getPossibleTypes() {
        return this.possibleTypes;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BPossibleTypes(java.lang.String... strArr) {
        this((java.util.Set<java.lang.String>) kotlin.collections.ArraysKt.toSet(strArr));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BPossibleTypes(possibleTypes=");
        sb.append(this.possibleTypes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.possibleTypes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.apollographql.apollo.api.BPossibleTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.possibleTypes, ((com.apollographql.apollo.api.BPossibleTypes) other).possibleTypes);
    }

    public final com.apollographql.apollo.api.BPossibleTypes copy(java.util.Set<java.lang.String> possibleTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(possibleTypes, "");
        return new com.apollographql.apollo.api.BPossibleTypes(possibleTypes);
    }

    public final java.util.Set<java.lang.String> component1() {
        return this.possibleTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.apollographql.apollo.api.BPossibleTypes copy$default(com.apollographql.apollo.api.BPossibleTypes bPossibleTypes, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = bPossibleTypes.possibleTypes;
        }
        return bPossibleTypes.copy(set);
    }
}
