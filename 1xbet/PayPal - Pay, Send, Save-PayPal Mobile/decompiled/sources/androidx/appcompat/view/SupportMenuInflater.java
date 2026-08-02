package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class SupportMenuInflater extends android.view.MenuInflater {
    static final java.lang.Class<?>[] getHighSpeedVideoFpsRangesFor;
    static final java.lang.Class<?>[] getHighSpeedVideoSizes;
    android.content.Context Camera2StreamConfigurationMap;
    final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Object[] getHighSpeedVideoFpsRanges;
    java.lang.Object getOutputFormats;

    static {
        java.lang.Class<?>[] clsArr = {android.content.Context.class};
        getHighSpeedVideoSizes = clsArr;
        getHighSpeedVideoFpsRangesFor = clsArr;
    }

    public SupportMenuInflater(android.content.Context context) {
        super(context);
        this.Camera2StreamConfigurationMap = context;
        java.lang.Object[] objArr = {context};
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
        this.getHighSpeedVideoFpsRanges = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof androidx.core.internal.view.SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.Camera2StreamConfigurationMap.getResources().getLayout(i);
                android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.MenuBuilder) {
                    androidx.appcompat.view.menu.MenuBuilder menuBuilder = (androidx.appcompat.view.menu.MenuBuilder) menu;
                    if (menuBuilder.isDispatchingItemsChanged()) {
                        menuBuilder.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                getHighSpeedVideoSizes(xmlResourceParser, asAttributeSet, menu);
            } catch (java.io.IOException e) {
                throw new android.view.InflateException("Error inflating menu XML", e);
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                throw new android.view.InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (z) {
                ((androidx.appcompat.view.menu.MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private void getHighSpeedVideoSizes(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.appcompat.view.SupportMenuInflater.MenuState menuState = new androidx.appcompat.view.SupportMenuInflater.MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                java.lang.String name2 = xmlPullParser.getName();
                if (name2.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(java.lang.String.valueOf(name2)));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        java.lang.String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    java.lang.String name3 = xmlPullParser.getName();
                    if (z2 && name3.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (!name3.equals("group")) {
                        if (!name3.equals("item")) {
                            if (name3.equals("menu")) {
                                z = true;
                            }
                        } else if (!menuState.getOutputSizeshNQ4ISI) {
                            if (menuState.getInputFormats != null && menuState.getInputFormats.hasSubMenu()) {
                                menuState.getHighSpeedVideoFpsRangesFor();
                            } else {
                                menuState.getOutputSizeshNQ4ISI = true;
                                menuState.getHighSpeedVideoFpsRangesFor(menuState.init.add(menuState.getHighSpeedVideoFpsRangesFor, menuState.CoroutineDebuggingKt, menuState.getOutputStallDurationlomOqCM, menuState.f2664a));
                            }
                        }
                    } else {
                        menuState.getHighSpeedVideoFpsRangesFor = 0;
                        menuState.Camera2StreamConfigurationMap = 0;
                        menuState.getHighSpeedVideoFpsRanges = 0;
                        menuState.getHighResolutionOutputSizeshNQ4ISI = 0;
                        menuState.getInputSizeshNQ4ISI = true;
                        menuState.getHighSpeedVideoSizes = true;
                    }
                }
            } else if (!z2) {
                java.lang.String name4 = xmlPullParser.getName();
                if (!name4.equals("group")) {
                    if (!name4.equals("item")) {
                        if (name4.equals("menu")) {
                            getHighSpeedVideoSizes(xmlPullParser, attributeSet, menuState.getHighSpeedVideoFpsRangesFor());
                        } else {
                            str = name4;
                            z2 = true;
                        }
                    } else {
                        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(androidx.appcompat.view.SupportMenuInflater.this.Camera2StreamConfigurationMap, attributeSet, androidx.appcompat.R.styleable.MenuItem);
                        menuState.CoroutineDebuggingKt = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.MenuItem_android_id, 0);
                        menuState.getOutputStallDurationlomOqCM = (obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_android_menuCategory, menuState.Camera2StreamConfigurationMap) & androidx.core.internal.view.SupportMenu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_android_orderInCategory, menuState.getHighSpeedVideoFpsRanges) & 65535);
                        menuState.f2664a = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.MenuItem_android_title);
                        menuState._BOUNDARY = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.MenuItem_android_titleCondensed);
                        menuState.getValidOutputFormatsForInputhNQ4ISI = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.MenuItem_android_icon, 0);
                        menuState.getOutputSizes = androidx.appcompat.view.SupportMenuInflater.MenuState.getHighSpeedVideoSizes(obtainStyledAttributes.getString(androidx.appcompat.R.styleable.MenuItem_android_alphabeticShortcut));
                        menuState.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_alphabeticModifiers, 4096);
                        menuState.accessartificialFrame = androidx.appcompat.view.SupportMenuInflater.MenuState.getHighSpeedVideoSizes(obtainStyledAttributes.getString(androidx.appcompat.R.styleable.MenuItem_android_numericShortcut));
                        menuState.ArtificialStackFrames = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_numericModifiers, 4096);
                        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.MenuItem_android_checkable)) {
                            menuState.getOutputStallDuration = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            menuState.getOutputStallDuration = menuState.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        menuState.toString = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuItem_android_checked, false);
                        menuState._CREATION = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuItem_android_visible, menuState.getInputSizeshNQ4ISI);
                        menuState.unwrapAs = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuItem_android_enabled, menuState.getHighSpeedVideoSizes);
                        menuState.getARTIFICIAL_FRAME_PACKAGE_NAME = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_showAsAction, -1);
                        menuState.coroutineBoundary = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.MenuItem_android_onClick);
                        menuState.getHighSpeedVideoSizesFor = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.MenuItem_actionLayout, 0);
                        menuState.getOutputFormats = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.MenuItem_actionViewClass);
                        java.lang.String string = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.MenuItem_actionProviderClass);
                        menuState.getOutputMinFrameDuration = string;
                        if (string != null && menuState.getHighSpeedVideoSizesFor == 0 && menuState.getOutputFormats == null) {
                            menuState.getInputFormats = (androidx.core.view.ActionProvider) menuState.getHighResolutionOutputSizeshNQ4ISI(string, getHighSpeedVideoFpsRangesFor, androidx.appcompat.view.SupportMenuInflater.this.getHighSpeedVideoFpsRanges);
                        } else {
                            menuState.getInputFormats = null;
                        }
                        menuState.isOutputSupportedFor = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.MenuItem_contentDescription);
                        menuState.b = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.MenuItem_tooltipText);
                        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.MenuItem_iconTintMode)) {
                            menuState.coroutineCreation = androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.MenuItem_iconTintMode, -1), menuState.coroutineCreation);
                        } else {
                            menuState.coroutineCreation = null;
                        }
                        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.MenuItem_iconTint)) {
                            menuState.isOutputSupportedForhNQ4ISI = obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.MenuItem_iconTint);
                        } else {
                            menuState.isOutputSupportedForhNQ4ISI = null;
                        }
                        obtainStyledAttributes.recycle();
                        menuState.getOutputSizeshNQ4ISI = false;
                    }
                } else {
                    android.content.res.TypedArray obtainStyledAttributes2 = androidx.appcompat.view.SupportMenuInflater.this.Camera2StreamConfigurationMap.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.MenuGroup);
                    menuState.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes2.getResourceId(androidx.appcompat.R.styleable.MenuGroup_android_id, 0);
                    menuState.Camera2StreamConfigurationMap = obtainStyledAttributes2.getInt(androidx.appcompat.R.styleable.MenuGroup_android_menuCategory, 0);
                    menuState.getHighSpeedVideoFpsRanges = obtainStyledAttributes2.getInt(androidx.appcompat.R.styleable.MenuGroup_android_orderInCategory, 0);
                    menuState.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes2.getInt(androidx.appcompat.R.styleable.MenuGroup_android_checkableBehavior, 0);
                    menuState.getInputSizeshNQ4ISI = obtainStyledAttributes2.getBoolean(androidx.appcompat.R.styleable.MenuGroup_android_visible, true);
                    menuState.getHighSpeedVideoSizes = obtainStyledAttributes2.getBoolean(androidx.appcompat.R.styleable.MenuGroup_android_enabled, true);
                    obtainStyledAttributes2.recycle();
                }
            }
            eventType = xmlPullParser.next();
            z = z;
            z2 = z2;
        }
    }

    final java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? Camera2StreamConfigurationMap(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    static class InflatedOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private static final java.lang.Class<?>[] getHighSpeedVideoFpsRangesFor = {android.view.MenuItem.class};
        private java.lang.Object Camera2StreamConfigurationMap;
        private java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

        public InflatedOnMenuItemClickListener(java.lang.Object obj, java.lang.String str) {
            this.Camera2StreamConfigurationMap = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                this.getHighResolutionOutputSizeshNQ4ISI = cls.getMethod(str, getHighSpeedVideoFpsRangesFor);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                android.view.InflateException inflateException = new android.view.InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI.getReturnType() == java.lang.Boolean.TYPE) {
                    return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.Camera2StreamConfigurationMap, menuItem)).booleanValue();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.Camera2StreamConfigurationMap, menuItem);
                return true;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    class MenuState {
        int ArtificialStackFrames;
        int CoroutineDebuggingKt;
        java.lang.CharSequence _BOUNDARY;
        boolean _CREATION;

        /* renamed from: a, reason: collision with root package name */
        java.lang.CharSequence f2664a;
        char accessartificialFrame;
        java.lang.CharSequence b;
        java.lang.String coroutineBoundary;
        int getARTIFICIAL_FRAME_PACKAGE_NAME;
        int getHighSpeedVideoSizesFor;
        androidx.core.view.ActionProvider getInputFormats;
        java.lang.String getOutputFormats;
        java.lang.String getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        char getOutputSizes;
        boolean getOutputSizeshNQ4ISI;
        int getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        int getValidOutputFormatsForInputhNQ4ISI;
        android.view.Menu init;
        java.lang.CharSequence isOutputSupportedFor;
        boolean toString;
        boolean unwrapAs;
        android.content.res.ColorStateList isOutputSupportedForhNQ4ISI = null;
        android.graphics.PorterDuff.Mode coroutineCreation = null;
        int getHighSpeedVideoFpsRangesFor = 0;
        int Camera2StreamConfigurationMap = 0;
        int getHighSpeedVideoFpsRanges = 0;
        int getHighResolutionOutputSizeshNQ4ISI = 0;
        boolean getInputSizeshNQ4ISI = true;
        boolean getHighSpeedVideoSizes = true;

        public MenuState(android.view.Menu menu) {
            this.init = menu;
        }

        static char getHighSpeedVideoSizes(java.lang.String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        final void getHighSpeedVideoFpsRangesFor(android.view.MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.toString).setVisible(this._CREATION).setEnabled(this.unwrapAs).setCheckable(this.getOutputStallDuration > 0).setTitleCondensed(this._BOUNDARY).setIcon(this.getValidOutputFormatsForInputhNQ4ISI);
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.coroutineBoundary != null) {
                if (androidx.appcompat.view.SupportMenuInflater.this.Camera2StreamConfigurationMap.isRestricted()) {
                    throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                androidx.appcompat.view.SupportMenuInflater supportMenuInflater = androidx.appcompat.view.SupportMenuInflater.this;
                if (supportMenuInflater.getOutputFormats == null) {
                    supportMenuInflater.getOutputFormats = supportMenuInflater.Camera2StreamConfigurationMap(supportMenuInflater.Camera2StreamConfigurationMap);
                }
                menuItem.setOnMenuItemClickListener(new androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener(supportMenuInflater.getOutputFormats, this.coroutineBoundary));
            }
            if (this.getOutputStallDuration >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.MenuItemImpl) {
                    ((androidx.appcompat.view.menu.MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.MenuItemWrapperICS) {
                    ((androidx.appcompat.view.menu.MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            java.lang.String str = this.getOutputFormats;
            if (str != null) {
                menuItem.setActionView((android.view.View) getHighResolutionOutputSizeshNQ4ISI(str, androidx.appcompat.view.SupportMenuInflater.getHighSpeedVideoSizes, androidx.appcompat.view.SupportMenuInflater.this.getHighResolutionOutputSizeshNQ4ISI));
            } else {
                z = false;
            }
            int i2 = this.getHighSpeedVideoSizesFor;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            androidx.core.view.ActionProvider actionProvider = this.getInputFormats;
            if (actionProvider != null) {
                androidx.core.view.MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            androidx.core.view.MenuItemCompat.setContentDescription(menuItem, this.isOutputSupportedFor);
            androidx.core.view.MenuItemCompat.setTooltipText(menuItem, this.b);
            androidx.core.view.MenuItemCompat.setAlphabeticShortcut(menuItem, this.getOutputSizes, this.getOutputMinFrameDurationlomOqCM);
            androidx.core.view.MenuItemCompat.setNumericShortcut(menuItem, this.accessartificialFrame, this.ArtificialStackFrames);
            android.graphics.PorterDuff.Mode mode = this.coroutineCreation;
            if (mode != null) {
                androidx.core.view.MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            android.content.res.ColorStateList colorStateList = this.isOutputSupportedForhNQ4ISI;
            if (colorStateList != null) {
                androidx.core.view.MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }

        public final android.view.SubMenu getHighSpeedVideoFpsRangesFor() {
            this.getOutputSizeshNQ4ISI = true;
            android.view.SubMenu addSubMenu = this.init.addSubMenu(this.getHighSpeedVideoFpsRangesFor, this.CoroutineDebuggingKt, this.getOutputStallDurationlomOqCM, this.f2664a);
            getHighSpeedVideoFpsRangesFor(addSubMenu.getItem());
            return addSubMenu;
        }

        final <T> T getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
            try {
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, androidx.appcompat.view.SupportMenuInflater.this.Camera2StreamConfigurationMap.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }
}
