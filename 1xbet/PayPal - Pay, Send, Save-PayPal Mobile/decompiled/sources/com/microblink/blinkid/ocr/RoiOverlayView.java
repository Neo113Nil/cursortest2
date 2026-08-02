package com.microblink.blinkid.ocr;

/* loaded from: classes10.dex */
public class RoiOverlayView extends android.widget.FrameLayout implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public static final float VIEWFINDER_DISTANCE = 0.02f;
    private android.view.View Camera2StreamConfigurationMap;
    com.microblink.blinkid.geometry.Rectangle getHighResolutionOutputSizeshNQ4ISI;
    private android.view.View getHighSpeedVideoFpsRanges;
    com.microblink.blinkid.geometry.Rectangle getHighSpeedVideoFpsRangesFor;
    private android.view.View getHighSpeedVideoSizes;
    private android.view.View getHighSpeedVideoSizesFor;
    private android.view.View getInputFormats;
    private android.view.View getInputSizeshNQ4ISI;
    private android.view.View getOutputFormats;
    private android.view.View getOutputMinFrameDuration;
    private android.view.View getOutputMinFrameDurationlomOqCM;
    private final android.os.Handler getOutputSizes;
    private android.view.View getOutputSizeshNQ4ISI;
    private android.view.View getOutputStallDuration;
    private android.view.View getOutputStallDurationlomOqCM;
    private android.view.View getValidOutputFormatsForInputhNQ4ISI;
    private android.view.View isOutputSupportedFor;
    private android.view.View unwrapAs;

    public interface RoiAnimationCallback {
        void onAnimationFinish();
    }

    public RoiOverlayView(android.content.Context context) {
        super(context);
        this.getOutputSizes = new android.os.Handler();
        this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.geometry.Rectangle(0.1f, 0.34f, 0.8f, 0.13f);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        getHighResolutionOutputSizeshNQ4ISI((com.microblink.blinkid.geometry.Rectangle) valueAnimator.getAnimatedValue());
    }

    public void setScanningRegion(com.microblink.blinkid.geometry.Rectangle rectangle) {
        getHighResolutionOutputSizeshNQ4ISI(rectangle);
        this.getHighSpeedVideoFpsRangesFor = rectangle;
    }

    public void setScanningRegionAnimated(final com.microblink.blinkid.geometry.Rectangle rectangle, final long j, final com.microblink.blinkid.ocr.RoiOverlayView.RoiAnimationCallback roiAnimationCallback) {
        this.getOutputSizes.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.ocr.RoiOverlayView.1
            @Override // java.lang.Runnable
            public void run() {
                com.microblink.blinkid.util.Log.d(com.microblink.blinkid.ocr.RoiOverlayView.this, "Starting quad animation", new java.lang.Object[0]);
                android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new com.microblink.blinkid.ocr.RectangleEvaluator(), com.microblink.blinkid.ocr.RoiOverlayView.this.getHighSpeedVideoFpsRangesFor, rectangle);
                ofObject.setDuration(j);
                ofObject.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofObject.addUpdateListener(com.microblink.blinkid.ocr.RoiOverlayView.this);
                ofObject.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.microblink.blinkid.ocr.RoiOverlayView.1.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(android.animation.Animator animator) {
                        com.microblink.blinkid.util.Log.i(com.microblink.blinkid.ocr.RoiOverlayView.this, "Animation canceled", new java.lang.Object[0]);
                        com.microblink.blinkid.ocr.RoiOverlayView roiOverlayView = com.microblink.blinkid.ocr.RoiOverlayView.this;
                        com.microblink.blinkid.geometry.Rectangle rectangle2 = roiOverlayView.getHighResolutionOutputSizeshNQ4ISI;
                        if (rectangle2 != null) {
                            roiOverlayView.getHighResolutionOutputSizeshNQ4ISI(rectangle2);
                        }
                        roiAnimationCallback.onAnimationFinish();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        com.microblink.blinkid.ocr.RoiOverlayView.AnonymousClass1 anonymousClass1 = com.microblink.blinkid.ocr.RoiOverlayView.AnonymousClass1.this;
                        com.microblink.blinkid.ocr.RoiOverlayView.this.getHighResolutionOutputSizeshNQ4ISI = null;
                        roiAnimationCallback.onAnimationFinish();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(android.animation.Animator animator) {
                        com.microblink.blinkid.ocr.RoiOverlayView roiOverlayView = com.microblink.blinkid.ocr.RoiOverlayView.this;
                        roiOverlayView.getHighResolutionOutputSizeshNQ4ISI = roiOverlayView.getHighSpeedVideoFpsRangesFor;
                    }
                });
                ofObject.start();
            }
        });
    }

    private void getHighSpeedVideoFpsRangesFor() {
        android.view.View.inflate(getContext(), com.microblink.blinkid.resources.Layouts.llIIlIIIll, this);
        this.unwrapAs = findViewById(com.microblink.blinkid.library.R.id.top_space_holder);
        this.getHighSpeedVideoSizes = findViewById(com.microblink.blinkid.library.R.id.left_space_holder);
        this.getInputFormats = findViewById(com.microblink.blinkid.library.R.id.right_space_holder);
        this.getOutputSizeshNQ4ISI = findViewById(com.microblink.blinkid.library.R.id.bottom_space_holder);
        this.getOutputFormats = findViewById(com.microblink.blinkid.library.R.id.horizontal_container);
        this.getOutputMinFrameDurationlomOqCM = findViewById(com.microblink.blinkid.library.R.id.viewfinder_top_space_holder);
        this.getOutputStallDuration = findViewById(com.microblink.blinkid.library.R.id.viewfinder_left_space_holder);
        this.getHighSpeedVideoFpsRanges = findViewById(com.microblink.blinkid.library.R.id.viewfinder_right_space_holder);
        this.getOutputStallDurationlomOqCM = findViewById(com.microblink.blinkid.library.R.id.viewfinder_bottom_space_holder);
        this.isOutputSupportedFor = findViewById(com.microblink.blinkid.library.R.id.viewfinder_horizontal_container);
        this.Camera2StreamConfigurationMap = findViewById(com.microblink.blinkid.library.R.id.scan_message_holder);
        this.getValidOutputFormatsForInputhNQ4ISI = findViewById(com.microblink.blinkid.library.R.id.scan_message_left_space_holder);
        this.getHighSpeedVideoSizesFor = findViewById(com.microblink.blinkid.library.R.id.scan_message_right_space_holder);
        this.getOutputMinFrameDuration = findViewById(com.microblink.blinkid.library.R.id.roi_window);
        this.getInputSizeshNQ4ISI = findViewById(com.microblink.blinkid.library.R.id.viewfinder);
    }

    public RoiOverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputSizes = new android.os.Handler();
        this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.geometry.Rectangle(0.1f, 0.34f, 0.8f, 0.13f);
        getHighSpeedVideoFpsRangesFor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.geometry.Rectangle rectangle) {
        float x = rectangle.getX();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.02f);
        float[] fArr = {x - 0.02f, rectangle.getY() - 0.02f, rectangle.getWidth() + rectangle.getX() + 0.02f, rectangle.getHeight() + rectangle.getY() + 0.02f};
        for (int i = 0; i < 4; i++) {
            double d = fArr[i];
            if (d > 1.0d || d < 0.0d) {
                com.microblink.blinkid.util.Log.w(this, "Illegal scanning region: (X, Y, W, H) = ({}, {}, {}, {}). Allowed scanning region intervals are: X and Y in [{}, {}];(X + Width + {}) < 1.0 and (Y + Height + {}) < 1.0.", java.lang.Float.valueOf(rectangle.getX()), java.lang.Float.valueOf(rectangle.getY()), java.lang.Float.valueOf(rectangle.getWidth()), java.lang.Float.valueOf(rectangle.getHeight()), valueOf, java.lang.Float.valueOf(0.98f), valueOf, valueOf);
            }
        }
        this.unwrapAs.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, rectangle.getY()));
        this.getOutputSizeshNQ4ISI.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f - (rectangle.getHeight() + rectangle.getY())));
        this.getOutputFormats.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, rectangle.getHeight()));
        this.getHighSpeedVideoSizes.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, rectangle.getX()));
        this.getInputFormats.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f - (rectangle.getWidth() + rectangle.getX())));
        this.getOutputMinFrameDuration.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, rectangle.getWidth()));
        this.getOutputMinFrameDurationlomOqCM.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, rectangle.getY() - 0.02f));
        this.getOutputStallDurationlomOqCM.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f - ((rectangle.getHeight() + rectangle.getY()) + 0.02f)));
        this.isOutputSupportedFor.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, rectangle.getHeight() + 0.04f));
        this.getOutputStallDuration.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, rectangle.getX() - 0.02f));
        this.getHighSpeedVideoFpsRanges.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f - ((rectangle.getWidth() + rectangle.getX()) + 0.02f)));
        this.getInputSizeshNQ4ISI.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, rectangle.getWidth() + 0.04f));
        float width = (rectangle.getWidth() + (rectangle.getX() * 2.0f)) - 1.0f;
        if (width < 0.0f) {
            this.getHighSpeedVideoSizesFor.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, -width));
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, width));
        }
        this.Camera2StreamConfigurationMap.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f - java.lang.Math.abs(width)));
        this.getHighSpeedVideoFpsRangesFor = rectangle;
    }

    public RoiOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputSizes = new android.os.Handler();
        this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.geometry.Rectangle(0.1f, 0.34f, 0.8f, 0.13f);
        addView(android.view.LayoutInflater.from(context).inflate(com.microblink.blinkid.resources.Layouts.llIIlIIIll, this));
        getHighSpeedVideoFpsRangesFor();
    }
}
