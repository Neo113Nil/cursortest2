package com.payair.db.transactionhistory;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001:\u0002`aB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJÀ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010#R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010(R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bY\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\b[\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010>\u001a\u0004\b]\u0010\u001dR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\b_\u0010\u001d"}, d2 = {"Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "", "", "id", "", "recordId", "transactionId", "merchantName", "Ljava/math/BigDecimal;", "amount", "Ljava/util/Date;", "date", "currencyCode", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;", "authorizationStatus", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;", "transactionType", "networkTokenReference", "merchantType", "merchantCity", "transactionCountryCode", "industryCatgCode", "industryCatgName", "industryName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/lang/String;Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/math/BigDecimal;", "component6", "()Ljava/util/Date;", "component7", "component8", "()Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;", "component9", "()Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/lang/String;Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getRecordId", "c", "getTransactionId", "d", "getMerchantName", "e", "Ljava/math/BigDecimal;", "getAmount", "f", "Ljava/util/Date;", "getDate", "g", "getCurrencyCode", "h", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;", "getAuthorizationStatus", "i", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;", "getTransactionType", "j", "getNetworkTokenReference", "k", "getMerchantType", "l", "getMerchantCity", "m", "getTransactionCountryCode", "n", "getIndustryCatgCode", "o", "getIndustryCatgName", "p", "getIndustryName", "AuthorizationStatus", "TransactionType"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransactionHistoryEntry {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long id;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String recordId;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.lang.String transactionId;

    /* renamed from: d, reason: from kotlin metadata */
    public final java.lang.String merchantName;

    /* renamed from: e, reason: from kotlin metadata */
    public final java.math.BigDecimal amount;

    /* renamed from: f, reason: from kotlin metadata */
    public final java.util.Date date;

    /* renamed from: g, reason: from kotlin metadata */
    public final java.lang.String currencyCode;

    /* renamed from: h, reason: from kotlin metadata */
    public final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus;

    /* renamed from: i, reason: from kotlin metadata */
    public final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType;

    /* renamed from: j, reason: from kotlin metadata */
    public final java.lang.String networkTokenReference;

    /* renamed from: k, reason: from kotlin metadata */
    public final java.lang.String merchantType;

    /* renamed from: l, reason: from kotlin metadata */
    public final java.lang.String merchantCity;

    /* renamed from: m, reason: from kotlin metadata */
    public final java.lang.String transactionCountryCode;

    /* renamed from: n, reason: from kotlin metadata */
    public final java.lang.String industryCatgCode;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String industryCatgName;

    /* renamed from: p, reason: from kotlin metadata */
    public final java.lang.String industryName;

    public TransactionHistoryEntry(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.math.BigDecimal bigDecimal, java.util.Date date, java.lang.String str4, com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus, com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.id = j;
        this.recordId = str;
        this.transactionId = str2;
        this.merchantName = str3;
        this.amount = bigDecimal;
        this.date = date;
        this.currencyCode = str4;
        this.authorizationStatus = authorizationStatus;
        this.transactionType = transactionType;
        this.networkTokenReference = str5;
        this.merchantType = str6;
        this.merchantCity = str7;
        this.transactionCountryCode = str8;
        this.industryCatgCode = str9;
        this.industryCatgName = str10;
        this.industryName = str11;
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus getAuthorizationStatus() {
        return this.authorizationStatus;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final long getId() {
        return this.id;
    }

    public final java.lang.String getIndustryCatgCode() {
        return this.industryCatgCode;
    }

    public final java.lang.String getIndustryCatgName() {
        return this.industryCatgName;
    }

    public final java.lang.String getIndustryName() {
        return this.industryName;
    }

    public final java.lang.String getMerchantCity() {
        return this.merchantCity;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getMerchantType() {
        return this.merchantType;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final java.lang.String getRecordId() {
        return this.recordId;
    }

    public final java.lang.String getTransactionCountryCode() {
        return this.transactionCountryCode;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType getTransactionType() {
        return this.transactionType;
    }

    public final int hashCode() {
        int a2 = com.payair.csdk.w3.a(this.recordId, java.lang.Long.hashCode(this.id) * 31, 31);
        java.lang.String str = this.transactionId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.merchantName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int a3 = com.payair.csdk.w3.a(this.currencyCode, (this.date.hashCode() + ((this.amount.hashCode() + ((((a2 + hashCode) * 31) + hashCode2) * 31)) * 31)) * 31, 31);
        int a4 = com.payair.csdk.w3.a(this.networkTokenReference, (this.transactionType.hashCode() + ((this.authorizationStatus.hashCode() + a3) * 31)) * 31, 31);
        java.lang.String str3 = this.merchantType;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.merchantCity;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.transactionCountryCode;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.industryCatgCode;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.industryCatgName;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.industryName;
        return ((((((((((a4 + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public /* synthetic */ TransactionHistoryEntry(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.math.BigDecimal bigDecimal, java.util.Date date, java.lang.String str4, com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus, com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, bigDecimal, date, str4, authorizationStatus, transactionType, str5, str6, str7, str8, str9, str10, str11);
    }

    public final java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.recordId;
        java.lang.String str2 = this.transactionId;
        java.lang.String str3 = this.merchantName;
        java.math.BigDecimal bigDecimal = this.amount;
        java.util.Date date = this.date;
        java.lang.String str4 = this.currencyCode;
        com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus = this.authorizationStatus;
        com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType = this.transactionType;
        java.lang.String str5 = this.networkTokenReference;
        java.lang.String str6 = this.merchantType;
        java.lang.String str7 = this.merchantCity;
        java.lang.String str8 = this.transactionCountryCode;
        java.lang.String str9 = this.industryCatgCode;
        java.lang.String str10 = this.industryCatgName;
        java.lang.String str11 = this.industryName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionHistoryEntry(id=");
        sb.append(j);
        sb.append(", recordId=");
        sb.append(str);
        sb.append(", transactionId=");
        sb.append(str2);
        sb.append(", merchantName=");
        sb.append(str3);
        sb.append(", amount=");
        sb.append(bigDecimal);
        sb.append(", date=");
        sb.append(date);
        sb.append(", currencyCode=");
        sb.append(str4);
        sb.append(", authorizationStatus=");
        sb.append(authorizationStatus);
        sb.append(", transactionType=");
        sb.append(transactionType);
        sb.append(", networkTokenReference=");
        sb.append(str5);
        sb.append(", merchantType=");
        sb.append(str6);
        sb.append(", merchantCity=");
        sb.append(str7);
        sb.append(", transactionCountryCode=");
        sb.append(str8);
        sb.append(", industryCatgCode=");
        sb.append(str9);
        sb.append(", industryCatgName=");
        sb.append(str10);
        sb.append(", industryName=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.db.transactionhistory.TransactionHistoryEntry)) {
            return false;
        }
        com.payair.db.transactionhistory.TransactionHistoryEntry transactionHistoryEntry = (com.payair.db.transactionhistory.TransactionHistoryEntry) other;
        return this.id == transactionHistoryEntry.id && kotlin.jvm.internal.Intrinsics.areEqual(this.recordId, transactionHistoryEntry.recordId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, transactionHistoryEntry.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, transactionHistoryEntry.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transactionHistoryEntry.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, transactionHistoryEntry.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transactionHistoryEntry.currencyCode) && this.authorizationStatus == transactionHistoryEntry.authorizationStatus && this.transactionType == transactionHistoryEntry.transactionType && kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, transactionHistoryEntry.networkTokenReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantType, transactionHistoryEntry.merchantType) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantCity, transactionHistoryEntry.merchantCity) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCountryCode, transactionHistoryEntry.transactionCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.industryCatgCode, transactionHistoryEntry.industryCatgCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.industryCatgName, transactionHistoryEntry.industryCatgName) && kotlin.jvm.internal.Intrinsics.areEqual(this.industryName, transactionHistoryEntry.industryName);
    }

    public final com.payair.db.transactionhistory.TransactionHistoryEntry copy(long id, java.lang.String recordId, java.lang.String transactionId, java.lang.String merchantName, java.math.BigDecimal amount, java.util.Date date, java.lang.String currencyCode, com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus, com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType, java.lang.String networkTokenReference, java.lang.String merchantType, java.lang.String merchantCity, java.lang.String transactionCountryCode, java.lang.String industryCatgCode, java.lang.String industryCatgName, java.lang.String industryName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return new com.payair.db.transactionhistory.TransactionHistoryEntry(id, recordId, transactionId, merchantName, amount, date, currencyCode, authorizationStatus, transactionType, networkTokenReference, merchantType, merchantCity, transactionCountryCode, industryCatgCode, industryCatgName, industryName);
    }

    /* renamed from: component9, reason: from getter */
    public final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component8, reason: from getter */
    public final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus getAuthorizationStatus() {
        return this.authorizationStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRecordId() {
        return this.recordId;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.String getIndustryName() {
        return this.industryName;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getIndustryCatgName() {
        return this.industryCatgName;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getIndustryCatgCode() {
        return this.industryCatgCode;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getTransactionCountryCode() {
        return this.transactionCountryCode;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getMerchantCity() {
        return this.merchantCity;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/payair/db/transactionhistory/TransactionHistoryEntry$AuthorizationStatus;", "", "DECLINED", "AUTHORIZED", "CLEARED", "REVERSED"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthorizationStatus {
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus AUTHORIZED;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus CLEARED;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus DECLINED;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus REVERSED;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus[] f4374a;
        public static final /* synthetic */ kotlin.enums.EnumEntries b;

        static {
            com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus = new com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus("DECLINED", 0);
            DECLINED = authorizationStatus;
            com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus2 = new com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus("AUTHORIZED", 1);
            AUTHORIZED = authorizationStatus2;
            com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus3 = new com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus("CLEARED", 2);
            CLEARED = authorizationStatus3;
            com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus4 = new com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus("REVERSED", 3);
            REVERSED = authorizationStatus4;
            com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus[] authorizationStatusArr = {authorizationStatus, authorizationStatus2, authorizationStatus3, authorizationStatus4};
            f4374a = authorizationStatusArr;
            b = kotlin.enums.EnumEntriesKt.enumEntries(authorizationStatusArr);
        }

        public AuthorizationStatus(java.lang.String str, int i) {
        }

        public static com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus[] values() {
            return (com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus[]) f4374a.clone();
        }

        public static com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus valueOf(java.lang.String str) {
            return (com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus) java.lang.Enum.valueOf(com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.class, str);
        }

        public static kotlin.enums.EnumEntries<com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus> getEntries() {
            return b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/payair/db/transactionhistory/TransactionHistoryEntry$TransactionType;", "", "PURCHASE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "ATM_WITHDRAWAL", "CASH_DISBURSEMENT", "ATM_DEPOSIT", "ATM_TRANSFER"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TransactionType {
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType ATM_DEPOSIT;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType ATM_TRANSFER;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType ATM_WITHDRAWAL;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType CASH_DISBURSEMENT;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType PAYMENT;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType PURCHASE;
        public static final com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType REFUND;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType[] f4375a;
        public static final /* synthetic */ kotlin.enums.EnumEntries b;

        static {
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType("PURCHASE", 0);
            PURCHASE = transactionType;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType2 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 1);
            REFUND = transactionType2;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType3 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 2);
            PAYMENT = transactionType3;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType4 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType("ATM_WITHDRAWAL", 3);
            ATM_WITHDRAWAL = transactionType4;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType5 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType("CASH_DISBURSEMENT", 4);
            CASH_DISBURSEMENT = transactionType5;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType6 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType("ATM_DEPOSIT", 5);
            ATM_DEPOSIT = transactionType6;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType7 = new com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType("ATM_TRANSFER", 6);
            ATM_TRANSFER = transactionType7;
            com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType[] transactionTypeArr = {transactionType, transactionType2, transactionType3, transactionType4, transactionType5, transactionType6, transactionType7};
            f4375a = transactionTypeArr;
            b = kotlin.enums.EnumEntriesKt.enumEntries(transactionTypeArr);
        }

        public TransactionType(java.lang.String str, int i) {
        }

        public static com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType[] values() {
            return (com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType[]) f4375a.clone();
        }

        public static com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType valueOf(java.lang.String str) {
            return (com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType) java.lang.Enum.valueOf(com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType> getEntries() {
            return b;
        }
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMerchantType() {
        return this.merchantType;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }
}
