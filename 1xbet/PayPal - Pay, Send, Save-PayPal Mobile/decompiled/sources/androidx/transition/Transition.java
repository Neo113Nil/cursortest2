package androidx.transition;

/* loaded from: classes3.dex */
public abstract class Transition implements java.lang.Cloneable {
    static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final java.lang.String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final java.lang.String MATCH_NAME_STR = "name";
    private java.util.ArrayList<androidx.transition.TransitionValues> mEndValuesList;
    private androidx.transition.Transition.EpicenterCallback mEpicenterCallback;
    private androidx.transition.Transition.TransitionListener[] mListenersCache;
    private androidx.collection.ArrayMap<java.lang.String, java.lang.String> mNameOverrides;
    androidx.transition.TransitionPropagation mPropagation;
    androidx.transition.Transition.SeekController mSeekController;
    long mSeekOffsetInParent;
    private java.util.ArrayList<androidx.transition.TransitionValues> mStartValuesList;
    long mTotalDuration;
    private static final android.animation.Animator[] EMPTY_ANIMATOR_ARRAY = new android.animation.Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final androidx.transition.PathMotion STRAIGHT_PATH_MOTION = new androidx.transition.PathMotion() { // from class: androidx.transition.Transition.1
        @Override // androidx.transition.PathMotion
        public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo>> sRunningAnimators = new java.lang.ThreadLocal<>();
    private java.lang.String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private android.animation.TimeInterpolator mInterpolator = null;
    java.util.ArrayList<java.lang.Integer> mTargetIds = new java.util.ArrayList<>();
    java.util.ArrayList<android.view.View> mTargets = new java.util.ArrayList<>();
    private java.util.ArrayList<java.lang.String> mTargetNames = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypes = null;
    private java.util.ArrayList<java.lang.Integer> mTargetIdExcludes = null;
    private java.util.ArrayList<android.view.View> mTargetExcludes = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeExcludes = null;
    private java.util.ArrayList<java.lang.String> mTargetNameExcludes = null;
    private java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes = null;
    private java.util.ArrayList<android.view.View> mTargetChildExcludes = null;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeChildExcludes = null;
    private androidx.transition.TransitionValuesMaps mStartValues = new androidx.transition.TransitionValuesMaps();
    private androidx.transition.TransitionValuesMaps mEndValues = new androidx.transition.TransitionValuesMaps();
    androidx.transition.TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    java.util.ArrayList<android.animation.Animator> mCurrentAnimators = new java.util.ArrayList<>();
    private android.animation.Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private androidx.transition.Transition mCloneParent = null;
    private java.util.ArrayList<androidx.transition.Transition.TransitionListener> mListeners = null;
    java.util.ArrayList<android.animation.Animator> mAnimators = new java.util.ArrayList<>();
    private androidx.transition.PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    public static abstract class EpicenterCallback {
        public abstract android.graphics.Rect onGetEpicenter(androidx.transition.Transition transition);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    private static boolean isValidMatch(int i) {
        return i > 0 && i <= 4;
    }

    public abstract void captureEndValues(androidx.transition.TransitionValues transitionValues);

    public abstract void captureStartValues(androidx.transition.TransitionValues transitionValues);

    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    public java.lang.String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public Transition() {
    }

    public Transition(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getOutputMinFrameDuration);
        android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) attributeSet;
        long namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        obtainStyledAttributes.recycle();
    }

    private static int[] parseMatchOrder(java.lang.String str) {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new android.view.InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    public final androidx.transition.Transition getRootTransition() {
        androidx.transition.Transition transition = this;
        while (true) {
            androidx.transition.TransitionSet transitionSet = transition.mParent;
            if (transitionSet == null) {
                return transition;
            }
            transition = transitionSet;
        }
    }

    public androidx.transition.Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public androidx.transition.Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public androidx.transition.Transition setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public android.animation.TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    androidx.transition.TransitionSeekController createSeekController() {
        androidx.transition.Transition.SeekController seekController = new androidx.transition.Transition.SeekController();
        this.mSeekController = seekController;
        addListener(seekController);
        return this.mSeekController;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new java.lang.IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i)) {
                throw new java.lang.IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void matchInstances(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2) {
        androidx.transition.TransitionValues remove;
        for (int camera2StreamConfigurationMap = arrayMap.getCamera2StreamConfigurationMap() - 1; camera2StreamConfigurationMap >= 0; camera2StreamConfigurationMap--) {
            android.view.View keyAt = arrayMap.keyAt(camera2StreamConfigurationMap);
            if (keyAt != null && isValidTarget(keyAt) && (remove = arrayMap2.remove(keyAt)) != null && isValidTarget(remove.view)) {
                this.mStartValuesList.add(arrayMap.removeAt(camera2StreamConfigurationMap));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, androidx.collection.LongSparseArray<android.view.View> longSparseArray, androidx.collection.LongSparseArray<android.view.View> longSparseArray2) {
        android.view.View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            android.view.View valueAt = longSparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(valueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, android.util.SparseArray<android.view.View> sparseArray, android.util.SparseArray<android.view.View> sparseArray2) {
        android.view.View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            android.view.View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(valueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap3, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap4) {
        android.view.View view;
        int camera2StreamConfigurationMap = arrayMap3.getCamera2StreamConfigurationMap();
        for (int i = 0; i < camera2StreamConfigurationMap; i++) {
            android.view.View valueAt = arrayMap3.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && isValidTarget(view)) {
                androidx.transition.TransitionValues transitionValues = arrayMap.get(valueAt);
                androidx.transition.TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void addUnmatched(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2) {
        for (int i = 0; i < arrayMap.getCamera2StreamConfigurationMap(); i++) {
            androidx.transition.TransitionValues valueAt = arrayMap.valueAt(i);
            if (isValidTarget(valueAt.view)) {
                this.mStartValuesList.add(valueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.getCamera2StreamConfigurationMap(); i2++) {
            androidx.transition.TransitionValues valueAt2 = arrayMap2.valueAt(i2);
            if (isValidTarget(valueAt2.view)) {
                this.mEndValuesList.add(valueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private void matchStartAndEnd(androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2) {
        androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap = new androidx.collection.ArrayMap<>(transitionValuesMaps.getHighSpeedVideoSizes);
        androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> arrayMap2 = new androidx.collection.ArrayMap<>(transitionValuesMaps2.getHighSpeedVideoSizes);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    matchInstances(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    matchNames(arrayMap, arrayMap2, transitionValuesMaps.getHighSpeedVideoFpsRanges, transitionValuesMaps2.getHighSpeedVideoFpsRanges);
                } else if (i2 == 3) {
                    matchIds(arrayMap, arrayMap2, transitionValuesMaps.Camera2StreamConfigurationMap, transitionValuesMaps2.Camera2StreamConfigurationMap);
                } else if (i2 == 4) {
                    matchItemIds(arrayMap, arrayMap2, transitionValuesMaps.getHighResolutionOutputSizeshNQ4ISI, transitionValuesMaps2.getHighResolutionOutputSizeshNQ4ISI);
                }
                i++;
            } else {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void createAnimators(android.view.ViewGroup viewGroup, androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2, java.util.ArrayList<androidx.transition.TransitionValues> arrayList, java.util.ArrayList<androidx.transition.TransitionValues> arrayList2) {
        android.animation.Animator createAnimator;
        android.animation.Animator animator;
        int i;
        boolean z;
        int i2;
        android.view.View view;
        android.animation.Animator animator2;
        androidx.transition.TransitionValues transitionValues;
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        boolean z2 = getRootTransition().mSeekController != null;
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            androidx.transition.TransitionValues transitionValues2 = arrayList.get(i3);
            androidx.transition.TransitionValues transitionValues3 = arrayList2.get(i3);
            if (transitionValues2 != null && !transitionValues2.getHighSpeedVideoFpsRangesFor.contains(this)) {
                transitionValues2 = null;
            }
            if (transitionValues3 != null && !transitionValues3.getHighSpeedVideoFpsRangesFor.contains(this)) {
                transitionValues3 = null;
            }
            if (!(transitionValues2 == null && transitionValues3 == null) && ((transitionValues2 == null || transitionValues3 == null || isTransitionRequired(transitionValues2, transitionValues3)) && (createAnimator = createAnimator(viewGroup, transitionValues2, transitionValues3)) != null)) {
                if (transitionValues3 != null) {
                    view = transitionValues3.view;
                    java.lang.String[] transitionProperties = getTransitionProperties();
                    animator = createAnimator;
                    if (transitionProperties == null || transitionProperties.length <= 0) {
                        i = size;
                        z = z2;
                        i2 = i3;
                    } else {
                        transitionValues = new androidx.transition.TransitionValues(view);
                        i = size;
                        androidx.transition.TransitionValues transitionValues4 = transitionValuesMaps2.getHighSpeedVideoSizes.get(view);
                        if (transitionValues4 != null) {
                            int i4 = 0;
                            while (i4 < transitionProperties.length) {
                                transitionValues.values.put(transitionProperties[i4], transitionValues4.values.get(transitionProperties[i4]));
                                i4++;
                                i3 = i3;
                                z2 = z2;
                                transitionValues4 = transitionValues4;
                            }
                        }
                        z = z2;
                        i2 = i3;
                        int camera2StreamConfigurationMap = runningAnimators.getCamera2StreamConfigurationMap();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= camera2StreamConfigurationMap) {
                                animator2 = animator;
                                break;
                            }
                            androidx.transition.Transition.AnimationInfo animationInfo = runningAnimators.get(runningAnimators.keyAt(i5));
                            if (animationInfo.getHighResolutionOutputSizeshNQ4ISI != null && animationInfo.Camera2StreamConfigurationMap == view && animationInfo.getHighSpeedVideoFpsRanges.equals(getName()) && animationInfo.getHighResolutionOutputSizeshNQ4ISI.equals(transitionValues)) {
                                animator2 = null;
                                break;
                            }
                            i5++;
                        }
                        if (animator2 != null) {
                            androidx.transition.TransitionPropagation transitionPropagation = this.mPropagation;
                            if (transitionPropagation != null) {
                                long startDelay = transitionPropagation.getStartDelay(viewGroup, this, transitionValues2, transitionValues3);
                                sparseIntArray.put(this.mAnimators.size(), (int) startDelay);
                                j = java.lang.Math.min(startDelay, j);
                            }
                            long j2 = j;
                            androidx.transition.Transition.AnimationInfo animationInfo2 = new androidx.transition.Transition.AnimationInfo(view, getName(), this, viewGroup.getWindowId(), transitionValues, animator2);
                            if (z) {
                                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                                animatorSet.play(animator2);
                                animator2 = animatorSet;
                            }
                            runningAnimators.put(animator2, animationInfo2);
                            this.mAnimators.add(animator2);
                            j = j2;
                        }
                    }
                } else {
                    animator = createAnimator;
                    i = size;
                    z = z2;
                    i2 = i3;
                    view = transitionValues2.view;
                }
                animator2 = animator;
                transitionValues = null;
                if (animator2 != null) {
                }
            } else {
                i = size;
                z = z2;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                androidx.transition.Transition.AnimationInfo animationInfo3 = runningAnimators.get(this.mAnimators.get(sparseIntArray.keyAt(i6)));
                animationInfo3.getHighSpeedVideoSizes.setStartDelay((sparseIntArray.valueAt(i6) - j) + animationInfo3.getHighSpeedVideoSizes.getStartDelay());
            }
        }
    }

    boolean isValidTarget(android.view.View view) {
        java.util.ArrayList<java.lang.Class<?>> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        int id = view.getId();
        java.util.ArrayList<java.lang.Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        java.util.ArrayList<android.view.View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        java.util.ArrayList<java.lang.Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && androidx.core.view.ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(androidx.core.view.ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(java.lang.Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> getRunningAnimators() {
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap2 = new androidx.collection.ArrayMap<>();
        sRunningAnimators.set(arrayMap2);
        return arrayMap2;
    }

    protected void runAnimators() {
        start();
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        java.util.Iterator<android.animation.Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            android.animation.Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    private void runAnimator(android.animation.Animator animator, final androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> arrayMap) {
        if (animator != null) {
            animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator2) {
                    androidx.transition.Transition.this.mCurrentAnimators.add(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator2) {
                    arrayMap.remove(animator2);
                    androidx.transition.Transition.this.mCurrentAnimators.remove(animator2);
                }
            });
            animate(animator);
        }
    }

    void prepareAnimatorsForSeeking() {
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            android.animation.Animator animator = this.mAnimators.get(i);
            androidx.transition.Transition.AnimationInfo animationInfo = runningAnimators.get(animator);
            if (animator != null && animationInfo != null) {
                if (getDuration() >= 0) {
                    animationInfo.getHighSpeedVideoSizes.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animationInfo.getHighSpeedVideoSizes.setStartDelay(getStartDelay() + animationInfo.getHighSpeedVideoSizes.getStartDelay());
                }
                if (getInterpolator() != null) {
                    animationInfo.getHighSpeedVideoSizes.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = java.lang.Math.max(this.mTotalDuration, androidx.transition.Transition.Impl26.getHighSpeedVideoFpsRangesFor(animator));
            }
        }
        this.mAnimators.clear();
    }

    public androidx.transition.Transition addTarget(android.view.View view) {
        this.mTargets.add(view);
        return this;
    }

    public androidx.transition.Transition addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(java.lang.Integer.valueOf(i));
        }
        return this;
    }

    public androidx.transition.Transition addTarget(java.lang.String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new java.util.ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public androidx.transition.Transition addTarget(java.lang.Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new java.util.ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public androidx.transition.Transition removeTarget(android.view.View view) {
        this.mTargets.remove(view);
        return this;
    }

    public androidx.transition.Transition removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(java.lang.Integer.valueOf(i));
        }
        return this;
    }

    public androidx.transition.Transition removeTarget(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public androidx.transition.Transition removeTarget(java.lang.Class<?> cls) {
        java.util.ArrayList<java.lang.Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    private static <T> java.util.ArrayList<T> excludeObject(java.util.ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRangesFor(arrayList, t);
        }
        return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRanges(arrayList, t);
    }

    public androidx.transition.Transition excludeTarget(android.view.View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public androidx.transition.Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public androidx.transition.Transition excludeTarget(java.lang.String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(android.view.View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    private java.util.ArrayList<java.lang.Integer> excludeId(java.util.ArrayList<java.lang.Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRangesFor(arrayList, java.lang.Integer.valueOf(i));
        }
        return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRanges(arrayList, java.lang.Integer.valueOf(i));
    }

    private java.util.ArrayList<android.view.View> excludeView(java.util.ArrayList<android.view.View> arrayList, android.view.View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRangesFor(arrayList, view);
        }
        return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRanges(arrayList, view);
    }

    public androidx.transition.Transition excludeTarget(java.lang.Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public androidx.transition.Transition excludeChildren(java.lang.Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    private java.util.ArrayList<java.lang.Class<?>> excludeType(java.util.ArrayList<java.lang.Class<?>> arrayList, java.lang.Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRangesFor(arrayList, cls);
        }
        return androidx.transition.Transition.ArrayListManager.getHighSpeedVideoFpsRanges(arrayList, cls);
    }

    public java.util.List<java.lang.Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public java.util.List<android.view.View> getTargets() {
        return this.mTargets;
    }

    public java.util.List<java.lang.String> getTargetNames() {
        return this.mTargetNames;
    }

    public java.util.List<java.lang.Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    void captureValues(android.view.ViewGroup viewGroup, boolean z) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.Class<?>> arrayList2;
        androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                android.view.View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    androidx.transition.TransitionValues transitionValues = new androidx.transition.TransitionValues(findViewById);
                    if (z) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.getHighSpeedVideoFpsRangesFor.add(this);
                    capturePropagationValues(transitionValues);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, transitionValues);
                    } else {
                        addViewValues(this.mEndValues, findViewById, transitionValues);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                android.view.View view = this.mTargets.get(i2);
                androidx.transition.TransitionValues transitionValues2 = new androidx.transition.TransitionValues(view);
                if (z) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.getHighSpeedVideoFpsRangesFor.add(this);
                capturePropagationValues(transitionValues2);
                if (z) {
                    addViewValues(this.mStartValues, view, transitionValues2);
                } else {
                    addViewValues(this.mEndValues, view, transitionValues2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (arrayMap = this.mNameOverrides) == null) {
            return;
        }
        int camera2StreamConfigurationMap = arrayMap.getCamera2StreamConfigurationMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(camera2StreamConfigurationMap);
        for (int i3 = 0; i3 < camera2StreamConfigurationMap; i3++) {
            arrayList3.add(this.mStartValues.getHighSpeedVideoFpsRanges.remove(this.mNameOverrides.keyAt(i3)));
        }
        for (int i4 = 0; i4 < camera2StreamConfigurationMap; i4++) {
            android.view.View view2 = (android.view.View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.getHighSpeedVideoFpsRanges.put(this.mNameOverrides.valueAt(i4), view2);
            }
        }
    }

    private static void addViewValues(androidx.transition.TransitionValuesMaps transitionValuesMaps, android.view.View view, androidx.transition.TransitionValues transitionValues) {
        transitionValuesMaps.getHighSpeedVideoSizes.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.Camera2StreamConfigurationMap.indexOfKey(id) >= 0) {
                transitionValuesMaps.Camera2StreamConfigurationMap.put(id, null);
            } else {
                transitionValuesMaps.Camera2StreamConfigurationMap.put(id, view);
            }
        }
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (transitionValuesMaps.getHighSpeedVideoFpsRanges.containsKey(transitionName)) {
                transitionValuesMaps.getHighSpeedVideoFpsRanges.put(transitionName, null);
            } else {
                transitionValuesMaps.getHighSpeedVideoFpsRanges.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (transitionValuesMaps.getHighResolutionOutputSizeshNQ4ISI.indexOfKey(itemIdAtPosition) >= 0) {
                    android.view.View view2 = transitionValuesMaps.getHighResolutionOutputSizeshNQ4ISI.get(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        transitionValuesMaps.getHighResolutionOutputSizeshNQ4ISI.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                transitionValuesMaps.getHighResolutionOutputSizeshNQ4ISI.put(itemIdAtPosition, view);
            }
        }
    }

    void clearValues(boolean z) {
        if (z) {
            this.mStartValues.getHighSpeedVideoSizes.clear();
            this.mStartValues.Camera2StreamConfigurationMap.clear();
            this.mStartValues.getHighResolutionOutputSizeshNQ4ISI.clear();
        } else {
            this.mEndValues.getHighSpeedVideoSizes.clear();
            this.mEndValues.Camera2StreamConfigurationMap.clear();
            this.mEndValues.getHighResolutionOutputSizeshNQ4ISI.clear();
        }
    }

    private void captureHierarchy(android.view.View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            java.util.ArrayList<java.lang.Integer> arrayList = this.mTargetIdExcludes;
            if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(id))) {
                java.util.ArrayList<android.view.View> arrayList2 = this.mTargetExcludes;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    java.util.ArrayList<java.lang.Class<?>> arrayList3 = this.mTargetTypeExcludes;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof android.view.ViewGroup) {
                        androidx.transition.TransitionValues transitionValues = new androidx.transition.TransitionValues(view);
                        if (z) {
                            captureStartValues(transitionValues);
                        } else {
                            captureEndValues(transitionValues);
                        }
                        transitionValues.getHighSpeedVideoFpsRangesFor.add(this);
                        capturePropagationValues(transitionValues);
                        if (z) {
                            addViewValues(this.mStartValues, view, transitionValues);
                        } else {
                            addViewValues(this.mEndValues, view, transitionValues);
                        }
                    }
                    if (view instanceof android.view.ViewGroup) {
                        java.util.ArrayList<java.lang.Integer> arrayList4 = this.mTargetIdChildExcludes;
                        if (arrayList4 == null || !arrayList4.contains(java.lang.Integer.valueOf(id))) {
                            java.util.ArrayList<android.view.View> arrayList5 = this.mTargetChildExcludes;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                java.util.ArrayList<java.lang.Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    captureHierarchy(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public androidx.transition.TransitionValues getTransitionValues(android.view.View view, boolean z) {
        androidx.transition.TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).getHighSpeedVideoSizes.get(view);
    }

    androidx.transition.TransitionValues getMatchedTransitionValues(android.view.View view, boolean z) {
        androidx.transition.TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        java.util.ArrayList<androidx.transition.TransitionValues> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                androidx.transition.TransitionValues transitionValues = arrayList.get(i);
                if (transitionValues != null) {
                    if (transitionValues.view == view) {
                        break;
                    }
                    i++;
                } else {
                    return null;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    public void pause(android.view.View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (true) {
            size--;
            if (size >= 0) {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            } else {
                this.mAnimatorCache = animatorArr;
                notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoFpsRangesFor, false);
                this.mPaused = true;
                return;
            }
        }
    }

    public void resume(android.view.View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    android.animation.Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(androidx.transition.Transition.TransitionNotification.getHighResolutionOutputSizeshNQ4ISI, false);
            }
            this.mPaused = false;
        }
    }

    boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    void playTransition(android.view.ViewGroup viewGroup) {
        androidx.transition.Transition.AnimationInfo animationInfo;
        this.mStartValuesList = new java.util.ArrayList<>();
        this.mEndValuesList = new java.util.ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        int camera2StreamConfigurationMap = runningAnimators.getCamera2StreamConfigurationMap();
        android.view.WindowId windowId = viewGroup.getWindowId();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            camera2StreamConfigurationMap--;
            if (camera2StreamConfigurationMap < 0) {
                break;
            }
            android.animation.Animator keyAt = runningAnimators.keyAt(camera2StreamConfigurationMap);
            if (keyAt != null && (animationInfo = runningAnimators.get(keyAt)) != null && animationInfo.Camera2StreamConfigurationMap != null && windowId.equals(animationInfo.getInputSizeshNQ4ISI)) {
                androidx.transition.TransitionValues transitionValues = animationInfo.getHighResolutionOutputSizeshNQ4ISI;
                android.view.View view = animationInfo.Camera2StreamConfigurationMap;
                androidx.transition.TransitionValues transitionValues2 = getTransitionValues(view, true);
                androidx.transition.TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues2 == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.getHighSpeedVideoSizes.get(view);
                }
                if (transitionValues2 != null || matchedTransitionValues != null) {
                    if (animationInfo.getHighSpeedVideoFpsRangesFor.isTransitionRequired(transitionValues, matchedTransitionValues)) {
                        androidx.transition.Transition transition = animationInfo.getHighSpeedVideoFpsRangesFor;
                        if (transition.getRootTransition().mSeekController != null) {
                            keyAt.cancel();
                            transition.mCurrentAnimators.remove(keyAt);
                            runningAnimators.removeAt(camera2StreamConfigurationMap);
                            if (transition.mCurrentAnimators.size() == 0) {
                                arrayList.add(transition);
                            }
                        } else if (keyAt.isRunning() || keyAt.isStarted()) {
                            keyAt.cancel();
                        } else {
                            runningAnimators.removeAt(camera2StreamConfigurationMap);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.transition.Transition transition2 = (androidx.transition.Transition) arrayList.get(i);
            transition2.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoFpsRanges, false);
            if (!transition2.mEnded) {
                transition2.mEnded = true;
                transition2.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, false);
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            androidx.transition.Transition.SeekController seekController = this.mSeekController;
            long j = seekController.getDurationMillis() == 0 ? 1L : 0L;
            androidx.transition.Transition.this.setCurrentPlayTimeMillis(j, seekController.getHighResolutionOutputSizeshNQ4ISI);
            seekController.getHighResolutionOutputSizeshNQ4ISI = j;
            androidx.transition.Transition.SeekController seekController2 = this.mSeekController;
            seekController2.getHighSpeedVideoFpsRanges = true;
            java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> arrayList2 = seekController2.getHighSpeedVideoFpsRangesFor;
            if (arrayList2 != null) {
                seekController2.getHighSpeedVideoFpsRangesFor = null;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    arrayList2.get(i2).accept(seekController2);
                }
            }
            seekController2.Camera2StreamConfigurationMap();
            int i3 = seekController2.Camera2StreamConfigurationMap;
            if (i3 == 1) {
                seekController2.Camera2StreamConfigurationMap = 0;
                seekController2.animateToEnd();
            } else if (i3 == 2) {
                seekController2.Camera2StreamConfigurationMap = 0;
                seekController2.animateToStart(seekController2.getHighSpeedVideoSizes);
            }
        }
    }

    public boolean isTransitionRequired(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            java.lang.String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (java.lang.String str : transitionProperties) {
                    if (isValueChanged(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                java.util.Iterator<java.lang.String> it = transitionValues.values.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(transitionValues, transitionValues2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isValueChanged(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2, java.lang.String str) {
        java.lang.Object obj = transitionValues.values.get(str);
        java.lang.Object obj2 = transitionValues2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    protected void animate(android.animation.Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                androidx.transition.Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(androidx.transition.Transition.TransitionNotification.Camera2StreamConfigurationMap, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    protected void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, false);
            for (int i2 = 0; i2 < this.mStartValues.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                android.view.View valueAt = this.mStartValues.getHighResolutionOutputSizeshNQ4ISI.valueAt(i2);
                if (valueAt != null) {
                    valueAt.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.getHighResolutionOutputSizeshNQ4ISI.size(); i3++) {
                android.view.View valueAt2 = this.mEndValues.getHighResolutionOutputSizeshNQ4ISI.valueAt(i3);
                if (valueAt2 != null) {
                    valueAt2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void forceToEnd(android.view.ViewGroup viewGroup) {
        androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> runningAnimators = getRunningAnimators();
        int camera2StreamConfigurationMap = runningAnimators.getCamera2StreamConfigurationMap();
        if (viewGroup == null || camera2StreamConfigurationMap == 0) {
            return;
        }
        android.view.WindowId windowId = viewGroup.getWindowId();
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(runningAnimators);
        runningAnimators.clear();
        while (true) {
            camera2StreamConfigurationMap--;
            if (camera2StreamConfigurationMap < 0) {
                return;
            }
            androidx.transition.Transition.AnimationInfo animationInfo = (androidx.transition.Transition.AnimationInfo) arrayMap.valueAt(camera2StreamConfigurationMap);
            if (animationInfo.Camera2StreamConfigurationMap != null && windowId.equals(animationInfo.getInputSizeshNQ4ISI)) {
                ((android.animation.Animator) arrayMap.keyAt(camera2StreamConfigurationMap)).end();
            }
        }
    }

    protected void cancel() {
        int size = this.mCurrentAnimators.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (true) {
            size--;
            if (size >= 0) {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.mAnimatorCache = animatorArr;
                notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoFpsRanges, false);
                return;
            }
        }
    }

    public androidx.transition.Transition addListener(androidx.transition.Transition.TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new java.util.ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    public androidx.transition.Transition removeListener(androidx.transition.Transition.TransitionListener transitionListener) {
        androidx.transition.Transition transition;
        java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
                transition.removeListener(transitionListener);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void setPathMotion(androidx.transition.PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public androidx.transition.PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(androidx.transition.Transition.EpicenterCallback epicenterCallback) {
        this.mEpicenterCallback = epicenterCallback;
    }

    public androidx.transition.Transition.EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public android.graphics.Rect getEpicenter() {
        androidx.transition.Transition.EpicenterCallback epicenterCallback = this.mEpicenterCallback;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.onGetEpicenter(this);
    }

    public void setPropagation(androidx.transition.TransitionPropagation transitionPropagation) {
        this.mPropagation = transitionPropagation;
    }

    public androidx.transition.TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    void capturePropagationValues(androidx.transition.TransitionValues transitionValues) {
        java.lang.String[] propagationProperties;
        if (this.mPropagation == null || transitionValues.values.isEmpty() || (propagationProperties = this.mPropagation.getPropagationProperties()) == null) {
            return;
        }
        for (java.lang.String str : propagationProperties) {
            if (!transitionValues.values.containsKey(str)) {
                this.mPropagation.captureValues(transitionValues);
                return;
            }
        }
    }

    void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public java.lang.String toString() {
        return toString("");
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.transition.Transition mo9425clone() {
        try {
            androidx.transition.Transition transition = (androidx.transition.Transition) super.clone();
            transition.mAnimators = new java.util.ArrayList<>();
            transition.mStartValues = new androidx.transition.TransitionValuesMaps();
            transition.mEndValues = new androidx.transition.TransitionValuesMaps();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String getName() {
        return this.mName;
    }

    void notifyListeners(androidx.transition.Transition.TransitionNotification transitionNotification, boolean z) {
        notifyFromTransition(this, transitionNotification, z);
    }

    private void notifyFromTransition(androidx.transition.Transition transition, androidx.transition.Transition.TransitionNotification transitionNotification, boolean z) {
        androidx.transition.Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.notifyFromTransition(transition, transitionNotification, z);
        }
        java.util.ArrayList<androidx.transition.Transition.TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        androidx.transition.Transition.TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new androidx.transition.Transition.TransitionListener[size];
        }
        this.mListenersCache = null;
        androidx.transition.Transition.TransitionListener[] transitionListenerArr2 = (androidx.transition.Transition.TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.notifyListener(transitionListenerArr2[i], transition, z);
            transitionListenerArr2[i] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(androidx.transition.Transition.TransitionNotification.Camera2StreamConfigurationMap, z);
        }
        int size = this.mCurrentAnimators.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = animatorArr[i];
            animatorArr[i] = null;
            androidx.transition.Transition.Impl26.getHighResolutionOutputSizeshNQ4ISI(animator, java.lang.Math.min(java.lang.Math.max(0L, j), androidx.transition.Transition.Impl26.getHighSpeedVideoFpsRangesFor(animator)));
        }
        this.mAnimatorCache = animatorArr;
        if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > totalDurationMillis) {
            this.mEnded = true;
        }
        notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, z);
    }

    java.lang.String toString(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public interface TransitionListener {
        void onTransitionCancel(androidx.transition.Transition transition);

        void onTransitionEnd(androidx.transition.Transition transition);

        void onTransitionPause(androidx.transition.Transition transition);

        void onTransitionResume(androidx.transition.Transition transition);

        void onTransitionStart(androidx.transition.Transition transition);

        default void onTransitionStart(androidx.transition.Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        default void onTransitionEnd(androidx.transition.Transition transition, boolean z) {
            onTransitionEnd(transition);
        }
    }

    static class AnimationInfo {
        android.view.View Camera2StreamConfigurationMap;
        androidx.transition.TransitionValues getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        androidx.transition.Transition getHighSpeedVideoFpsRangesFor;
        android.animation.Animator getHighSpeedVideoSizes;
        android.view.WindowId getInputSizeshNQ4ISI;

        AnimationInfo(android.view.View view, java.lang.String str, androidx.transition.Transition transition, android.view.WindowId windowId, androidx.transition.TransitionValues transitionValues, android.animation.Animator animator) {
            this.Camera2StreamConfigurationMap = view;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = transitionValues;
            this.getInputSizeshNQ4ISI = windowId;
            this.getHighSpeedVideoFpsRangesFor = transition;
            this.getHighSpeedVideoSizes = animator;
        }
    }

    /* loaded from: classes7.dex */
    static class ArrayListManager {
        private ArrayListManager() {
        }

        static <T> java.util.ArrayList<T> getHighSpeedVideoFpsRangesFor(java.util.ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        static <T> java.util.ArrayList<T> getHighSpeedVideoFpsRanges(java.util.ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    interface TransitionNotification {
        public static final androidx.transition.Transition.TransitionNotification Camera2StreamConfigurationMap = new androidx.transition.Transition.TransitionNotification() { // from class: androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda0
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z) {
                transitionListener.onTransitionStart(transition, z);
            }
        };
        public static final androidx.transition.Transition.TransitionNotification getHighSpeedVideoSizes = new androidx.transition.Transition.TransitionNotification() { // from class: androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda1
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z) {
                transitionListener.onTransitionEnd(transition, z);
            }
        };
        public static final androidx.transition.Transition.TransitionNotification getHighSpeedVideoFpsRanges = new androidx.transition.Transition.TransitionNotification() { // from class: androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda2
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z) {
                transitionListener.onTransitionCancel(transition);
            }
        };
        public static final androidx.transition.Transition.TransitionNotification getHighSpeedVideoFpsRangesFor = new androidx.transition.Transition.TransitionNotification() { // from class: androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda3
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z) {
                transitionListener.onTransitionPause(transition);
            }
        };
        public static final androidx.transition.Transition.TransitionNotification getHighResolutionOutputSizeshNQ4ISI = new androidx.transition.Transition.TransitionNotification() { // from class: androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda4
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z) {
                transitionListener.onTransitionResume(transition);
            }
        };

        void notifyListener(androidx.transition.Transition.TransitionListener transitionListener, androidx.transition.Transition transition, boolean z);
    }

    static class Impl26 {
        private Impl26() {
        }

        static long getHighSpeedVideoFpsRangesFor(android.animation.Animator animator) {
            return animator.getTotalDuration();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.animation.Animator animator, long j) {
            ((android.animation.AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    class SeekController extends androidx.transition.TransitionListenerAdapter implements androidx.transition.TransitionSeekController, androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener {
        boolean getHighSpeedVideoFpsRanges;
        java.lang.Runnable getHighSpeedVideoSizes;
        private androidx.dynamicanimation.animation.SpringAnimation getInputFormats;
        private boolean getOutputMinFrameDuration;
        long getHighResolutionOutputSizeshNQ4ISI = -1;
        java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> getHighSpeedVideoFpsRangesFor = null;
        private java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> getOutputFormats = null;
        int Camera2StreamConfigurationMap = 0;
        private androidx.core.util.Consumer<androidx.transition.TransitionSeekController>[] getHighSpeedVideoSizesFor = null;
        private final androidx.transition.VelocityTracker1D getOutputStallDuration = new androidx.transition.VelocityTracker1D();

        SeekController() {
        }

        @Override // androidx.transition.TransitionSeekController
        public long getDurationMillis() {
            return androidx.transition.Transition.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.TransitionSeekController
        public long getCurrentPlayTimeMillis() {
            return java.lang.Math.min(getDurationMillis(), java.lang.Math.max(0L, this.getHighResolutionOutputSizeshNQ4ISI));
        }

        @Override // androidx.transition.TransitionSeekController
        public float getCurrentFraction() {
            return getCurrentPlayTimeMillis() / getDurationMillis();
        }

        @Override // androidx.transition.TransitionSeekController
        public boolean isReady() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentPlayTimeMillis(long j) {
            if (this.getInputFormats != null) {
                throw new java.lang.IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j == this.getHighResolutionOutputSizeshNQ4ISI || !isReady()) {
                return;
            }
            if (!this.getOutputMinFrameDuration) {
                if (j != 0 || this.getHighResolutionOutputSizeshNQ4ISI <= 0) {
                    long durationMillis = getDurationMillis();
                    if (j == durationMillis && this.getHighResolutionOutputSizeshNQ4ISI < durationMillis) {
                        j = durationMillis + 1;
                    }
                } else {
                    j = -1;
                }
                long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (j != j2) {
                    androidx.transition.Transition.this.setCurrentPlayTimeMillis(j, j2);
                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                }
            }
            Camera2StreamConfigurationMap();
            this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(android.view.animation.AnimationUtils.currentAnimationTimeMillis(), j);
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentFraction(float f) {
            if (this.getInputFormats != null) {
                throw new java.lang.IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            setCurrentPlayTimeMillis((long) (f * getDurationMillis()));
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> consumer) {
            if (isReady()) {
                consumer.accept(this);
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
            }
            this.getHighSpeedVideoFpsRangesFor.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> consumer) {
            java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> arrayList = this.getHighSpeedVideoFpsRangesFor;
            if (arrayList != null) {
                arrayList.remove(consumer);
                if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    this.getHighSpeedVideoFpsRangesFor = null;
                }
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            this.getOutputMinFrameDuration = true;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, float f, float f2) {
            long max = java.lang.Math.max(-1L, java.lang.Math.min(getDurationMillis() + 1, java.lang.Math.round(f)));
            androidx.transition.Transition.this.setCurrentPlayTimeMillis(max, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = max;
            Camera2StreamConfigurationMap();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            androidx.dynamicanimation.animation.SpringAnimation springAnimation;
            float highSpeedVideoSizes;
            if (this.getInputFormats != null) {
                return;
            }
            this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(android.view.animation.AnimationUtils.currentAnimationTimeMillis(), this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputFormats = new androidx.dynamicanimation.animation.SpringAnimation(new androidx.dynamicanimation.animation.FloatValueHolder());
            androidx.dynamicanimation.animation.SpringForce springForce = new androidx.dynamicanimation.animation.SpringForce();
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(200.0f);
            this.getInputFormats.setSpring(springForce);
            this.getInputFormats.setStartValue(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputFormats.addUpdateListener(this);
            androidx.dynamicanimation.animation.SpringAnimation springAnimation2 = this.getInputFormats;
            androidx.transition.VelocityTracker1D velocityTracker1D = this.getOutputStallDuration;
            int i = velocityTracker1D.getHighSpeedVideoFpsRangesFor;
            long j = Long.MIN_VALUE;
            float f = 0.0f;
            if (i != 0 || velocityTracker1D.Camera2StreamConfigurationMap[i] != Long.MIN_VALUE) {
                long j2 = velocityTracker1D.Camera2StreamConfigurationMap[i];
                int i2 = 0;
                long j3 = j2;
                while (true) {
                    long j4 = velocityTracker1D.Camera2StreamConfigurationMap[i];
                    if (j4 != j) {
                        float f2 = j2 - j4;
                        float abs = java.lang.Math.abs(j4 - j3);
                        if (f2 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i == 0) {
                            i = 20;
                        }
                        i--;
                        i2++;
                        if (i2 >= 20) {
                            break;
                        }
                        j3 = j4;
                        j = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i2 >= 2) {
                    if (i2 == 2) {
                        int i3 = velocityTracker1D.getHighSpeedVideoFpsRangesFor;
                        int i4 = i3 == 0 ? 19 : i3 - 1;
                        long[] jArr = velocityTracker1D.Camera2StreamConfigurationMap;
                        float f3 = jArr[i3] - jArr[i4];
                        if (f3 != 0.0f) {
                            float[] fArr = velocityTracker1D.getHighResolutionOutputSizeshNQ4ISI;
                            highSpeedVideoSizes = (fArr[i3] - fArr[i4]) / f3;
                            springAnimation = springAnimation2;
                        }
                    } else {
                        int i5 = velocityTracker1D.getHighSpeedVideoFpsRangesFor;
                        int i6 = ((i5 - i2) + 21) % 20;
                        long j5 = velocityTracker1D.Camera2StreamConfigurationMap[i6];
                        float f4 = velocityTracker1D.getHighResolutionOutputSizeshNQ4ISI[i6];
                        int i7 = i6 + 1;
                        int i8 = i7 % 20;
                        float f5 = 0.0f;
                        while (i8 != (i5 + 21) % 20) {
                            long j6 = velocityTracker1D.Camera2StreamConfigurationMap[i8];
                            androidx.dynamicanimation.animation.SpringAnimation springAnimation3 = springAnimation2;
                            float f6 = j6 - j5;
                            if (f6 != 0.0f) {
                                float f7 = velocityTracker1D.getHighResolutionOutputSizeshNQ4ISI[i8];
                                float f8 = (f7 - f4) / f6;
                                f5 += (f8 - androidx.transition.VelocityTracker1D.getHighSpeedVideoSizes(f5)) * java.lang.Math.abs(f8);
                                if (i8 == i7) {
                                    f5 *= 0.5f;
                                }
                                f4 = f7;
                                j5 = j6;
                            }
                            i8 = (i8 + 1) % 20;
                            springAnimation2 = springAnimation3;
                        }
                        springAnimation = springAnimation2;
                        highSpeedVideoSizes = androidx.transition.VelocityTracker1D.getHighSpeedVideoSizes(f5);
                    }
                    f = highSpeedVideoSizes * 1000.0f;
                    springAnimation.setStartVelocity(f);
                    this.getInputFormats.setMaxValue(getDurationMillis() + 1);
                    this.getInputFormats.setMinValue(-1.0f);
                    this.getInputFormats.setMinimumVisibleChange(4.0f);
                    this.getInputFormats.addEndListener(new androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.Transition$SeekController$$ExternalSyntheticLambda0
                        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                        public final void onAnimationEnd(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, boolean z, float f9, float f10) {
                            androidx.transition.Transition transition;
                            androidx.transition.Transition.SeekController seekController = androidx.transition.Transition.SeekController.this;
                            if (z) {
                                return;
                            }
                            if (f9 >= 1.0f) {
                                androidx.transition.Transition.this.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, false);
                                return;
                            }
                            long durationMillis = seekController.getDurationMillis();
                            androidx.transition.Transition transitionAt = ((androidx.transition.TransitionSet) androidx.transition.Transition.this).getTransitionAt(0);
                            transition = transitionAt.mCloneParent;
                            transitionAt.mCloneParent = null;
                            androidx.transition.Transition.this.setCurrentPlayTimeMillis(-1L, seekController.getHighResolutionOutputSizeshNQ4ISI);
                            androidx.transition.Transition.this.setCurrentPlayTimeMillis(durationMillis, -1L);
                            seekController.getHighResolutionOutputSizeshNQ4ISI = durationMillis;
                            java.lang.Runnable runnable = seekController.getHighSpeedVideoSizes;
                            if (runnable != null) {
                                runnable.run();
                            }
                            androidx.transition.Transition.this.mAnimators.clear();
                            if (transition != null) {
                                transition.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, true);
                            }
                        }
                    });
                }
            }
            springAnimation = springAnimation2;
            springAnimation.setStartVelocity(f);
            this.getInputFormats.setMaxValue(getDurationMillis() + 1);
            this.getInputFormats.setMinValue(-1.0f);
            this.getInputFormats.setMinimumVisibleChange(4.0f);
            this.getInputFormats.addEndListener(new androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.Transition$SeekController$$ExternalSyntheticLambda0
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(androidx.dynamicanimation.animation.DynamicAnimation dynamicAnimation, boolean z, float f9, float f10) {
                    androidx.transition.Transition transition;
                    androidx.transition.Transition.SeekController seekController = androidx.transition.Transition.SeekController.this;
                    if (z) {
                        return;
                    }
                    if (f9 >= 1.0f) {
                        androidx.transition.Transition.this.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, false);
                        return;
                    }
                    long durationMillis = seekController.getDurationMillis();
                    androidx.transition.Transition transitionAt = ((androidx.transition.TransitionSet) androidx.transition.Transition.this).getTransitionAt(0);
                    transition = transitionAt.mCloneParent;
                    transitionAt.mCloneParent = null;
                    androidx.transition.Transition.this.setCurrentPlayTimeMillis(-1L, seekController.getHighResolutionOutputSizeshNQ4ISI);
                    androidx.transition.Transition.this.setCurrentPlayTimeMillis(durationMillis, -1L);
                    seekController.getHighResolutionOutputSizeshNQ4ISI = durationMillis;
                    java.lang.Runnable runnable = seekController.getHighSpeedVideoSizes;
                    if (runnable != null) {
                        runnable.run();
                    }
                    androidx.transition.Transition.this.mAnimators.clear();
                    if (transition != null) {
                        transition.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, true);
                    }
                }
            });
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToEnd() {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap = 1;
                this.getHighSpeedVideoSizes = null;
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getInputFormats.animateToFinalPosition(getDurationMillis() + 1);
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToStart(java.lang.Runnable runnable) {
            this.getHighSpeedVideoSizes = runnable;
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap = 2;
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getInputFormats.animateToFinalPosition(0.0f);
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> consumer) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = new java.util.ArrayList<>();
            }
            this.getOutputFormats.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> consumer) {
            java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> arrayList = this.getOutputFormats;
            if (arrayList != null) {
                arrayList.remove(consumer);
            }
        }

        final void Camera2StreamConfigurationMap() {
            java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> arrayList = this.getOutputFormats;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.getOutputFormats.size();
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new androidx.core.util.Consumer[size];
            }
            androidx.core.util.Consumer<androidx.transition.TransitionSeekController>[] consumerArr = (androidx.core.util.Consumer[]) this.getOutputFormats.toArray(this.getHighSpeedVideoSizesFor);
            this.getHighSpeedVideoSizesFor = null;
            for (int i = 0; i < size; i++) {
                consumerArr[i].accept(this);
                consumerArr[i] = null;
            }
            this.getHighSpeedVideoSizesFor = consumerArr;
        }
    }
}
