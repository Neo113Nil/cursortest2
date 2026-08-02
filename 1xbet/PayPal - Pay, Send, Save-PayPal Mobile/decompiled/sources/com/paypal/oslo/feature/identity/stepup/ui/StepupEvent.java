package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ChallengeSelected", "ShowSelection", "OptionSelected", "SelectionDismissed", "StepupProcessed", "StepupProcessingFailed", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ChallengeSelected;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$OptionSelected;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$SelectionDismissed;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ShowSelection;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessed;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessingFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class StepupEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ChallengeSelected;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ChallengeSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeSelected extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSelected(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super("ChallengeSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            this.challengeData = challengeData;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeSelected(challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, ((com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected) other).challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected(challengeData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ChallengeSelected challengeSelected, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeData = challengeSelected.challengeData;
            }
            return challengeSelected.copy(challengeData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ShowSelection;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "selectionState", "<init>", "(Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "copy", "(Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$ShowSelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "getSelectionState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSelection extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState selectionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSelection(com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState) {
            super("ShowSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionSelectionState, "");
            this.selectionState = optionSelectionState;
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState getSelectionState() {
            return this.selectionState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState = this.selectionState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowSelection(selectionState=");
            sb.append(optionSelectionState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectionState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectionState, ((com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection) other).selectionState);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection copy(com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState selectionState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionState, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection(selectionState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState getSelectionState() {
            return this.selectionState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.ShowSelection showSelection, com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optionSelectionState = showSelection.selectionState;
            }
            return showSelection.copy(optionSelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$OptionSelected;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "", "optionId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$OptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOptionId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OptionSelected extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;
        private final java.lang.String optionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionSelected(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super("OptionSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionId = str;
            this.challengeData = challengeData;
        }

        public /* synthetic */ OptionSelected(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : challengeData);
        }

        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.optionId;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionSelected(optionId=");
            sb.append(str);
            sb.append(", challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.optionId.hashCode();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            return (hashCode * 31) + (challengeData == null ? 0 : challengeData.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected)) {
                return false;
            }
            com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected optionSelected = (com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.optionId, optionSelected.optionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, optionSelected.challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected copy(java.lang.String optionId, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionId, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected(optionId, challengeData);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.OptionSelected optionSelected, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = optionSelected.optionId;
            }
            if ((i & 2) != 0) {
                challengeData = optionSelected.challengeData;
            }
            return optionSelected.copy(str, challengeData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$SelectionDismissed;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectionDismissed extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.SelectionDismissed INSTANCE = new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.SelectionDismissed();

        public final int hashCode() {
            return -933335030;
        }

        private SelectionDismissed() {
            super("SelectionDismissed", null);
        }

        public final java.lang.String toString() {
            return "SelectionDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.SelectionDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessed;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "copy", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StepupProcessed extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StepupProcessed(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult stepupProcessingResult) {
            super("StepupProcessed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupProcessingResult, "");
            this.result = stepupProcessingResult;
        }

        public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult stepupProcessingResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StepupProcessed(result=");
            sb.append(stepupProcessingResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed) other).result);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed copy(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessed stepupProcessed, com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult stepupProcessingResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                stepupProcessingResult = stepupProcessed.result;
            }
            return stepupProcessed.copy(stepupProcessingResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessingFailed;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupEvent$StepupProcessingFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StepupProcessingFailed extends com.paypal.oslo.feature.identity.stepup.ui.StepupEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StepupProcessingFailed(java.lang.String str) {
            super("StepupProcessingFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StepupProcessingFailed(error=");
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
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupEvent.StepupProcessingFailed stepupProcessingFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stepupProcessingFailed.error;
            }
            return stepupProcessingFailed.copy(str);
        }
    }

    public /* synthetic */ StepupEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
