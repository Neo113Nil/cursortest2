package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "message", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "hide", "", "<set-?>", "show$delegate", "Landroidx/compose/runtime/MutableState;", "getShow", "()Z", "setShow", "(Z)V", "show", "message$delegate", "getMessage", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "setMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ToastState {
    public static final int $stable = 0;

    /* renamed from: show$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState show = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState message = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShow() {
        return ((java.lang.Boolean) this.show.getValue()).booleanValue();
    }

    public final void setShow(boolean z) {
        this.show.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
        return (com.paypal.oslo.core.commonui.utils.RefText) this.message.getValue();
    }

    public final void setMessage(com.paypal.oslo.core.commonui.utils.RefText refText) {
        this.message.setValue(refText);
    }

    public final void display(com.paypal.oslo.core.commonui.utils.RefText message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        setMessage(message);
        setShow(true);
    }

    public final void hide() {
        setShow(false);
        setMessage(null);
    }
}
