package androidx.compose.foundation.text;

/* compiled from: BasicText.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010 \u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010!\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u001a¬\u0001\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m856BasicTextVhcvRP8(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i8;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.foundation.text.modifiers.SelectionController selectionController;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        int m4409getClipgIe3tQ8;
        boolean z2;
        int i15;
        int i16;
        androidx.compose.ui.graphics.ColorProducer colorProducer2;
        final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar;
        int i17;
        int i18;
        androidx.compose.ui.Modifier m857textModifierRWo7tUw;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        final androidx.compose.ui.graphics.ColorProducer colorProducer3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.text.TextStyle textStyle4;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function14;
        final int i19;
        final boolean z3;
        final int i20;
        final int i21;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1186827822);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)95@4654L7,144@6466L41:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (191739611 & i6) != 38347922 || !startRestartGroup.getSkipping()) {
                            companion = i22 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            textStyle3 = i7 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle2;
                            selectionController = null;
                            function13 = i8 != 0 ? null : function12;
                            m4409getClipgIe3tQ8 = i9 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i10;
                            z2 = i11 != 0 ? true : z;
                            i15 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            i16 = i13 != 0 ? 1 : i3;
                            colorProducer2 = i14 != 0 ? null : colorProducer;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:90)");
                            }
                            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localSelectionRegistrar);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959238528);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                            if (selectionRegistrar != null) {
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume2).getBackgroundColor();
                                long longValue = ((java.lang.Number) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[]{selectionRegistrar}, (androidx.compose.runtime.saveable.Saver) selectionIdSaver(selectionRegistrar), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Long invoke() {
                                        return java.lang.Long.valueOf(androidx.compose.foundation.text.selection.SelectionRegistrar.this.nextSelectableId());
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
                                androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(backgroundColor);
                                startRestartGroup.startReplaceableGroup(1618982084);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m2103boximpl);
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.foundation.text.modifiers.SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (androidx.compose.foundation.text.modifiers.SelectionController) rememberedValue;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (selectionController == null || function13 != null) {
                                i17 = i15;
                                i18 = 0;
                                startRestartGroup.startReplaceableGroup(959239198);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                                androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function13, m4409getClipgIe3tQ8, z2, i17, i16, (androidx.compose.ui.text.font.FontFamily.Resolver) consume3, null, null, selectionController, colorProducer2);
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(959239868);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "136@6279L7");
                                androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = startRestartGroup.consume(localFontFamilyResolver2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i18 = 0;
                                i17 = i15;
                                m857textModifierRWo7tUw = m2275graphicsLayerAp8cVGQ$default2.then(new androidx.compose.foundation.text.modifiers.TextStringSimpleElement(str, textStyle3, (androidx.compose.ui.text.font.FontFamily.Resolver) consume4, m4409getClipgIe3tQ8, z2, i17, i16, colorProducer2, null));
                                startRestartGroup.endReplaceableGroup();
                            }
                            androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
                            startRestartGroup.startReplaceableGroup(544976794);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i18);
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m857textModifierRWo7tUw);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            startRestartGroup.startReplaceableGroup(1405779621);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(new kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-VhcvRP8$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final androidx.compose.ui.node.ComposeUiNode invoke() {
                                        return kotlin.jvm.functions.Function0.this.invoke();
                                    }
                                });
                            } else {
                                startRestartGroup.useNode();
                            }
                            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            colorProducer3 = colorProducer2;
                            modifier2 = companion;
                            textStyle4 = textStyle3;
                            function14 = function13;
                            i19 = m4409getClipgIe3tQ8;
                            z3 = z2;
                            i20 = i17;
                            i21 = i16;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z;
                            i20 = i2;
                            colorProducer3 = colorProducer;
                            textStyle4 = textStyle2;
                            function14 = function12;
                            i19 = i10;
                            i21 = i3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i23) {
                                    androidx.compose.foundation.text.BasicTextKt.m856BasicTextVhcvRP8(str, modifier2, textStyle4, function14, i19, z3, i20, i21, colorProducer3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i22 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    selectionController = null;
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar2 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959238528);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (selectionController == null) {
                    }
                    i17 = i15;
                    i18 = 0;
                    startRestartGroup.startReplaceableGroup(959239198);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                    androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default3 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                    androidx.compose.ui.text.AnnotatedString annotatedString2 = new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume32 = startRestartGroup.consume(localFontFamilyResolver3);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default3, annotatedString2, textStyle3, function13, m4409getClipgIe3tQ8, z2, i17, i16, (androidx.compose.ui.text.font.FontFamily.Resolver) consume32, null, null, selectionController, colorProducer2);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy2 = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
                    startRestartGroup.startReplaceableGroup(544976794);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i18);
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m857textModifierRWo7tUw);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    final kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    startRestartGroup.startReplaceableGroup(1405779621);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    colorProducer3 = colorProducer2;
                    modifier2 = companion;
                    textStyle4 = textStyle3;
                    function14 = function13;
                    i19 = m4409getClipgIe3tQ8;
                    z3 = z2;
                    i20 = i17;
                    i21 = i16;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i22 != 0) {
                }
                if (i7 != 0) {
                }
                selectionController = null;
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar22 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959238528);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (selectionController == null) {
                }
                i17 = i15;
                i18 = 0;
                startRestartGroup.startReplaceableGroup(959239198);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default32 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                androidx.compose.ui.text.AnnotatedString annotatedString22 = new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume322 = startRestartGroup.consume(localFontFamilyResolver32);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default32, annotatedString22, textStyle3, function13, m4409getClipgIe3tQ8, z2, i17, i16, (androidx.compose.ui.text.font.FontFamily.Resolver) consume322, null, null, selectionController, colorProducer2);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy22 = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
                startRestartGroup.startReplaceableGroup(544976794);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i18);
                androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m857textModifierRWo7tUw);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                final kotlin.jvm.functions.Function0 constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                startRestartGroup.startReplaceableGroup(1405779621);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                colorProducer3 = colorProducer2;
                modifier2 = companion;
                textStyle4 = textStyle3;
                function14 = function13;
                i19 = m4409getClipgIe3tQ8;
                z3 = z2;
                i20 = i17;
                i21 = i16;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i22 != 0) {
            }
            if (i7 != 0) {
            }
            selectionController = null;
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar222 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959238528);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (selectionController == null) {
            }
            i17 = i15;
            i18 = 0;
            startRestartGroup.startReplaceableGroup(959239198);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
            androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default322 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            androidx.compose.ui.text.AnnotatedString annotatedString222 = new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3222 = startRestartGroup.consume(localFontFamilyResolver322);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default322, annotatedString222, textStyle3, function13, m4409getClipgIe3tQ8, z2, i17, i16, (androidx.compose.ui.text.font.FontFamily.Resolver) consume3222, null, null, selectionController, colorProducer2);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy222 = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
            startRestartGroup.startReplaceableGroup(544976794);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i18);
            androidx.compose.ui.Modifier materializeModifier222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m857textModifierRWo7tUw);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            final kotlin.jvm.functions.Function0 constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            colorProducer3 = colorProducer2;
            modifier2 = companion;
            textStyle4 = textStyle3;
            function14 = function13;
            i19 = m4409getClipgIe3tQ8;
            z3 = z2;
            i20 = i17;
            i21 = i16;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i22 != 0) {
        }
        if (i7 != 0) {
        }
        selectionController = null;
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar2222 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959238528);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (selectionController == null) {
        }
        i17 = i15;
        i18 = 0;
        startRestartGroup.startReplaceableGroup(959239198);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
        androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default3222 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
        androidx.compose.ui.text.AnnotatedString annotatedString2222 = new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32222 = startRestartGroup.consume(localFontFamilyResolver3222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default3222, annotatedString2222, textStyle3, function13, m4409getClipgIe3tQ8, z2, i17, i16, (androidx.compose.ui.text.font.FontFamily.Resolver) consume32222, null, null, selectionController, colorProducer2);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy2222 = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
        startRestartGroup.startReplaceableGroup(544976794);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i18);
        androidx.compose.ui.Modifier materializeModifier2222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m857textModifierRWo7tUw);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        final kotlin.jvm.functions.Function0 constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        colorProducer3 = colorProducer2;
        modifier2 = companion;
        textStyle4 = textStyle3;
        function14 = function13;
        i19 = m4409getClipgIe3tQ8;
        z3 = z2;
        i20 = i17;
        i21 = i16;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037c  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m854BasicTextRWo7tUw(final androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar;
        androidx.compose.foundation.text.modifiers.SelectionController selectionController;
        int i16;
        int i17;
        androidx.compose.runtime.Composer composer2;
        java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map2;
        final androidx.compose.ui.graphics.ColorProducer colorProducer2;
        final java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.text.TextStyle textStyle2;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12;
        final int i18;
        final boolean z2;
        final int i19;
        final int i20;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1064305212);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)189@8865L7:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i6 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i6 |= 268435456;
                        }
                        if ((i5 & 768) == 768 || (1533916891 & i6) != 306783378 || !startRestartGroup.getSkipping()) {
                            androidx.compose.ui.Modifier modifier3 = i21 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.ui.text.TextStyle textStyle3 = i7 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                            kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13 = i8 != 0 ? null : function1;
                            int m4409getClipgIe3tQ8 = i9 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i10;
                            boolean z3 = i11 != 0 ? true : z;
                            int i22 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i23 = i13 != 0 ? 1 : i3;
                            java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> emptyMap = i14 != 0 ? kotlin.collections.MapsKt.emptyMap() : map;
                            androidx.compose.ui.graphics.ColorProducer colorProducer3 = i15 != 0 ? null : colorProducer;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:184)");
                            }
                            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localSelectionRegistrar);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959242739);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                            if (selectionRegistrar != null) {
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume2).getBackgroundColor();
                                long longValue = ((java.lang.Number) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[]{selectionRegistrar}, (androidx.compose.runtime.saveable.Saver) selectionIdSaver(selectionRegistrar), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Long invoke() {
                                        return java.lang.Long.valueOf(androidx.compose.foundation.text.selection.SelectionRegistrar.this.nextSelectableId());
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
                                androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(backgroundColor);
                                startRestartGroup.startReplaceableGroup(1618982084);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m2103boximpl);
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.foundation.text.modifiers.SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (androidx.compose.foundation.text.modifiers.SelectionController) rememberedValue;
                            } else {
                                selectionController = null;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (!androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                                startRestartGroup.startReplaceableGroup(959243362);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "220@10119L7,208@9605L768");
                                androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map4 = emptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = startRestartGroup;
                                androidx.compose.ui.Modifier m857textModifierRWo7tUw = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function13, m4409getClipgIe3tQ8, z3, i22, i23, (androidx.compose.ui.text.font.FontFamily.Resolver) consume3, null, null, selectionController, colorProducer3);
                                androidx.compose.foundation.text.EmptyMeasurePolicy emptyMeasurePolicy = androidx.compose.foundation.text.EmptyMeasurePolicy.INSTANCE;
                                composer2.startReplaceableGroup(544976794);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m857textModifierRWo7tUw);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                composer2.startReplaceableGroup(1405779621);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(new kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-RWo7tUw$$inlined$Layout$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final androidx.compose.ui.node.ComposeUiNode invoke() {
                                            return kotlin.jvm.functions.Function0.this.invoke();
                                        }
                                    });
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                map2 = map4;
                            } else {
                                java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map5 = emptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = startRestartGroup;
                                composer2.startReplaceableGroup(959244221);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "233@10597L81,249@11260L7,236@10687L908");
                                kotlin.Pair<java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>>> resolveInlineContent = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, map5);
                                java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> component1 = resolveInlineContent.component1();
                                java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>> component2 = resolveInlineContent.component2();
                                composer2.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                                androidx.compose.ui.Modifier m2275graphicsLayerAp8cVGQ$default2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer2.consume(localFontFamilyResolver2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) consume4;
                                composer2.startReplaceableGroup(572128197);
                                boolean changed2 = composer2.changed(mutableState);
                                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.geometry.Rect>, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.geometry.Rect> list) {
                                            invoke2((java.util.List<androidx.compose.ui.geometry.Rect>) list);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(java.util.List<androidx.compose.ui.geometry.Rect> list) {
                                            mutableState.setValue(list);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                int i24 = i6;
                                map2 = map5;
                                androidx.compose.ui.Modifier m857textModifierRWo7tUw2 = m857textModifierRWo7tUw(m2275graphicsLayerAp8cVGQ$default2, annotatedString, textStyle3, function13, m4409getClipgIe3tQ8, z3, i17, i16, resolver, component1, (kotlin.jvm.functions.Function1) rememberedValue3, selectionController, colorProducer3);
                                composer2.startReplaceableGroup(572128392);
                                boolean changed3 = composer2.changed(mutableState);
                                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                                if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.List<? extends androidx.compose.ui.geometry.Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.util.List<? extends androidx.compose.ui.geometry.Rect> invoke() {
                                            return mutableState.getValue();
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                androidx.compose.foundation.text.TextMeasurePolicy textMeasurePolicy = new androidx.compose.foundation.text.TextMeasurePolicy((kotlin.jvm.functions.Function0) rememberedValue4);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m857textModifierRWo7tUw2);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, textMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 1350732076, "C237@10719L63:BasicText.kt#423gt5");
                                androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, component2, composer2, (i24 & 14) | 64);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            colorProducer2 = colorProducer3;
                            map3 = map2;
                            modifier2 = modifier3;
                            textStyle2 = textStyle3;
                            function12 = function13;
                            i18 = m4409getClipgIe3tQ8;
                            z2 = z3;
                            i19 = i16;
                            i20 = i17;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            function12 = function1;
                            z2 = z;
                            i20 = i2;
                            i19 = i3;
                            map3 = map;
                            i18 = i10;
                            composer2 = startRestartGroup;
                            colorProducer2 = colorProducer;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    invoke(composer3, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i25) {
                                    androidx.compose.foundation.text.BasicTextKt.m854BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString.this, modifier2, textStyle2, function12, i18, z2, i20, i19, map3, colorProducer2, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    if ((i5 & 768) == 768) {
                    }
                    if (i21 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar2 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959242739);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    colorProducer2 = colorProducer3;
                    map3 = map2;
                    modifier2 = modifier3;
                    textStyle2 = textStyle3;
                    function12 = function13;
                    i18 = m4409getClipgIe3tQ8;
                    z2 = z3;
                    i19 = i16;
                    i20 = i17;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                if ((i5 & 768) == 768) {
                }
                if (i21 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar22 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959242739);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                colorProducer2 = colorProducer3;
                map3 = map2;
                modifier2 = modifier3;
                textStyle2 = textStyle3;
                function12 = function13;
                i18 = m4409getClipgIe3tQ8;
                z2 = z3;
                i19 = i16;
                i20 = i17;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            if ((i5 & 768) == 768) {
            }
            if (i21 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar222 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959242739);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            colorProducer2 = colorProducer3;
            map3 = map2;
            modifier2 = modifier3;
            textStyle2 = textStyle3;
            function12 = function13;
            i18 = m4409getClipgIe3tQ8;
            z2 = z3;
            i19 = i16;
            i20 = i17;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        if ((i5 & 768) == 768) {
        }
        if (i21 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> localSelectionRegistrar2222 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (androidx.compose.foundation.text.selection.SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959242739);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        colorProducer2 = colorProducer3;
        map3 = map2;
        modifier2 = modifier3;
        textStyle2 = textStyle3;
        function12 = function13;
        i18 = m4409getClipgIe3tQ8;
        z2 = z3;
        i19 = i16;
        i20 = i17;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0051  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m853BasicTextBpD7jsM(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i7;
        kotlin.jvm.functions.Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final int i13;
        final boolean z3;
        final int i14;
        final kotlin.jvm.functions.Function1 function13;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1022429478);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)271@11987L234:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            i12 = i2;
                        } else {
                            i12 = i2;
                            if ((i3 & 3670016) == 0) {
                                i5 |= startRestartGroup.changed(i12) ? 1048576 : 524288;
                            }
                        }
                        if ((i5 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            androidx.compose.ui.Modifier.Companion companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i6 != 0) {
                                textStyle2 = androidx.compose.ui.text.TextStyle.INSTANCE.getDefault();
                            }
                            kotlin.jvm.functions.Function1 function14 = i7 != 0 ? null : function12;
                            int m4409getClipgIe3tQ8 = i8 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:270)");
                            }
                            m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function14, m4409getClipgIe3tQ8, z4, i16, 1, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            i13 = i16;
                            z3 = z4;
                            i14 = m4409getClipgIe3tQ8;
                            function13 = function14;
                            modifier3 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            i13 = i12;
                            i14 = i9;
                            z3 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i17) {
                                    androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(str, modifier3, textStyle3, function13, i14, z3, i13, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 2995931) == 599186) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function14, m4409getClipgIe3tQ8, z4, i16, 1, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    i13 = i16;
                    z3 = z4;
                    i14 = m4409getClipgIe3tQ8;
                    function13 = function14;
                    modifier3 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 2995931) == 599186) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function14, m4409getClipgIe3tQ8, z4, i16, 1, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                i13 = i16;
                z3 = z4;
                i14 = m4409getClipgIe3tQ8;
                function13 = function14;
                modifier3 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 2995931) == 599186) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function14, m4409getClipgIe3tQ8, z4, i16, 1, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            i13 = i16;
            z3 = z4;
            i14 = m4409getClipgIe3tQ8;
            function13 = function14;
            modifier3 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 2995931) == 599186) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function14, m4409getClipgIe3tQ8, z4, i16, 1, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        i13 = i16;
        z3 = z4;
        i14 = m4409getClipgIe3tQ8;
        function13 = function14;
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0053  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m851BasicText4YKlhWE(final androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, java.util.Map map, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i7;
        kotlin.jvm.functions.Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final java.util.Map map2;
        final int i13;
        final boolean z3;
        final kotlin.jvm.functions.Function1 function13;
        final int i14;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-648605928);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)295@12678L273:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                            i5 |= 4194304;
                        }
                        if (i12 == 128 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                textStyle2 = androidx.compose.ui.text.TextStyle.INSTANCE.getDefault();
                            }
                            kotlin.jvm.functions.Function1 function14 = i7 != 0 ? null : function12;
                            int m4409getClipgIe3tQ8 = i8 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i2;
                            java.util.Map emptyMap = i12 != 0 ? kotlin.collections.MapsKt.emptyMap() : map;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:294)");
                            }
                            m854BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m4409getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            map2 = emptyMap;
                            i13 = i16;
                            z3 = z4;
                            function13 = function14;
                            androidx.compose.ui.Modifier modifier4 = modifier2;
                            i14 = m4409getClipgIe3tQ8;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i2;
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i14 = i9;
                            map2 = map;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i17) {
                                    androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString.this, modifier3, textStyle3, function13, i14, z3, i13, map2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 == 128) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m854BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m4409getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    map2 = emptyMap;
                    i13 = i16;
                    z3 = z4;
                    function13 = function14;
                    androidx.compose.ui.Modifier modifier42 = modifier2;
                    i14 = m4409getClipgIe3tQ8;
                    modifier3 = modifier42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 == 128) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m854BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m4409getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                map2 = emptyMap;
                i13 = i16;
                z3 = z4;
                function13 = function14;
                androidx.compose.ui.Modifier modifier422 = modifier2;
                i14 = m4409getClipgIe3tQ8;
                modifier3 = modifier422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 == 128) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            m854BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m4409getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            map2 = emptyMap;
            i13 = i16;
            z3 = z4;
            function13 = function14;
            androidx.compose.ui.Modifier modifier4222 = modifier2;
            i14 = m4409getClipgIe3tQ8;
            modifier3 = modifier4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 == 128) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        m854BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m4409getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        map2 = emptyMap;
        i13 = i16;
        z3 = z4;
        function13 = function14;
        androidx.compose.ui.Modifier modifier42222 = modifier2;
        i14 = m4409getClipgIe3tQ8;
        modifier3 = modifier42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006f  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m852BasicText4YKlhWE(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i8;
        kotlin.jvm.functions.Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        final androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function1 function13;
        final int m4409getClipgIe3tQ8;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final int i14;
        final int i15;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1542716361);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)319@13349L86:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        if ((i6 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            companion = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i7 != 0) {
                                textStyle2 = androidx.compose.ui.text.TextStyle.INSTANCE.getDefault();
                            }
                            function13 = i8 != 0 ? null : function12;
                            m4409getClipgIe3tQ8 = i9 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i10;
                            boolean z4 = i11 != 0 ? true : z2;
                            int i17 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i18 = i13 == 0 ? i3 : 1;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:319)");
                            }
                            m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function13, m4409getClipgIe3tQ8, z4, i17, i18, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            i14 = i17;
                            boolean z5 = z4;
                            i15 = i18;
                            z3 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            i15 = i3;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            m4409getClipgIe3tQ8 = i10;
                            i14 = i2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i19) {
                                    androidx.compose.foundation.text.BasicTextKt.m852BasicText4YKlhWE(str, companion, textStyle3, function13, m4409getClipgIe3tQ8, z3, i14, i15, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    if ((i6 & 23967451) == 4793490) {
                    }
                    if (i16 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function13, m4409getClipgIe3tQ8, z4, i17, i18, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    i14 = i17;
                    boolean z52 = z4;
                    i15 = i18;
                    z3 = z52;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                if ((i6 & 23967451) == 4793490) {
                }
                if (i16 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function13, m4409getClipgIe3tQ8, z4, i17, i18, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                i14 = i17;
                boolean z522 = z4;
                i15 = i18;
                z3 = z522;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            if ((i6 & 23967451) == 4793490) {
            }
            if (i16 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function13, m4409getClipgIe3tQ8, z4, i17, i18, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            i14 = i17;
            boolean z5222 = z4;
            i15 = i18;
            z3 = z5222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        if ((i6 & 23967451) == 4793490) {
        }
        if (i16 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        m856BasicTextVhcvRP8(str, companion, textStyle2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) function13, m4409getClipgIe3tQ8, z4, i17, i18, (androidx.compose.ui.graphics.ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        i14 = i17;
        boolean z52222 = z4;
        i15 = i18;
        z3 = z52222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m855BasicTextVhcvRP8(final androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1 function1, int i, boolean z, int i2, int i3, java.util.Map map, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i8;
        kotlin.jvm.functions.Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        final androidx.compose.ui.Modifier.Companion companion;
        final int i15;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final kotlin.jvm.functions.Function1 function13;
        final int i16;
        final boolean z3;
        final int i17;
        final java.util.Map map2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(851408699);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)333@13901L240:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (191739611 & i6) != 38347922 || !startRestartGroup.getSkipping()) {
                            companion = i18 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.ui.text.TextStyle textStyle4 = i7 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle2;
                            kotlin.jvm.functions.Function1 function14 = i8 != 0 ? null : function12;
                            int m4409getClipgIe3tQ8 = i9 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i10;
                            boolean z4 = i11 != 0 ? true : z2;
                            int i19 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            i15 = i13 == 0 ? i3 : 1;
                            java.util.Map emptyMap = i14 != 0 ? kotlin.collections.MapsKt.emptyMap() : map;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:333)");
                            }
                            m854BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m4409getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle4;
                            function13 = function14;
                            i16 = m4409getClipgIe3tQ8;
                            z3 = z4;
                            i17 = i19;
                            map2 = emptyMap;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            i17 = i2;
                            map2 = map;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i16 = i10;
                            i15 = i3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i20) {
                                    androidx.compose.foundation.text.BasicTextKt.m855BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString.this, companion, textStyle3, function13, i16, z3, i17, i15, map2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i18 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m854BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m4409getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle4;
                    function13 = function14;
                    i16 = m4409getClipgIe3tQ8;
                    z3 = z4;
                    i17 = i19;
                    map2 = emptyMap;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i18 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m854BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m4409getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle4;
                function13 = function14;
                i16 = m4409getClipgIe3tQ8;
                z3 = z4;
                i17 = i19;
                map2 = emptyMap;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i18 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            m854BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m4409getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle4;
            function13 = function14;
            i16 = m4409getClipgIe3tQ8;
            z3 = z4;
            i17 = i19;
            map2 = emptyMap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i18 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        m854BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m4409getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle4;
        function13 = function14;
        i16 = m4409getClipgIe3tQ8;
        z3 = z4;
        i17 = i19;
        map2 = emptyMap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final androidx.compose.runtime.saveable.Saver<java.lang.Long, java.lang.Long> selectionIdSaver(final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar) {
        return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, java.lang.Long, java.lang.Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Long invoke(androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final java.lang.Long invoke(androidx.compose.runtime.saveable.SaverScope saverScope, long j) {
                if (androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(androidx.compose.foundation.text.selection.SelectionRegistrar.this, j)) {
                    return java.lang.Long.valueOf(j);
                }
                return null;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Long invoke(java.lang.Long l) {
                return invoke(l.longValue());
            }

            public final java.lang.Long invoke(long j) {
                return java.lang.Long.valueOf(j);
            }
        });
    }

    /* renamed from: textModifier-RWo7tUw, reason: not valid java name */
    private static final androidx.compose.ui.Modifier m857textModifierRWo7tUw(androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, int i, boolean z, int i2, int i3, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.geometry.Rect>, kotlin.Unit> function12, androidx.compose.foundation.text.modifiers.SelectionController selectionController, androidx.compose.ui.graphics.ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(androidx.compose.ui.Modifier.INSTANCE).then(new androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }
}
