package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class MotionEffect extends androidx.constraintlayout.motion.widget.MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final java.lang.String TAG = "FadeMove";
    public static final int WEST = 3;
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    public MotionEffect(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = 0.1f;
        this.getHighSpeedVideoFpsRangesFor = 49;
        this.getHighResolutionOutputSizeshNQ4ISI = 50;
        this.getInputFormats = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = true;
        this.getOutputFormats = -1;
        this.getHighSpeedVideoSizes = -1;
    }

    public MotionEffect(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRanges = 0.1f;
        this.getHighSpeedVideoFpsRangesFor = 49;
        this.getHighResolutionOutputSizeshNQ4ISI = 50;
        this.getInputFormats = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = true;
        this.getOutputFormats = -1;
        this.getHighSpeedVideoSizes = -1;
        getHighResolutionOutputSizeshNQ4ISI(context, attributeSet);
    }

    public MotionEffect(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = 0.1f;
        this.getHighSpeedVideoFpsRangesFor = 49;
        this.getHighResolutionOutputSizeshNQ4ISI = 50;
        this.getInputFormats = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = true;
        this.getOutputFormats = -1;
        this.getHighSpeedVideoSizes = -1;
        getHighResolutionOutputSizeshNQ4ISI(context, attributeSet);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor = i2;
                    this.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(java.lang.Math.min(i2, 99), 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI = i3;
                    this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.max(java.lang.Math.min(i3, 99), 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_translationX) {
                    this.getInputFormats = obtainStyledAttributes.getDimensionPixelOffset(index, this.getInputFormats);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_translationY) {
                    this.getInputSizeshNQ4ISI = obtainStyledAttributes.getDimensionPixelOffset(index, this.getInputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_alpha) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getFloat(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_move) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoSizes);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_strict) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getBoolean(index, this.Camera2StreamConfigurationMap);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.getOutputFormats = obtainStyledAttributes.getResourceId(index, this.getOutputFormats);
                }
            }
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.getHighSpeedVideoFpsRangesFor = i4 - 1;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a0, code lost:
    
        if (r15 == 0.0f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
    
        if (r14 == 0.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017e, code lost:
    
        if (r14 == 0.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018e, code lost:
    
        if (r15 == 0.0f) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> hashMap) {
        androidx.constraintlayout.motion.widget.Key key;
        androidx.constraintlayout.motion.widget.Key key2;
        androidx.constraintlayout.motion.widget.Key key3;
        int i;
        java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> hashMap2 = hashMap;
        android.view.View[] views = getViews((androidx.constraintlayout.widget.ConstraintLayout) getParent());
        if (views == null) {
            androidx.constraintlayout.motion.widget.Debug.getLoc();
            return;
        }
        androidx.constraintlayout.motion.widget.Key keyAttributes = new androidx.constraintlayout.motion.widget.KeyAttributes();
        androidx.constraintlayout.motion.widget.Key keyAttributes2 = new androidx.constraintlayout.motion.widget.KeyAttributes();
        keyAttributes.setValue("alpha", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        keyAttributes2.setValue("alpha", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        keyAttributes.setFramePosition(this.getHighSpeedVideoFpsRangesFor);
        keyAttributes2.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition = new androidx.constraintlayout.motion.widget.KeyPosition();
        keyPosition.setFramePosition(this.getHighSpeedVideoFpsRangesFor);
        keyPosition.setType(0);
        keyPosition.setValue("percentX", 0);
        keyPosition.setValue("percentY", 0);
        androidx.constraintlayout.motion.widget.KeyPosition keyPosition2 = new androidx.constraintlayout.motion.widget.KeyPosition();
        keyPosition2.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI);
        keyPosition2.setType(0);
        keyPosition2.setValue("percentX", 1);
        keyPosition2.setValue("percentY", 1);
        androidx.constraintlayout.motion.widget.Key key4 = null;
        if (this.getInputFormats > 0) {
            key = new androidx.constraintlayout.motion.widget.KeyAttributes();
            key2 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            key.setValue("translationX", java.lang.Integer.valueOf(this.getInputFormats));
            key.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI);
            key2.setValue("translationX", 0);
            key2.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI - 1);
        } else {
            key = null;
            key2 = null;
        }
        if (this.getInputSizeshNQ4ISI > 0) {
            key4 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            key3 = new androidx.constraintlayout.motion.widget.KeyAttributes();
            key4.setValue("translationY", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            key4.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI);
            key3.setValue("translationY", 0);
            key3.setFramePosition(this.getHighResolutionOutputSizeshNQ4ISI - 1);
        } else {
            key3 = null;
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 == -1) {
            int[] iArr = new int[4];
            for (android.view.View view : views) {
                androidx.constraintlayout.motion.widget.MotionController motionController = hashMap2.get(view);
                if (motionController != null) {
                    float finalX = motionController.getFinalX() - motionController.getStartX();
                    float finalY = motionController.getFinalY() - motionController.getStartY();
                    if (finalY < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (finalY > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (finalX > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (finalX < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i3 = iArr[0];
            i2 = 0;
            for (int i4 = 1; i4 < 4; i4++) {
                int i5 = iArr[i4];
                if (i3 < i5) {
                    i2 = i4;
                    i3 = i5;
                }
            }
        }
        int i6 = 0;
        while (i6 < views.length) {
            androidx.constraintlayout.motion.widget.MotionController motionController2 = hashMap2.get(views[i6]);
            if (motionController2 != null) {
                float finalX2 = motionController2.getFinalX() - motionController2.getStartX();
                float finalY2 = motionController2.getFinalY() - motionController2.getStartY();
                if (i2 == 0) {
                    if (finalY2 > 0.0f) {
                        if (this.Camera2StreamConfigurationMap) {
                        }
                    }
                    i = this.getOutputFormats;
                    if (i != -1) {
                        motionController2.addKey(keyAttributes);
                        motionController2.addKey(keyAttributes2);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.getInputFormats > 0) {
                            motionController2.addKey(key);
                            motionController2.addKey(key2);
                        }
                        if (this.getInputSizeshNQ4ISI > 0) {
                            motionController2.addKey(key4);
                            motionController2.addKey(key3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i, motionController2);
                    }
                } else if (i2 == 1) {
                    if (finalY2 < 0.0f) {
                        if (this.Camera2StreamConfigurationMap) {
                        }
                    }
                    i = this.getOutputFormats;
                    if (i != -1) {
                    }
                } else if (i2 == 2) {
                    if (finalX2 < 0.0f) {
                        if (this.Camera2StreamConfigurationMap) {
                        }
                    }
                    i = this.getOutputFormats;
                    if (i != -1) {
                    }
                } else {
                    if (i2 == 3) {
                        if (finalX2 > 0.0f) {
                            if (this.Camera2StreamConfigurationMap) {
                            }
                        }
                    }
                    i = this.getOutputFormats;
                    if (i != -1) {
                    }
                }
                i6++;
                hashMap2 = hashMap;
            }
            i6++;
            hashMap2 = hashMap;
        }
    }
}
