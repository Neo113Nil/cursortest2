package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/EncryptedCardForTokenization;", "", "", "encryptedCard", "issuerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/EncryptedCardForTokenization;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEncryptedCard", "getIssuerId"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EncryptedCardForTokenization {
    private final java.lang.String encryptedCard;
    private final java.lang.String issuerId;

    public EncryptedCardForTokenization(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.encryptedCard = str;
        this.issuerId = str2;
    }

    public final java.lang.String getEncryptedCard() {
        return this.encryptedCard;
    }

    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.encryptedCard;
        java.lang.String str2 = this.issuerId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EncryptedCardForTokenization(encryptedCard=");
        sb.append(str);
        sb.append(", issuerId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.encryptedCard.hashCode();
        java.lang.String str = this.issuerId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.EncryptedCardForTokenization)) {
            return false;
        }
        com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization = (com.payair.model.EncryptedCardForTokenization) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCard, encryptedCardForTokenization.encryptedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerId, encryptedCardForTokenization.issuerId);
    }

    public final com.payair.model.EncryptedCardForTokenization copy(java.lang.String encryptedCard, java.lang.String issuerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCard, "");
        return new com.payair.model.EncryptedCardForTokenization(encryptedCard, issuerId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIssuerId() {
        return this.issuerId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEncryptedCard() {
        return this.encryptedCard;
    }

    public static /* synthetic */ com.payair.model.EncryptedCardForTokenization copy$default(com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = encryptedCardForTokenization.encryptedCard;
        }
        if ((i & 2) != 0) {
            str2 = encryptedCardForTokenization.issuerId;
        }
        return encryptedCardForTokenization.copy(str, str2);
    }
}
