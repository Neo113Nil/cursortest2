package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019\u0082\u0001\u0004#$%&"}, d2 = {"Landroidx/constraintlayout/compose/BaseKeyFramesScope;", "", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "p0", "<init>", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "Landroidx/constraintlayout/compose/NamedPropertyOrValue;", "E", "initialValue", "", "nameOverride", "Lkotlin/properties/ObservableProperty;", "addNameOnPropertyChange$constraintlayout_compose_release", "(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/compose/Easing;", "<set-?>", "easing$delegate", "Lkotlin/properties/ObservableProperty;", "getEasing", "()Landroidx/constraintlayout/compose/Easing;", "setEasing", "(Landroidx/constraintlayout/compose/Easing;)V", "easing", "Landroidx/constraintlayout/core/parser/CLArray;", "framesContainer", "Landroidx/constraintlayout/core/parser/CLArray;", "getFramesContainer$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLArray;", "Landroidx/constraintlayout/core/parser/CLObject;", "keyFramePropsObject", "Landroidx/constraintlayout/core/parser/CLObject;", "getKeyFramePropsObject$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLObject;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/constraintlayout/compose/FakeKeyFramesScope;", "Landroidx/constraintlayout/compose/KeyAttributesScope;", "Landroidx/constraintlayout/compose/KeyCyclesScope;", "Landroidx/constraintlayout/compose/KeyPositionsScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseKeyFramesScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLArray getHighSpeedVideoFpsRanges;

    /* renamed from: easing$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty easing;
    private final androidx.constraintlayout.core.parser.CLArray framesContainer;
    private final androidx.constraintlayout.core.parser.CLObject keyFramePropsObject;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.BaseKeyFramesScope.class, "easing", "getEasing()Landroidx/constraintlayout/compose/Easing;", 0))};
    public static final int $stable = 8;

    private BaseKeyFramesScope(androidx.constraintlayout.compose.ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        androidx.constraintlayout.core.parser.CLObject cLObject = new androidx.constraintlayout.core.parser.CLObject(new char[0]);
        cLObject.clear();
        this.keyFramePropsObject = cLObject;
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        this.getHighSpeedVideoFpsRanges = cLArray;
        androidx.constraintlayout.core.parser.CLArray cLArray2 = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        this.framesContainer = cLArray2;
        this.easing = addNameOnPropertyChange$constraintlayout_compose_release(androidx.constraintlayout.compose.Easing.INSTANCE.getStandard(), "transitionEasing");
        cLObject.put(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, cLArray);
        cLObject.put("frames", cLArray2);
        for (androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            char[] charArray = constrainedLayoutReference.getId().toString().toCharArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
            androidx.constraintlayout.core.parser.CLArray cLArray3 = this.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.core.parser.CLString cLString = new androidx.constraintlayout.core.parser.CLString(charArray);
            cLString.setStart(0L);
            cLString.setEnd(charArray.length - 1);
            cLArray3.add(cLString);
        }
    }

    /* renamed from: getKeyFramePropsObject$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.core.parser.CLObject getKeyFramePropsObject() {
        return this.keyFramePropsObject;
    }

    /* renamed from: getFramesContainer$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.core.parser.CLArray getFramesContainer() {
        return this.framesContainer;
    }

    public final androidx.constraintlayout.compose.Easing getEasing() {
        return (androidx.constraintlayout.compose.Easing) this.easing.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    public final void setEasing(androidx.constraintlayout.compose.Easing easing) {
        this.easing.setValue(this, getHighSpeedVideoFpsRangesFor[0], easing);
    }

    public static /* synthetic */ kotlin.properties.ObservableProperty addNameOnPropertyChange$constraintlayout_compose_release$default(androidx.constraintlayout.compose.BaseKeyFramesScope baseKeyFramesScope, androidx.constraintlayout.compose.NamedPropertyOrValue namedPropertyOrValue, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return baseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose_release(namedPropertyOrValue, str);
    }

    public final <E extends androidx.constraintlayout.compose.NamedPropertyOrValue> kotlin.properties.ObservableProperty<E> addNameOnPropertyChange$constraintlayout_compose_release(final E initialValue, final java.lang.String nameOverride) {
        return (kotlin.properties.ObservableProperty) new kotlin.properties.ObservableProperty<E>(initialValue) { // from class: androidx.constraintlayout.compose.BaseKeyFramesScope$addNameOnPropertyChange$1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Incorrect types in method signature: (Lkotlin/reflect/KProperty<*>;TE;TE;)V */
            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(kotlin.reflect.KProperty property, androidx.constraintlayout.compose.NamedPropertyOrValue oldValue, androidx.constraintlayout.compose.NamedPropertyOrValue newValue) {
                java.lang.String str = nameOverride;
                if (str == null) {
                    str = property.getName();
                }
                if (newValue != null) {
                    this.getKeyFramePropsObject().putString(str, newValue.getName());
                }
            }
        };
    }

    public /* synthetic */ BaseKeyFramesScope(androidx.constraintlayout.compose.ConstrainedLayoutReference[] constrainedLayoutReferenceArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(constrainedLayoutReferenceArr);
    }
}
