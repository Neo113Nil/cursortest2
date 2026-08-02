package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J®\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b6\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b8\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b<\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b=\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b>\u0010\u0015"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "", "", "threeDsServerTransactionId", "acsTransactionId", "messageType", "messageVersion", "sdkTransId", "sdkCounterStoA", "threeDsRequestorAppUrl", "challengeDataEntry", "challengeNoEntry", "challengeCancel", "", "oobContinue", "resendChallenge", "whitelistingDataEntry", "challengeHTMLDataEntry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getThreeDsServerTransactionId", "getAcsTransactionId", "getMessageType", "getMessageVersion", "getSdkTransId", "getSdkCounterStoA", "setSdkCounterStoA", "(Ljava/lang/String;)V", "getThreeDsRequestorAppUrl", "getChallengeDataEntry", "getChallengeNoEntry", "getChallengeCancel", "Ljava/lang/Boolean;", "getOobContinue", "getResendChallenge", "getWhitelistingDataEntry", "getChallengeHTMLDataEntry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChallengeRequest {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("acsTransID")
    public java.lang.String acsTransactionId;
    public java.lang.String challengeCancel;
    public java.lang.String challengeDataEntry;
    public java.lang.String challengeHTMLDataEntry;
    public java.lang.String challengeNoEntry;
    public java.lang.String messageType;
    public java.lang.String messageVersion;
    public java.lang.Boolean oobContinue;
    public java.lang.String resendChallenge;
    public java.lang.String sdkCounterStoA;

    @com.google.gson.annotations.SerializedName("sdkTransID")
    public java.lang.String sdkTransId;

    @com.google.gson.annotations.SerializedName("threeDSRequestorAppURL")
    public java.lang.String threeDsRequestorAppUrl;

    @com.google.gson.annotations.SerializedName("threeDSServerTransID")
    public java.lang.String threeDsServerTransactionId;
    public java.lang.String whitelistingDataEntry;

    public ChallengeRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool, java.lang.String str11, java.lang.String str12, java.lang.String str13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.messageType = str3;
        this.messageVersion = str4;
        this.sdkTransId = str5;
        this.sdkCounterStoA = str6;
        this.threeDsRequestorAppUrl = str7;
        this.challengeDataEntry = str8;
        this.challengeNoEntry = str9;
        this.challengeCancel = str10;
        this.oobContinue = bool;
        this.resendChallenge = str11;
        this.whitelistingDataEntry = str12;
        this.challengeHTMLDataEntry = str13;
    }

    public final java.lang.String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public final java.lang.String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public /* synthetic */ ChallengeRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "CReq" : str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13);
    }

    public final java.lang.String getMessageType() {
        return this.messageType;
    }

    public final java.lang.String getMessageVersion() {
        return this.messageVersion;
    }

    public final java.lang.String getSdkTransId() {
        return this.sdkTransId;
    }

    public final java.lang.String getSdkCounterStoA() {
        return this.sdkCounterStoA;
    }

    public final void setSdkCounterStoA(java.lang.String str) {
        this.sdkCounterStoA = str;
    }

    public final java.lang.String getThreeDsRequestorAppUrl() {
        return this.threeDsRequestorAppUrl;
    }

    public final java.lang.String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    public final java.lang.String getChallengeNoEntry() {
        return this.challengeNoEntry;
    }

    public final java.lang.String getChallengeCancel() {
        return this.challengeCancel;
    }

    public final java.lang.Boolean getOobContinue() {
        return this.oobContinue;
    }

    public final java.lang.String getResendChallenge() {
        return this.resendChallenge;
    }

    public final java.lang.String getWhitelistingDataEntry() {
        return this.whitelistingDataEntry;
    }

    public final java.lang.String getChallengeHTMLDataEntry() {
        return this.challengeHTMLDataEntry;
    }

    public /* synthetic */ ChallengeRequest() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.threeDsServerTransactionId;
        java.lang.String str2 = this.acsTransactionId;
        java.lang.String str3 = this.messageType;
        java.lang.String str4 = this.messageVersion;
        java.lang.String str5 = this.sdkTransId;
        java.lang.String str6 = this.sdkCounterStoA;
        java.lang.String str7 = this.threeDsRequestorAppUrl;
        java.lang.String str8 = this.challengeDataEntry;
        java.lang.String str9 = this.challengeNoEntry;
        java.lang.String str10 = this.challengeCancel;
        java.lang.Boolean bool = this.oobContinue;
        java.lang.String str11 = this.resendChallenge;
        java.lang.String str12 = this.whitelistingDataEntry;
        java.lang.String str13 = this.challengeHTMLDataEntry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequest(threeDsServerTransactionId=");
        sb.append(str);
        sb.append(", acsTransactionId=");
        sb.append(str2);
        sb.append(", messageType=");
        sb.append(str3);
        sb.append(", messageVersion=");
        sb.append(str4);
        sb.append(", sdkTransId=");
        sb.append(str5);
        sb.append(", sdkCounterStoA=");
        sb.append(str6);
        sb.append(", threeDsRequestorAppUrl=");
        sb.append(str7);
        sb.append(", challengeDataEntry=");
        sb.append(str8);
        sb.append(", challengeNoEntry=");
        sb.append(str9);
        sb.append(", challengeCancel=");
        sb.append(str10);
        sb.append(", oobContinue=");
        sb.append(bool);
        sb.append(", resendChallenge=");
        sb.append(str11);
        sb.append(", whitelistingDataEntry=");
        sb.append(str12);
        sb.append(", challengeHTMLDataEntry=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.threeDsServerTransactionId.hashCode();
        int hashCode2 = this.acsTransactionId.hashCode();
        int hashCode3 = this.messageType.hashCode();
        int hashCode4 = this.messageVersion.hashCode();
        int hashCode5 = this.sdkTransId.hashCode();
        java.lang.String str = this.sdkCounterStoA;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.threeDsRequestorAppUrl;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.challengeDataEntry;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.challengeNoEntry;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.challengeCancel;
        int hashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.Boolean bool = this.oobContinue;
        int hashCode11 = bool == null ? 0 : bool.hashCode();
        java.lang.String str6 = this.resendChallenge;
        int hashCode12 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.whitelistingDataEntry;
        int hashCode13 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.challengeHTMLDataEntry;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.ChallengeRequest)) {
            return false;
        }
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest = (com.paypal.android.threeds.data.model.ChallengeRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsServerTransactionId, challengeRequest.threeDsServerTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsTransactionId, challengeRequest.acsTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageType, challengeRequest.messageType) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageVersion, challengeRequest.messageVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkTransId, challengeRequest.sdkTransId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkCounterStoA, challengeRequest.sdkCounterStoA) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsRequestorAppUrl, challengeRequest.threeDsRequestorAppUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeDataEntry, challengeRequest.challengeDataEntry) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeNoEntry, challengeRequest.challengeNoEntry) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeCancel, challengeRequest.challengeCancel) && kotlin.jvm.internal.Intrinsics.areEqual(this.oobContinue, challengeRequest.oobContinue) && kotlin.jvm.internal.Intrinsics.areEqual(this.resendChallenge, challengeRequest.resendChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.whitelistingDataEntry, challengeRequest.whitelistingDataEntry) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeHTMLDataEntry, challengeRequest.challengeHTMLDataEntry);
    }

    public final com.paypal.android.threeds.data.model.ChallengeRequest copy(java.lang.String threeDsServerTransactionId, java.lang.String acsTransactionId, java.lang.String messageType, java.lang.String messageVersion, java.lang.String sdkTransId, java.lang.String sdkCounterStoA, java.lang.String threeDsRequestorAppUrl, java.lang.String challengeDataEntry, java.lang.String challengeNoEntry, java.lang.String challengeCancel, java.lang.Boolean oobContinue, java.lang.String resendChallenge, java.lang.String whitelistingDataEntry, java.lang.String challengeHTMLDataEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsServerTransactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsTransactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTransId, "");
        return new com.paypal.android.threeds.data.model.ChallengeRequest(threeDsServerTransactionId, acsTransactionId, messageType, messageVersion, sdkTransId, sdkCounterStoA, threeDsRequestorAppUrl, challengeDataEntry, challengeNoEntry, challengeCancel, oobContinue, resendChallenge, whitelistingDataEntry, challengeHTMLDataEntry);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getChallengeNoEntry() {
        return this.challengeNoEntry;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getThreeDsRequestorAppUrl() {
        return this.threeDsRequestorAppUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSdkCounterStoA() {
        return this.sdkCounterStoA;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSdkTransId() {
        return this.sdkTransId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMessageVersion() {
        return this.messageVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessageType() {
        return this.messageType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getChallengeHTMLDataEntry() {
        return this.challengeHTMLDataEntry;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getWhitelistingDataEntry() {
        return this.whitelistingDataEntry;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getResendChallenge() {
        return this.resendChallenge;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.Boolean getOobContinue() {
        return this.oobContinue;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getChallengeCancel() {
        return this.challengeCancel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }
}
