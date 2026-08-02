package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "flowSpecifier", "", "channel", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/FlowContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "getFlowSpecifier", "Ljava/lang/String;", "getChannel", "Ljava/util/List;", "getAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlowContext {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> attributes;
    private final java.lang.String channel;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier;

    public FlowContext(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.flowSpecifier = flowSpecifier;
        this.channel = str;
        this.attributes = list;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final java.lang.String getChannel() {
        return this.channel;
    }

    public final java.util.List<java.lang.String> getAttributes() {
        return this.attributes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier = this.flowSpecifier;
        java.lang.String str = this.channel;
        java.util.List<java.lang.String> list = this.attributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowContext(flowSpecifier=");
        sb.append(flowSpecifier);
        sb.append(", channel=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.flowSpecifier.hashCode();
        int hashCode2 = this.channel.hashCode();
        java.util.List<java.lang.String> list = this.attributes;
        return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext) other;
        return this.flowSpecifier == flowContext.flowSpecifier && kotlin.jvm.internal.Intrinsics.areEqual(this.channel, flowContext.channel) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, flowContext.attributes);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext copy(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String channel, java.util.List<java.lang.String> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext(flowSpecifier, channel, attributes);
    }

    public final java.util.List<java.lang.String> component3() {
        return this.attributes;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChannel() {
        return this.channel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext flowContext, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            flowSpecifier = flowContext.flowSpecifier;
        }
        if ((i & 2) != 0) {
            str = flowContext.channel;
        }
        if ((i & 4) != 0) {
            list = flowContext.attributes;
        }
        return flowContext.copy(flowSpecifier, str, list);
    }
}
