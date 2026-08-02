package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\r\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\u0012J7\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0015\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0015\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010 J@\u0010\u000f\u001a\u00020\u00172\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\"¢\u0006\u0002\b$H\u0002¢\u0006\u0004\b\u000f\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010 R/\u0010/\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00138G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\u0005R+\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\"¢\u0006\u0002\b$038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0017\u00109\u001a\b\u0012\u0004\u0012\u000206058G¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/foundation/text/LinkRange;", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Shape;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/AnnotatedString$Range;", "", "LinksComposables", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/SpanStyle;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/platform/UriHandler;", "(Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V", "applyAnnotators$foundation", "()Landroidx/compose/ui/text/AnnotatedString;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/TextAnnotatorScope;", "Lkotlin/ExtensionFunctionType;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "getInitialText$foundation", "<set-?>", "textLayoutResult$delegate", "Landroidx/compose/runtime/MutableState;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setTextLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "textLayoutResult", "text", "getText$foundation", "setText$foundation", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function0;", "", "getShouldMeasureLinks", "()Lkotlin/jvm/functions/Function0;", "shouldMeasureLinks"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLinkScope {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.AnnotatedString initialText;
    private androidx.compose.ui.text.AnnotatedString text;

    /* renamed from: textLayoutResult$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textLayoutResult = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateList<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.TextAnnotatorScope, kotlin.Unit>> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();

    public TextLinkScope(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.text = annotatedString.flatMapAnnotations(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoSizes((androidx.compose.ui.text.AnnotatedString.Range) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* renamed from: getInitialText$foundation, reason: from getter */
    public final androidx.compose.ui.text.AnnotatedString getInitialText() {
        return this.initialText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.text.TextLayoutResult getTextLayoutResult() {
        return (androidx.compose.ui.text.TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void setTextLayoutResult(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    /* renamed from: getText$foundation, reason: from getter */
    public final androidx.compose.ui.text.AnnotatedString getText() {
        return this.text;
    }

    public final void setText$foundation(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.text = annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoSizes(androidx.compose.ui.text.AnnotatedString.Range range) {
        java.util.ArrayList arrayListOf;
        boolean highSpeedVideoSizes;
        androidx.compose.ui.text.SpanStyle spanStyle;
        if (range.getItem() instanceof androidx.compose.ui.text.LinkAnnotation) {
            java.lang.Object item = range.getItem();
            kotlin.jvm.internal.Intrinsics.checkNotNull(item, "");
            highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScopeKt.getHighSpeedVideoSizes(((androidx.compose.ui.text.LinkAnnotation) item).getStyles());
            if (!highSpeedVideoSizes) {
                androidx.compose.ui.text.AnnotatedString.Range[] rangeArr = new androidx.compose.ui.text.AnnotatedString.Range[2];
                rangeArr[0] = range;
                java.lang.Object item2 = range.getItem();
                kotlin.jvm.internal.Intrinsics.checkNotNull(item2, "");
                androidx.compose.ui.text.TextLinkStyles styles = ((androidx.compose.ui.text.LinkAnnotation) item2).getStyles();
                if (styles == null || (spanStyle = styles.getStyle()) == null) {
                    spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65535, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                rangeArr[1] = new androidx.compose.ui.text.AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd());
                arrayListOf = kotlin.collections.CollectionsKt.arrayListOf(rangeArr);
                return arrayListOf;
            }
        }
        arrayListOf = kotlin.collections.CollectionsKt.arrayListOf(range);
        return arrayListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextLinkScope textLinkScope) {
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        androidx.compose.ui.text.AnnotatedString annotatedString = textLinkScope.text;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        return kotlin.jvm.internal.Intrinsics.areEqual(annotatedString, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText());
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getShouldMeasureLinks() {
        return new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextLinkScope.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextLinkScope.this);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        };
    }

    private final androidx.compose.ui.Modifier getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> range) {
        return modifier.then(new androidx.compose.foundation.text.TextRangeLayoutModifier(new androidx.compose.foundation.text.TextRangeScopeMeasurePolicy() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda3
            @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
            public final androidx.compose.foundation.text.TextRangeLayoutMeasureResult measure(androidx.compose.foundation.text.TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
                androidx.compose.foundation.text.TextRangeLayoutMeasureResult highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoSizes(androidx.compose.foundation.text.TextLinkScope.this, range, textRangeLayoutMeasureScope);
                return highSpeedVideoSizes;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.TextRangeLayoutMeasureResult getHighSpeedVideoSizes(androidx.compose.foundation.text.TextLinkScope textLinkScope, androidx.compose.ui.text.AnnotatedString.Range range, androidx.compose.foundation.text.TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        if (textLayoutResult == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.unit.IntOffset highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
        androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>) range, textLayoutResult);
        if (highSpeedVideoFpsRanges == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.unit.IntOffset highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextLinkScope.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
        final androidx.compose.ui.unit.IntRect roundToIntRect = androidx.compose.ui.unit.IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(highSpeedVideoFpsRanges.getStart(), highSpeedVideoFpsRanges.getEnd()).getBounds());
        return textRangeLayoutMeasureScope.layout(roundToIntRect.getWidth(), roundToIntRect.getHeight(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.unit.IntOffset highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoSizes(androidx.compose.ui.unit.IntRect.this);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.IntOffset getHighSpeedVideoFpsRangesFor() {
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.IntOffset getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.IntOffset getHighSpeedVideoSizes(androidx.compose.ui.unit.IntRect intRect) {
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(intRect.m8758getTopLeftnOccac());
    }

    private final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> range) {
        return androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoSizes(androidx.compose.foundation.text.TextLinkScope.this, range, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.TextLinkScope textLinkScope, androidx.compose.ui.text.AnnotatedString.Range range, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        androidx.compose.ui.graphics.Shape Camera2StreamConfigurationMap = textLinkScope.Camera2StreamConfigurationMap(range);
        if (Camera2StreamConfigurationMap != null) {
            graphicsLayerScope.setShape(Camera2StreamConfigurationMap);
            graphicsLayerScope.setClip(true);
        }
        return kotlin.Unit.INSTANCE;
    }

    private final androidx.compose.ui.graphics.Shape Camera2StreamConfigurationMap(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> p0) {
        final androidx.compose.ui.graphics.Path highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0);
        return highResolutionOutputSizeshNQ4ISI != null ? new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI */
            public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
                return new androidx.compose.ui.graphics.Outline.Generic(androidx.compose.ui.graphics.Path.this);
            }
        } : null;
    }

    private final androidx.compose.ui.graphics.Path getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> p0) {
        androidx.compose.ui.graphics.Path path = null;
        if (!getShouldMeasureLinks().invoke().booleanValue()) {
            return null;
        }
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = getTextLayoutResult();
        if (textLayoutResult != null) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0, textLayoutResult);
            if (highSpeedVideoFpsRanges == null) {
                return null;
            }
            path = textLayoutResult.getPathForRange(highSpeedVideoFpsRanges.getStart(), highSpeedVideoFpsRanges.getEnd());
            float min = textLayoutResult.getLineForOffset(highSpeedVideoFpsRanges.getStart()) == textLayoutResult.getLineForOffset(highSpeedVideoFpsRanges.getEnd() + (-1)) ? java.lang.Math.min(textLayoutResult.getBoundingBox(highSpeedVideoFpsRanges.getEnd() - 1).getLeft(), textLayoutResult.getBoundingBox(highSpeedVideoFpsRanges.getStart()).getLeft()) : 0.0f;
            path.mo5889translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(min) << 32) | (java.lang.Float.floatToRawIntBits(r2.getTop()) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return path;
    }

    private static androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> getHighSpeedVideoFpsRanges(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> p0, androidx.compose.ui.text.TextLayoutResult p1) {
        int lineEnd$default = androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(p1, p1.getLineCount() - 1, false, 2, null);
        if (p0.getStart() < lineEnd$default) {
            return androidx.compose.ui.text.AnnotatedString.Range.copy$default(p0, null, 0, java.lang.Math.min(p0.getEnd(), lineEnd$default), null, 11, null);
        }
        return null;
    }

    public final void LinksComposables(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier m1325combinedClickableauXiCPI;
        boolean highSpeedVideoSizes;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1154651354);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
            androidx.compose.ui.text.AnnotatedString annotatedString = this.text;
            java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i5 = 0;
            while (i5 < size) {
                final androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> range = linkAnnotations.get(i5);
                if (range.getStart() == range.getEnd()) {
                    startRestartGroup.startReplaceGroup(716130110);
                } else {
                    startRestartGroup.startReplaceGroup(725478935);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                    androidx.compose.ui.Modifier highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.INSTANCE, range);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier pointerHoverIcon$default = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.HoverableKt.hoverable$default(getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(highResolutionOutputSizeshNQ4ISI, false, (kotlin.jvm.functions.Function1) rememberedValue2, i4, null), range), mutableInteractionSource, false, i3, null), androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getHand(), false, i3, null);
                    boolean changedInstance = startRestartGroup.changedInstance(this);
                    boolean changed = startRestartGroup.changed(range);
                    boolean changedInstance2 = startRestartGroup.changedInstance(uriHandler);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance | changed | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                androidx.compose.foundation.text.TextLinkScope textLinkScope = androidx.compose.foundation.text.TextLinkScope.this;
                                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoFpsRangesFor(range, uriHandler);
                                return highSpeedVideoFpsRangesFor;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    m1325combinedClickableauXiCPI = androidx.compose.foundation.ClickableKt.m1325combinedClickableauXiCPI(pointerHoverIcon$default, mutableInteractionSource, null, (r25 & 4) != 0, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : null, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, (kotlin.jvm.functions.Function0) rememberedValue3);
                    androidx.compose.foundation.layout.BoxKt.Box(m1325combinedClickableauXiCPI, startRestartGroup, 0);
                    highSpeedVideoSizes = androidx.compose.foundation.text.TextLinkScopeKt.getHighSpeedVideoSizes(range.getItem().getStyles());
                    if (highSpeedVideoSizes) {
                        startRestartGroup.startReplaceGroup(716130110);
                    } else {
                        startRestartGroup.startReplaceGroup(726303039);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new androidx.compose.foundation.text.LinkStateInteractionSourceObserver(mutableInteractionSource);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        final androidx.compose.foundation.text.LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (androidx.compose.foundation.text.LinkStateInteractionSourceObserver) rememberedValue4;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1(linkStateInteractionSourceObserver, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                        boolean isHovered = linkStateInteractionSourceObserver.isHovered();
                        boolean isFocused = linkStateInteractionSourceObserver.isFocused();
                        boolean isPressed = linkStateInteractionSourceObserver.isPressed();
                        androidx.compose.ui.text.TextLinkStyles styles = range.getItem().getStyles();
                        androidx.compose.ui.text.SpanStyle style = styles != null ? styles.getStyle() : null;
                        androidx.compose.ui.text.TextLinkStyles styles2 = range.getItem().getStyles();
                        androidx.compose.ui.text.SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        androidx.compose.ui.text.TextLinkStyles styles3 = range.getItem().getStyles();
                        androidx.compose.ui.text.SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        androidx.compose.ui.text.TextLinkStyles styles4 = range.getItem().getStyles();
                        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(isHovered), java.lang.Boolean.valueOf(isFocused), java.lang.Boolean.valueOf(isPressed), style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean changedInstance3 = startRestartGroup.changedInstance(this);
                        boolean changed2 = startRestartGroup.changed(range);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if ((changedInstance3 | changed2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit Camera2StreamConfigurationMap;
                                    androidx.compose.foundation.text.TextLinkScope textLinkScope = androidx.compose.foundation.text.TextLinkScope.this;
                                    Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextLinkScope.Camera2StreamConfigurationMap(range, linkStateInteractionSourceObserver, (androidx.compose.foundation.text.TextAnnotatorScope) obj);
                                    return Camera2StreamConfigurationMap;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        Camera2StreamConfigurationMap(objArr, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, (i2 << 6) & 896);
                    }
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
                i5++;
                i3 = 2;
                i4 = 1;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI2;
                    ((java.lang.Integer) obj2).intValue();
                    highResolutionOutputSizeshNQ4ISI2 = androidx.compose.foundation.text.TextLinkScope.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextLinkScope.this, i, (androidx.compose.runtime.Composer) obj);
                    return highResolutionOutputSizeshNQ4ISI2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLinkTestMarker(), kotlin.Unit.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.AnnotatedString.Range range, androidx.compose.ui.platform.UriHandler uriHandler) {
        getHighSpeedVideoFpsRanges((androidx.compose.ui.text.LinkAnnotation) range.getItem(), uriHandler);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.text.AnnotatedString.Range range, androidx.compose.foundation.text.LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, androidx.compose.foundation.text.TextAnnotatorScope textAnnotatorScope) {
        androidx.compose.ui.text.TextLinkStyles styles;
        androidx.compose.ui.text.TextLinkStyles styles2;
        androidx.compose.ui.text.TextLinkStyles styles3;
        androidx.compose.ui.text.TextLinkStyles styles4 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles();
        androidx.compose.ui.text.SpanStyle spanStyle = null;
        androidx.compose.ui.text.SpanStyle highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(styles4 != null ? styles4.getStyle() : null, (!linkStateInteractionSourceObserver.isFocused() || (styles3 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles3.getFocusedStyle()), (!linkStateInteractionSourceObserver.isHovered() || (styles2 = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles2.getHoveredStyle());
        if (linkStateInteractionSourceObserver.isPressed() && (styles = ((androidx.compose.ui.text.LinkAnnotation) range.getItem()).getStyles()) != null) {
            spanStyle = styles.getPressedStyle();
        }
        textAnnotatorScope.getHighSpeedVideoSizes(range, getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, spanStyle));
        return kotlin.Unit.INSTANCE;
    }

    private static androidx.compose.ui.text.SpanStyle getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.SpanStyle spanStyle2) {
        androidx.compose.ui.text.SpanStyle merge;
        return (spanStyle == null || (merge = spanStyle.merge(spanStyle2)) == null) ? spanStyle2 : merge;
    }

    private static void getHighSpeedVideoFpsRanges(androidx.compose.ui.text.LinkAnnotation p0, androidx.compose.ui.platform.UriHandler p1) {
        androidx.compose.ui.text.LinkInteractionListener linkInteractionListener;
        if (p0 instanceof androidx.compose.ui.text.LinkAnnotation.Url) {
            androidx.compose.ui.text.LinkInteractionListener linkInteractionListener2 = ((androidx.compose.ui.text.LinkAnnotation.Url) p0).getLinkInteractionListener();
            if (linkInteractionListener2 != null) {
                linkInteractionListener2.onClick(p0);
                return;
            } else {
                try {
                    p1.openUri(((androidx.compose.ui.text.LinkAnnotation.Url) p0).getUrl());
                    return;
                } catch (java.lang.IllegalArgumentException unused) {
                    return;
                }
            }
        }
        if (!(p0 instanceof androidx.compose.ui.text.LinkAnnotation.Clickable) || (linkInteractionListener = ((androidx.compose.ui.text.LinkAnnotation.Clickable) p0).getLinkInteractionListener()) == null) {
            return;
        }
        linkInteractionListener.onClick(p0);
    }

    public final androidx.compose.ui.text.AnnotatedString applyAnnotators$foundation() {
        androidx.compose.ui.text.AnnotatedString getHighSpeedVideoFpsRangesFor;
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            getHighSpeedVideoFpsRangesFor = this.text;
        } else {
            androidx.compose.foundation.text.TextAnnotatorScope textAnnotatorScope = new androidx.compose.foundation.text.TextAnnotatorScope(this.text);
            androidx.compose.runtime.snapshots.SnapshotStateList<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.TextAnnotatorScope, kotlin.Unit>> snapshotStateList = this.getHighSpeedVideoSizes;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.get(i).invoke(textAnnotatorScope);
            }
            getHighSpeedVideoFpsRangesFor = textAnnotatorScope.getGetHighSpeedVideoFpsRangesFor();
        }
        this.text = getHighSpeedVideoFpsRangesFor;
        return getHighSpeedVideoFpsRangesFor;
    }

    private final void Camera2StreamConfigurationMap(final java.lang.Object[] objArr, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.TextAnnotatorScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2083052099);
        int i2 = (i & 48) == 0 ? (startRestartGroup.changedInstance(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        startRestartGroup.startMovableGroup(-358306546, java.lang.Integer.valueOf(objArr.length));
        int i3 = i2 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
        for (java.lang.Object obj : objArr) {
            i3 |= startRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.add(function1);
            spreadBuilder.addSpread(objArr);
            java.lang.Object[] array = spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]);
            boolean changedInstance = startRestartGroup.changedInstance(this);
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.TextLinkScope.this, function1);
                        return highSpeedVideoFpsRangesFor;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(array, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj3).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLinkScope.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.TextLinkScope.this, objArr, function1, i, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.text.TextLinkScope textLinkScope, final kotlin.jvm.functions.Function1 function1) {
        textLinkScope.getHighSpeedVideoSizes.add(function1);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
                snapshotStateList = androidx.compose.foundation.text.TextLinkScope.this.getHighSpeedVideoSizes;
                snapshotStateList.remove(function1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.TextLinkScope textLinkScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer) {
        textLinkScope.Camera2StreamConfigurationMap(objArr, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextLinkScope textLinkScope, int i, androidx.compose.runtime.Composer composer) {
        textLinkScope.LinksComposables(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
