package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/TokensCardReferenceDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "issuerPanReference", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/payair/logic/remote/model/TokensCardReferenceDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssuerPanReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TokensCardReferenceDto extends com.payair.hce.communication.JsonResponse {
    private final java.lang.String issuerPanReference;

    /* JADX WARN: Multi-variable type inference failed */
    public TokensCardReferenceDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String getIssuerPanReference() {
        return this.issuerPanReference;
    }

    public /* synthetic */ TokensCardReferenceDto(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public TokensCardReferenceDto(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.issuerPanReference = str;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.lang.String str = this.issuerPanReference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokensCardReferenceDto(issuerPanReference=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.issuerPanReference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.logic.remote.model.TokensCardReferenceDto) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerPanReference, ((com.payair.logic.remote.model.TokensCardReferenceDto) other).issuerPanReference);
    }

    public final com.payair.logic.remote.model.TokensCardReferenceDto copy(java.lang.String issuerPanReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerPanReference, "");
        return new com.payair.logic.remote.model.TokensCardReferenceDto(issuerPanReference);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIssuerPanReference() {
        return this.issuerPanReference;
    }

    public static /* synthetic */ com.payair.logic.remote.model.TokensCardReferenceDto copy$default(com.payair.logic.remote.model.TokensCardReferenceDto tokensCardReferenceDto, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tokensCardReferenceDto.issuerPanReference;
        }
        return tokensCardReferenceDto.copy(str);
    }
}
