package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/SendAuthenticationCodeDto;", "", "", "authenticationCode", "tav", "threeDSecureAuthenticationValue", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/SendAuthenticationCodeDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthenticationCode", "getDate", "getTav", "getThreeDSecureAuthenticationValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SendAuthenticationCodeDto {
    private final java.lang.String authenticationCode;
    private final java.lang.String date;
    private final java.lang.String tav;
    private final java.lang.String threeDSecureAuthenticationValue;

    public SendAuthenticationCodeDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.authenticationCode = str;
        this.tav = str2;
        this.threeDSecureAuthenticationValue = str3;
        this.date = str4;
    }

    public final java.lang.String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public final java.lang.String getDate() {
        return this.date;
    }

    public final java.lang.String getTav() {
        return this.tav;
    }

    public final java.lang.String getThreeDSecureAuthenticationValue() {
        return this.threeDSecureAuthenticationValue;
    }

    public /* synthetic */ SendAuthenticationCodeDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authenticationCode;
        java.lang.String str2 = this.tav;
        java.lang.String str3 = this.threeDSecureAuthenticationValue;
        java.lang.String str4 = this.date;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SendAuthenticationCodeDto(authenticationCode=");
        sb.append(str);
        sb.append(", tav=");
        sb.append(str2);
        sb.append(", threeDSecureAuthenticationValue=");
        sb.append(str3);
        sb.append(", date=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.authenticationCode;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.tav;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.threeDSecureAuthenticationValue;
        return this.date.hashCode() + (((((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.SendAuthenticationCodeDto)) {
            return false;
        }
        com.payair.logic.remote.model.SendAuthenticationCodeDto sendAuthenticationCodeDto = (com.payair.logic.remote.model.SendAuthenticationCodeDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationCode, sendAuthenticationCodeDto.authenticationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.tav, sendAuthenticationCodeDto.tav) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureAuthenticationValue, sendAuthenticationCodeDto.threeDSecureAuthenticationValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, sendAuthenticationCodeDto.date);
    }

    public final com.payair.logic.remote.model.SendAuthenticationCodeDto copy(java.lang.String authenticationCode, java.lang.String tav, java.lang.String threeDSecureAuthenticationValue, java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return new com.payair.logic.remote.model.SendAuthenticationCodeDto(authenticationCode, tav, threeDSecureAuthenticationValue, date);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getThreeDSecureAuthenticationValue() {
        return this.threeDSecureAuthenticationValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTav() {
        return this.tav;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public static /* synthetic */ com.payair.logic.remote.model.SendAuthenticationCodeDto copy$default(com.payair.logic.remote.model.SendAuthenticationCodeDto sendAuthenticationCodeDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sendAuthenticationCodeDto.authenticationCode;
        }
        if ((i & 2) != 0) {
            str2 = sendAuthenticationCodeDto.tav;
        }
        if ((i & 4) != 0) {
            str3 = sendAuthenticationCodeDto.threeDSecureAuthenticationValue;
        }
        if ((i & 8) != 0) {
            str4 = sendAuthenticationCodeDto.date;
        }
        return sendAuthenticationCodeDto.copy(str, str2, str3, str4);
    }
}
