package androidx.constraintlayout.compose;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R+\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R+\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012"}, d2 = {"Landroidx/constraintlayout/compose/KeyPositionScope;", "Landroidx/constraintlayout/compose/BaseKeyFrameScope;", "<init>", "()V", "Landroidx/constraintlayout/compose/CurveFit;", "<set-?>", "curveFit$delegate", "Lkotlin/properties/ObservableProperty;", "getCurveFit", "()Landroidx/constraintlayout/compose/CurveFit;", "setCurveFit", "(Landroidx/constraintlayout/compose/CurveFit;)V", "curveFit", "", "percentHeight$delegate", "getPercentHeight", "()F", "setPercentHeight", "(F)V", "percentHeight", "percentWidth$delegate", "getPercentWidth", "setPercentWidth", "percentWidth", "percentX$delegate", "getPercentX", "setPercentX", "percentX", "percentY$delegate", "getPercentY", "setPercentY", "percentY"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyPositionScope extends androidx.constraintlayout.compose.BaseKeyFrameScope {

    /* renamed from: curveFit$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty curveFit;

    /* renamed from: percentHeight$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty percentHeight;

    /* renamed from: percentWidth$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty percentWidth;

    /* renamed from: percentX$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty percentX;

    /* renamed from: percentY$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ObservableProperty percentY;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionScope.class, "percentX", "getPercentX()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionScope.class, "percentY", "getPercentY()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionScope.class, "percentWidth", "getPercentWidth()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionScope.class, "percentHeight", "getPercentHeight()F", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.constraintlayout.compose.KeyPositionScope.class, "curveFit", "getCurveFit()Landroidx/constraintlayout/compose/CurveFit;", 0))};
    public static final int $stable = 8;

    public KeyPositionScope() {
        super(null);
        androidx.constraintlayout.compose.KeyPositionScope keyPositionScope = this;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        this.percentX = androidx.constraintlayout.compose.BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, valueOf, null, 2, null);
        this.percentY = androidx.constraintlayout.compose.BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, valueOf, null, 2, null);
        this.percentWidth = androidx.constraintlayout.compose.BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, valueOf, null, 2, null);
        this.percentHeight = androidx.constraintlayout.compose.BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, java.lang.Float.valueOf(0.0f), null, 2, null);
        this.curveFit = androidx.constraintlayout.compose.BaseKeyFrameScope.addNameOnPropertyChange$default(keyPositionScope, null, null, 2, null);
    }

    public final float getPercentX() {
        return ((java.lang.Number) this.percentX.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0])).floatValue();
    }

    public final void setPercentX(float f) {
        this.percentX.setValue(this, getHighResolutionOutputSizeshNQ4ISI[0], java.lang.Float.valueOf(f));
    }

    public final float getPercentY() {
        return ((java.lang.Number) this.percentY.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1])).floatValue();
    }

    public final void setPercentY(float f) {
        this.percentY.setValue(this, getHighResolutionOutputSizeshNQ4ISI[1], java.lang.Float.valueOf(f));
    }

    public final float getPercentWidth() {
        return ((java.lang.Number) this.percentWidth.getValue(this, getHighResolutionOutputSizeshNQ4ISI[2])).floatValue();
    }

    public final void setPercentWidth(float f) {
        this.percentWidth.setValue(this, getHighResolutionOutputSizeshNQ4ISI[2], java.lang.Float.valueOf(f));
    }

    public final float getPercentHeight() {
        return ((java.lang.Number) this.percentHeight.getValue(this, getHighResolutionOutputSizeshNQ4ISI[3])).floatValue();
    }

    public final void setPercentHeight(float f) {
        this.percentHeight.setValue(this, getHighResolutionOutputSizeshNQ4ISI[3], java.lang.Float.valueOf(f));
    }

    public final androidx.constraintlayout.compose.CurveFit getCurveFit() {
        return (androidx.constraintlayout.compose.CurveFit) this.curveFit.getValue(this, getHighResolutionOutputSizeshNQ4ISI[4]);
    }

    public final void setCurveFit(androidx.constraintlayout.compose.CurveFit curveFit) {
        this.curveFit.setValue(this, getHighResolutionOutputSizeshNQ4ISI[4], curveFit);
    }
}
