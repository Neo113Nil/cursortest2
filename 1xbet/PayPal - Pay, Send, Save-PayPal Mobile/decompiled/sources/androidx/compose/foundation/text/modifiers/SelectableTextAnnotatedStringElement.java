package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u000b*\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010B\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010<R\"\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010CR*\u0010;\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010DR\u0016\u00103\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010F"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "node", "update", "(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getOutputSizes", "Landroidx/compose/ui/text/AnnotatedString;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputStallDuration", "Landroidx/compose/ui/text/TextStyle;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getOutputStallDurationlomOqCM", "Z", "getOutputFormats", "getInputSizeshNQ4ISI", "getInputFormats", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/foundation/text/TextAutoSize;", "getOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.ColorProducer getOutputStallDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.TextAutoSize getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.FontFamily.Resolver getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.modifiers.SelectionController getOutputStallDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.text.AnnotatedString getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.compose.ui.text.TextStyle getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.foundation.text.TextAutoSize textAutoSize) {
        this.getHighResolutionOutputSizeshNQ4ISI = annotatedString;
        this.getHighSpeedVideoFpsRanges = textStyle;
        this.getHighSpeedVideoSizes = resolver;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getOutputFormats = z;
        this.getInputSizeshNQ4ISI = i2;
        this.getInputFormats = i3;
        this.getOutputMinFrameDuration = list;
        this.getHighSpeedVideoSizesFor = function12;
        this.getOutputStallDurationlomOqCM = selectionController;
        this.getOutputStallDuration = colorProducer;
        this.getOutputSizeshNQ4ISI = textAutoSize;
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.foundation.text.TextAutoSize textAutoSize, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function12, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, (i4 & 4096) != 0 ? null : textAutoSize, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getOutputStallDurationlomOqCM, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI, null, 8192, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode node) {
        node.m2359update7NebLg4(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputStallDurationlomOqCM, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement)) {
            return false;
        }
        androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputStallDuration, selectableTextAnnotatedStringElement.getOutputStallDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, selectableTextAnnotatedStringElement.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, selectableTextAnnotatedStringElement.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, selectableTextAnnotatedStringElement.getOutputMinFrameDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, selectableTextAnnotatedStringElement.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputSizeshNQ4ISI, selectableTextAnnotatedStringElement.getOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == selectableTextAnnotatedStringElement.Camera2StreamConfigurationMap && androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(this.getHighSpeedVideoFpsRangesFor, selectableTextAnnotatedStringElement.getHighSpeedVideoFpsRangesFor) && this.getOutputFormats == selectableTextAnnotatedStringElement.getOutputFormats && this.getInputSizeshNQ4ISI == selectableTextAnnotatedStringElement.getInputSizeshNQ4ISI && this.getInputFormats == selectableTextAnnotatedStringElement.getInputFormats && this.getHighSpeedVideoSizesFor == selectableTextAnnotatedStringElement.getHighSpeedVideoSizesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputStallDurationlomOqCM, selectableTextAnnotatedStringElement.getOutputStallDurationlomOqCM);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode3 = this.getHighSpeedVideoSizes.hashCode();
        kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        int hashCode4 = function1 != null ? function1.hashCode() : 0;
        int m8492hashCodeimpl = androidx.compose.ui.text.style.TextOverflow.m8492hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        int hashCode5 = java.lang.Boolean.hashCode(this.getOutputFormats);
        int i = this.getInputSizeshNQ4ISI;
        int i2 = this.getInputFormats;
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list = this.getOutputMinFrameDuration;
        int hashCode6 = list != null ? list.hashCode() : 0;
        kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12 = this.getHighSpeedVideoSizesFor;
        int hashCode7 = function12 != null ? function12.hashCode() : 0;
        androidx.compose.foundation.text.modifiers.SelectionController selectionController = this.getOutputStallDurationlomOqCM;
        int hashCode8 = selectionController != null ? selectionController.hashCode() : 0;
        androidx.compose.foundation.text.TextAutoSize textAutoSize = this.getOutputSizeshNQ4ISI;
        int hashCode9 = textAutoSize != null ? textAutoSize.hashCode() : 0;
        androidx.compose.ui.graphics.ColorProducer colorProducer = this.getOutputStallDuration;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m8492hashCodeimpl) * 31) + hashCode5) * 31) + i) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.List list, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.foundation.text.TextAutoSize textAutoSize, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, textAutoSize);
    }
}
