package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b\u0010\u0010\u001dR#\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000 8G¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "", "addAnimation$animation_core", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "removeAnimation$animation_core", "run$animation_core", "(Landroidx/compose/runtime/Composer;I)V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(J)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "()Z", "getHighSpeedVideoFpsRangesFor", "(Z)V", "J", "Camera2StreamConfigurationMap", "", "getAnimations", "()Ljava/util/List;", "animations", "TransitionAnimationState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final java.lang.String label;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState[16], 0);
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor = Long.MIN_VALUE;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    public InfiniteTransition(java.lang.String str) {
        this.label = str;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00028\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R+\u0010+\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/RB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001008\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010?\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "", "updateValues$animation_core", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "", "playTimeNanos", "onPlayTimeChanged$animation_core", "(J)V", "skipToEnd$animation_core", "()V", "reset$animation_core", "Ljava/lang/Object;", "getInitialValue$animation_core", "()Ljava/lang/Object;", "setInitialValue$animation_core", "(Ljava/lang/Object;)V", "getTargetValue$animation_core", "setTargetValue$animation_core", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "p0", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "", "isFinished", "Z", "isFinished$animation_core", "()Z", "setFinished$animation_core", "(Z)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.runtime.State<T> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;
        private androidx.compose.animation.core.TargetBasedAnimation<T, V> animation;
        private androidx.compose.animation.core.AnimationSpec<T> animationSpec;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private long Camera2StreamConfigurationMap;
        private T initialValue;
        private boolean isFinished;
        private final java.lang.String label;
        private T targetValue;
        private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

        /* renamed from: value$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState value;

        public TransitionAnimationState(T t, T t2, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, androidx.compose.animation.core.AnimationSpec<T> animationSpec, java.lang.String str) {
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new androidx.compose.animation.core.TargetBasedAnimation<>(this.animationSpec, twoWayConverter, this.initialValue, this.targetValue, (androidx.compose.animation.core.AnimationVector) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public final T getInitialValue$animation_core() {
            return this.initialValue;
        }

        public final void setInitialValue$animation_core(T t) {
            this.initialValue = t;
        }

        public final T getTargetValue$animation_core() {
            return this.targetValue;
        }

        public final void setTargetValue$animation_core(T t) {
            this.targetValue = t;
        }

        public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        @Override // androidx.compose.runtime.State
        public final T getValue() {
            return this.value.getValue();
        }

        public final void setValue$animation_core(T t) {
            this.value.setValue(t);
        }

        public final androidx.compose.animation.core.AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final androidx.compose.animation.core.TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final void setAnimation$animation_core(androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation = targetBasedAnimation;
        }

        /* renamed from: isFinished$animation_core, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void setFinished$animation_core(boolean z) {
            this.isFinished = z;
        }

        public final void updateValues$animation_core(T initialValue, T targetValue, androidx.compose.animation.core.AnimationSpec<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new androidx.compose.animation.core.TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, targetValue, (androidx.compose.animation.core.AnimationVector) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            androidx.compose.animation.core.InfiniteTransition.this.getHighSpeedVideoFpsRangesFor(true);
            this.isFinished = false;
            this.getHighSpeedVideoFpsRanges = true;
        }

        public final void onPlayTimeChanged$animation_core(long playTimeNanos) {
            androidx.compose.animation.core.InfiniteTransition.this.getHighSpeedVideoFpsRangesFor(false);
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = false;
                this.Camera2StreamConfigurationMap = playTimeNanos;
            }
            long j = playTimeNanos - this.Camera2StreamConfigurationMap;
            setValue$animation_core(this.animation.getValueFromNanos(j));
            this.isFinished = this.animation.isFinishedFromNanos(j);
        }

        public final void skipToEnd$animation_core() {
            setValue$animation_core(this.animation.getTargetValue());
            this.getHighSpeedVideoFpsRanges = true;
        }

        public final void reset$animation_core() {
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(boolean z) {
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighSpeedVideoSizes() {
        return ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean Camera2StreamConfigurationMap() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(z));
    }

    public final java.util.List<androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>> getAnimations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.asMutableList();
    }

    public final void addAnimation$animation_core(androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?> animation) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(animation);
        getHighSpeedVideoFpsRangesFor(true);
    }

    public final void removeAnimation$animation_core(androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?> animation) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(animation);
    }

    public final void run$animation_core(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            if (Camera2StreamConfigurationMap() || getHighSpeedVideoSizes()) {
                startRestartGroup.startReplaceGroup(-144841960);
                boolean changedInstance = startRestartGroup.changedInstance(this);
                androidx.compose.animation.core.InfiniteTransition$run$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new androidx.compose.animation.core.InfiniteTransition$run$1$1(mutableState, this, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(this, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i2 & 14);
            } else {
                startRestartGroup.startReplaceGroup(-151918981);
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.animation.core.InfiniteTransition$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.animation.core.InfiniteTransition.getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.InfiniteTransition.this, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(long p0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>> mutableVector = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>[] transitionAnimationStateArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?> transitionAnimationState = transitionAnimationStateArr[i];
            if (!transitionAnimationState.getIsFinished()) {
                transitionAnimationState.onPlayTimeChanged$animation_core(p0);
            }
            if (!transitionAnimationState.getIsFinished()) {
                z = false;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.InfiniteTransition infiniteTransition, int i, androidx.compose.runtime.Composer composer) {
        infiniteTransition.run$animation_core(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
