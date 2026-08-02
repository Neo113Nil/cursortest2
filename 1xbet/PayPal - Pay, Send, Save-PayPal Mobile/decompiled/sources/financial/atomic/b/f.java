package financial.atomic.b;

/* loaded from: classes3.dex */
public final class f extends androidx.view.OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.transact.activity.TransactActivity f6738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.transact.activity.TransactActivity transactActivity) {
        super(true);
        this.f6738a = transactActivity;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        boolean a2;
        a2 = this.f6738a.a();
        if (a2) {
            return;
        }
        setEnabled(false);
        this.f6738a.getOnBackPressedDispatcher().onBackPressed();
        setEnabled(true);
    }
}
