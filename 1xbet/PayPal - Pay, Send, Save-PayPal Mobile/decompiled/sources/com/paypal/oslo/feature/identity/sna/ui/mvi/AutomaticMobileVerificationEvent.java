package com.paypal.oslo.feature.identity.sna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ScreenInitialized", "ToggleConsent", "ConfirmDisable", "CancelDisable", "PrivacyPolicyClicked", "UpdateNumberClicked", "ConsentStatusLoaded", "ConsentStatusLoadFailed", "MobileNumbersLoaded", "ConsentToggleSucceeded", "ConsentToggleFailed", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$CancelDisable;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConfirmDisable;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoadFailed;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoaded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleFailed;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleSucceeded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$MobileNumbersLoaded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$PrivacyPolicyClicked;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ScreenInitialized;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ToggleConsent;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$UpdateNumberClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AutomaticMobileVerificationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutomaticMobileVerificationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ScreenInitialized;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenInitialized extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ScreenInitialized INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ScreenInitialized();

        public final int hashCode() {
            return -1331534579;
        }

        private ScreenInitialized() {
            super("ScreenInitialized", null);
        }

        public final java.lang.String toString() {
            return "ScreenInitialized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ScreenInitialized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ToggleConsent;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ToggleConsent;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToggleConsent extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public ToggleConsent(boolean z) {
            super("ToggleConsent", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleConsent(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent) && this.enabled == ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent) other).enabled;
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent copy(boolean enabled) {
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent toggleConsent, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = toggleConsent.enabled;
            }
            return toggleConsent.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConfirmDisable;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmDisable extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConfirmDisable INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConfirmDisable();

        public final int hashCode() {
            return 1060853731;
        }

        private ConfirmDisable() {
            super("ConfirmDisable", null);
        }

        public final java.lang.String toString() {
            return "ConfirmDisable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConfirmDisable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$CancelDisable;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelDisable extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.CancelDisable INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.CancelDisable();

        public final int hashCode() {
            return 171518931;
        }

        private CancelDisable() {
            super("CancelDisable", null);
        }

        public final java.lang.String toString() {
            return "CancelDisable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.CancelDisable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$PrivacyPolicyClicked;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrivacyPolicyClicked extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.PrivacyPolicyClicked INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.PrivacyPolicyClicked();

        public final int hashCode() {
            return -235553912;
        }

        private PrivacyPolicyClicked() {
            super("PrivacyPolicyClicked", null);
        }

        public final java.lang.String toString() {
            return "PrivacyPolicyClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.PrivacyPolicyClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$UpdateNumberClicked;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateNumberClicked extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.UpdateNumberClicked INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.UpdateNumberClicked();

        public final int hashCode() {
            return 819762010;
        }

        private UpdateNumberClicked() {
            super("UpdateNumberClicked", null);
        }

        public final java.lang.String toString() {
            return "UpdateNumberClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.UpdateNumberClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoaded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;)V", "component1", "()Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;", "copy", "(Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentStatusLoaded extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentStatusLoaded(com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus sNAConsentStatus) {
            super("ConsentStatusLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sNAConsentStatus, "");
            this.status = sNAConsentStatus;
        }

        public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus sNAConsentStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentStatusLoaded(status=");
            sb.append(sNAConsentStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded) && this.status == ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded) other).status;
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded copy(com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded consentStatusLoaded, com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus sNAConsentStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sNAConsentStatus = consentStatusLoaded.status;
            }
            return consentStatusLoaded.copy(sNAConsentStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoadFailed;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentStatusLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentStatusLoadFailed extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentStatusLoadFailed(java.lang.String str) {
            super("ConsentStatusLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentStatusLoadFailed(error=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed consentStatusLoadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = consentStatusLoadFailed.error;
            }
            return consentStatusLoadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$MobileNumbersLoaded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "", "Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "numbers", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$MobileNumbersLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MobileNumbersLoaded extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> numbers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobileNumbersLoaded(java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> list) {
            super("MobileNumbersLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.numbers = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> getNumbers() {
            return this.numbers;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> list = this.numbers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileNumbersLoaded(numbers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.numbers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.numbers, ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded) other).numbers);
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded copy(java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> numbers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numbers, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded(numbers);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> component1() {
            return this.numbers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded mobileNumbersLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = mobileNumbersLoaded.numbers;
            }
            return mobileNumbersLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleSucceeded;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleSucceeded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentToggleSucceeded extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public ConsentToggleSucceeded(boolean z) {
            super("ConsentToggleSucceeded", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentToggleSucceeded(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded) && this.enabled == ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded) other).enabled;
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded copy(boolean enabled) {
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded consentToggleSucceeded, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = consentToggleSucceeded.enabled;
            }
            return consentToggleSucceeded.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleFailed;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "", "error", "", "attemptedState", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent$ConsentToggleFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError", "Z", "getAttemptedState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentToggleFailed extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent {
        public static final int $stable = 0;
        private final boolean attemptedState;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentToggleFailed(java.lang.String str, boolean z) {
            super("ConsentToggleFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.attemptedState = z;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final boolean getAttemptedState() {
            return this.attemptedState;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            boolean z = this.attemptedState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentToggleFailed(error=");
            sb.append(str);
            sb.append(", attemptedState=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + java.lang.Boolean.hashCode(this.attemptedState);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed consentToggleFailed = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, consentToggleFailed.error) && this.attemptedState == consentToggleFailed.attemptedState;
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed copy(java.lang.String error, boolean attemptedState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed(error, attemptedState);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAttemptedState() {
            return this.attemptedState;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed consentToggleFailed, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = consentToggleFailed.error;
            }
            if ((i & 2) != 0) {
                z = consentToggleFailed.attemptedState;
            }
            return consentToggleFailed.copy(str, z);
        }
    }

    public /* synthetic */ AutomaticMobileVerificationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
