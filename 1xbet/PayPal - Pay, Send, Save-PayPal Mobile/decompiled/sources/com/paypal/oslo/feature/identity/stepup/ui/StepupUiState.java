package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initializing", "ChallengeSelection", "Processing", "Error", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$ChallengeSelection;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Error;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Initializing;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Processing;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class StepupUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Initializing;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initializing extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing INSTANCE = new com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing();

        public final int hashCode() {
            return 1547510903;
        }

        private Initializing() {
            super("Initializing", null);
        }

        public final java.lang.String toString() {
            return "Initializing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$ChallengeSelection;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeDataList", "Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "selectionState", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$ChallengeSelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallengeDataList", "Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "getSelectionState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeSelection extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> challengeDataList;
        private final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState selectionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSelection(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list, com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState) {
            super("ChallengeSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challengeDataList = list;
            this.selectionState = optionSelectionState;
        }

        public /* synthetic */ ChallengeSelection(java.util.List list, com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : optionSelectionState);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> getChallengeDataList() {
            return this.challengeDataList;
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState getSelectionState() {
            return this.selectionState;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list = this.challengeDataList;
            com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState = this.selectionState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeSelection(challengeDataList=");
            sb.append(list);
            sb.append(", selectionState=");
            sb.append(optionSelectionState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeDataList.hashCode();
            com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState = this.selectionState;
            return (hashCode * 31) + (optionSelectionState == null ? 0 : optionSelectionState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection)) {
                return false;
            }
            com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection challengeSelection = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeDataList, challengeSelection.challengeDataList) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectionState, challengeSelection.selectionState);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection copy(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> challengeDataList, com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState selectionState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeDataList, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection(challengeDataList, selectionState);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState getSelectionState() {
            return this.selectionState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> component1() {
            return this.challengeDataList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection challengeSelection, java.util.List list, com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = challengeSelection.challengeDataList;
            }
            if ((i & 2) != 0) {
                optionSelectionState = challengeSelection.selectionState;
            }
            return challengeSelection.copy(list, optionSelectionState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Processing;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(java.lang.String str) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing) other).message);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing processing, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = processing.message;
            }
            return processing.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Error;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ StepupUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
