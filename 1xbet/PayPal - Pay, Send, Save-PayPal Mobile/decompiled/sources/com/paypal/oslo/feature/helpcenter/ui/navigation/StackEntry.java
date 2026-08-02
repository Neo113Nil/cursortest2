package com.paypal.oslo.feature.helpcenter.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "page", "", "id", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;I)V", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "getPage", "()Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "", "<set-?>", "ready$delegate", "Landroidx/compose/runtime/MutableState;", "getReady", "()Z", "setReady", "(Z)V", "ready"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StackEntry {
    public static final int $stable = 0;
    private final int id;
    private final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage page;

    /* renamed from: ready$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState ready;

    public StackEntry(com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage stackPage, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackPage, "");
        this.page = stackPage;
        this.id = i;
        this.ready = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage getPage() {
        return this.page;
    }

    public final int getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getReady() {
        return ((java.lang.Boolean) this.ready.getValue()).booleanValue();
    }

    public final void setReady(boolean z) {
        this.ready.setValue(java.lang.Boolean.valueOf(z));
    }
}
