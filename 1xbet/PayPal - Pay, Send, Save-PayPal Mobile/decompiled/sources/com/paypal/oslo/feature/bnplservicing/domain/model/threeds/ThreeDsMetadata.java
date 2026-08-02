package com.paypal.oslo.feature.bnplservicing.domain.model.threeds;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;", "", "", "deviceDataCollectionUrl", com.paypal.android.threeds.utils.NetworkUtil.JWT, "jwtDuration", "jwtIssuer", "jwtOrgUnitId", "networkLogoUrl", "acquiringBin", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;", "reason", "referenceId", "", "skipThreeDsEnforcement", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationSourceType;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;Ljava/lang/String;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationSourceType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationSourceType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;Ljava/lang/String;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationSourceType;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsMetadata;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceDataCollectionUrl", "getJwt", "getJwtDuration", "getJwtIssuer", "getJwtOrgUnitId", "getNetworkLogoUrl", "getAcquiringBin", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;", "getReason", "getReferenceId", "Ljava/lang/Boolean;", "getSkipThreeDsEnforcement", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationSourceType;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ThreeDsMetadata {
    public static final int $stable = 0;
    private final java.lang.String acquiringBin;
    private final java.lang.String deviceDataCollectionUrl;
    private final java.lang.String jwt;
    private final java.lang.String jwtDuration;
    private final java.lang.String jwtIssuer;
    private final java.lang.String jwtOrgUnitId;
    private final java.lang.String networkLogoUrl;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType reason;
    private final java.lang.String referenceId;
    private final java.lang.Boolean skipThreeDsEnforcement;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType source;

    public ThreeDsMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType, java.lang.String str8, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType threeDsStipulationSourceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.deviceDataCollectionUrl = str;
        this.jwt = str2;
        this.jwtDuration = str3;
        this.jwtIssuer = str4;
        this.jwtOrgUnitId = str5;
        this.networkLogoUrl = str6;
        this.acquiringBin = str7;
        this.reason = threeDsStipulationReasonType;
        this.referenceId = str8;
        this.skipThreeDsEnforcement = bool;
        this.source = threeDsStipulationSourceType;
    }

    public final java.lang.String getDeviceDataCollectionUrl() {
        return this.deviceDataCollectionUrl;
    }

    public final java.lang.String getJwt() {
        return this.jwt;
    }

    public final java.lang.String getJwtDuration() {
        return this.jwtDuration;
    }

    public final java.lang.String getJwtIssuer() {
        return this.jwtIssuer;
    }

    public final java.lang.String getJwtOrgUnitId() {
        return this.jwtOrgUnitId;
    }

    public final java.lang.String getNetworkLogoUrl() {
        return this.networkLogoUrl;
    }

    public final java.lang.String getAcquiringBin() {
        return this.acquiringBin;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType getReason() {
        return this.reason;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final java.lang.Boolean getSkipThreeDsEnforcement() {
        return this.skipThreeDsEnforcement;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceDataCollectionUrl;
        java.lang.String str2 = this.jwt;
        java.lang.String str3 = this.jwtDuration;
        java.lang.String str4 = this.jwtIssuer;
        java.lang.String str5 = this.jwtOrgUnitId;
        java.lang.String str6 = this.networkLogoUrl;
        java.lang.String str7 = this.acquiringBin;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType = this.reason;
        java.lang.String str8 = this.referenceId;
        java.lang.Boolean bool = this.skipThreeDsEnforcement;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType threeDsStipulationSourceType = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDsMetadata(deviceDataCollectionUrl=");
        sb.append(str);
        sb.append(", jwt=");
        sb.append(str2);
        sb.append(", jwtDuration=");
        sb.append(str3);
        sb.append(", jwtIssuer=");
        sb.append(str4);
        sb.append(", jwtOrgUnitId=");
        sb.append(str5);
        sb.append(", networkLogoUrl=");
        sb.append(str6);
        sb.append(", acquiringBin=");
        sb.append(str7);
        sb.append(", reason=");
        sb.append(threeDsStipulationReasonType);
        sb.append(", referenceId=");
        sb.append(str8);
        sb.append(", skipThreeDsEnforcement=");
        sb.append(bool);
        sb.append(", source=");
        sb.append(threeDsStipulationSourceType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.deviceDataCollectionUrl.hashCode();
        int hashCode2 = this.jwt.hashCode();
        int hashCode3 = this.jwtDuration.hashCode();
        int hashCode4 = this.jwtIssuer.hashCode();
        int hashCode5 = this.jwtOrgUnitId.hashCode();
        java.lang.String str = this.networkLogoUrl;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.acquiringBin;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType = this.reason;
        int hashCode8 = threeDsStipulationReasonType == null ? 0 : threeDsStipulationReasonType.hashCode();
        int hashCode9 = this.referenceId.hashCode();
        java.lang.Boolean bool = this.skipThreeDsEnforcement;
        int hashCode10 = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType threeDsStipulationSourceType = this.source;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (threeDsStipulationSourceType != null ? threeDsStipulationSourceType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata threeDsMetadata = (com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceDataCollectionUrl, threeDsMetadata.deviceDataCollectionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwt, threeDsMetadata.jwt) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwtDuration, threeDsMetadata.jwtDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwtIssuer, threeDsMetadata.jwtIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwtOrgUnitId, threeDsMetadata.jwtOrgUnitId) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkLogoUrl, threeDsMetadata.networkLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.acquiringBin, threeDsMetadata.acquiringBin) && this.reason == threeDsMetadata.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDsMetadata.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.skipThreeDsEnforcement, threeDsMetadata.skipThreeDsEnforcement) && this.source == threeDsMetadata.source;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata copy(java.lang.String deviceDataCollectionUrl, java.lang.String jwt, java.lang.String jwtDuration, java.lang.String jwtIssuer, java.lang.String jwtOrgUnitId, java.lang.String networkLogoUrl, java.lang.String acquiringBin, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType reason, java.lang.String referenceId, java.lang.Boolean skipThreeDsEnforcement, com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDataCollectionUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwtDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwtIssuer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwtOrgUnitId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsMetadata(deviceDataCollectionUrl, jwt, jwtDuration, jwtIssuer, jwtOrgUnitId, networkLogoUrl, acquiringBin, reason, referenceId, skipThreeDsEnforcement, source);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType getReason() {
        return this.reason;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAcquiringBin() {
        return this.acquiringBin;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNetworkLogoUrl() {
        return this.networkLogoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getJwtOrgUnitId() {
        return this.jwtOrgUnitId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getJwtIssuer() {
        return this.jwtIssuer;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getJwtDuration() {
        return this.jwtDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getJwt() {
        return this.jwt;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationSourceType getSource() {
        return this.source;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Boolean getSkipThreeDsEnforcement() {
        return this.skipThreeDsEnforcement;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceDataCollectionUrl() {
        return this.deviceDataCollectionUrl;
    }
}
