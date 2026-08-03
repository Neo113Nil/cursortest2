package androidx.compose.foundation.text.modifiers;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\t\u0010 \u001a\u00020\u0004HÂ\u0003J\u001f\u0010!\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u001bHÂ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\t\u0010$\u001a\u00020\u0006HÂ\u0003J\t\u0010%\u001a\u00020\bHÂ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÂ\u0003J\u0016\u0010'\u001a\u00020\u000eHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u0010HÂ\u0003J\t\u0010+\u001a\u00020\u0012HÂ\u0003J\t\u0010,\u001a\u00020\u0012HÂ\u0003J\u0017\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015HÂ\u0003JÁ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u00020\u0002H\u0016J\u0013\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u00020\u0012H\u0016J\t\u00106\u001a\u000207HÖ\u0001J\u0010\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0002H\u0016J\f\u0010:\u001a\u00020\f*\u00020;H\u0016R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u001c\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component5-gIe3tQ8", "()I", "component6", "component7", "component8", "component9", "copy", "copy-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "create", "equals", "other", "", "hashCode", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.ColorProducer color;
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> onPlaceholderLayout;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> onTextLayout;
    private final int overflow;
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders;
    private final androidx.compose.foundation.text.modifiers.SelectionController selectionController;
    private final boolean softWrap;
    private final androidx.compose.ui.text.TextStyle style;
    private final androidx.compose.ui.text.AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer);
    }

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.ui.text.AnnotatedString getText() {
        return this.text;
    }

    private final kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> component10() {
        return this.onPlaceholderLayout;
    }

    /* renamed from: component11, reason: from getter */
    private final androidx.compose.foundation.text.modifiers.SelectionController getSelectionController() {
        return this.selectionController;
    }

    /* renamed from: component12, reason: from getter */
    private final androidx.compose.ui.graphics.ColorProducer getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.ui.text.TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name and from getter */
    private final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* renamed from: component7, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMinLines() {
        return this.minLines;
    }

    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> component9() {
        return this.placeholders;
    }

    /* renamed from: copy-VhcvRP8, reason: not valid java name */
    public final androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement m989copyVhcvRP8(androidx.compose.ui.text.AnnotatedString text, androidx.compose.ui.text.TextStyle style, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> onPlaceholderLayout, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer color) {
        return new androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, onTextLayout, overflow, softWrap, maxLines, minLines, placeholders, onPlaceholderLayout, selectionController, color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public java.lang.String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((java.lang.Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((java.lang.Object) androidx.compose.ui.text.style.TextOverflow.m4404toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function12, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.color = colorProducer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode create() {
        return new androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode node) {
        node.m990updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement)) {
            return false;
        }
        androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.color, selectableTextAnnotatedStringElement.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, selectableTextAnnotatedStringElement.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.style, selectableTextAnnotatedStringElement.style) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextLayout, selectableTextAnnotatedStringElement.onTextLayout) && androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && kotlin.jvm.internal.Intrinsics.areEqual(this.onPlaceholderLayout, selectableTextAnnotatedStringElement.onPlaceholderLayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1 = this.onTextLayout;
        int hashCode2 = (((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + androidx.compose.ui.text.style.TextOverflow.m4403hashCodeimpl(this.overflow)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list = this.placeholders;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12 = this.onPlaceholderLayout;
        int hashCode4 = (hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        androidx.compose.foundation.text.modifiers.SelectionController selectionController = this.selectionController;
        int hashCode5 = (hashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.ColorProducer colorProducer = this.color;
        return hashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}
