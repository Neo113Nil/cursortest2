package org.betup.ui.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

/* loaded from: classes4.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] ATTRS = {R.attr.textSize, R.attr.textColor};
    private int currentPosition;
    private float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    private final PageListener pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private TabFormatter tabFormatter;
    private int tabPadding;
    private int tabSelectedTextColor;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    public interface IconTabProvider {
        int getPageIconResId(int var1);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.pageListener = new PageListener();
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorColor = ContextCompat.getColor(context, org.betup.R.color.button_gray);
        this.underlineColor = ContextCompat.getColor(context, org.betup.R.color.transparent);
        this.dividerColor = ContextCompat.getColor(context, org.betup.R.color.white);
        this.tabTextColor = ContextCompat.getColor(context, org.betup.R.color.white);
        this.tabTextSize = 12;
        this.shouldExpand = false;
        this.textAllCaps = true;
        this.scrollOffset = 52;
        this.indicatorHeight = 8;
        this.underlineHeight = 2;
        this.dividerPadding = 12;
        this.tabPadding = 24;
        this.dividerWidth = 1;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, this.indicatorHeight, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, this.tabPadding, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, this.tabTextSize, displayMetrics);
        this.tabTypeface = null;
        this.tabTypefaceStyle = 1;
        this.lastScrollX = 5;
        this.tabBackgroundResId = org.betup.R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(0, this.tabTextSize);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, org.betup.R.styleable.PagerSlidingTabStrip);
        this.indicatorColor = obtainStyledAttributes2.getColor(2, this.indicatorColor);
        this.underlineColor = obtainStyledAttributes2.getColor(11, this.underlineColor);
        this.dividerColor = obtainStyledAttributes2.getColor(0, this.dividerColor);
        int color = obtainStyledAttributes2.getColor(10, this.tabTextColor);
        this.tabTextColor = color;
        this.tabSelectedTextColor = obtainStyledAttributes2.getColor(9, color);
        this.indicatorHeight = obtainStyledAttributes2.getDimensionPixelSize(3, this.indicatorHeight);
        this.underlineHeight = obtainStyledAttributes2.getDimensionPixelSize(12, this.underlineHeight);
        this.dividerPadding = obtainStyledAttributes2.getDimensionPixelSize(1, this.dividerPadding);
        this.tabPadding = obtainStyledAttributes2.getDimensionPixelSize(7, this.tabPadding);
        this.tabBackgroundResId = obtainStyledAttributes2.getResourceId(6, this.tabBackgroundResId);
        this.shouldExpand = obtainStyledAttributes2.getBoolean(5, this.shouldExpand);
        this.scrollOffset = obtainStyledAttributes2.getDimensionPixelSize(4, this.scrollOffset);
        this.textAllCaps = obtainStyledAttributes2.getBoolean(8, this.textAllCaps);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.dividerPaint = paint2;
        paint2.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth(this.dividerWidth);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
        setBackgroundColor(ContextCompat.getColor(getContext(), org.betup.R.color.mirageDark));
    }

    public void setViewPager(ViewPager pager) {
        this.pager = pager;
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        pager.setOnPageChangeListener(this.pageListener);
        notifyDataSetChanged();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.delegatePageListener = listener;
    }

    public void setTabFormatter(TabFormatter tabFormatter) {
        this.tabFormatter = tabFormatter;
    }

    public void notifyDataSetChanged() {
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof IconTabProvider) {
                addIconTab(i, ((IconTabProvider) this.pager.getAdapter()).getPageIconResId(i));
            } else {
                addTextTab(i, this.pager.getAdapter().getPageTitle(i).toString());
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.views.PagerSlidingTabStrip.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.currentPosition = pagerSlidingTabStrip.pager.getCurrentItem();
                PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip2.scrollToChild(pagerSlidingTabStrip2.currentPosition, 0);
            }
        });
    }

    private void addTextTab(int position, String title) {
        TextView textView = new TextView(getContext());
        textView.setText(title);
        textView.setGravity(17);
        textView.setSingleLine();
        addTab(position, textView);
    }

    private void addIconTab(int position, int resId) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(resId);
        addTab(position, imageButton);
    }

    private void addTab(final int position, View tab) {
        tab.setFocusable(true);
        tab.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.views.PagerSlidingTabStrip.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                PagerSlidingTabStrip.this.pager.setCurrentItem(position);
            }
        });
        int i = this.tabPadding;
        tab.setPadding(i, 0, i, 0);
        this.tabsContainer.addView(tab, position, this.shouldExpand ? this.expandedTabLayoutParams : this.defaultTabLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTabStyles() {
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setBackgroundResource(this.tabBackgroundResId);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.tabTextSize);
                textView.setTypeface(this.tabTypeface, this.tabTypefaceStyle);
                updateTabsTextColor(i);
                TabFormatter tabFormatter = this.tabFormatter;
                if (tabFormatter != null) {
                    tabFormatter.applyFormat(textView, i);
                }
                if (this.textAllCaps) {
                    textView.setText(textView.getText().toString().toUpperCase(this.locale));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToChild(int position, int offset) {
        if (this.tabCount != 0) {
            int left = this.tabsContainer.getChildAt(position).getLeft() + offset;
            if (position > 0 || offset > 0) {
                left -= this.scrollOffset;
            }
            if (left != this.lastScrollX) {
                this.lastScrollX = left;
                scrollTo(left, 0);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (isInEditMode() || this.tabCount == 0) {
            return;
        }
        int height = getHeight();
        this.rectPaint.setColor(this.indicatorColor);
        View childAt = this.tabsContainer.getChildAt(this.currentPosition);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.currentPositionOffset > 0.0f && (i = this.currentPosition) < this.tabCount - 1) {
            View childAt2 = this.tabsContainer.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.currentPositionOffset;
            left = (left2 * f) + ((1.0f - f) * left);
            right = (right2 * f) + ((1.0f - f) * right);
        }
        float f2 = height;
        canvas.drawRect(left, height - this.indicatorHeight, right, f2, this.rectPaint);
        this.rectPaint.setColor(this.underlineColor);
        canvas.drawRect(0.0f, height - this.underlineHeight, this.tabsContainer.getWidth(), f2, this.rectPaint);
        this.dividerPaint.setColor(this.dividerColor);
        for (int i2 = 0; i2 < this.tabCount - 1; i2++) {
            View childAt3 = this.tabsContainer.getChildAt(i2);
            canvas.drawLine(childAt3.getRight(), this.dividerPadding, childAt3.getRight(), height - this.dividerPadding, this.dividerPaint);
        }
    }

    public void setIndicatorColor(int indicatorColor) {
        this.indicatorColor = indicatorColor;
        invalidate();
    }

    public void setIndicatorColorResource(int resId) {
        this.indicatorColor = getResources().getColor(resId);
        invalidate();
    }

    public int getIndicatorColor() {
        return this.indicatorColor;
    }

    public void setIndicatorHeight(int indicatorLineHeightPx) {
        this.indicatorHeight = indicatorLineHeightPx;
        invalidate();
    }

    public int getIndicatorHeight() {
        return this.indicatorHeight;
    }

    public void setUnderlineColor(int underlineColor) {
        this.underlineColor = underlineColor;
        invalidate();
    }

    public void setUnderlineColorResource(int resId) {
        this.underlineColor = getResources().getColor(resId);
        invalidate();
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
        invalidate();
    }

    public void setDividerColorResource(int resId) {
        this.dividerColor = getResources().getColor(resId);
        invalidate();
    }

    public int getDividerColor() {
        return this.dividerColor;
    }

    public void setUnderlineHeight(int underlineHeightPx) {
        this.underlineHeight = underlineHeightPx;
        invalidate();
    }

    public int getUnderlineHeight() {
        return this.underlineHeight;
    }

    public void setDividerPadding(int dividerPaddingPx) {
        this.dividerPadding = dividerPaddingPx;
        invalidate();
    }

    public int getDividerPadding() {
        return this.dividerPadding;
    }

    public void setScrollOffset(int scrollOffsetPx) {
        this.scrollOffset = scrollOffsetPx;
        invalidate();
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public void setShouldExpand(boolean shouldExpand) {
        this.shouldExpand = shouldExpand;
        requestLayout();
    }

    public boolean getShouldExpand() {
        return this.shouldExpand;
    }

    public boolean isTextAllCaps() {
        return this.textAllCaps;
    }

    public void setAllCaps(boolean textAllCaps) {
        this.textAllCaps = textAllCaps;
    }

    public void setTextSize(int textSizePx) {
        this.tabTextSize = textSizePx;
        updateTabStyles();
    }

    public int getTextSize() {
        return this.tabTextSize;
    }

    public int getTabSelectedTextColor() {
        return this.tabSelectedTextColor;
    }

    public void setTabSelectedTextColor(int tabSelectedTextColor) {
        this.tabSelectedTextColor = tabSelectedTextColor;
        updateTabStyles();
    }

    public void setTextColor(int textColor) {
        if (this.tabSelectedTextColor == this.tabTextColor) {
            this.tabSelectedTextColor = textColor;
        }
        this.tabTextColor = textColor;
        updateTabStyles();
    }

    public void setTextColorResource(int resId) {
        this.tabTextColor = getResources().getColor(resId);
        updateTabStyles();
    }

    public int getTextColor() {
        return this.tabTextColor;
    }

    public void setTypeface(Typeface typeface, int style) {
        this.tabTypeface = typeface;
        this.tabTypefaceStyle = style;
        updateTabStyles();
    }

    public void setTabBackground(int resId) {
        this.tabBackgroundResId = resId;
    }

    public int getTabBackground() {
        return this.tabBackgroundResId;
    }

    public void setTabPaddingLeftRight(int paddingPx) {
        this.tabPadding = paddingPx;
        updateTabStyles();
    }

    public int getTabPaddingLeftRight() {
        return this.tabPadding;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPosition = savedState.currentPosition;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTabsTextColor(int... range) {
        for (int i : range) {
            if (this.tabsContainer.getChildCount() <= i) {
                return;
            }
            TextView textView = (TextView) this.tabsContainer.getChildAt(i);
            if (i == this.currentPosition) {
                textView.setTextColor(this.tabSelectedTextColor);
            } else {
                textView.setTextColor(this.tabTextColor);
            }
        }
    }

    private class PageListener implements ViewPager.OnPageChangeListener {
        private PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            int i = PagerSlidingTabStrip.this.currentPosition;
            PagerSlidingTabStrip.this.currentPosition = position;
            PagerSlidingTabStrip.this.updateTabsTextColor(i, position);
            PagerSlidingTabStrip.this.updateTabStyles();
            PagerSlidingTabStrip.this.currentPositionOffset = positionOffset;
            PagerSlidingTabStrip.this.scrollToChild(position, (int) (r0.tabsContainer.getChildAt(position).getWidth() * positionOffset));
            PagerSlidingTabStrip.this.invalidate();
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
            if (state == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.scrollToChild(pagerSlidingTabStrip.pager.getCurrentItem(), 0);
            }
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrollStateChanged(state);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageSelected(position);
            }
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: org.betup.ui.views.PagerSlidingTabStrip.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        int currentPosition;

        public SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
            this.currentPosition = in.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.currentPosition);
        }
    }
}
