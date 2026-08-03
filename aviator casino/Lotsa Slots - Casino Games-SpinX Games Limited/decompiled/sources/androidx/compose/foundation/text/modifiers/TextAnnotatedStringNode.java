package androidx.compose.foundation.text.modifiers;

/* compiled from: TextAnnotatedStringNode.kt */
@kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001eB\u00ad\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 J\b\u00105\u001a\u00020\u000eH\u0002J&\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0012J\u000e\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020=J\u0010\u0010'\u001a\u00020\"2\u0006\u0010>\u001a\u00020?H\u0002J\u001e\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0014J\u001e\u0010F\u001a\u00020\u00142\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020\u0014J(\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020Nø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010Q\u001a\u00020\u00142\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0014J\u001e\u0010R\u001a\u00020\u00142\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020\u0014J\u0010\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u0006H\u0002JD\u0010U\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u001c\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0018\u0010V\u001a\u00020\u00122\b\u0010W\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\bJV\u0010X\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u000e\u0010[\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\\\u001a\u00020\u000e*\u00020]H\u0016J\f\u0010^\u001a\u00020\u000e*\u00020=H\u0016J\u001c\u0010_\u001a\u00020\u0014*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0014H\u0016J\u001c\u0010`\u001a\u00020\u0014*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020\u0014H\u0016J&\u0010a\u001a\u00020I*\u00020K2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010PJ\u001c\u0010c\u001a\u00020\u0014*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0014H\u0016J\u001c\u0010d\u001a\u00020\u0014*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020\u0014H\u0016R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0014\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010*\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0+\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010,\u001a\u0004\u0018\u00010-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "baselineCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "layoutCache", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "I", "semanticsTextLayoutResult", "", "<set-?>", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "textSubstitution", "getTextSubstitution", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "textSubstitution$delegate", "Landroidx/compose/runtime/MutableState;", "clearSubstitution", "doInvalidations", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "drawNonExtension", "contentDrawScope", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "maxIntrinsicHeightNonExtension", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidthNonExtension", "height", "measureNonExtension", "Landroidx/compose/ui/layout/MeasureResult;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeightNonExtension", "minIntrinsicWidthNonExtension", "setSubstitution", "updatedText", "updateCallbacks", "updateDraw", "color", "updateLayoutRelatedArgs", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateText", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "measure-3p2s80s", "minIntrinsicHeight", "minIntrinsicWidth", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache _layoutCache;
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> baselineCache;
    private androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> onPlaceholderLayout;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> onTextLayout;
    private int overflow;
    private androidx.compose.ui.graphics.ColorProducer overrideColor;
    private java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders;
    private androidx.compose.foundation.text.modifiers.SelectionController selectionController;
    private kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private androidx.compose.ui.text.TextStyle style;
    private androidx.compose.ui.text.AnnotatedString text;

    /* renamed from: textSubstitution$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public /* synthetic */ TextAnnotatedStringNode(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function12, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, null);
    }

    private TextAnnotatedStringNode(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer) {
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
        this.overrideColor = colorProducer;
        this.textSubstitution = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        kotlin.jvm.internal.Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache getLayoutCache(androidx.compose.ui.unit.Density density) {
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache;
        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null && textSubstitution.isShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    public final boolean updateDraw(androidx.compose.ui.graphics.ColorProducer color, androidx.compose.ui.text.TextStyle style) {
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(color, this.overrideColor);
        this.overrideColor = color;
        return z || !style.hasSameDrawAffectingAttributes(this.style);
    }

    public final boolean updateText(androidx.compose.ui.text.AnnotatedString text) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.text, text)) {
            return false;
        }
        this.text = text;
        clearSubstitution();
        return true;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk, reason: not valid java name */
    public final boolean m996updateLayoutRelatedArgsMPT68mk(androidx.compose.ui.text.TextStyle style, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, int overflow) {
        boolean z = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z = true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z = true;
        }
        if (androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, overflow)) {
            return z;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean updateCallbacks(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> onTextLayout, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> onPlaceholderLayout, androidx.compose.foundation.text.modifiers.SelectionController selectionController) {
        boolean z;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.onTextLayout, onTextLayout)) {
            z = false;
        } else {
            this.onTextLayout = onTextLayout;
            z = true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.onPlaceholderLayout, onPlaceholderLayout)) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z = true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.selectionController, selectionController)) {
            return z;
        }
        this.selectionController = selectionController;
        return true;
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                getLayoutCache().m980updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
            }
            if (drawChanged) {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "original", "Landroidx/compose/ui/text/AnnotatedString;", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "getOriginal", "()Landroidx/compose/ui/text/AnnotatedString;", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache;
        private final androidx.compose.ui.text.AnnotatedString original;
        private androidx.compose.ui.text.AnnotatedString substitution;

        public static /* synthetic */ androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue copy$default(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.AnnotatedString annotatedString2, boolean z, androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getOriginal() {
            return this.original;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getSubstitution() {
            return this.substitution;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue copy(androidx.compose.ui.text.AnnotatedString original, androidx.compose.ui.text.AnnotatedString substitution, boolean isShowingSubstitution, androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache) {
            return new androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue(original, substitution, isShowingSubstitution, layoutCache);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue)) {
                return false;
            }
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = (androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.original, textSubstitutionValue.original) && kotlin.jvm.internal.Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && kotlin.jvm.internal.Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public int hashCode() {
            int hashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isShowingSubstitution)) * 31;
            androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return hashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public java.lang.String toString() {
            return "TextSubstitutionValue(original=" + ((java.lang.Object) this.original) + ", substitution=" + ((java.lang.Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.AnnotatedString annotatedString2, boolean z, androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.AnnotatedString annotatedString2, boolean z, androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : multiParagraphLayoutCache);
        }

        public final androidx.compose.ui.text.AnnotatedString getOriginal() {
            return this.original;
        }

        public final androidx.compose.ui.text.AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(androidx.compose.ui.text.AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue getTextSubstitution() {
        return (androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue) this.textSubstitution.getValue();
    }

    private final void setTextSubstitution(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution.setValue(textSubstitutionValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(androidx.compose.ui.text.AnnotatedString updatedText) {
        kotlin.Unit unit;
        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(updatedText, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.setSubstitution(updatedText);
            androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m980updateZNqEYIc(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            return unit != null;
        }
        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = new androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = new androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity());
        textSubstitutionValue.setLayoutCache(multiParagraphLayoutCache);
        setTextSubstitution(textSubstitutionValue);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        setTextSubstitution(null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                    androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult;
                    androidx.compose.ui.text.TextStyle textStyle;
                    androidx.compose.ui.graphics.ColorProducer colorProducer;
                    androidx.compose.ui.text.TextStyle m4009mergedA7vx0o;
                    layoutCache = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.getLayoutCache();
                    androidx.compose.ui.text.TextLayoutResult layoutCache2 = layoutCache.getLayoutCache();
                    if (layoutCache2 != null) {
                        androidx.compose.ui.text.AnnotatedString text = layoutCache2.getLayoutInput().getText();
                        textStyle = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.style;
                        colorProducer = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.overrideColor;
                        m4009mergedA7vx0o = textStyle.m4009mergedA7vx0o((r58 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.m2194invoke0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU(), (r58 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : 0L, (r58 & 4) != 0 ? null : null, (r58 & 8) != 0 ? null : null, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : null, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : 0L, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : null, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk() : 0, (r58 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : 0L, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                        textLayoutResult = androidx.compose.ui.text.TextLayoutResult.m3934copyO0kMr_c$default(layoutCache2, new androidx.compose.ui.text.TextLayoutInput(text, m4009mergedA7vx0o, layoutCache2.getLayoutInput().getPlaceholders(), layoutCache2.getLayoutInput().getMaxLines(), layoutCache2.getLayoutInput().getSoftWrap(), layoutCache2.getLayoutInput().getOverflow(), layoutCache2.getLayoutInput().getDensity(), layoutCache2.getLayoutInput().getLayoutDirection(), layoutCache2.getLayoutInput().getFontFamilyResolver(), layoutCache2.getLayoutInput().getConstraints(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0L, 2, null);
                        if (textLayoutResult != null) {
                            list.add(textLayoutResult);
                            return java.lang.Boolean.valueOf(textLayoutResult == null);
                        }
                    }
                    textLayoutResult = null;
                    return java.lang.Boolean.valueOf(textLayoutResult == null);
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitution.getSubstitution());
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitution.isShowingSubstitution());
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final java.lang.Boolean invoke(boolean z) {
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitution2;
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue textSubstitution3;
                textSubstitution2 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.getTextSubstitution();
                if (textSubstitution2 != null) {
                    textSubstitution3 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.getTextSubstitution();
                    if (textSubstitution3 != null) {
                        textSubstitution3.setShowingSubstitution(z);
                    }
                    androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                    androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                    androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                    return true;
                }
                return false;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this.clearSubstitution();
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this);
                return true;
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult m995measureNonExtension3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long constraints) {
        return mo91measure3p2s80s(measureScope, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m979layoutWithConstraintsK40F9xA = layoutCache.m979layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m979layoutWithConstraintsK40F9xA) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateLayer(this);
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            androidx.compose.foundation.text.modifiers.SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            this.baselineCache = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(textLayoutResult.getLastBaseline()))));
        }
        kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResult.getPlaceholderRects());
        }
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.foundation.text.modifiers.LayoutUtilsKt.fixedCoerceHeightAndWidthForBits(androidx.compose.ui.unit.Constraints.INSTANCE, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize())));
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize());
        int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize());
        java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map = this.baselineCache;
        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
        return measureScope.layout(m4652getWidthimpl, m4651getHeightimpl, map, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }
        });
    }

    public final int minIntrinsicWidthNonExtension(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable measurable, int height) {
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable measurable, int width) {
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable measurable, int height) {
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable measurable, int width) {
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final void drawNonExtension(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        if (getIsAttached()) {
            androidx.compose.foundation.text.modifiers.SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            androidx.compose.ui.graphics.Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            androidx.compose.ui.text.MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8());
            if (z) {
                androidx.compose.ui.geometry.Rect m1911Recttz77jQw = androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize())));
                canvas.save();
                androidx.compose.ui.graphics.Canvas.CC.m2087clipRectmtrdDE$default(canvas, m1911Recttz77jQw, 0, 2, null);
            }
            try {
                androidx.compose.ui.text.style.TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getNone();
                }
                androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration;
                androidx.compose.ui.graphics.Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = androidx.compose.ui.graphics.Shadow.INSTANCE.getNone();
                }
                androidx.compose.ui.graphics.Shadow shadow2 = shadow;
                androidx.compose.ui.graphics.drawscope.Fill drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
                }
                androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle;
                androidx.compose.ui.graphics.Brush brush = this.style.getBrush();
                if (brush != null) {
                    multiParagraph.m3845painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : this.style.getAlpha(), (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : 0);
                } else {
                    androidx.compose.ui.graphics.ColorProducer colorProducer = this.overrideColor;
                    long m2194invoke0d7_KjU = colorProducer != null ? colorProducer.m2194invoke0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
                    if (m2194invoke0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                        if (this.style.m3994getColor0d7_KjU() != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                            m2194invoke0d7_KjU = this.style.m3994getColor0d7_KjU();
                        } else {
                            m2194invoke0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU();
                        }
                    }
                    multiParagraph.m3843paintLG529CI(canvas, (r14 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : m2194invoke0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : 0);
                }
                java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list = this.placeholders;
                if (list == null || list.isEmpty()) {
                    return;
                }
                contentDrawScope.drawContent();
            } finally {
                if (z) {
                    canvas.restore();
                }
            }
        }
    }
}
