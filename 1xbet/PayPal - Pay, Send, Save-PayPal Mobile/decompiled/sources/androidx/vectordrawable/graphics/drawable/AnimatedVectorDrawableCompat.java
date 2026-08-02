package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes7.dex */
public class AnimatedVectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> Camera2StreamConfigurationMap;
    final android.graphics.drawable.Drawable.Callback getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState getHighSpeedVideoFpsRanges;
    androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState getHighSpeedVideoSizes;
    private android.animation.Animator.AnimatorListener getHighSpeedVideoSizesFor;
    private final android.content.Context getInputFormats;
    private android.animation.ArgbEvaluator getOutputMinFrameDuration;

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    private AnimatedVectorDrawableCompat(android.content.Context context) {
        this(context, null, null);
    }

    private AnimatedVectorDrawableCompat(android.content.Context context, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, android.content.res.Resources resources) {
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizesFor = null;
        this.Camera2StreamConfigurationMap = null;
        android.graphics.drawable.Drawable.Callback callback = new android.graphics.drawable.Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
        this.getInputFormats = context;
        if (animatedVectorDrawableCompatState != null) {
            this.getHighSpeedVideoFpsRanges = animatedVectorDrawableCompatState;
        } else {
            this.getHighSpeedVideoFpsRanges = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState(context, null, callback, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.mutate();
        }
        return this;
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create(android.content.Context context, int i) {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat(context);
        android.graphics.drawable.Drawable drawable = androidx.core.content.res.ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
        androidx.core.util.ObjectsCompat.requireNonNull(animatedVectorDrawableCompat, "Failed to load drawable");
        drawable.setCallback(animatedVectorDrawableCompat.getHighResolutionOutputSizeshNQ4ISI);
        animatedVectorDrawableCompat.getHighSpeedVideoSizes = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState(drawable.getConstantState());
        animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor = drawable;
        return animatedVectorDrawableCompat;
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat createFromXmlInner(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState(this.getHighSpeedVideoFpsRangesFor.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.draw(canvas);
            return;
        }
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.draw(canvas);
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setBounds(rect);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.setState(iArr);
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.setLevel(i);
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getAlpha(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setAlpha(i);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getColorFilter(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(this.getHighSpeedVideoFpsRangesFor, i);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(this.getHighSpeedVideoFpsRangesFor, colorStateList);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.getHighSpeedVideoFpsRangesFor, mode);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.setVisible(z, z2);
        }
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.isStateful();
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getOpacity();
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getIntrinsicWidth();
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getIntrinsicHeight();
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.getHighSpeedVideoFpsRangesFor, z);
        } else {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.inflate(this.getHighSpeedVideoFpsRangesFor, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name2 = xmlPullParser.getName();
                if ("animated-vector".equals(name2)) {
                    android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighSpeedVideoSizes);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(resources, resourceId, theme);
                        androidx.core.util.ObjectsCompat.requireNonNull(create, "Failed to load drawable");
                        create.getHighSpeedVideoSizes(false);
                        create.setCallback(this.getHighResolutionOutputSizeshNQ4ISI);
                        if (this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap != null) {
                            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.setCallback(null);
                        }
                        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = create;
                    }
                    obtainAttributes.recycle();
                } else if (androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET.equals(name2)) {
                    android.content.res.TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.Camera2StreamConfigurationMap);
                    java.lang.String string = obtainAttributes2.getString(0);
                    int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.getInputFormats;
                        if (context != null) {
                            getHighSpeedVideoSizes(string, androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.loadAnimator(context, resourceId2));
                        } else {
                            obtainAttributes2.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(this.getHighSpeedVideoFpsRangesFor, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(this.getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    static class AnimatedVectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState getHighSpeedVideoFpsRanges;

        AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.getHighSpeedVideoFpsRanges = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.newDrawable();
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor.setCallback(animatedVectorDrawableCompat.getHighResolutionOutputSizeshNQ4ISI);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.newDrawable(resources);
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor.setCallback(animatedVectorDrawableCompat.getHighResolutionOutputSizeshNQ4ISI);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.newDrawable(resources, theme);
            animatedVectorDrawableCompat.getHighSpeedVideoFpsRangesFor.setCallback(animatedVectorDrawableCompat.getHighResolutionOutputSizeshNQ4ISI);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.getHighSpeedVideoFpsRanges.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.getHighSpeedVideoFpsRanges.getChangingConfigurations();
        }
    }

    static class AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        android.animation.AnimatorSet getHighSpeedVideoFpsRanges;
        java.util.ArrayList<android.animation.Animator> getHighSpeedVideoFpsRangesFor;
        androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> getHighSpeedVideoSizes;

        AnimatedVectorDrawableCompatState(android.content.Context context, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, android.graphics.drawable.Drawable.Callback callback, android.content.res.Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = animatedVectorDrawableCompatState.getHighResolutionOutputSizeshNQ4ISI;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.Camera2StreamConfigurationMap;
                if (vectorDrawableCompat != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.Camera2StreamConfigurationMap = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.Camera2StreamConfigurationMap = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) constantState.newDrawable();
                    }
                    androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) this.Camera2StreamConfigurationMap.mutate();
                    this.Camera2StreamConfigurationMap = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.Camera2StreamConfigurationMap.setBounds(animatedVectorDrawableCompatState.Camera2StreamConfigurationMap.getBounds());
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(false);
                }
                java.util.ArrayList<android.animation.Animator> arrayList = animatedVectorDrawableCompatState.getHighSpeedVideoFpsRangesFor;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>(size);
                    this.getHighSpeedVideoSizes = new androidx.collection.ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        android.animation.Animator animator = animatedVectorDrawableCompatState.getHighSpeedVideoFpsRangesFor.get(i);
                        android.animation.Animator clone = animator.clone();
                        java.lang.String str = animatedVectorDrawableCompatState.getHighSpeedVideoSizes.get(animator);
                        clone.setTarget(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(str));
                        this.getHighSpeedVideoFpsRangesFor.add(clone);
                        this.getHighSpeedVideoSizes.put(clone, str);
                    }
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.animation.AnimatorSet();
            }
            this.getHighSpeedVideoFpsRanges.playTogether(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str, android.animation.Animator animator) {
        animator.setTarget(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(str));
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = new androidx.collection.ArrayMap<>();
        }
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor.add(animator);
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return ((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoFpsRangesFor).isRunning();
        }
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoFpsRangesFor).start();
        } else {
            if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isStarted()) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoFpsRangesFor).stop();
        } else {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.end();
        }
    }

    private static boolean getHighSpeedVideoSizes(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        return androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(animatedVectorDrawable, animationCallback.getPlatformCallback());
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                getHighSpeedVideoFpsRanges((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoFpsRangesFor, animationCallback);
                return;
            }
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new java.util.ArrayList<>();
            }
            if (this.Camera2StreamConfigurationMap.contains(animationCallback)) {
                return;
            }
            this.Camera2StreamConfigurationMap.add(animationCallback);
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new android.animation.AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(android.animation.Animator animator) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.Camera2StreamConfigurationMap);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.Camera2StreamConfigurationMap);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this);
                        }
                    }
                };
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.addListener(this.getHighSpeedVideoSizesFor);
        }
    }

    private static void getHighSpeedVideoFpsRanges(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.Api23Impl.getHighSpeedVideoFpsRanges(animatedVectorDrawable, animationCallback.getPlatformCallback());
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoSizesFor != null) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.removeListener(this.getHighSpeedVideoSizesFor);
            this.getHighSpeedVideoSizesFor = null;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            getHighSpeedVideoSizes((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoFpsRangesFor, animationCallback);
        }
        java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> arrayList = this.Camera2StreamConfigurationMap;
        if (arrayList == null) {
            return false;
        }
        boolean remove = arrayList.remove(animationCallback);
        if (this.Camera2StreamConfigurationMap.size() == 0) {
            Camera2StreamConfigurationMap();
        }
        return remove;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        Camera2StreamConfigurationMap();
        java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> arrayList = this.Camera2StreamConfigurationMap;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    public static void registerAnimationCallback(android.graphics.drawable.Drawable drawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        getHighSpeedVideoFpsRanges((android.graphics.drawable.AnimatedVectorDrawable) drawable, animationCallback);
    }

    public static boolean unregisterAnimationCallback(android.graphics.drawable.Drawable drawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof android.graphics.drawable.Animatable)) {
            return false;
        }
        return getHighSpeedVideoSizes((android.graphics.drawable.AnimatedVectorDrawable) drawable, animationCallback);
    }

    public static void clearAnimationCallbacks(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.Animatable) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(drawable);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
            return ((android.graphics.drawable.AnimatedVectorDrawable) obj).unregisterAnimationCallback((android.graphics.drawable.Animatable2.AnimationCallback) obj2);
        }

        static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            ((android.graphics.drawable.AnimatedVectorDrawable) obj).clearAnimationCallbacks();
        }

        static void getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.Object obj2) {
            ((android.graphics.drawable.AnimatedVectorDrawable) obj).registerAnimationCallback((android.graphics.drawable.Animatable2.AnimationCallback) obj2);
        }
    }
}
