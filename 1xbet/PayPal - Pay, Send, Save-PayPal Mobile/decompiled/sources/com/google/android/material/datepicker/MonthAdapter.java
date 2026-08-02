package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
class MonthAdapter extends android.widget.BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    com.google.android.material.datepicker.CalendarStyle calendarStyle;
    final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    final com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    final com.google.android.material.datepicker.Month month;
    private java.util.Collection<java.lang.Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(5) + com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    MonthAdapter(com.google.android.material.datepicker.Month month, com.google.android.material.datepicker.DateSelector<?> dateSelector, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, com.google.android.material.datepicker.DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    @Override // android.widget.Adapter
    public java.lang.Long getItem(int i) {
        if (i < firstPositionInMonth() || i > lastPositionInMonth()) {
            return null;
        }
        return java.lang.Long.valueOf(this.month.getDay(positionToDay(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.month.daysInWeek;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public android.widget.TextView getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        int i2;
        initializeStyles(viewGroup.getContext());
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.material.R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int firstPositionInMonth = i - firstPositionInMonth();
        if (firstPositionInMonth < 0 || firstPositionInMonth >= this.month.daysInMonth) {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        } else {
            i2 = firstPositionInMonth + 1;
            textView.setTag(this.month);
            textView.setText(java.lang.String.format(textView.getResources().getConfiguration().locale, com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Integer.valueOf(i2)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        java.lang.Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i2);
        return textView;
    }

    public void updateSelectedStates(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView) {
        java.util.Iterator<java.lang.Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        com.google.android.material.datepicker.DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            java.util.Iterator<java.lang.Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    private void updateSelectedStateForDate(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView, long j) {
        if (com.google.android.material.datepicker.Month.create(j).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j);
            updateSelectedState((android.widget.TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j, dayOfMonth);
        }
    }

    private void updateSelectedState(android.widget.TextView textView, long j, int i) {
        boolean z;
        com.google.android.material.datepicker.CalendarItemStyle calendarItemStyle;
        com.google.android.material.datepicker.CalendarItemStyle calendarItemStyle2;
        if (textView == null) {
            return;
        }
        android.content.Context context = textView.getContext();
        java.lang.String dayContentDescription = getDayContentDescription(context, j);
        textView.setContentDescription(dayContentDescription);
        boolean isValid = this.calendarConstraints.getDateValidator().isValid(j);
        if (isValid) {
            textView.setEnabled(true);
            boolean isSelected = isSelected(j);
            textView.setSelected(isSelected);
            if (isSelected) {
                calendarItemStyle2 = this.calendarStyle.selectedDay;
            } else if (isToday(j)) {
                calendarItemStyle2 = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle2 = this.calendarStyle.day;
            }
            calendarItemStyle = calendarItemStyle2;
            z = isSelected;
        } else {
            textView.setEnabled(false);
            z = false;
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        if (this.dayViewDecorator != null && i != -1) {
            int i2 = this.month.year;
            int i3 = this.month.month;
            android.content.res.ColorStateList backgroundColor = this.dayViewDecorator.getBackgroundColor(context, i2, i3, i, isValid, z);
            boolean z2 = z;
            calendarItemStyle.styleItem(textView, backgroundColor, this.dayViewDecorator.getTextColor(context, i2, i3, i, isValid, z2));
            android.graphics.drawable.Drawable compoundDrawableLeft = this.dayViewDecorator.getCompoundDrawableLeft(context, i2, i3, i, isValid, z2);
            android.graphics.drawable.Drawable compoundDrawableTop = this.dayViewDecorator.getCompoundDrawableTop(context, i2, i3, i, isValid, z2);
            android.graphics.drawable.Drawable compoundDrawableRight = this.dayViewDecorator.getCompoundDrawableRight(context, i2, i3, i, isValid, z2);
            boolean z3 = z;
            textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.dayViewDecorator.getCompoundDrawableBottom(context, i2, i3, i, isValid, z3));
            textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i2, i3, i, isValid, z3, dayContentDescription));
            return;
        }
        calendarItemStyle.styleItem(textView);
    }

    private java.lang.String getDayContentDescription(android.content.Context context, long j) {
        return com.google.android.material.datepicker.DateStrings.getDayContentDescription(context, j, isToday(j), isStartOfRange(j), isEndOfRange(j));
    }

    private boolean isToday(long j) {
        return com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis() == j;
    }

    boolean isStartOfRange(long j) {
        for (androidx.core.util.Pair<java.lang.Long, java.lang.Long> pair : this.dateSelector.getSelectedRanges()) {
            if (pair.first != null && pair.first.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    boolean isEndOfRange(long j) {
        for (androidx.core.util.Pair<java.lang.Long, java.lang.Long> pair : this.dateSelector.getSelectedRanges()) {
            if (pair.second != null && pair.second.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    private boolean isSelected(long j) {
        java.util.Iterator<java.lang.Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(j) == com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void initializeStyles(android.content.Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new com.google.android.material.datepicker.CalendarStyle(context);
        }
    }

    int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i) {
        return (i - firstPositionInMonth()) + 1;
    }

    int dayToPosition(int i) {
        return firstPositionInMonth() + (i - 1);
    }

    boolean withinMonth(int i) {
        return i >= firstPositionInMonth() && i <= lastPositionInMonth();
    }

    boolean isFirstInRow(int i) {
        return i % this.month.daysInWeek == 0;
    }

    boolean isLastInRow(int i) {
        return (i + 1) % this.month.daysInWeek == 0;
    }
}
