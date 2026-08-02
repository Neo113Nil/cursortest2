package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0006©\u0001ª\u0001«\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0013J(\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u001eJR\u0010)\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0094\u0001\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b2\u00103JR\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\b\b\u0002\u0010,\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b'\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u001eJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u001eJ\u0014\u0010:\u001a\u000207*\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b8\u00109R\u0017\u0010<\u001a\u00020;8\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R*\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020I8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\"\u001a\u00020N8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010+\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010=\u001a\u0004\bU\u0010?R+\u0010]\u001a\u0002072\u0006\u0010V\u001a\u0002078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u00100\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010D\u001a\u0004\b^\u0010F\"\u0004\b_\u0010HR+\u0010d\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010F\"\u0004\bc\u0010HR\u001a\u0010\u0002\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR+\u0010o\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010a\u001a\u0004\bm\u0010F\"\u0004\bn\u0010HR+\u0010s\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010a\u001a\u0004\bq\u0010F\"\u0004\br\u0010HR+\u0010w\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010a\u001a\u0004\bu\u0010F\"\u0004\bv\u0010HR+\u0010{\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010a\u001a\u0004\by\u0010F\"\u0004\bz\u0010HR+\u0010\u007f\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010a\u001a\u0004\b}\u0010F\"\u0004\b~\u0010HR/\u0010\u0083\u0001\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010a\u001a\u0005\b\u0081\u0001\u0010F\"\u0005\b\u0082\u0001\u0010HR/\u0010\u0087\u0001\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010a\u001a\u0005\b\u0085\u0001\u0010F\"\u0005\b\u0086\u0001\u0010HR\u001b\u0010*\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010=\u001a\u0005\b\u0088\u0001\u0010?R\u001b\u0010!\u001a\u00020N8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010O\u001a\u0005\b\u0089\u0001\u0010QR3\u0010\u008e\u0001\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u00188G@GX\u0087\u008e\u0002ø\u0001\u0001¢\u0006\u0016\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010F\"\u0005\b\u008d\u0001\u0010HR3\u0010\u0092\u0001\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u00188G@GX\u0087\u008e\u0002ø\u0001\u0001¢\u0006\u0016\n\u0006\b\u008f\u0001\u0010\u008b\u0001\u001a\u0005\b\u0090\u0001\u0010F\"\u0005\b\u0091\u0001\u0010HR3\u0010\u0096\u0001\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u00188G@GX\u0087\u008e\u0002ø\u0001\u0001¢\u0006\u0016\n\u0006\b\u0093\u0001\u0010\u008b\u0001\u001a\u0005\b\u0094\u0001\u0010F\"\u0005\b\u0095\u0001\u0010HR,\u00101\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108\u0007@GX\u0087\u000e¢\u0006\u0014\n\u0004\b1\u0010D\u001a\u0005\b\u0097\u0001\u0010F\"\u0005\b\u0098\u0001\u0010HR/\u0010\u009c\u0001\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010a\u001a\u0005\b\u009a\u0001\u0010F\"\u0005\b\u009b\u0001\u0010HR4\u0010¤\u0001\u001a\u00030\u009d\u00012\u0007\u0010V\u001a\u00030\u009d\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R/\u0010¨\u0001\u001a\u0002072\u0006\u0010V\u001a\u0002078G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010X\u001a\u0005\b¦\u0001\u0010Z\"\u0005\b§\u0001\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "", "centerAround", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "other", "", "bias", "centerHorizontallyTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V", "centerTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "centerVerticallyTo", "angle", "Landroidx/compose/ui/unit/Dp;", "distance", "circular-wH6b6FI", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V", "circular", "clearConstraints", "()V", "clearHorizontal", "clearVertical", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "linkTo-8ZKsbrE", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V", "linkTo", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "horizontalBias", "verticalBias", "linkTo-R7zmacU", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V", "resetDimensions", "resetTransforms", "Landroidx/constraintlayout/compose/Dimension;", "asDimension-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "asDimension", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteLeft", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteRight", "getAbsoluteRight", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "alpha", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "baseline", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getBottom", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "getContainerObject$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLObject;", "getEnd", "<set-?>", "height$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "getHeight", "()Landroidx/constraintlayout/compose/Dimension;", "setHeight", "(Landroidx/constraintlayout/compose/Dimension;)V", "height", "getHorizontalBias", "setHorizontalBias", "horizontalChainWeight$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "pivotX$delegate", "getPivotX", "setPivotX", "pivotX", "pivotY$delegate", "getPivotY", "setPivotY", "pivotY", "rotationX$delegate", "getRotationX", "setRotationX", "rotationX", "rotationY$delegate", "getRotationY", "setRotationY", "rotationY", "rotationZ$delegate", "getRotationZ", "setRotationZ", "rotationZ", "scaleX$delegate", "getScaleX", "setScaleX", "scaleX", "scaleY$delegate", "getScaleY", "setScaleY", "scaleY", "getStart", "getTop", "translationX$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "translationY$delegate", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "translationZ$delegate", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "getVerticalBias", "setVerticalBias", "verticalChainWeight$delegate", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "Landroidx/constraintlayout/compose/Visibility;", "visibility$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "visibility", "width$delegate", "getWidth", "setWidth", "width", "DimensionProperty", "DpProperty", "FloatProperty"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstrainScope {
    public static final int $stable = 0;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "scaleX", "getScaleX()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "scaleY", "getScaleY()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "rotationX", "getRotationX()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "rotationY", "getRotationY()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "rotationZ", "getRotationZ()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "pivotX", "getPivotX()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "pivotY", "getPivotY()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    private final androidx.constraintlayout.compose.VerticalAnchorable absoluteLeft;
    private final androidx.constraintlayout.compose.VerticalAnchorable absoluteRight;
    private float alpha;
    private final androidx.constraintlayout.compose.BaselineAnchorable baseline;
    private final androidx.constraintlayout.compose.HorizontalAnchorable bottom;
    private final androidx.constraintlayout.core.parser.CLObject containerObject;
    private final androidx.constraintlayout.compose.VerticalAnchorable end;
    private float horizontalBias;

    /* renamed from: horizontalChainWeight$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty horizontalChainWeight;
    private final java.lang.Object id;

    /* renamed from: pivotX$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty pivotX;

    /* renamed from: pivotY$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty pivotY;

    /* renamed from: rotationX$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty rotationX;

    /* renamed from: rotationY$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty rotationY;

    /* renamed from: rotationZ$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty rotationZ;

    /* renamed from: scaleX$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty scaleX;

    /* renamed from: scaleY$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty scaleY;
    private final androidx.constraintlayout.compose.VerticalAnchorable start;
    private final androidx.constraintlayout.compose.HorizontalAnchorable top;

    /* renamed from: translationX$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.DpProperty translationX;

    /* renamed from: translationY$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.DpProperty translationY;

    /* renamed from: translationZ$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.DpProperty translationZ;
    private float verticalBias;

    /* renamed from: verticalChainWeight$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.FloatProperty verticalChainWeight;

    /* renamed from: visibility$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope$visibility$2 visibility;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference parent = new androidx.constraintlayout.compose.ConstrainedLayoutReference("parent");

    /* renamed from: width$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.DimensionProperty width = new androidx.constraintlayout.compose.ConstrainScope.DimensionProperty(androidx.constraintlayout.compose.Dimension.INSTANCE.getWrapContent());

    /* renamed from: height$delegate, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.ConstrainScope.DimensionProperty height = new androidx.constraintlayout.compose.ConstrainScope.DimensionProperty(androidx.constraintlayout.compose.Dimension.INSTANCE.getWrapContent());

    /* JADX WARN: Type inference failed for: r13v18, types: [androidx.constraintlayout.compose.ConstrainScope$visibility$2] */
    public ConstrainScope(java.lang.Object obj, androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.id = obj;
        this.containerObject = cLObject;
        this.start = new androidx.constraintlayout.compose.ConstraintVerticalAnchorable(-2, cLObject);
        this.absoluteLeft = new androidx.constraintlayout.compose.ConstraintVerticalAnchorable(0, cLObject);
        this.top = new androidx.constraintlayout.compose.ConstraintHorizontalAnchorable(0, cLObject);
        this.end = new androidx.constraintlayout.compose.ConstraintVerticalAnchorable(-1, cLObject);
        this.absoluteRight = new androidx.constraintlayout.compose.ConstraintVerticalAnchorable(1, cLObject);
        this.bottom = new androidx.constraintlayout.compose.ConstraintHorizontalAnchorable(1, cLObject);
        this.baseline = new androidx.constraintlayout.compose.ConstraintBaselineAnchorable(cLObject);
        final androidx.constraintlayout.compose.Visibility visible = androidx.constraintlayout.compose.Visibility.INSTANCE.getVisible();
        this.visibility = new kotlin.properties.ObservableProperty<androidx.constraintlayout.compose.Visibility>(visible) { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$2
            @Override // kotlin.properties.ObservableProperty
            public final /* bridge */ /* synthetic */ void afterChange(kotlin.reflect.KProperty kProperty, androidx.constraintlayout.compose.Visibility visibility, androidx.constraintlayout.compose.Visibility visibility2) {
                afterChange2((kotlin.reflect.KProperty<?>) kProperty, visibility, visibility2);
            }

            /* renamed from: afterChange, reason: avoid collision after fix types in other method */
            protected final void afterChange2(kotlin.reflect.KProperty<?> property, androidx.constraintlayout.compose.Visibility oldValue, androidx.constraintlayout.compose.Visibility newValue) {
                androidx.constraintlayout.compose.ConstrainScope.this.getContainerObject().putString(property.getName(), newValue.getName());
            }
        };
        this.alpha = 1.0f;
        java.lang.String str = null;
        int i = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.scaleX = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, 1.0f, str, i, defaultConstructorMarker);
        java.lang.String str2 = null;
        int i2 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        this.scaleY = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, 1.0f, str2, i2, defaultConstructorMarker2);
        float f = 0.0f;
        this.rotationX = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, f, str, i, defaultConstructorMarker);
        this.rotationY = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, 0.0f, str2, i2, defaultConstructorMarker2);
        this.rotationZ = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, f, str, i, defaultConstructorMarker);
        this.translationX = new androidx.constraintlayout.compose.ConstrainScope.DpProperty(this, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), str, i, defaultConstructorMarker);
        this.translationY = new androidx.constraintlayout.compose.ConstrainScope.DpProperty(this, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), str2, i2, defaultConstructorMarker2);
        this.translationZ = new androidx.constraintlayout.compose.ConstrainScope.DpProperty(this, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), str, i, defaultConstructorMarker);
        this.pivotX = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, 0.5f, str2, i2, defaultConstructorMarker2);
        this.pivotY = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(this, 0.5f, str, i, defaultConstructorMarker);
        this.horizontalChainWeight = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(Float.NaN, "hWeight");
        this.verticalChainWeight = new androidx.constraintlayout.compose.ConstrainScope.FloatProperty(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }

    /* renamed from: getContainerObject$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.core.parser.CLObject getContainerObject() {
        return this.containerObject;
    }

    /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getStart() {
        return this.start;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final androidx.constraintlayout.compose.HorizontalAnchorable getTop() {
        return this.top;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getEnd() {
        return this.end;
    }

    public final androidx.constraintlayout.compose.VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final androidx.constraintlayout.compose.HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    public final androidx.constraintlayout.compose.BaselineAnchorable getBaseline() {
        return this.baseline;
    }

    public final androidx.constraintlayout.compose.Dimension getWidth() {
        return this.width.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final void setWidth(androidx.constraintlayout.compose.Dimension dimension) {
        this.width.setValue(this, Camera2StreamConfigurationMap[0], dimension);
    }

    public final androidx.constraintlayout.compose.Dimension getHeight() {
        return this.height.getValue(this, Camera2StreamConfigurationMap[1]);
    }

    public final void setHeight(androidx.constraintlayout.compose.Dimension dimension) {
        this.height.setValue(this, Camera2StreamConfigurationMap[1], dimension);
    }

    public final androidx.constraintlayout.compose.Visibility getVisibility() {
        return getValue(this, Camera2StreamConfigurationMap[2]);
    }

    public final void setVisibility(androidx.constraintlayout.compose.Visibility visibility) {
        setValue(this, Camera2StreamConfigurationMap[2], visibility);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        this.containerObject.putNumber("alpha", f);
    }

    public final float getScaleX() {
        return this.scaleX.getValue(this, Camera2StreamConfigurationMap[3]).floatValue();
    }

    public final void setScaleX(float f) {
        this.scaleX.setValue(this, Camera2StreamConfigurationMap[3], java.lang.Float.valueOf(f));
    }

    public final float getScaleY() {
        return this.scaleY.getValue(this, Camera2StreamConfigurationMap[4]).floatValue();
    }

    public final void setScaleY(float f) {
        this.scaleY.setValue(this, Camera2StreamConfigurationMap[4], java.lang.Float.valueOf(f));
    }

    public final float getRotationX() {
        return this.rotationX.getValue(this, Camera2StreamConfigurationMap[5]).floatValue();
    }

    public final void setRotationX(float f) {
        this.rotationX.setValue(this, Camera2StreamConfigurationMap[5], java.lang.Float.valueOf(f));
    }

    public final float getRotationY() {
        return this.rotationY.getValue(this, Camera2StreamConfigurationMap[6]).floatValue();
    }

    public final void setRotationY(float f) {
        this.rotationY.setValue(this, Camera2StreamConfigurationMap[6], java.lang.Float.valueOf(f));
    }

    public final float getRotationZ() {
        return this.rotationZ.getValue(this, Camera2StreamConfigurationMap[7]).floatValue();
    }

    public final void setRotationZ(float f) {
        this.rotationZ.setValue(this, Camera2StreamConfigurationMap[7], java.lang.Float.valueOf(f));
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m8878getTranslationXD9Ej5fM() {
        return this.translationX.getValue(this, Camera2StreamConfigurationMap[8]).m8615unboximpl();
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m8884setTranslationX0680j_4(float f) {
        this.translationX.setValue(this, Camera2StreamConfigurationMap[8], androidx.compose.ui.unit.Dp.m8599boximpl(f));
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m8879getTranslationYD9Ej5fM() {
        return this.translationY.getValue(this, Camera2StreamConfigurationMap[9]).m8615unboximpl();
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m8885setTranslationY0680j_4(float f) {
        this.translationY.setValue(this, Camera2StreamConfigurationMap[9], androidx.compose.ui.unit.Dp.m8599boximpl(f));
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m8880getTranslationZD9Ej5fM() {
        return this.translationZ.getValue(this, Camera2StreamConfigurationMap[10]).m8615unboximpl();
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m8886setTranslationZ0680j_4(float f) {
        this.translationZ.setValue(this, Camera2StreamConfigurationMap[10], androidx.compose.ui.unit.Dp.m8599boximpl(f));
    }

    public final float getPivotX() {
        return this.pivotX.getValue(this, Camera2StreamConfigurationMap[11]).floatValue();
    }

    public final void setPivotX(float f) {
        this.pivotX.setValue(this, Camera2StreamConfigurationMap[11], java.lang.Float.valueOf(f));
    }

    public final float getPivotY() {
        return this.pivotY.getValue(this, Camera2StreamConfigurationMap[12]).floatValue();
    }

    public final void setPivotY(float f) {
        this.pivotY.setValue(this, Camera2StreamConfigurationMap[12], java.lang.Float.valueOf(f));
    }

    public final float getHorizontalChainWeight() {
        return this.horizontalChainWeight.getValue(this, Camera2StreamConfigurationMap[13]).floatValue();
    }

    public final void setHorizontalChainWeight(float f) {
        this.horizontalChainWeight.setValue(this, Camera2StreamConfigurationMap[13], java.lang.Float.valueOf(f));
    }

    public final float getVerticalChainWeight() {
        return this.verticalChainWeight.getValue(this, Camera2StreamConfigurationMap[14]).floatValue();
    }

    public final void setVerticalChainWeight(float f) {
        this.verticalChainWeight.setValue(this, Camera2StreamConfigurationMap[14], java.lang.Float.valueOf(f));
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final void setHorizontalBias(float f) {
        this.horizontalBias = f;
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        this.containerObject.putNumber("hBias", f);
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public final void setVerticalBias(float f) {
        this.verticalBias = f;
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        this.containerObject.putNumber("vBias", f);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m8882linkTo8ZKsbrE(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor start, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, float bias) {
        this.start.mo8858linkToVpY3zN4(start, startMargin, startGoneMargin);
        this.end.mo8858linkToVpY3zN4(end, endMargin, endGoneMargin);
        this.containerObject.putNumber("hRtlBias", bias);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m8881linkTo8ZKsbrE(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor top, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, float bias) {
        this.top.mo8857linkToVpY3zN4(top, topMargin, topGoneMargin);
        this.bottom.mo8857linkToVpY3zN4(bottom, bottomMargin, bottomGoneMargin);
        this.containerObject.putNumber("vBias", bias);
    }

    /* renamed from: linkTo-R7zmacU, reason: not valid java name */
    public final void m8883linkToR7zmacU(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor start, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor top, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor end, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor bottom, float startMargin, float topMargin, float endMargin, float bottomMargin, float startGoneMargin, float topGoneMargin, float endGoneMargin, float bottomGoneMargin, float horizontalBias, float verticalBias) {
        m8882linkTo8ZKsbrE(start, end, startMargin, endMargin, startGoneMargin, endGoneMargin, horizontalBias);
        m8881linkTo8ZKsbrE(top, bottom, topMargin, bottomMargin, topGoneMargin, bottomGoneMargin, verticalBias);
    }

    public final void centerTo(androidx.constraintlayout.compose.ConstrainedLayoutReference other) {
        m8875linkToR7zmacU$default(this, other.getStart(), other.getTop(), other.getEnd(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public static /* synthetic */ void centerHorizontallyTo$default(androidx.constraintlayout.compose.ConstrainScope constrainScope, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constrainedLayoutReference, f);
    }

    public final void centerHorizontallyTo(androidx.constraintlayout.compose.ConstrainedLayoutReference other, float bias) {
        m8874linkTo8ZKsbrE$default(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (java.lang.Object) null);
    }

    public static /* synthetic */ void centerVerticallyTo$default(androidx.constraintlayout.compose.ConstrainScope constrainScope, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerVerticallyTo(constrainedLayoutReference, f);
    }

    public final void centerVerticallyTo(androidx.constraintlayout.compose.ConstrainedLayoutReference other, float bias) {
        m8873linkTo8ZKsbrE$default(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (java.lang.Object) null);
    }

    public final void centerAround(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor anchor) {
        m8874linkTo8ZKsbrE$default(this, anchor, anchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (java.lang.Object) null);
    }

    public final void centerAround(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor anchor) {
        m8873linkTo8ZKsbrE$default(this, anchor, anchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (java.lang.Object) null);
    }

    /* renamed from: circular-wH6b6FI, reason: not valid java name */
    public final void m8877circularwH6b6FI(androidx.constraintlayout.compose.ConstrainedLayoutReference other, float angle, float distance) {
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(other.getId().toString()));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(angle));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(distance));
        this.containerObject.put("circular", cLArray);
    }

    public final void clearHorizontal() {
        this.containerObject.remove(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
        this.containerObject.remove(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
        this.containerObject.remove(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
        this.containerObject.remove("end");
    }

    public final void clearVertical() {
        this.containerObject.remove(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
        this.containerObject.remove(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
        this.containerObject.remove("baseline");
    }

    public final void clearConstraints() {
        clearHorizontal();
        clearVertical();
        this.containerObject.remove("circular");
    }

    public final void resetDimensions() {
        setWidth(androidx.constraintlayout.compose.Dimension.INSTANCE.getWrapContent());
        setHeight(androidx.constraintlayout.compose.Dimension.INSTANCE.getWrapContent());
    }

    public final void resetTransforms() {
        this.containerObject.remove("alpha");
        this.containerObject.remove("scaleX");
        this.containerObject.remove("scaleY");
        this.containerObject.remove("rotationX");
        this.containerObject.remove("rotationY");
        this.containerObject.remove("rotationZ");
        this.containerObject.remove("translationX");
        this.containerObject.remove("translationY");
        this.containerObject.remove("translationZ");
        this.containerObject.remove("pivotX");
        this.containerObject.remove("pivotY");
    }

    /* renamed from: asDimension-0680j_4, reason: not valid java name */
    public final androidx.constraintlayout.compose.Dimension m8876asDimension0680j_4(float f) {
        return androidx.constraintlayout.compose.Dimension.INSTANCE.m8949value0680j_4(f);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/compose/Dimension;", "p0", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Dimension;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class DimensionProperty extends kotlin.properties.ObservableProperty<androidx.constraintlayout.compose.Dimension> {
        public DimensionProperty(androidx.constraintlayout.compose.Dimension dimension) {
            super(dimension);
        }

        @Override // kotlin.properties.ObservableProperty
        public final /* synthetic */ void afterChange(kotlin.reflect.KProperty kProperty, androidx.constraintlayout.compose.Dimension dimension, androidx.constraintlayout.compose.Dimension dimension2) {
            androidx.constraintlayout.compose.Dimension dimension3 = dimension2;
            androidx.constraintlayout.core.parser.CLObject containerObject = androidx.constraintlayout.compose.ConstrainScope.this.getContainerObject();
            java.lang.String name2 = kProperty.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(dimension3, "");
            containerObject.put(name2, ((androidx.constraintlayout.compose.DimensionDescription) dimension3).asCLElement$constraintlayout_compose_release());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "Lkotlin/properties/ObservableProperty;", "", "p0", "", "p1", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class FloatProperty extends kotlin.properties.ObservableProperty<java.lang.Float> {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        public FloatProperty(float f, java.lang.String str) {
            super(java.lang.Float.valueOf(f));
            this.getHighSpeedVideoSizes = str;
        }

        public /* synthetic */ FloatProperty(androidx.constraintlayout.compose.ConstrainScope constrainScope, float f, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f, (i & 2) != 0 ? null : str);
        }

        @Override // kotlin.properties.ObservableProperty
        public final /* synthetic */ void afterChange(kotlin.reflect.KProperty kProperty, java.lang.Float f, java.lang.Float f2) {
            float floatValue = f2.floatValue();
            if (java.lang.Float.isNaN(floatValue)) {
                return;
            }
            androidx.constraintlayout.core.parser.CLObject containerObject = androidx.constraintlayout.compose.ConstrainScope.this.getContainerObject();
            java.lang.String str = this.getHighSpeedVideoSizes;
            if (str == null) {
                str = kProperty.getName();
            }
            containerObject.putNumber(str, floatValue);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/compose/ui/unit/Dp;", "p0", "", "p1", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class DpProperty extends kotlin.properties.ObservableProperty<androidx.compose.ui.unit.Dp> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        private DpProperty(float f, java.lang.String str) {
            super(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public /* synthetic */ DpProperty(androidx.constraintlayout.compose.ConstrainScope constrainScope, float f, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(constrainScope, f, (i & 2) != 0 ? null : str, null);
        }

        @Override // kotlin.properties.ObservableProperty
        public final /* synthetic */ void afterChange(kotlin.reflect.KProperty kProperty, androidx.compose.ui.unit.Dp dp, androidx.compose.ui.unit.Dp dp2) {
            dp.m8615unboximpl();
            float m8615unboximpl = dp2.m8615unboximpl();
            if (java.lang.Float.isNaN(m8615unboximpl)) {
                return;
            }
            androidx.constraintlayout.core.parser.CLObject containerObject = androidx.constraintlayout.compose.ConstrainScope.this.getContainerObject();
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            if (str == null) {
                str = kProperty.getName();
            }
            containerObject.putNumber(str, m8615unboximpl);
        }

        public /* synthetic */ DpProperty(androidx.constraintlayout.compose.ConstrainScope constrainScope, float f, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f, str);
        }
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m8874linkTo8ZKsbrE$default(androidx.constraintlayout.compose.ConstrainScope constrainScope, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, float f2, float f3, float f4, float f5, int i, java.lang.Object obj) {
        constrainScope.m8882linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, (i & 16) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3, (i & 32) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m8873linkTo8ZKsbrE$default(androidx.constraintlayout.compose.ConstrainScope constrainScope, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, int i, java.lang.Object obj) {
        constrainScope.m8881linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, (i & 16) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3, (i & 32) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static /* synthetic */ void m8875linkToR7zmacU$default(androidx.constraintlayout.compose.ConstrainScope constrainScope, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, java.lang.Object obj) {
        constrainScope.m8883linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i & 16) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i & 32) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3, (i & 128) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f4, (i & 256) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f5, (i & 512) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f6, (i & 1024) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f7, (i & 2048) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f8, (i & 4096) != 0 ? 0.5f : f9, (i & 8192) != 0 ? 0.5f : f10);
    }
}
