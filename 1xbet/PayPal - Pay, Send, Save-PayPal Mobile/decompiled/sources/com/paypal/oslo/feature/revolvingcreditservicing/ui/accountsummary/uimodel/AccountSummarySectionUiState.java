package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0002\u0010\u0006*\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e\u0082\u0001\u0004\u0014\u0015\u0016\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "DATA", "ERROR", "", "<init>", "()V", "RETURN", "Lkotlin/Function1;", "map", "mapReady", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "isVisible", "Z", "()Z", "isRedirectionButtonVisible", "Hidden", "Empty", "Error", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Hidden;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AccountSummarySectionUiState<DATA, ERROR> {
    public static final int $stable = 0;
    private final boolean isRedirectionButtonVisible;
    private final boolean isVisible;

    private AccountSummarySectionUiState() {
        boolean z = true;
        this.isVisible = !(this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden);
        if (!(this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) && !(this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error)) {
            z = false;
        }
        this.isRedirectionButtonVisible = z;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: isRedirectionButtonVisible, reason: from getter */
    public final boolean getIsRedirectionButtonVisible() {
        return this.isRedirectionButtonVisible;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Hidden;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden();

        public final int hashCode() {
            return 769726659;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Empty;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty();

        public final int hashCode() {
            return -1778924780;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Error;", "ERROR", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "error", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error<ERROR> extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState {
        public static final int $stable = 0;
        private final ERROR error;

        public Error(ERROR error) {
            super(null);
            this.error = error;
        }

        public /* synthetic */ Error(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }

        public final ERROR getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            ERROR error = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(error);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            ERROR error = this.error;
            if (error == null) {
                return 0;
            }
            return error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error<ERROR> copy(ERROR error) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error<>(error);
        }

        public final ERROR component1() {
            return this.error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error error, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = error.error;
            }
            return error.copy(obj);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Error() {
            this(r0, 1, r0);
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Ready;", "DATA", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready<DATA> extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState {
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) other).data);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready<DATA> copy(DATA data) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready<>(data);
        }

        public final DATA component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready ready, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = ready.data;
            }
            return ready.copy(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <RETURN> com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<RETURN, ERROR> mapReady(kotlin.jvm.functions.Function1<? super DATA, ? extends RETURN> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(map.invoke((java.lang.Object) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) this).getData()));
        }
        if ((this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) || (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden) || (this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty)) {
            return this;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ AccountSummarySectionUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
