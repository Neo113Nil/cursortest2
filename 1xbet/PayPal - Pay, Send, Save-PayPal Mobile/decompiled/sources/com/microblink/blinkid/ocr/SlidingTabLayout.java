package com.microblink.blinkid.ocr;

/* loaded from: classes10.dex */
public class SlidingTabLayout extends android.widget.HorizontalScrollView {
    private final com.microblink.blinkid.ocr.SlidingTabStrip Camera2StreamConfigurationMap;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private androidx.viewpager.widget.ViewPager getHighSpeedVideoSizes;

    public class InternalViewPagerListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int getHighSpeedVideoSizes;

        InternalViewPagerListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.getHighSpeedVideoSizes = i;
            if (com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges != null) {
                com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            int childCount = com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getChildCount();
            if (childCount == 0 || i < 0 || i >= childCount) {
                return;
            }
            com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i);
            android.view.View childAt = com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getChildAt(i);
            int width = childAt == null ? 0 : childAt.getWidth();
            com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap(i, (int) ((width + (com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getChildAt(i + 1) != null ? r2.getWidth() : 0)) * f * 0.5f));
            if (com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges != null) {
                com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.getHighSpeedVideoSizes == 0) {
                com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i);
                com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap(i, 0);
            }
            if (com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges != null) {
                com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoFpsRanges.onPageSelected(i);
            }
        }
    }

    public class TabClickListener implements android.view.View.OnClickListener {
        TabClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            for (int i = 0; i < com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getChildCount(); i++) {
                if (view.equals(com.microblink.blinkid.ocr.SlidingTabLayout.this.Camera2StreamConfigurationMap.getChildAt(i))) {
                    com.microblink.blinkid.ocr.SlidingTabLayout.this.getHighSpeedVideoSizes.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    public SlidingTabLayout(android.content.Context context) {
        this(context, null);
    }

    public androidx.viewpager.widget.ViewPager getViewPager() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.viewpager.widget.ViewPager viewPager = this.getHighSpeedVideoSizes;
        if (viewPager != null) {
            Camera2StreamConfigurationMap(viewPager.getCurrentItem(), 0);
        }
    }

    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.getHighSpeedVideoFpsRanges = onPageChangeListener;
    }

    public void setViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        this.Camera2StreamConfigurationMap.removeAllViews();
        this.getHighSpeedVideoSizes = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new com.microblink.blinkid.ocr.SlidingTabLayout.InternalViewPagerListener());
            androidx.viewpager.widget.PagerAdapter adapter = this.getHighSpeedVideoSizes.getAdapter();
            com.microblink.blinkid.ocr.SlidingTabLayout.TabClickListener tabClickListener = new com.microblink.blinkid.ocr.SlidingTabLayout.TabClickListener();
            for (int i = 0; i < adapter.getCount(); i++) {
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setBackgroundColor(0);
                textView.setGravity(17);
                textView.setTextSize(2, 24.0f);
                textView.setTextColor(-7829368);
                int i2 = (int) (getResources().getDisplayMetrics().density * 24.0f);
                int i3 = (int) (getResources().getDisplayMetrics().density * 9.0f);
                textView.setPadding(i2, i3, i2, i3);
                textView.setMinWidth(getWidth() / 3);
                textView.setText(adapter.getPageTitle(i));
                textView.setOnClickListener(tabClickListener);
                if (i == 0) {
                    textView.setTextColor(-1);
                }
                this.Camera2StreamConfigurationMap.addView(textView);
            }
        }
    }

    public SlidingTabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        com.microblink.blinkid.ocr.SlidingTabStrip slidingTabStrip = new com.microblink.blinkid.ocr.SlidingTabStrip(context);
        this.Camera2StreamConfigurationMap = slidingTabStrip;
        slidingTabStrip.setBackgroundColor(0);
        addView(slidingTabStrip, -1, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(int i, int i2) {
        android.view.View childAt;
        int childCount = this.Camera2StreamConfigurationMap.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount || (childAt = this.Camera2StreamConfigurationMap.getChildAt(i)) == null || childAt.getMeasuredWidth() == 0) {
            return;
        }
        int width = (childAt.getWidth() / 2) + ((childAt.getLeft() + i2) - (getWidth() / 2));
        if (width != this.getHighSpeedVideoFpsRangesFor) {
            smoothScrollTo(width, 0);
            this.getHighSpeedVideoFpsRangesFor = width;
        }
    }
}
