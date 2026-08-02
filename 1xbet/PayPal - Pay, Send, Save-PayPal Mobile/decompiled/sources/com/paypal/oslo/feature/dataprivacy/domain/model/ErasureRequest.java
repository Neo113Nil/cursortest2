package com.paypal.oslo.feature.dataprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013Jl\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b5\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b6\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;", "", "", "id", "partyId", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;", "domain", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;", "requestType", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;", "status", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;", "source", "createTime", "updateTime", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;", "component4", "()Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;", "component5", "()Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;", "component6", "()Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getPartyId", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;", "getDomain", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;", "getRequestType", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;", "getStatus", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;", "getSource", "getCreateTime", "getUpdateTime", "getAlias"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErasureRequest {
    public static final int $stable = 0;
    private final java.lang.String alias;
    private final java.lang.String createTime;
    private final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain domain;
    private final java.lang.String id;
    private final java.lang.String partyId;
    private final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType requestType;
    private final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource source;
    private final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus status;
    private final java.lang.String updateTime;

    public ErasureRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureRequestType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.partyId = str2;
        this.domain = erasureDomain;
        this.requestType = erasureRequestType;
        this.status = erasureStatus;
        this.source = erasureSource;
        this.createTime = str3;
        this.updateTime = str4;
        this.alias = str5;
    }

    public /* synthetic */ ErasureRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, erasureDomain, erasureRequestType, erasureStatus, erasureSource, str3, str4, (i & 256) != 0 ? null : str5);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain getDomain() {
        return this.domain;
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType getRequestType() {
        return this.requestType;
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource getSource() {
        return this.source;
    }

    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    public final java.lang.String getUpdateTime() {
        return this.updateTime;
    }

    public final java.lang.String getAlias() {
        return this.alias;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.partyId;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain = this.domain;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType = this.requestType;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus = this.status;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource = this.source;
        java.lang.String str3 = this.createTime;
        java.lang.String str4 = this.updateTime;
        java.lang.String str5 = this.alias;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErasureRequest(id=");
        sb.append(str);
        sb.append(", partyId=");
        sb.append(str2);
        sb.append(", domain=");
        sb.append(erasureDomain);
        sb.append(", requestType=");
        sb.append(erasureRequestType);
        sb.append(", status=");
        sb.append(erasureStatus);
        sb.append(", source=");
        sb.append(erasureSource);
        sb.append(", createTime=");
        sb.append(str3);
        sb.append(", updateTime=");
        sb.append(str4);
        sb.append(", alias=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.partyId.hashCode();
        int hashCode3 = this.domain.hashCode();
        int hashCode4 = this.requestType.hashCode();
        int hashCode5 = this.status.hashCode();
        int hashCode6 = this.source.hashCode();
        int hashCode7 = this.createTime.hashCode();
        int hashCode8 = this.updateTime.hashCode();
        java.lang.String str = this.alias;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest erasureRequest = (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, erasureRequest.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, erasureRequest.partyId) && this.domain == erasureRequest.domain && this.requestType == erasureRequest.requestType && this.status == erasureRequest.status && this.source == erasureRequest.source && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, erasureRequest.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTime, erasureRequest.updateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.alias, erasureRequest.alias);
    }

    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest copy(java.lang.String id, java.lang.String partyId, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain domain, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType requestType, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus status, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource source, java.lang.String createTime, java.lang.String updateTime, java.lang.String alias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTime, "");
        return new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest(id, partyId, domain, requestType, status, source, createTime, updateTime, alias);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAlias() {
        return this.alias;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType getRequestType() {
        return this.requestType;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain getDomain() {
        return this.domain;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
