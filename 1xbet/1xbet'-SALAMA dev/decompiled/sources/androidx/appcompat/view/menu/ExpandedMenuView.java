package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p086m.j;
import p086m.k;
import p086m.m;
import p086m.z;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements j, z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8155b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f8156a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // p086m.z
    public final void a(k kVar) {
        this.f8156a = kVar;
    }

    @Override // p086m.j
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
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, f8155b, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c1017n0F.u(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c1017n0F.u(1));
        }
        c1017n0F.H();
    }
}
