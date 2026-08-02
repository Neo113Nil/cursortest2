package androidx.transition;

/* loaded from: classes3.dex */
public class TransitionSet extends androidx.transition.Transition {
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.util.ArrayList<androidx.transition.Transition> getHighSpeedVideoSizes;
    private androidx.transition.Transition[] getInputSizeshNQ4ISI;

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addTarget(java.lang.Class cls) {
        return addTarget((java.lang.Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9425clone() throws java.lang.CloneNotSupportedException {
        return mo9425clone();
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeTarget(java.lang.Class cls) {
        return removeTarget((java.lang.Class<?>) cls);
    }

    public TransitionSet() {
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = false;
        this.Camera2StreamConfigurationMap = 0;
    }

    public TransitionSet(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = false;
        this.Camera2StreamConfigurationMap = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getInputSizeshNQ4ISI);
        setOrdering(androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public androidx.transition.TransitionSet setOrdering(int i) {
        if (i == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return this;
        }
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            return this;
        }
        throw new android.util.AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(java.lang.String.valueOf(i)));
    }

    public int getOrdering() {
        return !this.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0;
    }

    public int getTransitionCount() {
        return this.getHighSpeedVideoSizes.size();
    }

    public androidx.transition.Transition getTransitionAt(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoSizes.size()) {
            return null;
        }
        return this.getHighSpeedVideoSizes.get(i);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setDuration(long j) {
        java.util.ArrayList<androidx.transition.Transition> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.getHighSpeedVideoSizes) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoSizes.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setStartDelay(long j) {
        return (androidx.transition.TransitionSet) super.setStartDelay(j);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.Camera2StreamConfigurationMap |= 1;
        java.util.ArrayList<androidx.transition.Transition> arrayList = this.getHighSpeedVideoSizes;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoSizes.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (androidx.transition.TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(android.view.View view) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).addTarget(view);
        }
        return (androidx.transition.TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(int i) {
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.size(); i2++) {
            this.getHighSpeedVideoSizes.get(i2).addTarget(i);
        }
        return (androidx.transition.TransitionSet) super.addTarget(i);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(java.lang.String str) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).addTarget(str);
        }
        return (androidx.transition.TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(java.lang.Class<?> cls) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).addTarget(cls);
        }
        return (androidx.transition.TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addListener(androidx.transition.Transition.TransitionListener transitionListener) {
        return (androidx.transition.TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(int i) {
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.size(); i2++) {
            this.getHighSpeedVideoSizes.get(i2).removeTarget(i);
        }
        return (androidx.transition.TransitionSet) super.removeTarget(i);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(android.view.View view) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).removeTarget(view);
        }
        return (androidx.transition.TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(java.lang.Class<?> cls) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).removeTarget(cls);
        }
        return (androidx.transition.TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(java.lang.String str) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).removeTarget(str);
        }
        return (androidx.transition.TransitionSet) super.removeTarget(str);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(android.view.View view, boolean z) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(java.lang.String str, boolean z) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.size(); i2++) {
            this.getHighSpeedVideoSizes.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(java.lang.Class<?> cls, boolean z) {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoSizes.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeListener(androidx.transition.Transition.TransitionListener transitionListener) {
        return (androidx.transition.TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(androidx.transition.PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.Camera2StreamConfigurationMap |= 4;
        if (this.getHighSpeedVideoSizes != null) {
            for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
                this.getHighSpeedVideoSizes.get(i).setPathMotion(pathMotion);
            }
        }
    }

    public androidx.transition.TransitionSet removeTransition(androidx.transition.Transition transition) {
        this.getHighSpeedVideoSizes.remove(transition);
        transition.mParent = null;
        return this;
    }

    static class TransitionSetListener extends androidx.transition.TransitionListenerAdapter {
        androidx.transition.TransitionSet getHighSpeedVideoFpsRangesFor;

        TransitionSetListener(androidx.transition.TransitionSet transitionSet) {
            this.getHighSpeedVideoFpsRangesFor = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
            if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.start();
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            androidx.transition.TransitionSet transitionSet = this.getHighSpeedVideoFpsRangesFor;
            transitionSet.getHighSpeedVideoFpsRangesFor--;
            if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor == 0) {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = false;
                this.getHighSpeedVideoFpsRangesFor.end();
            }
            transition.removeListener(this);
        }
    }

    @Override // androidx.transition.Transition
    void createAnimators(android.view.ViewGroup viewGroup, androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2, java.util.ArrayList<androidx.transition.TransitionValues> arrayList, java.util.ArrayList<androidx.transition.TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            androidx.transition.Transition transition = this.getHighSpeedVideoSizes.get(i);
            if (startDelay > 0 && (this.getHighResolutionOutputSizeshNQ4ISI || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    protected void runAnimators() {
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            start();
            end();
            return;
        }
        androidx.transition.TransitionSet.TransitionSetListener transitionSetListener = new androidx.transition.TransitionSet.TransitionSetListener(this);
        java.util.Iterator<androidx.transition.Transition> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            it.next().addListener(transitionSetListener);
        }
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.size();
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            for (int i = 1; i < this.getHighSpeedVideoSizes.size(); i++) {
                androidx.transition.Transition transition = this.getHighSpeedVideoSizes.get(i - 1);
                final androidx.transition.Transition transition2 = this.getHighSpeedVideoSizes.get(i);
                transition.addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(androidx.transition.Transition transition3) {
                        transition2.runAnimators();
                        transition3.removeListener(this);
                    }
                });
            }
            androidx.transition.Transition transition3 = this.getHighSpeedVideoSizes.get(0);
            if (transition3 != null) {
                transition3.runAnimators();
                return;
            }
            return;
        }
        java.util.Iterator<androidx.transition.Transition> it2 = this.getHighSpeedVideoSizes.iterator();
        while (it2.hasNext()) {
            it2.next().runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    boolean hasAnimators() {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            if (this.getHighSpeedVideoSizes.get(i).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        androidx.transition.TransitionListenerAdapter transitionListenerAdapter = new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(androidx.transition.Transition transition) {
                androidx.transition.TransitionSet.this.getHighSpeedVideoSizes.remove(transition);
                if (androidx.transition.TransitionSet.this.hasAnimators()) {
                    return;
                }
                androidx.transition.TransitionSet.this.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoFpsRanges, false);
                androidx.transition.TransitionSet.this.mEnded = true;
                androidx.transition.TransitionSet.this.notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, false);
            }
        };
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            androidx.transition.Transition transition = this.getHighSpeedVideoSizes.get(i);
            transition.addListener(transitionListenerAdapter);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.mTotalDuration = java.lang.Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                transition.mSeekOffsetInParent = this.mTotalDuration;
                this.mTotalDuration += totalDurationMillis;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void setCurrentPlayTimeMillis(long j, long j2) {
        boolean z;
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(androidx.transition.Transition.TransitionNotification.Camera2StreamConfigurationMap, z2);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
                this.getHighSpeedVideoSizes.get(i).setCurrentPlayTimeMillis(j, j2);
            }
        } else {
            int i2 = 1;
            while (true) {
                if (i2 >= this.getHighSpeedVideoSizes.size()) {
                    i2 = this.getHighSpeedVideoSizes.size();
                    break;
                } else if (this.getHighSpeedVideoSizes.get(i2).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    i2++;
                }
            }
            int i3 = i2 - 1;
            if (j < j2) {
                z = z2;
                while (i3 >= 0) {
                    androidx.transition.Transition transition = this.getHighSpeedVideoSizes.get(i3);
                    long j3 = transition.mSeekOffsetInParent;
                    long j4 = j - j3;
                    transition.setCurrentPlayTimeMillis(j4, j2 - j3);
                    if (j4 >= 0) {
                        break;
                    } else {
                        i3--;
                    }
                }
            } else {
                while (i3 < this.getHighSpeedVideoSizes.size()) {
                    androidx.transition.Transition transition2 = this.getHighSpeedVideoSizes.get(i3);
                    long j5 = transition2.mSeekOffsetInParent;
                    z = z2;
                    long j6 = j - j5;
                    if (j6 < 0) {
                        break;
                    }
                    transition2.setCurrentPlayTimeMillis(j6, j2 - j5);
                    i3++;
                    z2 = z;
                }
            }
            if (this.mParent == null) {
                if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || j2 < 0)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(androidx.transition.Transition.TransitionNotification.getHighSpeedVideoSizes, z);
                return;
            }
            return;
        }
        z = z2;
        if (this.mParent == null) {
        }
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            if (!this.getHighSpeedVideoSizes.get(i).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            java.util.Iterator<androidx.transition.Transition> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                androidx.transition.Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureStartValues(transitionValues);
                    transitionValues.getHighSpeedVideoFpsRangesFor.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            java.util.Iterator<androidx.transition.Transition> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                androidx.transition.Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureEndValues(transitionValues);
                    transitionValues.getHighSpeedVideoFpsRangesFor.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void capturePropagationValues(androidx.transition.TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizes.get(i).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void pause(android.view.View view) {
        super.pause(view);
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizes.get(i).pause(view);
        }
    }

    private androidx.transition.Transition[] getHighResolutionOutputSizeshNQ4ISI() {
        androidx.transition.Transition[] transitionArr = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = null;
        if (transitionArr == null) {
            transitionArr = new androidx.transition.Transition[this.getHighSpeedVideoSizes.size()];
        }
        return (androidx.transition.Transition[]) this.getHighSpeedVideoSizes.toArray(transitionArr);
    }

    @Override // androidx.transition.Transition
    public void resume(android.view.View view) {
        super.resume(view);
        androidx.transition.Transition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            highResolutionOutputSizeshNQ4ISI[i].resume(view);
        }
        java.util.Arrays.fill(highResolutionOutputSizeshNQ4ISI, (java.lang.Object) null);
        this.getInputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
        super.cancel();
        androidx.transition.Transition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            highResolutionOutputSizeshNQ4ISI[i].cancel();
        }
        java.util.Arrays.fill(highResolutionOutputSizeshNQ4ISI, (java.lang.Object) null);
        this.getInputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.transition.Transition
    void forceToEnd(android.view.ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        androidx.transition.Transition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            highResolutionOutputSizeshNQ4ISI[i].forceToEnd(viewGroup);
        }
        java.util.Arrays.fill(highResolutionOutputSizeshNQ4ISI, (java.lang.Object) null);
        this.getInputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.transition.Transition
    void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizes.get(i).setCanRemoveViews(z);
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(androidx.transition.TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.Camera2StreamConfigurationMap |= 2;
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizes.get(i).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(androidx.transition.Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.Camera2StreamConfigurationMap |= 8;
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizes.get(i).setEpicenterCallback(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    java.lang.String toString(java.lang.String str) {
        java.lang.String transition = super.toString(str);
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(transition);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            androidx.transition.Transition transition2 = this.getHighSpeedVideoSizes.get(i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(transition2.toString(sb2.toString()));
            transition = sb.toString();
        }
        return transition;
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public androidx.transition.Transition mo9425clone() {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) super.mo9425clone();
        transitionSet.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        int size = this.getHighSpeedVideoSizes.size();
        for (int i = 0; i < size; i++) {
            androidx.transition.Transition mo9425clone = this.getHighSpeedVideoSizes.get(i).mo9425clone();
            transitionSet.getHighSpeedVideoSizes.add(mo9425clone);
            mo9425clone.mParent = transitionSet;
        }
        return transitionSet;
    }

    public androidx.transition.TransitionSet addTransition(androidx.transition.Transition transition) {
        this.getHighSpeedVideoSizes.add(transition);
        transition.mParent = this;
        if (this.mDuration >= 0) {
            transition.setDuration(this.mDuration);
        }
        if ((this.Camera2StreamConfigurationMap & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.Camera2StreamConfigurationMap & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.Camera2StreamConfigurationMap & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.Camera2StreamConfigurationMap & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }
}
