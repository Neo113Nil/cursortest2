package androidx.appcompat.view.menu;

import B4.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.h;
import k.j;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4091a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i M5 = i.M(context, attributeSet, f4091a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) M5.f312c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(M5.F(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(M5.F(1));
        }
        M5.P();
    }

    @Override // k.h
    public final boolean a(j jVar) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
