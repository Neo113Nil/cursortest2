package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.utils.DimensionsUtil;

/* loaded from: classes4.dex */
public class NicePagerTabStrip extends LinearLayout implements ViewPager.OnPageChangeListener, View.OnClickListener {
    private int currentPageIndex;
    private int fixedSize;
    private View footer;
    private int footerHeight;
    private LayoutInflater layoutInflater;
    private LinearLayout tabContainer;
    private int tabSpacing;
    private ViewPager viewPager;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float v, int i1) {
    }

    public NicePagerTabStrip(Context context) {
        super(context);
        init(null);
    }

    public NicePagerTabStrip(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public NicePagerTabStrip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.NicePagerTabStrip, 0, 0);
            this.tabSpacing = obtainStyledAttributes.getDimensionPixelSize(2, DimensionsUtil.getPixelsFromDp(getContext(), 8));
            this.fixedSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.footerHeight = obtainStyledAttributes.getDimensionPixelSize(0, DimensionsUtil.getPixelsFromDp(getContext(), 1));
        }
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.layoutInflater = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.nice_pager_tabstrip, (ViewGroup) this, false);
        addView(inflate);
        this.tabContainer = (LinearLayout) inflate.findViewById(R.id.tab_container);
        this.footer = inflate.findViewById(R.id.bottom_header);
        setupFooter();
    }

    public void setViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
        viewPager.addOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public void setFixedTabSize(int size) {
        this.fixedSize = size;
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        ViewPager viewPager = this.viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        setOrientation(1);
        this.tabContainer.removeAllViews();
        int count = this.viewPager.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            View createTab = createTab(this.viewPager.getAdapter().getPageTitle(i).toString());
            createTab.setTag(Integer.valueOf(i));
            createTab.setOnClickListener(this);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            layoutParams.setMarginStart(this.tabSpacing);
            layoutParams.setMarginEnd(this.tabSpacing);
            int i2 = this.fixedSize;
            if (i2 > 0) {
                layoutParams.width = i2;
            }
            createTab.setLayoutParams(layoutParams);
            this.tabContainer.addView(createTab);
            unselectTab(i);
        }
        this.currentPageIndex = this.viewPager.getCurrentItem();
        selectTab(this.viewPager.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        unselectTab(this.currentPageIndex);
        selectTab(i);
        this.currentPageIndex = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v instanceof TextView) {
            this.viewPager.setCurrentItem(((Integer) ((TextView) v).getTag()).intValue(), true);
        }
    }

    private void setupFooter() {
        ViewGroup.LayoutParams layoutParams = this.footer.getLayoutParams();
        layoutParams.height = this.footerHeight;
        this.footer.setLayoutParams(layoutParams);
    }

    private TextView createTab(String title) {
        TextView textView = (TextView) this.layoutInflater.inflate(R.layout.nice_tab_item, (ViewGroup) this.tabContainer, false);
        textView.setText(title);
        return textView;
    }

    private void selectTab(int index) {
        TextView textView = (TextView) this.tabContainer.getChildAt(index);
        textView.setBackgroundResource(R.drawable.nice_tab_selected_shape);
        textView.setTextSize(2, 13.0f);
    }

    private void unselectTab(int index) {
        TextView textView = (TextView) this.tabContainer.getChildAt(index);
        textView.setBackgroundResource(R.drawable.nice_tab_shape_unselected);
        textView.setTextSize(2, 12.0f);
    }
}
