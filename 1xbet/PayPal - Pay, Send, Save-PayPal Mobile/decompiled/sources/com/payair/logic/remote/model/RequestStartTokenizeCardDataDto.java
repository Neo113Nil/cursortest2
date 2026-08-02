package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/payair/logic/remote/model/RequestStartTokenizeCardDataDto;", "", "Lcom/payair/logic/remote/model/EncryptedCard;", "encryptedCard", "", "issuerId", "locale", "consumerEntryMode", "<init>", "(Lcom/payair/logic/remote/model/EncryptedCard;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/payair/logic/remote/model/EncryptedCard;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/payair/logic/remote/model/EncryptedCard;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/RequestStartTokenizeCardDataDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConsumerEntryMode", "Lcom/payair/logic/remote/model/EncryptedCard;", "getEncryptedCard", "getIssuerId", "getLocale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestStartTokenizeCardDataDto {
    private final java.lang.String consumerEntryMode;
    private final com.payair.logic.remote.model.EncryptedCard encryptedCard;
    private final java.lang.String issuerId;
    private final java.lang.String locale;

    public RequestStartTokenizeCardDataDto(com.payair.logic.remote.model.EncryptedCard encryptedCard, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.encryptedCard = encryptedCard;
        this.issuerId = str;
        this.locale = str2;
        this.consumerEntryMode = str3;
    }

    public final java.lang.String getConsumerEntryMode() {
        return this.consumerEntryMode;
    }

    public final com.payair.logic.remote.model.EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    public final java.lang.String getLocale() {
        return this.locale;
    }

    public final int hashCode() {
        int hashCode = this.encryptedCard.hashCode();
        java.lang.String str = this.issuerId;
        return this.consumerEntryMode.hashCode() + com.payair.csdk.w3.a(this.locale, ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public /* synthetic */ RequestStartTokenizeCardDataDto(com.payair.logic.remote.model.EncryptedCard encryptedCard, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(encryptedCard, str, str2, (i & 8) != 0 ? "UNKNOWN" : str3);
    }

    public final java.lang.String toString() {
        com.payair.logic.remote.model.EncryptedCard encryptedCard = this.encryptedCard;
        java.lang.String str = this.issuerId;
        java.lang.String str2 = this.locale;
        java.lang.String str3 = this.consumerEntryMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestStartTokenizeCardDataDto(encryptedCard=");
        sb.append(encryptedCard);
        sb.append(", issuerId=");
        sb.append(str);
        sb.append(", locale=");
        sb.append(str2);
        sb.append(", consumerEntryMode=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.RequestStartTokenizeCardDataDto)) {
            return false;
        }
        com.payair.logic.remote.model.RequestStartTokenizeCardDataDto requestStartTokenizeCardDataDto = (com.payair.logic.remote.model.RequestStartTokenizeCardDataDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCard, requestStartTokenizeCardDataDto.encryptedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerId, requestStartTokenizeCardDataDto.issuerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, requestStartTokenizeCardDataDto.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerEntryMode, requestStartTokenizeCardDataDto.consumerEntryMode);
    }

    public final com.payair.logic.remote.model.RequestStartTokenizeCardDataDto copy(com.payair.logic.remote.model.EncryptedCard encryptedCard, java.lang.String issuerId, java.lang.String locale, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        return new com.payair.logic.remote.model.RequestStartTokenizeCardDataDto(encryptedCard, issuerId, locale, consumerEntryMode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getConsumerEntryMode() {
        return this.consumerEntryMode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLocale() {
        return this.locale;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.logic.remote.model.EncryptedCard getEncryptedCard() {
        return this.encryptedCard;
    }

    public static /* synthetic */ com.payair.logic.remote.model.RequestStartTokenizeCardDataDto copy$default(com.payair.logic.remote.model.RequestStartTokenizeCardDataDto requestStartTokenizeCardDataDto, com.payair.logic.remote.model.EncryptedCard encryptedCard, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            encryptedCard = requestStartTokenizeCardDataDto.encryptedCard;
        }
        if ((i & 2) != 0) {
            str = requestStartTokenizeCardDataDto.issuerId;
        }
        if ((i & 4) != 0) {
            str2 = requestStartTokenizeCardDataDto.locale;
        }
        if ((i & 8) != 0) {
            str3 = requestStartTokenizeCardDataDto.consumerEntryMode;
        }
        return requestStartTokenizeCardDataDto.copy(encryptedCard, str, str2, str3);
    }
}
