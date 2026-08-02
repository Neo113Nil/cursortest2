package com.paypal.oslo.feature.identity.devicebinding.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;", "", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "methods", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;", "flowContext", "<init>", "(Ljava/util/Set;Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;)V", "component1", "()Ljava/util/Set;", "component2", "()Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;", "copy", "(Ljava/util/Set;Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getMethods", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingFlowContext;", "getFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeviceBindingInput {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext flowContext;
    private final java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceBindingInput(java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext deviceBindingFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingFlowContext, "");
        this.methods = set;
        this.flowContext = deviceBindingFlowContext;
    }

    public final java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> getMethods() {
        return this.methods;
    }

    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String toString() {
        java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> set = this.methods;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext deviceBindingFlowContext = this.flowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceBindingInput(methods=");
        sb.append(set);
        sb.append(", flowContext=");
        sb.append(deviceBindingFlowContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.methods.hashCode() * 31) + this.flowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.methods, deviceBindingInput.methods) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, deviceBindingInput.flowContext);
    }

    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput copy(java.util.Set<? extends com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> methods, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methods, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput(methods, flowContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> component1() {
        return this.methods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput, java.util.Set set, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingFlowContext deviceBindingFlowContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = deviceBindingInput.methods;
        }
        if ((i & 2) != 0) {
            deviceBindingFlowContext = deviceBindingInput.flowContext;
        }
        return deviceBindingInput.copy(set, deviceBindingFlowContext);
    }
}
