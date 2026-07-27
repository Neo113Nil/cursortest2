package androidx.appcompat.view.menu;

import A0.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC1068i;
import k.MenuItemC1070k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1068i, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1904a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j I3 = j.I(context, attributeSet, f1904a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) I3.f67c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(I3.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(I3.A(1));
        }
        I3.L();
    }

    @Override // k.InterfaceC1068i
    public final boolean a(MenuItemC1070k menuItemC1070k) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        throw null;
    }
}
