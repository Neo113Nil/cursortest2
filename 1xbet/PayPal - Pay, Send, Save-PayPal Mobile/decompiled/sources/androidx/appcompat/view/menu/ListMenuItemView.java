package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster {
    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    private android.widget.ImageView getHighResolutionOutputSizeshNQ4ISI;
    private android.widget.LinearLayout getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private android.widget.CheckBox getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private androidx.appcompat.view.menu.MenuItemImpl getInputFormats;
    private android.view.LayoutInflater getInputSizeshNQ4ISI;
    private android.widget.ImageView getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private android.graphics.drawable.Drawable getOutputSizes;
    private android.widget.RadioButton getOutputSizeshNQ4ISI;
    private android.widget.TextView getOutputStallDuration;
    private android.widget.ImageView getOutputStallDurationlomOqCM;
    private android.widget.TextView getValidOutputFormatsForInputhNQ4ISI;
    private android.content.Context isOutputSupportedFor;

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, androidx.appcompat.R.styleable.MenuView, i, 0);
        this.Camera2StreamConfigurationMap = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.MenuView_android_itemBackground);
        this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.MenuView_android_itemTextAppearance, -1);
        this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuView_preserveIconSpacing, false);
        this.isOutputSupportedFor = context;
        this.getOutputSizes = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.MenuView_subMenuArrow);
        android.content.res.TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, androidx.appcompat.R.attr.dropDownListViewStyle, 0);
        this.getOutputMinFrameDuration = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.Camera2StreamConfigurationMap);
        android.widget.TextView textView = (android.widget.TextView) findViewById(androidx.appcompat.R.id.title);
        this.getValidOutputFormatsForInputhNQ4ISI = textView;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i != -1) {
            textView.setTextAppearance(this.isOutputSupportedFor, i);
        }
        this.getOutputStallDuration = (android.widget.TextView) findViewById(androidx.appcompat.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.submenuarrow);
        this.getOutputStallDurationlomOqCM = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.getOutputSizes);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.group_divider);
        this.getHighSpeedVideoFpsRanges = (android.widget.LinearLayout) findViewById(androidx.appcompat.R.id.content);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        java.lang.CharSequence title;
        boolean z;
        android.widget.ImageView imageView;
        this.getInputFormats = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (prefersCondensedTitle()) {
            title = menuItemImpl.getTitleCondensed();
        } else {
            title = menuItemImpl.getTitle();
        }
        setTitle(title);
        setCheckable(menuItemImpl.isCheckable());
        if (menuItemImpl.getHighSpeedVideoFpsRanges.isShortcutsVisible()) {
            if ((menuItemImpl.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl.getHighSpeedVideoSizes : menuItemImpl.Camera2StreamConfigurationMap) != 0) {
                z = true;
                setShortcut(z, !menuItemImpl.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl.getHighSpeedVideoSizes : menuItemImpl.Camera2StreamConfigurationMap);
                setIcon(menuItemImpl.getIcon());
                setEnabled(menuItemImpl.isEnabled());
                boolean hasSubMenu = menuItemImpl.hasSubMenu();
                imageView = this.getOutputStallDurationlomOqCM;
                if (imageView != null) {
                    imageView.setVisibility(hasSubMenu ? 0 : 8);
                }
                setContentDescription(menuItemImpl.getContentDescription());
            }
        }
        z = false;
        setShortcut(z, !menuItemImpl.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl.getHighSpeedVideoSizes : menuItemImpl.Camera2StreamConfigurationMap);
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        boolean hasSubMenu2 = menuItemImpl.hasSubMenu();
        imageView = this.getOutputStallDurationlomOqCM;
        if (imageView != null) {
        }
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizesFor = z;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            this.getValidOutputFormatsForInputhNQ4ISI.setText(charSequence);
            if (this.getValidOutputFormatsForInputhNQ4ISI.getVisibility() != 0) {
                this.getValidOutputFormatsForInputhNQ4ISI.setVisibility(0);
                return;
            }
            return;
        }
        if (this.getValidOutputFormatsForInputhNQ4ISI.getVisibility() != 8) {
            this.getValidOutputFormatsForInputhNQ4ISI.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.getInputFormats;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z && this.getOutputSizeshNQ4ISI == null && this.getHighSpeedVideoSizes == null) {
            return;
        }
        if (this.getInputFormats.isExclusiveCheckable()) {
            if (this.getOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            compoundButton = this.getOutputSizeshNQ4ISI;
            view = this.getHighSpeedVideoSizes;
        } else {
            if (this.getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes();
            }
            compoundButton = this.getHighSpeedVideoSizes;
            view = this.getOutputSizeshNQ4ISI;
        }
        if (z) {
            compoundButton.setChecked(this.getInputFormats.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox = this.getHighSpeedVideoSizes;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        android.widget.RadioButton radioButton = this.getOutputSizeshNQ4ISI;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        android.widget.CompoundButton compoundButton;
        if (this.getInputFormats.isExclusiveCheckable()) {
            if (this.getOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            compoundButton = this.getOutputSizeshNQ4ISI;
        } else {
            if (this.getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes();
            }
            compoundButton = this.getHighSpeedVideoSizes;
        }
        compoundButton.setChecked(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setShortcut(boolean z, char c) {
        int i;
        java.lang.String obj;
        if (z) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.getInputFormats;
            if (menuItemImpl.getHighSpeedVideoFpsRanges.isShortcutsVisible()) {
                if ((menuItemImpl.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl.getHighSpeedVideoSizes : menuItemImpl.Camera2StreamConfigurationMap) != 0) {
                    i = 0;
                    if (i == 0) {
                        android.widget.TextView textView = this.getOutputStallDuration;
                        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = this.getInputFormats;
                        char c2 = menuItemImpl2.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl2.getHighSpeedVideoSizes : menuItemImpl2.Camera2StreamConfigurationMap;
                        if (c2 == 0) {
                            obj = "";
                        } else {
                            android.content.res.Resources resources = menuItemImpl2.getHighSpeedVideoFpsRanges.getContext().getResources();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            if (android.view.ViewConfiguration.get(menuItemImpl2.getHighSpeedVideoFpsRanges.getContext()).hasPermanentMenuKey()) {
                                sb.append(resources.getString(androidx.appcompat.R.string.abc_prepend_shortcut_label));
                            }
                            int i2 = menuItemImpl2.getHighSpeedVideoFpsRanges.isQwertyMode() ? menuItemImpl2.getHighResolutionOutputSizeshNQ4ISI : menuItemImpl2.getInputSizeshNQ4ISI;
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 65536, resources.getString(androidx.appcompat.R.string.abc_menu_meta_shortcut_label));
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 4096, resources.getString(androidx.appcompat.R.string.abc_menu_ctrl_shortcut_label));
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 2, resources.getString(androidx.appcompat.R.string.abc_menu_alt_shortcut_label));
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 1, resources.getString(androidx.appcompat.R.string.abc_menu_shift_shortcut_label));
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 4, resources.getString(androidx.appcompat.R.string.abc_menu_sym_shortcut_label));
                            androidx.appcompat.view.menu.MenuItemImpl.Camera2StreamConfigurationMap(sb, i2, 8, resources.getString(androidx.appcompat.R.string.abc_menu_function_shortcut_label));
                            if (c2 == '\b') {
                                sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_delete_shortcut_label));
                            } else if (c2 == '\n') {
                                sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_enter_shortcut_label));
                            } else if (c2 == ' ') {
                                sb.append(resources.getString(androidx.appcompat.R.string.abc_menu_space_shortcut_label));
                            } else {
                                sb.append(c2);
                            }
                            obj = sb.toString();
                        }
                        textView.setText(obj);
                    }
                    if (this.getOutputStallDuration.getVisibility() == i) {
                        this.getOutputStallDuration.setVisibility(i);
                        return;
                    }
                    return;
                }
            }
        }
        i = 8;
        if (i == 0) {
        }
        if (this.getOutputStallDuration.getVisibility() == i) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        boolean z = this.getInputFormats.shouldShowIcon() || this.getHighSpeedVideoFpsRangesFor;
        if (z || this.getHighSpeedVideoSizesFor) {
            android.widget.ImageView imageView = this.getOutputFormats;
            if (imageView == null && drawable == null && !this.getHighSpeedVideoSizesFor) {
                return;
            }
            if (imageView == null) {
                if (this.getInputSizeshNQ4ISI == null) {
                    this.getInputSizeshNQ4ISI = android.view.LayoutInflater.from(getContext());
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.getInputSizeshNQ4ISI.inflate(androidx.appcompat.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
                this.getOutputFormats = imageView2;
                android.widget.LinearLayout linearLayout = this.getHighSpeedVideoFpsRanges;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable != null || this.getHighSpeedVideoSizesFor) {
                android.widget.ImageView imageView3 = this.getOutputFormats;
                if (!z) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.getOutputFormats.getVisibility() != 0) {
                    this.getOutputFormats.setVisibility(0);
                    return;
                }
                return;
            }
            this.getOutputFormats.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.getOutputFormats != null && this.getHighSpeedVideoSizesFor) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.getOutputFormats.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setGroupDividerEnabled(boolean z) {
        android.widget.ImageView imageView = this.getHighResolutionOutputSizeshNQ4ISI;
        if (imageView != null) {
            imageView.setVisibility((this.getOutputMinFrameDuration || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.getHighResolutionOutputSizeshNQ4ISI;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.getHighResolutionOutputSizeshNQ4ISI.getLayoutParams();
        rect.top += this.getHighResolutionOutputSizeshNQ4ISI.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private void getHighSpeedVideoSizes() {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = android.view.LayoutInflater.from(getContext());
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) this.getInputSizeshNQ4ISI.inflate(androidx.appcompat.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
        this.getHighSpeedVideoSizes = checkBox;
        android.widget.LinearLayout linearLayout = this.getHighSpeedVideoFpsRanges;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = android.view.LayoutInflater.from(getContext());
        }
        android.widget.RadioButton radioButton = (android.widget.RadioButton) this.getInputSizeshNQ4ISI.inflate(androidx.appcompat.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
        this.getOutputSizeshNQ4ISI = radioButton;
        android.widget.LinearLayout linearLayout = this.getHighSpeedVideoFpsRanges;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }
}
