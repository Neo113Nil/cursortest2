package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.go0;
import p000.nn0;
import p000.on0;
import p000.oq0;
import p000.rn0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements nn0, go0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k */
    public static final int[] f311k = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: j */
    public on0 f312j;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, f311k, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(oq0VarM3731n.m3735e(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(oq0VarM3731n.m3735e(1));
        }
        oq0VarM3731n.m3742o();
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: a */
    public final boolean mo334a(rn0 rn0Var) {
        return this.f312j.m3713q(rn0Var, null, 0);
    }

    @Override // p000.go0
    /* JADX INFO: renamed from: b */
    public final void mo335b(on0 on0Var) {
        this.f312j = on0Var;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo334a((rn0) getAdapter().getItem(i));
    }
}
