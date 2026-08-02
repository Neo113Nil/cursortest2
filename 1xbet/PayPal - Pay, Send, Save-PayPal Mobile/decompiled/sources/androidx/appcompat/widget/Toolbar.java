package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements androidx.core.view.MenuHost {
    private static final java.lang.String TAG = "Toolbar";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private android.window.OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private android.window.OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    android.widget.ImageButton mCollapseButtonView;
    private java.lang.CharSequence mCollapseDescription;
    private android.graphics.drawable.Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private androidx.appcompat.widget.RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    android.view.View mExpandedActionView;
    private androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final java.util.ArrayList<android.view.View> mHiddenViews;
    private android.widget.ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    final androidx.core.view.MenuHostHelper mMenuHostHelper;
    androidx.appcompat.widget.ActionMenuView mMenuView;
    private final androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private android.widget.ImageButton mNavButtonView;
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
    private androidx.appcompat.widget.ActionMenuPresenter mOuterActionMenuPresenter;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private java.util.ArrayList<android.view.MenuItem> mProvidedMenuItems;
    private final java.lang.Runnable mShowOverflowMenuRunnable;
    private java.lang.CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private android.content.res.ColorStateList mSubtitleTextColor;
    private android.widget.TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final java.util.ArrayList<android.view.View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private java.lang.CharSequence mTitleText;
    private int mTitleTextAppearance;
    private android.content.res.ColorStateList mTitleTextColor;
    private android.widget.TextView mTitleTextView;
    private androidx.appcompat.widget.ToolbarWidgetWrapper mWrapper;

    /* loaded from: classes5.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.Toolbar> {
        private int Camera2StreamConfigurationMap;
        private int CoroutineDebuggingKt;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;
        private boolean getOutputMinFrameDurationlomOqCM = false;
        private int getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private int getValidOutputFormatsForInputhNQ4ISI;
        private int isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private int toString;
        private int unwrapAs;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("collapseContentDescription", androidx.appcompat.R.attr.collapseContentDescription);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("collapseIcon", androidx.appcompat.R.attr.collapseIcon);
            this.getHighSpeedVideoSizes = propertyMapper.mapInt("contentInsetEnd", androidx.appcompat.R.attr.contentInsetEnd);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapInt("contentInsetEndWithActions", androidx.appcompat.R.attr.contentInsetEndWithActions);
            this.Camera2StreamConfigurationMap = propertyMapper.mapInt("contentInsetLeft", androidx.appcompat.R.attr.contentInsetLeft);
            this.getHighSpeedVideoSizesFor = propertyMapper.mapInt("contentInsetRight", androidx.appcompat.R.attr.contentInsetRight);
            this.getInputSizeshNQ4ISI = propertyMapper.mapInt("contentInsetStart", androidx.appcompat.R.attr.contentInsetStart);
            this.getInputFormats = propertyMapper.mapInt("contentInsetStartWithNavigation", androidx.appcompat.R.attr.contentInsetStartWithNavigation);
            this.getOutputMinFrameDuration = propertyMapper.mapObject("logo", androidx.appcompat.R.attr.logo);
            this.getOutputFormats = propertyMapper.mapObject("logoDescription", androidx.appcompat.R.attr.logoDescription);
            this.getOutputStallDuration = propertyMapper.mapObject("menu", androidx.appcompat.R.attr.menu);
            this.getOutputSizes = propertyMapper.mapObject("navigationContentDescription", androidx.appcompat.R.attr.navigationContentDescription);
            this.getOutputStallDurationlomOqCM = propertyMapper.mapObject("navigationIcon", androidx.appcompat.R.attr.navigationIcon);
            this.getOutputSizeshNQ4ISI = propertyMapper.mapResourceId("popupTheme", androidx.appcompat.R.attr.popupTheme);
            this.isOutputSupportedForhNQ4ISI = propertyMapper.mapObject("subtitle", androidx.appcompat.R.attr.subtitle);
            this.unwrapAs = propertyMapper.mapObject("title", androidx.appcompat.R.attr.title);
            this.toString = propertyMapper.mapInt("titleMarginBottom", androidx.appcompat.R.attr.titleMarginBottom);
            this.getValidOutputFormatsForInputhNQ4ISI = propertyMapper.mapInt("titleMarginEnd", androidx.appcompat.R.attr.titleMarginEnd);
            this.isOutputSupportedFor = propertyMapper.mapInt("titleMarginStart", androidx.appcompat.R.attr.titleMarginStart);
            this.CoroutineDebuggingKt = propertyMapper.mapInt("titleMarginTop", androidx.appcompat.R.attr.titleMarginTop);
            this.getOutputMinFrameDurationlomOqCM = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.Toolbar toolbar, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getOutputMinFrameDurationlomOqCM) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, toolbar.getCollapseContentDescription());
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, toolbar.getCollapseIcon());
            propertyReader.readInt(this.getHighSpeedVideoSizes, toolbar.getContentInsetEnd());
            propertyReader.readInt(this.getHighSpeedVideoFpsRangesFor, toolbar.getContentInsetEndWithActions());
            propertyReader.readInt(this.Camera2StreamConfigurationMap, toolbar.getContentInsetLeft());
            propertyReader.readInt(this.getHighSpeedVideoSizesFor, toolbar.getContentInsetRight());
            propertyReader.readInt(this.getInputSizeshNQ4ISI, toolbar.getContentInsetStart());
            propertyReader.readInt(this.getInputFormats, toolbar.getContentInsetStartWithNavigation());
            propertyReader.readObject(this.getOutputMinFrameDuration, toolbar.getLogo());
            propertyReader.readObject(this.getOutputFormats, toolbar.getLogoDescription());
            propertyReader.readObject(this.getOutputStallDuration, toolbar.getMenu());
            propertyReader.readObject(this.getOutputSizes, toolbar.getNavigationContentDescription());
            propertyReader.readObject(this.getOutputStallDurationlomOqCM, toolbar.getNavigationIcon());
            propertyReader.readResourceId(this.getOutputSizeshNQ4ISI, toolbar.getPopupTheme());
            propertyReader.readObject(this.isOutputSupportedForhNQ4ISI, toolbar.getSubtitle());
            propertyReader.readObject(this.unwrapAs, toolbar.getTitle());
            propertyReader.readInt(this.toString, toolbar.getTitleMarginBottom());
            propertyReader.readInt(this.getValidOutputFormatsForInputhNQ4ISI, toolbar.getTitleMarginEnd());
            propertyReader.readInt(this.isOutputSupportedFor, toolbar.getTitleMarginStart());
            propertyReader.readInt(this.CoroutineDebuggingKt, toolbar.getTitleMarginTop());
        }
    }

    public Toolbar(android.content.Context context) {
        this(context, null);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.toolbarStyle);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new java.util.ArrayList<>();
        this.mHiddenViews = new java.util.ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.MenuHostHelper(new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.appcompat.widget.Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new java.util.ArrayList<>();
        this.mMenuViewItemClickListener = new androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                if (androidx.appcompat.widget.Toolbar.this.mMenuHostHelper.onMenuItemSelected(menuItem)) {
                    return true;
                }
                if (androidx.appcompat.widget.Toolbar.this.mOnMenuItemClickListener != null) {
                    return androidx.appcompat.widget.Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.Toolbar.this.showOverflowMenu();
            }
        };
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, androidx.appcompat.R.styleable.Toolbar, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.Toolbar, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = obtainStyledAttributes.getInteger(androidx.appcompat.R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = obtainStyledAttributes.getInteger(androidx.appcompat.R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMargin, 0);
        dimensionPixelOffset = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_titleMargins) ? obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.getHighSpeedVideoSizes(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.mContentInsets.Camera2StreamConfigurationMap(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_collapseContentDescription);
        java.lang.CharSequence text = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_title);
        if (!android.text.TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        java.lang.CharSequence text2 = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_subtitle);
        if (!android.text.TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_popupTheme, 0));
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        java.lang.CharSequence text3 = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_navigationContentDescription);
        if (!android.text.TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        java.lang.CharSequence text4 = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_logoDescription);
        if (!android.text.TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.Toolbar_titleTextColor));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_menu)) {
            inflateMenu(obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_menu, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        this.mContentInsets.Camera2StreamConfigurationMap(i == 1);
    }

    public void setLogo(int i) {
        setLogo(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.isOverflowReserved();
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowPending() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    public boolean hideOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void setMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.MenuBuilder peekMenu = this.mMenuView.peekMenu();
        if (peekMenu == menuBuilder) {
            return;
        }
        if (peekMenu != null) {
            peekMenu.removeMenuPresenter(this.mOuterActionMenuPresenter);
            peekMenu.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.Camera2StreamConfigurationMap(true);
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    public boolean isTitleTruncated() {
        android.text.Layout layout;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            android.widget.ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        android.widget.ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public android.graphics.drawable.Drawable getLogo() {
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public java.lang.CharSequence getLogoDescription() {
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new androidx.appcompat.widget.AppCompatImageView(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.getHighSpeedVideoSizes == null) ? false : true;
    }

    public void collapseActionView() {
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.getHighSpeedVideoSizes;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitleText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            android.widget.TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        android.widget.TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            android.widget.TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        android.widget.TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitleTextAppearance(android.content.Context context, int i) {
        this.mTitleTextAppearance = i;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(android.content.Context context, int i) {
        this.mSubtitleTextAppearance = i;
        android.widget.TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        android.widget.TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        android.widget.ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            android.widget.ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public android.view.Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = (androidx.appcompat.view.menu.MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
                    return androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback != null && androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback.onMenuItemSelected(menuBuilder, menuItem);
                }

                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
                    if (!androidx.appcompat.widget.Toolbar.this.mMenuView.isOverflowMenuShowing()) {
                        androidx.appcompat.widget.Toolbar.this.mMenuHostHelper.onPrepareMenu(menuBuilder);
                    }
                    if (androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback != null) {
                        androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback.onMenuModeChange(menuBuilder);
                    }
                }
            });
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.END;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(getContext());
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.Camera2StreamConfigurationMap(i, i2);
    }

    public int getContentInsetStart() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getHighSpeedVideoFpsRangesFor();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.getHighSpeedVideoSizes(i, i2);
    }

    public int getContentInsetLeft() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getHighSpeedVideoFpsRangesFor;
        }
        return 0;
    }

    public int getContentInsetRight() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getHighSpeedVideoFpsRanges;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.MenuBuilder peekMenu;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && (peekMenu = actionMenuView.peekMenu()) != null && peekMenu.hasVisibleItems()) {
            return java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new androidx.appcompat.widget.AppCompatImageButton(getContext(), null, androidx.appcompat.R.attr.toolbarNavigationButtonStyle);
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    android.view.View getNavButtonView() {
        return this.mNavButtonView;
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            androidx.appcompat.widget.AppCompatImageButton appCompatImageButton = new androidx.appcompat.widget.AppCompatImageButton(getContext(), null, androidx.appcompat.R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
            generateDefaultLayoutParams.getHighSpeedVideoSizes = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    androidx.appcompat.widget.Toolbar.this.collapseActionView();
                }
            });
        }
    }

    private void addSystemView(android.view.View view, boolean z) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams2;
        }
        layoutParams.getHighSpeedVideoSizes = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(layoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, layoutParams);
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.Toolbar.SavedState savedState = new androidx.appcompat.widget.Toolbar.SavedState(super.onSaveInstanceState());
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && expandedActionViewMenuPresenter.getHighSpeedVideoSizes != null) {
            savedState.getHighResolutionOutputSizeshNQ4ISI = this.mExpandedMenuPresenter.getHighSpeedVideoSizes.getItemId();
        }
        savedState.Camera2StreamConfigurationMap = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (!(parcelable instanceof androidx.appcompat.widget.Toolbar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.Toolbar.SavedState savedState = (androidx.appcompat.widget.Toolbar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.MenuBuilder peekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        if (savedState.getHighResolutionOutputSizeshNQ4ISI != 0 && this.mExpandedMenuPresenter != null && peekMenu != null && (findItem = peekMenu.findItem(savedState.getHighResolutionOutputSizeshNQ4ISI)) != null) {
            findItem.expandActionView();
        }
        if (savedState.Camera2StreamConfigurationMap) {
            postShowOverflowMenu();
        }
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    private void measureChildConstrained(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i6 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int measureChildCollapseMargins(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = java.lang.Math.max(0, i5) + java.lang.Math.max(0, i6);
        iArr[0] = java.lang.Math.max(0, -i5);
        iArr[1] = java.lang.Math.max(0, -i6);
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = java.lang.Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i5 = android.view.View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = java.lang.Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i5 = android.view.View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = java.lang.Math.max(currentContentInsetStart, i3);
        iArr[isLayoutRtl ? 1 : 0] = java.lang.Math.max(0, currentContentInsetStart - i3);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = java.lang.Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i5 = android.view.View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + java.lang.Math.max(currentContentInsetEnd, i6);
        iArr[!isLayoutRtl ? 1 : 0] = java.lang.Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = java.lang.Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i5 = android.view.View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = java.lang.Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i5 = android.view.View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).getHighSpeedVideoSizes == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i, max2, i2, 0, iArr);
                i4 = java.lang.Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i5 = android.view.View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i12 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth();
            int horizontalMargins = getHorizontalMargins(this.mTitleTextView);
            i7 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i8 = android.view.View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
            i9 = measuredWidth + horizontalMargins;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i9 = java.lang.Math.max(i9, measureChildCollapseMargins(this.mSubtitleTextView, i, max2 + i12, i2, i11 + i7, iArr));
            i7 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i8 = android.view.View.combineMeasuredStates(i8, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max2 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i8), shouldCollapse() ? 0 : android.view.View.resolveSizeAndState(java.lang.Math.max(java.lang.Math.max(i4, i7) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029b A[LOOP:0: B:41:0x0299->B:42:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02bd A[LOOP:1: B:45:0x02bb->B:46:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f5 A[LOOP:2: B:54:0x02f3->B:55:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean shouldLayout;
        boolean shouldLayout2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int size3;
        boolean z2 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(this);
        int min = minimumHeight >= 0 ? java.lang.Math.min(minimumHeight, i4 - i2) : 0;
        if (!shouldLayout(this.mNavButtonView)) {
            i5 = paddingLeft;
        } else {
            if (z2) {
                i6 = layoutChildRight(this.mNavButtonView, i23, iArr, min);
                i5 = paddingLeft;
                if (shouldLayout(this.mCollapseButtonView)) {
                    if (z2) {
                        i6 = layoutChildRight(this.mCollapseButtonView, i6, iArr, min);
                    } else {
                        i5 = layoutChildLeft(this.mCollapseButtonView, i5, iArr, min);
                    }
                }
                if (shouldLayout(this.mMenuView)) {
                    if (z2) {
                        i5 = layoutChildLeft(this.mMenuView, i5, iArr, min);
                    } else {
                        i6 = layoutChildRight(this.mMenuView, i6, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = java.lang.Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = java.lang.Math.max(0, currentContentInsetRight - (i23 - i6));
                int max = java.lang.Math.max(i5, currentContentInsetLeft);
                int min2 = java.lang.Math.min(i6, i23 - currentContentInsetRight);
                if (shouldLayout(this.mExpandedActionView)) {
                    if (z2) {
                        min2 = layoutChildRight(this.mExpandedActionView, min2, iArr, min);
                    } else {
                        max = layoutChildLeft(this.mExpandedActionView, max, iArr, min);
                    }
                }
                if (shouldLayout(this.mLogoView)) {
                    if (z2) {
                        min2 = layoutChildRight(this.mLogoView, min2, iArr, min);
                    } else {
                        max = layoutChildLeft(this.mLogoView, max, iArr, min);
                    }
                }
                shouldLayout = shouldLayout(this.mTitleTextView);
                shouldLayout2 = shouldLayout(this.mSubtitleTextView);
                if (shouldLayout) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                    i7 = paddingRight;
                    i8 = layoutParams.topMargin + this.mTitleTextView.getMeasuredHeight() + layoutParams.bottomMargin;
                }
                if (shouldLayout2) {
                    i9 = width;
                } else {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    i9 = width;
                    i8 += layoutParams2.topMargin + this.mSubtitleTextView.getMeasuredHeight() + layoutParams2.bottomMargin;
                }
                if (!shouldLayout || shouldLayout2) {
                    android.widget.TextView textView = !shouldLayout ? this.mTitleTextView : this.mSubtitleTextView;
                    android.widget.TextView textView2 = !shouldLayout2 ? this.mSubtitleTextView : this.mTitleTextView;
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams3 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView.getLayoutParams();
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams4 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView2.getLayoutParams();
                    boolean z3 = (!shouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (shouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i10 = this.mGravity & 112;
                    i11 = paddingLeft;
                    if (i10 != 48) {
                        i12 = min;
                        paddingTop = getPaddingTop() + layoutParams3.topMargin + this.mTitleMarginTop;
                    } else if (i10 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i12 = min;
                        if (i24 < layoutParams3.topMargin + this.mTitleMarginTop) {
                            i24 = layoutParams3.topMargin + this.mTitleMarginTop;
                        } else {
                            int i25 = (((height - paddingBottom) - i8) - i24) - paddingTop2;
                            if (i25 < layoutParams3.bottomMargin + this.mTitleMarginBottom) {
                                i24 = java.lang.Math.max(0, i24 - ((layoutParams4.bottomMargin + this.mTitleMarginBottom) - i25));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        i12 = min;
                        paddingTop = (((height - paddingBottom) - layoutParams4.bottomMargin) - this.mTitleMarginBottom) - i8;
                    }
                    if (!z2) {
                        int i26 = (z3 ? this.mTitleMarginStart : 0) - iArr[1];
                        min2 -= java.lang.Math.max(0, i26);
                        iArr[1] = java.lang.Math.max(0, -i26);
                        if (shouldLayout) {
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams5 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = min2 - this.mTitleTextView.getMeasuredWidth();
                            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(measuredWidth, paddingTop, min2, measuredHeight);
                            i17 = measuredWidth - this.mTitleMarginEnd;
                            paddingTop = measuredHeight + layoutParams5.bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (shouldLayout2) {
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams6 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                            int i27 = paddingTop + layoutParams6.topMargin;
                            this.mSubtitleTextView.layout(min2 - this.mSubtitleTextView.getMeasuredWidth(), i27, min2, this.mSubtitleTextView.getMeasuredHeight() + i27);
                            i18 = min2 - this.mTitleMarginEnd;
                            int i28 = layoutParams6.bottomMargin;
                        } else {
                            i18 = min2;
                        }
                        if (z3) {
                            min2 = java.lang.Math.min(i17, i18);
                        }
                    } else {
                        if (z3) {
                            i14 = this.mTitleMarginStart;
                            i13 = 0;
                        } else {
                            i13 = 0;
                            i14 = 0;
                        }
                        int i29 = i14 - iArr[i13];
                        max += java.lang.Math.max(i13, i29);
                        iArr[i13] = java.lang.Math.max(i13, -i29);
                        if (shouldLayout) {
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams7 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                            int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + max;
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i15 = measuredWidth2 + this.mTitleMarginEnd;
                            paddingTop = measuredHeight2 + layoutParams7.bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (shouldLayout2) {
                            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams8 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                            int i30 = paddingTop + layoutParams8.topMargin;
                            int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + max;
                            this.mSubtitleTextView.layout(max, i30, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i30);
                            i16 = measuredWidth3 + this.mTitleMarginEnd;
                            int i31 = layoutParams8.bottomMargin;
                        } else {
                            i16 = max;
                        }
                        if (z3) {
                            max = java.lang.Math.max(i15, i16);
                        }
                        addCustomViewsWithGravity(this.mTempViews, 3);
                        size = this.mTempViews.size();
                        i19 = max;
                        for (i20 = i13; i20 < size; i20++) {
                            i19 = layoutChildLeft(this.mTempViews.get(i20), i19, iArr, i12);
                        }
                        int i32 = i12;
                        addCustomViewsWithGravity(this.mTempViews, 5);
                        size2 = this.mTempViews.size();
                        for (i21 = i13; i21 < size2; i21++) {
                            min2 = layoutChildRight(this.mTempViews.get(i21), min2, iArr, i32);
                        }
                        addCustomViewsWithGravity(this.mTempViews, 1);
                        int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
                        i22 = (i11 + (((i9 - i11) - i7) / 2)) - (viewListMeasuredWidth / 2);
                        int i33 = viewListMeasuredWidth + i22;
                        if (i22 >= i19) {
                            i19 = i33 > min2 ? i22 - (i33 - min2) : i22;
                        }
                        size3 = this.mTempViews.size();
                        while (i13 < size3) {
                            i19 = layoutChildLeft(this.mTempViews.get(i13), i19, iArr, i32);
                            i13++;
                        }
                        this.mTempViews.clear();
                        return;
                    }
                } else {
                    i11 = paddingLeft;
                    i12 = min;
                }
                i13 = 0;
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                i19 = max;
                while (i20 < size) {
                }
                int i322 = i12;
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                while (i21 < size2) {
                }
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
                i22 = (i11 + (((i9 - i11) - i7) / 2)) - (viewListMeasuredWidth2 / 2);
                int i332 = viewListMeasuredWidth2 + i22;
                if (i22 >= i19) {
                }
                size3 = this.mTempViews.size();
                while (i13 < size3) {
                }
                this.mTempViews.clear();
                return;
            }
            i5 = layoutChildLeft(this.mNavButtonView, paddingLeft, iArr, min);
        }
        i6 = i23;
        if (shouldLayout(this.mCollapseButtonView)) {
        }
        if (shouldLayout(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = java.lang.Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = java.lang.Math.max(0, currentContentInsetRight2 - (i23 - i6));
        int max2 = java.lang.Math.max(i5, currentContentInsetLeft2);
        int min22 = java.lang.Math.min(i6, i23 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
        }
        if (shouldLayout(this.mLogoView)) {
        }
        shouldLayout = shouldLayout(this.mTitleTextView);
        shouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (shouldLayout) {
        }
        if (shouldLayout2) {
        }
        if (shouldLayout) {
        }
        if (!shouldLayout) {
        }
        if (!shouldLayout2) {
        }
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams32 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView.getLayoutParams();
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams42 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView2.getLayoutParams();
        if (shouldLayout) {
        }
        i10 = this.mGravity & 112;
        i11 = paddingLeft;
        if (i10 != 48) {
        }
        if (!z2) {
        }
    }

    private int getViewListMeasuredWidth(java.util.List<android.view.View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            android.view.View view = list.get(i3);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = java.lang.Math.max(0, i5);
            int max2 = java.lang.Math.max(0, i6);
            int max3 = java.lang.Math.max(0, -i5);
            int max4 = java.lang.Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private int layoutChildLeft(android.view.View view, int i, int[] iArr, int i2) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + java.lang.Math.max(0, i3);
        iArr[0] = java.lang.Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    private int layoutChildRight(android.view.View view, int i, int[] iArr, int i2) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - java.lang.Math.max(0, i3);
        iArr[1] = java.lang.Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    private int getChildTop(android.view.View view, int i) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < layoutParams.topMargin) {
            i3 = layoutParams.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < layoutParams.bottomMargin) {
                i3 = java.lang.Math.max(0, i3 - (layoutParams.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private void addCustomViewsWithGravity(java.util.List<android.view.View> list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.getHighSpeedVideoSizes == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            android.view.View childAt2 = getChildAt(i3);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.getHighSpeedVideoSizes == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private int getChildHorizontalGravity(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private boolean shouldLayout(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int getHorizontalMargins(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int getVerticalMargins(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.appcompat.widget.Toolbar.LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams);
    }

    public androidx.appcompat.widget.DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new androidx.appcompat.widget.ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).getHighSpeedVideoSizes != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    private boolean isChildOrHidden(android.view.View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new androidx.appcompat.widget.RtlSpacingHelper();
        }
    }

    final android.widget.TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    final android.widget.TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    androidx.appcompat.widget.ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    android.content.Context getPopupContext() {
        return this.mPopupContext;
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
        java.util.ArrayList<android.view.MenuItem> arrayList = new java.util.ArrayList<>();
        android.view.Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private void onCreateMenu() {
        android.view.Menu menu = getMenu();
        java.util.ArrayList<android.view.MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        java.util.ArrayList<android.view.MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        java.util.Iterator<android.view.MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    void updateBackInvokedCallbackState() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher d_ = androidx.appcompat.widget.Toolbar.Api33Impl.d_(this);
            boolean z = hasExpandedActionView() && d_ != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = androidx.appcompat.widget.Toolbar.Api33Impl.e_(new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.appcompat.widget.Toolbar.this.collapseActionView();
                        }
                    });
                }
                androidx.appcompat.widget.Toolbar.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(d_, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = d_;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            androidx.appcompat.widget.Toolbar.Api33Impl.Camera2StreamConfigurationMap(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        int getHighSpeedVideoSizes;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighSpeedVideoSizes = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.getHighSpeedVideoSizes = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.getHighSpeedVideoSizes = 0;
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(androidx.appcompat.widget.Toolbar.LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoSizes = layoutParams.getHighSpeedVideoSizes;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoSizes = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.getHighSpeedVideoSizes = 0;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoSizes = 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.Toolbar.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.appcompat.widget.Toolbar.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.Toolbar.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.appcompat.widget.Toolbar.SavedState[i];
            }
        };
        boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
            this.Camera2StreamConfigurationMap = parcel.readInt() != 0;
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
            parcel.writeInt(this.Camera2StreamConfigurationMap ? 1 : 0);
        }
    }

    /* loaded from: classes3.dex */
    class ExpandedActionViewMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
        androidx.appcompat.view.menu.MenuBuilder getHighResolutionOutputSizeshNQ4ISI;
        androidx.appcompat.view.menu.MenuItemImpl getHighSpeedVideoSizes;

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public android.os.Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        }

        ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl;
            androidx.appcompat.view.menu.MenuBuilder menuBuilder2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (menuBuilder2 != null && (menuItemImpl = this.getHighSpeedVideoSizes) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean z) {
            if (this.getHighSpeedVideoSizes != null) {
                androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.getHighResolutionOutputSizeshNQ4ISI;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.getItem(i) == this.getHighSpeedVideoSizes) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            androidx.appcompat.widget.Toolbar.this.ensureCollapseButtonView();
            android.view.ViewParent parent = androidx.appcompat.widget.Toolbar.this.mCollapseButtonView.getParent();
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            androidx.appcompat.widget.Toolbar.this.mExpandedActionView = menuItemImpl.getActionView();
            this.getHighSpeedVideoSizes = menuItemImpl;
            android.view.ViewParent parent2 = androidx.appcompat.widget.Toolbar.this.mExpandedActionView.getParent();
            androidx.appcompat.widget.Toolbar toolbar3 = androidx.appcompat.widget.Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = androidx.appcompat.widget.Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.gravity = (androidx.appcompat.widget.Toolbar.this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
                generateDefaultLayoutParams.getHighSpeedVideoSizes = 2;
                androidx.appcompat.widget.Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                androidx.appcompat.widget.Toolbar toolbar4 = androidx.appcompat.widget.Toolbar.this;
                toolbar4.addView(toolbar4.mExpandedActionView);
            }
            androidx.appcompat.widget.Toolbar.this.removeChildrenForExpandedActionView();
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            if (androidx.appcompat.widget.Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.CollapsibleActionView) {
                ((androidx.appcompat.view.CollapsibleActionView) androidx.appcompat.widget.Toolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            androidx.appcompat.widget.Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            if (androidx.appcompat.widget.Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.CollapsibleActionView) {
                ((androidx.appcompat.view.CollapsibleActionView) androidx.appcompat.widget.Toolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            androidx.appcompat.widget.Toolbar.this.mExpandedActionView = null;
            androidx.appcompat.widget.Toolbar.this.addChildrenForExpandedActionView();
            this.getHighSpeedVideoSizes = null;
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            androidx.appcompat.widget.Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static class Api33Impl {
        private Api33Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj2);
        }

        static void Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
        }

        static android.window.OnBackInvokedDispatcher d_(android.view.View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static android.window.OnBackInvokedCallback e_(final java.lang.Runnable runnable) {
            java.util.Objects.requireNonNull(runnable);
            return new android.window.OnBackInvokedCallback() { // from class: androidx.appcompat.widget.Toolbar$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }
    }
}
