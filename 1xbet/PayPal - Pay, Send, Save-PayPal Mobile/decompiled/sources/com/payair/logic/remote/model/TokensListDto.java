package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/payair/logic/remote/model/TokensListDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "Lcom/payair/logic/remote/model/TokenDto;", "tokens", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/payair/logic/remote/model/TokensListDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTokens"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TokensListDto extends com.payair.hce.communication.JsonResponse {
    private final java.util.List<com.payair.logic.remote.model.TokenDto> tokens;

    /* JADX WARN: Multi-variable type inference failed */
    public TokensListDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.List<com.payair.logic.remote.model.TokenDto> getTokens() {
        return this.tokens;
    }

    public /* synthetic */ TokensListDto(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public TokensListDto(java.util.List<com.payair.logic.remote.model.TokenDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.tokens = list;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.util.List<com.payair.logic.remote.model.TokenDto> list = this.tokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokensListDto(tokens=");
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
        return (other instanceof com.payair.logic.remote.model.TokensListDto) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokens, ((com.payair.logic.remote.model.TokensListDto) other).tokens);
    }

    public final com.payair.logic.remote.model.TokensListDto copy(java.util.List<com.payair.logic.remote.model.TokenDto> tokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "");
        return new com.payair.logic.remote.model.TokensListDto(tokens);
    }

    public final java.util.List<com.payair.logic.remote.model.TokenDto> component1() {
        return this.tokens;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.logic.remote.model.TokensListDto copy$default(com.payair.logic.remote.model.TokensListDto tokensListDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = tokensListDto.tokens;
        }
        return tokensListDto.copy(list);
    }
}
