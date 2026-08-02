package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "DATA", "", "<init>", "()V", "RETURN", "Lkotlin/Function1;", "map", "mapReady", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "isVisible", "Z", "()Z", "Error", "Hidden", "Empty", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Hidden;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class StatementDetailSectionUiState<DATA> {
    public static final int $stable = 0;
    private final boolean isVisible;

    private StatementDetailSectionUiState() {
        this.isVisible = !(this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden);
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error();

        public final int hashCode() {
            return 465338396;
        }

        private Error() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Hidden;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden();

        public final int hashCode() {
            return 1617736214;
        }

        private Hidden() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Hidden";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty();

        public final int hashCode() {
            return 465187681;
        }

        private Empty() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Ready;", "DATA", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/StatementDetailSectionUiState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready<DATA> extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<DATA> {
        public static final int $stable = 0;
        private final DATA data;

        public Ready(DATA data) {
            super(null);
            this.data = data;
        }

        public final DATA getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            DATA data = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(data=");
            sb.append(data);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            DATA data = this.data;
            if (data == null) {
                return 0;
            }
            return data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) other).data);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready<DATA> copy(DATA data) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready<>(data);
        }

        public final DATA component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready ready, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = ready.data;
            }
            return ready.copy(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <RETURN> com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState<RETURN> mapReady(kotlin.jvm.functions.Function1<? super DATA, ? extends RETURN> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready(map.invoke((java.lang.Object) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Ready) this).getData()));
        }
        if ((this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Hidden) || (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Empty) || (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState.Error)) {
            return this;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ StatementDetailSectionUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
