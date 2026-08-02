package financial.atomic.f;

/* loaded from: classes3.dex */
public final class b extends android.webkit.WebView {

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.transact.Transact f6745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.transact.Transact transact) {
        super(transact.getContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        this.f6745a = transact;
    }

    public final financial.atomic.transact.Transact getTransact() {
        return this.f6745a;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        financial.atomic.transact.Transact.dispatchEvent$transact_release$default(this.f6745a, financial.atomic.transact.Transact.Event.BACK.getValue(), null, 2, null);
        return true;
    }
}
