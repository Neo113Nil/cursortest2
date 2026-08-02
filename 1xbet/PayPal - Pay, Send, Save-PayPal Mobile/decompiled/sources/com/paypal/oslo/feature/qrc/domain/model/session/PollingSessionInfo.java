package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "", "", "sessionId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "qrCodeType", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;", "pollingType", "", "maximumPollingInterval", "", "isPayPalWorld", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;IZ)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;", "component4", "()I", "component5", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;IZ)Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getSessionId", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "getQrCodeType", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;", "getPollingType", com.visa.cbp.getEncExpo.warmup, "getMaximumPollingInterval", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PollingSessionInfo {
    public static final int $stable = 0;
    private final boolean isPayPalWorld;
    private final int maximumPollingInterval;
    private final com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType;
    private final java.lang.String sessionId;

    public PollingSessionInfo(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingType, "");
        this.sessionId = str;
        this.qrCodeType = qrCodeType;
        this.pollingType = pollingType;
        this.maximumPollingInterval = i;
        this.isPayPalWorld = z;
    }

    public /* synthetic */ PollingSessionInfo(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qrCodeType, pollingType, i, (i2 & 16) != 0 ? false : z);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.PollingType getPollingType() {
        return this.pollingType;
    }

    public final int getMaximumPollingInterval() {
        return this.maximumPollingInterval;
    }

    public final boolean isPayPalWorld() {
        return this.isPayPalWorld;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType = this.pollingType;
        int i = this.maximumPollingInterval;
        boolean z = this.isPayPalWorld;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PollingSessionInfo(sessionId=");
        sb.append(str);
        sb.append(", qrCodeType=");
        sb.append(qrCodeType);
        sb.append(", pollingType=");
        sb.append(pollingType);
        sb.append(", maximumPollingInterval=");
        sb.append(i);
        sb.append(", isPayPalWorld=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sessionId.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        return (((((((hashCode * 31) + (qrCodeType == null ? 0 : qrCodeType.hashCode())) * 31) + this.pollingType.hashCode()) * 31) + java.lang.Integer.hashCode(this.maximumPollingInterval)) * 31) + java.lang.Boolean.hashCode(this.isPayPalWorld);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo = (com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, pollingSessionInfo.sessionId) && this.qrCodeType == pollingSessionInfo.qrCodeType && this.pollingType == pollingSessionInfo.pollingType && this.maximumPollingInterval == pollingSessionInfo.maximumPollingInterval && this.isPayPalWorld == pollingSessionInfo.isPayPalWorld;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo copy(java.lang.String sessionId, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType, int maximumPollingInterval, boolean isPayPalWorld) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingType, "");
        return new com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo(sessionId, qrCodeType, pollingType, maximumPollingInterval, isPayPalWorld);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPayPalWorld() {
        return this.isPayPalWorld;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaximumPollingInterval() {
        return this.maximumPollingInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.PollingType getPollingType() {
        return this.pollingType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo copy$default(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = pollingSessionInfo.sessionId;
        }
        if ((i2 & 2) != 0) {
            qrCodeType = pollingSessionInfo.qrCodeType;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType2 = qrCodeType;
        if ((i2 & 4) != 0) {
            pollingType = pollingSessionInfo.pollingType;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType2 = pollingType;
        if ((i2 & 8) != 0) {
            i = pollingSessionInfo.maximumPollingInterval;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = pollingSessionInfo.isPayPalWorld;
        }
        return pollingSessionInfo.copy(str, qrCodeType2, pollingType2, i3, z);
    }
}
