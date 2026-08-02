package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState;", "", "Success", "Error", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PayPalPrepareAddCardState {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState;", "PrepareAddCardSuccess", "StepUpAuthChallenge", "RiskDeclined", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$PrepareAddCardSuccess;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$RiskDeclined;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$StepUpAuthChallenge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Success extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState {

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$PrepareAddCardSuccess;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "deviceWalletServiceCardId", "", "encryptedCardInfo", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;[B)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "component2", "()[B", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;[B)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$PrepareAddCardSuccess;", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "getDeviceWalletServiceCardId", "[B", "getEncryptedCardInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PrepareAddCardSuccess implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
            private final byte[] encryptedCardInfo;

            public PrepareAddCardSuccess(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] bArr) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                this.deviceWalletServiceCardId = deviceWalletServiceCardId;
                this.encryptedCardInfo = bArr;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
                return this.deviceWalletServiceCardId;
            }

            public final byte[] getEncryptedCardInfo() {
                return this.encryptedCardInfo;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                    return false;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess prepareAddCardSuccess = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, prepareAddCardSuccess.deviceWalletServiceCardId)) {
                    return java.util.Arrays.equals(this.encryptedCardInfo, prepareAddCardSuccess.encryptedCardInfo);
                }
                return false;
            }

            public final int hashCode() {
                return (this.deviceWalletServiceCardId.hashCode() * 31) + java.util.Arrays.hashCode(this.encryptedCardInfo);
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = this.deviceWalletServiceCardId;
                java.lang.String arrays = java.util.Arrays.toString(this.encryptedCardInfo);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareAddCardSuccess(deviceWalletServiceCardId=");
                sb.append(deviceWalletServiceCardId);
                sb.append(", encryptedCardInfo=");
                sb.append(arrays);
                sb.append(")");
                return sb.toString();
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] encryptedCardInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCardInfo, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess(deviceWalletServiceCardId, encryptedCardInfo);
            }

            /* renamed from: component2, reason: from getter */
            public final byte[] getEncryptedCardInfo() {
                return this.encryptedCardInfo;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
                return this.deviceWalletServiceCardId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess prepareAddCardSuccess, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, byte[] bArr, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    deviceWalletServiceCardId = prepareAddCardSuccess.deviceWalletServiceCardId;
                }
                if ((i & 2) != 0) {
                    bArr = prepareAddCardSuccess.encryptedCardInfo;
                }
                return prepareAddCardSuccess.copy(deviceWalletServiceCardId, bArr);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$StepUpAuthChallenge;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success;", "", "contextId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$StepUpAuthChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StepUpAuthChallenge implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success {
            public static final int $stable = 0;
            private final java.lang.String contextId;

            public StepUpAuthChallenge(java.lang.String str) {
                this.contextId = str;
            }

            public final java.lang.String getContextId() {
                return this.contextId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.contextId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("StepUpAuthChallenge(contextId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.contextId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge) other).contextId);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge copy(java.lang.String contextId) {
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge(contextId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getContextId() {
                return this.contextId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.StepUpAuthChallenge stepUpAuthChallenge, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stepUpAuthChallenge.contextId;
                }
                return stepUpAuthChallenge.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success$RiskDeclined;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RiskDeclined implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined();

            public final int hashCode() {
                return 1971478587;
            }

            private RiskDeclined() {
            }

            public final java.lang.String toString() {
                return "RiskDeclined";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.RiskDeclined)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState;", "Offline", "ResponseError", "ServiceApiError", "DefaultError", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ResponseError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ServiceApiError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Error extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Offline implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.Offline INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.Offline();

            public final int hashCode() {
                return -1834515638;
            }

            private Offline() {
            }

            public final java.lang.String toString() {
                return "Offline";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.Offline)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ResponseError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "", "responseCode", "", "errorBody", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ResponseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getResponseCode", "Ljava/lang/String;", "getErrorBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ResponseError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error {
            public static final int $stable = 0;
            private final java.lang.String errorBody;
            private final int responseCode;

            public ResponseError(int i, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.responseCode = i;
                this.errorBody = str;
            }

            public final java.lang.String getErrorBody() {
                return this.errorBody;
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public final java.lang.String toString() {
                int i = this.responseCode;
                java.lang.String str = this.errorBody;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseError(responseCode=");
                sb.append(i);
                sb.append(", errorBody=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Integer.hashCode(this.responseCode) * 31) + this.errorBody.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError) other;
                return this.responseCode == responseError.responseCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBody, responseError.errorBody);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError copy(int responseCode, java.lang.String errorBody) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBody, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError(responseCode, errorBody);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorBody() {
                return this.errorBody;
            }

            /* renamed from: component1, reason: from getter */
            public final int getResponseCode() {
                return this.responseCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ResponseError responseError, int i, java.lang.String str, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = responseError.responseCode;
                }
                if ((i2 & 2) != 0) {
                    str = responseError.errorBody;
                }
                return responseError.copy(i, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ServiceApiError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$ServiceApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServiceApiError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error {
            public static final int $stable = 8;
            private final java.lang.Throwable throwable;

            public ServiceApiError(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceApiError(throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.throwable.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError) other).throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError copy(java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError(throwable);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.ServiceApiError serviceApiError, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = serviceApiError.throwable;
                }
                return serviceApiError.copy(th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardState$Error$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DefaultError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;

            public DefaultError(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(debugMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError) other).debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError copy(java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError(debugMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Error.DefaultError defaultError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = defaultError.debugMessage;
                }
                return defaultError.copy(str);
            }
        }
    }
}
