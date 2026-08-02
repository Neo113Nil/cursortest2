package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadData", "Error", "DataLoaded", "BackPressed", "NavigateToPlanDetail", "NavigateToVirtualCardOverview", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToPlanDetail;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToVirtualCardOverview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PlanListEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PlanListEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadData extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData();

        public final int hashCode() {
            return 1149245933;
        }

        private LoadData() {
            super("LoadData", null);
        }

        public final java.lang.String toString() {
            return "LoadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error();

        public final int hashCode() {
            return 281587435;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListUiModel, "");
            this.model = planListUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(model=");
            sb.append(planListUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planListUiModel = dataLoaded.model;
            }
            return dataLoaded.copy(planListUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed();

        public final int hashCode() {
            return -519396386;
        }

        private BackPressed() {
            super("BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToPlanDetail;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToPlanDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPlanDetail extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPlanDetail(java.lang.String str) {
            super("NavigateToPlanDetail", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPlanDetail(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail navigateToPlanDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPlanDetail.creditAccountId;
            }
            return navigateToPlanDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent$NavigateToVirtualCardOverview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverview extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToVirtualCardOverview(java.lang.String str) {
            super("NavigateToVirtualCardOverview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToVirtualCardOverview(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview navigateToVirtualCardOverview, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToVirtualCardOverview.creditAccountId;
            }
            return navigateToVirtualCardOverview.copy(str);
        }
    }

    public /* synthetic */ PlanListEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
