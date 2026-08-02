package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = E.e(null);
        if (s.g(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.haryanvi.netstream.R.id.cancel_button);
            setNextFocusRightId(com.haryanvi.netstream.R.id.confirm_button);
        }
        this.b = s.g(getContext(), com.haryanvi.netstream.R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new q());
    }

    @NonNull
    public final x a() {
        return (x) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final ListAdapter getAdapter() {
        return (x) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((x) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int a;
        int width;
        int a2;
        int width2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        x xVar = (x) super.getAdapter();
        InterfaceC0946d<?> interfaceC0946d = xVar.b;
        w wVar = xVar.a;
        C0945c c0945c = xVar.d;
        int max = Math.max(xVar.a(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(xVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = xVar.getItem(max);
        Long item2 = xVar.getItem(min);
        Iterator<Pair<Long, Long>> it = interfaceC0946d.g().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l = next.first;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.second != null) {
                Long l2 = l;
                long longValue = l2.longValue();
                Long l3 = next.second;
                long longValue2 = l3.longValue();
                if (item == null || item2 == null || l2.longValue() > item2.longValue() || l3.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    wVar = wVar;
                    it = it;
                    xVar = xVar;
                } else {
                    boolean a3 = com.google.android.material.internal.m.a(materialCalendarGridView);
                    long longValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.a;
                    if (longValue < longValue3) {
                        width = max % wVar.d == 0 ? 0 : !a3 ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                        a = max;
                    } else {
                        calendar.setTimeInMillis(longValue);
                        a = xVar.a() + (calendar.get(5) - 1);
                        View b = materialCalendarGridView.b(a);
                        width = (b.getWidth() / 2) + b.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % wVar.d == 0 ? materialCalendarGridView.getWidth() : !a3 ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                        a2 = min;
                    } else {
                        calendar.setTimeInMillis(longValue2);
                        a2 = xVar.a() + (calendar.get(5) - 1);
                        View b2 = materialCalendarGridView.b(a2);
                        width2 = (b2.getWidth() / 2) + b2.getLeft();
                    }
                    int itemId = (int) xVar.getItemId(a);
                    Iterator<Pair<Long, Long>> it2 = it;
                    w wVar2 = wVar;
                    int itemId2 = (int) xVar.getItemId(a2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        x xVar2 = xVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View b3 = materialCalendarGridView.b(numColumns);
                        int top = b3.getTop() + c0945c.a.a.top;
                        int i3 = itemId2;
                        int bottom = b3.getBottom() - c0945c.a.a.bottom;
                        if (a3) {
                            int i4 = a2 > numColumns2 ? 0 : width2;
                            int width3 = numColumns > a ? getWidth() : width;
                            i = i4;
                            i2 = width3;
                        } else {
                            i = numColumns > a ? 0 : width;
                            i2 = a2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, i2, bottom, c0945c.h);
                        itemId++;
                        materialCalendarGridView = this;
                        xVar = xVar2;
                        itemId2 = i3;
                    }
                    materialCalendarGridView = this;
                    wVar = wVar2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((x) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((x) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((x) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((x) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((x) super.getAdapter()).a()) {
            super.setSelection(((x) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (x) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof x)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), x.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
