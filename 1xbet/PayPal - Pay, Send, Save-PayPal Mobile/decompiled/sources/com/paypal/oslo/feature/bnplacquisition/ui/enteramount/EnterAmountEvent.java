package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0018\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0018\"#$%&'()*+,-./0123456789"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CreateExperienceSession", "ExperienceSessionCreated", "LoanConstraintsLoaded", "SpendingPowerLoaded", "Continue", "ClosePressed", "HowItWorksPressed", "ShowKeyboard", "HideKeyboard", "AmountChanged", "CreateCreditSuccess", "SwitchToSuccess", "UpdateError", "UpdateApplicationSuccess", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "CheckIfFirstTimeOnScreen", "LongTermUrlPressed", "CheckScreenLock", "ScreenLockCompleted", "ScreenLockCancelled", "ShortTermUrlPressed", "SpendingPowerInfoPressed", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$AmountChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CheckIfFirstTimeOnScreen;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CheckScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CreateCreditSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CreateExperienceSession;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ExperienceSessionCreated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$HideKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$HowItWorksPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$LoanConstraintsLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$LongTermUrlPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ScreenLockCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ScreenLockCompleted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ShortTermUrlPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ShowKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SpendingPowerInfoPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SpendingPowerLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class EnterAmountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnterAmountEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CreateExperienceSession;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateExperienceSession extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession();

        public final int hashCode() {
            return 4348042;
        }

        private CreateExperienceSession() {
            super("CreateExperienceSession", null);
        }

        public final java.lang.String toString() {
            return "CreateExperienceSession";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ExperienceSessionCreated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExperienceSessionCreated extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ExperienceSessionCreated INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ExperienceSessionCreated();

        public final int hashCode() {
            return -968252830;
        }

        private ExperienceSessionCreated() {
            super("ExperienceSessionCreated", null);
        }

        public final java.lang.String toString() {
            return "ExperienceSessionCreated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ExperienceSessionCreated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$LoanConstraintsLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$LoanConstraintsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoanConstraintsLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanConstraintsLoaded(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel) {
            super("LoanConstraintsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountUiModel, "");
            this.model = enterAmountUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanConstraintsLoaded(model=");
            sb.append(enterAmountUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded) other).model);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded copy(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded loanConstraintsLoaded, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enterAmountUiModel = loanConstraintsLoaded.model;
            }
            return loanConstraintsLoaded.copy(enterAmountUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SpendingPowerLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "spendingPowerText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SpendingPowerLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getSpendingPowerText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpendingPowerLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText spendingPowerText;

        public SpendingPowerLoaded(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super("SpendingPowerLoaded", null);
            this.spendingPowerText = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getSpendingPowerText() {
            return this.spendingPowerText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.spendingPowerText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SpendingPowerLoaded(spendingPowerText=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.spendingPowerText;
            if (refText == null) {
                return 0;
            }
            return refText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPowerText, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded) other).spendingPowerText);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded copy(com.paypal.oslo.core.commonui.utils.RefText spendingPowerText) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded(spendingPowerText);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getSpendingPowerText() {
            return this.spendingPowerText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded spendingPowerLoaded, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = spendingPowerLoaded.spendingPowerText;
            }
            return spendingPowerLoaded.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed();

            public final int hashCode() {
                return -232141151;
            }

            private Pressed() {
                super("ContinuePressed", null);
            }

            public final java.lang.String toString() {
                return "Pressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid();

            public final int hashCode() {
                return 782452283;
            }

            private Valid() {
                super("ContinueValid", null);
            }

            public final java.lang.String toString() {
                return "Valid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid();

            public final int hashCode() {
                return 2045908086;
            }

            private Invalid() {
                super("ContinueInvalid", null);
            }

            public final java.lang.String toString() {
                return "Invalid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed();

        public final int hashCode() {
            return 339183344;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$HowItWorksPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HowItWorksPressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HowItWorksPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HowItWorksPressed();

        public final int hashCode() {
            return 785307477;
        }

        private HowItWorksPressed() {
            super("HowItWorksPressed", null);
        }

        public final java.lang.String toString() {
            return "HowItWorksPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HowItWorksPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ShowKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowKeyboard extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShowKeyboard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShowKeyboard();

        public final int hashCode() {
            return 1654304234;
        }

        private ShowKeyboard() {
            super("ShowKeyboard", null);
        }

        public final java.lang.String toString() {
            return "ShowKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShowKeyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$HideKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideKeyboard extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HideKeyboard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HideKeyboard();

        public final int hashCode() {
            return -1226466513;
        }

        private HideKeyboard() {
            super("HideKeyboard", null);
        }

        public final java.lang.String toString() {
            return "HideKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HideKeyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$AmountChanged;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$AmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountChanged extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountChanged(java.lang.String str) {
            super("AmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountChanged(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged) other).amount);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged amountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountChanged.amount;
            }
            return amountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CreateCreditSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "eligibleOfferCPIs", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CreateCreditSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "getData", "Ljava/util/List;", "getEligibleOfferCPIs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateCreditSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> eligibleOfferCPIs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CreateCreditSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> list) {
            super("CreateCreditSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.data = createCreditApplicationSuccess;
            this.eligibleOfferCPIs = list;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> getEligibleOfferCPIs() {
            return this.eligibleOfferCPIs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = this.data;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> list = this.eligibleOfferCPIs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCreditSuccess(data=");
            sb.append(createCreditApplicationSuccess);
            sb.append(", eligibleOfferCPIs=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.eligibleOfferCPIs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess createCreditSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, createCreditSuccess.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleOfferCPIs, createCreditSuccess.eligibleOfferCPIs);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> eligibleOfferCPIs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleOfferCPIs, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess(data, eligibleOfferCPIs);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> component2() {
            return this.eligibleOfferCPIs;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess createCreditSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationSuccess = createCreditSuccess.data;
            }
            if ((i & 2) != 0) {
                list = createCreditSuccess.eligibleOfferCPIs;
            }
            return createCreditSuccess.copy(createCreditApplicationSuccess, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SwitchToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwitchToSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToSuccess(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel) {
            super("SwitchToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountUiModel, "");
            this.model = enterAmountUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchToSuccess(model=");
            sb.append(enterAmountUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess) other).model);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess switchToSuccess, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enterAmountUiModel = switchToSuccess.model;
            }
            return switchToSuccess.copy(enterAmountUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateError extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("UpdateError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateError(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError updateError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = updateError.errorContent;
            }
            return updateError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "creditApplication", "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$UpdateApplicationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "getCreditApplication", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateApplicationSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication creditApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, java.lang.String str) {
            super("UpdateApplicationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOfferDetailsSuccessCreditApplication, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditApplication = availableOfferDetailsSuccessCreditApplication;
            this.correlationId = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getCreditApplication() {
            return this.creditApplication;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication = this.creditApplication;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateApplicationSuccess(creditApplication=");
            sb.append(availableOfferDetailsSuccessCreditApplication);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditApplication.hashCode() * 31) + this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess updateApplicationSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditApplication, updateApplicationSuccess.creditApplication) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, updateApplicationSuccess.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication creditApplication, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditApplication, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess(creditApplication, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getCreditApplication() {
            return this.creditApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess updateApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableOfferDetailsSuccessCreditApplication = updateApplicationSuccess.creditApplication;
            }
            if ((i & 2) != 0) {
                str = updateApplicationSuccess.correlationId;
            }
            return updateApplicationSuccess.copy(availableOfferDetailsSuccessCreditApplication, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationDeclined(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("ApplicationDeclined", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationDeclined(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ErrorBackPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorBackPressed(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel) {
            super("ErrorBackPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountUiModel, "");
            this.model = enterAmountUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorBackPressed(model=");
            sb.append(enterAmountUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed) other).model);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed copy(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed errorBackPressed, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enterAmountUiModel = errorBackPressed.model;
            }
            return errorBackPressed.copy(enterAmountUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.DeclineClosePressed();

        public final int hashCode() {
            return 2027839098;
        }

        private DeclineClosePressed() {
            super("DeclineClosePressed", null);
        }

        public final java.lang.String toString() {
            return "DeclineClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CheckIfFirstTimeOnScreen;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckIfFirstTimeOnScreen extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen();

        public final int hashCode() {
            return -655076087;
        }

        private CheckIfFirstTimeOnScreen() {
            super("CheckIfFirstTimeOnScreen", null);
        }

        public final java.lang.String toString() {
            return "CheckIfFirstTimeOnScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$LongTermUrlPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LongTermUrlPressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LongTermUrlPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LongTermUrlPressed();

        public final int hashCode() {
            return 769305153;
        }

        private LongTermUrlPressed() {
            super("LongTermUrlPressed", null);
        }

        public final java.lang.String toString() {
            return "LongTermUrlPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LongTermUrlPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$CheckScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckScreenLock extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckScreenLock INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckScreenLock();

        public final int hashCode() {
            return 1253040441;
        }

        private CheckScreenLock() {
            super("CheckScreenLock", null);
        }

        public final java.lang.String toString() {
            return "CheckScreenLock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckScreenLock)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ScreenLockCompleted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLockCompleted extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted();

        public final int hashCode() {
            return 1540004270;
        }

        private ScreenLockCompleted() {
            super("ScreenLockCompleted", null);
        }

        public final java.lang.String toString() {
            return "ScreenLockCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ScreenLockCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLockCancelled extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCancelled INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCancelled();

        public final int hashCode() {
            return -875443020;
        }

        private ScreenLockCancelled() {
            super("ScreenLockCancelled", null);
        }

        public final java.lang.String toString() {
            return "ScreenLockCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$ShortTermUrlPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShortTermUrlPressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShortTermUrlPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShortTermUrlPressed();

        public final int hashCode() {
            return 1120456245;
        }

        private ShortTermUrlPressed() {
            super("ShortTermUrlPressed", null);
        }

        public final java.lang.String toString() {
            return "ShortTermUrlPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShortTermUrlPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent$SpendingPowerInfoPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpendingPowerInfoPressed extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerInfoPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerInfoPressed();

        public final int hashCode() {
            return -1452268007;
        }

        private SpendingPowerInfoPressed() {
            super("SpendingPowerInfoPressed", null);
        }

        public final java.lang.String toString() {
            return "SpendingPowerInfoPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerInfoPressed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EnterAmountEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
