package com.paypal.oslo.feature.identity.devicebinding.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingOutput;", "", "", "correlationID", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "results", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingOutput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationID", "Ljava/util/Map;", "getResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeviceBindingOutput {
    public static final int $stable = 8;
    private final java.lang.String correlationID;
    private final java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> results;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceBindingOutput(java.lang.String str, java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, ? extends arrow.core.Either<? extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.correlationID = str;
        this.results = map;
    }

    public final java.lang.String getCorrelationID() {
        return this.correlationID;
    }

    public final java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> getResults() {
        return this.results;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.correlationID;
        java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> map = this.results;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceBindingOutput(correlationID=");
        sb.append(str);
        sb.append(", results=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.correlationID.hashCode() * 31) + this.results.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationID, deviceBindingOutput.correlationID) && kotlin.jvm.internal.Intrinsics.areEqual(this.results, deviceBindingOutput.results);
    }

    public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput copy(java.lang.String correlationID, java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, ? extends arrow.core.Either<? extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> results) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
        return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput(correlationID, results);
    }

    public final java.util.Map<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod, arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit>> component2() {
        return this.results;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCorrelationID() {
        return this.correlationID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceBindingOutput.correlationID;
        }
        if ((i & 2) != 0) {
            map = deviceBindingOutput.results;
        }
        return deviceBindingOutput.copy(str, map);
    }
}
