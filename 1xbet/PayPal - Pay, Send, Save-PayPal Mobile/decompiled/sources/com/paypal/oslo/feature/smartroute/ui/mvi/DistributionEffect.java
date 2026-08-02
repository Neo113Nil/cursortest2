package com.paypal.oslo.feature.smartroute.ui.mvi;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "ShowValidationError", "ShowSmartRouteActivated", "ShowSettingsSaved", "ShowSmartRouteTurnedOff", "ShowSmartRouteTurnedOffWithAutoReload", "ShowTurnOffFailed", "ShowPyusdOptInSuccess", "ShowPyusdOptInError", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInError;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSettingsSaved;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteActivated;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteTurnedOff;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteTurnedOffWithAutoReload;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowTurnOffFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DistributionEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private DistributionEffect() {
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "DistributionEffect" : simpleName;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowValidationError;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowValidationError extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowValidationError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowValidationError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError showValidationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showValidationError.message;
            }
            return showValidationError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteActivated;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSmartRouteActivated extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteActivated INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteActivated();

        public final int hashCode() {
            return 263035782;
        }

        private ShowSmartRouteActivated() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowSmartRouteActivated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteActivated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSettingsSaved;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSettingsSaved extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSettingsSaved INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSettingsSaved();

        public final int hashCode() {
            return -2116388935;
        }

        private ShowSettingsSaved() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowSettingsSaved";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSettingsSaved)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteTurnedOff;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSmartRouteTurnedOff extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOff INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOff();

        public final int hashCode() {
            return -60553304;
        }

        private ShowSmartRouteTurnedOff() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowSmartRouteTurnedOff";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOff)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowSmartRouteTurnedOffWithAutoReload;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSmartRouteTurnedOffWithAutoReload extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOffWithAutoReload INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOffWithAutoReload();

        public final int hashCode() {
            return 1648764758;
        }

        private ShowSmartRouteTurnedOffWithAutoReload() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowSmartRouteTurnedOffWithAutoReload";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOffWithAutoReload)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowTurnOffFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTurnOffFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowTurnOffFailed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowTurnOffFailed();

        public final int hashCode() {
            return 957452836;
        }

        private ShowTurnOffFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowTurnOffFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowTurnOffFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "", "apyRate", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getApyRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPyusdOptInSuccess extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        private final java.lang.String apyRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPyusdOptInSuccess(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.apyRate = str;
        }

        public final java.lang.String getApyRate() {
            return this.apyRate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.apyRate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPyusdOptInSuccess(apyRate=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.apyRate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.apyRate, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess) other).apyRate);
        }

        public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess copy(java.lang.String apyRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apyRate, "");
            return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess(apyRate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getApyRate() {
            return this.apyRate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess showPyusdOptInSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showPyusdOptInSuccess.apyRate;
            }
            return showPyusdOptInSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInError;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect$ShowPyusdOptInError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPyusdOptInError extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPyusdOptInError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPyusdOptInError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError showPyusdOptInError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showPyusdOptInError.message;
            }
            return showPyusdOptInError.copy(str);
        }
    }

    public /* synthetic */ DistributionEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
