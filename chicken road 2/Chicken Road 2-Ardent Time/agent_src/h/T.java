package h;

/* loaded from: classes.dex */
public final class T implements android.view.View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3113a;

    public T(androidx.appcompat.widget.SearchView searchView) {
        this.f3113a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z2) {
        androidx.appcompat.widget.SearchView searchView = this.f3113a;
        android.view.View.OnFocusChangeListener onFocusChangeListener = searchView.f2054K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
