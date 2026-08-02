package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class ViewTransition {
    public static final java.lang.String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    public static final java.lang.String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    public static final java.lang.String VIEW_TRANSITION_TAG = "ViewTransition";
    int Camera2StreamConfigurationMap;
    private int CoroutineDebuggingKt;
    private java.lang.String coroutineCreation;
    androidx.constraintlayout.widget.ConstraintSet.Constraint getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    android.content.Context getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    androidx.constraintlayout.motion.widget.KeyFrames getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI = -1;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private int toString;
    private int unwrapAs;

    public int getSharedValueCurrent() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setSharedValueCurrent(int i) {
        this.getValidOutputFormatsForInputhNQ4ISI = i;
    }

    public int getStateTransition() {
        return this.getOutputFormats;
    }

    public void setStateTransition(int i) {
        this.getOutputFormats = i;
    }

    public int getSharedValue() {
        return this.isOutputSupportedFor;
    }

    public void setSharedValue(int i) {
        this.isOutputSupportedFor = i;
    }

    public int getSharedValueID() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public void setSharedValueID(int i) {
        this.isOutputSupportedForhNQ4ISI = i;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewTransition(");
        sb.append(androidx.constraintlayout.motion.widget.Debug.getName(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r2.equals(androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_METHOD) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    ViewTransition(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.getOutputFormats = -1;
        this.getHighSpeedVideoFpsRanges = false;
        this.unwrapAs = 0;
        this.getOutputSizes = -1;
        this.CoroutineDebuggingKt = -1;
        this.getOutputMinFrameDuration = 0;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputStallDuration = -1;
        this.getInputSizeshNQ4ISI = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getOutputStallDurationlomOqCM = -1;
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.isOutputSupportedFor = -1;
        this.isOutputSupportedForhNQ4ISI = -1;
        this.getHighSpeedVideoSizes = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    java.lang.String name2 = xmlPullParser.getName();
                    switch (name2.hashCode()) {
                        case -1962203927:
                            if (name2.equals(CONSTRAINT_OVERRIDE)) {
                                this.getHighResolutionOutputSizeshNQ4ISI = androidx.constraintlayout.widget.ConstraintSet.buildDelta(context, xmlPullParser);
                                break;
                            }
                            androidx.constraintlayout.motion.widget.Debug.getLoc();
                            xmlPullParser.getLineNumber();
                            break;
                        case -1239391468:
                            if (name2.equals(KEY_FRAME_SET_TAG)) {
                                this.getInputFormats = new androidx.constraintlayout.motion.widget.KeyFrames(context, xmlPullParser);
                                break;
                            }
                            androidx.constraintlayout.motion.widget.Debug.getLoc();
                            xmlPullParser.getLineNumber();
                            break;
                        case 61998586:
                            if (name2.equals(VIEW_TRANSITION_TAG)) {
                                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.ViewTransition);
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                for (int i = 0; i < indexCount; i++) {
                                    int index = obtainStyledAttributes.getIndex(i);
                                    if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_android_id) {
                                        this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRangesFor);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_motionTarget) {
                                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                                            int resourceId = obtainStyledAttributes.getResourceId(index, this.toString);
                                            this.toString = resourceId;
                                            if (resourceId == -1) {
                                                this.coroutineCreation = obtainStyledAttributes.getString(index);
                                            }
                                        } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                                            this.coroutineCreation = obtainStyledAttributes.getString(index);
                                        } else {
                                            this.toString = obtainStyledAttributes.getResourceId(index, this.toString);
                                        }
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_onStateTransition) {
                                        this.getOutputFormats = obtainStyledAttributes.getInt(index, this.getOutputFormats);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_transitionDisable) {
                                        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoFpsRanges);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_pathMotionArc) {
                                        this.unwrapAs = obtainStyledAttributes.getInt(index, this.unwrapAs);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_duration) {
                                        this.getOutputSizes = obtainStyledAttributes.getInt(index, this.getOutputSizes);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_upDuration) {
                                        this.CoroutineDebuggingKt = obtainStyledAttributes.getInt(index, this.CoroutineDebuggingKt);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_viewTransitionMode) {
                                        this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getInt(index, this.getHighSpeedVideoSizesFor);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_motionInterpolator) {
                                        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                                        if (peekValue.type == 1) {
                                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                            this.getOutputStallDuration = resourceId2;
                                            if (resourceId2 != -1) {
                                                this.getOutputMinFrameDuration = -2;
                                            }
                                        } else if (peekValue.type == 3) {
                                            java.lang.String string = obtainStyledAttributes.getString(index);
                                            this.getOutputSizeshNQ4ISI = string;
                                            if (string == null || string.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) <= 0) {
                                                this.getOutputMinFrameDuration = -1;
                                            } else {
                                                this.getOutputStallDuration = obtainStyledAttributes.getResourceId(index, -1);
                                                this.getOutputMinFrameDuration = -2;
                                            }
                                        } else {
                                            this.getOutputMinFrameDuration = obtainStyledAttributes.getInteger(index, this.getOutputMinFrameDuration);
                                        }
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_setsTag) {
                                        this.getInputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(index, this.getInputSizeshNQ4ISI);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_clearsTag) {
                                        this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagSet) {
                                        this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getResourceId(index, this.getOutputStallDurationlomOqCM);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_ifTagNotSet) {
                                        this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getResourceId(index, this.getOutputMinFrameDurationlomOqCM);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValueId) {
                                        this.isOutputSupportedForhNQ4ISI = obtainStyledAttributes.getResourceId(index, this.isOutputSupportedForhNQ4ISI);
                                    } else if (index == androidx.constraintlayout.widget.R.styleable.ViewTransition_SharedValue) {
                                        this.isOutputSupportedFor = obtainStyledAttributes.getInteger(index, this.isOutputSupportedFor);
                                    }
                                }
                                obtainStyledAttributes.recycle();
                                break;
                            }
                            androidx.constraintlayout.motion.widget.Debug.getLoc();
                            xmlPullParser.getLineNumber();
                            break;
                        case 366511058:
                            break;
                        case 1791837707:
                            if (name2.equals(CUSTOM_ATTRIBUTE)) {
                                androidx.constraintlayout.widget.ConstraintAttribute.parse(context, xmlPullParser, this.getHighResolutionOutputSizeshNQ4ISI.mCustomConstraints);
                                break;
                            }
                            androidx.constraintlayout.motion.widget.Debug.getLoc();
                            xmlPullParser.getLineNumber();
                            break;
                        default:
                            androidx.constraintlayout.motion.widget.Debug.getLoc();
                            xmlPullParser.getLineNumber();
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else if (VIEW_TRANSITION_TAG.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    static class Animate {
        android.view.animation.Interpolator Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        long getInputFormats;
        float getOutputFormats;
        androidx.constraintlayout.motion.widget.MotionController getOutputMinFrameDuration;
        private final int getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        private final int getOutputStallDuration;
        androidx.constraintlayout.motion.widget.ViewTransitionController getOutputStallDurationlomOqCM;
        androidx.constraintlayout.core.motion.utils.KeyCache getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.motion.utils.KeyCache();
        boolean getInputSizeshNQ4ISI = false;
        android.graphics.Rect getOutputSizeshNQ4ISI = new android.graphics.Rect();

        Animate(androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController, androidx.constraintlayout.motion.widget.MotionController motionController, int i, int i2, int i3, android.view.animation.Interpolator interpolator, int i4, int i5) {
            this.getHighSpeedVideoSizes = false;
            this.getOutputStallDurationlomOqCM = viewTransitionController;
            this.getOutputMinFrameDuration = motionController;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputSizes = i2;
            long nanoTime = java.lang.System.nanoTime();
            this.getInputFormats = nanoTime;
            this.getHighSpeedVideoSizesFor = nanoTime;
            androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController2 = this.getOutputStallDurationlomOqCM;
            if (viewTransitionController2.getHighSpeedVideoFpsRanges == null) {
                viewTransitionController2.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            }
            viewTransitionController2.getHighSpeedVideoFpsRanges.add(this);
            this.Camera2StreamConfigurationMap = interpolator;
            this.getOutputMinFrameDurationlomOqCM = i4;
            this.getOutputStallDuration = i5;
            if (i3 == 3) {
                this.getHighSpeedVideoSizes = true;
            }
            this.getHighSpeedVideoFpsRangesFor = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            if (this.getInputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        final void Camera2StreamConfigurationMap() {
            this.getInputSizeshNQ4ISI = true;
            int i = this.getOutputSizes;
            if (i != -1) {
                this.getHighSpeedVideoFpsRangesFor = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor.invalidate();
            this.getHighSpeedVideoSizesFor = java.lang.System.nanoTime();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            long nanoTime = java.lang.System.nanoTime();
            long j = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = nanoTime;
            float f = this.getOutputFormats - (((float) ((nanoTime - j) * 1.0E-6d)) * this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats = f;
            if (f < 0.0f) {
                this.getOutputFormats = 0.0f;
            }
            android.view.animation.Interpolator interpolator = this.Camera2StreamConfigurationMap;
            float interpolation = interpolator == null ? this.getOutputFormats : interpolator.getInterpolation(this.getOutputFormats);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration;
            boolean highResolutionOutputSizeshNQ4ISI = motionController.getHighResolutionOutputSizeshNQ4ISI(motionController._BOUNDARY, interpolation, nanoTime, this.getHighSpeedVideoFpsRanges);
            if (this.getOutputFormats <= 0.0f) {
                if (this.getOutputMinFrameDurationlomOqCM != -1) {
                    this.getOutputMinFrameDuration.getView().setTag(this.getOutputMinFrameDurationlomOqCM, java.lang.Long.valueOf(java.lang.System.nanoTime()));
                }
                if (this.getOutputStallDuration != -1) {
                    this.getOutputMinFrameDuration.getView().setTag(this.getOutputStallDuration, null);
                }
                this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizes.add(this);
            }
            if (this.getOutputFormats > 0.0f || highResolutionOutputSizeshNQ4ISI) {
                this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor.invalidate();
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            long nanoTime = java.lang.System.nanoTime();
            long j = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = nanoTime;
            float f = this.getOutputFormats + (((float) ((nanoTime - j) * 1.0E-6d)) * this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats = f;
            if (f >= 1.0f) {
                this.getOutputFormats = 1.0f;
            }
            android.view.animation.Interpolator interpolator = this.Camera2StreamConfigurationMap;
            float interpolation = interpolator == null ? this.getOutputFormats : interpolator.getInterpolation(this.getOutputFormats);
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration;
            boolean highResolutionOutputSizeshNQ4ISI = motionController.getHighResolutionOutputSizeshNQ4ISI(motionController._BOUNDARY, interpolation, nanoTime, this.getHighSpeedVideoFpsRanges);
            if (this.getOutputFormats >= 1.0f) {
                if (this.getOutputMinFrameDurationlomOqCM != -1) {
                    this.getOutputMinFrameDuration.getView().setTag(this.getOutputMinFrameDurationlomOqCM, java.lang.Long.valueOf(java.lang.System.nanoTime()));
                }
                if (this.getOutputStallDuration != -1) {
                    this.getOutputMinFrameDuration.getView().setTag(this.getOutputStallDuration, null);
                }
                if (!this.getHighSpeedVideoSizes) {
                    this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizes.add(this);
                }
            }
            if (this.getOutputFormats < 1.0f || highResolutionOutputSizeshNQ4ISI) {
                this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor.invalidate();
            }
        }
    }

    final void getHighSpeedVideoSizes(androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, final android.view.View... viewArr) {
        android.view.animation.Interpolator loadInterpolator;
        android.view.animation.Interpolator interpolator;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 == 2) {
            android.view.View view = viewArr[0];
            androidx.constraintlayout.motion.widget.MotionController motionController = new androidx.constraintlayout.motion.widget.MotionController(view);
            motionController.coroutineCreation.isOutputSupportedForhNQ4ISI = 0.0f;
            motionController.coroutineCreation.getOutputMinFrameDurationlomOqCM = 0.0f;
            motionController.isOutputSupportedFor = true;
            androidx.constraintlayout.motion.widget.MotionPaths motionPaths = motionController.coroutineCreation;
            float x = view.getX();
            float y = view.getY();
            float width = view.getWidth();
            float height = view.getHeight();
            motionPaths.isOutputSupportedFor = x;
            motionPaths.toString = y;
            motionPaths.unwrapAs = width;
            motionPaths.getOutputFormats = height;
            androidx.constraintlayout.motion.widget.MotionPaths motionPaths2 = motionController.getOutputFormats;
            float x2 = view.getX();
            float y2 = view.getY();
            float width2 = view.getWidth();
            float height2 = view.getHeight();
            motionPaths2.isOutputSupportedFor = x2;
            motionPaths2.toString = y2;
            motionPaths2.unwrapAs = width2;
            motionPaths2.getOutputFormats = height2;
            motionController.ArtificialStackFrames.Camera2StreamConfigurationMap(view);
            motionController.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(view);
            this.getInputFormats.addAllFrames(motionController);
            motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.getOutputSizes, java.lang.System.nanoTime());
            int i3 = this.getOutputSizes;
            int i4 = this.CoroutineDebuggingKt;
            int i5 = this.getOutputFormats;
            android.content.Context context = motionLayout.getContext();
            int i6 = this.getOutputMinFrameDuration;
            if (i6 == -2) {
                loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, this.getOutputStallDuration);
            } else if (i6 == -1) {
                final androidx.constraintlayout.core.motion.utils.Easing interpolator2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(this.getOutputSizeshNQ4ISI);
                interpolator = new android.view.animation.Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f) {
                        return (float) interpolator2.get(f);
                    }
                };
                new androidx.constraintlayout.motion.widget.ViewTransition.Animate(viewTransitionController, motionController, i3, i4, i5, interpolator, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                return;
            } else if (i6 == 0) {
                loadInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
            } else if (i6 == 1) {
                loadInterpolator = new android.view.animation.AccelerateInterpolator();
            } else if (i6 == 2) {
                loadInterpolator = new android.view.animation.DecelerateInterpolator();
            } else if (i6 == 4) {
                loadInterpolator = new android.view.animation.BounceInterpolator();
            } else if (i6 != 5) {
                loadInterpolator = i6 != 6 ? null : new android.view.animation.AnticipateInterpolator();
            } else {
                loadInterpolator = new android.view.animation.OvershootInterpolator();
            }
            interpolator = loadInterpolator;
            new androidx.constraintlayout.motion.widget.ViewTransition.Animate(viewTransitionController, motionController, i3, i4, i5, interpolator, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            return;
        }
        if (i2 == 1) {
            for (int i7 : motionLayout.getConstraintSetIds()) {
                if (i7 != i) {
                    androidx.constraintlayout.widget.ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i7);
                    for (android.view.View view2 : viewArr) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view2.getId());
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.getHighResolutionOutputSizeshNQ4ISI.mCustomConstraints);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet3 = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (android.view.View view3 : viewArr) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view3.getId());
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint4 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.getHighResolutionOutputSizeshNQ4ISI.mCustomConstraints);
            }
        }
        motionLayout.updateState(i, constraintSet3);
        motionLayout.updateState(androidx.constraintlayout.widget.R.id.view_transition, constraintSet);
        motionLayout.setState(androidx.constraintlayout.widget.R.id.view_transition, -1, -1);
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(-1, motionLayout.accessartificialFrame, androidx.constraintlayout.widget.R.id.view_transition, i);
        for (android.view.View view4 : viewArr) {
            int i8 = this.getOutputSizes;
            if (i8 != -1) {
                transition.setDuration(i8);
            }
            transition.setPathMotionArc(this.unwrapAs);
            transition.setInterpolatorInfo(this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration);
            int id = view4.getId();
            androidx.constraintlayout.motion.widget.KeyFrames keyFrames = this.getInputFormats;
            if (keyFrames != null) {
                java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
                androidx.constraintlayout.motion.widget.KeyFrames keyFrames2 = new androidx.constraintlayout.motion.widget.KeyFrames();
                java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = keyFramesForView.iterator();
                while (it.hasNext()) {
                    keyFrames2.addKey(it.next().mo9054clone().setViewId(id));
                }
                transition.addKeyFrame(keyFrames2);
            }
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.constraintlayout.motion.widget.ViewTransition viewTransition = androidx.constraintlayout.motion.widget.ViewTransition.this;
                android.view.View[] viewArr2 = viewArr;
                if (viewTransition.getInputSizeshNQ4ISI != -1) {
                    for (android.view.View view5 : viewArr2) {
                        view5.setTag(viewTransition.getInputSizeshNQ4ISI, java.lang.Long.valueOf(java.lang.System.nanoTime()));
                    }
                }
                if (viewTransition.Camera2StreamConfigurationMap != -1) {
                    for (android.view.View view6 : viewArr2) {
                        view6.setTag(viewTransition.Camera2StreamConfigurationMap, null);
                    }
                }
            }
        });
    }

    final boolean getHighSpeedVideoFpsRanges(android.view.View view) {
        java.lang.String str;
        if (view == null) {
            return false;
        }
        if ((this.toString == -1 && this.coroutineCreation == null) || !getHighSpeedVideoFpsRangesFor(view)) {
            return false;
        }
        if (view.getId() == this.toString) {
            return true;
        }
        return this.coroutineCreation != null && (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) && (str = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.coroutineCreation);
    }

    final boolean getHighSpeedVideoFpsRangesFor(android.view.View view) {
        int i = this.getOutputStallDurationlomOqCM;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
