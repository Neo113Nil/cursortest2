package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OptionSelected", "BackClicked", "ConfirmClicked", "ConsentNotChecked", "OnSnoozeSuccess", "OnSnoozeError", "TransitionToConfirmation", "TransitionToSchedule", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$BackClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$ConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$ConsentNotChecked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OnSnoozeError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OnSnoozeSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OptionSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToConfirmation;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToSchedule;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class SnoozeEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SnoozeEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OptionSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "", "optionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOptionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OptionSelected extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        private final java.lang.String optionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionSelected(java.lang.String str) {
            super("OptionSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionId = str;
        }

        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.optionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionSelected(optionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.optionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionId, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected) other).optionId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected copy(java.lang.String optionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected(optionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected optionSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = optionSelected.optionId;
            }
            return optionSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$BackClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.BackClicked();

        public final int hashCode() {
            return -1334020168;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$ConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConfirmClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConfirmClicked();

        public final int hashCode() {
            return -19947569;
        }

        private ConfirmClicked() {
            super("ConfirmClicked", null);
        }

        public final java.lang.String toString() {
            return "ConfirmClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConfirmClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$ConsentNotChecked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentNotChecked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConsentNotChecked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConsentNotChecked();

        public final int hashCode() {
            return 1709496710;
        }

        private ConsentNotChecked() {
            super("ConsentNotChecked", null);
        }

        public final java.lang.String toString() {
            return "ConsentNotChecked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConsentNotChecked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OnSnoozeSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSnoozeSuccess extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeSuccess INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeSuccess();

        public final int hashCode() {
            return 589773334;
        }

        private OnSnoozeSuccess() {
            super("OnSnoozeSuccess", null);
        }

        public final java.lang.String toString() {
            return "OnSnoozeSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$OnSnoozeError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSnoozeError extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeError INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeError();

        public final int hashCode() {
            return -897305381;
        }

        private OnSnoozeError() {
            super("OnSnoozeError", null);
        }

        public final java.lang.String toString() {
            return "OnSnoozeError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToConfirmation;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransitionToConfirmation extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionToConfirmation(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel) {
            super("TransitionToConfirmation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeConfirmationUiModel, "");
            this.uiModel = snoozeConfirmationUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionToConfirmation(uiModel=");
            sb.append(snoozeConfirmationUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation transitionToConfirmation, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeConfirmationUiModel = transitionToConfirmation.uiModel;
            }
            return transitionToConfirmation.copy(snoozeConfirmationUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToSchedule;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent$TransitionToSchedule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransitionToSchedule extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionToSchedule(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel) {
            super("TransitionToSchedule", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeScheduleUiModel, "");
            this.uiModel = snoozeScheduleUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionToSchedule(uiModel=");
            sb.append(snoozeScheduleUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule transitionToSchedule, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeScheduleUiModel = transitionToSchedule.uiModel;
            }
            return transitionToSchedule.copy(snoozeScheduleUiModel);
        }
    }

    public /* synthetic */ SnoozeEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
