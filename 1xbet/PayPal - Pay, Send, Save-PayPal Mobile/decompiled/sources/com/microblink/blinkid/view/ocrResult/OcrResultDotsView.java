package com.microblink.blinkid.view.ocrResult;

/* loaded from: classes10.dex */
public class OcrResultDotsView extends android.view.ViewGroup implements com.microblink.blinkid.view.ocrResult.IOcrResultView, com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView, com.microblink.blinkid.hardware.orientation.OrientationChangeListener {
    public static final int DEFAULT_NUMBER_OF_DOTS = 50;
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final android.widget.ImageView[] getHighSpeedVideoFpsRanges;
    private final android.os.Handler getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private final java.util.concurrent.ConcurrentLinkedQueue getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private final java.security.SecureRandom getOutputMinFrameDuration;
    private com.microblink.blinkid.hardware.orientation.Orientation getOutputStallDuration;

    /* renamed from: com.microblink.blinkid.view.ocrResult.OcrResultDotsView$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public OcrResultDotsView(android.content.Context context, int i, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this(context, i, orientation, 50);
    }

    @Override // com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView
    public void addDisplayablePointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("method is intended to be called from non-UI thread");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator<com.microblink.blinkid.geometry.Point> it = displayablePointsDetection.getTransformedPointSet().getPoints().iterator();
        while (it.hasNext()) {
            this.getInputSizeshNQ4ISI.add(new android.util.Pair(it.next(), java.lang.Long.valueOf(currentTimeMillis)));
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // com.microblink.blinkid.view.ocrResult.IOcrResultView
    public void addOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("method is intended to be called from non-UI thread");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.microblink.blinkid.results.ocr.OcrBlock[] blocks = displayableOcrResult.getOcrResult().getBlocks();
        if (blocks != null) {
            for (com.microblink.blinkid.results.ocr.OcrBlock ocrBlock : blocks) {
                com.microblink.blinkid.results.ocr.OcrLine[] lines = ocrBlock.getLines();
                if (lines != null) {
                    for (com.microblink.blinkid.results.ocr.OcrLine ocrLine : lines) {
                        com.microblink.blinkid.results.ocr.CharWithVariants[] chars = ocrLine.getChars();
                        if (chars != null) {
                            int i = 1;
                            for (int i2 = 1; i < chars.length - i2; i2 = 1) {
                                android.graphics.RectF rectF = chars[i].getChar().getPosition().toRectF();
                                displayableOcrResult.getTransformMatrix().mapRect(rectF);
                                this.getInputSizeshNQ4ISI.add(new android.util.Pair(new com.microblink.blinkid.geometry.Point(rectF.centerX(), rectF.centerY()), java.lang.Long.valueOf(currentTimeMillis)));
                                i++;
                            }
                        }
                    }
                }
            }
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void clearDisplayedContent() {
        this.getInputSizeshNQ4ISI.clear();
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (int) (this.getHighSpeedVideoSizesFor * 0.04761905f);
        this.getOutputFormats = getWidth();
        this.Camera2StreamConfigurationMap = getHeight();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i7 = i5 / 2;
                childAt.layout(i - i7, i2 - i7, i + i7, i7 + i2);
            }
        }
    }

    @Override // com.microblink.blinkid.hardware.orientation.OrientationChangeListener
    public void onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.getOutputStallDuration = orientation;
    }

    @Override // com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView
    public void setDisplayablePointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        this.getInputSizeshNQ4ISI.clear();
        addDisplayablePointsDetection(displayablePointsDetection);
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void setHostActivityOrientation(int i) {
        this.getInputFormats = i;
    }

    @Override // com.microblink.blinkid.view.ocrResult.IOcrResultView
    public void setOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
        this.getInputSizeshNQ4ISI.clear();
        addOcrResult(displayableOcrResult);
    }

    public OcrResultDotsView(android.content.Context context, int i, com.microblink.blinkid.hardware.orientation.Orientation orientation, int i2) {
        super(context);
        this.getInputSizeshNQ4ISI = new java.util.concurrent.ConcurrentLinkedQueue();
        this.getOutputFormats = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getInputFormats = 1;
        this.getOutputStallDuration = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        setBackgroundColor(0);
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("View must be created from main thread");
        }
        if (i2 <= 0) {
            throw new java.lang.RuntimeException("mNumberOfDots parameter must be positive number");
        }
        this.getHighSpeedVideoSizes = i2;
        this.getOutputMinFrameDuration = new java.security.SecureRandom();
        this.getHighSpeedVideoFpsRangesFor = new android.os.Handler();
        this.getInputFormats = i;
        if (orientation != null && orientation != com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            this.getOutputStallDuration = orientation;
        }
        this.getHighSpeedVideoSizesFor = context.getResources().getDisplayMetrics().densityDpi;
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(context.getResources(), com.microblink.blinkid.library.R.drawable.mb_dot);
        this.getHighSpeedVideoFpsRanges = new android.widget.ImageView[i2];
        for (int i3 = 0; i3 < this.getHighSpeedVideoSizes; i3++) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(decodeResource);
            imageView.setVisibility(4);
            this.getHighSpeedVideoFpsRanges[i3] = imageView;
            addView(imageView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v3 */
    private void getHighSpeedVideoFpsRangesFor() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.getHighResolutionOutputSizeshNQ4ISI || this.getInputSizeshNQ4ISI.isEmpty()) {
            return;
        }
        int i = 1;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            android.util.Pair pair = (android.util.Pair) this.getInputSizeshNQ4ISI.poll();
            if (pair == null) {
                break;
            }
            if (((java.lang.Long) pair.second).longValue() + 1500 > currentTimeMillis) {
                arrayList.add((com.microblink.blinkid.geometry.Point) pair.first);
            }
            i = 1;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        while (arrayList.size() > this.getHighSpeedVideoSizes) {
            arrayList.remove(this.getOutputMinFrameDuration.nextInt(arrayList.size()));
        }
        int i2 = 2;
        int size = arrayList.size() * 2;
        float[] fArr = new float[size];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            com.microblink.blinkid.geometry.Point point = (com.microblink.blinkid.geometry.Point) arrayList.get(i4);
            int i5 = i4 * 2;
            fArr[i5] = point.getX();
            fArr[i5 + i] = point.getY();
        }
        int i6 = size / 2;
        int i7 = this.getInputFormats;
        int i8 = 9;
        long j = (long) (((i7 == i || i7 == 9) ? this.Camera2StreamConfigurationMap / this.getHighSpeedVideoSizesFor : this.getOutputFormats / this.getHighSpeedVideoSizesFor) * 150.0f);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i6);
        android.view.animation.Animation.AnimationListener animationListener = new android.view.animation.Animation.AnimationListener() { // from class: com.microblink.blinkid.view.ocrResult.OcrResultDotsView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.microblink.blinkid.view.ocrResult.OcrResultDotsView.this.getHighResolutionOutputSizeshNQ4ISI = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }
        };
        int i9 = 0;
        while (i9 < i6) {
            int i10 = this.getInputFormats;
            if (i10 != 0) {
                if (i10 == i) {
                    float f6 = this.getOutputFormats;
                    int i11 = i9 * 2;
                    f5 = f6 - (fArr[i11 + 1] * f6);
                    f2 = this.Camera2StreamConfigurationMap * fArr[i11];
                } else if (i10 == 8) {
                    float f7 = this.getOutputFormats;
                    int i12 = i9 * 2;
                    f5 = f7 - (fArr[i12] * f7);
                    float f8 = this.Camera2StreamConfigurationMap;
                    f2 = f8 - (fArr[i12 + i] * f8);
                } else {
                    if (i10 != i8) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't draw ocr dots for host activity orientation: ");
                        sb.append(this.getInputFormats);
                        com.microblink.blinkid.util.Log.w(this, sb.toString(), new java.lang.Object[i3]);
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        return;
                    }
                    int i13 = i9 * 2;
                    f = fArr[i13 + 1] * this.getOutputFormats;
                    float f9 = this.Camera2StreamConfigurationMap;
                    f2 = f9 - (fArr[i13] * f9);
                }
                f = f5;
            } else {
                int i14 = i9 * 2;
                f = fArr[i14] * this.getOutputFormats;
                f2 = this.Camera2StreamConfigurationMap * fArr[i14 + i];
            }
            int i15 = com.microblink.blinkid.view.ocrResult.OcrResultDotsView.AnonymousClass4.Camera2StreamConfigurationMap[this.getOutputStallDuration.ordinal()];
            if (i15 != i) {
                if (i15 == i2) {
                    f4 = f / this.getOutputFormats;
                } else if (i15 == 3) {
                    f3 = f2 / this.Camera2StreamConfigurationMap;
                } else {
                    if (i15 != 4) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't draw ocr dots for recognizer orientation: ");
                        sb2.append(this.getOutputStallDuration);
                        com.microblink.blinkid.util.Log.w(this, sb2.toString(), new java.lang.Object[i3]);
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        return;
                    }
                    f4 = f2 / this.Camera2StreamConfigurationMap;
                }
                f3 = 1.0f - f4;
            } else {
                f3 = f / this.getOutputFormats;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            long j2 = (long) (f3 * j);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            float f10 = f;
            alphaAnimation.setDuration(200L);
            alphaAnimation.setStartOffset(j2);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setStartOffset(j2 + 200);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(f10, f10, f2, f2);
            translateAnimation.setDuration(0L);
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            if (i9 == i6 - 1) {
                animationSet.setStartOffset(0L);
                animationSet.setDuration(j);
                animationSet.setAnimationListener(animationListener);
            } else {
                final android.widget.ImageView imageView = this.getHighSpeedVideoFpsRanges[i9];
                animationSet.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.microblink.blinkid.view.ocrResult.OcrResultDotsView.2
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(android.view.animation.Animation animation) {
                        imageView.setVisibility(4);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(android.view.animation.Animation animation) {
                        imageView.setVisibility(0);
                    }
                });
            }
            arrayList3.add(animationSet);
            i9++;
            arrayList2 = arrayList3;
            i3 = 0;
            i = 1;
            i2 = 2;
            i8 = 9;
        }
        final java.util.ArrayList arrayList4 = arrayList2;
        this.getHighSpeedVideoFpsRangesFor.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.view.ocrResult.OcrResultDotsView.3
            @Override // java.lang.Runnable
            public void run() {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    com.microblink.blinkid.view.ocrResult.OcrResultDotsView.this.getHighSpeedVideoFpsRanges[i16].startAnimation((android.view.animation.Animation) arrayList4.get(i16));
                }
            }
        });
    }
}
