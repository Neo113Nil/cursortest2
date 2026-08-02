package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015Jp\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b)\u0010\u0015R\u0011\u0010*\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/ReceiverDetailsUiState;", "", "", "firstName", "lastName", "Lkotlin/Function1;", "", "onFirstNameChange", "onLastNameChange", "Lkotlin/Function0;", "onConfirm", "onDismiss", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/p2p/ui/review/state/ReceiverDetailsUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFirstName", "getLastName", "Lkotlin/jvm/functions/Function1;", "getOnFirstNameChange", "getOnLastNameChange", "Lkotlin/jvm/functions/Function0;", "getOnConfirm", "getOnDismiss", "isConfirmEnabled", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReceiverDetailsUiState {
    public static final int $stable = 0;
    private final java.lang.String firstName;
    private final java.lang.String lastName;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFirstNameChange;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onLastNameChange;

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiverDetailsUiState(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.firstName = str;
        this.lastName = str2;
        this.onFirstNameChange = function1;
        this.onLastNameChange = function12;
        this.onConfirm = function0;
        this.onDismiss = function02;
    }

    public /* synthetic */ ReceiverDetailsUiState(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, function1, function12, function0, function02);
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFirstNameChange() {
        return this.onFirstNameChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnLastNameChange() {
        return this.onLastNameChange;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnConfirm() {
        return this.onConfirm;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final boolean isConfirmEnabled() {
        return (kotlin.text.StringsKt.isBlank(this.firstName) || kotlin.text.StringsKt.isBlank(this.lastName)) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onFirstNameChange;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.onLastNameChange;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onConfirm;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onDismiss;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverDetailsUiState(firstName=");
        sb.append(str);
        sb.append(", lastName=");
        sb.append(str2);
        sb.append(", onFirstNameChange=");
        sb.append(function1);
        sb.append(", onLastNameChange=");
        sb.append(function12);
        sb.append(", onConfirm=");
        sb.append(function0);
        sb.append(", onDismiss=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.onFirstNameChange.hashCode()) * 31) + this.onLastNameChange.hashCode()) * 31) + this.onConfirm.hashCode()) * 31) + this.onDismiss.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState receiverDetailsUiState = (com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, receiverDetailsUiState.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, receiverDetailsUiState.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onFirstNameChange, receiverDetailsUiState.onFirstNameChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLastNameChange, receiverDetailsUiState.onLastNameChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onConfirm, receiverDetailsUiState.onConfirm) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDismiss, receiverDetailsUiState.onDismiss);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState copy(java.lang.String firstName, java.lang.String lastName, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFirstNameChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onLastNameChange, kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFirstNameChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLastNameChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConfirm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismiss, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState(firstName, lastName, onFirstNameChange, onLastNameChange, onConfirm, onDismiss);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
        return this.onDismiss;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
        return this.onConfirm;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component4() {
        return this.onLastNameChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component3() {
        return this.onFirstNameChange;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState copy$default(com.paypal.oslo.feature.p2p.ui.review.state.ReceiverDetailsUiState receiverDetailsUiState, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = receiverDetailsUiState.firstName;
        }
        if ((i & 2) != 0) {
            str2 = receiverDetailsUiState.lastName;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            function1 = receiverDetailsUiState.onFirstNameChange;
        }
        kotlin.jvm.functions.Function1 function13 = function1;
        if ((i & 8) != 0) {
            function12 = receiverDetailsUiState.onLastNameChange;
        }
        kotlin.jvm.functions.Function1 function14 = function12;
        if ((i & 16) != 0) {
            function0 = receiverDetailsUiState.onConfirm;
        }
        kotlin.jvm.functions.Function0 function03 = function0;
        if ((i & 32) != 0) {
            function02 = receiverDetailsUiState.onDismiss;
        }
        return receiverDetailsUiState.copy(str, str3, function13, function14, function03, function02);
    }
}
