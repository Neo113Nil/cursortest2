package androidx.appcompat.graphics.drawable;

/* loaded from: classes5.dex */
public class StateListDrawableCompat extends androidx.appcompat.graphics.drawable.DrawableContainerCompat {
    private boolean Camera2StreamConfigurationMap;
    private androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState getHighSpeedVideoFpsRanges;

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public StateListDrawableCompat() {
        this(null, null);
    }

    public void addState(int[] iArr, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(iArr);
        if (highSpeedVideoFpsRanges < 0) {
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(android.util.StateSet.WILD_CARD);
        }
        return getHighSpeedVideoSizes(highSpeedVideoFpsRanges) || onStateChange;
    }

    public void inflate(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.StateListDrawable);
        setVisible(obtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_visible, true), true);
        getHighSpeedVideoFpsRanges(obtainAttributes);
        getHighSpeedVideoFpsRangesFor(resources);
        obtainAttributes.recycle();
        getHighSpeedVideoFpsRanges(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    private void getHighSpeedVideoFpsRanges(android.content.res.TypedArray typedArray) {
        androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState = this.getHighSpeedVideoFpsRanges;
        stateListState.getHighResolutionOutputSizeshNQ4ISI |= androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        stateListState.release = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_variablePadding, stateListState.release);
        stateListState.isOutputSupportedFor = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_constantSize, stateListState.isOutputSupportedFor);
        stateListState.CoroutineDebuggingKt = typedArray.getInt(androidx.appcompat.resources.R.styleable.StateListDrawable_android_enterFadeDuration, stateListState.CoroutineDebuggingKt);
        stateListState.accessartificialFrame = typedArray.getInt(androidx.appcompat.resources.R.styleable.StateListDrawable_android_exitFadeDuration, stateListState.accessartificialFrame);
        stateListState.getValidOutputFormatsForInputhNQ4ISI = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_dither, stateListState.getValidOutputFormatsForInputhNQ4ISI);
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState = this.getHighSpeedVideoFpsRanges;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.StateListDrawableItem);
                int resourceId = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.StateListDrawableItem_android_drawable, -1);
                android.graphics.drawable.Drawable drawable = resourceId > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId) : null;
                obtainAttributes.recycle();
                int[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(xmlPullParser.getPositionDescription());
                        sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
                    }
                    drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                stateListState.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, drawable);
            }
        }
    }

    int[] getHighSpeedVideoFpsRangesFor(android.util.AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i++;
            }
        }
        return android.util.StateSet.trimStateSet(iArr, i);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.Camera2StreamConfigurationMap && super.mutate() == this) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: Camera2StreamConfigurationMap */
    public androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState getHighSpeedVideoSizes() {
        return new androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState(this.getHighSpeedVideoFpsRanges, this, null);
    }

    static class StateListState extends androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState {
        int[][] AMEXKernela;

        StateListState(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState, androidx.appcompat.graphics.drawable.StateListDrawableCompat stateListDrawableCompat, android.content.res.Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.AMEXKernela = stateListState.AMEXKernela;
            } else {
                this.AMEXKernela = new int[Camera2StreamConfigurationMap()][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void getHighSpeedVideoFpsRangesFor() {
            int[][] iArr = this.AMEXKernela;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.AMEXKernela[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.AMEXKernela = iArr2;
        }

        int getHighSpeedVideoFpsRangesFor(int[] iArr, android.graphics.drawable.Drawable drawable) {
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(drawable);
            this.AMEXKernela[highSpeedVideoFpsRanges] = iArr;
            return highSpeedVideoFpsRanges;
        }

        int getHighSpeedVideoFpsRanges(int[] iArr) {
            int[][] iArr2 = this.AMEXKernela;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            for (int i = 0; i < highSpeedVideoFpsRanges; i++) {
                if (android.util.StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.appcompat.graphics.drawable.StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.appcompat.graphics.drawable.StateListDrawableCompat(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            super.getHighResolutionOutputSizeshNQ4ISI(i, i2);
            int[][] iArr = new int[i2][];
            java.lang.System.arraycopy(this.AMEXKernela, 0, iArr, 0, i);
            this.AMEXKernela = iArr;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.getHighResolutionOutputSizeshNQ4ISI(drawableContainerState);
        if (drawableContainerState instanceof androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState) {
            this.getHighSpeedVideoFpsRanges = (androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState) drawableContainerState;
        }
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState, android.content.res.Resources resources) {
        getHighResolutionOutputSizeshNQ4ISI(new androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState) {
        if (stateListState != null) {
            getHighResolutionOutputSizeshNQ4ISI(stateListState);
        }
    }
}
