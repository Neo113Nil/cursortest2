package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "", "Idle", "Verifying", "Verified", "Failed", "AutoConfirmed", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$AutoConfirmed;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Failed;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Idle;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Verified;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Verifying;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface VerificationState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Idle;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Idle INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Idle();

        public final int hashCode() {
            return -1641516735;
        }

        private Idle() {
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Verifying;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Verifying implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verifying INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verifying();

        public final int hashCode() {
            return 1992997756;
        }

        private Verifying() {
        }

        public final java.lang.String toString() {
            return "Verifying";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verifying)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Verified;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "verifiedAddress", "originalAddress", "", "formattedVerifiedAddress", "formattedOriginalAddress", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Verified;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getVerifiedAddress", "getOriginalAddress", "Ljava/lang/String;", "getFormattedVerifiedAddress", "getFormattedOriginalAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Verified implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState {
        public static final int $stable = 8;
        private final java.lang.String formattedOriginalAddress;
        private final java.lang.String formattedVerifiedAddress;
        private final com.paypal.oslo.core.i18n.domain.model.Address originalAddress;
        private final com.paypal.oslo.core.i18n.domain.model.Address verifiedAddress;

        public Verified(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.Address address2, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.verifiedAddress = address;
            this.originalAddress = address2;
            this.formattedVerifiedAddress = str;
            this.formattedOriginalAddress = str2;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getOriginalAddress() {
            return this.originalAddress;
        }

        public final java.lang.String getFormattedVerifiedAddress() {
            return this.formattedVerifiedAddress;
        }

        public final java.lang.String getFormattedOriginalAddress() {
            return this.formattedOriginalAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.verifiedAddress;
            com.paypal.oslo.core.i18n.domain.model.Address address2 = this.originalAddress;
            java.lang.String str = this.formattedVerifiedAddress;
            java.lang.String str2 = this.formattedOriginalAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Verified(verifiedAddress=");
            sb.append(address);
            sb.append(", originalAddress=");
            sb.append(address2);
            sb.append(", formattedVerifiedAddress=");
            sb.append(str);
            sb.append(", formattedOriginalAddress=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.verifiedAddress.hashCode() * 31) + this.originalAddress.hashCode()) * 31) + this.formattedVerifiedAddress.hashCode()) * 31) + this.formattedOriginalAddress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified verified = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.verifiedAddress, verified.verifiedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalAddress, verified.originalAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedVerifiedAddress, verified.formattedVerifiedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedOriginalAddress, verified.formattedOriginalAddress);
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified copy(com.paypal.oslo.core.i18n.domain.model.Address verifiedAddress, com.paypal.oslo.core.i18n.domain.model.Address originalAddress, java.lang.String formattedVerifiedAddress, java.lang.String formattedOriginalAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifiedAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedVerifiedAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedOriginalAddress, "");
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified(verifiedAddress, originalAddress, formattedVerifiedAddress, formattedOriginalAddress);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFormattedOriginalAddress() {
            return this.formattedOriginalAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFormattedVerifiedAddress() {
            return this.formattedVerifiedAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getOriginalAddress() {
            return this.originalAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified verified, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.Address address2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = verified.verifiedAddress;
            }
            if ((i & 2) != 0) {
                address2 = verified.originalAddress;
            }
            if ((i & 4) != 0) {
                str = verified.formattedVerifiedAddress;
            }
            if ((i & 8) != 0) {
                str2 = verified.formattedOriginalAddress;
            }
            return verified.copy(address, address2, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Failed;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "unverifiedAddress", "", "formattedAddress", "errorMessage", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getUnverifiedAddress", "Ljava/lang/String;", "getFormattedAddress", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState {
        public static final int $stable = 8;
        private final java.lang.String errorMessage;
        private final java.lang.String formattedAddress;
        private final com.paypal.oslo.core.i18n.domain.model.Address unverifiedAddress;

        public Failed(com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.unverifiedAddress = address;
            this.formattedAddress = str;
            this.errorMessage = str2;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getUnverifiedAddress() {
            return this.unverifiedAddress;
        }

        public final java.lang.String getFormattedAddress() {
            return this.formattedAddress;
        }

        public /* synthetic */ Failed(com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i & 4) != 0 ? "" : str2);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.unverifiedAddress;
            java.lang.String str = this.formattedAddress;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(unverifiedAddress=");
            sb.append(address);
            sb.append(", formattedAddress=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.unverifiedAddress.hashCode() * 31) + this.formattedAddress.hashCode()) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed failed = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.unverifiedAddress, failed.unverifiedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAddress, failed.formattedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, failed.errorMessage);
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed copy(com.paypal.oslo.core.i18n.domain.model.Address unverifiedAddress, java.lang.String formattedAddress, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unverifiedAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed(unverifiedAddress, formattedAddress, errorMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedAddress() {
            return this.formattedAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getUnverifiedAddress() {
            return this.unverifiedAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed failed, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = failed.unverifiedAddress;
            }
            if ((i & 2) != 0) {
                str = failed.formattedAddress;
            }
            if ((i & 4) != 0) {
                str2 = failed.errorMessage;
            }
            return failed.copy(address, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$AutoConfirmed;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/VerificationState$AutoConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoConfirmed implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address address;

        public AutoConfirmed(com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.address = address;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoConfirmed(address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed) other).address);
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed copy(com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed autoConfirmed, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = autoConfirmed.address;
            }
            return autoConfirmed.copy(address);
        }
    }
}
