package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "", "Loading", "Provisioned", "NeedsProvisioning", "Error", "Canceled", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Canceled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Loading;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$NeedsProvisioning;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Provisioned;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ProvisioningGateState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Loading;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading();

        public final int hashCode() {
            return -44702022;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Provisioned;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Provisioned implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned();

        public final int hashCode() {
            return -1593124174;
        }

        private Provisioned() {
        }

        public final java.lang.String toString() {
            return "Provisioned";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$NeedsProvisioning;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$NeedsProvisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NeedsProvisioning implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState {
        public static final int $stable = 0;
        private final java.lang.String intent;

        public NeedsProvisioning(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.intent = str;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NeedsProvisioning(intent=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning) other).intent);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning copy(java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning copy$default(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning needsProvisioning, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = needsProvisioning.intent;
            }
            return needsProvisioning.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Error INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Error();

        public final int hashCode() {
            return -1494671610;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState$Canceled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Canceled implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Canceled INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Canceled();

        public final int hashCode() {
            return 939798235;
        }

        private Canceled() {
        }

        public final java.lang.String toString() {
            return "Canceled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Canceled)) {
                return false;
            }
            return true;
        }
    }
}
