package androidx.transition;

/* loaded from: classes7.dex */
public class Slide extends androidx.transition.Visibility {
    private int getHighSpeedVideoSizesFor;
    private androidx.transition.Slide.CalculateSlide getOutputMinFrameDuration;
    private static final android.animation.TimeInterpolator getOutputFormats = new android.view.animation.DecelerateInterpolator();
    private static final android.animation.TimeInterpolator getHighResolutionOutputSizeshNQ4ISI = new android.view.animation.AccelerateInterpolator();
    private static final androidx.transition.Slide.CalculateSlide Camera2StreamConfigurationMap = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.1
        @Override // androidx.transition.Slide.CalculateSlide
        public final float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide getInputFormats = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.2
        @Override // androidx.transition.Slide.CalculateSlide
        public final float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide getInputSizeshNQ4ISI = new androidx.transition.Slide.CalculateSlideVertical() { // from class: androidx.transition.Slide.3
        @Override // androidx.transition.Slide.CalculateSlide
        public final float getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide getHighSpeedVideoFpsRangesFor = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.4
        @Override // androidx.transition.Slide.CalculateSlide
        public final float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide getHighSpeedVideoFpsRanges = new androidx.transition.Slide.CalculateSlideHorizontal() { // from class: androidx.transition.Slide.5
        @Override // androidx.transition.Slide.CalculateSlide
        public final float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final androidx.transition.Slide.CalculateSlide getHighSpeedVideoSizes = new androidx.transition.Slide.CalculateSlideVertical() { // from class: androidx.transition.Slide.6
        @Override // androidx.transition.Slide.CalculateSlide
        public final float getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    interface CalculateSlide {
        float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view);

        float getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, android.view.View view);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface GravityFlag {
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    static abstract class CalculateSlideHorizontal implements androidx.transition.Slide.CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        /* synthetic */ CalculateSlideHorizontal(byte b) {
            this();
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public final float getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationY();
        }
    }

    static abstract class CalculateSlideVertical implements androidx.transition.Slide.CalculateSlide {
        private CalculateSlideVertical() {
        }

        /* synthetic */ CalculateSlideVertical(byte b) {
            this();
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public final float Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, android.view.View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = 80;
        setSlideEdge(80);
    }

    public Slide(int i) {
        this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = 80;
        setSlideEdge(i);
    }

    public Slide(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = 80;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getHighSpeedVideoSizesFor);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    public void setSlideEdge(int i) {
        if (i == 3) {
            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap;
        } else if (i == 5) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor;
        } else if (i == 48) {
            this.getOutputMinFrameDuration = getInputSizeshNQ4ISI;
        } else if (i == 80) {
            this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
        } else if (i == 8388611) {
            this.getOutputMinFrameDuration = getInputFormats;
        } else if (i == 8388613) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid slide direction");
        }
        this.getHighSpeedVideoSizesFor = i;
        androidx.transition.SidePropagation sidePropagation = new androidx.transition.SidePropagation();
        sidePropagation.setSide(i);
        setPropagation(sidePropagation);
    }

    public int getSlideEdge() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.TranslationAnimationCreator.Camera2StreamConfigurationMap(view, transitionValues2, iArr[0], iArr[1], this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(viewGroup, view), this.getOutputMinFrameDuration.getHighSpeedVideoSizes(viewGroup, view), translationX, translationY, getOutputFormats, this);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:slide:screenPosition");
        return androidx.transition.TranslationAnimationCreator.Camera2StreamConfigurationMap(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(viewGroup, view), this.getOutputMinFrameDuration.getHighSpeedVideoSizes(viewGroup, view), getHighResolutionOutputSizeshNQ4ISI, this);
    }
}
