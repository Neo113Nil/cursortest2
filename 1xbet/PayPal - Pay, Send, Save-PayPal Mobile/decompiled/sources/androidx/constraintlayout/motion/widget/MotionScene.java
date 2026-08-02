package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class MotionScene {
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int UNSET = -1;
    float Camera2StreamConfigurationMap;
    float getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.widget.StateSet getHighSpeedVideoFpsRanges;
    androidx.constraintlayout.motion.widget.MotionScene.Transition getHighSpeedVideoFpsRangesFor;
    final androidx.constraintlayout.motion.widget.ViewTransitionController getHighSpeedVideoSizes;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> getHighSpeedVideoSizesFor;
    private java.util.HashMap<java.lang.String, java.lang.Integer> getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getOutputFormats;
    private androidx.constraintlayout.motion.widget.MotionScene.Transition getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private android.view.MotionEvent getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private android.util.SparseIntArray getOutputStallDurationlomOqCM;
    private final androidx.constraintlayout.motion.widget.MotionLayout getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker toString;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> unwrapAs;

    public float getPathPercent(android.view.View view, int i) {
        return 0.0f;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r2 != (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoFpsRanges(int i, int i2) {
        int i3;
        int i4;
        androidx.constraintlayout.widget.StateSet stateSet = this.getHighSpeedVideoFpsRanges;
        if (stateSet != null) {
            i3 = stateSet.stateGetConstraintID(i, -1, -1);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = this.getHighSpeedVideoFpsRanges.stateGetConstraintID(i2, -1, -1);
        } else {
            i3 = i;
        }
        i4 = i2;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null && transition.getHighResolutionOutputSizeshNQ4ISI == i2 && this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor == i) {
            return;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            if ((next.getHighResolutionOutputSizeshNQ4ISI == i4 && next.getHighSpeedVideoFpsRangesFor == i3) || (next.getHighResolutionOutputSizeshNQ4ISI == i2 && next.getHighSpeedVideoFpsRangesFor == i)) {
                this.getHighSpeedVideoFpsRangesFor = next;
                if (next == null || next.unwrapAs == null) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
                return;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.getOutputMinFrameDuration;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it2 = this.getOutputFormats.iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next2 = it2.next();
            if (next2.getHighResolutionOutputSizeshNQ4ISI == i2) {
                transition2 = next2;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, transition2);
        transition3.getHighSpeedVideoFpsRangesFor = i3;
        transition3.getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i3 != -1) {
            this.unwrapAs.add(transition3);
        }
        this.getHighSpeedVideoFpsRangesFor = transition3;
    }

    public void addTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(transition);
        if (highSpeedVideoFpsRanges == -1) {
            this.unwrapAs.add(transition);
        } else {
            this.unwrapAs.set(highSpeedVideoFpsRanges, transition);
        }
    }

    public void removeTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(transition);
        if (highSpeedVideoFpsRanges != -1) {
            this.unwrapAs.remove(highSpeedVideoFpsRanges);
        }
    }

    private int getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        int i = transition.getOutputMinFrameDuration;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("The transition must have an id");
        }
        for (int i2 = 0; i2 < this.unwrapAs.size(); i2++) {
            if (this.unwrapAs.get(i2).getOutputMinFrameDuration == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean validateLayout(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        return motionLayout == this.getValidOutputFormatsForInputhNQ4ISI && motionLayout.accessartificialFrame == this;
    }

    public void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        this.getHighSpeedVideoFpsRangesFor = transition;
        if (transition == null || transition.unwrapAs == null) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
    }

    public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            if (next.getOutputMinFrameDurationlomOqCM.size() > 0) {
                java.util.Iterator it2 = next.getOutputMinFrameDurationlomOqCM.iterator();
                while (it2.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it3 = this.getOutputFormats.iterator();
        while (it3.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next2 = it3.next();
            if (next2.getOutputMinFrameDurationlomOqCM.size() > 0) {
                java.util.Iterator it4 = next2.getOutputMinFrameDurationlomOqCM.iterator();
                while (it4.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it5 = this.unwrapAs.iterator();
        while (it5.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next3 = it5.next();
            if (next3.getOutputMinFrameDurationlomOqCM.size() > 0) {
                java.util.Iterator it6 = next3.getOutputMinFrameDurationlomOqCM.iterator();
                while (it6.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, i, next3);
                }
            }
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it7 = this.getOutputFormats.iterator();
        while (it7.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next4 = it7.next();
            if (next4.getOutputMinFrameDurationlomOqCM.size() > 0) {
                java.util.Iterator it8 = next4.getOutputMinFrameDurationlomOqCM.iterator();
                while (it8.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, i, next4);
                }
            }
        }
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor(int i, float f, float f2, android.view.MotionEvent motionEvent) {
        if (i != -1) {
            java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> transitionsWithState = getTransitionsWithState(i);
            android.graphics.RectF rectF = new android.graphics.RectF();
            float f3 = 0.0f;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
            for (androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 : transitionsWithState) {
                if (!transition2.getOutputFormats && transition2.unwrapAs != null) {
                    transition2.unwrapAs.getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
                    android.graphics.RectF Camera2StreamConfigurationMap = transition2.unwrapAs.Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI, rectF);
                    if (Camera2StreamConfigurationMap == null || motionEvent == null || Camera2StreamConfigurationMap.contains(motionEvent.getX(), motionEvent.getY())) {
                        android.graphics.RectF highResolutionOutputSizeshNQ4ISI = transition2.unwrapAs.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, rectF);
                        if (highResolutionOutputSizeshNQ4ISI == null || motionEvent == null || highResolutionOutputSizeshNQ4ISI.contains(motionEvent.getX(), motionEvent.getY())) {
                            androidx.constraintlayout.motion.widget.TouchResponse touchResponse = transition2.unwrapAs;
                            float f4 = (touchResponse._CREATION * f) + (touchResponse.getARTIFICIAL_FRAME_PACKAGE_NAME * f2);
                            if (transition2.unwrapAs.getInputSizeshNQ4ISI && motionEvent != null) {
                                f4 = 10.0f * ((float) (java.lang.Math.atan2(f2 + r6, f + r5) - java.lang.Math.atan2(motionEvent.getX() - transition2.unwrapAs.getOutputStallDurationlomOqCM, motionEvent.getY() - transition2.unwrapAs.isOutputSupportedFor)));
                            }
                            float f5 = (transition2.getHighResolutionOutputSizeshNQ4ISI == i ? -1.0f : 1.1f) * f4;
                            if (f5 > f3) {
                                transition = transition2;
                                f3 = f5;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
        return this.unwrapAs;
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransitionById(int i) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            if (next.getOutputMinFrameDuration == i) {
                return next;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.getHighSpeedVideoSizesFor.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.getHighSpeedVideoSizesFor.keyAt(i);
        }
        return iArr;
    }

    public int[] getMatchingStateLabels(java.lang.String... strArr) {
        int size = this.getHighSpeedVideoSizesFor.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.widget.ConstraintSet valueAt = this.getHighSpeedVideoSizesFor.valueAt(i2);
            int keyAt = this.getHighSpeedVideoSizesFor.keyAt(i2);
            if (valueAt.matchesLabels(strArr)) {
                valueAt.getStateLabels();
                iArr[i] = keyAt;
                i++;
            }
        }
        return java.util.Arrays.copyOf(iArr, i);
    }

    public void setRtl(boolean z) {
        this.isOutputSupportedFor = z;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition == null || transition.unwrapAs == null) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
    }

    public void viewTransition(int i, android.view.View... viewArr) {
        androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it = viewTransitionController.getOutputFormats.iterator();
        androidx.constraintlayout.motion.widget.ViewTransition viewTransition = null;
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.ViewTransition next = it.next();
            if (next.getHighSpeedVideoFpsRangesFor == i) {
                for (android.view.View view : viewArr) {
                    if (next.getHighSpeedVideoFpsRangesFor(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    android.view.View[] viewArr2 = (android.view.View[]) arrayList.toArray(new android.view.View[0]);
                    int currentState = viewTransitionController.getHighSpeedVideoFpsRangesFor.getCurrentState();
                    if (next.getHighSpeedVideoSizesFor == 2) {
                        next.getHighSpeedVideoSizes(viewTransitionController, viewTransitionController.getHighSpeedVideoFpsRangesFor, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        java.lang.String str = viewTransitionController.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = viewTransitionController.getHighSpeedVideoFpsRangesFor;
                    } else {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = viewTransitionController.getHighSpeedVideoFpsRangesFor.getConstraintSet(currentState);
                        if (constraintSet != null) {
                            next.getHighSpeedVideoSizes(viewTransitionController, viewTransitionController.getHighSpeedVideoFpsRangesFor, currentState, constraintSet, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                viewTransition = next;
            }
        }
        if (viewTransition == null) {
            java.lang.String str2 = viewTransitionController.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public void enableViewTransition(int i, boolean z) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it = this.getHighSpeedVideoSizes.getOutputFormats.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.ViewTransition next = it.next();
            if (next.getHighSpeedVideoFpsRangesFor == i) {
                next.getHighSpeedVideoFpsRanges = !z;
                return;
            }
        }
    }

    public boolean isViewTransitionEnabled(int i) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it = this.getHighSpeedVideoSizes.getOutputFormats.iterator();
        while (it.hasNext()) {
            if (it.next().getHighSpeedVideoFpsRangesFor == i) {
                return !r1.getHighSpeedVideoFpsRanges;
            }
        }
        return false;
    }

    public boolean applyViewTransition(int i, androidx.constraintlayout.motion.widget.MotionController motionController) {
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it = this.getHighSpeedVideoSizes.getOutputFormats.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.ViewTransition next = it.next();
            if (next.getHighSpeedVideoFpsRangesFor == i) {
                next.getInputFormats.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private boolean getInputFormats;
        private java.lang.String getInputSizeshNQ4ISI;
        private boolean getOutputFormats;
        private int getOutputMinFrameDuration;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOutputMinFrameDurationlomOqCM;
        private int getOutputSizes;
        private final androidx.constraintlayout.motion.widget.MotionScene getOutputSizeshNQ4ISI;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private int isOutputSupportedFor;
        private float isOutputSupportedForhNQ4ISI;
        private androidx.constraintlayout.motion.widget.TouchResponse unwrapAs;

        public void setOnSwipe(androidx.constraintlayout.motion.widget.OnSwipe onSwipe) {
            this.unwrapAs = onSwipe == null ? null : new androidx.constraintlayout.motion.widget.TouchResponse(this.getOutputSizeshNQ4ISI.getValidOutputFormatsForInputhNQ4ISI, onSwipe);
        }

        public void addOnClick(int i, int i2) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> it = this.getOutputMinFrameDurationlomOqCM.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick next = it.next();
                if (next.getHighResolutionOutputSizeshNQ4ISI == i) {
                    next.getHighSpeedVideoFpsRangesFor = i2;
                    return;
                }
            }
            this.getOutputMinFrameDurationlomOqCM.add(new androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick(this, i, i2));
        }

        public void removeOnClick(int i) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick transitionOnClick;
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> it = this.getOutputMinFrameDurationlomOqCM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    transitionOnClick = null;
                    break;
                } else {
                    transitionOnClick = it.next();
                    if (transitionOnClick.getHighResolutionOutputSizeshNQ4ISI == i) {
                        break;
                    }
                }
            }
            if (transitionOnClick != null) {
                this.getOutputMinFrameDurationlomOqCM.remove(transitionOnClick);
            }
        }

        public int getLayoutDuringTransition() {
            return this.getOutputStallDurationlomOqCM;
        }

        public void setLayoutDuringTransition(int i) {
            this.getOutputStallDurationlomOqCM = i;
        }

        public void addOnClick(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getOutputMinFrameDurationlomOqCM.add(new androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick(context, this, xmlPullParser));
        }

        public void setAutoTransition(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public int getAutoTransition() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public int getId() {
            return this.getOutputMinFrameDuration;
        }

        public int getEndConstraintSetId() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int getStartConstraintSetId() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public void setDuration(int i) {
            this.getHighSpeedVideoSizesFor = java.lang.Math.max(i, 8);
        }

        public int getDuration() {
            return this.getHighSpeedVideoSizesFor;
        }

        public float getStagger() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public java.util.List<androidx.constraintlayout.motion.widget.KeyFrames> getKeyFrameList() {
            return this.getOutputStallDuration;
        }

        public void addKeyFrame(androidx.constraintlayout.motion.widget.KeyFrames keyFrames) {
            this.getOutputStallDuration.add(keyFrames);
        }

        public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOnClickList() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public androidx.constraintlayout.motion.widget.TouchResponse getTouchResponse() {
            return this.unwrapAs;
        }

        public void setStagger(float f) {
            this.isOutputSupportedForhNQ4ISI = f;
        }

        public void setPathMotionArc(int i) {
            this.getOutputSizes = i;
        }

        public int getPathMotionArc() {
            return this.getOutputSizes;
        }

        public boolean isEnabled() {
            return !this.getOutputFormats;
        }

        public void setEnabled(boolean z) {
            this.getOutputFormats = !z;
        }

        public java.lang.String debugString(android.content.Context context) {
            java.lang.String resourceEntryName;
            if (this.getHighSpeedVideoFpsRangesFor == -1) {
                resourceEntryName = "null";
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.getHighSpeedVideoFpsRangesFor);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(resourceEntryName);
                sb.append(" -> null");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(resourceEntryName);
            sb2.append(" -> ");
            sb2.append(context.getResources().getResourceEntryName(this.getHighResolutionOutputSizeshNQ4ISI));
            return sb2.toString();
        }

        public boolean isTransitionFlag(int i) {
            return (i & this.isOutputSupportedFor) != 0;
        }

        public void setTransitionFlag(int i) {
            this.isOutputSupportedFor = i;
        }

        public void setOnTouchUp(int i) {
            androidx.constraintlayout.motion.widget.TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.getOutputMinFrameDurationlomOqCM = i;
            }
        }

        public static class TransitionOnClick implements android.view.View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            private final androidx.constraintlayout.motion.widget.MotionScene.Transition Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRangesFor;

            public TransitionOnClick(android.content.Context context, androidx.constraintlayout.motion.widget.MotionScene.Transition transition, org.xmlpull.v1.XmlPullParser xmlPullParser) {
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getHighSpeedVideoFpsRangesFor = 17;
                this.Camera2StreamConfigurationMap = transition;
                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == androidx.constraintlayout.widget.R.styleable.OnClick_targetId) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(index, this.getHighResolutionOutputSizeshNQ4ISI);
                    } else if (index == androidx.constraintlayout.widget.R.styleable.OnClick_clickAction) {
                        this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoFpsRangesFor);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public TransitionOnClick(androidx.constraintlayout.motion.widget.MotionScene.Transition transition, int i, int i2) {
                this.Camera2StreamConfigurationMap = transition;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getHighSpeedVideoFpsRangesFor = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
            public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    return;
                }
                int i3 = transition.getHighSpeedVideoFpsRangesFor;
                int i4 = transition.getHighResolutionOutputSizeshNQ4ISI;
                if (i3 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i5 = this.getHighSpeedVideoFpsRangesFor;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = i6 != 0 && i == i3;
                boolean z3 = (i5 & 256) != 0 && i == i3;
                boolean z4 = i6 != 0 && i == i3;
                boolean z5 = (i5 & 16) != 0 && i == i4;
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if ((z2 | z3 | z4 | z5) || z) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public void removeOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
                android.view.View findViewById;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == -1 || (findViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onClick(android.view.View view) {
                boolean z;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI.getValidOutputFormatsForInputhNQ4ISI;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor != -1) {
                        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        boolean z2 = false;
                        boolean z3 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                        boolean z4 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                        if (z3 && z4) {
                            androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                            androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = this.Camera2StreamConfigurationMap;
                            if (transition3 != transition4) {
                                motionLayout.setTransition(transition4);
                            }
                            if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                                z = true;
                                transition = this.Camera2StreamConfigurationMap;
                                if (transition != transition2) {
                                    int i2 = transition.getHighResolutionOutputSizeshNQ4ISI;
                                    int i3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                                    if (i3 == -1) {
                                        if (motionLayout.getHighResolutionOutputSizeshNQ4ISI == i2) {
                                            return;
                                        }
                                    } else if (motionLayout.getHighResolutionOutputSizeshNQ4ISI != i3 && motionLayout.getHighResolutionOutputSizeshNQ4ISI != i2) {
                                        return;
                                    }
                                }
                                if (!z2 && (this.getHighSpeedVideoFpsRangesFor & 1) != 0) {
                                    motionLayout.setTransition(this.Camera2StreamConfigurationMap);
                                    motionLayout.transitionToEnd();
                                    return;
                                }
                                if (!z && (this.getHighSpeedVideoFpsRangesFor & 16) != 0) {
                                    motionLayout.setTransition(this.Camera2StreamConfigurationMap);
                                    motionLayout.transitionToStart();
                                    return;
                                } else if (!z2 && (this.getHighSpeedVideoFpsRangesFor & 256) != 0) {
                                    motionLayout.setTransition(this.Camera2StreamConfigurationMap);
                                    motionLayout.setProgress(1.0f);
                                    return;
                                } else {
                                    if (z || (this.getHighSpeedVideoFpsRangesFor & 4096) == 0) {
                                        return;
                                    }
                                    motionLayout.setTransition(this.Camera2StreamConfigurationMap);
                                    motionLayout.setProgress(0.0f);
                                    return;
                                }
                            }
                        } else {
                            z2 = z4;
                        }
                        z = z2;
                        z2 = z3;
                        transition = this.Camera2StreamConfigurationMap;
                        if (transition != transition2) {
                        }
                        if (!z2) {
                        }
                        if (!z) {
                        }
                        if (!z2) {
                        }
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    }
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI);
                        return;
                    }
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition5 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                    transition5.getHighSpeedVideoFpsRangesFor = currentState;
                    transition5.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    motionLayout.setTransition(transition5);
                    motionLayout.transitionToEnd();
                }
            }
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene, androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
            this.getOutputMinFrameDuration = -1;
            this.getInputFormats = false;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizesFor = 400;
            this.isOutputSupportedForhNQ4ISI = 0.0f;
            this.getOutputStallDuration = new java.util.ArrayList<>();
            this.unwrapAs = null;
            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = false;
            this.getOutputSizes = -1;
            this.getOutputStallDurationlomOqCM = 0;
            this.isOutputSupportedFor = 0;
            this.getOutputSizeshNQ4ISI = motionScene;
            this.getHighSpeedVideoSizesFor = motionScene.getInputSizeshNQ4ISI;
            if (transition != null) {
                this.getOutputSizes = transition.getOutputSizes;
                this.Camera2StreamConfigurationMap = transition.Camera2StreamConfigurationMap;
                this.getInputSizeshNQ4ISI = transition.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = transition.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizesFor = transition.getHighSpeedVideoSizesFor;
                this.getOutputStallDuration = transition.getOutputStallDuration;
                this.isOutputSupportedForhNQ4ISI = transition.isOutputSupportedForhNQ4ISI;
                this.getOutputStallDurationlomOqCM = transition.getOutputStallDurationlomOqCM;
            }
        }

        public Transition(int i, androidx.constraintlayout.motion.widget.MotionScene motionScene, int i2, int i3) {
            this.getOutputMinFrameDuration = -1;
            this.getInputFormats = false;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizesFor = 400;
            this.isOutputSupportedForhNQ4ISI = 0.0f;
            this.getOutputStallDuration = new java.util.ArrayList<>();
            this.unwrapAs = null;
            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = false;
            this.getOutputSizes = -1;
            this.getOutputStallDurationlomOqCM = 0;
            this.isOutputSupportedFor = 0;
            this.getOutputMinFrameDuration = i;
            this.getOutputSizeshNQ4ISI = motionScene;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            this.getHighSpeedVideoSizesFor = motionScene.getInputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = motionScene.getOutputSizes;
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene motionScene, android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getOutputMinFrameDuration = -1;
            this.getInputFormats = false;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizesFor = 400;
            this.isOutputSupportedForhNQ4ISI = 0.0f;
            this.getOutputStallDuration = new java.util.ArrayList<>();
            this.unwrapAs = null;
            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = false;
            this.getOutputSizes = -1;
            this.getOutputStallDurationlomOqCM = 0;
            this.isOutputSupportedFor = 0;
            this.getHighSpeedVideoSizesFor = motionScene.getInputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = motionScene.getOutputSizes;
            this.getOutputSizeshNQ4ISI = motionScene;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetEnd) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(index, -1);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet.load(context, this.getHighResolutionOutputSizeshNQ4ISI);
                        motionScene.getHighSpeedVideoSizesFor.append(this.getHighResolutionOutputSizeshNQ4ISI, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = motionScene.Camera2StreamConfigurationMap(context, this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_constraintSetStart) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRangesFor);
                    java.lang.String resourceTypeName2 = context.getResources().getResourceTypeName(this.getHighSpeedVideoFpsRangesFor);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet2 = new androidx.constraintlayout.widget.ConstraintSet();
                        constraintSet2.load(context, this.getHighSpeedVideoFpsRangesFor);
                        motionScene.getHighSpeedVideoSizesFor.append(this.getHighSpeedVideoFpsRangesFor, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.getHighSpeedVideoFpsRangesFor = motionScene.Camera2StreamConfigurationMap(context, this.getHighSpeedVideoFpsRangesFor);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_motionInterpolator) {
                    android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                    if (peekValue.type == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.getHighSpeedVideoSizes = resourceId;
                        if (resourceId != -1) {
                            this.Camera2StreamConfigurationMap = -2;
                        }
                    } else if (peekValue.type == 3) {
                        java.lang.String string = obtainStyledAttributes.getString(index);
                        this.getInputSizeshNQ4ISI = string;
                        if (string != null) {
                            if (string.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) > 0) {
                                this.getHighSpeedVideoSizes = obtainStyledAttributes.getResourceId(index, -1);
                                this.Camera2StreamConfigurationMap = -2;
                            } else {
                                this.Camera2StreamConfigurationMap = -1;
                            }
                        }
                    } else {
                        this.Camera2StreamConfigurationMap = obtainStyledAttributes.getInteger(index, this.Camera2StreamConfigurationMap);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_duration) {
                    int i2 = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoSizesFor);
                    this.getHighSpeedVideoSizesFor = i2;
                    if (i2 < 8) {
                        this.getHighSpeedVideoSizesFor = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_staggered) {
                    this.isOutputSupportedForhNQ4ISI = obtainStyledAttributes.getFloat(index, this.isOutputSupportedForhNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_autoTransition) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getInteger(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_android_id) {
                    this.getOutputMinFrameDuration = obtainStyledAttributes.getResourceId(index, this.getOutputMinFrameDuration);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_transitionDisable) {
                    this.getOutputFormats = obtainStyledAttributes.getBoolean(index, this.getOutputFormats);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_pathMotionArc) {
                    this.getOutputSizes = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_layoutDuringTransition) {
                    this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_transitionFlags) {
                    this.isOutputSupportedFor = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor == -1) {
                this.getInputFormats = true;
            }
            obtainStyledAttributes.recycle();
        }

        public void setInterpolatorInfo(int i, java.lang.String str, int i2) {
            this.Camera2StreamConfigurationMap = i;
            this.getInputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = i2;
        }
    }

    public MotionScene(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputStallDuration = false;
        this.unwrapAs = new java.util.ArrayList<>();
        this.getOutputMinFrameDuration = null;
        this.getOutputFormats = new java.util.ArrayList<>();
        this.getHighSpeedVideoSizesFor = new android.util.SparseArray<>();
        this.getInputFormats = new java.util.HashMap<>();
        this.getOutputStallDurationlomOqCM = new android.util.SparseIntArray();
        this.getInputSizeshNQ4ISI = 400;
        this.getOutputSizes = 0;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.isOutputSupportedForhNQ4ISI = false;
        this.getValidOutputFormatsForInputhNQ4ISI = motionLayout;
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.motion.widget.ViewTransitionController(motionLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0171 A[Catch: IOException | XmlPullParserException -> 0x01af, TryCatch #0 {IOException | XmlPullParserException -> 0x01af, blocks: (B:3:0x004b, B:10:0x01a9, B:13:0x0057, B:14:0x0060, B:17:0x0065, B:20:0x0160, B:22:0x0171, B:24:0x0179, B:26:0x0180, B:29:0x0183, B:32:0x006f, B:34:0x0077, B:37:0x0080, B:39:0x0088, B:41:0x0099, B:43:0x00a1, B:45:0x00ad, B:47:0x00ba, B:49:0x00b0, B:51:0x00b4, B:55:0x00bd, B:58:0x00c2, B:61:0x00cc, B:63:0x00d8, B:67:0x00e4, B:70:0x00ee, B:72:0x00f6, B:77:0x00fb, B:79:0x0103, B:81:0x0111, B:83:0x0117, B:85:0x011f, B:86:0x012a, B:88:0x0130, B:90:0x0136, B:91:0x013e, B:92:0x0139, B:96:0x0145, B:98:0x014d, B:101:0x0158, B:104:0x0187, B:106:0x018f, B:108:0x0196, B:112:0x019e, B:114:0x01a6), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    MotionScene(android.content.Context context, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        int indexCount;
        int i2;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputStallDuration = false;
        this.unwrapAs = new java.util.ArrayList<>();
        this.getOutputMinFrameDuration = null;
        this.getOutputFormats = new java.util.ArrayList<>();
        this.getHighSpeedVideoSizesFor = new android.util.SparseArray<>();
        this.getInputFormats = new java.util.HashMap<>();
        this.getOutputStallDurationlomOqCM = new android.util.SparseIntArray();
        this.getInputSizeshNQ4ISI = 400;
        this.getOutputSizes = 0;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.isOutputSupportedForhNQ4ISI = false;
        this.getValidOutputFormatsForInputhNQ4ISI = motionLayout;
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.motion.widget.ViewTransitionController(motionLayout);
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name2 = xml.getName();
                    switch (name2.hashCode()) {
                        case -1349929691:
                            if (name2.equals("ConstraintSet")) {
                                getHighResolutionOutputSizeshNQ4ISI(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name2.equals(androidx.constraintlayout.motion.widget.ViewTransition.KEY_FRAME_SET_TAG)) {
                                androidx.constraintlayout.motion.widget.KeyFrames keyFrames = new androidx.constraintlayout.motion.widget.KeyFrames(context, xml);
                                if (transition != null) {
                                    transition.getOutputStallDuration.add(keyFrames);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (!name2.equals("Include")) {
                                break;
                            }
                            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xml), androidx.constraintlayout.widget.R.styleable.include);
                            indexCount = obtainStyledAttributes.getIndexCount();
                            for (i2 = 0; i2 < indexCount; i2++) {
                                int index = obtainStyledAttributes.getIndex(i2);
                                if (index == androidx.constraintlayout.widget.R.styleable.include_constraintSet) {
                                    Camera2StreamConfigurationMap(context, obtainStyledAttributes.getResourceId(index, -1));
                                }
                            }
                            obtainStyledAttributes.recycle();
                            break;
                        case 61998586:
                            if (name2.equals(androidx.constraintlayout.motion.widget.ViewTransition.VIEW_TRANSITION_TAG)) {
                                this.getHighSpeedVideoSizes.add(new androidx.constraintlayout.motion.widget.ViewTransition(context, xml));
                                break;
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name2.equals("Transition")) {
                                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> arrayList = this.unwrapAs;
                                androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = new androidx.constraintlayout.motion.widget.MotionScene.Transition(this, context, xml);
                                arrayList.add(transition2);
                                if (this.getHighSpeedVideoFpsRangesFor == null && !transition2.getInputFormats) {
                                    this.getHighSpeedVideoFpsRangesFor = transition2;
                                    if (transition2.unwrapAs != null) {
                                        this.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
                                    }
                                }
                                if (transition2.getInputFormats) {
                                    if (transition2.getHighResolutionOutputSizeshNQ4ISI == -1) {
                                        this.getOutputMinFrameDuration = transition2;
                                    } else {
                                        this.getOutputFormats.add(transition2);
                                    }
                                    this.unwrapAs.remove(transition2);
                                }
                                transition = transition2;
                                break;
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name2.equals("OnClick") && transition != null && !this.getValidOutputFormatsForInputhNQ4ISI.isInEditMode()) {
                                transition.addOnClick(context, xml);
                                break;
                            }
                            break;
                        case 327855227:
                            if (name2.equals("OnSwipe")) {
                                if (transition == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (transition != null) {
                                    transition.unwrapAs = new androidx.constraintlayout.motion.widget.TouchResponse(context, this.getValidOutputFormatsForInputhNQ4ISI, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME)) {
                                android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xml), androidx.constraintlayout.widget.R.styleable.MotionScene);
                                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                for (int i3 = 0; i3 < indexCount2; i3++) {
                                    int index2 = obtainStyledAttributes2.getIndex(i3);
                                    if (index2 == androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration) {
                                        int i4 = obtainStyledAttributes2.getInt(index2, this.getInputSizeshNQ4ISI);
                                        this.getInputSizeshNQ4ISI = i4;
                                        if (i4 < 8) {
                                            this.getInputSizeshNQ4ISI = 8;
                                        }
                                    } else if (index2 == androidx.constraintlayout.widget.R.styleable.MotionScene_layoutDuringTransition) {
                                        this.getOutputSizes = obtainStyledAttributes2.getInteger(index2, 0);
                                    }
                                }
                                obtainStyledAttributes2.recycle();
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name2.equals("StateSet")) {
                                this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.widget.StateSet(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name2.equals("include")) {
                                android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xml), androidx.constraintlayout.widget.R.styleable.include);
                                indexCount = obtainStyledAttributes3.getIndexCount();
                                while (i2 < indexCount) {
                                }
                                obtainStyledAttributes3.recycle();
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
        this.getHighSpeedVideoSizesFor.put(androidx.constraintlayout.widget.R.id.motion_base, new androidx.constraintlayout.widget.ConstraintSet());
        this.getInputFormats.put("motion_base", java.lang.Integer.valueOf(androidx.constraintlayout.widget.R.id.motion_base));
    }

    private static int getHighSpeedVideoSizes(android.content.Context context, java.lang.String str) {
        int identifier = str.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        return (identifier != -1 || str == null || str.length() <= 1) ? identifier : java.lang.Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Camera2StreamConfigurationMap(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                java.lang.String name2 = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name2)) {
                    return getHighResolutionOutputSizeshNQ4ISI(context, xml);
                }
            }
            return -1;
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        char c;
        char c2;
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i3);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.hashCode();
            int hashCode = attributeName.hashCode();
            if (hashCode == -1496482599) {
                if (attributeName.equals("deriveConstraintsFrom")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == -1153153640) {
                if (attributeName.equals("constraintRotate")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 3355) {
                if (hashCode == 973381616 && attributeName.equals("stateLabels")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (attributeName.equals("id")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                i2 = getHighSpeedVideoSizes(context, attributeValue);
            } else if (c == 1) {
                try {
                    constraintSet.mRotate = java.lang.Integer.parseInt(attributeValue);
                } catch (java.lang.NumberFormatException unused) {
                    attributeValue.hashCode();
                    switch (attributeValue.hashCode()) {
                        case -768416914:
                            if (attributeValue.equals("x_left")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3317767:
                            if (attributeValue.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3387192:
                            if (attributeValue.equals("none")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 108511772:
                            if (attributeValue.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1954540437:
                            if (attributeValue.equals("x_right")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        constraintSet.mRotate = 4;
                    } else if (c2 == 1) {
                        constraintSet.mRotate = 2;
                    } else if (c2 == 2) {
                        constraintSet.mRotate = 0;
                    } else if (c2 == 3) {
                        constraintSet.mRotate = 1;
                    } else if (c2 == 4) {
                        constraintSet.mRotate = 3;
                    }
                }
            } else if (c == 2) {
                i = getHighSpeedVideoSizes(context, attributeValue);
                this.getInputFormats.put(stripID(attributeValue), java.lang.Integer.valueOf(i));
                constraintSet.mIdString = androidx.constraintlayout.motion.widget.Debug.getName(context, i);
            } else if (c == 3) {
                constraintSet.setStateLabels(attributeValue);
            }
        }
        if (i != -1) {
            if (this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoSizes != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (i2 != -1) {
                this.getOutputStallDurationlomOqCM.put(i, i2);
            }
            this.getHighSpeedVideoSizesFor.put(i, constraintSet);
        }
        return i;
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(android.content.Context context, java.lang.String str) {
        for (int i = 0; i < this.getHighSpeedVideoSizesFor.size(); i++) {
            int keyAt = this.getHighSpeedVideoSizesFor.keyAt(i);
            if (str.equals(context.getResources().getResourceName(keyAt))) {
                return this.getHighSpeedVideoSizesFor.get(keyAt);
            }
        }
        return null;
    }

    final androidx.constraintlayout.widget.ConstraintSet getHighResolutionOutputSizeshNQ4ISI(int i) {
        int stateGetConstraintID;
        androidx.constraintlayout.widget.StateSet stateSet = this.getHighSpeedVideoFpsRanges;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1)) != -1) {
            i = stateGetConstraintID;
        }
        if (this.getHighSpeedVideoSizesFor.get(i) == null) {
            androidx.constraintlayout.motion.widget.Debug.getName(this.getValidOutputFormatsForInputhNQ4ISI.getContext(), i);
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> sparseArray = this.getHighSpeedVideoSizesFor;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.getHighSpeedVideoSizesFor.get(i);
    }

    public void setConstraintSet(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.getHighSpeedVideoSizesFor.put(i, constraintSet);
    }

    public void getKeyFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            java.util.Iterator it = transition.getOutputStallDuration.iterator();
            while (it.hasNext()) {
                ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).addFrames(motionController);
            }
        } else {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.getOutputMinFrameDuration;
            if (transition2 != null) {
                java.util.Iterator it2 = transition2.getOutputStallDuration.iterator();
                while (it2.hasNext()) {
                    ((androidx.constraintlayout.motion.widget.KeyFrames) it2.next()).addFrames(motionController);
                }
            }
        }
    }

    final androidx.constraintlayout.motion.widget.Key getHighSpeedVideoSizes(int i, int i2, int i3) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition == null) {
            return null;
        }
        java.util.Iterator it = transition.getOutputStallDuration.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.KeyFrames keyFrames = (androidx.constraintlayout.motion.widget.KeyFrames) it.next();
            for (java.lang.Integer num : keyFrames.getKeys()) {
                if (i2 == num.intValue()) {
                    java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = keyFrames.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        androidx.constraintlayout.motion.widget.Key next = it2.next();
                        if (next.getHighResolutionOutputSizeshNQ4ISI == i3 && next.mType == i) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void setKeyframe(android.view.View view, int i, java.lang.String str, java.lang.Object obj) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            java.util.Iterator it = transition.getOutputStallDuration.iterator();
            while (it.hasNext()) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it2 = ((androidx.constraintlayout.motion.widget.KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().getHighResolutionOutputSizeshNQ4ISI == i && obj != null) {
                    }
                }
            }
        }
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            if (it.next().unwrapAs != null) {
                return true;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        return (transition == null || transition.unwrapAs == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoFpsRangesFor(android.view.MotionEvent motionEvent, int i, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker motionTracker;
        char c;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        float f;
        float left;
        float f2;
        int top;
        int bottom;
        int i3;
        float f3;
        int i4;
        char c7;
        android.view.MotionEvent motionEvent2;
        android.graphics.RectF rectF = new android.graphics.RectF();
        if (this.toString == null) {
            this.toString = this.getValidOutputFormatsForInputhNQ4ISI.obtainVelocityTracker();
        }
        this.toString.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.Camera2StreamConfigurationMap = motionEvent.getRawX();
                this.getHighResolutionOutputSizeshNQ4ISI = motionEvent.getRawY();
                this.getOutputSizeshNQ4ISI = motionEvent;
                this.getOutputMinFrameDurationlomOqCM = false;
                if (this.getHighSpeedVideoFpsRangesFor.unwrapAs != null) {
                    android.graphics.RectF highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, rectF);
                    if (highResolutionOutputSizeshNQ4ISI != null && !highResolutionOutputSizeshNQ4ISI.contains(this.getOutputSizeshNQ4ISI.getX(), this.getOutputSizeshNQ4ISI.getY())) {
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputMinFrameDurationlomOqCM = true;
                        return;
                    }
                    android.graphics.RectF Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.unwrapAs.Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI, rectF);
                    if (Camera2StreamConfigurationMap != null && !Camera2StreamConfigurationMap.contains(this.getOutputSizeshNQ4ISI.getX(), this.getOutputSizeshNQ4ISI.getY())) {
                        this.isOutputSupportedForhNQ4ISI = true;
                    } else {
                        this.isOutputSupportedForhNQ4ISI = false;
                    }
                    androidx.constraintlayout.motion.widget.TouchResponse touchResponse = this.getHighSpeedVideoFpsRangesFor.unwrapAs;
                    float f4 = this.Camera2StreamConfigurationMap;
                    float f5 = this.getHighResolutionOutputSizeshNQ4ISI;
                    touchResponse.getOutputMinFrameDuration = f4;
                    touchResponse.getHighSpeedVideoSizesFor = f5;
                    return;
                }
                return;
            }
            if (action == 2 && !this.getOutputMinFrameDurationlomOqCM) {
                float rawY = motionEvent.getRawY() - this.getHighResolutionOutputSizeshNQ4ISI;
                float rawX = motionEvent.getRawX() - this.Camera2StreamConfigurationMap;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.getOutputSizeshNQ4ISI) == null) {
                    return;
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor = bestTransitionFor(i, rawX, rawY, motionEvent2);
                if (bestTransitionFor != null) {
                    motionLayout.setTransition(bestTransitionFor);
                    android.graphics.RectF Camera2StreamConfigurationMap2 = this.getHighSpeedVideoFpsRangesFor.unwrapAs.Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI, rectF);
                    this.isOutputSupportedForhNQ4ISI = (Camera2StreamConfigurationMap2 == null || Camera2StreamConfigurationMap2.contains(this.getOutputSizeshNQ4ISI.getX(), this.getOutputSizeshNQ4ISI.getY())) ? false : true;
                    androidx.constraintlayout.motion.widget.TouchResponse touchResponse2 = this.getHighSpeedVideoFpsRangesFor.unwrapAs;
                    float f6 = this.Camera2StreamConfigurationMap;
                    float f7 = this.getHighResolutionOutputSizeshNQ4ISI;
                    touchResponse2.getOutputMinFrameDuration = f6;
                    touchResponse2.getHighSpeedVideoSizesFor = f7;
                    touchResponse2.getHighResolutionOutputSizeshNQ4ISI = false;
                }
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null && transition.unwrapAs != null && !this.isOutputSupportedForhNQ4ISI) {
            androidx.constraintlayout.motion.widget.TouchResponse touchResponse3 = this.getHighSpeedVideoFpsRangesFor.unwrapAs;
            androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker motionTracker2 = this.toString;
            if (!touchResponse3.getInputSizeshNQ4ISI) {
                motionTracker2.addMovement(motionEvent);
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    touchResponse3.getOutputMinFrameDuration = motionEvent.getRawX();
                    touchResponse3.getHighSpeedVideoSizesFor = motionEvent.getRawY();
                    touchResponse3.getHighResolutionOutputSizeshNQ4ISI = false;
                } else if (action2 == 1) {
                    touchResponse3.getHighResolutionOutputSizeshNQ4ISI = false;
                    motionTracker2.computeCurrentVelocity(1000);
                    float xVelocity = motionTracker2.getXVelocity();
                    float yVelocity = motionTracker2.getYVelocity();
                    float progress = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                    int i5 = touchResponse3.ArtificialStackFrames;
                    if (i5 != -1) {
                        touchResponse3.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i5, progress, touchResponse3.coroutineCreation, touchResponse3.f2728a, touchResponse3.getHighSpeedVideoSizes);
                        c2 = 0;
                        c = 1;
                    } else {
                        float min = java.lang.Math.min(touchResponse3.getOutputSizeshNQ4ISI.getWidth(), touchResponse3.getOutputSizeshNQ4ISI.getHeight());
                        float[] fArr = touchResponse3.getHighSpeedVideoSizes;
                        c = 1;
                        fArr[1] = touchResponse3.getARTIFICIAL_FRAME_PACKAGE_NAME * min;
                        c2 = 0;
                        fArr[0] = min * touchResponse3._CREATION;
                    }
                    float f8 = touchResponse3._CREATION;
                    float[] fArr2 = touchResponse3.getHighSpeedVideoSizes;
                    float f9 = f8 != 0.0f ? xVelocity / fArr2[c2] : yVelocity / fArr2[c];
                    float f10 = !java.lang.Float.isNaN(f9) ? (f9 / 3.0f) + progress : progress;
                    if (f10 != 0.0f && f10 != 1.0f && (i2 = touchResponse3.getOutputMinFrameDurationlomOqCM) != 3) {
                        float f11 = ((double) f10) < 0.5d ? 0.0f : 1.0f;
                        if (i2 == 6) {
                            if (progress + f9 < 0.0f) {
                                f9 = java.lang.Math.abs(f9);
                            }
                            f11 = 1.0f;
                        }
                        if (touchResponse3.getOutputMinFrameDurationlomOqCM == 7) {
                            if (progress + f9 > 1.0f) {
                                f9 = -java.lang.Math.abs(f9);
                            }
                            f11 = 0.0f;
                        }
                        touchResponse3.getOutputSizeshNQ4ISI.touchAnimateTo(touchResponse3.getOutputMinFrameDurationlomOqCM, f11, f9);
                        if (0.0f >= progress || 1.0f <= progress) {
                            touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        }
                    } else if (0.0f >= f10 || 1.0f <= f10) {
                        touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    }
                } else if (action2 == 2) {
                    float rawY2 = motionEvent.getRawY() - touchResponse3.getHighSpeedVideoSizesFor;
                    float rawX2 = motionEvent.getRawX() - touchResponse3.getOutputMinFrameDuration;
                    if (java.lang.Math.abs((touchResponse3._CREATION * rawX2) + (touchResponse3.getARTIFICIAL_FRAME_PACKAGE_NAME * rawY2)) > touchResponse3.getHighSpeedVideoFpsRangesFor || touchResponse3.getHighResolutionOutputSizeshNQ4ISI) {
                        float progress2 = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                        if (!touchResponse3.getHighResolutionOutputSizeshNQ4ISI) {
                            touchResponse3.getHighResolutionOutputSizeshNQ4ISI = true;
                            touchResponse3.getOutputSizeshNQ4ISI.setProgress(progress2);
                        }
                        int i6 = touchResponse3.ArtificialStackFrames;
                        if (i6 != -1) {
                            touchResponse3.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i6, progress2, touchResponse3.coroutineCreation, touchResponse3.f2728a, touchResponse3.getHighSpeedVideoSizes);
                            c4 = 0;
                            c3 = 1;
                        } else {
                            float min2 = java.lang.Math.min(touchResponse3.getOutputSizeshNQ4ISI.getWidth(), touchResponse3.getOutputSizeshNQ4ISI.getHeight());
                            float[] fArr3 = touchResponse3.getHighSpeedVideoSizes;
                            c3 = 1;
                            fArr3[1] = touchResponse3.getARTIFICIAL_FRAME_PACKAGE_NAME * min2;
                            c4 = 0;
                            fArr3[0] = min2 * touchResponse3._CREATION;
                        }
                        float f12 = touchResponse3._CREATION;
                        float[] fArr4 = touchResponse3.getHighSpeedVideoSizes;
                        if (java.lang.Math.abs(((f12 * fArr4[c4]) + (touchResponse3.getARTIFICIAL_FRAME_PACKAGE_NAME * fArr4[c3])) * touchResponse3.Camera2StreamConfigurationMap) < 0.01d) {
                            float[] fArr5 = touchResponse3.getHighSpeedVideoSizes;
                            c5 = 0;
                            fArr5[0] = 0.01f;
                            c6 = 1;
                            fArr5[1] = 0.01f;
                        } else {
                            c5 = 0;
                            c6 = 1;
                        }
                        if (touchResponse3._CREATION != 0.0f) {
                            f = rawX2 / touchResponse3.getHighSpeedVideoSizes[c5];
                        } else {
                            f = rawY2 / touchResponse3.getHighSpeedVideoSizes[c6];
                        }
                        float max = java.lang.Math.max(java.lang.Math.min(progress2 + f, 1.0f), 0.0f);
                        if (touchResponse3.getOutputMinFrameDurationlomOqCM == 6) {
                            max = java.lang.Math.max(max, 0.01f);
                        }
                        if (touchResponse3.getOutputMinFrameDurationlomOqCM == 7) {
                            max = java.lang.Math.min(max, 0.99f);
                        }
                        float progress3 = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                        if (max != progress3) {
                            if (progress3 == 0.0f || progress3 == 1.0f) {
                                touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes(progress3 == 0.0f);
                            }
                            touchResponse3.getOutputSizeshNQ4ISI.setProgress(max);
                            motionTracker2.computeCurrentVelocity(1000);
                            touchResponse3.getOutputSizeshNQ4ISI.getOutputSizes = touchResponse3._CREATION != 0.0f ? motionTracker2.getXVelocity() / touchResponse3.getHighSpeedVideoSizes[0] : motionTracker2.getYVelocity() / touchResponse3.getHighSpeedVideoSizes[1];
                        } else {
                            touchResponse3.getOutputSizeshNQ4ISI.getOutputSizes = 0.0f;
                        }
                        touchResponse3.getOutputMinFrameDuration = motionEvent.getRawX();
                        touchResponse3.getHighSpeedVideoSizesFor = motionEvent.getRawY();
                    }
                }
            } else {
                motionTracker2.addMovement(motionEvent);
                int action3 = motionEvent.getAction();
                if (action3 == 0) {
                    touchResponse3.getOutputMinFrameDuration = motionEvent.getRawX();
                    touchResponse3.getHighSpeedVideoSizesFor = motionEvent.getRawY();
                    touchResponse3.getHighResolutionOutputSizeshNQ4ISI = false;
                } else if (action3 == 1) {
                    touchResponse3.getHighResolutionOutputSizeshNQ4ISI = false;
                    motionTracker2.computeCurrentVelocity(16);
                    float xVelocity2 = motionTracker2.getXVelocity();
                    float yVelocity2 = motionTracker2.getYVelocity();
                    float progress4 = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                    float width = touchResponse3.getOutputSizeshNQ4ISI.getWidth() / 2.0f;
                    float height = touchResponse3.getOutputSizeshNQ4ISI.getHeight() / 2.0f;
                    int i7 = touchResponse3.unwrapAs;
                    if (i7 != -1) {
                        android.view.View findViewById = touchResponse3.getOutputSizeshNQ4ISI.findViewById(i7);
                        touchResponse3.getOutputSizeshNQ4ISI.getLocationOnScreen(touchResponse3.coroutineBoundary);
                        left = touchResponse3.coroutineBoundary[0] + ((findViewById.getLeft() + findViewById.getRight()) / 2.0f);
                        f2 = touchResponse3.coroutineBoundary[1];
                        top = findViewById.getTop();
                        bottom = findViewById.getBottom();
                    } else {
                        int i8 = touchResponse3.ArtificialStackFrames;
                        if (i8 != -1) {
                            androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = touchResponse3.getOutputSizeshNQ4ISI;
                            android.view.View findViewById2 = touchResponse3.getOutputSizeshNQ4ISI.findViewById(motionLayout2.getOutputMinFrameDuration.get(motionLayout2.findViewById(i8)).getAnimateRelativeTo());
                            touchResponse3.getOutputSizeshNQ4ISI.getLocationOnScreen(touchResponse3.coroutineBoundary);
                            left = touchResponse3.coroutineBoundary[0] + ((findViewById2.getLeft() + findViewById2.getRight()) / 2.0f);
                            f2 = touchResponse3.coroutineBoundary[1];
                            top = findViewById2.getTop();
                            bottom = findViewById2.getBottom();
                        }
                        float rawX3 = motionEvent.getRawX() - width;
                        double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(motionEvent.getRawY() - height, rawX3));
                        i3 = touchResponse3.ArtificialStackFrames;
                        if (i3 == -1) {
                            touchResponse3.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i3, progress4, touchResponse3.coroutineCreation, touchResponse3.f2728a, touchResponse3.getHighSpeedVideoSizes);
                            touchResponse3.getHighSpeedVideoSizes[1] = (float) java.lang.Math.toDegrees(r7[1]);
                        } else {
                            touchResponse3.getHighSpeedVideoSizes[1] = 360.0f;
                        }
                        float degrees2 = ((float) (java.lang.Math.toDegrees(java.lang.Math.atan2(yVelocity2 + r15, xVelocity2 + rawX3)) - degrees)) * 62.5f;
                        f3 = java.lang.Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * touchResponse3.Camera2StreamConfigurationMap) / touchResponse3.getHighSpeedVideoSizes[1]) + progress4 : progress4;
                        if (f3 == 0.0f && f3 != 1.0f && (i4 = touchResponse3.getOutputMinFrameDurationlomOqCM) != 3) {
                            float f13 = (degrees2 * touchResponse3.Camera2StreamConfigurationMap) / touchResponse3.getHighSpeedVideoSizes[1];
                            float f14 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
                            if (i4 == 6) {
                                if (progress4 + f13 < 0.0f) {
                                    f13 = java.lang.Math.abs(f13);
                                }
                                f14 = 1.0f;
                            }
                            if (touchResponse3.getOutputMinFrameDurationlomOqCM == 7) {
                                if (progress4 + f13 > 1.0f) {
                                    f13 = -java.lang.Math.abs(f13);
                                }
                                f14 = 0.0f;
                            }
                            touchResponse3.getOutputSizeshNQ4ISI.touchAnimateTo(touchResponse3.getOutputMinFrameDurationlomOqCM, f14, f13 * 3.0f);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                            }
                        } else if (0.0f < f3 || 1.0f <= f3) {
                            touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        }
                    }
                    float f15 = left;
                    height = ((top + bottom) / 2.0f) + f2;
                    width = f15;
                    float rawX32 = motionEvent.getRawX() - width;
                    double degrees3 = java.lang.Math.toDegrees(java.lang.Math.atan2(motionEvent.getRawY() - height, rawX32));
                    i3 = touchResponse3.ArtificialStackFrames;
                    if (i3 == -1) {
                    }
                    float degrees22 = ((float) (java.lang.Math.toDegrees(java.lang.Math.atan2(yVelocity2 + r15, xVelocity2 + rawX32)) - degrees3)) * 62.5f;
                    if (java.lang.Float.isNaN(degrees22)) {
                    }
                    if (f3 == 0.0f) {
                    }
                    if (0.0f < f3) {
                    }
                    touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                } else if (action3 == 2) {
                    motionEvent.getRawY();
                    motionEvent.getRawX();
                    float width2 = touchResponse3.getOutputSizeshNQ4ISI.getWidth() / 2.0f;
                    float height2 = touchResponse3.getOutputSizeshNQ4ISI.getHeight() / 2.0f;
                    int i9 = touchResponse3.unwrapAs;
                    if (i9 != -1) {
                        android.view.View findViewById3 = touchResponse3.getOutputSizeshNQ4ISI.findViewById(i9);
                        touchResponse3.getOutputSizeshNQ4ISI.getLocationOnScreen(touchResponse3.coroutineBoundary);
                        float top2 = touchResponse3.coroutineBoundary[1] + ((findViewById3.getTop() + findViewById3.getBottom()) / 2.0f);
                        width2 = touchResponse3.coroutineBoundary[0] + ((findViewById3.getLeft() + findViewById3.getRight()) / 2.0f);
                        height2 = top2;
                    } else {
                        int i10 = touchResponse3.ArtificialStackFrames;
                        if (i10 != -1) {
                            androidx.constraintlayout.motion.widget.MotionLayout motionLayout3 = touchResponse3.getOutputSizeshNQ4ISI;
                            if (touchResponse3.getOutputSizeshNQ4ISI.findViewById(motionLayout3.getOutputMinFrameDuration.get(motionLayout3.findViewById(i10)).getAnimateRelativeTo()) != null) {
                                touchResponse3.getOutputSizeshNQ4ISI.getLocationOnScreen(touchResponse3.coroutineBoundary);
                                width2 = touchResponse3.coroutineBoundary[0] + ((r5.getLeft() + r5.getRight()) / 2.0f);
                                height2 = touchResponse3.coroutineBoundary[1] + ((r5.getTop() + r5.getBottom()) / 2.0f);
                            }
                        }
                    }
                    float rawX4 = motionEvent.getRawX();
                    float rawY3 = motionEvent.getRawY();
                    float f16 = height2;
                    float atan2 = (float) (((java.lang.Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2) - java.lang.Math.atan2(touchResponse3.getHighSpeedVideoSizesFor - height2, touchResponse3.getOutputMinFrameDuration - width2)) * 180.0d) / 3.141592653589793d);
                    if (atan2 > 330.0f) {
                        atan2 -= 360.0f;
                    } else if (atan2 < -330.0f) {
                        atan2 += 360.0f;
                    }
                    if (java.lang.Math.abs(atan2) > 0.01d || touchResponse3.getHighResolutionOutputSizeshNQ4ISI) {
                        float progress5 = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                        if (!touchResponse3.getHighResolutionOutputSizeshNQ4ISI) {
                            touchResponse3.getHighResolutionOutputSizeshNQ4ISI = true;
                            touchResponse3.getOutputSizeshNQ4ISI.setProgress(progress5);
                        }
                        int i11 = touchResponse3.ArtificialStackFrames;
                        if (i11 != -1) {
                            touchResponse3.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i11, progress5, touchResponse3.coroutineCreation, touchResponse3.f2728a, touchResponse3.getHighSpeedVideoSizes);
                            c7 = 1;
                            touchResponse3.getHighSpeedVideoSizes[1] = (float) java.lang.Math.toDegrees(r11[1]);
                        } else {
                            c7 = 1;
                            touchResponse3.getHighSpeedVideoSizes[1] = 360.0f;
                        }
                        float max2 = java.lang.Math.max(java.lang.Math.min(progress5 + ((atan2 * touchResponse3.Camera2StreamConfigurationMap) / touchResponse3.getHighSpeedVideoSizes[c7]), 1.0f), 0.0f);
                        float progress6 = touchResponse3.getOutputSizeshNQ4ISI.getProgress();
                        if (max2 != progress6) {
                            if (progress6 == 0.0f || progress6 == 1.0f) {
                                touchResponse3.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes(progress6 == 0.0f);
                            }
                            touchResponse3.getOutputSizeshNQ4ISI.setProgress(max2);
                            motionTracker2.computeCurrentVelocity(1000);
                            float xVelocity3 = motionTracker2.getXVelocity();
                            double yVelocity3 = motionTracker2.getYVelocity();
                            double d = xVelocity3;
                            touchResponse3.getOutputSizeshNQ4ISI.getOutputSizes = (float) java.lang.Math.toDegrees((float) ((java.lang.Math.hypot(yVelocity3, d) * java.lang.Math.sin(java.lang.Math.atan2(yVelocity3, d) - r7)) / java.lang.Math.hypot(rawX4 - width2, rawY3 - f16)));
                        } else {
                            touchResponse3.getOutputSizeshNQ4ISI.getOutputSizes = 0.0f;
                        }
                        touchResponse3.getOutputMinFrameDuration = motionEvent.getRawX();
                        touchResponse3.getHighSpeedVideoSizesFor = motionEvent.getRawY();
                    }
                }
            }
        }
        this.Camera2StreamConfigurationMap = motionEvent.getRawX();
        this.getHighResolutionOutputSizeshNQ4ISI = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (motionTracker = this.toString) == null) {
            return;
        }
        motionTracker.recycle();
        this.toString = null;
        if (motionLayout.getHighResolutionOutputSizeshNQ4ISI != -1) {
            getHighResolutionOutputSizeshNQ4ISI(motionLayout, motionLayout.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public android.view.animation.Interpolator getInterpolator() {
        int i = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        if (i == -2) {
            return android.view.animation.AnimationUtils.loadInterpolator(this.getValidOutputFormatsForInputhNQ4ISI.getContext(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes);
        }
        if (i == -1) {
            final androidx.constraintlayout.core.motion.utils.Easing interpolator = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI);
            return new android.view.animation.Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (float) interpolator.get(f);
                }
            };
        }
        if (i == 0) {
            return new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new android.view.animation.AccelerateInterpolator();
        }
        if (i == 2) {
            return new android.view.animation.DecelerateInterpolator();
        }
        if (i == 4) {
            return new android.view.animation.BounceInterpolator();
        }
        if (i == 5) {
            return new android.view.animation.OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new android.view.animation.AnticipateInterpolator();
    }

    public int getDuration() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            return transition.getHighSpeedVideoSizesFor;
        }
        return this.getInputSizeshNQ4ISI;
    }

    public void setDuration(int i) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            transition.setDuration(i);
        } else {
            this.getInputSizeshNQ4ISI = i;
        }
    }

    public int gatPathMotionArc() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            return transition.getOutputSizes;
        }
        return -1;
    }

    public float getStaggered() {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.getHighSpeedVideoFpsRangesFor;
        if (transition != null) {
            return transition.isOutputSupportedForhNQ4ISI;
        }
        return 0.0f;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        for (int i = 0; i < this.getHighSpeedVideoSizesFor.size(); i++) {
            int keyAt = this.getHighSpeedVideoSizesFor.keyAt(i);
            if (getHighSpeedVideoSizes(keyAt)) {
                return;
            }
            Camera2StreamConfigurationMap(keyAt, motionLayout);
        }
    }

    private boolean getHighSpeedVideoSizes(int i) {
        int i2 = this.getOutputStallDurationlomOqCM.get(i);
        int size = this.getOutputStallDurationlomOqCM.size();
        while (i2 > 0) {
            if (i2 == i || size < 0) {
                return true;
            }
            i2 = this.getOutputStallDurationlomOqCM.get(i2);
            size--;
        }
        return false;
    }

    private void Camera2StreamConfigurationMap(int i, androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.getHighSpeedVideoSizesFor.get(i);
        constraintSet.derivedState = constraintSet.mIdString;
        int i2 = this.getOutputStallDurationlomOqCM.get(i);
        if (i2 > 0) {
            Camera2StreamConfigurationMap(i2, motionLayout);
            androidx.constraintlayout.widget.ConstraintSet constraintSet2 = this.getHighSpeedVideoSizesFor.get(i2);
            if (constraintSet2 == null) {
                androidx.constraintlayout.motion.widget.Debug.getName(this.getValidOutputFormatsForInputhNQ4ISI.getContext(), i2);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(constraintSet.derivedState);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(constraintSet2.derivedState);
            constraintSet.derivedState = sb.toString();
            constraintSet.readFallback(constraintSet2);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(constraintSet.derivedState);
            sb2.append("  layout");
            constraintSet.derivedState = sb2.toString();
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static java.lang.String stripID(java.lang.String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    public int lookUpConstraintId(java.lang.String str) {
        java.lang.Integer num = this.getInputFormats.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public java.lang.String lookUpConstraintName(int i) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : this.getInputFormats.entrySet()) {
            java.lang.Integer value = entry.getValue();
            if (value != null && value.intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void disableAutoTransition(boolean z) {
        this.getOutputStallDuration = z;
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        if (this.toString != null || this.getOutputStallDuration) {
            return false;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            if (next.getHighSpeedVideoFpsRanges != 0 && ((transition = this.getHighSpeedVideoFpsRangesFor) != next || !transition.isTransitionFlag(2))) {
                if (i == next.getHighSpeedVideoFpsRangesFor && (next.getHighSpeedVideoFpsRanges == 4 || next.getHighSpeedVideoFpsRanges == 2)) {
                    motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.getHighSpeedVideoFpsRanges == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.getHighSpeedVideoFpsRanges(true);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        motionLayout.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    return true;
                }
                if (i == next.getHighResolutionOutputSizeshNQ4ISI && (next.getHighSpeedVideoFpsRanges == 3 || next.getHighSpeedVideoFpsRanges == 1)) {
                    motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.getHighSpeedVideoFpsRanges == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.getHighSpeedVideoFpsRanges(true);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        motionLayout.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        motionLayout.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> getTransitionsWithState(int i) {
        int stateGetConstraintID;
        androidx.constraintlayout.widget.StateSet stateSet = this.getHighSpeedVideoFpsRanges;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1)) != -1) {
            i = stateGetConstraintID;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.unwrapAs.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            if (next.getHighSpeedVideoFpsRangesFor == i || next.getHighResolutionOutputSizeshNQ4ISI == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
