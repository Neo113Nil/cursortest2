package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Error", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Downloading", "DownloadError", "NoPdfReaderError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$DownloadError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Downloading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$NoPdfReaderError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementDetailsState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Initial();

        public final int hashCode() {
            return -1764879891;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private StatementDetailsState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            this.args = statementDetailsNavigationArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(args=");
            sb.append(statementDetailsNavigationArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading loading, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = loading.args;
            }
            return loading.copy(statementDetailsNavigationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            this.args = statementDetailsNavigationArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(args=");
            sb.append(statementDetailsNavigationArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = error.args;
            }
            return error.copy(statementDetailsNavigationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\u0010\u000f\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u0002`\u000e\u0012\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u000bj\u0002`\u0011\u0012\u0016\u0010\u0015\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bj\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u0002`\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00100\u000bj\u0002`\u0011HÆ\u0003¢\u0006\u0004\b\"\u0010!J \u0010#\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bj\u0002`\u0014HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0080\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u0002`\u000e2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u000bj\u0002`\u00112\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bj\u0002`\u0014HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001fR*\u0010\u000f\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u0002`\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R$\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u000bj\u0002`\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b;\u0010!R*\u0010\u0015\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bj\u0002`\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b<\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;", "headerUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;", "statementSummaryUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "paymentsUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/SpecialFinancingSectionUiState;", "specialFinancingSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/CashBackSummaryUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/CashBackSectionUiState;", "cashbackSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/TransactionSectionUiState;", "transactionsSection", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "component6", "component7", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementHeaderUiModel;", "getHeaderUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementSummaryUiModel;", "getStatementSummaryUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "getPaymentsUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "getSpecialFinancingSection", "getCashbackSection", "getTransactionsSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> cashbackSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel headerUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> specialFinancingSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> transactionsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> statementDetailSectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> statementDetailSectionUiState3) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHeaderUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementSummaryUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentsUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSectionUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSectionUiState2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSectionUiState3, "");
            this.args = statementDetailsNavigationArgs;
            this.headerUiModel = statementHeaderUiModel;
            this.statementSummaryUiModel = statementSummaryUiModel;
            this.paymentsUiModel = paymentsUiModel;
            this.specialFinancingSection = statementDetailSectionUiState;
            this.cashbackSection = statementDetailSectionUiState2;
            this.transactionsSection = statementDetailSectionUiState3;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel getHeaderUiModel() {
            return this.headerUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel getStatementSummaryUiModel() {
            return this.statementSummaryUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel getPaymentsUiModel() {
            return this.paymentsUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> getSpecialFinancingSection() {
            return this.specialFinancingSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> getCashbackSection() {
            return this.cashbackSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> getTransactionsSection() {
            return this.transactionsSection;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel = this.headerUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel = this.statementSummaryUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel = this.paymentsUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> statementDetailSectionUiState = this.specialFinancingSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> statementDetailSectionUiState2 = this.cashbackSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> statementDetailSectionUiState3 = this.transactionsSection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(args=");
            sb.append(statementDetailsNavigationArgs);
            sb.append(", headerUiModel=");
            sb.append(statementHeaderUiModel);
            sb.append(", statementSummaryUiModel=");
            sb.append(statementSummaryUiModel);
            sb.append(", paymentsUiModel=");
            sb.append(paymentsUiModel);
            sb.append(", specialFinancingSection=");
            sb.append(statementDetailSectionUiState);
            sb.append(", cashbackSection=");
            sb.append(statementDetailSectionUiState2);
            sb.append(", transactionsSection=");
            sb.append(statementDetailSectionUiState3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.args.hashCode() * 31) + this.headerUiModel.hashCode()) * 31) + this.statementSummaryUiModel.hashCode()) * 31) + this.paymentsUiModel.hashCode()) * 31) + this.specialFinancingSection.hashCode()) * 31) + this.cashbackSection.hashCode()) * 31) + this.transactionsSection.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.args, ready.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.headerUiModel, ready.headerUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.statementSummaryUiModel, ready.statementSummaryUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentsUiModel, ready.paymentsUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.specialFinancingSection, ready.specialFinancingSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackSection, ready.cashbackSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionsSection, ready.transactionsSection);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel headerUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> specialFinancingSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> cashbackSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<? extends java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> transactionsSection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementSummaryUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentsUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionsSection, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready(args, headerUiModel, statementSummaryUiModel, paymentsUiModel, specialFinancingSection, cashbackSection, transactionsSection);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> component7() {
            return this.transactionsSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.CashBackSummaryUiModel> component6() {
            return this.cashbackSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>> component5() {
            return this.specialFinancingSection;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel getPaymentsUiModel() {
            return this.paymentsUiModel;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel getStatementSummaryUiModel() {
            return this.statementSummaryUiModel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel getHeaderUiModel() {
            return this.headerUiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = ready.args;
            }
            if ((i & 2) != 0) {
                statementHeaderUiModel = ready.headerUiModel;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel2 = statementHeaderUiModel;
            if ((i & 4) != 0) {
                statementSummaryUiModel = ready.statementSummaryUiModel;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel2 = statementSummaryUiModel;
            if ((i & 8) != 0) {
                paymentsUiModel = ready.paymentsUiModel;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel2 = paymentsUiModel;
            if ((i & 16) != 0) {
                statementDetailSectionUiState = ready.specialFinancingSection;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState4 = statementDetailSectionUiState;
            if ((i & 32) != 0) {
                statementDetailSectionUiState2 = ready.cashbackSection;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState5 = statementDetailSectionUiState2;
            if ((i & 64) != 0) {
                statementDetailSectionUiState3 = ready.transactionsSection;
            }
            return ready.copy(statementDetailsNavigationArgs, statementHeaderUiModel2, statementSummaryUiModel2, paymentsUiModel2, statementDetailSectionUiState4, statementDetailSectionUiState5, statementDetailSectionUiState3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Downloading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Downloading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Downloading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
            super("Downloading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            this.args = statementDetailsNavigationArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Downloading(args=");
            sb.append(statementDetailsNavigationArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading downloading, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = downloading.args;
            }
            return downloading.copy(statementDetailsNavigationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$DownloadError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$DownloadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadError(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
            super("DownloadError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            this.args = statementDetailsNavigationArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadError(args=");
            sb.append(statementDetailsNavigationArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError downloadError, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = downloadError.args;
            }
            return downloadError.copy(statementDetailsNavigationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$NoPdfReaderError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$NoPdfReaderError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoPdfReaderError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoPdfReaderError(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
            super("NoPdfReaderError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
            this.args = statementDetailsNavigationArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoPdfReaderError(args=");
            sb.append(statementDetailsNavigationArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError noPdfReaderError, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementDetailsNavigationArgs = noPdfReaderError.args;
            }
            return noPdfReaderError.copy(statementDetailsNavigationArgs);
        }
    }

    public /* synthetic */ StatementDetailsState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
