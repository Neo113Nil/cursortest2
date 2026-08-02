package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionSceneScope;", "", "Lkotlin/ExtensionFunctionType;", "motionSceneContent", "Landroidx/constraintlayout/compose/MotionScene;", androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "(Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/MotionScene;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MotionSceneScopeKt {
    public static final androidx.constraintlayout.compose.MotionScene MotionScene(kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.MotionSceneScope, kotlin.Unit> function1) {
        androidx.constraintlayout.compose.MotionSceneScope motionSceneScope = new androidx.constraintlayout.compose.MotionSceneScope();
        function1.invoke(motionSceneScope);
        return new androidx.constraintlayout.compose.MotionSceneDslImpl(motionSceneScope.getConstraintSetsByName$constraintlayout_compose_release(), motionSceneScope.getTransitionsByName$constraintlayout_compose_release());
    }
}
