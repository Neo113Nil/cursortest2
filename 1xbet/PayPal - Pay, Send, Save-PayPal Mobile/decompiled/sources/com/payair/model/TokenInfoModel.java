package com.payair.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0012\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJÜ\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b>\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\bA\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\bO\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\bP\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\bQ\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bR\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bS\u0010\u001d"}, d2 = {"Lcom/payair/model/TokenInfoModel;", "", "", "tokenPanSuffix", "tokenExpiryMonth", "tokenExpiryYear", "accountExpiryMonth", "accountExpiryYear", "accountPanSuffix", "", "dsrpCapable", "", "tokenAssuranceLevel", "tokenRequestorID", "tokenReferenceID", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getEncryptionMetaData, "encTokenInfo", "Lcom/payair/model/HceData;", "hceData", "Lcom/payair/model/Mst;", "mst", "Lcom/payair/model/SeCardPerso;", "seCardPerso", "Lcom/payair/model/SePersoData;", "sePersoData", com.visa.cbp.getTicketMetaData$6672$values.values.valueOf, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/HceData;Lcom/payair/model/Mst;Lcom/payair/model/SeCardPerso;Lcom/payair/model/SePersoData;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "()Lcom/payair/model/HceData;", "component14", "()Lcom/payair/model/Mst;", "component15", "()Lcom/payair/model/SeCardPerso;", "component16", "()Lcom/payair/model/SePersoData;", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/lang/Integer;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/HceData;Lcom/payair/model/Mst;Lcom/payair/model/SeCardPerso;Lcom/payair/model/SePersoData;Ljava/lang/String;)Lcom/payair/model/TokenInfoModel;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountExpiryMonth", "getAccountExpiryYear", "getAccountPanSuffix", "getAppPrgrmID", "getAtc", "Ljava/lang/Boolean;", "getDsrpCapable", "getEncTokenInfo", "Lcom/payair/model/HceData;", "getHceData", "Lcom/payair/model/Mst;", "getMst", "Lcom/payair/model/SeCardPerso;", "getSeCardPerso", "Lcom/payair/model/SePersoData;", "getSePersoData", "Ljava/lang/Integer;", "getTokenAssuranceLevel", "getTokenExpiryMonth", "getTokenExpiryYear", "getTokenPanSuffix", "getTokenReferenceID", "getTokenRequestorID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TokenInfoModel {
    public java.lang.String accountExpiryMonth;
    public java.lang.String accountExpiryYear;
    public java.lang.String accountPanSuffix;
    public java.lang.String appPrgrmID;
    public java.lang.String atc;
    public java.lang.Boolean dsrpCapable;
    public java.lang.String encTokenInfo;
    public com.payair.model.HceData hceData;
    public com.payair.model.Mst mst;
    public com.payair.model.SeCardPerso seCardPerso;
    public com.payair.model.SePersoData sePersoData;
    public java.lang.Integer tokenAssuranceLevel;
    public java.lang.String tokenExpiryMonth;
    public java.lang.String tokenExpiryYear;
    public java.lang.String tokenPanSuffix;
    public java.lang.String tokenReferenceID;
    public java.lang.String tokenRequestorID;

    public TokenInfoModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final java.lang.String getAccountExpiryMonth() {
        return this.accountExpiryMonth;
    }

    public final java.lang.String getAccountExpiryYear() {
        return this.accountExpiryYear;
    }

    public final java.lang.String getAccountPanSuffix() {
        return this.accountPanSuffix;
    }

    public final java.lang.String getAppPrgrmID() {
        return this.appPrgrmID;
    }

    public final java.lang.String getAtc() {
        return this.atc;
    }

    public final java.lang.Boolean getDsrpCapable() {
        return this.dsrpCapable;
    }

    public final java.lang.String getEncTokenInfo() {
        return this.encTokenInfo;
    }

    public final com.payair.model.HceData getHceData() {
        return this.hceData;
    }

    public final com.payair.model.Mst getMst() {
        return this.mst;
    }

    public final com.payair.model.SeCardPerso getSeCardPerso() {
        return this.seCardPerso;
    }

    public final com.payair.model.SePersoData getSePersoData() {
        return this.sePersoData;
    }

    public final java.lang.Integer getTokenAssuranceLevel() {
        return this.tokenAssuranceLevel;
    }

    public final java.lang.String getTokenExpiryMonth() {
        return this.tokenExpiryMonth;
    }

    public final java.lang.String getTokenExpiryYear() {
        return this.tokenExpiryYear;
    }

    public final java.lang.String getTokenPanSuffix() {
        return this.tokenPanSuffix;
    }

    public final java.lang.String getTokenReferenceID() {
        return this.tokenReferenceID;
    }

    public final java.lang.String getTokenRequestorID() {
        return this.tokenRequestorID;
    }

    public TokenInfoModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.Integer num, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.payair.model.HceData hceData, com.payair.model.Mst mst, com.payair.model.SeCardPerso seCardPerso, com.payair.model.SePersoData sePersoData, java.lang.String str11) {
        this.tokenPanSuffix = str;
        this.tokenExpiryMonth = str2;
        this.tokenExpiryYear = str3;
        this.accountExpiryMonth = str4;
        this.accountExpiryYear = str5;
        this.accountPanSuffix = str6;
        this.dsrpCapable = bool;
        this.tokenAssuranceLevel = num;
        this.tokenRequestorID = str7;
        this.tokenReferenceID = str8;
        this.appPrgrmID = str9;
        this.encTokenInfo = str10;
        this.hceData = hceData;
        this.mst = mst;
        this.seCardPerso = seCardPerso;
        this.sePersoData = sePersoData;
        this.atc = str11;
    }

    public /* synthetic */ TokenInfoModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.Integer num, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, com.payair.model.HceData hceData, com.payair.model.Mst mst, com.payair.model.SeCardPerso seCardPerso, com.payair.model.SePersoData sePersoData, java.lang.String str11, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : hceData, (i & 8192) != 0 ? null : mst, (i & 16384) != 0 ? null : seCardPerso, (i & 32768) != 0 ? null : sePersoData, (i & 65536) != 0 ? null : str11);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tokenPanSuffix;
        java.lang.String str2 = this.tokenExpiryMonth;
        java.lang.String str3 = this.tokenExpiryYear;
        java.lang.String str4 = this.accountExpiryMonth;
        java.lang.String str5 = this.accountExpiryYear;
        java.lang.String str6 = this.accountPanSuffix;
        java.lang.Boolean bool = this.dsrpCapable;
        java.lang.Integer num = this.tokenAssuranceLevel;
        java.lang.String str7 = this.tokenRequestorID;
        java.lang.String str8 = this.tokenReferenceID;
        java.lang.String str9 = this.appPrgrmID;
        java.lang.String str10 = this.encTokenInfo;
        com.payair.model.HceData hceData = this.hceData;
        com.payair.model.Mst mst = this.mst;
        com.payair.model.SeCardPerso seCardPerso = this.seCardPerso;
        com.payair.model.SePersoData sePersoData = this.sePersoData;
        java.lang.String str11 = this.atc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenInfoModel(tokenPanSuffix=");
        sb.append(str);
        sb.append(", tokenExpiryMonth=");
        sb.append(str2);
        sb.append(", tokenExpiryYear=");
        sb.append(str3);
        sb.append(", accountExpiryMonth=");
        sb.append(str4);
        sb.append(", accountExpiryYear=");
        sb.append(str5);
        sb.append(", accountPanSuffix=");
        sb.append(str6);
        sb.append(", dsrpCapable=");
        sb.append(bool);
        sb.append(", tokenAssuranceLevel=");
        sb.append(num);
        sb.append(", tokenRequestorID=");
        sb.append(str7);
        sb.append(", tokenReferenceID=");
        sb.append(str8);
        sb.append(", appPrgrmID=");
        sb.append(str9);
        sb.append(", encTokenInfo=");
        sb.append(str10);
        sb.append(", hceData=");
        sb.append(hceData);
        sb.append(", mst=");
        sb.append(mst);
        sb.append(", seCardPerso=");
        sb.append(seCardPerso);
        sb.append(", sePersoData=");
        sb.append(sePersoData);
        sb.append(", atc=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.tokenPanSuffix;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.tokenExpiryMonth;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.tokenExpiryYear;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.accountExpiryMonth;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.accountExpiryYear;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.accountPanSuffix;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.Boolean bool = this.dsrpCapable;
        int hashCode7 = bool == null ? 0 : bool.hashCode();
        java.lang.Integer num = this.tokenAssuranceLevel;
        int hashCode8 = num == null ? 0 : num.hashCode();
        java.lang.String str7 = this.tokenRequestorID;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.tokenReferenceID;
        int hashCode10 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.appPrgrmID;
        int hashCode11 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.encTokenInfo;
        int hashCode12 = str10 == null ? 0 : str10.hashCode();
        com.payair.model.HceData hceData = this.hceData;
        int hashCode13 = hceData == null ? 0 : hceData.hashCode();
        com.payair.model.Mst mst = this.mst;
        int hashCode14 = mst == null ? 0 : mst.hashCode();
        com.payair.model.SeCardPerso seCardPerso = this.seCardPerso;
        int hashCode15 = seCardPerso == null ? 0 : seCardPerso.hashCode();
        com.payair.model.SePersoData sePersoData = this.sePersoData;
        int hashCode16 = sePersoData == null ? 0 : sePersoData.hashCode();
        java.lang.String str11 = this.atc;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.TokenInfoModel)) {
            return false;
        }
        com.payair.model.TokenInfoModel tokenInfoModel = (com.payair.model.TokenInfoModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenPanSuffix, tokenInfoModel.tokenPanSuffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenExpiryMonth, tokenInfoModel.tokenExpiryMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenExpiryYear, tokenInfoModel.tokenExpiryYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountExpiryMonth, tokenInfoModel.accountExpiryMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountExpiryYear, tokenInfoModel.accountExpiryYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountPanSuffix, tokenInfoModel.accountPanSuffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.dsrpCapable, tokenInfoModel.dsrpCapable) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenAssuranceLevel, tokenInfoModel.tokenAssuranceLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenRequestorID, tokenInfoModel.tokenRequestorID) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenReferenceID, tokenInfoModel.tokenReferenceID) && kotlin.jvm.internal.Intrinsics.areEqual(this.appPrgrmID, tokenInfoModel.appPrgrmID) && kotlin.jvm.internal.Intrinsics.areEqual(this.encTokenInfo, tokenInfoModel.encTokenInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.hceData, tokenInfoModel.hceData) && kotlin.jvm.internal.Intrinsics.areEqual(this.mst, tokenInfoModel.mst) && kotlin.jvm.internal.Intrinsics.areEqual(this.seCardPerso, tokenInfoModel.seCardPerso) && kotlin.jvm.internal.Intrinsics.areEqual(this.sePersoData, tokenInfoModel.sePersoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.atc, tokenInfoModel.atc);
    }

    public final com.payair.model.TokenInfoModel copy(java.lang.String tokenPanSuffix, java.lang.String tokenExpiryMonth, java.lang.String tokenExpiryYear, java.lang.String accountExpiryMonth, java.lang.String accountExpiryYear, java.lang.String accountPanSuffix, java.lang.Boolean dsrpCapable, java.lang.Integer tokenAssuranceLevel, java.lang.String tokenRequestorID, java.lang.String tokenReferenceID, java.lang.String appPrgrmID, java.lang.String encTokenInfo, com.payair.model.HceData hceData, com.payair.model.Mst mst, com.payair.model.SeCardPerso seCardPerso, com.payair.model.SePersoData sePersoData, java.lang.String atc) {
        return new com.payair.model.TokenInfoModel(tokenPanSuffix, tokenExpiryMonth, tokenExpiryYear, accountExpiryMonth, accountExpiryYear, accountPanSuffix, dsrpCapable, tokenAssuranceLevel, tokenRequestorID, tokenReferenceID, appPrgrmID, encTokenInfo, hceData, mst, seCardPerso, sePersoData, atc);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTokenRequestorID() {
        return this.tokenRequestorID;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Integer getTokenAssuranceLevel() {
        return this.tokenAssuranceLevel;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Boolean getDsrpCapable() {
        return this.dsrpCapable;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAccountPanSuffix() {
        return this.accountPanSuffix;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAccountExpiryYear() {
        return this.accountExpiryYear;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAccountExpiryMonth() {
        return this.accountExpiryMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTokenExpiryYear() {
        return this.tokenExpiryYear;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTokenExpiryMonth() {
        return this.tokenExpiryMonth;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getAtc() {
        return this.atc;
    }

    /* renamed from: component16, reason: from getter */
    public final com.payair.model.SePersoData getSePersoData() {
        return this.sePersoData;
    }

    /* renamed from: component15, reason: from getter */
    public final com.payair.model.SeCardPerso getSeCardPerso() {
        return this.seCardPerso;
    }

    /* renamed from: component14, reason: from getter */
    public final com.payair.model.Mst getMst() {
        return this.mst;
    }

    /* renamed from: component13, reason: from getter */
    public final com.payair.model.HceData getHceData() {
        return this.hceData;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getEncTokenInfo() {
        return this.encTokenInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getAppPrgrmID() {
        return this.appPrgrmID;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getTokenReferenceID() {
        return this.tokenReferenceID;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTokenPanSuffix() {
        return this.tokenPanSuffix;
    }
}
