package com.paypal.oslo.feature.identity.devicebinding.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;", "", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;", "source", "", "", "additionalParams", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;Ljava/util/Map;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;", "getSource", "Ljava/util/Map;", "getAdditionalParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeviceBindingFlowContext {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> additionalParams;
    private final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource source;

    public DeviceBindingFlowContext(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.source = deviceBindingSource;
        this.additionalParams = map;
    }

    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource getSource() {
        return this.source;
    }

    public /* synthetic */ DeviceBindingFlowContext(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceBindingSource, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource = this.source;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalParams;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceBindingFlowContext(source=");
        sb.append(deviceBindingSource);
        sb.append(", additionalParams=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.source.hashCode() * 31) + this.additionalParams.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext)) {
            return false;
        }
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext deviceBindingFlowContext = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext) other;
        return this.source == deviceBindingFlowContext.source && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalParams, deviceBindingFlowContext.additionalParams);
    }

    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext copy(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource source, java.util.Map<java.lang.String, java.lang.String> additionalParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalParams, "");
        return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext(source, additionalParams);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.additionalParams;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext deviceBindingFlowContext, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceBindingSource = deviceBindingFlowContext.source;
        }
        if ((i & 2) != 0) {
            map = deviceBindingFlowContext.additionalParams;
        }
        return deviceBindingFlowContext.copy(deviceBindingSource, map);
    }
}
