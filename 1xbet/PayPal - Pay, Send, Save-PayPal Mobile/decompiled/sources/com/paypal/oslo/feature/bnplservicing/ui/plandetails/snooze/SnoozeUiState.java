package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Schedule", "Confirmation", "Submitting", "Error", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Confirmation;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Schedule;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Submitting;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class SnoozeUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SnoozeUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Schedule;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Schedule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeScheduleUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Schedule extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Schedule(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel) {
            super("Schedule", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeScheduleUiModel, "");
            this.uiModel = snoozeScheduleUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Schedule(uiModel=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule schedule, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeScheduleUiModel snoozeScheduleUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeScheduleUiModel = schedule.uiModel;
            }
            return schedule.copy(snoozeScheduleUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Confirmation;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "uiModel", "", "showCheckboxError", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;Z)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Confirmation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "getUiModel", "Z", "getShowCheckboxError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Confirmation extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState {
        public static final int $stable;
        private final boolean showCheckboxError;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirmation(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel, boolean z) {
            super("Confirmation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeConfirmationUiModel, "");
            this.uiModel = snoozeConfirmationUiModel;
            this.showCheckboxError = z;
        }

        public /* synthetic */ Confirmation(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(snoozeConfirmationUiModel, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public final boolean getShowCheckboxError() {
            return this.showCheckboxError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel = this.uiModel;
            boolean z = this.showCheckboxError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Confirmation(uiModel=");
            sb.append(snoozeConfirmationUiModel);
            sb.append(", showCheckboxError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + java.lang.Boolean.hashCode(this.showCheckboxError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation confirmation = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, confirmation.uiModel) && this.showCheckboxError == confirmation.showCheckboxError;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel, boolean showCheckboxError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation(uiModel, showCheckboxError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowCheckboxError() {
            return this.showCheckboxError;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation confirmation, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeConfirmationUiModel = confirmation.uiModel;
            }
            if ((i & 2) != 0) {
                z = confirmation.showCheckboxError;
            }
            return confirmation.copy(snoozeConfirmationUiModel, z);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Submitting;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Submitting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/model/SnoozeConfirmationUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Submitting extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submitting(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel) {
            super("Submitting", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeConfirmationUiModel, "");
            this.uiModel = snoozeConfirmationUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Submitting(uiModel=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting submitting, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.model.SnoozeConfirmationUiModel snoozeConfirmationUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeConfirmationUiModel = submitting.uiModel;
            }
            return submitting.copy(snoozeConfirmationUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error();

        public final int hashCode() {
            return -95614717;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SnoozeUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
