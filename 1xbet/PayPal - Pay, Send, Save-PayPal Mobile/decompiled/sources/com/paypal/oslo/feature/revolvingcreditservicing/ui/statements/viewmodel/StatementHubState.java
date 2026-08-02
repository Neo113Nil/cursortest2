package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "Empty", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementHubState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial();

        public final int hashCode() {
            return 1914268087;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private StatementHubState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
            this.args = statementHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(args=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading loading, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementHubArgs = loading.args;
            }
            return loading.copy(statementHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "items", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "getArgs", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> list) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.args = statementHubArgs;
            this.items = list;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs = this.args;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(args=");
            sb.append(statementHubArgs);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.args.hashCode() * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.args, ready.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ready.items);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready(args, items);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel> component2() {
            return this.items;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementHubArgs = ready.args;
            }
            if ((i & 2) != 0) {
                list = ready.items;
            }
            return ready.copy(statementHubArgs, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
            this.args = statementHubArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(args=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementHubArgs = error.args;
            }
            return error.copy(statementHubArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty();

        public final int hashCode() {
            return -1351444352;
        }

        private Empty() {
            super("Empty", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ StatementHubState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
