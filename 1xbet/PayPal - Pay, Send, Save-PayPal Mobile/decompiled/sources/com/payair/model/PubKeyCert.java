package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/payair/model/PubKeyCert;", "", "", "certificate", "exponent", "remainder", "Lcom/payair/model/ExpirationDate;", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/ExpirationDate;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/payair/model/ExpirationDate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/ExpirationDate;)Lcom/payair/model/PubKeyCert;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCertificate", "Lcom/payair/model/ExpirationDate;", "getExpirationDate", "getExponent", "getRemainder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PubKeyCert {
    public java.lang.String certificate;
    public com.payair.model.ExpirationDate expirationDate;
    public java.lang.String exponent;
    public java.lang.String remainder;

    public PubKeyCert() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.String getCertificate() {
        return this.certificate;
    }

    public final com.payair.model.ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public final java.lang.String getExponent() {
        return this.exponent;
    }

    public final java.lang.String getRemainder() {
        return this.remainder;
    }

    public PubKeyCert(java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.model.ExpirationDate expirationDate) {
        this.certificate = str;
        this.exponent = str2;
        this.remainder = str3;
        this.expirationDate = expirationDate;
    }

    public /* synthetic */ PubKeyCert(java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.model.ExpirationDate expirationDate, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : expirationDate);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.certificate;
        java.lang.String str2 = this.exponent;
        java.lang.String str3 = this.remainder;
        com.payair.model.ExpirationDate expirationDate = this.expirationDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PubKeyCert(certificate=");
        sb.append(str);
        sb.append(", exponent=");
        sb.append(str2);
        sb.append(", remainder=");
        sb.append(str3);
        sb.append(", expirationDate=");
        sb.append(expirationDate);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.certificate;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.exponent;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.remainder;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        com.payair.model.ExpirationDate expirationDate = this.expirationDate;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (expirationDate != null ? expirationDate.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.PubKeyCert)) {
            return false;
        }
        com.payair.model.PubKeyCert pubKeyCert = (com.payair.model.PubKeyCert) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.certificate, pubKeyCert.certificate) && kotlin.jvm.internal.Intrinsics.areEqual(this.exponent, pubKeyCert.exponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainder, pubKeyCert.remainder) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, pubKeyCert.expirationDate);
    }

    public final com.payair.model.PubKeyCert copy(java.lang.String certificate, java.lang.String exponent, java.lang.String remainder, com.payair.model.ExpirationDate expirationDate) {
        return new com.payair.model.PubKeyCert(certificate, exponent, remainder, expirationDate);
    }

    /* renamed from: component4, reason: from getter */
    public final com.payair.model.ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRemainder() {
        return this.remainder;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExponent() {
        return this.exponent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCertificate() {
        return this.certificate;
    }

    public static /* synthetic */ com.payair.model.PubKeyCert copy$default(com.payair.model.PubKeyCert pubKeyCert, java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.model.ExpirationDate expirationDate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pubKeyCert.certificate;
        }
        if ((i & 2) != 0) {
            str2 = pubKeyCert.exponent;
        }
        if ((i & 4) != 0) {
            str3 = pubKeyCert.remainder;
        }
        if ((i & 8) != 0) {
            expirationDate = pubKeyCert.expirationDate;
        }
        return pubKeyCert.copy(str, str2, str3, expirationDate);
    }
}
