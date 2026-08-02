package com.paypal.oslo.feature.subscriptions.shared.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToastState;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToast;", "initState", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToast;)V", "", "message", "", "showToast", "(Ljava/lang/String;)V", "clearToast", "()V", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getState", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/UiToast;", "state"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UiToastState {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.subscriptions.shared.domain.UiToast> getHighSpeedVideoFpsRanges;

    public UiToastState(com.paypal.oslo.feature.subscriptions.shared.domain.UiToast uiToast) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiToast, "");
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(uiToast, null, 2, null);
    }

    public /* synthetic */ UiToastState(com.paypal.oslo.feature.subscriptions.shared.domain.UiToast.Hidden hidden, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.UiToast.Hidden.INSTANCE : hidden);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.UiToast getState() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final void showToast(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.subscriptions.shared.domain.UiToast.Shown(message));
    }

    public final void clearToast() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.subscriptions.shared.domain.UiToast.Hidden.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiToastState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
