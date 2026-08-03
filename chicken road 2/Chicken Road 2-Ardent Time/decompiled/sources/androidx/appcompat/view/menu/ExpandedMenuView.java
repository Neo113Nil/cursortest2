package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements g.i, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1964a = {android.R.attr.background, android.R.attr.divider};

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        I0.b H2 = I0.b.H(context, attributeSet, f1964a, android.R.attr.listViewStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(H2.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(H2.A(1));
        }
        H2.K();
    }

    @Override // g.i
    public final boolean a(g.k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i2, long j2) {
        throw null;
    }
}
