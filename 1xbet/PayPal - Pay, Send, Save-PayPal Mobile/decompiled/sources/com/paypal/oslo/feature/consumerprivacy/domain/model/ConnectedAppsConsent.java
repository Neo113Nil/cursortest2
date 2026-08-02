package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J´\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b;\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010#R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b@\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "", "", "id", "consentType", "clientId", "clientName", "partnerIdentifier", "status", "grantTime", "expiryTime", "revokedTime", "cdrArrangementId", "grantId", "", "ualClient", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentPermission;", "permissions", "providerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "()Ljava/util/List;", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getConsentType", "getClientId", "getClientName", "getPartnerIdentifier", "getStatus", "getGrantTime", "getExpiryTime", "getRevokedTime", "getCdrArrangementId", "getGrantId", "Z", "getUalClient", "Ljava/util/List;", "getPermissions", "getProviderName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConnectedAppsConsent {
    public static final int $stable = 8;
    private final java.lang.String cdrArrangementId;
    private final java.lang.String clientId;
    private final java.lang.String clientName;
    private final java.lang.String consentType;
    private final java.lang.String expiryTime;
    private final java.lang.String grantId;
    private final java.lang.String grantTime;
    private final java.lang.String id;
    private final java.lang.String partnerIdentifier;
    private final java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> permissions;
    private final java.lang.String providerName;
    private final java.lang.String revokedTime;
    private final java.lang.String status;
    private final boolean ualClient;

    public ConnectedAppsConsent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z, java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> list, java.lang.String str12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.consentType = str2;
        this.clientId = str3;
        this.clientName = str4;
        this.partnerIdentifier = str5;
        this.status = str6;
        this.grantTime = str7;
        this.expiryTime = str8;
        this.revokedTime = str9;
        this.cdrArrangementId = str10;
        this.grantId = str11;
        this.ualClient = z;
        this.permissions = list;
        this.providerName = str12;
    }

    public /* synthetic */ ConnectedAppsConsent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z, java.util.List list, java.lang.String str12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, list, (i & 8192) != 0 ? null : str12);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getConsentType() {
        return this.consentType;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getClientName() {
        return this.clientName;
    }

    public final java.lang.String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getGrantTime() {
        return this.grantTime;
    }

    public final java.lang.String getExpiryTime() {
        return this.expiryTime;
    }

    public final java.lang.String getRevokedTime() {
        return this.revokedTime;
    }

    public final java.lang.String getCdrArrangementId() {
        return this.cdrArrangementId;
    }

    public final java.lang.String getGrantId() {
        return this.grantId;
    }

    public final boolean getUalClient() {
        return this.ualClient;
    }

    public final java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> getPermissions() {
        return this.permissions;
    }

    public final java.lang.String getProviderName() {
        return this.providerName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.consentType;
        java.lang.String str3 = this.clientId;
        java.lang.String str4 = this.clientName;
        java.lang.String str5 = this.partnerIdentifier;
        java.lang.String str6 = this.status;
        java.lang.String str7 = this.grantTime;
        java.lang.String str8 = this.expiryTime;
        java.lang.String str9 = this.revokedTime;
        java.lang.String str10 = this.cdrArrangementId;
        java.lang.String str11 = this.grantId;
        boolean z = this.ualClient;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> list = this.permissions;
        java.lang.String str12 = this.providerName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectedAppsConsent(id=");
        sb.append(str);
        sb.append(", consentType=");
        sb.append(str2);
        sb.append(", clientId=");
        sb.append(str3);
        sb.append(", clientName=");
        sb.append(str4);
        sb.append(", partnerIdentifier=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(str6);
        sb.append(", grantTime=");
        sb.append(str7);
        sb.append(", expiryTime=");
        sb.append(str8);
        sb.append(", revokedTime=");
        sb.append(str9);
        sb.append(", cdrArrangementId=");
        sb.append(str10);
        sb.append(", grantId=");
        sb.append(str11);
        sb.append(", ualClient=");
        sb.append(z);
        sb.append(", permissions=");
        sb.append(list);
        sb.append(", providerName=");
        sb.append(str12);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.consentType.hashCode();
        int hashCode3 = this.clientId.hashCode();
        int hashCode4 = this.clientName.hashCode();
        java.lang.String str = this.partnerIdentifier;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.status;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.grantTime;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.expiryTime;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.revokedTime;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.cdrArrangementId;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.grantId;
        int hashCode11 = str7 == null ? 0 : str7.hashCode();
        int hashCode12 = java.lang.Boolean.hashCode(this.ualClient);
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> list = this.permissions;
        int hashCode13 = list == null ? 0 : list.hashCode();
        java.lang.String str8 = this.providerName;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent = (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, connectedAppsConsent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.consentType, connectedAppsConsent.consentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, connectedAppsConsent.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientName, connectedAppsConsent.clientName) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerIdentifier, connectedAppsConsent.partnerIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, connectedAppsConsent.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.grantTime, connectedAppsConsent.grantTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, connectedAppsConsent.expiryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.revokedTime, connectedAppsConsent.revokedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.cdrArrangementId, connectedAppsConsent.cdrArrangementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.grantId, connectedAppsConsent.grantId) && this.ualClient == connectedAppsConsent.ualClient && kotlin.jvm.internal.Intrinsics.areEqual(this.permissions, connectedAppsConsent.permissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerName, connectedAppsConsent.providerName);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent copy(java.lang.String id, java.lang.String consentType, java.lang.String clientId, java.lang.String clientName, java.lang.String partnerIdentifier, java.lang.String status, java.lang.String grantTime, java.lang.String expiryTime, java.lang.String revokedTime, java.lang.String cdrArrangementId, java.lang.String grantId, boolean ualClient, java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> permissions, java.lang.String providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientName, "");
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent(id, consentType, clientId, clientName, partnerIdentifier, status, grantTime, expiryTime, revokedTime, cdrArrangementId, grantId, ualClient, permissions, providerName);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getRevokedTime() {
        return this.revokedTime;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getExpiryTime() {
        return this.expiryTime;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getGrantTime() {
        return this.grantTime;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getClientName() {
        return this.clientName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getConsentType() {
        return this.consentType;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getProviderName() {
        return this.providerName;
    }

    public final java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> component13() {
        return this.permissions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getUalClient() {
        return this.ualClient;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getGrantId() {
        return this.grantId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getCdrArrangementId() {
        return this.cdrArrangementId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
