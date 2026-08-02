package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJF\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/payair/model/CardData;", "", "", "pan", "expMonth", "expYear", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "chName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/CardData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChName", "getCvv", "getExpMonth", "getExpYear", "getPan"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardData {
    public java.lang.String chName;
    public java.lang.String cvv;
    public java.lang.String expMonth;
    public java.lang.String expYear;
    public java.lang.String pan;

    public CardData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.pan = str;
        this.expMonth = str2;
        this.expYear = str3;
        this.cvv = str4;
        this.chName = str5;
    }

    public final java.lang.String getChName() {
        return this.chName;
    }

    public final java.lang.String getCvv() {
        return this.cvv;
    }

    public final java.lang.String getExpMonth() {
        return this.expMonth;
    }

    public final java.lang.String getExpYear() {
        return this.expYear;
    }

    public final java.lang.String getPan() {
        return this.pan;
    }

    public final int hashCode() {
        int a2 = com.payair.csdk.w3.a(this.expYear, com.payair.csdk.w3.a(this.expMonth, this.pan.hashCode() * 31, 31), 31);
        java.lang.String str = this.cvv;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.chName;
        return ((a2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ CardData() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pan;
        java.lang.String str2 = this.expMonth;
        java.lang.String str3 = this.expYear;
        java.lang.String str4 = this.cvv;
        java.lang.String str5 = this.chName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardData(pan=");
        sb.append(str);
        sb.append(", expMonth=");
        sb.append(str2);
        sb.append(", expYear=");
        sb.append(str3);
        sb.append(", cvv=");
        sb.append(str4);
        sb.append(", chName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.CardData)) {
            return false;
        }
        com.payair.model.CardData cardData = (com.payair.model.CardData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pan, cardData.pan) && kotlin.jvm.internal.Intrinsics.areEqual(this.expMonth, cardData.expMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.expYear, cardData.expYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, cardData.cvv) && kotlin.jvm.internal.Intrinsics.areEqual(this.chName, cardData.chName);
    }

    public final com.payair.model.CardData copy(java.lang.String pan, java.lang.String expMonth, java.lang.String expYear, java.lang.String cvv, java.lang.String chName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pan, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expYear, "");
        return new com.payair.model.CardData(pan, expMonth, expYear, cvv, chName);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getChName() {
        return this.chName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCvv() {
        return this.cvv;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExpYear() {
        return this.expYear;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPan() {
        return this.pan;
    }

    public static /* synthetic */ com.payair.model.CardData copy$default(com.payair.model.CardData cardData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardData.pan;
        }
        if ((i & 2) != 0) {
            str2 = cardData.expMonth;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cardData.expYear;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cardData.cvv;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cardData.chName;
        }
        return cardData.copy(str, str6, str7, str8, str5);
    }
}
