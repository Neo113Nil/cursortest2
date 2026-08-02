package androidx.appcompat.app;

/* loaded from: classes3.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private final java.lang.Object[] mConstructorArgs = new java.lang.Object[2];
    private static final java.lang.Class<?>[] sConstructorSignature = {android.content.Context.class, android.util.AttributeSet.class};
    private static final int[] sOnClickAttrs = {android.R.attr.onClick};
    private static final int[] sAccessibilityHeading = {android.R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {android.R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {android.R.attr.screenReaderFocusable};
    private static final java.lang.String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = new androidx.collection.SimpleArrayMap<>();

    protected android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        char c;
        android.view.View createRatingBar;
        android.content.Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = androidx.appcompat.widget.TintContextWrapper.wrap(context2);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }

    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatImageView createImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatEditText createEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatEditText(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatSpinner createSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatSpinner(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatImageButton createImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatImageButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatCheckBox(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatRadioButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatCheckedTextView createCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatCheckedTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatRatingBar createRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatRatingBar(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatSeekBar createSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatSeekBar(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatToggleButton createToggleButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatToggleButton(context, attributeSet);
    }

    private void verifyNotNull(android.view.View view, java.lang.String str) {
        if (view != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(str);
        sb.append(">, but returned null");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private android.view.View createViewFromTag(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS);
        }
        try {
            java.lang.Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                java.lang.String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                android.view.View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i++;
            }
        } catch (java.lang.Exception unused) {
            return null;
        } finally {
            java.lang.Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void checkOnClickListener(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        if ((context instanceof android.content.ContextWrapper) && view.hasOnClickListeners()) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new androidx.appcompat.app.AppCompatViewInflater.DeclaredOnClickListener(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private android.view.View createViewByPrefix(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.ClassNotFoundException, android.view.InflateException {
        java.lang.String obj;
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> simpleArrayMap = sConstructorMap;
        java.lang.reflect.Constructor<? extends android.view.View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    obj = sb.toString();
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                obj = str;
            }
            constructor = java.lang.Class.forName(obj, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(sConstructorSignature);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private static android.content.Context themifyContext(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.ContextThemeWrapper) && ((androidx.appcompat.view.ContextThemeWrapper) context).getThemeResId() == resourceId)) ? context : new androidx.appcompat.view.ContextThemeWrapper(context, resourceId);
    }

    private void backportAccessibilityAttributes(android.content.Context context, android.view.View view, android.util.AttributeSet attributeSet) {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            androidx.core.view.ViewCompat.setAccessibilityHeading(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            androidx.core.view.ViewCompat.setScreenReaderFocusable(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private java.lang.reflect.Method Camera2StreamConfigurationMap;
        private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private final android.view.View getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public DeclaredOnClickListener(android.view.View view, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = view;
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (this.Camera2StreamConfigurationMap == null) {
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getContext());
            }
            try {
                this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI, view);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            java.lang.String obj;
            java.lang.reflect.Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.getHighSpeedVideoFpsRangesFor, android.view.View.class)) != null) {
                        this.Camera2StreamConfigurationMap = method;
                        this.getHighResolutionOutputSizeshNQ4ISI = context;
                        return;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.getHighSpeedVideoFpsRanges.getId();
            if (id == -1) {
                obj = "";
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(" with id '");
                sb.append(this.getHighSpeedVideoFpsRanges.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                obj = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not find method ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.getHighSpeedVideoFpsRanges.getClass());
            sb2.append(obj);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }
}
