package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldTextLayoutModifier.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00126\u0010\u000b\u001a2\u0012\u0004\u0012\u00020\r\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0018\u001a\u00020\bHÂ\u0003J\t\u0010\u0019\u001a\u00020\nHÂ\u0003J9\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\r\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f¢\u0006\u0002\b\u0014HÂ\u0003Jk\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n28\b\u0002\u0010\u000b\u001a2\u0012\u0004\u0012\u00020\r\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f¢\u0006\u0002\b\u0014HÆ\u0001J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0002H\u0016J\f\u0010&\u001a\u00020\u0013*\u00020'H\u0016R>\u0010\u000b\u001a2\u0012\u0004\u0012\u00020\r\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f¢\u0006\u0002\b\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;)V", "component1", "component2", "component3", "component4", "component5", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldTextLayoutModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> onTextLayout;
    private final boolean singleLine;
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
    private final androidx.compose.ui.text.TextStyle textStyle;

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.ui.text.TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> component5() {
        return this.onTextLayout;
    }

    public static /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier copy$default(androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier textFieldTextLayoutModifier, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i & 2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
        if ((i & 4) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
        if ((i & 8) != 0) {
            z = textFieldTextLayoutModifier.singleLine;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function2 = textFieldTextLayoutModifier.onTextLayout;
        }
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState2, textStyle2, z2, function2);
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier copy(androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean singleLine, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> onTextLayout) {
        return new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState, textFieldState, textStyle, singleLine, onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier)) {
            return false;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier textFieldTextLayoutModifier = (androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.singleLine)) * 31;
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2 = this.onTextLayout;
        return hashCode + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public java.lang.String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z;
        this.onTextLayout = function2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifierNode create() {
        return new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifierNode node) {
        node.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }
}
