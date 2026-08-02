package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/model/AuthenticationMethodDto;", "", "", "id", "type", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "issuerMobileApp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/IssuerMobileAppDto;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/IssuerMobileAppDto;)Lcom/payair/logic/remote/model/AuthenticationMethodDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "getIssuerMobileApp", "getType", "getValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthenticationMethodDto {
    private final java.lang.String id;
    private final com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp;
    private final java.lang.String type;
    private final java.lang.String value;

    public AuthenticationMethodDto(java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = str2;
        this.value = str3;
        this.issuerMobileApp = issuerMobileAppDto;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.payair.logic.remote.model.IssuerMobileAppDto getIssuerMobileApp() {
        return this.issuerMobileApp;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int a2 = com.payair.csdk.w3.a(this.type, this.id.hashCode() * 31, 31);
        java.lang.String str = this.value;
        int hashCode = str == null ? 0 : str.hashCode();
        com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto = this.issuerMobileApp;
        return ((a2 + hashCode) * 31) + (issuerMobileAppDto != null ? issuerMobileAppDto.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.value;
        com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto = this.issuerMobileApp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationMethodDto(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", value=");
        sb.append(str3);
        sb.append(", issuerMobileApp=");
        sb.append(issuerMobileAppDto);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.AuthenticationMethodDto)) {
            return false;
        }
        com.payair.logic.remote.model.AuthenticationMethodDto authenticationMethodDto = (com.payair.logic.remote.model.AuthenticationMethodDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, authenticationMethodDto.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, authenticationMethodDto.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, authenticationMethodDto.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerMobileApp, authenticationMethodDto.issuerMobileApp);
    }

    public final com.payair.logic.remote.model.AuthenticationMethodDto copy(java.lang.String id, java.lang.String type, java.lang.String value, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.payair.logic.remote.model.AuthenticationMethodDto(id, type, value, issuerMobileApp);
    }

    /* renamed from: component4, reason: from getter */
    public final com.payair.logic.remote.model.IssuerMobileAppDto getIssuerMobileApp() {
        return this.issuerMobileApp;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.payair.logic.remote.model.AuthenticationMethodDto copy$default(com.payair.logic.remote.model.AuthenticationMethodDto authenticationMethodDto, java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationMethodDto.id;
        }
        if ((i & 2) != 0) {
            str2 = authenticationMethodDto.type;
        }
        if ((i & 4) != 0) {
            str3 = authenticationMethodDto.value;
        }
        if ((i & 8) != 0) {
            issuerMobileAppDto = authenticationMethodDto.issuerMobileApp;
        }
        return authenticationMethodDto.copy(str, str2, str3, issuerMobileAppDto);
    }
}
