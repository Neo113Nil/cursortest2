package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010$JZ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b\u0005\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010\u000e\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010$"}, d2 = {"Landroidx/compose/material3/IndicatorLineElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/IndicatorLineNode;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "textFieldShape", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "<init>", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/material3/IndicatorLineNode;", "node", "", "update", "(Landroidx/compose/material3/IndicatorLineNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Z", "component2", "component3", "()Landroidx/compose/foundation/interaction/InteractionSource;", "component4", "()Landroidx/compose/material3/TextFieldColors;", "component5", "()Landroidx/compose/ui/graphics/Shape;", "component6-D9Ej5fM", "()F", "component6", "component7-D9Ej5fM", "component7", "copy-gv0btCI", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/material3/IndicatorLineElement;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "Landroidx/compose/material3/TextFieldColors;", "getColors", "Landroidx/compose/ui/graphics/Shape;", "getTextFieldShape", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFocusedIndicatorLineThickness-D9Ej5fM", "getUnfocusedIndicatorLineThickness-D9Ej5fM"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IndicatorLineElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.IndicatorLineNode> {
    public static final int $stable = 0;
    private final androidx.compose.material3.TextFieldColors colors;
    private final boolean enabled;
    private final float focusedIndicatorLineThickness;
    private final androidx.compose.foundation.interaction.InteractionSource interactionSource;
    private final boolean isError;
    private final androidx.compose.ui.graphics.Shape textFieldShape;
    private final float unfocusedIndicatorLineThickness;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final androidx.compose.material3.TextFieldColors getColors() {
        return this.colors;
    }

    public final androidx.compose.ui.graphics.Shape getTextFieldShape() {
        return this.textFieldShape;
    }

    /* renamed from: getFocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m3388getFocusedIndicatorLineThicknessD9Ej5fM() {
        return this.focusedIndicatorLineThickness;
    }

    /* renamed from: getUnfocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m3389getUnfocusedIndicatorLineThicknessD9Ej5fM() {
        return this.unfocusedIndicatorLineThickness;
    }

    private IndicatorLineElement(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape, float f, float f2) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.colors = textFieldColors;
        this.textFieldShape = shape;
        this.focusedIndicatorLineThickness = f;
        this.unfocusedIndicatorLineThickness = f2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.material3.IndicatorLineNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.material3.IndicatorLineNode(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.material3.IndicatorLineNode node) {
        node.m3391updategv0btCI(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("isError", java.lang.Boolean.valueOf(this.isError));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("colors", this.colors);
        inspectorInfo.getProperties().set("textFieldShape", this.textFieldShape);
        inspectorInfo.getProperties().set("focusedIndicatorLineThickness", androidx.compose.ui.unit.Dp.m8599boximpl(this.focusedIndicatorLineThickness));
        inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", androidx.compose.ui.unit.Dp.m8599boximpl(this.unfocusedIndicatorLineThickness));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndicatorLineElement(enabled=");
        sb.append(this.enabled);
        sb.append(", isError=");
        sb.append(this.isError);
        sb.append(", interactionSource=");
        sb.append(this.interactionSource);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", textFieldShape=");
        sb.append(this.textFieldShape);
        sb.append(", focusedIndicatorLineThickness=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.focusedIndicatorLineThickness));
        sb.append(", unfocusedIndicatorLineThickness=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.unfocusedIndicatorLineThickness));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.enabled);
        int hashCode2 = java.lang.Boolean.hashCode(this.isError);
        int hashCode3 = this.interactionSource.hashCode();
        androidx.compose.material3.TextFieldColors textFieldColors = this.colors;
        int hashCode4 = textFieldColors == null ? 0 : textFieldColors.hashCode();
        androidx.compose.ui.graphics.Shape shape = this.textFieldShape;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (shape != null ? shape.hashCode() : 0)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.focusedIndicatorLineThickness)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.unfocusedIndicatorLineThickness);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.IndicatorLineElement)) {
            return false;
        }
        androidx.compose.material3.IndicatorLineElement indicatorLineElement = (androidx.compose.material3.IndicatorLineElement) other;
        return this.enabled == indicatorLineElement.enabled && this.isError == indicatorLineElement.isError && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, indicatorLineElement.interactionSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.colors, indicatorLineElement.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldShape, indicatorLineElement.textFieldShape) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.focusedIndicatorLineThickness, indicatorLineElement.focusedIndicatorLineThickness) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.unfocusedIndicatorLineThickness, indicatorLineElement.unfocusedIndicatorLineThickness);
    }

    /* renamed from: copy-gv0btCI, reason: not valid java name */
    public final androidx.compose.material3.IndicatorLineElement m3387copygv0btCI(boolean enabled, boolean isError, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material3.TextFieldColors colors, androidx.compose.ui.graphics.Shape textFieldShape, float focusedIndicatorLineThickness, float unfocusedIndicatorLineThickness) {
        return new androidx.compose.material3.IndicatorLineElement(enabled, isError, interactionSource, colors, textFieldShape, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness, null);
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getUnfocusedIndicatorLineThickness() {
        return this.unfocusedIndicatorLineThickness;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusedIndicatorLineThickness() {
        return this.focusedIndicatorLineThickness;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getTextFieldShape() {
        return this.textFieldShape;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.material3.TextFieldColors getColors() {
        return this.colors;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: copy-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.IndicatorLineElement m3384copygv0btCI$default(androidx.compose.material3.IndicatorLineElement indicatorLineElement, boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = indicatorLineElement.enabled;
        }
        if ((i & 2) != 0) {
            z2 = indicatorLineElement.isError;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            interactionSource = indicatorLineElement.interactionSource;
        }
        androidx.compose.foundation.interaction.InteractionSource interactionSource2 = interactionSource;
        if ((i & 8) != 0) {
            textFieldColors = indicatorLineElement.colors;
        }
        androidx.compose.material3.TextFieldColors textFieldColors2 = textFieldColors;
        if ((i & 16) != 0) {
            shape = indicatorLineElement.textFieldShape;
        }
        androidx.compose.ui.graphics.Shape shape2 = shape;
        if ((i & 32) != 0) {
            f = indicatorLineElement.focusedIndicatorLineThickness;
        }
        float f3 = f;
        if ((i & 64) != 0) {
            f2 = indicatorLineElement.unfocusedIndicatorLineThickness;
        }
        return indicatorLineElement.m3387copygv0btCI(z, z3, interactionSource2, textFieldColors2, shape2, f3, f2);
    }

    public /* synthetic */ IndicatorLineElement(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape, float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, interactionSource, textFieldColors, shape, f, f2);
    }
}
