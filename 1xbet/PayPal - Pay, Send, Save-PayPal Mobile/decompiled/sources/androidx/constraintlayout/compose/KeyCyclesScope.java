package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0007\u0010\r"}, d2 = {"Landroidx/constraintlayout/compose/KeyCyclesScope;", "Landroidx/constraintlayout/compose/BaseKeyFramesScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "targets", "<init>", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/KeyCycleScope;", "", "Lkotlin/ExtensionFunctionType;", "keyFrameContent", "(ILkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyCyclesScope extends androidx.constraintlayout.compose.BaseKeyFramesScope {
    public static final int $stable = 0;

    public KeyCyclesScope(androidx.constraintlayout.compose.ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((androidx.constraintlayout.compose.ConstrainedLayoutReference[]) java.util.Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
    }

    public final void frame(int frame, kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.KeyCycleScope, kotlin.Unit> keyFrameContent) {
        androidx.constraintlayout.compose.KeyCycleScope keyCycleScope = new androidx.constraintlayout.compose.KeyCycleScope();
        keyFrameContent.invoke(keyCycleScope);
        getFramesContainer().add(new androidx.constraintlayout.core.parser.CLNumber(frame));
        keyCycleScope.addToContainer$constraintlayout_compose_release(getKeyFramePropsObject());
    }
}
