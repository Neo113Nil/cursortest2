package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
public final class MaterialCalendar<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final java.lang.String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final java.lang.String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private com.google.android.material.datepicker.MaterialCalendar.CalendarSelector calendarSelector;
    private com.google.android.material.datepicker.CalendarStyle calendarStyle;
    private com.google.android.material.datepicker.Month current;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private android.view.View dayFrame;
    private com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    private android.view.View monthNext;
    private android.view.View monthPrev;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private int themeResId;
    private android.view.View yearFrame;
    private androidx.recyclerview.widget.RecyclerView yearSelector;
    static final java.lang.Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    static final java.lang.Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    static final java.lang.Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    static final java.lang.Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    enum CalendarSelector {
        DAY,
        YEAR
    }

    interface OnDayClickListener {
        void onDayClick(long j);
    }

    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(com.google.android.material.datepicker.DateSelector<T> dateSelector, int i, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(com.google.android.material.datepicker.DateSelector<T> dateSelector, int i, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, com.google.android.material.datepicker.DayViewDecorator dayViewDecorator) {
        com.google.android.material.datepicker.MaterialCalendar<T> materialCalendar = new com.google.android.material.datepicker.MaterialCalendar<>();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (com.google.android.material.datepicker.DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (com.google.android.material.datepicker.CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (com.google.android.material.datepicker.DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (com.google.android.material.datepicker.Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i;
        final int i2;
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new com.google.android.material.datepicker.CalendarStyle(contextThemeWrapper);
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.Month start = this.calendarConstraints.getStart();
        if (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = com.google.android.material.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.google.android.material.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        android.view.View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        android.widget.GridView gridView = (android.widget.GridView) inflate.findViewById(com.google.android.material.R.id.mtrl_calendar_days_of_week);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(gridView, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((android.widget.ListAdapter) (firstDayOfWeek > 0 ? new com.google.android.material.datepicker.DaysOfWeekAdapter(firstDayOfWeek) : new com.google.android.material.datepicker.DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.google.android.material.R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new com.google.android.material.datepicker.SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(androidx.recyclerview.widget.RecyclerView.State state, int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getHeight();
                    iArr[1] = com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        com.google.android.material.datepicker.MonthsPagerAdapter monthsPagerAdapter = new com.google.android.material.datepicker.MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (com.google.android.material.datepicker.MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    com.google.android.material.datepicker.MaterialCalendar.this.dateSelector.select(j);
                    java.util.Iterator<com.google.android.material.datepicker.OnSelectionChangedListener<S>> it = com.google.android.material.datepicker.MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged(com.google.android.material.datepicker.MaterialCalendar.this.dateSelector.getSelection());
                    }
                    com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (com.google.android.material.datepicker.MaterialCalendar.this.yearSelector != null) {
                        com.google.android.material.datepicker.MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.google.android.material.R.integer.mtrl_calendar_year_selector_span);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.google.android.material.R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager((android.content.Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new com.google.android.material.datepicker.YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (inflate.findViewById(com.google.android.material.R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, monthsPagerAdapter);
        }
        if (!com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new androidx.recyclerview.widget.PagerSnapHelper().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        return inflate;
    }

    private void setUpForAccessibility() {
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this.recyclerView, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        });
    }

    private androidx.recyclerview.widget.RecyclerView.ItemDecoration createItemDecoration() {
        return new androidx.recyclerview.widget.RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            private final java.util.Calendar startItem = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
            private final java.util.Calendar endItem = com.google.android.material.datepicker.UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
                int width;
                if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.YearGridAdapter) && (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
                    com.google.android.material.datepicker.YearGridAdapter yearGridAdapter = (com.google.android.material.datepicker.YearGridAdapter) recyclerView.getAdapter();
                    androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) recyclerView.getLayoutManager();
                    for (androidx.core.util.Pair<java.lang.Long, java.lang.Long> pair : com.google.android.material.datepicker.MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        if (pair.first != null && pair.second != null) {
                            this.startItem.setTimeInMillis(pair.first.longValue());
                            this.endItem.setTimeInMillis(pair.second.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            android.view.View findViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            android.view.View findViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int spanCount = positionForYear / gridLayoutManager.getSpanCount();
                            int spanCount2 = positionForYear2 / gridLayoutManager.getSpanCount();
                            int i = spanCount;
                            while (i <= spanCount2) {
                                android.view.View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i);
                                if (findViewByPosition3 != null) {
                                    int top = findViewByPosition3.getTop();
                                    int topInset = com.google.android.material.datepicker.MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = findViewByPosition3.getBottom();
                                    int bottomInset = com.google.android.material.datepicker.MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    int left = (i != spanCount || findViewByPosition == null) ? 0 : findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2);
                                    if (i == spanCount2 && findViewByPosition2 != null) {
                                        width = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                    } else {
                                        width = recyclerView.getWidth();
                                    }
                                    canvas.drawRect(left, top + topInset, width, bottom - bottomInset, com.google.android.material.datepicker.MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        };
    }

    final com.google.android.material.datepicker.Month getCurrentMonth() {
        return this.current;
    }

    final com.google.android.material.datepicker.CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    final void setCurrentMonth(com.google.android.material.datepicker.Month month) {
        com.google.android.material.datepicker.MonthsPagerAdapter monthsPagerAdapter = (com.google.android.material.datepicker.MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = java.lang.Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (z && z2) {
            this.recyclerView.scrollToPosition(position - 3);
            postSmoothRecyclerViewScroll(position);
        } else if (z) {
            this.recyclerView.scrollToPosition(position + 3);
            postSmoothRecyclerViewScroll(position);
        } else {
            postSmoothRecyclerViewScroll(position);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    final com.google.android.material.datepicker.CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    static int getDayHeight(android.content.Context context) {
        return context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_height);
    }

    final void setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((com.google.android.material.datepicker.YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    final void toggleVisibleSelector() {
        if (this.calendarSelector == com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR) {
            setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY);
        } else if (this.calendarSelector == com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY) {
            setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR);
        }
    }

    private void addActionsToMonthNavigation(android.view.View view, final com.google.android.material.datepicker.MonthsPagerAdapter monthsPagerAdapter) {
        final com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(com.google.android.material.R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(materialButton, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                java.lang.String string;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (com.google.android.material.datepicker.MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    string = com.google.android.material.datepicker.MaterialCalendar.this.getString(com.google.android.material.R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = com.google.android.material.datepicker.MaterialCalendar.this.getString(com.google.android.material.R.string.mtrl_picker_toggle_to_day_selection);
                }
                accessibilityNodeInfoCompat.setHintText(string);
            }
        });
        android.view.View findViewById = view.findViewById(com.google.android.material.R.id.month_navigation_previous);
        this.monthPrev = findViewById;
        findViewById.setTag(NAVIGATION_PREV_TAG);
        android.view.View findViewById2 = view.findViewById(com.google.android.material.R.id.month_navigation_next);
        this.monthNext = findViewById2;
        findViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(com.google.android.material.R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(com.google.android.material.R.id.mtrl_calendar_day_selector_frame);
        setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
                int findLastVisibleItemPosition;
                if (i < 0) {
                    findLastVisibleItemPosition = com.google.android.material.datepicker.MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition();
                } else {
                    findLastVisibleItemPosition = com.google.android.material.datepicker.MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                }
                com.google.android.material.datepicker.MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(findLastVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(findLastVisibleItemPosition));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }
        });
        materialButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.google.android.material.datepicker.MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        this.monthNext.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                int findFirstVisibleItemPosition = com.google.android.material.datepicker.MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    com.google.android.material.datepicker.MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition));
                }
            }
        });
        this.monthPrev.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                int findLastVisibleItemPosition = com.google.android.material.datepicker.MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    com.google.android.material.datepicker.MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findLastVisibleItemPosition));
                }
            }
        });
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new java.lang.Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // java.lang.Runnable
            public void run() {
                com.google.android.material.datepicker.MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    private static int getDialogPickerHeight(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding);
        return dimensionPixelSize + dimensionPixelOffset + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height) + (com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS * resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_height)) + ((com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_bottom_padding);
    }

    final androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
        return (androidx.recyclerview.widget.LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }
}
