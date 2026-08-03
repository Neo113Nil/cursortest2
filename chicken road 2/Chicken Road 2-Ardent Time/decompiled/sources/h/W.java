package h;

/* loaded from: classes.dex */
public final class W implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3116a;

    public W(androidx.appcompat.widget.SearchView searchView) {
        this.f3116a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i2, long j2) {
        this.f3116a.l(i2);
    }
}
