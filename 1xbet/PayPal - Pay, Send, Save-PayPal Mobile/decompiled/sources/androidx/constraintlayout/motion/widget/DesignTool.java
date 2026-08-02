package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class DesignTool {
    static final java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> getHighSpeedVideoFpsRangesFor;
    static final java.util.HashMap<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
    private androidx.constraintlayout.motion.widget.MotionScene getInputFormats;
    private final androidx.constraintlayout.motion.widget.MotionLayout getInputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges = null;
    private java.lang.String Camera2StreamConfigurationMap = null;
    private int getOutputFormats = -1;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    static {
        java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> hashMap = new java.util.HashMap<>();
        getHighSpeedVideoFpsRangesFor = hashMap;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        getHighSpeedVideoSizes = hashMap2;
        hashMap.put(android.util.Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(android.util.Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(android.util.Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(android.util.Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(android.util.Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(android.util.Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(android.util.Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(android.util.Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(android.util.Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(android.util.Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(android.util.Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(android.util.Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(android.util.Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.getInputSizeshNQ4ISI = motionLayout;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((java.lang.Integer.valueOf(str.substring(0, indexOf)).intValue() * i) / 160.0f);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> hashMap, int i2, int i3) {
        java.lang.String str = getHighSpeedVideoFpsRangesFor.get(android.util.Pair.create(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        java.lang.String str2 = hashMap.get(str);
        if (str2 != null) {
            java.lang.String str3 = getHighSpeedVideoSizes.get(str);
            int highResolutionOutputSizeshNQ4ISI = str3 != null ? getHighResolutionOutputSizeshNQ4ISI(i, hashMap.get(str3)) : 0;
            constraintSet.connect(view.getId(), i2, java.lang.Integer.parseInt(str2), i3, highResolutionOutputSizeshNQ4ISI);
        }
    }

    private static void Camera2StreamConfigurationMap(androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> hashMap, int i) {
        java.lang.String str;
        if (i != 1) {
            str = "layout_constraintHorizontal_bias";
        } else {
            str = "layout_constraintVertical_bias";
        }
        java.lang.String str2 = hashMap.get(str);
        if (str2 != null) {
            if (i == 0) {
                constraintSet.setHorizontalBias(view.getId(), java.lang.Float.parseFloat(str2));
            } else if (i == 1) {
                constraintSet.setVerticalBias(view.getId(), java.lang.Float.parseFloat(str2));
            }
        }
    }

    private static void getHighSpeedVideoSizes(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> hashMap, int i2) {
        java.lang.String str;
        if (i2 != 1) {
            str = "layout_width";
        } else {
            str = "layout_height";
        }
        java.lang.String str2 = hashMap.get(str);
        if (str2 != null) {
            int highResolutionOutputSizeshNQ4ISI = !str2.equalsIgnoreCase("wrap_content") ? getHighResolutionOutputSizeshNQ4ISI(i, str2) : -2;
            if (i2 == 0) {
                constraintSet.constrainWidth(view.getId(), highResolutionOutputSizeshNQ4ISI);
            } else {
                constraintSet.constrainHeight(view.getId(), highResolutionOutputSizeshNQ4ISI);
            }
        }
    }

    public int getAnimationPath(java.lang.Object obj, float[] fArr, int i) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            return -1;
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.getHighSpeedVideoFpsRangesFor(fArr, i);
        return i;
    }

    public void getAnimationRectangles(java.lang.Object obj, float[] fArr) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame != null) {
            int duration = this.getInputSizeshNQ4ISI.accessartificialFrame.getDuration() / 16;
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(obj);
            if (motionController == null) {
                return;
            }
            float f = 1.0f / (duration - 1);
            for (int i = 0; i < duration; i++) {
                motionController.toString[0].getPos(motionController.getHighResolutionOutputSizeshNQ4ISI(i * f, (float[]) null), motionController.getOutputSizeshNQ4ISI);
                motionController.coroutineCreation.Camera2StreamConfigurationMap(motionController.getOutputMinFrameDurationlomOqCM, motionController.getOutputSizeshNQ4ISI, fArr, i * 8);
            }
        }
    }

    public int getAnimationKeyFrames(java.lang.Object obj, float[] fArr) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            return -1;
        }
        int duration = this.getInputSizeshNQ4ISI.accessartificialFrame.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.getHighResolutionOutputSizeshNQ4ISI(fArr, (int[]) null);
        return duration;
    }

    public void setToolPosition(float f) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            this.getInputSizeshNQ4ISI.accessartificialFrame = this.getInputFormats;
        }
        this.getInputSizeshNQ4ISI.setProgress(f);
        this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(true);
        this.getInputSizeshNQ4ISI.requestLayout();
        this.getInputSizeshNQ4ISI.invalidate();
    }

    public java.lang.String getStartState() {
        int startState = this.getInputSizeshNQ4ISI.getStartState();
        if (this.getOutputFormats == startState) {
            return this.getHighSpeedVideoFpsRanges;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        java.lang.String lookUpConstraintName = motionScene == null ? null : motionScene.lookUpConstraintName(startState);
        if (lookUpConstraintName != null) {
            this.getHighSpeedVideoFpsRanges = lookUpConstraintName;
            this.getOutputFormats = startState;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.getInputSizeshNQ4ISI.accessartificialFrame;
        if (motionScene2 == null) {
            return null;
        }
        return motionScene2.lookUpConstraintName(startState);
    }

    public java.lang.String getEndState() {
        int endState = this.getInputSizeshNQ4ISI.getEndState();
        if (this.getHighResolutionOutputSizeshNQ4ISI == endState) {
            return this.Camera2StreamConfigurationMap;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        java.lang.String lookUpConstraintName = motionScene == null ? null : motionScene.lookUpConstraintName(endState);
        if (lookUpConstraintName != null) {
            this.Camera2StreamConfigurationMap = lookUpConstraintName;
            this.getHighResolutionOutputSizeshNQ4ISI = endState;
        }
        return lookUpConstraintName;
    }

    public float getProgress() {
        return this.getInputSizeshNQ4ISI.getProgress();
    }

    public java.lang.String getState() {
        if (this.getHighSpeedVideoFpsRanges != null && this.Camera2StreamConfigurationMap != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.getHighSpeedVideoFpsRanges;
            }
            if (progress >= 0.99f) {
                return this.Camera2StreamConfigurationMap;
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setState(java.lang.String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, str)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = null;
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            this.getInputSizeshNQ4ISI.accessartificialFrame = this.getInputFormats;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        int lookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        this.getOutputFormats = lookUpConstraintId;
        if (lookUpConstraintId != 0) {
            if (lookUpConstraintId == this.getInputSizeshNQ4ISI.getStartState()) {
                this.getInputSizeshNQ4ISI.setProgress(0.0f);
            } else if (lookUpConstraintId == this.getInputSizeshNQ4ISI.getEndState()) {
                this.getInputSizeshNQ4ISI.setProgress(1.0f);
            } else {
                this.getInputSizeshNQ4ISI.transitionToState(lookUpConstraintId);
                this.getInputSizeshNQ4ISI.setProgress(1.0f);
            }
        }
        this.getInputSizeshNQ4ISI.requestLayout();
    }

    public boolean isInTransition() {
        return (this.getHighSpeedVideoFpsRanges == null || this.Camera2StreamConfigurationMap == null) ? false : true;
    }

    public void setTransition(java.lang.String str, java.lang.String str2) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            this.getInputSizeshNQ4ISI.accessartificialFrame = this.getInputFormats;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        int lookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.getInputSizeshNQ4ISI.accessartificialFrame;
        int lookUpConstraintId2 = motionScene2 != null ? motionScene2.lookUpConstraintId(str2) : 0;
        this.getInputSizeshNQ4ISI.setTransition(lookUpConstraintId, lookUpConstraintId2);
        this.getOutputFormats = lookUpConstraintId;
        this.getHighResolutionOutputSizeshNQ4ISI = lookUpConstraintId2;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    public void disableAutoTransition(boolean z) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        if (motionScene != null) {
            motionScene.disableAutoTransition(z);
        }
    }

    public long getTransitionTimeMs() {
        return this.getInputSizeshNQ4ISI.getTransitionTimeMs();
    }

    public int getKeyFramePositions(java.lang.Object obj, int[] iArr, float[] fArr) {
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get((android.view.View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(iArr, fArr);
    }

    public int getKeyFrameInfo(java.lang.Object obj, int i, int[] iArr) {
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get((android.view.View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i, iArr);
    }

    public float getKeyFramePosition(java.lang.Object obj, int i, float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        if ((obj instanceof android.view.View) && (motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get((android.view.View) obj)) != null) {
            return motionController.getHighResolutionOutputSizeshNQ4ISI(i, f, f2);
        }
        return 0.0f;
    }

    public void setKeyFrame(java.lang.Object obj, int i, java.lang.String str, java.lang.Object obj2) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame != null) {
            this.getInputSizeshNQ4ISI.accessartificialFrame.setKeyframe((android.view.View) obj, i, str, obj2);
            this.getInputSizeshNQ4ISI.init = i / 100.0f;
            this.getInputSizeshNQ4ISI.AMEXKernel = 0.0f;
            this.getInputSizeshNQ4ISI.rebuildScene();
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(true);
        }
    }

    public boolean setKeyFramePosition(java.lang.Object obj, int i, int i2, float f, float f2) {
        if ((obj instanceof android.view.View) && this.getInputSizeshNQ4ISI.accessartificialFrame != null) {
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(obj);
            int i3 = (int) (this.getInputSizeshNQ4ISI.kernelVersion * 100.0f);
            if (motionController != null) {
                android.view.View view = (android.view.View) obj;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getInputSizeshNQ4ISI.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
                if (transition != null) {
                    java.util.Iterator it = transition.getOutputStallDuration.iterator();
                    while (it.hasNext()) {
                        java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
                        while (it2.hasNext()) {
                            if (it2.next().getHighResolutionOutputSizeshNQ4ISI == i3) {
                                float highResolutionOutputSizeshNQ4ISI = motionController.getHighResolutionOutputSizeshNQ4ISI(2, f, f2);
                                float highResolutionOutputSizeshNQ4ISI2 = motionController.getHighResolutionOutputSizeshNQ4ISI(5, f, f2);
                                this.getInputSizeshNQ4ISI.accessartificialFrame.setKeyframe(view, i3, "motion:percentX", java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI));
                                this.getInputSizeshNQ4ISI.accessartificialFrame.setKeyframe(view, i3, "motion:percentY", java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI2));
                                this.getInputSizeshNQ4ISI.rebuildScene();
                                this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(true);
                                this.getInputSizeshNQ4ISI.invalidate();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setViewDebug(java.lang.Object obj, int i) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        if (!(obj instanceof android.view.View) || (motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(obj)) == null) {
            return;
        }
        motionController.setDrawPath(i);
        this.getInputSizeshNQ4ISI.invalidate();
    }

    public int designAccess(int i, java.lang.String str, java.lang.Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) obj;
        if (i == 0) {
            motionController = null;
        } else if (this.getInputSizeshNQ4ISI.accessartificialFrame == null || view == null || (motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(view)) == null) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int duration = this.getInputSizeshNQ4ISI.accessartificialFrame.getDuration() / 16;
            motionController.getHighSpeedVideoFpsRangesFor(fArr2, duration);
            return duration;
        }
        if (i == 2) {
            int duration2 = this.getInputSizeshNQ4ISI.accessartificialFrame.getDuration() / 16;
            motionController.getHighResolutionOutputSizeshNQ4ISI(fArr2, (int[]) null);
            return duration2;
        }
        if (i != 3) {
            return -1;
        }
        int duration3 = this.getInputSizeshNQ4ISI.accessartificialFrame.getDuration() / 16;
        androidx.constraintlayout.motion.utils.ViewSpline viewSpline = motionController.getHighSpeedVideoFpsRanges.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i4 = 0; i4 < fArr2.length; i4++) {
            fArr2[i4] = viewSpline.get(i4 / (fArr2.length - 1));
        }
        return fArr2.length;
    }

    public java.lang.Object getKeyframe(int i, int i2, int i3) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            return null;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        this.getInputSizeshNQ4ISI.getContext();
        return motionScene.getHighSpeedVideoSizes(i, i2, i3);
    }

    public java.lang.Object getKeyframeAtLocation(java.lang.Object obj, float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) obj;
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            return -1;
        }
        if (view == null || (motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(view)) == null) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = motionController.coroutineCreation.isOutputSupportedFor;
        rectF.top = motionController.coroutineCreation.toString;
        rectF.right = rectF.left + motionController.coroutineCreation.unwrapAs;
        rectF.bottom = rectF.top + motionController.coroutineCreation.getOutputFormats;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = motionController.getOutputFormats.isOutputSupportedFor;
        rectF2.top = motionController.getOutputFormats.toString;
        rectF2.right = rectF2.left + motionController.getOutputFormats.unwrapAs;
        rectF2.bottom = rectF2.top + motionController.getOutputFormats.getOutputFormats;
        java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = motionController.getOutputStallDurationlomOqCM.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.Key next = it.next();
            if (next instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
                androidx.constraintlayout.motion.widget.KeyPositionBase keyPositionBase = (androidx.constraintlayout.motion.widget.KeyPositionBase) next;
                if (keyPositionBase.intersects(width, height, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public java.lang.Boolean getPositionKeyframe(java.lang.Object obj, java.lang.Object obj2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        if (obj instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
            androidx.constraintlayout.motion.widget.KeyPositionBase keyPositionBase = (androidx.constraintlayout.motion.widget.KeyPositionBase) obj;
            android.view.View view = (android.view.View) obj2;
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration.get(view);
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.left = motionController.coroutineCreation.isOutputSupportedFor;
            rectF.top = motionController.coroutineCreation.toString;
            rectF.right = rectF.left + motionController.coroutineCreation.unwrapAs;
            rectF.bottom = rectF.top + motionController.coroutineCreation.getOutputFormats;
            android.graphics.RectF rectF2 = new android.graphics.RectF();
            rectF2.left = motionController.getOutputFormats.isOutputSupportedFor;
            rectF2.top = motionController.getOutputFormats.toString;
            rectF2.right = rectF2.left + motionController.getOutputFormats.unwrapAs;
            rectF2.bottom = rectF2.top + motionController.getOutputFormats.getOutputFormats;
            keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
            this.getInputSizeshNQ4ISI.rebuildScene();
            this.getInputSizeshNQ4ISI.getOutputFormats = true;
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }

    public java.lang.Object getKeyframe(java.lang.Object obj, int i, int i2) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            return null;
        }
        int id = ((android.view.View) obj).getId();
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        this.getInputSizeshNQ4ISI.getContext();
        return motionScene.getHighSpeedVideoSizes(i, id, i2);
    }

    public void setKeyframe(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj instanceof androidx.constraintlayout.motion.widget.Key) {
            ((androidx.constraintlayout.motion.widget.Key) obj).setValue(str, obj2);
            this.getInputSizeshNQ4ISI.rebuildScene();
            this.getInputSizeshNQ4ISI.getOutputFormats = true;
        }
    }

    public void setAttributes(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        java.util.HashMap hashMap = obj2 instanceof java.util.HashMap ? (java.util.HashMap) obj2 : new java.util.HashMap();
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        int lookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        androidx.constraintlayout.widget.ConstraintSet highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(lookUpConstraintId);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        highResolutionOutputSizeshNQ4ISI.clear(view.getId());
        getHighSpeedVideoSizes(i, highResolutionOutputSizeshNQ4ISI, view, hashMap, 0);
        getHighSpeedVideoSizes(i, highResolutionOutputSizeshNQ4ISI, view, hashMap, 1);
        java.util.HashMap hashMap2 = hashMap;
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 6, 6);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 6, 7);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 7, 7);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 7, 6);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 1, 1);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 1, 2);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 2, 2);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 2, 1);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 3, 3);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 3, 4);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 4, 3);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 4, 4);
        getHighResolutionOutputSizeshNQ4ISI(i, highResolutionOutputSizeshNQ4ISI, view, hashMap2, 5, 5);
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, view, hashMap, 0);
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, view, hashMap, 1);
        java.lang.String str2 = (java.lang.String) hashMap.get("layout_editor_absoluteX");
        if (str2 != null) {
            highResolutionOutputSizeshNQ4ISI.setEditorAbsoluteX(view.getId(), getHighResolutionOutputSizeshNQ4ISI(i, str2));
        }
        java.lang.String str3 = (java.lang.String) hashMap.get("layout_editor_absoluteY");
        if (str3 != null) {
            highResolutionOutputSizeshNQ4ISI.setEditorAbsoluteY(view.getId(), getHighResolutionOutputSizeshNQ4ISI(i, str3));
        }
        this.getInputSizeshNQ4ISI.updateState(lookUpConstraintId, highResolutionOutputSizeshNQ4ISI);
        this.getInputSizeshNQ4ISI.requestLayout();
    }

    public void dumpConstraintSet(java.lang.String str) {
        if (this.getInputSizeshNQ4ISI.accessartificialFrame == null) {
            this.getInputSizeshNQ4ISI.accessartificialFrame = this.getInputFormats;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.getInputSizeshNQ4ISI.accessartificialFrame;
        int lookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" dumping  ");
        sb.append(str);
        sb.append(" (");
        sb.append(lookUpConstraintId);
        sb.append(")");
        printStream.println(sb.toString());
        try {
            this.getInputSizeshNQ4ISI.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(lookUpConstraintId).dump(this.getInputSizeshNQ4ISI.accessartificialFrame, new int[0]);
        } catch (java.lang.Exception unused) {
        }
    }
}
