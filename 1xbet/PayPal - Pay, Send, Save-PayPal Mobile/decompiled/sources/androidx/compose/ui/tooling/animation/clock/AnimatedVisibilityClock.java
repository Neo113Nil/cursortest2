package androidx.compose.ui.tooling.animation.clock;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cH\u0016J\u001f\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "state", "getState-jXw82LU", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", "Ljava/lang/String;", "currentClockTimeNanos", "", "setStateParameters", "", "par1", "", "par2", "getMaxDurationPerIteration", "getMaxDuration", "setClockTime", "animationTimeNanos", "getTransitions", "", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "getAnimatedProperties", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "toCurrentTargetPair", "Lkotlin/Pair;", "", "toCurrentTargetPair-7IW2chM", "(Ljava/lang/String;)Lkotlin/Pair;", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedVisibilityClock implements androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock<androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation, androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState> {
    public static final int $stable = 8;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation getHighSpeedVideoSizes;

    public AnimatedVisibilityClock(androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        java.lang.String m8539getEnterjXw82LU;
        this.getHighSpeedVideoSizes = animatedVisibilityComposeAnimation;
        if (getGetHighSpeedVideoSizes().m8518getAnimationObject().getCurrentState().booleanValue()) {
            m8539getEnterjXw82LU = androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.INSTANCE.m8540getExitjXw82LU();
        } else {
            m8539getEnterjXw82LU = androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.INSTANCE.m8539getEnterjXw82LU();
        }
        this.getHighSpeedVideoFpsRangesFor = m8539getEnterjXw82LU;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    /* renamed from: getAnimation, reason: avoid collision after fix types in other method and from getter */
    public final androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final /* synthetic */ androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState getState() {
        return androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.m8533boximpl(getGetHighSpeedVideoFpsRangesFor());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final /* synthetic */ void setState(androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState animatedVisibilityState) {
        m8530setState7IW2chM(animatedVisibilityState.m8538unboximpl());
    }

    /* renamed from: getState-jXw82LU, reason: not valid java name and from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: setState-7IW2chM, reason: not valid java name */
    public final void m8530setState7IW2chM(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
        setClockTime(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setStateParameters(java.lang.Object par1, java.lang.Object par2) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(par1, "");
        m8530setState7IW2chM(((androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState) par1).m8538unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDurationPerIteration() {
        androidx.compose.animation.core.Transition<java.lang.Object> childTransition = getGetHighSpeedVideoSizes().getChildTransition();
        if (childTransition != null) {
            return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDuration() {
        androidx.compose.animation.core.Transition<java.lang.Object> childTransition = getGetHighSpeedVideoSizes().getChildTransition();
        if (childTransition != null) {
            return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setClockTime(long animationTimeNanos) {
        this.getHighResolutionOutputSizeshNQ4ISI = animationTimeNanos;
        androidx.compose.animation.core.Transition<java.lang.Boolean> m8518getAnimationObject = getGetHighSpeedVideoSizes().m8518getAnimationObject();
        boolean m8535equalsimpl0 = androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.m8535equalsimpl0(getGetHighSpeedVideoFpsRangesFor(), androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.INSTANCE.m8539getEnterjXw82LU());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        kotlin.Pair pair = m8535equalsimpl0 ? kotlin.TuplesKt.to(bool, bool2) : kotlin.TuplesKt.to(bool2, bool);
        m8518getAnimationObject.seek(java.lang.Boolean.valueOf(((java.lang.Boolean) pair.component1()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) pair.component2()).booleanValue()), animationTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.TransitionInfo> getTransitions(long stepMillis) {
        androidx.compose.animation.core.Transition<java.lang.Object> childTransition = getGetHighSpeedVideoSizes().getChildTransition();
        if (childTransition != null) {
            java.util.List<androidx.compose.animation.core.Transition<?>.TransitionAnimationState<?, ?>> allAnimations = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.allAnimations(childTransition);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allAnimations, 10));
            java.util.Iterator<T> it = allAnimations.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.compose.ui.tooling.animation.clock.Utils_androidKt.createTransitionInfo((androidx.compose.animation.core.Transition.TransitionAnimationState) it.next(), stepMillis));
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$0$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(((androidx.compose.animation.tooling.TransitionInfo) t).getLabel(), ((androidx.compose.animation.tooling.TransitionInfo) t2).getLabel());
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : sortedWith) {
                if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.TransitionInfo) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.ComposeAnimatedProperty> getAnimatedProperties() {
        androidx.compose.animation.core.Transition<java.lang.Object> childTransition = getGetHighSpeedVideoSizes().getChildTransition();
        if (childTransition != null) {
            java.util.List<androidx.compose.animation.core.Transition<?>.TransitionAnimationState<?, ?>> allAnimations = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.allAnimations(childTransition);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = allAnimations.iterator();
            while (it.hasNext()) {
                androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState = (androidx.compose.animation.core.Transition.TransitionAnimationState) it.next();
                java.lang.String label = transitionAnimationState.getLabel();
                java.lang.Object value = transitionAnimationState.getValue();
                androidx.compose.animation.tooling.ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new androidx.compose.animation.tooling.ComposeAnimatedProperty(label, value);
                if (composeAnimatedProperty != null) {
                    arrayList.add(composeAnimatedProperty);
                }
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$0$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(((androidx.compose.animation.tooling.ComposeAnimatedProperty) t).getLabel(), ((androidx.compose.animation.tooling.ComposeAnimatedProperty) t2).getLabel());
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : sortedWith) {
                if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.ComposeAnimatedProperty) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
