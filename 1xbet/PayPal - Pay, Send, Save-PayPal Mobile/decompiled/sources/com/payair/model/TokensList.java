package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/TokensList;", "", "", "Lcom/payair/model/Token;", "tokens", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/payair/model/TokensList;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTokens"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TokensList {
    private final java.util.List<com.payair.model.Token> tokens;

    /* JADX WARN: Multi-variable type inference failed */
    public TokensList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.List<com.payair.model.Token> getTokens() {
        return this.tokens;
    }

    public TokensList(java.util.List<com.payair.model.Token> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.tokens = list;
    }

    public /* synthetic */ TokensList(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String toString() {
        java.util.List<com.payair.model.Token> list = this.tokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokensList(tokens=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.tokens.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.TokensList) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokens, ((com.payair.model.TokensList) other).tokens);
    }

    public final com.payair.model.TokensList copy(java.util.List<com.payair.model.Token> tokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "");
        return new com.payair.model.TokensList(tokens);
    }

    public final java.util.List<com.payair.model.Token> component1() {
        return this.tokens;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.model.TokensList copy$default(com.payair.model.TokensList tokensList, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = tokensList.tokens;
        }
        return tokensList.copy(list);
    }
}
