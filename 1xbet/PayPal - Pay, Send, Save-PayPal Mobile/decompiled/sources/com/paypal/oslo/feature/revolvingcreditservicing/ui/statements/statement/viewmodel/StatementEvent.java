package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnRetryClick", "OnBackClick", "OnOkClick", "OnDownloadSuccess", "OnDownloadFailure", "OnNoPdfReaderError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnBackClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnDownloadFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnDownloadSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnNoPdfReaderError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnOkClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnRetryClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementArgs, "");
            this.args = statementArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(args=");
            sb.append(statementArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                statementArgs = onViewCreated.args;
            }
            return onViewCreated.copy(statementArgs);
        }
    }

    private StatementEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnRetryClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnRetryClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnRetryClick();

        public final int hashCode() {
            return 1799181657;
        }

        private OnRetryClick() {
            super("OnRetryClick", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnRetryClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnRetryClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnBackClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnBackClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnBackClick();

        public final int hashCode() {
            return 1820293160;
        }

        private OnBackClick() {
            super("OnBackClick", null);
        }

        public final java.lang.String toString() {
            return "OnBackClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnBackClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnOkClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOkClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnOkClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnOkClick();

        public final int hashCode() {
            return -941169133;
        }

        private OnOkClick() {
            super("OnOkClick", null);
        }

        public final java.lang.String toString() {
            return "OnOkClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnOkClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnDownloadSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnDownloadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadSuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String filePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDownloadSuccess(java.lang.String str) {
            super("OnDownloadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
        }

        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filePath;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDownloadSuccess(filePath=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filePath.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess) other).filePath);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess copy(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess(filePath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess onDownloadSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDownloadSuccess.filePath;
            }
            return onDownloadSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnDownloadFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDownloadFailure extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadFailure INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadFailure();

        public final int hashCode() {
            return 1235006953;
        }

        private OnDownloadFailure() {
            super("OnDownloadFailure", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnDownloadFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent$OnNoPdfReaderError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNoPdfReaderError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnNoPdfReaderError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnNoPdfReaderError();

        public final int hashCode() {
            return 356249005;
        }

        private OnNoPdfReaderError() {
            super("OnNoPdfReaderError", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnNoPdfReaderError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnNoPdfReaderError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ StatementEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
