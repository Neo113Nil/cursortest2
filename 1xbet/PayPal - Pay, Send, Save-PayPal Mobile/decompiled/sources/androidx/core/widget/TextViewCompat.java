package androidx.core.widget;

/* loaded from: classes3.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private TextViewCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelative(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getMaxLines()")
    @java.lang.Deprecated
    public static int getMaxLines(android.widget.TextView textView) {
        return textView.getMaxLines();
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getMinLines()")
    @java.lang.Deprecated
    public static int getMinLines(android.widget.TextView textView) {
        return textView.getMinLines();
    }

    public static void setTextAppearance(android.widget.TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getCompoundDrawablesRelative()")
    @java.lang.Deprecated
    public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(android.widget.TextView textView, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(textView, i);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView textView, int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.getHighSpeedVideoFpsRanges(textView, i, i2, i3, i4);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView textView, int[] iArr, int i) throws java.lang.IllegalArgumentException {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(textView, iArr, i);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getHighSpeedVideoFpsRanges(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getHighSpeedVideoSizes(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.Camera2StreamConfigurationMap(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] getAutoSizeTextAvailableSizes(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @java.lang.Deprecated
    public static void setCustomSelectionActionModeCallback(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        return (android.os.Build.VERSION.SDK_INT > 27 || (callback instanceof androidx.core.widget.TextViewCompat.OreoCallback) || callback == null) ? callback : new androidx.core.widget.TextViewCompat.OreoCallback(callback, textView);
    }

    public static android.view.ActionMode.Callback unwrapCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        return callback instanceof androidx.core.widget.TextViewCompat.OreoCallback ? ((androidx.core.widget.TextViewCompat.OreoCallback) callback).getHighResolutionOutputSizeshNQ4ISI() : callback;
    }

    static class OreoCallback implements android.view.ActionMode.Callback {
        private java.lang.Class<?> Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges = false;
        private final android.view.ActionMode.Callback getHighSpeedVideoFpsRangesFor;
        private java.lang.reflect.Method getHighSpeedVideoSizes;
        private final android.widget.TextView getInputFormats;

        OreoCallback(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
            this.getHighSpeedVideoFpsRangesFor = callback;
            this.getInputFormats = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            return this.getHighSpeedVideoFpsRangesFor.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            getHighResolutionOutputSizeshNQ4ISI(menu);
            return this.getHighSpeedVideoFpsRangesFor.onPrepareActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoFpsRangesFor.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode actionMode) {
            this.getHighSpeedVideoFpsRangesFor.onDestroyActionMode(actionMode);
        }

        android.view.ActionMode.Callback getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(android.view.Menu menu) {
            java.lang.reflect.Method declaredMethod;
            android.content.Context context = this.getInputFormats.getContext();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = true;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.Camera2StreamConfigurationMap = cls;
                    this.getHighSpeedVideoSizes = cls.getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                }
            }
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap.isInstance(menu)) {
                    declaredMethod = this.getHighSpeedVideoSizes;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    android.view.MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                    }
                }
                java.util.List<android.content.pm.ResolveInfo> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context, packageManager);
                for (int i = 0; i < highResolutionOutputSizeshNQ4ISI.size(); i++) {
                    android.content.pm.ResolveInfo resolveInfo = highResolutionOutputSizeshNQ4ISI.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(getHighSpeedVideoFpsRangesFor(resolveInfo, this.getInputFormats)).setShowAsAction(1);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        private java.util.List<android.content.pm.ResolveInfo> getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.content.pm.PackageManager packageManager) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (context instanceof android.app.Activity) {
                for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(getHighSpeedVideoSizes(), 0)) {
                    if (getHighSpeedVideoSizes(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        private boolean getHighSpeedVideoSizes(android.content.pm.ResolveInfo resolveInfo, android.content.Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (resolveInfo.activityInfo.exported) {
                return resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0;
            }
            return false;
        }

        private android.content.Intent getHighSpeedVideoFpsRangesFor(android.content.pm.ResolveInfo resolveInfo, android.widget.TextView textView) {
            return getHighSpeedVideoSizes().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !getHighSpeedVideoFpsRanges(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        private boolean getHighSpeedVideoFpsRanges(android.widget.TextView textView) {
            return (textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private android.content.Intent getHighSpeedVideoSizes() {
            return new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void setFirstBaselineToTopHeight(android.widget.TextView textView, int i) {
        int i2;
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.widget.TextViewCompat.Api28Impl.getHighSpeedVideoSizes(textView, i);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > java.lang.Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(android.widget.TextView textView, int i) {
        int i2;
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > java.lang.Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static int getFirstBaselineToTopHeight(android.widget.TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(android.widget.TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void setLineHeight(android.widget.TextView textView, int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void setLineHeight(android.widget.TextView textView, int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.widget.TextViewCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(textView, i, f);
        } else {
            setLineHeight(textView, java.lang.Math.round(android.util.TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParams(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.core.text.PrecomputedTextCompat.Params(androidx.core.widget.TextViewCompat.Api28Impl.cQ_(textView));
        }
        androidx.core.text.PrecomputedTextCompat.Params.Builder builder = new androidx.core.text.PrecomputedTextCompat.Params.Builder(new android.text.TextPaint(textView.getPaint()));
        builder.setBreakStrategy(textView.getBreakStrategy());
        builder.setHyphenationFrequency(textView.getHyphenationFrequency());
        builder.setTextDirection(getHighSpeedVideoFpsRangesFor(textView));
        return builder.build();
    }

    public static void setTextMetricsParams(android.widget.TextView textView, androidx.core.text.PrecomputedTextCompat.Params params) {
        textView.setTextDirection(getHighResolutionOutputSizeshNQ4ISI(params.getTextDirection()));
        textView.getPaint().set(params.getTextPaint());
        textView.setBreakStrategy(params.getBreakStrategy());
        textView.setHyphenationFrequency(params.getHyphenationFrequency());
    }

    public static void setPrecomputedText(android.widget.TextView textView, androidx.core.text.PrecomputedTextCompat precomputedTextCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textView.setText(androidx.core.widget.TextViewCompat.Api28Impl.cP_(precomputedTextCompat.getPrecomputedText()));
        } else {
            if (!getTextMetricsParams(textView).equalsWithoutTextDirection(precomputedTextCompat.getParams())) {
                throw new java.lang.IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    private static android.text.TextDirectionHeuristic getHighSpeedVideoFpsRangesFor(android.widget.TextView textView) {
        if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = java.lang.Character.getDirectionality(androidx.core.widget.TextViewCompat.Api28Impl.getHighSpeedVideoFpsRanges(androidx.core.widget.TextViewCompat.Api24Impl.Camera2StreamConfigurationMap(textView.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return android.text.TextDirectionHeuristics.RTL;
            }
            return android.text.TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                    break;
                } else {
                    break;
                }
        }
        return android.text.TextDirectionHeuristics.LTR;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(android.text.TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static void setCompoundDrawableTintList(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView textView) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        return textView.getCompoundDrawableTintList();
    }

    public static void setCompoundDrawableTintMode(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        textView.setCompoundDrawableTintMode(mode);
    }

    public static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView textView) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        return textView.getCompoundDrawableTintMode();
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }

        static void getHighSpeedVideoFpsRanges(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.widget.TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static int getHighSpeedVideoFpsRanges(android.widget.TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int getHighSpeedVideoSizes(android.widget.TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int Camera2StreamConfigurationMap(android.widget.TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int[] getHighSpeedVideoFpsRangesFor(android.widget.TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }
    }

    static class Api28Impl {
        static java.lang.CharSequence cP_(android.text.PrecomputedText precomputedText) {
            return precomputedText;
        }

        private Api28Impl() {
        }

        static void getHighSpeedVideoSizes(android.widget.TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        static android.text.PrecomputedText.Params cQ_(android.widget.TextView textView) {
            return textView.getTextMetricsParams();
        }

        static java.lang.String[] getHighSpeedVideoFpsRanges(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.icu.text.DecimalFormatSymbols Camera2StreamConfigurationMap(java.util.Locale locale) {
            return android.icu.text.DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        public static void getHighSpeedVideoFpsRangesFor(android.widget.TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }
}
