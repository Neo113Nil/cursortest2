package com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/intro/viewmodel/DirectDepositIntroUiState;", "", "", "isLoading", "", "toastMessage", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/intro/viewmodel/DirectDepositIntroUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DirectDepositIntroUiState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final java.lang.String toastMessage;

    public DirectDepositIntroUiState(boolean z, java.lang.String str) {
        this.isLoading = z;
        this.toastMessage = str;
    }

    public /* synthetic */ DirectDepositIntroUiState(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getToastMessage() {
        return this.toastMessage;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        java.lang.String str = this.toastMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDepositIntroUiState(isLoading=");
        sb.append(z);
        sb.append(", toastMessage=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str = this.toastMessage;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState directDepositIntroUiState = (com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState) other;
        return this.isLoading == directDepositIntroUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, directDepositIntroUiState.toastMessage);
    }

    public final com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState copy(boolean isLoading, java.lang.String toastMessage) {
        return new com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState(isLoading, toastMessage);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState copy$default(com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState directDepositIntroUiState, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = directDepositIntroUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = directDepositIntroUiState.toastMessage;
        }
        return directDepositIntroUiState.copy(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositIntroUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
