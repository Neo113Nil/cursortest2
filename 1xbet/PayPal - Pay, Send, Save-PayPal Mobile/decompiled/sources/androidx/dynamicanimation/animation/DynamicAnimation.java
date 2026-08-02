package androidx.dynamicanimation.animation;

/* loaded from: classes3.dex */
public abstract class DynamicAnimation<T extends androidx.dynamicanimation.animation.DynamicAnimation<T>> implements androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    float Camera2StreamConfigurationMap;
    final androidx.dynamicanimation.animation.FloatPropertyCompat getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    float getHighSpeedVideoSizesFor;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener> getInputFormats;
    final java.lang.Object getInputSizeshNQ4ISI;
    float getOutputFormats;
    private long getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener> getOutputStallDuration;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.1
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setTranslationX(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.2
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setTranslationY(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Z = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("translationZ") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.3
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return androidx.core.view.ViewCompat.getTranslationZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            androidx.core.view.ViewCompat.setTranslationZ(view, f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scaleX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.4
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setScaleX(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scaleY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.5
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setScaleY(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty(androidx.constraintlayout.motion.widget.Key.ROTATION) { // from class: androidx.dynamicanimation.animation.DynamicAnimation.6
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setRotation(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("rotationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.7
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setRotationX(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("rotationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.8
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setRotationY(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("x") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.9
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setX(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("y") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.10
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setY(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Z = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("z") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.11
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return androidx.core.view.ViewCompat.getZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            androidx.core.view.ViewCompat.setZ(view, f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ALPHA = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("alpha") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.12
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setAlpha(f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_X = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scrollX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.13
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setScrollX((int) f);
        }
    };
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_Y = new androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty("scrollY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.14
        {
            byte b = 0;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(android.view.View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(android.view.View view, float f) {
            view.setScrollY((int) f);
        }
    };

    public interface OnAnimationEndListener {
        void onAnimationEnd(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, float f, float f2);
    }

    abstract boolean Camera2StreamConfigurationMap(long j);

    abstract void getHighSpeedVideoSizes(float f);

    public static abstract class ViewProperty extends androidx.dynamicanimation.animation.FloatPropertyCompat<android.view.View> {
        /* synthetic */ ViewProperty(java.lang.String str, byte b) {
            this(str);
        }

        private ViewProperty(java.lang.String str) {
            super(str);
        }
    }

    static class MassState {
        float Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRanges;

        MassState() {
        }
    }

    DynamicAnimation(final androidx.dynamicanimation.animation.FloatValueHolder floatValueHolder) {
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoSizesFor = Float.MAX_VALUE;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = Float.MAX_VALUE;
        this.Camera2StreamConfigurationMap = -3.4028235E38f;
        this.getOutputMinFrameDuration = 0L;
        this.getInputFormats = new java.util.ArrayList<>();
        this.getOutputStallDuration = new java.util.ArrayList<>();
        this.getInputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.dynamicanimation.animation.FloatPropertyCompat("FloatValueHolder") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.15
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(java.lang.Object obj) {
                return floatValueHolder.getValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(java.lang.Object obj, float f) {
                floatValueHolder.setValue(f);
            }
        };
        this.getOutputMinFrameDurationlomOqCM = 1.0f;
    }

    <K> DynamicAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat) {
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoSizesFor = Float.MAX_VALUE;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = Float.MAX_VALUE;
        this.Camera2StreamConfigurationMap = -3.4028235E38f;
        this.getOutputMinFrameDuration = 0L;
        this.getInputFormats = new java.util.ArrayList<>();
        this.getOutputStallDuration = new java.util.ArrayList<>();
        this.getInputSizeshNQ4ISI = k;
        this.getHighResolutionOutputSizeshNQ4ISI = floatPropertyCompat;
        if (floatPropertyCompat == ROTATION || floatPropertyCompat == ROTATION_X || floatPropertyCompat == ROTATION_Y) {
            this.getOutputMinFrameDurationlomOqCM = 0.1f;
            return;
        }
        if (floatPropertyCompat == ALPHA) {
            this.getOutputMinFrameDurationlomOqCM = 0.00390625f;
        } else if (floatPropertyCompat == SCALE_X || floatPropertyCompat == SCALE_Y) {
            this.getOutputMinFrameDurationlomOqCM = 0.00390625f;
        } else {
            this.getOutputMinFrameDurationlomOqCM = 1.0f;
        }
    }

    public T setStartValue(float f) {
        this.getHighSpeedVideoSizesFor = f;
        this.getHighSpeedVideoSizes = true;
        return this;
    }

    public T setStartVelocity(float f) {
        this.getOutputFormats = f;
        return this;
    }

    public T setMaxValue(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        return this;
    }

    public T setMinValue(float f) {
        this.Camera2StreamConfigurationMap = f;
        return this;
    }

    public T addEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        if (!this.getInputFormats.contains(onAnimationEndListener)) {
            this.getInputFormats.add(onAnimationEndListener);
        }
        return this;
    }

    public void removeEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener> arrayList = this.getInputFormats;
        int indexOf = arrayList.indexOf(onAnimationEndListener);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public T addUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener onAnimationUpdateListener) {
        if (isRunning()) {
            throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.getOutputStallDuration.contains(onAnimationUpdateListener)) {
            this.getOutputStallDuration.add(onAnimationUpdateListener);
        }
        return this;
    }

    public void removeUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener onAnimationUpdateListener) {
        java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener> arrayList = this.getOutputStallDuration;
        int indexOf = arrayList.indexOf(onAnimationUpdateListener);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public T setMinimumVisibleChange(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.getOutputMinFrameDurationlomOqCM = f;
        getHighSpeedVideoSizes(f * 0.75f);
        return this;
    }

    public float getMinimumVisibleChange() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    private static <T> void getHighSpeedVideoFpsRanges(java.util.ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void start() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.getHighSpeedVideoFpsRanges;
        if (z || z) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        if (!this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI.getValue(this.getInputSizeshNQ4ISI);
        }
        float f = this.getHighSpeedVideoSizesFor;
        if (f > this.getHighSpeedVideoFpsRangesFor || f < this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.AnimationHandler highSpeedVideoFpsRanges = androidx.dynamicanimation.animation.AnimationHandler.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.size() == 0) {
            if (highSpeedVideoFpsRanges.getInputFormats == null) {
                highSpeedVideoFpsRanges.getInputFormats = new androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
            }
            highSpeedVideoFpsRanges.getInputFormats.getHighSpeedVideoFpsRangesFor();
        }
        if (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.contains(this)) {
            return;
        }
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.add(this);
    }

    public void cancel() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI(true);
        }
    }

    public boolean isRunning() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public boolean doAnimationFrame(long j) {
        long j2 = this.getOutputMinFrameDuration;
        if (j2 == 0) {
            this.getOutputMinFrameDuration = j;
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
            return false;
        }
        this.getOutputMinFrameDuration = j;
        boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(j - j2);
        float min = java.lang.Math.min(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizesFor = min;
        float max = java.lang.Math.max(min, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizesFor = max;
        getHighSpeedVideoFpsRanges(max);
        if (Camera2StreamConfigurationMap) {
            getHighResolutionOutputSizeshNQ4ISI(false);
        }
        return Camera2StreamConfigurationMap;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighSpeedVideoFpsRanges = false;
        androidx.dynamicanimation.animation.AnimationHandler highSpeedVideoFpsRanges = androidx.dynamicanimation.animation.AnimationHandler.getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.Camera2StreamConfigurationMap.remove(this);
        int indexOf = highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.indexOf(this);
        if (indexOf >= 0) {
            highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.set(indexOf, null);
            highSpeedVideoFpsRanges.getHighSpeedVideoSizesFor = true;
        }
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = false;
        for (int i = 0; i < this.getInputFormats.size(); i++) {
            if (this.getInputFormats.get(i) != null) {
                this.getInputFormats.get(i).onAnimationEnd(this, z, this.getHighSpeedVideoSizesFor, this.getOutputFormats);
            }
        }
        getHighSpeedVideoFpsRanges(this.getInputFormats);
    }

    private void getHighSpeedVideoFpsRanges(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(this.getInputSizeshNQ4ISI, f);
        for (int i = 0; i < this.getOutputStallDuration.size(); i++) {
            if (this.getOutputStallDuration.get(i) != null) {
                this.getOutputStallDuration.get(i).onAnimationUpdate(this, this.getHighSpeedVideoSizesFor, this.getOutputFormats);
            }
        }
        getHighSpeedVideoFpsRanges(this.getOutputStallDuration);
    }

    final float Camera2StreamConfigurationMap() {
        return this.getOutputMinFrameDurationlomOqCM * 0.75f;
    }
}
