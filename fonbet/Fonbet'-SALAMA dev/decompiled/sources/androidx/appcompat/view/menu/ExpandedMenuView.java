package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import m.j;
import m.k;
import m.m;
import m.z;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements j, z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8155b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public k f8156a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // m.z
    public final void a(k kVar) {
        this.f8156a = kVar;
    }

    @Override // m.j
    public final boolean b(m mVar) {
        return this.f8156a.q(mVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        b((m) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1726n0 F7 = C1726n0.F(context, attributeSet, f8155b, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(F7.u(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(F7.u(1));
        }
        F7.H();
    }
}
