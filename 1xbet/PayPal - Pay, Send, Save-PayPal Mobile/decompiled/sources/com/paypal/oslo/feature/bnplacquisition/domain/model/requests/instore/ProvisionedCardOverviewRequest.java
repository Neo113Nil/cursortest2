package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b*\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b+\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;", "", "", "experienceSessionId", "creditAccountId", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ExternalWalletToken;", "externalWalletTokens", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;", "flowContext", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "provisionedTokens", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "pushProvisionCapableDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExperienceSessionId", "getCreditAccountId", "Ljava/util/List;", "getExternalWalletTokens", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;", "getFlowContext", "getProvisionedTokens", "getPushProvisionCapableDevices"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProvisionedCardOverviewRequest {
    public static final int $stable = 8;
    private final java.lang.String creditAccountId;
    private final java.lang.String experienceSessionId;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> externalWalletTokens;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> provisionedTokens;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> pushProvisionCapableDevices;

    /* JADX WARN: Multi-variable type inference failed */
    public ProvisionedCardOverviewRequest(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> list, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list2, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.experienceSessionId = str;
        this.creditAccountId = str2;
        this.externalWalletTokens = list;
        this.flowContext = flowContext;
        this.provisionedTokens = list2;
        this.pushProvisionCapableDevices = list3;
    }

    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> getExternalWalletTokens() {
        return this.externalWalletTokens;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> getProvisionedTokens() {
        return this.provisionedTokens;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> getPushProvisionCapableDevices() {
        return this.pushProvisionCapableDevices;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.experienceSessionId;
        java.lang.String str2 = this.creditAccountId;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> list = this.externalWalletTokens;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext = this.flowContext;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list2 = this.provisionedTokens;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> list3 = this.pushProvisionCapableDevices;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedCardOverviewRequest(experienceSessionId=");
        sb.append(str);
        sb.append(", creditAccountId=");
        sb.append(str2);
        sb.append(", externalWalletTokens=");
        sb.append(list);
        sb.append(", flowContext=");
        sb.append(flowContext);
        sb.append(", provisionedTokens=");
        sb.append(list2);
        sb.append(", pushProvisionCapableDevices=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.experienceSessionId.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.externalWalletTokens.hashCode()) * 31) + this.flowContext.hashCode()) * 31) + this.provisionedTokens.hashCode()) * 31) + this.pushProvisionCapableDevices.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.experienceSessionId, provisionedCardOverviewRequest.experienceSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, provisionedCardOverviewRequest.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalWalletTokens, provisionedCardOverviewRequest.externalWalletTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, provisionedCardOverviewRequest.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokens, provisionedCardOverviewRequest.provisionedTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.pushProvisionCapableDevices, provisionedCardOverviewRequest.pushProvisionCapableDevices);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest copy(java.lang.String experienceSessionId, java.lang.String creditAccountId, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> externalWalletTokens, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> provisionedTokens, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> pushProvisionCapableDevices) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisionCapableDevices, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest(experienceSessionId, creditAccountId, externalWalletTokens, flowContext, provisionedTokens, pushProvisionCapableDevices);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> component6() {
        return this.pushProvisionCapableDevices;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> component5() {
        return this.provisionedTokens;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> component3() {
        return this.externalWalletTokens;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExperienceSessionId() {
        return this.experienceSessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest, java.lang.String str, java.lang.String str2, java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = provisionedCardOverviewRequest.experienceSessionId;
        }
        if ((i & 2) != 0) {
            str2 = provisionedCardOverviewRequest.creditAccountId;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            list = provisionedCardOverviewRequest.externalWalletTokens;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            flowContext = provisionedCardOverviewRequest.flowContext;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext2 = flowContext;
        if ((i & 16) != 0) {
            list2 = provisionedCardOverviewRequest.provisionedTokens;
        }
        java.util.List list5 = list2;
        if ((i & 32) != 0) {
            list3 = provisionedCardOverviewRequest.pushProvisionCapableDevices;
        }
        return provisionedCardOverviewRequest.copy(str, str3, list4, flowContext2, list5, list3);
    }
}
