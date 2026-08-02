package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetRenderState;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "config", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/ErrorMessagePriority;", "", "externalMessage", "", "visibility", "instanceId", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;Lkotlin/Pair;ILjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "component2", "()Lkotlin/Pair;", "component3", "()I", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;Lkotlin/Pair;ILjava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetRenderState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "getConfig", "Lkotlin/Pair;", "getExternalMessage", com.visa.cbp.getEncExpo.warmup, "getVisibility", "Ljava/lang/String;", "getInstanceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IdScanWidgetRenderState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig config;
    private final kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> externalMessage;
    private final java.lang.String instanceId;
    private final int visibility;

    /* JADX WARN: Multi-variable type inference failed */
    public IdScanWidgetRenderState(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig, kotlin.Pair<? extends com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> pair, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.config = idScanWidgetConfig;
        this.externalMessage = pair;
        this.visibility = i;
        this.instanceId = str;
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig getConfig() {
        return this.config;
    }

    public final kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> getExternalMessage() {
        return this.externalMessage;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    public /* synthetic */ IdScanWidgetRenderState(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig, kotlin.Pair pair, int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : idScanWidgetConfig, (i2 & 2) != 0 ? null : pair, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig = this.config;
        kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> pair = this.externalMessage;
        int i = this.visibility;
        java.lang.String str = this.instanceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdScanWidgetRenderState(config=");
        sb.append(idScanWidgetConfig);
        sb.append(", externalMessage=");
        sb.append(pair);
        sb.append(", visibility=");
        sb.append(i);
        sb.append(", instanceId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig = this.config;
        int hashCode = idScanWidgetConfig == null ? 0 : idScanWidgetConfig.hashCode();
        kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> pair = this.externalMessage;
        return (((((hashCode * 31) + (pair != null ? pair.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.visibility)) * 31) + this.instanceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState idScanWidgetRenderState = (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.config, idScanWidgetRenderState.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalMessage, idScanWidgetRenderState.externalMessage) && this.visibility == idScanWidgetRenderState.visibility && kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, idScanWidgetRenderState.instanceId);
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState copy(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig config, kotlin.Pair<? extends com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> externalMessage, int visibility, java.lang.String instanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "");
        return new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState(config, externalMessage, visibility, instanceId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVisibility() {
        return this.visibility;
    }

    public final kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> component2() {
        return this.externalMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState copy$default(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState idScanWidgetRenderState, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig, kotlin.Pair pair, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            idScanWidgetConfig = idScanWidgetRenderState.config;
        }
        if ((i2 & 2) != 0) {
            pair = idScanWidgetRenderState.externalMessage;
        }
        if ((i2 & 4) != 0) {
            i = idScanWidgetRenderState.visibility;
        }
        if ((i2 & 8) != 0) {
            str = idScanWidgetRenderState.instanceId;
        }
        return idScanWidgetRenderState.copy(idScanWidgetConfig, pair, i, str);
    }

    public IdScanWidgetRenderState() {
        this(null, null, 0, null, 15, null);
    }
}
