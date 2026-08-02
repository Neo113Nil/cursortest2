package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnDataLoaded", "OnUiModelInitialized", "OnNoSpecialFinancingPlans", "OnDataLoadFailed", "OnScrollTriggersToLoadMorePromotionalActivities", "OnLoadingMorePromotionalActivities", "OnAddingMorePromotionalActivities", "OnLoadingMorePromotionalActivitiesFailed", "OnClearPaginationError", "OnBackClicked", "OnItemClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnAddingMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnClearPaginationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnLoadingMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnLoadingMorePromotionalActivitiesFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnNoSpecialFinancingPlans;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnScrollTriggersToLoadMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SpecialFinancingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated();

        public final int hashCode() {
            return -2025394146;
        }

        private OnViewCreated() {
            super("OnViewCreated", null);
        }

        public final java.lang.String toString() {
            return "OnViewCreated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated)) {
                return false;
            }
            return true;
        }
    }

    private SpecialFinancingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "page", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingPage, "");
            this.page = specialFinancingPage;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(page=");
            sb.append(specialFinancingPage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) other).page);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                specialFinancingPage = onDataLoaded.page;
            }
            return onDataLoaded.copy(specialFinancingPage);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/uimodel/SpecialFinancingUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "specialFinancingArgs", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/uimodel/SpecialFinancingUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/uimodel/SpecialFinancingUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/uimodel/SpecialFinancingUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnUiModelInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/uimodel/SpecialFinancingUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "getSpecialFinancingArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUiModelInitialized extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUiModelInitialized(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel specialFinancingUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
            super("OnUiModelInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingArgs, "");
            this.uiModel = specialFinancingUiModel;
            this.specialFinancingArgs = specialFinancingArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs getSpecialFinancingArgs() {
            return this.specialFinancingArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel specialFinancingUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs = this.specialFinancingArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUiModelInitialized(uiModel=");
            sb.append(specialFinancingUiModel);
            sb.append(", specialFinancingArgs=");
            sb.append(specialFinancingArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.specialFinancingArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, onUiModelInitialized.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.specialFinancingArgs, onUiModelInitialized.specialFinancingArgs);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingArgs, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized(uiModel, specialFinancingArgs);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs getSpecialFinancingArgs() {
            return this.specialFinancingArgs;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized onUiModelInitialized, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel specialFinancingUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                specialFinancingUiModel = onUiModelInitialized.uiModel;
            }
            if ((i & 2) != 0) {
                specialFinancingArgs = onUiModelInitialized.specialFinancingArgs;
            }
            return onUiModelInitialized.copy(specialFinancingUiModel, specialFinancingArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnNoSpecialFinancingPlans;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNoSpecialFinancingPlans extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnNoSpecialFinancingPlans INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnNoSpecialFinancingPlans();

        public final int hashCode() {
            return -715259002;
        }

        private OnNoSpecialFinancingPlans() {
            super("OnNoSpecialFinancingPlans", null);
        }

        public final java.lang.String toString() {
            return "OnNoSpecialFinancingPlans";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnNoSpecialFinancingPlans)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoadFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoadFailed();

        public final int hashCode() {
            return 880012946;
        }

        private OnDataLoadFailed() {
            super("OnDataLoadFailed", null);
        }

        public final java.lang.String toString() {
            return "OnDataLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnScrollTriggersToLoadMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnScrollTriggersToLoadMorePromotionalActivities extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnScrollTriggersToLoadMorePromotionalActivities INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnScrollTriggersToLoadMorePromotionalActivities();

        public final int hashCode() {
            return 842189656;
        }

        private OnScrollTriggersToLoadMorePromotionalActivities() {
            super("OnScrollTriggersToLoadMorePromotionalActivities", null);
        }

        public final java.lang.String toString() {
            return "OnScrollTriggersToLoadMorePromotionalActivities";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnScrollTriggersToLoadMorePromotionalActivities)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnLoadingMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadingMorePromotionalActivities extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivities INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivities();

        public final int hashCode() {
            return 445138863;
        }

        private OnLoadingMorePromotionalActivities() {
            super("OnLoadingMorePromotionalActivities", null);
        }

        public final java.lang.String toString() {
            return "OnLoadingMorePromotionalActivities";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivities)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JV\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnAddingMorePromotionalActivities;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "expiring", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "paidOff", "", "hasNextPage", "", "nextOffset", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Z", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnAddingMorePromotionalActivities;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getExpiring", "getActive", "getPaidOff", "Z", "getHasNextPage", "Ljava/lang/Integer;", "getNextOffset"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddingMorePromotionalActivities extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> active;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> expiring;
        private final boolean hasNextPage;
        private final java.lang.Integer nextOffset;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> paidOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAddingMorePromotionalActivities(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list2, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list3, boolean z, java.lang.Integer num) {
            super("OnAddingMorePromotionalActivities", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.expiring = list;
            this.active = list2;
            this.paidOff = list3;
            this.hasNextPage = z;
            this.nextOffset = num;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getExpiring() {
            return this.expiring;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getActive() {
            return this.active;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getPaidOff() {
            return this.paidOff;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.lang.Integer getNextOffset() {
            return this.nextOffset;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list = this.expiring;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list2 = this.active;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list3 = this.paidOff;
            boolean z = this.hasNextPage;
            java.lang.Integer num = this.nextOffset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddingMorePromotionalActivities(expiring=");
            sb.append(list);
            sb.append(", active=");
            sb.append(list2);
            sb.append(", paidOff=");
            sb.append(list3);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", nextOffset=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.expiring.hashCode();
            int hashCode2 = this.active.hashCode();
            int hashCode3 = this.paidOff.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.hasNextPage);
            java.lang.Integer num = this.nextOffset;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities onAddingMorePromotionalActivities = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.expiring, onAddingMorePromotionalActivities.expiring) && kotlin.jvm.internal.Intrinsics.areEqual(this.active, onAddingMorePromotionalActivities.active) && kotlin.jvm.internal.Intrinsics.areEqual(this.paidOff, onAddingMorePromotionalActivities.paidOff) && this.hasNextPage == onAddingMorePromotionalActivities.hasNextPage && kotlin.jvm.internal.Intrinsics.areEqual(this.nextOffset, onAddingMorePromotionalActivities.nextOffset);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> expiring, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> active, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> paidOff, boolean hasNextPage, java.lang.Integer nextOffset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiring, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(active, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paidOff, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities(expiring, active, paidOff, hasNextPage, nextOffset);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getNextOffset() {
            return this.nextOffset;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component3() {
            return this.paidOff;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component2() {
            return this.active;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component1() {
            return this.expiring;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities onAddingMorePromotionalActivities, java.util.List list, java.util.List list2, java.util.List list3, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAddingMorePromotionalActivities.expiring;
            }
            if ((i & 2) != 0) {
                list2 = onAddingMorePromotionalActivities.active;
            }
            java.util.List list4 = list2;
            if ((i & 4) != 0) {
                list3 = onAddingMorePromotionalActivities.paidOff;
            }
            java.util.List list5 = list3;
            if ((i & 8) != 0) {
                z = onAddingMorePromotionalActivities.hasNextPage;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                num = onAddingMorePromotionalActivities.nextOffset;
            }
            return onAddingMorePromotionalActivities.copy(list, list4, list5, z2, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnLoadingMorePromotionalActivitiesFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "", "nextOffset", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnLoadingMorePromotionalActivitiesFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getNextOffset"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadingMorePromotionalActivitiesFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        private final int nextOffset;

        public OnLoadingMorePromotionalActivitiesFailed(int i) {
            super("OnLoadingMorePromotionalActivitiesFailed", null);
            this.nextOffset = i;
        }

        public final int getNextOffset() {
            return this.nextOffset;
        }

        public final java.lang.String toString() {
            int i = this.nextOffset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadingMorePromotionalActivitiesFailed(nextOffset=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.nextOffset);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed) && this.nextOffset == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed) other).nextOffset;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed copy(int nextOffset) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed(nextOffset);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNextOffset() {
            return this.nextOffset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed onLoadingMorePromotionalActivitiesFailed, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onLoadingMorePromotionalActivitiesFailed.nextOffset;
            }
            return onLoadingMorePromotionalActivitiesFailed.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnClearPaginationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnClearPaginationError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnClearPaginationError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnClearPaginationError();

        public final int hashCode() {
            return 439897926;
        }

        private OnClearPaginationError() {
            super("OnClearPaginationError", null);
        }

        public final java.lang.String toString() {
            return "OnClearPaginationError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnClearPaginationError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked();

        public final int hashCode() {
            return 839026907;
        }

        private OnBackClicked() {
            super("OnBackClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "", "itemId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent$OnItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getItemId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnItemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent {
        public static final int $stable = 0;
        private final java.lang.String itemId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnItemClicked(java.lang.String str) {
            super("OnItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.itemId = str;
        }

        public final java.lang.String getItemId() {
            return this.itemId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.itemId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnItemClicked(itemId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.itemId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked) other).itemId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked copy(java.lang.String itemId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked(itemId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getItemId() {
            return this.itemId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked onItemClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onItemClicked.itemId;
            }
            return onItemClicked.copy(str);
        }
    }

    public /* synthetic */ SpecialFinancingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
