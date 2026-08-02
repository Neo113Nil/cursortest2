package androidx.appcompat.graphics.drawable;

/* loaded from: classes5.dex */
public class AnimatedStateListDrawableCompat extends androidx.appcompat.graphics.drawable.StateListDrawableCompat implements androidx.core.graphics.drawable.TintAwareDrawable {
    private boolean Camera2StreamConfigurationMap;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition getHighSpeedVideoSizes;

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    AnimatedStateListDrawableCompat(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState, android.content.res.Resources resources) {
        super(null);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
        getHighResolutionOutputSizeshNQ4ISI(new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat create(android.content.Context context, int i, android.content.res.Resources.Theme theme) {
        int next;
        try {
            android.content.res.Resources resources = context.getResources();
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(context, resources, xml, asAttributeSet, theme);
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            return null;
        }
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat createFromXmlInner(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        java.lang.String name2 = xmlPullParser.getName();
        if (!name2.equals("animated-selector")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid animated-selector tag ");
            sb.append(name2);
            throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
        }
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat();
        animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
        return animatedStateListDrawableCompat;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat);
        setVisible(obtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        Camera2StreamConfigurationMap(obtainAttributes);
        getHighSpeedVideoFpsRangesFor(resources);
        obtainAttributes.recycle();
        getHighSpeedVideoFpsRangesFor(context, resources, xmlPullParser, attributeSet, theme);
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.getHighSpeedVideoSizes;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.getHighSpeedVideoFpsRanges();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public void addState(int[] iArr, android.graphics.drawable.Drawable drawable, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(drawable);
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int i, int i2, T t, boolean z) {
        androidx.core.util.ObjectsCompat.requireNonNull(t);
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(i, i2, t, z);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.getHighSpeedVideoSizes;
        if (transition != null) {
            transition.getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoSizes = null;
            getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(iArr);
        boolean z = Camera2StreamConfigurationMap != getHighResolutionOutputSizeshNQ4ISI() && (getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap) || getHighSpeedVideoSizes(Camera2StreamConfigurationMap));
        android.graphics.drawable.Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z : z;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        int highResolutionOutputSizeshNQ4ISI;
        int highSpeedVideoSizes;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition animatableTransition;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.getHighSpeedVideoSizes;
        if (transition != null) {
            if (i == this.getHighSpeedVideoFpsRanges) {
                return true;
            }
            if (i == this.getHighSpeedVideoFpsRangesFor && transition.getHighResolutionOutputSizeshNQ4ISI()) {
                transition.getHighSpeedVideoSizes();
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = i;
                return true;
            }
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
            transition.getHighSpeedVideoFpsRangesFor();
        } else {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState = this.getHighResolutionOutputSizeshNQ4ISI;
        int Camera2StreamConfigurationMap = animatedStateListState.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
        int Camera2StreamConfigurationMap2 = animatedStateListState.Camera2StreamConfigurationMap(i);
        if (Camera2StreamConfigurationMap2 == 0 || Camera2StreamConfigurationMap == 0 || (highSpeedVideoSizes = animatedStateListState.getHighSpeedVideoSizes(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2)) < 0) {
            return false;
        }
        boolean Camera2StreamConfigurationMap3 = animatedStateListState.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
        getHighSpeedVideoSizes(highSpeedVideoSizes);
        java.lang.Object current = getCurrent();
        if (current instanceof android.graphics.drawable.AnimationDrawable) {
            animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimationDrawableTransition((android.graphics.drawable.AnimationDrawable) current, animatedStateListState.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2), Camera2StreamConfigurationMap3);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) {
            animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition((androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof android.graphics.drawable.Animatable) {
                animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatableTransition((android.graphics.drawable.Animatable) current);
            }
            return false;
        }
        animatableTransition.getHighSpeedVideoFpsRanges();
        this.getHighSpeedVideoSizes = animatableTransition;
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = i;
        return true;
    }

    static abstract class Transition {
        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return false;
        }

        public abstract void getHighSpeedVideoFpsRanges();

        public abstract void getHighSpeedVideoFpsRangesFor();

        public void getHighSpeedVideoSizes() {
        }

        private Transition() {
        }
    }

    static class AnimatableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.graphics.drawable.Animatable getHighSpeedVideoFpsRanges;

        AnimatableTransition(android.graphics.drawable.Animatable animatable) {
            super();
            this.getHighSpeedVideoFpsRanges = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoFpsRanges.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRanges.stop();
        }
    }

    static class AnimationDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.animation.ObjectAnimator Camera2StreamConfigurationMap;
        private final boolean getHighSpeedVideoFpsRanges;

        AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator frameInterpolator = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator(animationDrawable, z);
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(frameInterpolator.getHighSpeedVideoFpsRangesFor());
            ofInt.setInterpolator(frameInterpolator);
            this.getHighSpeedVideoFpsRanges = z2;
            this.Camera2StreamConfigurationMap = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRanges() {
            this.Camera2StreamConfigurationMap.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoSizes() {
            this.Camera2StreamConfigurationMap.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRangesFor() {
            this.Camera2StreamConfigurationMap.cancel();
        }
    }

    static class AnimatedVectorDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getHighSpeedVideoSizes;

        AnimatedVectorDrawableTransition(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.getHighSpeedVideoSizes = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoSizes.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoSizes.stop();
        }
    }

    private void Camera2StreamConfigurationMap(android.content.res.TypedArray typedArray) {
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState = this.getHighResolutionOutputSizeshNQ4ISI;
        animatedStateListState.getHighResolutionOutputSizeshNQ4ISI |= androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        animatedStateListState.getHighSpeedVideoSizes(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedStateListState.release));
        animatedStateListState.getHighResolutionOutputSizeshNQ4ISI(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedStateListState.isOutputSupportedFor));
        animatedStateListState.getHighSpeedVideoSizes(typedArray.getInt(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedStateListState.CoroutineDebuggingKt));
        animatedStateListState.getHighResolutionOutputSizeshNQ4ISI(typedArray.getInt(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedStateListState.accessartificialFrame));
        setDither(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListState.getValidOutputFormatsForInputhNQ4ISI));
    }

    private void getHighSpeedVideoFpsRanges() {
        onStateChange(getState());
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    getHighResolutionOutputSizeshNQ4ISI(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    Camera2StreamConfigurationMap(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private int Camera2StreamConfigurationMap(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        android.graphics.drawable.Drawable drawable = resourceId3 > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z = obtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        obtainAttributes.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new org.xmlpull.v1.XmlPullParserException(sb2.toString());
        }
        if (resourceId == -1 || resourceId2 == -1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new org.xmlpull.v1.XmlPullParserException(sb3.toString());
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(resourceId, resourceId2, drawable, z);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem);
        int resourceId = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = obtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        android.graphics.drawable.Drawable drawable = resourceId2 > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
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
            if (xmlPullParser.getName().equals("vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new org.xmlpull.v1.XmlPullParserException(sb2.toString());
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, drawable, resourceId);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.Camera2StreamConfigurationMap && super.mutate() == this) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState getHighSpeedVideoSizes() {
        return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState(this.getHighResolutionOutputSizeshNQ4ISI, this, null);
    }

    static class AnimatedStateListState extends androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState {
        androidx.collection.SparseArrayCompat<java.lang.Integer> Camera2StreamConfigurationMap;
        androidx.collection.LongSparseArray<java.lang.Long> getHighSpeedVideoFpsRangesFor;

        private static long getHighSpeedVideoSizesFor(int i, int i2) {
            return i2 | (i << 32);
        }

        AnimatedStateListState(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState, androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat animatedStateListDrawableCompat, android.content.res.Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.getHighSpeedVideoFpsRangesFor = animatedStateListState.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = animatedStateListState.Camera2StreamConfigurationMap;
            } else {
                this.getHighSpeedVideoFpsRangesFor = new androidx.collection.LongSparseArray<>();
                this.Camera2StreamConfigurationMap = new androidx.collection.SparseArrayCompat<>();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.m1091clone();
            this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.m1092clone();
        }

        int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, android.graphics.drawable.Drawable drawable, boolean z) {
            int highSpeedVideoFpsRanges = super.getHighSpeedVideoFpsRanges(drawable);
            long highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = highSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor.append(highSpeedVideoSizesFor, java.lang.Long.valueOf(j2 | j));
            if (z) {
                this.getHighSpeedVideoFpsRangesFor.append(getHighSpeedVideoSizesFor(i2, i), java.lang.Long.valueOf(4294967296L | j2 | j));
            }
            return highSpeedVideoFpsRanges;
        }

        int getHighResolutionOutputSizeshNQ4ISI(int[] iArr, android.graphics.drawable.Drawable drawable, int i) {
            int highSpeedVideoFpsRangesFor = super.getHighSpeedVideoFpsRangesFor(iArr, drawable);
            this.Camera2StreamConfigurationMap.put(highSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(i));
            return highSpeedVideoFpsRangesFor;
        }

        int Camera2StreamConfigurationMap(int[] iArr) {
            int highSpeedVideoFpsRanges = super.getHighSpeedVideoFpsRanges(iArr);
            return highSpeedVideoFpsRanges >= 0 ? highSpeedVideoFpsRanges : super.getHighSpeedVideoFpsRanges(android.util.StateSet.WILD_CARD);
        }

        int Camera2StreamConfigurationMap(int i) {
            if (i < 0) {
                return 0;
            }
            return this.Camera2StreamConfigurationMap.get(i, 0).intValue();
        }

        int getHighSpeedVideoSizes(int i, int i2) {
            return (int) this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoSizesFor(i, i2), -1L).longValue();
        }

        boolean getHighSpeedVideoFpsRanges(int i, int i2) {
            return (this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoSizesFor(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean Camera2StreamConfigurationMap(int i, int i2) {
            return (this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoSizesFor(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat(this, resources);
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.getHighResolutionOutputSizeshNQ4ISI(drawableContainerState);
        if (drawableContainerState instanceof androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) drawableContainerState;
        }
    }

    static class FrameInterpolator implements android.animation.TimeInterpolator {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;

        FrameInterpolator(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z) {
            Camera2StreamConfigurationMap(animationDrawable, z);
        }

        int Camera2StreamConfigurationMap(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.getHighSpeedVideoFpsRangesFor = numberOfFrames;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.getHighSpeedVideoFpsRanges = new int[numberOfFrames];
            }
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return i;
        }

        int getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.getHighResolutionOutputSizeshNQ4ISI) + 0.5f);
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.getHighResolutionOutputSizeshNQ4ISI : 0.0f);
        }
    }
}
