package h;

/* loaded from: classes.dex */
public final class V implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3115a;

    public V(androidx.appcompat.widget.SearchView searchView) {
        this.f3115a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
        this.f3115a.o();
        return true;
    }
}
