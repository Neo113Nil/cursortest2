package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0007\u0010\rR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/constraintlayout/compose/KeyPositionsScope;", "Landroidx/constraintlayout/compose/BaseKeyFramesScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "targets", "<init>", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/KeyPositionScope;", "", "Lkotlin/ExtensionFunctionType;", "keyFrameContent", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/compose/RelativePosition;", "<set-?>", "type$delegate", "Lkotlin/properties/ObservableProperty;", "getType", "()Landroidx/constraintlayout/compose/RelativePosition;", "setType", "(Landroidx/constraintlayout/compose/RelativePosition;)V", "type"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyPositionsScope extends androidx.constraintlayout.compose.BaseKeyFramesScope {

    /* renamed from: type$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty type;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionsScope.class, "type", "getType()Landroidx/constraintlayout/compose/RelativePosition;", 0))};
    public static final int $stable = 8;

    public KeyPositionsScope(androidx.constraintlayout.compose.ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((androidx.constraintlayout.compose.ConstrainedLayoutReference[]) java.util.Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
        this.type = androidx.constraintlayout.compose.BaseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose_release$default(this, androidx.constraintlayout.compose.RelativePosition.INSTANCE.getDelta(), null, 2, null);
    }

    public final androidx.constraintlayout.compose.RelativePosition getType() {
        return (androidx.constraintlayout.compose.RelativePosition) this.type.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final void setType(androidx.constraintlayout.compose.RelativePosition relativePosition) {
        this.type.setValue(this, Camera2StreamConfigurationMap[0], relativePosition);
    }

    public final void frame(int frame, kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.KeyPositionScope, kotlin.Unit> keyFrameContent) {
        androidx.constraintlayout.compose.KeyPositionScope keyPositionScope = new androidx.constraintlayout.compose.KeyPositionScope();
        keyFrameContent.invoke(keyPositionScope);
        getFramesContainer().add(new androidx.constraintlayout.core.parser.CLNumber(frame));
        keyPositionScope.addToContainer$constraintlayout_compose_release(getKeyFramePropsObject());
    }
}
