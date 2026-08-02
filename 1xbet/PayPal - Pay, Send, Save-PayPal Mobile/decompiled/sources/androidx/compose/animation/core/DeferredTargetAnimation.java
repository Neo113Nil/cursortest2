package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0015\u001a\u0004\u0018\u00018\u00008G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u0010\u001a\u0004\u0018\u00018\u00002\b\u0010\u0016\u001a\u0004\u0018\u00018\u00008C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u0010\u0010\u001aR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "vectorConverter", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTarget", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/TwoWayConverter;", "getHighSpeedVideoFpsRangesFor", "getPendingTarget", "()Ljava/lang/Object;", "pendingTarget", "p0", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/Animatable;", "getHighResolutionOutputSizeshNQ4ISI", "", "isIdle", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeferredTargetAnimation<T, V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 8;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private androidx.compose.animation.core.Animatable<T, V> getHighSpeedVideoFpsRangesFor;

    public DeferredTargetAnimation(androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter) {
        this.Camera2StreamConfigurationMap = twoWayConverter;
    }

    public final T getPendingTarget() {
        return getHighSpeedVideoSizes();
    }

    private final void Camera2StreamConfigurationMap(T t) {
        this.getHighSpeedVideoFpsRanges.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    private final T getHighSpeedVideoFpsRangesFor() {
        androidx.compose.animation.core.Animatable<T, V> animatable = this.getHighSpeedVideoFpsRangesFor;
        if (animatable != null) {
            return animatable.getTargetValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object updateTarget$default(androidx.compose.animation.core.DeferredTargetAnimation deferredTargetAnimation, java.lang.Object obj, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, coroutineScope, finiteAnimationSpec);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>) from 0x0016: IPUT 
          (r0v4 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>)
          (r14v0 'this' ?? I:androidx.compose.animation.core.DeferredTargetAnimation A[IMMUTABLE_TYPE, THIS])
         androidx.compose.animation.core.DeferredTargetAnimation.getHighSpeedVideoFpsRangesFor androidx.compose.animation.core.Animatable
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final T updateTarget(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>) from 0x0016: IPUT 
          (r0v4 ?? I:androidx.compose.animation.core.Animatable<T, V extends androidx.compose.animation.core.AnimationVector>)
          (r14v0 'this' ?? I:androidx.compose.animation.core.DeferredTargetAnimation A[IMMUTABLE_TYPE, THIS])
         androidx.compose.animation.core.DeferredTargetAnimation.getHighSpeedVideoFpsRangesFor androidx.compose.animation.core.Animatable
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final boolean isIdle() {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoSizes(), getHighSpeedVideoFpsRangesFor())) {
            return false;
        }
        androidx.compose.animation.core.Animatable<T, V> animatable = this.getHighSpeedVideoFpsRangesFor;
        return animatable == null || !animatable.isRunning();
    }
}
