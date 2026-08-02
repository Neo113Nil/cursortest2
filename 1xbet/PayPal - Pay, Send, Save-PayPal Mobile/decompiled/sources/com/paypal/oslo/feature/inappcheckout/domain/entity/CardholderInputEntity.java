package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardholderInputEntity {
    public static final int $stable = 0;
    private final java.lang.String givenName;
    private final java.lang.String surname;

    public CardholderInputEntity(java.lang.String str, java.lang.String str2) {
        this.givenName = str;
        this.surname = str2;
    }

    public /* synthetic */ CardholderInputEntity(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public final java.lang.String getSurname() {
        return this.surname;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.givenName;
        java.lang.String str2 = this.surname;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardholderInputEntity(givenName=");
        sb.append(str);
        sb.append(", surname=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.givenName;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.surname;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholderInputEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, cardholderInputEntity.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, cardholderInputEntity.surname);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity copy(java.lang.String givenName, java.lang.String surname) {
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity(givenName, surname);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSurname() {
        return this.surname;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholderInputEntity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardholderInputEntity.givenName;
        }
        if ((i & 2) != 0) {
            str2 = cardholderInputEntity.surname;
        }
        return cardholderInputEntity.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardholderInputEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
