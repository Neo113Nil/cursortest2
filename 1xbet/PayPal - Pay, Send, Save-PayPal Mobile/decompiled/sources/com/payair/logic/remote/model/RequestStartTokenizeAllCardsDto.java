package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/RequestStartTokenizeAllCardsDto;", "", "", "userReference", "authRef", "issuerId", "issuerSubSection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/RequestStartTokenizeAllCardsDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthRef", "getIssuerId", "getIssuerSubSection", "getUserReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestStartTokenizeAllCardsDto {
    private final java.lang.String authRef;
    private final java.lang.String issuerId;
    private final java.lang.String issuerSubSection;
    private final java.lang.String userReference;

    public RequestStartTokenizeAllCardsDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.userReference = str;
        this.authRef = str2;
        this.issuerId = str3;
        this.issuerSubSection = str4;
    }

    public final java.lang.String getAuthRef() {
        return this.authRef;
    }

    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    public final java.lang.String getIssuerSubSection() {
        return this.issuerSubSection;
    }

    public final java.lang.String getUserReference() {
        return this.userReference;
    }

    public final int hashCode() {
        return this.issuerSubSection.hashCode() + com.payair.csdk.w3.a(this.issuerId, com.payair.csdk.w3.a(this.authRef, this.userReference.hashCode() * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userReference;
        java.lang.String str2 = this.authRef;
        java.lang.String str3 = this.issuerId;
        java.lang.String str4 = this.issuerSubSection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestStartTokenizeAllCardsDto(userReference=");
        sb.append(str);
        sb.append(", authRef=");
        sb.append(str2);
        sb.append(", issuerId=");
        sb.append(str3);
        sb.append(", issuerSubSection=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto)) {
            return false;
        }
        com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto requestStartTokenizeAllCardsDto = (com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userReference, requestStartTokenizeAllCardsDto.userReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.authRef, requestStartTokenizeAllCardsDto.authRef) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerId, requestStartTokenizeAllCardsDto.issuerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerSubSection, requestStartTokenizeAllCardsDto.issuerSubSection);
    }

    public final com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto copy(java.lang.String userReference, java.lang.String authRef, java.lang.String issuerId, java.lang.String issuerSubSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerSubSection, "");
        return new com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto(userReference, authRef, issuerId, issuerSubSection);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerSubSection() {
        return this.issuerSubSection;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAuthRef() {
        return this.authRef;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserReference() {
        return this.userReference;
    }

    public static /* synthetic */ com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto copy$default(com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto requestStartTokenizeAllCardsDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestStartTokenizeAllCardsDto.userReference;
        }
        if ((i & 2) != 0) {
            str2 = requestStartTokenizeAllCardsDto.authRef;
        }
        if ((i & 4) != 0) {
            str3 = requestStartTokenizeAllCardsDto.issuerId;
        }
        if ((i & 8) != 0) {
            str4 = requestStartTokenizeAllCardsDto.issuerSubSection;
        }
        return requestStartTokenizeAllCardsDto.copy(str, str2, str3, str4);
    }
}
