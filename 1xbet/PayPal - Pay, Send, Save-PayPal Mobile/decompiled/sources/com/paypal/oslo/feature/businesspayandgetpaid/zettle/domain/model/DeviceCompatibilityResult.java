package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "", "<init>", "()V", "Lkotlin/Function0;", "nextCheck", "ifCompatibleThen", "(Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "Compatible", "Incompatible", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult$Compatible;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult$Incompatible;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DeviceCompatibilityResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult$Compatible;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Compatible extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible();

        public final int hashCode() {
            return -1543184164;
        }

        private Compatible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Compatible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible)) {
                return false;
            }
            return true;
        }
    }

    private DeviceCompatibilityResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult$Incompatible;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;", "reason", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult$Incompatible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Incompatible extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCompatibilityRequirement, "");
            this.reason = deviceCompatibilityRequirement;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incompatible(reason=");
            sb.append(deviceCompatibilityRequirement);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible) && this.reason == ((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible) other).reason;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible copy(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible copy$default(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible incompatible, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceCompatibilityRequirement = incompatible.reason;
            }
            return incompatible.copy(deviceCompatibilityRequirement);
        }
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult ifCompatibleThen(kotlin.jvm.functions.Function0<? extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult> nextCheck) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextCheck, "");
        return this instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible ? nextCheck.invoke() : this;
    }

    public /* synthetic */ DeviceCompatibilityResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
