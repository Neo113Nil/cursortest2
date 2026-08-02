package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "", "Initialize", "ScreenLockEnabled", "SetupIntroCompleted", "StartPpdcAcquisition", "CardSelected", "FiSelectorError", "CvvEntered", "TermsResponse", "VerificationMethodSelected", "OtpEntered", "ResendOtp", "ChooseDefaultCompleted", "ChooseSecondaryPaymentCompleted", "XiaomiPaymentConfirmationsCompleted", "RetryTokenization", "GoBack", com.knotapi.knot.utilities.Constants.META_CLOSE, "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CardSelected;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ChooseDefaultCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ChooseSecondaryPaymentCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$Close;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CvvEntered;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$FiSelectorError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$GoBack;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$Initialize;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$OtpEntered;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ResendOtp;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$RetryTokenization;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ScreenLockEnabled;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$SetupIntroCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$StartPpdcAcquisition;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$TermsResponse;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$VerificationMethodSelected;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$XiaomiPaymentConfirmationsCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SetupFlowIntent {

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$Initialize;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "entryPoint", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "preSelectedCard", "", "cardDescription", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "component2", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "getEntryPoint", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "getPreSelectedCard", "Ljava/lang/String;", "getCardDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 8;
        private final java.lang.String cardDescription;
        private final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint;
        private final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo preSelectedCard;

        public Initialize(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, java.lang.String str) {
            this.entryPoint = entryPoint;
            this.preSelectedCard = setupCardInfo;
            this.cardDescription = str;
        }

        public /* synthetic */ Initialize(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entryPoint, (i & 2) != 0 ? null : setupCardInfo, (i & 4) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getPreSelectedCard() {
            return this.preSelectedCard;
        }

        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint = this.entryPoint;
            com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = this.preSelectedCard;
            java.lang.String str = this.cardDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(entryPoint=");
            sb.append(entryPoint);
            sb.append(", preSelectedCard=");
            sb.append(setupCardInfo);
            sb.append(", cardDescription=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint = this.entryPoint;
            int hashCode = entryPoint == null ? 0 : entryPoint.hashCode();
            com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = this.preSelectedCard;
            int hashCode2 = setupCardInfo == null ? 0 : setupCardInfo.hashCode();
            java.lang.String str = this.cardDescription;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize initialize = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize) other;
            return this.entryPoint == initialize.entryPoint && kotlin.jvm.internal.Intrinsics.areEqual(this.preSelectedCard, initialize.preSelectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDescription, initialize.cardDescription);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize copy(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo preSelectedCard, java.lang.String cardDescription) {
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize(entryPoint, preSelectedCard, cardDescription);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getPreSelectedCard() {
            return this.preSelectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize initialize, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                entryPoint = initialize.entryPoint;
            }
            if ((i & 2) != 0) {
                setupCardInfo = initialize.preSelectedCard;
            }
            if ((i & 4) != 0) {
                str = initialize.cardDescription;
            }
            return initialize.copy(entryPoint, setupCardInfo, str);
        }

        public Initialize() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ScreenLockEnabled;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLockEnabled implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ScreenLockEnabled INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ScreenLockEnabled();

        public final int hashCode() {
            return 524457494;
        }

        private ScreenLockEnabled() {
        }

        public final java.lang.String toString() {
            return "ScreenLockEnabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ScreenLockEnabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$SetupIntroCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetupIntroCompleted implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.SetupIntroCompleted INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.SetupIntroCompleted();

        public final int hashCode() {
            return 73187496;
        }

        private SetupIntroCompleted() {
        }

        public final java.lang.String toString() {
            return "SetupIntroCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.SetupIntroCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$StartPpdcAcquisition;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartPpdcAcquisition implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.StartPpdcAcquisition INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.StartPpdcAcquisition();

        public final int hashCode() {
            return 945196224;
        }

        private StartPpdcAcquisition() {
        }

        public final java.lang.String toString() {
            return "StartPpdcAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.StartPpdcAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CardSelected;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "card", "", "pendingVerification", "skippedFiSelector", "", "cardDescription", "fromPpdcCreation", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;ZZLjava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "component2", "()Z", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;ZZLjava/lang/String;Z)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CardSelected;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "getCard", "Z", "getPendingVerification", "getSkippedFiSelector", "Ljava/lang/String;", "getCardDescription", "getFromPpdcCreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardSelected implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo card;
        private final java.lang.String cardDescription;
        private final boolean fromPpdcCreation;
        private final boolean pendingVerification;
        private final boolean skippedFiSelector;

        public CardSelected(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, boolean z, boolean z2, java.lang.String str, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupCardInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.card = setupCardInfo;
            this.pendingVerification = z;
            this.skippedFiSelector = z2;
            this.cardDescription = str;
            this.fromPpdcCreation = z3;
        }

        public /* synthetic */ CardSelected(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, boolean z, boolean z2, java.lang.String str, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(setupCardInfo, z, z2, str, (i & 16) != 0 ? false : z3);
        }

        public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getCard() {
            return this.card;
        }

        public final boolean getPendingVerification() {
            return this.pendingVerification;
        }

        public final boolean getSkippedFiSelector() {
            return this.skippedFiSelector;
        }

        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        public final boolean getFromPpdcCreation() {
            return this.fromPpdcCreation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = this.card;
            boolean z = this.pendingVerification;
            boolean z2 = this.skippedFiSelector;
            java.lang.String str = this.cardDescription;
            boolean z3 = this.fromPpdcCreation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardSelected(card=");
            sb.append(setupCardInfo);
            sb.append(", pendingVerification=");
            sb.append(z);
            sb.append(", skippedFiSelector=");
            sb.append(z2);
            sb.append(", cardDescription=");
            sb.append(str);
            sb.append(", fromPpdcCreation=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.card.hashCode() * 31) + java.lang.Boolean.hashCode(this.pendingVerification)) * 31) + java.lang.Boolean.hashCode(this.skippedFiSelector)) * 31) + this.cardDescription.hashCode()) * 31) + java.lang.Boolean.hashCode(this.fromPpdcCreation);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected cardSelected = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.card, cardSelected.card) && this.pendingVerification == cardSelected.pendingVerification && this.skippedFiSelector == cardSelected.skippedFiSelector && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDescription, cardSelected.cardDescription) && this.fromPpdcCreation == cardSelected.fromPpdcCreation;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected copy(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo card, boolean pendingVerification, boolean skippedFiSelector, java.lang.String cardDescription, boolean fromPpdcCreation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDescription, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected(card, pendingVerification, skippedFiSelector, cardDescription, fromPpdcCreation);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getFromPpdcCreation() {
            return this.fromPpdcCreation;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCardDescription() {
            return this.cardDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkippedFiSelector() {
            return this.skippedFiSelector;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPendingVerification() {
            return this.pendingVerification;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getCard() {
            return this.card;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CardSelected cardSelected, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, boolean z, boolean z2, java.lang.String str, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                setupCardInfo = cardSelected.card;
            }
            if ((i & 2) != 0) {
                z = cardSelected.pendingVerification;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = cardSelected.skippedFiSelector;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                str = cardSelected.cardDescription;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                z3 = cardSelected.fromPpdcCreation;
            }
            return cardSelected.copy(setupCardInfo, z4, z5, str2, z3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$FiSelectorError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "type", "<init>", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "copy", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$FiSelectorError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiSelectorError implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType type;

        public FiSelectorError(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiSelectorErrorType, "");
            this.type = fiSelectorErrorType;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiSelectorError(type=");
            sb.append(fiSelectorErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError) && this.type == ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError) other).type;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError copy(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.FiSelectorError fiSelectorError, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fiSelectorErrorType = fiSelectorError.type;
            }
            return fiSelectorError.copy(fiSelectorErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CvvEntered;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$CvvEntered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CvvEntered implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        public CvvEntered(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CvvEntered(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered) other).cvv);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.CvvEntered cvvEntered, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cvvEntered.cvv;
            }
            return cvvEntered.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$TermsResponse;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "", "accepted", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$TermsResponse;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAccepted"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TermsResponse implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        private final boolean accepted;

        public TermsResponse(boolean z) {
            this.accepted = z;
        }

        public final boolean getAccepted() {
            return this.accepted;
        }

        public final java.lang.String toString() {
            boolean z = this.accepted;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsResponse(accepted=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.accepted);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse) && this.accepted == ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse) other).accepted;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse copy(boolean accepted) {
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse(accepted);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAccepted() {
            return this.accepted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.TermsResponse termsResponse, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = termsResponse.accepted;
            }
            return termsResponse.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$VerificationMethodSelected;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "method", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$VerificationMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationMethodSelected implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod method;

        public VerificationMethodSelected(com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityVerificationMethod, "");
            this.method = identityVerificationMethod;
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod getMethod() {
            return this.method;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod = this.method;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationMethodSelected(method=");
            sb.append(identityVerificationMethod);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.method.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.method, ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected) other).method);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected copy(com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected(method);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.VerificationMethodSelected verificationMethodSelected, com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                identityVerificationMethod = verificationMethodSelected.method;
            }
            return verificationMethodSelected.copy(identityVerificationMethod);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$OtpEntered;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "", "otp", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$OtpEntered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtp"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpEntered implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        private final java.lang.String otp;

        public OtpEntered(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.otp = str;
        }

        public final java.lang.String getOtp() {
            return this.otp;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpEntered(otp=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.otp.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered) && kotlin.jvm.internal.Intrinsics.areEqual(this.otp, ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered) other).otp);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered copy(java.lang.String otp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otp, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered(otp);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtp() {
            return this.otp;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.OtpEntered otpEntered, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = otpEntered.otp;
            }
            return otpEntered.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ResendOtp;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResendOtp implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ResendOtp INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ResendOtp();

        public final int hashCode() {
            return -479663236;
        }

        private ResendOtp() {
        }

        public final java.lang.String toString() {
            return "ResendOtp";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ResendOtp)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ChooseDefaultCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChooseDefaultCompleted implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseDefaultCompleted INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseDefaultCompleted();

        public final int hashCode() {
            return 2085976629;
        }

        private ChooseDefaultCompleted() {
        }

        public final java.lang.String toString() {
            return "ChooseDefaultCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseDefaultCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$ChooseSecondaryPaymentCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChooseSecondaryPaymentCompleted implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseSecondaryPaymentCompleted INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseSecondaryPaymentCompleted();

        public final int hashCode() {
            return 310802350;
        }

        private ChooseSecondaryPaymentCompleted() {
        }

        public final java.lang.String toString() {
            return "ChooseSecondaryPaymentCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.ChooseSecondaryPaymentCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$XiaomiPaymentConfirmationsCompleted;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class XiaomiPaymentConfirmationsCompleted implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.XiaomiPaymentConfirmationsCompleted INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.XiaomiPaymentConfirmationsCompleted();

        public final int hashCode() {
            return 771906372;
        }

        private XiaomiPaymentConfirmationsCompleted() {
        }

        public final java.lang.String toString() {
            return "XiaomiPaymentConfirmationsCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.XiaomiPaymentConfirmationsCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$RetryTokenization;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryTokenization implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.RetryTokenization INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.RetryTokenization();

        public final int hashCode() {
            return 118877599;
        }

        private RetryTokenization() {
        }

        public final java.lang.String toString() {
            return "RetryTokenization";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.RetryTokenization)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$GoBack;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBack implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.GoBack INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.GoBack();

        public final int hashCode() {
            return -799650077;
        }

        private GoBack() {
        }

        public final java.lang.String toString() {
            return "GoBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.GoBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent$Close;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Close implements com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close();

        public final int hashCode() {
            return -860818812;
        }

        private Close() {
        }

        public final java.lang.String toString() {
            return com.knotapi.knot.utilities.Constants.META_CLOSE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Close)) {
                return false;
            }
            return true;
        }
    }
}
