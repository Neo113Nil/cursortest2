package com.zettle.sdk.common.ui.components.pagerindicator;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u000eR\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\u001d\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\"\u0010*\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0016R$\u00104\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u0010\u0016R\u0011\u0010:\u001a\u0002078G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010B\u001a\u00020?8G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020?8G¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010&\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010&R\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010&R\"\u0010N\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010&\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicator;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p0", "", "Camera2StreamConfigurationMap", "(Z)V", "selectedPosition", "dotColor", "resetSelectedDotColor", "(II)V", "", "contentDescription", "setNavigationLeftBtnContentDescription", "(Ljava/lang/String;)V", "setNavigationRightBtnContentDescription", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setupWithViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorAttributes;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorAttributes;", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "hideNavigationCta", "Z", "getHideNavigationCta", "()Z", "setHideNavigationCta", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "maxVisibleDots", "getMaxVisibleDots", "()I", "setMaxVisibleDots", "(I)V", "navLeftContentDescription", "Ljava/lang/String;", "getNavLeftContentDescription", "()Ljava/lang/String;", "setNavLeftContentDescription", "navRightContentDescription", "getNavRightContentDescription", "setNavRightContentDescription", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getPagerIndicatorDotContainer", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "pagerIndicatorDotContainer", "Landroid/widget/HorizontalScrollView;", "getPagerIndicatorDotHorizontalScrollView", "()Landroid/widget/HorizontalScrollView;", "pagerIndicatorDotHorizontalScrollView", "Landroidx/appcompat/widget/AppCompatImageButton;", "getPagerIndicatorNavigatorLeft", "()Landroidx/appcompat/widget/AppCompatImageButton;", "pagerIndicatorNavigatorLeft", "getPagerIndicatorNavigatorRight", "pagerIndicatorNavigatorRight", "Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorVisibleWindow;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorVisibleWindow;", "selectedDotColor", "getSelectedDotColor", "setSelectedDotColor", "getOutputFormats", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", "unselectedDotColor", "getUnselectedDotColor", "setUnselectedDotColor", "getOutputMinFrameDuration", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setViewPager"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OttoPagerIndicator extends androidx.constraintlayout.widget.ConstraintLayout {
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.viewpager.widget.ViewPager.OnPageChangeListener getHighSpeedVideoFpsRangesFor;
    private com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;
    private boolean hideNavigationCta;
    private int maxVisibleDots;
    private java.lang.String navLeftContentDescription;
    private java.lang.String navRightContentDescription;
    private int selectedDotColor;
    private int unselectedDotColor;
    private androidx.viewpager.widget.ViewPager viewPager;

    public static /* synthetic */ boolean $r8$lambda$_ewwF0AV3fXubq25avAwEEDAaYw(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ OttoPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OttoPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.maxVisibleDots = 5;
        this.getInputSizeshNQ4ISI = getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.pager_indicator_dot_default_unselected_diameter);
        this.getHighSpeedVideoSizesFor = getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.pager_indicator_dot_default_selected_diameter);
        this.getOutputFormats = getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.pager_indicator_dot_default_space);
        this.unselectedDotColor = androidx.core.content.res.ResourcesCompat.getColor(getResources(), com.zettle.sdk.common.ui.R.color.borderAction, context.getTheme());
        this.selectedDotColor = androidx.core.content.res.ResourcesCompat.getColor(getResources(), com.zettle.sdk.common.ui.R.color.borderDivider, context.getTheme());
        this.Camera2StreamConfigurationMap = -1;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        this.getHighSpeedVideoSizes = new com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes(obtainStyledAttributes);
        androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.zettle.sdk.common.ui.R.layout.sdk_component_pager_indicator, this);
        com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes ottoPagerIndicatorAttributes = this.getHighSpeedVideoSizes;
        if (ottoPagerIndicatorAttributes == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoPagerIndicatorAttributes = null;
        }
        this.maxVisibleDots = ottoPagerIndicatorAttributes.getMaxVisibleDots();
        this.unselectedDotColor = ottoPagerIndicatorAttributes.getUnselectedDotColor();
        this.selectedDotColor = ottoPagerIndicatorAttributes.getSelectedDotColor();
        setHideNavigationCta(ottoPagerIndicatorAttributes.getHideNavigationCta());
        this.navLeftContentDescription = ottoPagerIndicatorAttributes.getNavLeftContentDescription();
        this.navRightContentDescription = ottoPagerIndicatorAttributes.getNavRightContentDescription();
        int i2 = this.maxVisibleDots;
        int i3 = this.getHighSpeedVideoSizesFor;
        int i4 = this.getOutputFormats;
        int min = java.lang.Math.min(1, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = (i3 * min) + (i4 * 2 * min);
        getPagerIndicatorDotHorizontalScrollView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.$r8$lambda$_ewwF0AV3fXubq25avAwEEDAaYw(view, motionEvent);
            }
        });
        getPagerIndicatorNavigatorLeft().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.$r8$lambda$9RonSwUxBzQyKfMfbbrd3VRtA_E(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this, view);
            }
        });
        getPagerIndicatorNavigatorRight().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.$r8$lambda$KFJD6HQHCFwcpVapWL81rucgc7M(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this, view);
            }
        });
        setNavigationLeftBtnContentDescription(this.navLeftContentDescription);
        setNavigationRightBtnContentDescription(this.navRightContentDescription);
        this.getHighSpeedVideoFpsRangesFor = new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { // from class: com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator$internalPageChangeListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int position) {
                androidx.viewpager.widget.ViewPager viewPager = com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this.getViewPager();
                if ((viewPager != null ? viewPager.getAdapter() : null) == null || com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.access$getTotalNumOfDots(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this) < 0) {
                    return;
                }
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator = com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this;
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.access$updateNavigationBtnStates(ottoPagerIndicator, position, com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.access$getTotalNumOfDots(ottoPagerIndicator));
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.access$animatePageSelected(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator.this, position);
            }
        };
    }

    public final int getMaxVisibleDots() {
        return this.maxVisibleDots;
    }

    public final void setMaxVisibleDots(int i) {
        this.maxVisibleDots = i;
    }

    public final int getUnselectedDotColor() {
        return this.unselectedDotColor;
    }

    public final void setUnselectedDotColor(int i) {
        this.unselectedDotColor = i;
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
    }

    public final boolean getHideNavigationCta() {
        return this.hideNavigationCta;
    }

    public final void setHideNavigationCta(boolean z) {
        this.hideNavigationCta = z;
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getPagerIndicatorNavigatorLeft(), !this.hideNavigationCta);
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getPagerIndicatorNavigatorRight(), !this.hideNavigationCta);
    }

    public final androidx.viewpager.widget.ViewPager getViewPager() {
        return this.viewPager;
    }

    public final void setViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public final android.widget.HorizontalScrollView getPagerIndicatorDotHorizontalScrollView() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.page_indicator_dots_horizontal_scrollview);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (android.widget.HorizontalScrollView) findViewById;
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getPagerIndicatorDotContainer() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.page_indicator_dots_container);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.LinearLayoutCompat) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatImageButton getPagerIndicatorNavigatorLeft() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.page_indicator_navigator_left);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatImageButton) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatImageButton getPagerIndicatorNavigatorRight() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.page_indicator_navigator_right);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatImageButton) findViewById;
    }

    public final java.lang.String getNavLeftContentDescription() {
        return this.navLeftContentDescription;
    }

    public final void setNavLeftContentDescription(java.lang.String str) {
        this.navLeftContentDescription = str;
    }

    public final java.lang.String getNavRightContentDescription() {
        return this.navRightContentDescription;
    }

    public final void setNavRightContentDescription(java.lang.String str) {
        this.navRightContentDescription = str;
    }

    public final void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        androidx.viewpager.widget.PagerAdapter adapter;
        androidx.viewpager.widget.PagerAdapter adapter2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPager, "");
        if (viewPager.getAdapter() != null) {
            this.Camera2StreamConfigurationMap = -1;
            this.viewPager = viewPager;
            if (viewPager != null) {
                android.view.ViewGroup.LayoutParams layoutParams = getPagerIndicatorDotHorizontalScrollView().getLayoutParams();
                androidx.viewpager.widget.ViewPager viewPager2 = this.viewPager;
                int count = (viewPager2 == null || (adapter2 = viewPager2.getAdapter()) == null) ? 0 : adapter2.getCount();
                int i = this.maxVisibleDots;
                int i2 = this.getHighSpeedVideoSizesFor;
                int i3 = this.getOutputFormats;
                int min = java.lang.Math.min(count, i);
                layoutParams.width = (i2 * min) + (i3 * 2 * min);
                getPagerIndicatorDotHorizontalScrollView().setLayoutParams(layoutParams);
                androidx.viewpager.widget.ViewPager viewPager3 = this.viewPager;
                int count2 = (viewPager3 == null || (adapter = viewPager3.getAdapter()) == null) ? 0 : adapter.getCount();
                int currentItem = viewPager.getCurrentItem();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (int i4 = 0; i4 < count2; i4++) {
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
                    com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ottoPagerIndicatorDot = new com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot(context, null, 0, 6, null);
                    ottoPagerIndicatorDot.setSize(this.getHighResolutionOutputSizeshNQ4ISI);
                    ottoPagerIndicatorDot.setUnSelectedDotColor(this.unselectedDotColor);
                    ottoPagerIndicatorDot.setSelectedDotColor(this.selectedDotColor);
                    ottoPagerIndicatorDot.setUnselectedDotDiameterPx(this.getInputSizeshNQ4ISI);
                    getPagerIndicatorDotContainer().addView(ottoPagerIndicatorDot, i4);
                    linkedHashMap.put(java.lang.Integer.valueOf(i4), com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates.NORMAL);
                }
                com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow ottoPagerIndicatorVisibleWindow = new com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow(this.maxVisibleDots, linkedHashMap, this.Camera2StreamConfigurationMap, null, currentItem, null, 40, null);
                this.getHighSpeedVideoFpsRanges = ottoPagerIndicatorVisibleWindow;
                java.util.Map<java.lang.Integer, com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates> totalDots = ottoPagerIndicatorVisibleWindow.getTotalDots();
                if (totalDots != null) {
                    for (java.util.Map.Entry<java.lang.Integer, com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates> entry : totalDots.entrySet()) {
                        android.view.View view = androidx.core.view.ViewGroupKt.get(getPagerIndicatorDotContainer(), entry.getKey().intValue());
                        com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ottoPagerIndicatorDot2 = view instanceof com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ? (com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot) view : null;
                        if (ottoPagerIndicatorDot2 != null) {
                            ottoPagerIndicatorDot2.setState(entry.getValue());
                        }
                    }
                }
                this.Camera2StreamConfigurationMap = currentItem;
                viewPager.removeOnPageChangeListener(this.getHighSpeedVideoFpsRangesFor);
                viewPager.addOnPageChangeListener(this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor.onPageSelected(viewPager.getCurrentItem());
            }
        }
    }

    public final void resetSelectedDotColor(int selectedPosition, int dotColor) {
        this.selectedDotColor = dotColor;
        android.view.View view = androidx.core.view.ViewGroupKt.get(getPagerIndicatorDotContainer(), selectedPosition);
        com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ottoPagerIndicatorDot = view instanceof com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ? (com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot) view : null;
        if (ottoPagerIndicatorDot != null) {
            ottoPagerIndicatorDot.setSelectedDotColor(this.selectedDotColor);
        }
    }

    private final void Camera2StreamConfigurationMap(boolean p0) {
        androidx.viewpager.widget.PagerAdapter adapter;
        androidx.viewpager.widget.ViewPager viewPager = this.viewPager;
        if (viewPager != null) {
            int currentItem = viewPager.getCurrentItem();
            androidx.viewpager.widget.ViewPager viewPager2 = this.viewPager;
            int i = 0;
            int count = (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) ? 0 : adapter.getCount();
            if (p0) {
                if (currentItem < count) {
                    currentItem++;
                }
                i = currentItem;
            } else if (currentItem > 0) {
                i = currentItem - 1;
            }
            viewPager.setCurrentItem(i);
        }
    }

    public final void setNavigationLeftBtnContentDescription(java.lang.String contentDescription) {
        getPagerIndicatorNavigatorLeft().setContentDescription(contentDescription);
    }

    public final void setNavigationRightBtnContentDescription(java.lang.String contentDescription) {
        getPagerIndicatorNavigatorRight().setContentDescription(contentDescription);
    }

    public static /* synthetic */ void $r8$lambda$9RonSwUxBzQyKfMfbbrd3VRtA_E(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoPagerIndicator, "");
        ottoPagerIndicator.Camera2StreamConfigurationMap(false);
    }

    public static /* synthetic */ void $r8$lambda$KFJD6HQHCFwcpVapWL81rucgc7M(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoPagerIndicator, "");
        ottoPagerIndicator.Camera2StreamConfigurationMap(true);
    }

    public static final /* synthetic */ void access$animatePageSelected(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator, int i) {
        java.util.Map<java.lang.Integer, com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates> totalDots;
        com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates value;
        if (ottoPagerIndicator.Camera2StreamConfigurationMap != i) {
            com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow ottoPagerIndicatorVisibleWindow = ottoPagerIndicator.getHighSpeedVideoFpsRanges;
            if (ottoPagerIndicatorVisibleWindow != null) {
                ottoPagerIndicatorVisibleWindow.setCurrentSelectedIndex(i);
            }
            com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow ottoPagerIndicatorVisibleWindow2 = ottoPagerIndicator.getHighSpeedVideoFpsRanges;
            if (ottoPagerIndicatorVisibleWindow2 != null && (totalDots = ottoPagerIndicatorVisibleWindow2.getTotalDots()) != null) {
                for (java.util.Map.Entry<java.lang.Integer, com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDotStates> entry : totalDots.entrySet()) {
                    android.view.View view = androidx.core.view.ViewGroupKt.get(ottoPagerIndicator.getPagerIndicatorDotContainer(), entry.getKey().intValue());
                    com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ottoPagerIndicatorDot = view instanceof com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot ? (com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorDot) view : null;
                    if (ottoPagerIndicatorDot != null && (value = entry.getValue()) != ottoPagerIndicatorDot.getDotStates()) {
                        ottoPagerIndicatorDot.setState(value);
                    }
                }
            }
            ottoPagerIndicator.Camera2StreamConfigurationMap = i;
            com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorVisibleWindow ottoPagerIndicatorVisibleWindow3 = ottoPagerIndicator.getHighSpeedVideoFpsRanges;
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(ottoPagerIndicator.getPagerIndicatorDotHorizontalScrollView(), "scrollX", ottoPagerIndicator.getHighResolutionOutputSizeshNQ4ISI * (ottoPagerIndicatorVisibleWindow3 != null ? ottoPagerIndicatorVisibleWindow3.getNextScrollToIndex() : 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofInt, "");
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(ottoPagerIndicator.getResources().getInteger(android.R.integer.config_shortAnimTime));
            animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            animatorSet.playTogether(ofInt);
            animatorSet.setStartDelay(ottoPagerIndicator.getResources().getInteger(com.zettle.sdk.common.ui.R.integer.animation_duration_100));
            animatorSet.start();
        }
    }

    public static final /* synthetic */ int access$getTotalNumOfDots(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator) {
        androidx.viewpager.widget.PagerAdapter adapter;
        androidx.viewpager.widget.ViewPager viewPager = ottoPagerIndicator.viewPager;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public static final /* synthetic */ void access$updateNavigationBtnStates(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicator ottoPagerIndicator, int i, int i2) {
        ottoPagerIndicator.getPagerIndicatorNavigatorLeft().setEnabled(true);
        ottoPagerIndicator.getPagerIndicatorNavigatorRight().setEnabled(true);
        if (i2 < 2) {
            ottoPagerIndicator.getPagerIndicatorNavigatorLeft().setEnabled(false);
            ottoPagerIndicator.getPagerIndicatorNavigatorRight().setEnabled(false);
            return;
        }
        if (i == 0) {
            ottoPagerIndicator.getPagerIndicatorNavigatorLeft().setEnabled(false);
            ottoPagerIndicator.getPagerIndicatorNavigatorRight().setEnabled(true);
        }
        if (i == i2 - 1) {
            ottoPagerIndicator.getPagerIndicatorNavigatorLeft().setEnabled(true);
            ottoPagerIndicator.getPagerIndicatorNavigatorRight().setEnabled(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoPagerIndicator(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
