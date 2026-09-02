package h;

/* renamed from: h.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136E implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3060b;

    public /* synthetic */ C0136E(int i2, java.lang.Object obj) {
        this.f3059a = i2;
        this.f3060b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i2, long j2) {
        h.C0142K c0142k;
        switch (this.f3059a) {
            case 0:
                if (i2 != -1 && (c0142k = ((h.AbstractC0140I) this.f3060b).f3069c) != null) {
                    c0142k.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((androidx.appcompat.widget.SearchView) this.f3060b).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
        int i2 = this.f3059a;
    }

    private final void a(android.widget.AdapterView adapterView) {
    }

    private final void b(android.widget.AdapterView adapterView) {
    }
}
