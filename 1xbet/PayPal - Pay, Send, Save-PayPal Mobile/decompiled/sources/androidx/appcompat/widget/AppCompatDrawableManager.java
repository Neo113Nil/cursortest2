package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class AppCompatDrawableManager {
    private static androidx.appcompat.widget.AppCompatDrawableManager getHighSpeedVideoFpsRanges;
    private static final android.graphics.PorterDuff.Mode getHighSpeedVideoSizes = android.graphics.PorterDuff.Mode.SRC_IN;
    private androidx.appcompat.widget.ResourceManagerInternal getHighResolutionOutputSizeshNQ4ISI;

    public static void preload() {
        synchronized (androidx.appcompat.widget.AppCompatDrawableManager.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager = new androidx.appcompat.widget.AppCompatDrawableManager();
                getHighSpeedVideoFpsRanges = appCompatDrawableManager;
                appCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI = androidx.appcompat.widget.ResourceManagerInternal.get();
                getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setHooks(new androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                    private final int[] Camera2StreamConfigurationMap = {androidx.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, androidx.appcompat.R.drawable.abc_textfield_default_mtrl_alpha, androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha};
                    private final int[] getHighSpeedVideoFpsRanges = {androidx.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, androidx.appcompat.R.drawable.abc_seekbar_tick_mark_material, androidx.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, androidx.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, androidx.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, androidx.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                    private final int[] getHighSpeedVideoFpsRangesFor = {androidx.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, androidx.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, androidx.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha, androidx.appcompat.R.drawable.abc_text_cursor_material, androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl, androidx.appcompat.R.drawable.abc_text_select_handle_middle_mtrl, androidx.appcompat.R.drawable.abc_text_select_handle_right_mtrl};
                    private final int[] getHighResolutionOutputSizeshNQ4ISI = {androidx.appcompat.R.drawable.abc_popup_background_mtrl_mult, androidx.appcompat.R.drawable.abc_cab_background_internal_bg, androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                    private final int[] getInputFormats = {androidx.appcompat.R.drawable.abc_tab_indicator_material, androidx.appcompat.R.drawable.abc_textfield_search_material};
                    private final int[] getHighSpeedVideoSizes = {androidx.appcompat.R.drawable.abc_btn_check_material, androidx.appcompat.R.drawable.abc_btn_radio_material, androidx.appcompat.R.drawable.abc_btn_check_material_anim, androidx.appcompat.R.drawable.abc_btn_radio_material_anim};

                    private android.content.res.ColorStateList getHighSpeedVideoSizes(android.content.Context context) {
                        return getHighSpeedVideoFpsRangesFor(context, androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorButtonNormal));
                    }

                    private android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor(android.content.Context context) {
                        return getHighSpeedVideoFpsRangesFor(context, 0);
                    }

                    private android.content.res.ColorStateList Camera2StreamConfigurationMap(android.content.Context context) {
                        return getHighSpeedVideoFpsRangesFor(context, androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorAccent));
                    }

                    private android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor(android.content.Context context, int i) {
                        int themeAttrColor = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlHighlight);
                        int disabledThemeAttrColor = androidx.appcompat.widget.ThemeUtils.getDisabledThemeAttrColor(context, androidx.appcompat.R.attr.colorButtonNormal);
                        int[] iArr = androidx.appcompat.widget.ThemeUtils.getHighResolutionOutputSizeshNQ4ISI;
                        int[] iArr2 = androidx.appcompat.widget.ThemeUtils.getInputSizeshNQ4ISI;
                        int compositeColors = androidx.core.graphics.ColorUtils.compositeColors(themeAttrColor, i);
                        return new android.content.res.ColorStateList(new int[][]{iArr, iArr2, androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoFpsRanges, androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoFpsRangesFor}, new int[]{disabledThemeAttrColor, compositeColors, androidx.core.graphics.ColorUtils.compositeColors(themeAttrColor, i), i});
                    }

                    private android.content.res.ColorStateList getHighSpeedVideoFpsRanges(android.content.Context context) {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        android.content.res.ColorStateList themeAttrColorStateList = androidx.appcompat.widget.ThemeUtils.getThemeAttrColorStateList(context, androidx.appcompat.R.attr.colorSwitchThumbNormal);
                        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                            int[] iArr3 = androidx.appcompat.widget.ThemeUtils.getHighResolutionOutputSizeshNQ4ISI;
                            iArr[0] = iArr3;
                            iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                            iArr[1] = androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoSizes;
                            iArr2[1] = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlActivated);
                            iArr[2] = androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoFpsRangesFor;
                            iArr2[2] = themeAttrColorStateList.getDefaultColor();
                        } else {
                            iArr[0] = androidx.appcompat.widget.ThemeUtils.getHighResolutionOutputSizeshNQ4ISI;
                            iArr2[0] = androidx.appcompat.widget.ThemeUtils.getDisabledThemeAttrColor(context, androidx.appcompat.R.attr.colorSwitchThumbNormal);
                            iArr[1] = androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoSizes;
                            iArr2[1] = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlActivated);
                            iArr[2] = androidx.appcompat.widget.ThemeUtils.getHighSpeedVideoFpsRangesFor;
                            iArr2[2] = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorSwitchThumbNormal);
                        }
                        return new android.content.res.ColorStateList(iArr, iArr2);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public android.graphics.drawable.Drawable createDrawableFor(androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal, android.content.Context context, int i) {
                        if (i == androidx.appcompat.R.drawable.abc_cab_background_top_material) {
                            return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{resourceManagerInternal.getDrawable(context, androidx.appcompat.R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, androidx.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)});
                        }
                        if (i == androidx.appcompat.R.drawable.abc_ratingbar_material) {
                            return getHighSpeedVideoFpsRanges(resourceManagerInternal, context, androidx.appcompat.R.dimen.abc_star_big);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_ratingbar_indicator_material) {
                            return getHighSpeedVideoFpsRanges(resourceManagerInternal, context, androidx.appcompat.R.dimen.abc_star_medium);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_ratingbar_small_material) {
                            return getHighSpeedVideoFpsRanges(resourceManagerInternal, context, androidx.appcompat.R.dimen.abc_star_small);
                        }
                        return null;
                    }

                    private android.graphics.drawable.LayerDrawable getHighSpeedVideoFpsRanges(androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal, android.content.Context context, int i) {
                        android.graphics.drawable.BitmapDrawable bitmapDrawable;
                        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
                        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                        android.graphics.drawable.Drawable drawable = resourceManagerInternal.getDrawable(context, androidx.appcompat.R.drawable.abc_star_black_48dp);
                        android.graphics.drawable.Drawable drawable2 = resourceManagerInternal.getDrawable(context, androidx.appcompat.R.drawable.abc_star_half_black_48dp);
                        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
                            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof android.graphics.drawable.BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawable2;
                        } else {
                            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
                            android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(createBitmap2);
                        }
                        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, android.R.id.background);
                        layerDrawable.setId(1, android.R.id.secondaryProgress);
                        layerDrawable.setId(2, android.R.id.progress);
                        return layerDrawable;
                    }

                    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
                        android.graphics.drawable.Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes;
                        }
                        mutate.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public boolean tintDrawable(android.content.Context context, int i, android.graphics.drawable.Drawable drawable) {
                        if (i == androidx.appcompat.R.drawable.abc_seekbar_track_material) {
                            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                            getHighResolutionOutputSizeshNQ4ISI(layerDrawable.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlNormal), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                            getHighResolutionOutputSizeshNQ4ISI(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlNormal), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                            getHighResolutionOutputSizeshNQ4ISI(layerDrawable.findDrawableByLayerId(android.R.id.progress), androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlActivated), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                            return true;
                        }
                        if (i != androidx.appcompat.R.drawable.abc_ratingbar_material && i != androidx.appcompat.R.drawable.abc_ratingbar_indicator_material && i != androidx.appcompat.R.drawable.abc_ratingbar_small_material) {
                            return false;
                        }
                        android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawable;
                        getHighResolutionOutputSizeshNQ4ISI(layerDrawable2.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.ThemeUtils.getDisabledThemeAttrColor(context, androidx.appcompat.R.attr.colorControlNormal), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                        getHighResolutionOutputSizeshNQ4ISI(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlActivated), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                        getHighResolutionOutputSizeshNQ4ISI(layerDrawable2.findDrawableByLayerId(android.R.id.progress), androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, androidx.appcompat.R.attr.colorControlActivated), androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes);
                        return true;
                    }

                    private boolean getHighSpeedVideoFpsRanges(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public android.content.res.ColorStateList getTintListForDrawableRes(android.content.Context context, int i) {
                        if (i == androidx.appcompat.R.drawable.abc_edit_text_material) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_edittext);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_switch_track_mtrl_alpha) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_switch_track);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_switch_thumb_material) {
                            return getHighSpeedVideoFpsRanges(context);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_btn_default_mtrl_shape) {
                            return getHighSpeedVideoSizes(context);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_btn_borderless_material) {
                            return getHighSpeedVideoFpsRangesFor(context);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_btn_colored_material) {
                            return Camera2StreamConfigurationMap(context);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == androidx.appcompat.R.drawable.abc_spinner_textfield_background_material) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_spinner);
                        }
                        if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, i)) {
                            return androidx.appcompat.widget.ThemeUtils.getThemeAttrColorStateList(context, androidx.appcompat.R.attr.colorControlNormal);
                        }
                        if (getHighSpeedVideoFpsRanges(this.getInputFormats, i)) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_default);
                        }
                        if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i)) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_btn_checkable);
                        }
                        if (i == androidx.appcompat.R.drawable.abc_seekbar_thumb_material) {
                            return androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, androidx.appcompat.R.color.abc_tint_seek_thumb);
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean tintDrawableUsingColorFilter(android.content.Context context, int i, android.graphics.drawable.Drawable drawable) {
                        int i2;
                        boolean z;
                        int round;
                        int i3;
                        boolean z2;
                        int i4;
                        android.graphics.PorterDuff.Mode mode;
                        android.graphics.PorterDuff.Mode mode2 = androidx.appcompat.widget.AppCompatDrawableManager.getHighSpeedVideoSizes;
                        if (getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, i)) {
                            i2 = androidx.appcompat.R.attr.colorControlNormal;
                        } else if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, i)) {
                            i2 = androidx.appcompat.R.attr.colorControlActivated;
                        } else {
                            if (getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, i)) {
                                mode2 = android.graphics.PorterDuff.Mode.MULTIPLY;
                            } else {
                                if (i == androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha) {
                                    round = java.lang.Math.round(40.8f);
                                    i3 = android.R.attr.colorForeground;
                                    z2 = true;
                                    android.graphics.PorterDuff.Mode mode3 = mode2;
                                    i4 = round;
                                    i2 = i3;
                                    mode = mode3;
                                    if (z2) {
                                        return false;
                                    }
                                    android.graphics.drawable.Drawable mutate = drawable.mutate();
                                    mutate.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(context, i2), mode));
                                    if (i4 != -1) {
                                        mutate.setAlpha(i4);
                                    }
                                    return true;
                                }
                                if (i != androidx.appcompat.R.drawable.abc_dialog_material_background) {
                                    i2 = 0;
                                    z = false;
                                    z2 = z;
                                    mode = mode2;
                                    i4 = -1;
                                    if (z2) {
                                    }
                                }
                            }
                            i3 = android.R.attr.colorBackground;
                            round = -1;
                            z2 = true;
                            android.graphics.PorterDuff.Mode mode32 = mode2;
                            i4 = round;
                            i2 = i3;
                            mode = mode32;
                            if (z2) {
                            }
                        }
                        z = true;
                        z2 = z;
                        mode = mode2;
                        i4 = -1;
                        if (z2) {
                        }
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public android.graphics.PorterDuff.Mode getTintModeForDrawableRes(int i) {
                        if (i == androidx.appcompat.R.drawable.abc_switch_thumb_material) {
                            return android.graphics.PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }
                });
            }
        }
    }

    public static androidx.appcompat.widget.AppCompatDrawableManager get() {
        androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager;
        synchronized (androidx.appcompat.widget.AppCompatDrawableManager.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                preload();
            }
            appCompatDrawableManager = getHighSpeedVideoFpsRanges;
        }
        return appCompatDrawableManager;
    }

    public final android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        android.graphics.drawable.Drawable drawable;
        synchronized (this) {
            drawable = this.getHighResolutionOutputSizeshNQ4ISI.getDrawable(context, i);
        }
        return drawable;
    }

    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor(android.content.Context context, int i, boolean z) {
        android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
        synchronized (this) {
            Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(context, i, z);
        }
        return Camera2StreamConfigurationMap;
    }

    public final void onConfigurationChanged(android.content.Context context) {
        synchronized (this) {
            this.getHighResolutionOutputSizeshNQ4ISI.onConfigurationChanged(context);
        }
    }

    final android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor(android.content.Context context, int i) {
        android.content.res.ColorStateList Camera2StreamConfigurationMap;
        synchronized (this) {
            Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(context, i);
        }
        return Camera2StreamConfigurationMap;
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.TintInfo tintInfo, int[] iArr) {
        androidx.appcompat.widget.ResourceManagerInternal.getHighSpeedVideoFpsRanges(drawable, tintInfo, iArr);
    }

    public static android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (androidx.appcompat.widget.AppCompatDrawableManager.class) {
            porterDuffColorFilter = androidx.appcompat.widget.ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }
}
