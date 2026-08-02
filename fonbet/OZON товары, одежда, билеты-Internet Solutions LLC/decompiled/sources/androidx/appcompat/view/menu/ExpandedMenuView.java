package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.b0;

/* loaded from: classes8.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f37330b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private g f37331a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b0 v11 = b0.v(context, attributeSet, f37330b, R.attr.listViewStyle, 0);
        if (v11.s(0)) {
            setBackgroundDrawable(v11.g(0));
        }
        if (v11.s(1)) {
            setDivider(v11.g(1));
        }
        v11.x();
    }

    @Override // androidx.appcompat.view.menu.n
    public final void a(g gVar) {
        this.f37331a = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public final boolean f(i iVar) {
        return this.f37331a.z(iVar, null, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        f((i) getAdapter().getItem(i11));
    }
}
