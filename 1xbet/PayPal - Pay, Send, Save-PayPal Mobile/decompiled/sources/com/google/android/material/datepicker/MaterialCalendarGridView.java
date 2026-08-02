package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(android.widget.ListAdapter listAdapter) {
        setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(android.content.Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        if (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(com.google.android.material.R.id.cancel_button);
            setNextFocusRightId(com.google.android.material.R.id.confirm_button);
        }
        this.nestedScrollable = com.google.android.material.datepicker.MaterialDatePicker.isNestedScrollable(getContext());
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.ListAdapter getAdapter2() {
        return (com.google.android.material.datepicker.MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(android.widget.ListAdapter listAdapter) {
        if (!(listAdapter instanceof com.google.android.material.datepicker.MonthAdapter)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s must have its Adapter set to a %2$s", com.google.android.material.datepicker.MaterialCalendarGridView.class.getCanonicalName(), com.google.android.material.datepicker.MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int width;
        int i;
        int left;
        int left2;
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        com.google.android.material.datepicker.MonthAdapter adapter = getAdapter();
        com.google.android.material.datepicker.DateSelector<?> dateSelector = adapter.dateSelector;
        com.google.android.material.datepicker.CalendarStyle calendarStyle = adapter.calendarStyle;
        int max = java.lang.Math.max(adapter.firstPositionInMonth(), getFirstVisiblePosition());
        int min = java.lang.Math.min(adapter.lastPositionInMonth(), getLastVisiblePosition());
        java.lang.Long item = adapter.getItem(max);
        java.lang.Long item2 = adapter.getItem(min);
        java.util.Iterator<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            androidx.core.util.Pair<java.lang.Long, java.lang.Long> next = it.next();
            if (next.first != null && next.second != null) {
                long longValue = next.first.longValue();
                long longValue2 = next.second.longValue();
                if (!skipMonth(item, item2, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2))) {
                    boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
                    if (longValue < item.longValue()) {
                        if (adapter.isFirstInRow(max)) {
                            left2 = 0;
                        } else if (!isLayoutRtl) {
                            left2 = materialCalendarGridView.getChildAtPosition(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.getChildAtPosition(max - 1).getLeft();
                        }
                        horizontalMidPoint = left2;
                        dayToPosition = max;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                        dayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter.isLastInRow(min)) {
                            left = getWidth();
                        } else if (!isLayoutRtl) {
                            left = materialCalendarGridView.getChildAtPosition(min).getRight();
                        } else {
                            left = materialCalendarGridView.getChildAtPosition(min).getLeft();
                        }
                        horizontalMidPoint2 = left;
                        dayToPosition2 = min;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                        dayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(dayToPosition);
                    int i2 = max;
                    int i3 = min;
                    int itemId2 = (int) adapter.getItemId(dayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        android.view.View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                        int top = childAtPosition.getTop();
                        int topInset = calendarStyle.day.getTopInset();
                        int bottom = childAtPosition.getBottom();
                        com.google.android.material.datepicker.MonthAdapter monthAdapter = adapter;
                        int bottomInset = calendarStyle.day.getBottomInset();
                        if (!isLayoutRtl) {
                            i = numColumns > dayToPosition ? 0 : horizontalMidPoint;
                            width = dayToPosition2 > numColumns2 ? getWidth() : horizontalMidPoint2;
                        } else {
                            int i4 = dayToPosition2 > numColumns2 ? 0 : horizontalMidPoint2;
                            width = numColumns > dayToPosition ? getWidth() : horizontalMidPoint;
                            i = i4;
                        }
                        canvas.drawRect(i, top + topInset, width, bottom - bottomInset, calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    max = i2;
                    min = i3;
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.nestedScrollable) {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    private void gainFocus(int i, android.graphics.Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private android.view.View getChildAtPosition(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static boolean skipMonth(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    private static int horizontalMidPoint(android.view.View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
