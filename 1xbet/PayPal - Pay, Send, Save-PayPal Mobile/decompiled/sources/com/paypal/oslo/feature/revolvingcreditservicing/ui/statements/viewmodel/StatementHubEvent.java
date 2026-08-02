package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnNavigateBackClick", "OnTryAgainClick", "OnItemClick", "OnLoadStatements", "OnLoadEmptyStatements", "OnLoadStatementsFailed", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnItemClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadEmptyStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadStatementsFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnNavigateBackClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementHubEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
            this.args = statementHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(args=");
            sb.append(statementHubArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementHubArgs = onViewCreated.args;
            }
            return onViewCreated.copy(statementHubArgs);
        }
    }

    private StatementHubEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnNavigateBackClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateBackClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnNavigateBackClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnNavigateBackClick();

        public final int hashCode() {
            return -552727603;
        }

        private OnNavigateBackClick() {
            super("OnNavigateBackClick", null);
        }

        public final java.lang.String toString() {
            return "OnNavigateBackClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnNavigateBackClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnTryAgainClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnTryAgainClick();

        public final int hashCode() {
            return -188416512;
        }

        private OnTryAgainClick() {
            super("OnTryAgainClick", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnTryAgainClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnTryAgainClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnItemClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnItemClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnItemClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnItemClick(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content) {
            super("OnItemClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            this.uiModel = content;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnItemClick(uiModel=");
            sb.append(content);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick) other).uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick onItemClick, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content content, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                content = onItemClick.uiModel;
            }
            return onItemClick.copy(content);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadStatements;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadStatements extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnLoadStatements(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> list) {
            super("OnLoadStatements", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> getItems() {
            return this.items;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadStatements(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements) other).items);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements copy(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements(items);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements onLoadStatements, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onLoadStatements.items;
            }
            return onLoadStatements.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadEmptyStatements;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadEmptyStatements extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadEmptyStatements INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadEmptyStatements();

        public final int hashCode() {
            return 1382804072;
        }

        private OnLoadEmptyStatements() {
            super("OnLoadEmptyStatements", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnLoadEmptyStatements";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadEmptyStatements)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent$OnLoadStatementsFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadStatementsFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed();

        public final int hashCode() {
            return -396274486;
        }

        private OnLoadStatementsFailed() {
            super("OnLoadStatementsFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnLoadStatementsFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ StatementHubEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
