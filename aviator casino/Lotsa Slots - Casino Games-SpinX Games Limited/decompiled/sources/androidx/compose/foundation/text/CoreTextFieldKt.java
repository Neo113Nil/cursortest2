package androidx.compose.foundation.text;

/* compiled from: CoreTextField.kt */
@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u000123\b\u0002\u0010\u001e\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b H\u0001¢\u0006\u0002\u0010$\u001a0\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b H\u0003¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\u0015\u0010-\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H\u0002\u001a\u0010\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0000\u001a \u00105\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0002\u001a0\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:2\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002\u001a \u0010;\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0001H\u0002\u001a2\u0010?\u001a\u00020\u0003*\u00020@2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000f2\u0006\u00106\u001a\u000207H\u0080@¢\u0006\u0002\u0010D\u001a\u001c\u0010E\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u0010&\u001a\u00020'H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006F²\u0006\n\u0010G\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"USE_WINDOW_FOCUS_ENABLED", "", "CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", com.ironsource.C3232q2.v, "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/TextFieldState;", "isWindowFocusedBehindFlag", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    public static final boolean USE_WINDOW_FOCUS_ENABLED = false;

    public static final boolean isWindowFocusedBehindFlag(androidx.compose.ui.platform.WindowInfo windowInfo) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x072f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0469  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, boolean z, int i, int i2, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z2, boolean z3, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4, final int i5) {
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
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.graphics.SolidColor solidColor;
        androidx.compose.ui.text.input.ImeOptions imeOptions2;
        boolean z4;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        boolean z5;
        int i20;
        androidx.compose.ui.graphics.Brush brush2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        boolean z6;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        int i21;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        java.lang.Object rememberedValue;
        final androidx.compose.ui.text.input.TextInputService textInputService;
        boolean changed;
        java.lang.Object rememberedValue2;
        boolean changed2;
        java.lang.Object rememberedValue3;
        androidx.compose.ui.text.input.TransformedText filterWithValidation;
        androidx.compose.ui.text.TextRange composition;
        boolean changed3;
        java.lang.Object rememberedValue4;
        java.lang.Object rememberedValue5;
        java.lang.Object rememberedValue6;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        boolean z7;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function14;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation3;
        final androidx.compose.ui.graphics.Brush brush3;
        final boolean z8;
        final int i22;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        final boolean z9;
        final int i23;
        final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        final boolean z10;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.compose.ui.text.input.ImeOptions imeOptions3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i24;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-958708118);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)214@11969L29,218@12167L7,219@12206L7,220@12267L7,221@12335L7,222@12400L7,223@12445L7,224@12514L7,229@12730L135,235@12906L268,247@13479L21,248@13517L397,277@14313L26,280@14399L51,286@14702L7,287@14753L7,288@14810L7,292@14921L24,293@14979L37,588@27132L86,592@27224L515,641@29030L4637:CoreTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i25 = i5 & 4;
        if (i25 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(brush) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                if ((i4 & 112) == 0) {
                    if ((i5 & 2048) == 0 && startRestartGroup.changed(imeOptions)) {
                        i24 = 32;
                        i15 |= i24;
                    }
                    i24 = 16;
                    i15 |= i24;
                }
                int i26 = i15;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i26 |= 384;
                } else if ((i4 & 896) == 0) {
                    i26 |= startRestartGroup.changed(keyboardActions) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i26 |= 3072;
                    } else if ((i4 & 7168) == 0) {
                        i26 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i26 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i26 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i26 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i26 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i26) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                androidx.compose.ui.Modifier.Companion companion2 = i25 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                androidx.compose.ui.text.TextStyle textStyle4 = i7 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                androidx.compose.ui.text.input.VisualTransformation none = i8 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = i9 != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function12;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource;
                                if (i11 != 0) {
                                    modifier2 = companion2;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = companion2;
                                    solidColor = brush;
                                }
                                boolean z11 = i12 != 0 ? true : z;
                                int i27 = i13 != 0 ? Integer.MAX_VALUE : i;
                                int i28 = i14 != 0 ? 1 : i2;
                                if ((i5 & 2048) != 0) {
                                    imeOptions2 = androidx.compose.ui.text.input.ImeOptions.INSTANCE.getDefault();
                                    i26 &= -113;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                androidx.compose.foundation.text.KeyboardActions keyboardActions4 = i16 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                z4 = i17 != 0 ? true : z2;
                                boolean z12 = i18 != 0 ? false : z3;
                                if (i19 != 0) {
                                    modifier3 = modifier2;
                                    z5 = z11;
                                    i20 = i28;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z12;
                                    function32 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.INSTANCE.m868getLambda1$foundation_release();
                                } else {
                                    modifier3 = modifier2;
                                    function32 = function3;
                                    z5 = z11;
                                    i20 = i28;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z12;
                                }
                                visualTransformation2 = none;
                                function13 = coreTextFieldKt$CoreTextField$1;
                                i21 = i27;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                textStyle2 = textStyle4;
                                mutableInteractionSource2 = mutableInteractionSource5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 2048) != 0) {
                                    i26 &= -113;
                                }
                                modifier3 = modifier;
                                textStyle2 = textStyle;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                z5 = z;
                                i21 = i;
                                i20 = i2;
                                imeOptions2 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z4 = z2;
                                z6 = z3;
                                function32 = function3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-958708118, i6, i26, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:213)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> localTextInputService = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localTextInputService);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textInputService = (androidx.compose.ui.text.input.TextInputService) consume;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2 = startRestartGroup.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = startRestartGroup.consume(localTextSelectionColors);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long backgroundColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume4).getBackgroundColor();
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> localFocusManager = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = startRestartGroup.consume(localFocusManager);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) consume5;
                            androidx.compose.ui.Modifier modifier5 = modifier3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume6 = startRestartGroup.consume(localWindowInfo);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final androidx.compose.ui.platform.WindowInfo windowInfo = (androidx.compose.ui.platform.WindowInfo) consume6;
                            int i29 = i26;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> localSoftwareKeyboardController = androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume7 = startRestartGroup.consume(localSoftwareKeyboardController);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) consume7;
                            final int i30 = i21;
                            final androidx.compose.foundation.gestures.Orientation orientation = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                            java.lang.Object[] objArr = {orientation};
                            androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> saver = androidx.compose.foundation.text.TextFieldScrollerPosition.INSTANCE.getSaver();
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                            startRestartGroup.startReplaceableGroup(294183095);
                            changed = startRestartGroup.changed(orientation);
                            final androidx.compose.ui.text.input.ImeOptions imeOptions4 = imeOptions2;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final androidx.compose.foundation.text.TextFieldScrollerPosition invoke() {
                                        return new androidx.compose.foundation.text.TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation.this, 0.0f, 2, null);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition = (androidx.compose.foundation.text.TextFieldScrollerPosition) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 72, 4);
                            startRestartGroup.startReplaceableGroup(511388516);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                                composition = textFieldValue.getComposition();
                                if (composition != null || (rememberedValue3 = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m924applyCompositionDecoration72CqOWE(composition.getPackedValue(), filterWithValidation)) == null) {
                                    rememberedValue3 = filterWithValidation;
                                }
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.ui.text.input.TransformedText transformedText = (androidx.compose.ui.text.input.TransformedText) rememberedValue3;
                            androidx.compose.ui.text.AnnotatedString text = transformedText.getText();
                            final androidx.compose.ui.text.input.OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                            androidx.compose.runtime.RecomposeScope currentRecomposeScope = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed3 = startRestartGroup.changed(softwareKeyboardController);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new androidx.compose.foundation.text.TextFieldState(new androidx.compose.foundation.text.TextDelegate(text, textStyle2, 0, 0, z5, 0, density, resolver, null, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope, softwareKeyboardController);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.foundation.text.TextFieldState textFieldState = (androidx.compose.foundation.text.TextFieldState) rememberedValue4;
                            textFieldState.m947updatefnh65Uc(textFieldValue.getAnnotatedString(), text, textStyle2, z5, density, resolver, function1, keyboardActions2, focusManager, backgroundColor);
                            textFieldState.getProcessor().reset(textFieldValue, textFieldState.getInputSession());
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new androidx.compose.foundation.text.UndoManager(0, 1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.foundation.text.UndoManager undoManager = (androidx.compose.foundation.text.UndoManager) rememberedValue5;
                            androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(undoManager, textFieldValue, 0L, 2, null);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager(undoManager);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) rememberedValue6;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(textFieldValue);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume8 = startRestartGroup.consume(localClipboardManager);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setClipboardManager$foundation_release((androidx.compose.ui.platform.ClipboardManager) consume8);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume9 = startRestartGroup.consume(localTextToolbar);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume9);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume10 = startRestartGroup.consume(localHapticFeedback);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume10);
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z6);
                            startRestartGroup.startReplaceableGroup(773894976);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue7 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.BringIntoViewRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester = (androidx.compose.foundation.relocation.BringIntoViewRequester) rememberedValue8;
                            final boolean z13 = z4;
                            final boolean z14 = z6;
                            androidx.compose.ui.Modifier textFieldFocusModifier = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(androidx.compose.ui.Modifier.INSTANCE, z4, focusRequester, mutableInteractionSource6, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                                    invoke2(focusState);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                                    if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                        return;
                                    }
                                    androidx.compose.foundation.text.TextFieldState.this.setHasFocus(focusState.isFocused());
                                    if (textInputService != null) {
                                        if (!androidx.compose.foundation.text.TextFieldState.this.getHasFocus() || !z13 || z14) {
                                            androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                                        } else {
                                            androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldValue, imeOptions4, offsetMapping);
                                        }
                                        if (focusState.isFocused() && (layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult()) != null) {
                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester, textFieldValue, androidx.compose.foundation.text.TextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                        }
                                    }
                                    if (focusState.isFocused()) {
                                        return;
                                    }
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                }
                            });
                            startRestartGroup.startReplaceableGroup(-55007276);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                            if (textInputService != null) {
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(kotlin.Unit.INSTANCE, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2(textFieldState, androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(java.lang.Boolean.valueOf(z4 && !z6), startRestartGroup, 0), textInputService, textFieldSelectionManager, imeOptions4, null), startRestartGroup, 70);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final boolean z15 = z6;
                            androidx.compose.ui.Modifier pointerHoverIcon$default = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(boolean z16) {
                                    androidx.compose.foundation.text.TextFieldState.this.setInTouchMode(z16);
                                }
                            }), mutableInteractionSource6, z4, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                                    m869invokek4lQ0M(offset.getPackedValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m869invokek4lQ0M(long j) {
                                    androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester, !z15);
                                    if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                                        if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() != androidx.compose.foundation.text.HandleState.Selection) {
                                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                            if (layoutResult != null) {
                                                androidx.compose.foundation.text.TextFieldState textFieldState2 = androidx.compose.foundation.text.TextFieldState.this;
                                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m926setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2.getProcessor(), offsetMapping, textFieldState2.getOnValueChange());
                                                if (textFieldState2.getTextDelegate().getText().length() > 0) {
                                                    textFieldState2.setHandleState(androidx.compose.foundation.text.HandleState.Cursor);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        textFieldSelectionManager.m1074deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
                                    }
                                }
                            }), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            final androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                        androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = offsetMapping;
                                        androidx.compose.foundation.text.TextFieldState textFieldState2 = androidx.compose.foundation.text.TextFieldState.this;
                                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping2, layoutResult.getValue(), textFieldState2.getSelectionPaint());
                                    }
                                }
                            });
                            final boolean z16 = z4;
                            final androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                    androidx.compose.foundation.text.TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                    }
                                    if (z16) {
                                        if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection) {
                                            if (androidx.compose.foundation.text.TextFieldState.this.getShowFloatingToolbar() && androidx.compose.foundation.text.CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo)) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                            }
                                            androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleStart(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                            androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleEnd(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                            androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()));
                                        } else if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor) {
                                            androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                        }
                                        androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue, offsetMapping);
                                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                        if (layoutResult2 != null) {
                                            androidx.compose.foundation.text.TextFieldState textFieldState2 = androidx.compose.foundation.text.TextFieldState.this;
                                            androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                            androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = offsetMapping;
                                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState2.getInputSession();
                                            if (inputSession == null || !textFieldState2.getHasFocus()) {
                                                return;
                                            }
                                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                        }
                                    }
                                }
                            });
                            final boolean z17 = visualTransformation2 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
                            final boolean z18 = z4;
                            final boolean z19 = z6;
                            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.Modifier.INSTANCE, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, androidx.compose.ui.text.input.TransformedText.this.getText());
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                    if (!z18) {
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                    }
                                    if (z17) {
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    }
                                    final androidx.compose.foundation.text.TextFieldState textFieldState2 = textFieldState;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                                            boolean z20;
                                            if (androidx.compose.foundation.text.TextFieldState.this.getLayoutResult() != null) {
                                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
                                                list.add(layoutResult.getValue());
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            return java.lang.Boolean.valueOf(z20);
                                        }
                                    }, 1, null);
                                    final boolean z20 = z19;
                                    final boolean z21 = z18;
                                    final androidx.compose.foundation.text.TextFieldState textFieldState3 = textFieldState;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                            kotlin.Unit unit;
                                            if (z20 || !z21) {
                                                return false;
                                            }
                                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState3.getInputSession();
                                            if (inputSession != null) {
                                                androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState3;
                                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                                unit = kotlin.Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                textFieldState3.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(annotatedString.getText(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString.getText().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                    final boolean z22 = z19;
                                    final boolean z23 = z18;
                                    final androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState;
                                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                            kotlin.Unit unit;
                                            if (z22 || !z23) {
                                                return false;
                                            }
                                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState4.getInputSession();
                                            if (inputSession != null) {
                                                androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                                unit = kotlin.Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                                textFieldState4.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) textFieldValue3.getText(), androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()), (java.lang.CharSequence) annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = offsetMapping;
                                    final boolean z24 = z18;
                                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue;
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                        }

                                        public final java.lang.Boolean invoke(int i31, int i32, boolean z25) {
                                            if (!z25) {
                                                i31 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i31);
                                            }
                                            if (!z25) {
                                                i32 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i32);
                                            }
                                            boolean z26 = false;
                                            if (z24 && (i31 != androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) || i32 != androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()))) {
                                                if (java.lang.Math.min(i31, i32) >= 0 && java.lang.Math.max(i31, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                                    if (z25 || i31 == i32) {
                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                    } else {
                                                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                    }
                                                    textFieldState5.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(textFieldValue3.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i31, i32), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                                    z26 = true;
                                                } else {
                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return java.lang.Boolean.valueOf(z26);
                                        }
                                    }, 1, null);
                                    int imeAction = imeOptions4.getImeAction();
                                    final androidx.compose.foundation.text.TextFieldState textFieldState6 = textFieldState;
                                    final androidx.compose.ui.text.input.ImeOptions imeOptions5 = imeOptions4;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            androidx.compose.foundation.text.TextFieldState.this.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeOptions5.getImeAction()));
                                            return true;
                                        }
                                    }, 2, null);
                                    final androidx.compose.foundation.text.TextFieldState textFieldState7 = textFieldState;
                                    final androidx.compose.ui.focus.FocusRequester focusRequester2 = focusRequester;
                                    final boolean z25 = z19;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester2, !z25);
                                            return true;
                                        }
                                    }, 1, null);
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                            return true;
                                        }
                                    }, 1, null);
                                    if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && !z17) {
                                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Boolean invoke() {
                                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                                return true;
                                            }
                                        }, 1, null);
                                        if (z18 && !z19) {
                                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Boolean invoke() {
                                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.cut$foundation_release();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z18 || z19) {
                                        return;
                                    }
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.paste$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            });
                            final androidx.compose.ui.Modifier cursor = androidx.compose.foundation.text.TextFieldCursorKt.cursor(androidx.compose.ui.Modifier.INSTANCE, textFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo)) ? false : true);
                            androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionManager, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            androidx.compose.runtime.EffectsKt.DisposableEffect(imeOptions4, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                    if (androidx.compose.ui.text.input.TextInputService.this != null && textFieldState.getHasFocus()) {
                                        textFieldState.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService.this, textFieldValue, textFieldState.getProcessor(), imeOptions4, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                                    }
                                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            }, startRestartGroup, (i29 >> 3) & 14);
                            androidx.compose.ui.Modifier onGloballyPositioned2 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier5.then(textFieldFocusModifier), textFieldState, focusManager), textFieldState, textFieldSelectionManager).then(androidx.compose.foundation.text.TextFieldKeyInputKt.m933textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier.INSTANCE, textFieldState, textFieldSelectionManager, textFieldValue, textFieldState.getOnValueChange(), !z6, i30 == 1, offsetMapping, undoManager, imeOptions4.getImeAction())), textFieldScrollerPosition, mutableInteractionSource6, z4).then(pointerHoverIcon$default).then(semantics), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                }
                            });
                            z7 = !z4 && textFieldState.getHasFocus() && textFieldState.isInTouchMode() && isWindowFocusedBehindFlag(windowInfo);
                            if (z7) {
                                companion = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.textFieldMagnifier(androidx.compose.ui.Modifier.INSTANCE, textFieldSelectionManager);
                            } else {
                                companion = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            final androidx.compose.ui.Modifier modifier6 = companion;
                            final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = function32;
                            final androidx.compose.ui.text.TextStyle textStyle5 = textStyle2;
                            final int i31 = i20;
                            boolean z20 = z4;
                            final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation2;
                            androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation2;
                            final boolean z21 = z7;
                            final boolean z22 = z6;
                            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function15 = function13;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                                    if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                                        }
                                        kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                        final androidx.compose.foundation.text.TextFieldState textFieldState2 = textFieldState;
                                        final androidx.compose.ui.text.TextStyle textStyle6 = textStyle5;
                                        final int i33 = i31;
                                        final int i34 = i30;
                                        final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                        final androidx.compose.ui.text.input.VisualTransformation visualTransformation6 = visualTransformation4;
                                        final androidx.compose.ui.Modifier modifier7 = cursor;
                                        final androidx.compose.ui.Modifier modifier8 = drawBehind;
                                        final androidx.compose.ui.Modifier modifier9 = onGloballyPositioned;
                                        final androidx.compose.ui.Modifier modifier10 = modifier6;
                                        final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                        final boolean z23 = z21;
                                        final boolean z24 = z22;
                                        final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function16 = function15;
                                        final androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = offsetMapping;
                                        final androidx.compose.ui.unit.Density density2 = density;
                                        function35.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i35) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                                if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                                    }
                                                    androidx.compose.ui.Modifier heightInLines = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.text.TextFieldState.this.m945getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                                    androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                    androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                                    androidx.compose.ui.text.input.VisualTransformation visualTransformation7 = visualTransformation6;
                                                    final androidx.compose.foundation.text.TextFieldState textFieldState3 = androidx.compose.foundation.text.TextFieldState.this;
                                                    androidx.compose.ui.Modifier bringIntoViewRequester3 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final androidx.compose.foundation.text.TextLayoutResultProxy invoke() {
                                                            return androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                                        }
                                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                    final androidx.compose.foundation.text.TextFieldState textFieldState4 = androidx.compose.foundation.text.TextFieldState.this;
                                                    final boolean z25 = z23;
                                                    final boolean z26 = z24;
                                                    final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function17 = function16;
                                                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue4 = textFieldValue2;
                                                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping3 = offsetMapping2;
                                                    final androidx.compose.ui.unit.Density density3 = density2;
                                                    final int i36 = i34;
                                                    androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -363167407, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i37) {
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                            if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                                }
                                                                final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                                                final kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function18 = function17;
                                                                final androidx.compose.ui.text.input.TextFieldValue textFieldValue5 = textFieldValue4;
                                                                final androidx.compose.ui.text.input.OffsetMapping offsetMapping4 = offsetMapping3;
                                                                final androidx.compose.ui.unit.Density density4 = density3;
                                                                final int i38 = i36;
                                                                androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i39);
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                                                                        androidx.compose.runtime.snapshots.Snapshot.Companion companion3 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                                                                        androidx.compose.foundation.text.TextFieldState textFieldState6 = androidx.compose.foundation.text.TextFieldState.this;
                                                                        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                        try {
                                                                            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                            try {
                                                                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                                androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                createNonObservableSnapshot.dispose();
                                                                                kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                int intValue = m925layout_EkL_Y$foundation_release.component1().intValue();
                                                                                int intValue2 = m925layout_EkL_Y$foundation_release.component2().intValue();
                                                                                androidx.compose.ui.text.TextLayoutResult component3 = m925layout_EkL_Y$foundation_release.component3();
                                                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                                                                                    androidx.compose.foundation.text.TextFieldState.this.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3));
                                                                                    function18.invoke(component3);
                                                                                    androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                }
                                                                                androidx.compose.foundation.text.TextFieldState.this.m946setMinHeightForSingleLineField0680j_4(density4.mo312toDpu2uoSUM(i38 == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                                        invoke2(placementScope);
                                                                                        return kotlin.Unit.INSTANCE;
                                                                                    }
                                                                                });
                                                                            } finally {
                                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                            }
                                                                        } catch (java.lang.Throwable th) {
                                                                            createNonObservableSnapshot.dispose();
                                                                            throw th;
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i39) {
                                                                        androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                                boolean z27 = false;
                                                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion3);
                                                                if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                                                if (textFieldState4.getHandleState() != androidx.compose.foundation.text.HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z25) {
                                                                        z27 = true;
                                                                    }
                                                                }
                                                                androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                                if (textFieldState4.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor && !z26 && z25) {
                                                                    androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer5, 8);
                                                                }
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48, 0);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 6);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -374338080, true, function2), composer2, 448);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            function14 = function13;
                            visualTransformation3 = visualTransformation5;
                            brush3 = brush2;
                            z8 = z5;
                            i22 = i20;
                            keyboardActions3 = keyboardActions2;
                            z9 = z6;
                            i23 = i30;
                            function33 = function32;
                            z10 = z20;
                            modifier4 = modifier5;
                            imeOptions3 = imeOptions4;
                            mutableInteractionSource3 = mutableInteractionSource6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                            z8 = z;
                            i23 = i;
                            imeOptions3 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z2;
                            z9 = z3;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i22 = i2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue.this, function1, modifier4, textStyle3, visualTransformation3, function14, mutableInteractionSource3, brush3, z8, i23, i22, imeOptions3, keyboardActions3, z10, z9, function33, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    visualTransformation2 = none;
                    function13 = coreTextFieldKt$CoreTextField$1;
                    i21 = i27;
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource4;
                    textStyle2 = textStyle4;
                    mutableInteractionSource2 = mutableInteractionSource52;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.ui.focus.FocusRequester focusRequester2 = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> localTextInputService2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume11 = startRestartGroup.consume(localTextInputService2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textInputService = (androidx.compose.ui.text.input.TextInputService) consume11;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22 = startRestartGroup.consume(localDensity2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume22;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume32 = startRestartGroup.consume(localFontFamilyResolver2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.text.font.FontFamily.Resolver resolver2 = (androidx.compose.ui.text.font.FontFamily.Resolver) consume32;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors2 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume42 = startRestartGroup.consume(localTextSelectionColors2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long backgroundColor2 = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume42).getBackgroundColor();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> localFocusManager2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume52 = startRestartGroup.consume(localFocusManager2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.focus.FocusManager focusManager2 = (androidx.compose.ui.focus.FocusManager) consume52;
                    androidx.compose.ui.Modifier modifier52 = modifier3;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume62 = startRestartGroup.consume(localWindowInfo2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.platform.WindowInfo windowInfo2 = (androidx.compose.ui.platform.WindowInfo) consume62;
                    int i292 = i26;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> localSoftwareKeyboardController2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume72 = startRestartGroup.consume(localSoftwareKeyboardController2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2 = (androidx.compose.ui.platform.SoftwareKeyboardController) consume72;
                    final int i302 = i21;
                    final androidx.compose.foundation.gestures.Orientation orientation2 = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                    java.lang.Object[] objArr2 = {orientation2};
                    androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> saver2 = androidx.compose.foundation.text.TextFieldScrollerPosition.INSTANCE.getSaver();
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource2;
                    startRestartGroup.startReplaceableGroup(294183095);
                    changed = startRestartGroup.changed(orientation2);
                    final androidx.compose.ui.text.input.ImeOptions imeOptions42 = imeOptions2;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final androidx.compose.foundation.text.TextFieldScrollerPosition invoke() {
                            return new androidx.compose.foundation.text.TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation.this, 0.0f, 2, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition2 = (androidx.compose.foundation.text.TextFieldScrollerPosition) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2, (androidx.compose.runtime.saveable.Saver) saver2, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 72, 4);
                    startRestartGroup.startReplaceableGroup(511388516);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                    }
                    rememberedValue3 = filterWithValidation;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.ui.text.input.TransformedText transformedText2 = (androidx.compose.ui.text.input.TransformedText) rememberedValue3;
                    androidx.compose.ui.text.AnnotatedString text2 = transformedText2.getText();
                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                    androidx.compose.runtime.RecomposeScope currentRecomposeScope2 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(softwareKeyboardController2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue4 = new androidx.compose.foundation.text.TextFieldState(new androidx.compose.foundation.text.TextDelegate(text2, textStyle2, 0, 0, z5, 0, density2, resolver2, null, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2, softwareKeyboardController2);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text.TextFieldState textFieldState2 = (androidx.compose.foundation.text.TextFieldState) rememberedValue4;
                    textFieldState2.m947updatefnh65Uc(textFieldValue.getAnnotatedString(), text2, textStyle2, z5, density2, resolver2, function1, keyboardActions2, focusManager2, backgroundColor2);
                    textFieldState2.getProcessor().reset(textFieldValue, textFieldState2.getInputSession());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.text.UndoManager undoManager2 = (androidx.compose.foundation.text.UndoManager) rememberedValue5;
                    androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) rememberedValue6;
                    textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                    textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager2.setOnValueChange$foundation_release(textFieldState2.getOnValueChange());
                    textFieldSelectionManager2.setState$foundation_release(textFieldState2);
                    textFieldSelectionManager2.setValue$foundation_release(textFieldValue);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume82 = startRestartGroup.consume(localClipboardManager2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setClipboardManager$foundation_release((androidx.compose.ui.platform.ClipboardManager) consume82);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume92 = startRestartGroup.consume(localTextToolbar2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume92);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume102 = startRestartGroup.consume(localHapticFeedback2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume102);
                    textFieldSelectionManager2.setFocusRequester(focusRequester2);
                    textFieldSelectionManager2.setEditable(!z6);
                    startRestartGroup.startReplaceableGroup(773894976);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester2 = (androidx.compose.foundation.relocation.BringIntoViewRequester) rememberedValue8;
                    final boolean z132 = z4;
                    final boolean z142 = z6;
                    androidx.compose.ui.Modifier textFieldFocusModifier2 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(androidx.compose.ui.Modifier.INSTANCE, z4, focusRequester2, mutableInteractionSource62, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                            invoke2(focusState);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                            if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                return;
                            }
                            androidx.compose.foundation.text.TextFieldState.this.setHasFocus(focusState.isFocused());
                            if (textInputService != null) {
                                if (!androidx.compose.foundation.text.TextFieldState.this.getHasFocus() || !z132 || z142) {
                                    androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                                } else {
                                    androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldValue, imeOptions42, offsetMapping2);
                                }
                                if (focusState.isFocused() && (layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult()) != null) {
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2, textFieldValue, androidx.compose.foundation.text.TextFieldState.this, layoutResult, offsetMapping2, null), 3, null);
                                }
                            }
                            if (focusState.isFocused()) {
                                return;
                            }
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                        }
                    });
                    startRestartGroup.startReplaceableGroup(-55007276);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                    if (textInputService != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final boolean z152 = z6;
                    androidx.compose.ui.Modifier pointerHoverIcon$default2 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                            invoke(bool.booleanValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(boolean z162) {
                            androidx.compose.foundation.text.TextFieldState.this.setInTouchMode(z162);
                        }
                    }), mutableInteractionSource62, z4, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                            m869invokek4lQ0M(offset.getPackedValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m869invokek4lQ0M(long j) {
                            androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester2, !z152);
                            if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                                if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() != androidx.compose.foundation.text.HandleState.Selection) {
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        androidx.compose.foundation.text.TextFieldState textFieldState22 = androidx.compose.foundation.text.TextFieldState.this;
                                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m926setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState22.getProcessor(), offsetMapping2, textFieldState22.getOnValueChange());
                                        if (textFieldState22.getTextDelegate().getText().length() > 0) {
                                            textFieldState22.setHandleState(androidx.compose.foundation.text.HandleState.Cursor);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                textFieldSelectionManager2.m1074deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
                            }
                        }
                    }), textFieldSelectionManager2.getMouseSelectionObserver(), textFieldSelectionManager2.getTouchSelectionObserver()), androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    final androidx.compose.ui.Modifier drawBehind2 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                            invoke2(drawScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                androidx.compose.ui.text.input.OffsetMapping offsetMapping22 = offsetMapping2;
                                androidx.compose.foundation.text.TextFieldState textFieldState22 = androidx.compose.foundation.text.TextFieldState.this;
                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping22, layoutResult.getValue(), textFieldState22.getSelectionPaint());
                            }
                        }
                    });
                    final boolean z162 = z4;
                    final androidx.compose.ui.Modifier onGloballyPositioned3 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                            androidx.compose.foundation.text.TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                            }
                            if (z162) {
                                if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection) {
                                    if (androidx.compose.foundation.text.TextFieldState.this.getShowFloatingToolbar() && androidx.compose.foundation.text.CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo2)) {
                                        textFieldSelectionManager2.showSelectionToolbar$foundation_release();
                                    } else {
                                        textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                    }
                                    androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleStart(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                    androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleEnd(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, false));
                                    androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()));
                                } else if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor) {
                                    androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                }
                                androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue, offsetMapping2);
                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                if (layoutResult2 != null) {
                                    androidx.compose.foundation.text.TextFieldState textFieldState22 = androidx.compose.foundation.text.TextFieldState.this;
                                    androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                    androidx.compose.ui.text.input.OffsetMapping offsetMapping22 = offsetMapping2;
                                    androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState22.getInputSession();
                                    if (inputSession == null || !textFieldState22.getHasFocus()) {
                                        return;
                                    }
                                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22, layoutResult2);
                                }
                            }
                        }
                    });
                    final boolean z172 = visualTransformation2 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
                    final boolean z182 = z4;
                    final boolean z192 = z6;
                    androidx.compose.ui.Modifier semantics2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.Modifier.INSTANCE, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, androidx.compose.ui.text.input.TransformedText.this.getText());
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                            if (!z182) {
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                            }
                            if (z172) {
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                            }
                            final androidx.compose.foundation.text.TextFieldState textFieldState22 = textFieldState2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                                    boolean z202;
                                    if (androidx.compose.foundation.text.TextFieldState.this.getLayoutResult() != null) {
                                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
                                        list.add(layoutResult.getValue());
                                        z202 = true;
                                    } else {
                                        z202 = false;
                                    }
                                    return java.lang.Boolean.valueOf(z202);
                                }
                            }, 1, null);
                            final boolean z202 = z192;
                            final boolean z212 = z182;
                            final androidx.compose.foundation.text.TextFieldState textFieldState3 = textFieldState2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                    kotlin.Unit unit;
                                    if (z202 || !z212) {
                                        return false;
                                    }
                                    androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState3.getInputSession();
                                    if (inputSession != null) {
                                        androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState3;
                                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                        unit = kotlin.Unit.INSTANCE;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        textFieldState3.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(annotatedString.getText(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString.getText().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                            final boolean z222 = z192;
                            final boolean z23 = z182;
                            final androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState2;
                            final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                    kotlin.Unit unit;
                                    if (z222 || !z23) {
                                        return false;
                                    }
                                    androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState4.getInputSession();
                                    if (inputSession != null) {
                                        androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                        unit = kotlin.Unit.INSTANCE;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                        textFieldState4.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) textFieldValue3.getText(), androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()), (java.lang.CharSequence) annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                            final androidx.compose.ui.text.input.OffsetMapping offsetMapping22 = offsetMapping2;
                            final boolean z24 = z182;
                            final androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue;
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                            final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                                    return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                }

                                public final java.lang.Boolean invoke(int i312, int i32, boolean z25) {
                                    if (!z25) {
                                        i312 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i312);
                                    }
                                    if (!z25) {
                                        i32 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i32);
                                    }
                                    boolean z26 = false;
                                    if (z24 && (i312 != androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) || i32 != androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()))) {
                                        if (java.lang.Math.min(i312, i32) >= 0 && java.lang.Math.max(i312, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                            if (z25 || i312 == i32) {
                                                textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                            } else {
                                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22, false, 1, null);
                                            }
                                            textFieldState5.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(textFieldValue3.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i312, i32), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                            z26 = true;
                                        } else {
                                            textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                        }
                                    }
                                    return java.lang.Boolean.valueOf(z26);
                                }
                            }, 1, null);
                            int imeAction = imeOptions42.getImeAction();
                            final androidx.compose.foundation.text.TextFieldState textFieldState6 = textFieldState2;
                            final androidx.compose.ui.text.input.ImeOptions imeOptions5 = imeOptions42;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.TextFieldState.this.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeOptions5.getImeAction()));
                                    return true;
                                }
                            }, 2, null);
                            final androidx.compose.foundation.text.TextFieldState textFieldState7 = textFieldState2;
                            final androidx.compose.ui.focus.FocusRequester focusRequester22 = focusRequester2;
                            final boolean z25 = z192;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester22, !z25);
                                    return true;
                                }
                            }, 1, null);
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && !z172) {
                                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Boolean invoke() {
                                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                        return true;
                                    }
                                }, 1, null);
                                if (z182 && !z192) {
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.cut$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            }
                            if (!z182 || z192) {
                                return;
                            }
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.paste$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    });
                    final androidx.compose.ui.Modifier cursor2 = androidx.compose.foundation.text.TextFieldCursorKt.cursor(androidx.compose.ui.Modifier.INSTANCE, textFieldState2, textFieldValue, offsetMapping2, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo2)) ? false : true);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionManager2, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(imeOptions42, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                            if (androidx.compose.ui.text.input.TextInputService.this != null && textFieldState2.getHasFocus()) {
                                textFieldState2.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService.this, textFieldValue, textFieldState2.getProcessor(), imeOptions42, textFieldState2.getOnValueChange(), textFieldState2.getOnImeActionPerformed()));
                            }
                            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                    }, startRestartGroup, (i292 >> 3) & 14);
                    androidx.compose.ui.Modifier onGloballyPositioned22 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier52.then(textFieldFocusModifier2), textFieldState2, focusManager2), textFieldState2, textFieldSelectionManager2).then(androidx.compose.foundation.text.TextFieldKeyInputKt.m933textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier.INSTANCE, textFieldState2, textFieldSelectionManager2, textFieldValue, textFieldState2.getOnValueChange(), !z6, i302 == 1, offsetMapping2, undoManager2, imeOptions42.getImeAction())), textFieldScrollerPosition2, mutableInteractionSource62, z4).then(pointerHoverIcon$default2).then(semantics2), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                        }
                    });
                    if (z4) {
                    }
                    if (z7) {
                    }
                    final androidx.compose.ui.Modifier modifier62 = companion;
                    final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342 = function32;
                    final androidx.compose.ui.text.TextStyle textStyle52 = textStyle2;
                    final int i312 = i20;
                    boolean z202 = z4;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation42 = visualTransformation2;
                    androidx.compose.ui.text.input.VisualTransformation visualTransformation52 = visualTransformation2;
                    final boolean z212 = z7;
                    final boolean z222 = z6;
                    final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function152 = function13;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                            if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                                }
                                kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function342;
                                final androidx.compose.foundation.text.TextFieldState textFieldState22 = textFieldState2;
                                final androidx.compose.ui.text.TextStyle textStyle6 = textStyle52;
                                final int i33 = i312;
                                final int i34 = i302;
                                final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition2;
                                final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                final androidx.compose.ui.text.input.VisualTransformation visualTransformation6 = visualTransformation42;
                                final androidx.compose.ui.Modifier modifier7 = cursor2;
                                final androidx.compose.ui.Modifier modifier8 = drawBehind2;
                                final androidx.compose.ui.Modifier modifier9 = onGloballyPositioned3;
                                final androidx.compose.ui.Modifier modifier10 = modifier62;
                                final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester22 = bringIntoViewRequester2;
                                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                final boolean z23 = z212;
                                final boolean z24 = z222;
                                final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function16 = function152;
                                final androidx.compose.ui.text.input.OffsetMapping offsetMapping22 = offsetMapping2;
                                final androidx.compose.ui.unit.Density density22 = density2;
                                function35.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        invoke(composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i35) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                        if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                            }
                                            androidx.compose.ui.Modifier heightInLines = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.text.TextFieldState.this.m945getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                            androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22;
                                            androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                            androidx.compose.ui.text.input.VisualTransformation visualTransformation7 = visualTransformation6;
                                            final androidx.compose.foundation.text.TextFieldState textFieldState3 = androidx.compose.foundation.text.TextFieldState.this;
                                            androidx.compose.ui.Modifier bringIntoViewRequester3 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final androidx.compose.foundation.text.TextLayoutResultProxy invoke() {
                                                    return androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                                }
                                            }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22);
                                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                            final androidx.compose.foundation.text.TextFieldState textFieldState4 = androidx.compose.foundation.text.TextFieldState.this;
                                            final boolean z25 = z23;
                                            final boolean z26 = z24;
                                            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function17 = function16;
                                            final androidx.compose.ui.text.input.TextFieldValue textFieldValue4 = textFieldValue2;
                                            final androidx.compose.ui.text.input.OffsetMapping offsetMapping3 = offsetMapping22;
                                            final androidx.compose.ui.unit.Density density3 = density22;
                                            final int i36 = i34;
                                            androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -363167407, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.runtime.Composer composer5, int i37) {
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                        }
                                                        final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                                        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function18 = function17;
                                                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue5 = textFieldValue4;
                                                        final androidx.compose.ui.text.input.OffsetMapping offsetMapping4 = offsetMapping3;
                                                        final androidx.compose.ui.unit.Density density4 = density3;
                                                        final int i38 = i36;
                                                        androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i39);
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            /* renamed from: measure-3p2s80s */
                                                            public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                                                                androidx.compose.runtime.snapshots.Snapshot.Companion companion3 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                                                                androidx.compose.foundation.text.TextFieldState textFieldState6 = androidx.compose.foundation.text.TextFieldState.this;
                                                                androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                try {
                                                                    androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                    try {
                                                                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                        androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                        createNonObservableSnapshot.dispose();
                                                                        kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                        int intValue = m925layout_EkL_Y$foundation_release.component1().intValue();
                                                                        int intValue2 = m925layout_EkL_Y$foundation_release.component2().intValue();
                                                                        androidx.compose.ui.text.TextLayoutResult component3 = m925layout_EkL_Y$foundation_release.component3();
                                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                                                                            androidx.compose.foundation.text.TextFieldState.this.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3));
                                                                            function18.invoke(component3);
                                                                            androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                        }
                                                                        androidx.compose.foundation.text.TextFieldState.this.m946setMinHeightForSingleLineField0680j_4(density4.mo312toDpu2uoSUM(i38 == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                        return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                                invoke2(placementScope);
                                                                                return kotlin.Unit.INSTANCE;
                                                                            }
                                                                        });
                                                                    } finally {
                                                                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                    }
                                                                } catch (java.lang.Throwable th) {
                                                                    createNonObservableSnapshot.dispose();
                                                                    throw th;
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i39) {
                                                                androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                return androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                            }
                                                        };
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                        boolean z27 = false;
                                                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion3);
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                                        if (textFieldState4.getHandleState() != androidx.compose.foundation.text.HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                                                            if (layoutCoordinates.isAttached() && z25) {
                                                                z27 = true;
                                                            }
                                                        }
                                                        androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                        if (textFieldState4.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor && !z26 && z25) {
                                                            androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer5, 8);
                                                        }
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 6);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -374338080, true, function22), composer2, 448);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    function14 = function13;
                    visualTransformation3 = visualTransformation52;
                    brush3 = brush2;
                    z8 = z5;
                    i22 = i20;
                    keyboardActions3 = keyboardActions2;
                    z9 = z6;
                    i23 = i302;
                    function33 = function32;
                    z10 = z202;
                    modifier4 = modifier52;
                    imeOptions3 = imeOptions42;
                    mutableInteractionSource3 = mutableInteractionSource62;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i25 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                visualTransformation2 = none;
                function13 = coreTextFieldKt$CoreTextField$1;
                i21 = i27;
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource4;
                textStyle2 = textStyle4;
                mutableInteractionSource2 = mutableInteractionSource522;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.ui.focus.FocusRequester focusRequester22 = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> localTextInputService22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume112 = startRestartGroup.consume(localTextInputService22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textInputService = (androidx.compose.ui.text.input.TextInputService) consume112;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume222 = startRestartGroup.consume(localDensity22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume222;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume322 = startRestartGroup.consume(localFontFamilyResolver22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.text.font.FontFamily.Resolver resolver22 = (androidx.compose.ui.text.font.FontFamily.Resolver) consume322;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors22 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume422 = startRestartGroup.consume(localTextSelectionColors22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long backgroundColor22 = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume422).getBackgroundColor();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> localFocusManager22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume522 = startRestartGroup.consume(localFocusManager22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.focus.FocusManager focusManager22 = (androidx.compose.ui.focus.FocusManager) consume522;
                androidx.compose.ui.Modifier modifier522 = modifier3;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume622 = startRestartGroup.consume(localWindowInfo22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.platform.WindowInfo windowInfo22 = (androidx.compose.ui.platform.WindowInfo) consume622;
                int i2922 = i26;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> localSoftwareKeyboardController22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume722 = startRestartGroup.consume(localSoftwareKeyboardController22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController22 = (androidx.compose.ui.platform.SoftwareKeyboardController) consume722;
                final int i3022 = i21;
                final androidx.compose.foundation.gestures.Orientation orientation22 = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                java.lang.Object[] objArr22 = {orientation22};
                androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> saver22 = androidx.compose.foundation.text.TextFieldScrollerPosition.INSTANCE.getSaver();
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource2;
                startRestartGroup.startReplaceableGroup(294183095);
                changed = startRestartGroup.changed(orientation22);
                final androidx.compose.ui.text.input.ImeOptions imeOptions422 = imeOptions2;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.compose.foundation.text.TextFieldScrollerPosition invoke() {
                        return new androidx.compose.foundation.text.TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation.this, 0.0f, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition22 = (androidx.compose.foundation.text.TextFieldScrollerPosition) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22, (androidx.compose.runtime.saveable.Saver) saver22, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 72, 4);
                startRestartGroup.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                composition = textFieldValue.getComposition();
                if (composition != null) {
                }
                rememberedValue3 = filterWithValidation;
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.ui.text.input.TransformedText transformedText22 = (androidx.compose.ui.text.input.TransformedText) rememberedValue3;
                androidx.compose.ui.text.AnnotatedString text22 = transformedText22.getText();
                final androidx.compose.ui.text.input.OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                androidx.compose.runtime.RecomposeScope currentRecomposeScope22 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(softwareKeyboardController22);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue4 = new androidx.compose.foundation.text.TextFieldState(new androidx.compose.foundation.text.TextDelegate(text22, textStyle2, 0, 0, z5, 0, density22, resolver22, null, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope22, softwareKeyboardController22);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text.TextFieldState textFieldState22 = (androidx.compose.foundation.text.TextFieldState) rememberedValue4;
                textFieldState22.m947updatefnh65Uc(textFieldValue.getAnnotatedString(), text22, textStyle2, z5, density22, resolver22, function1, keyboardActions2, focusManager22, backgroundColor22);
                textFieldState22.getProcessor().reset(textFieldValue, textFieldState22.getInputSession());
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.text.UndoManager undoManager22 = (androidx.compose.foundation.text.UndoManager) rememberedValue5;
                androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(undoManager22, textFieldValue, 0L, 2, null);
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) rememberedValue6;
                textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager22.setOnValueChange$foundation_release(textFieldState22.getOnValueChange());
                textFieldSelectionManager22.setState$foundation_release(textFieldState22);
                textFieldSelectionManager22.setValue$foundation_release(textFieldValue);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume822 = startRestartGroup.consume(localClipboardManager22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setClipboardManager$foundation_release((androidx.compose.ui.platform.ClipboardManager) consume822);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume922 = startRestartGroup.consume(localTextToolbar22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume922);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume1022 = startRestartGroup.consume(localHapticFeedback22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume1022);
                textFieldSelectionManager22.setFocusRequester(focusRequester22);
                textFieldSelectionManager22.setEditable(!z6);
                startRestartGroup.startReplaceableGroup(773894976);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final kotlinx.coroutines.CoroutineScope coroutineScope22 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester22 = (androidx.compose.foundation.relocation.BringIntoViewRequester) rememberedValue8;
                final boolean z1322 = z4;
                final boolean z1422 = z6;
                androidx.compose.ui.Modifier textFieldFocusModifier22 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(androidx.compose.ui.Modifier.INSTANCE, z4, focusRequester22, mutableInteractionSource622, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                        invoke2(focusState);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                        if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                            return;
                        }
                        androidx.compose.foundation.text.TextFieldState.this.setHasFocus(focusState.isFocused());
                        if (textInputService != null) {
                            if (!androidx.compose.foundation.text.TextFieldState.this.getHasFocus() || !z1322 || z1422) {
                                androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                            } else {
                                androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldValue, imeOptions422, offsetMapping22);
                            }
                            if (focusState.isFocused() && (layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult()) != null) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester22, textFieldValue, androidx.compose.foundation.text.TextFieldState.this, layoutResult, offsetMapping22, null), 3, null);
                            }
                        }
                        if (focusState.isFocused()) {
                            return;
                        }
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22, null, 1, null);
                    }
                });
                startRestartGroup.startReplaceableGroup(-55007276);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                if (textInputService != null) {
                }
                startRestartGroup.endReplaceableGroup();
                final boolean z1522 = z6;
                androidx.compose.ui.Modifier pointerHoverIcon$default22 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                        invoke(bool.booleanValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(boolean z1622) {
                        androidx.compose.foundation.text.TextFieldState.this.setInTouchMode(z1622);
                    }
                }), mutableInteractionSource622, z4, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                        m869invokek4lQ0M(offset.getPackedValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m869invokek4lQ0M(long j) {
                        androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester22, !z1522);
                        if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                            if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() != androidx.compose.foundation.text.HandleState.Selection) {
                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                if (layoutResult != null) {
                                    androidx.compose.foundation.text.TextFieldState textFieldState222 = androidx.compose.foundation.text.TextFieldState.this;
                                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m926setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState222.getProcessor(), offsetMapping22, textFieldState222.getOnValueChange());
                                    if (textFieldState222.getTextDelegate().getText().length() > 0) {
                                        textFieldState222.setHandleState(androidx.compose.foundation.text.HandleState.Cursor);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            textFieldSelectionManager22.m1074deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
                        }
                    }
                }), textFieldSelectionManager22.getMouseSelectionObserver(), textFieldSelectionManager22.getTouchSelectionObserver()), androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                final androidx.compose.ui.Modifier drawBehind22 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                        invoke2(drawScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                            androidx.compose.ui.text.input.OffsetMapping offsetMapping222 = offsetMapping22;
                            androidx.compose.foundation.text.TextFieldState textFieldState222 = androidx.compose.foundation.text.TextFieldState.this;
                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping222, layoutResult.getValue(), textFieldState222.getSelectionPaint());
                        }
                    }
                });
                final boolean z1622 = z4;
                final androidx.compose.ui.Modifier onGloballyPositioned32 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        androidx.compose.foundation.text.TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                        }
                        if (z1622) {
                            if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection) {
                                if (androidx.compose.foundation.text.TextFieldState.this.getShowFloatingToolbar() && androidx.compose.foundation.text.CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo22)) {
                                    textFieldSelectionManager22.showSelectionToolbar$foundation_release();
                                } else {
                                    textFieldSelectionManager22.hideSelectionToolbar$foundation_release();
                                }
                                androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleStart(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleEnd(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, false));
                                androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()));
                            } else if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor) {
                                androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                            }
                            androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue, offsetMapping22);
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            if (layoutResult2 != null) {
                                androidx.compose.foundation.text.TextFieldState textFieldState222 = androidx.compose.foundation.text.TextFieldState.this;
                                androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                                androidx.compose.ui.text.input.OffsetMapping offsetMapping222 = offsetMapping22;
                                androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState222.getInputSession();
                                if (inputSession == null || !textFieldState222.getHasFocus()) {
                                    return;
                                }
                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping222, layoutResult2);
                            }
                        }
                    }
                });
                final boolean z1722 = visualTransformation2 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
                final boolean z1822 = z4;
                final boolean z1922 = z6;
                androidx.compose.ui.Modifier semantics22 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.Modifier.INSTANCE, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, androidx.compose.ui.text.input.TransformedText.this.getText());
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                        if (!z1822) {
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                        }
                        if (z1722) {
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                        }
                        final androidx.compose.foundation.text.TextFieldState textFieldState222 = textFieldState22;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                                boolean z2022;
                                if (androidx.compose.foundation.text.TextFieldState.this.getLayoutResult() != null) {
                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
                                    list.add(layoutResult.getValue());
                                    z2022 = true;
                                } else {
                                    z2022 = false;
                                }
                                return java.lang.Boolean.valueOf(z2022);
                            }
                        }, 1, null);
                        final boolean z2022 = z1922;
                        final boolean z2122 = z1822;
                        final androidx.compose.foundation.text.TextFieldState textFieldState3 = textFieldState22;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                kotlin.Unit unit;
                                if (z2022 || !z2122) {
                                    return false;
                                }
                                androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState3.getInputSession();
                                if (inputSession != null) {
                                    androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState3;
                                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                    unit = kotlin.Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    textFieldState3.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(annotatedString.getText(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString.getText().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                        final boolean z2222 = z1922;
                        final boolean z23 = z1822;
                        final androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState22;
                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                                kotlin.Unit unit;
                                if (z2222 || !z23) {
                                    return false;
                                }
                                androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState4.getInputSession();
                                if (inputSession != null) {
                                    androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                    unit = kotlin.Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                    textFieldState4.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) textFieldValue3.getText(), androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()), (java.lang.CharSequence) annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                        final androidx.compose.ui.text.input.OffsetMapping offsetMapping222 = offsetMapping22;
                        final boolean z24 = z1822;
                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue;
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                        final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState22;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                            }

                            public final java.lang.Boolean invoke(int i3122, int i32, boolean z25) {
                                if (!z25) {
                                    i3122 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i3122);
                                }
                                if (!z25) {
                                    i32 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i32);
                                }
                                boolean z26 = false;
                                if (z24 && (i3122 != androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) || i32 != androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()))) {
                                    if (java.lang.Math.min(i3122, i32) >= 0 && java.lang.Math.max(i3122, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                        if (z25 || i3122 == i32) {
                                            textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                        } else {
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager222, false, 1, null);
                                        }
                                        textFieldState5.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(textFieldValue3.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i3122, i32), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                        z26 = true;
                                    } else {
                                        textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                    }
                                }
                                return java.lang.Boolean.valueOf(z26);
                            }
                        }, 1, null);
                        int imeAction = imeOptions422.getImeAction();
                        final androidx.compose.foundation.text.TextFieldState textFieldState6 = textFieldState22;
                        final androidx.compose.ui.text.input.ImeOptions imeOptions5 = imeOptions422;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.TextFieldState.this.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeOptions5.getImeAction()));
                                return true;
                            }
                        }, 2, null);
                        final androidx.compose.foundation.text.TextFieldState textFieldState7 = textFieldState22;
                        final androidx.compose.ui.focus.FocusRequester focusRequester222 = focusRequester22;
                        final boolean z25 = z1922;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester222, !z25);
                                return true;
                            }
                        }, 1, null);
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && !z1722) {
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (z1822 && !z1922) {
                                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22;
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Boolean invoke() {
                                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.cut$foundation_release();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        }
                        if (!z1822 || z1922) {
                            return;
                        }
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.paste$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                });
                final androidx.compose.ui.Modifier cursor22 = androidx.compose.foundation.text.TextFieldCursorKt.cursor(androidx.compose.ui.Modifier.INSTANCE, textFieldState22, textFieldValue, offsetMapping22, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo22)) ? false : true);
                androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionManager22, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager222 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                androidx.compose.runtime.EffectsKt.DisposableEffect(imeOptions422, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                        if (androidx.compose.ui.text.input.TextInputService.this != null && textFieldState22.getHasFocus()) {
                            textFieldState22.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService.this, textFieldValue, textFieldState22.getProcessor(), imeOptions422, textFieldState22.getOnValueChange(), textFieldState22.getOnImeActionPerformed()));
                        }
                        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, (i2922 >> 3) & 14);
                androidx.compose.ui.Modifier onGloballyPositioned222 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier522.then(textFieldFocusModifier22), textFieldState22, focusManager22), textFieldState22, textFieldSelectionManager22).then(androidx.compose.foundation.text.TextFieldKeyInputKt.m933textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier.INSTANCE, textFieldState22, textFieldSelectionManager22, textFieldValue, textFieldState22.getOnValueChange(), !z6, i3022 == 1, offsetMapping22, undoManager22, imeOptions422.getImeAction())), textFieldScrollerPosition22, mutableInteractionSource622, z4).then(pointerHoverIcon$default22).then(semantics22), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                    }
                });
                if (z4) {
                }
                if (z7) {
                }
                final androidx.compose.ui.Modifier modifier622 = companion;
                final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3422 = function32;
                final androidx.compose.ui.text.TextStyle textStyle522 = textStyle2;
                final int i3122 = i20;
                boolean z2022 = z4;
                final androidx.compose.ui.text.input.VisualTransformation visualTransformation422 = visualTransformation2;
                androidx.compose.ui.text.input.VisualTransformation visualTransformation522 = visualTransformation2;
                final boolean z2122 = z7;
                final boolean z2222 = z6;
                final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1522 = function13;
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                        if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                            }
                            kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function3422;
                            final androidx.compose.foundation.text.TextFieldState textFieldState222 = textFieldState22;
                            final androidx.compose.ui.text.TextStyle textStyle6 = textStyle522;
                            final int i33 = i3122;
                            final int i34 = i3022;
                            final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition222 = textFieldScrollerPosition22;
                            final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                            final androidx.compose.ui.text.input.VisualTransformation visualTransformation6 = visualTransformation422;
                            final androidx.compose.ui.Modifier modifier7 = cursor22;
                            final androidx.compose.ui.Modifier modifier8 = drawBehind22;
                            final androidx.compose.ui.Modifier modifier9 = onGloballyPositioned32;
                            final androidx.compose.ui.Modifier modifier10 = modifier622;
                            final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester222 = bringIntoViewRequester22;
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                            final boolean z23 = z2122;
                            final boolean z24 = z2222;
                            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function16 = function1522;
                            final androidx.compose.ui.text.input.OffsetMapping offsetMapping222 = offsetMapping22;
                            final androidx.compose.ui.unit.Density density222 = density22;
                            function35.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer4, int i35) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                    if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                        }
                                        androidx.compose.ui.Modifier heightInLines = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.text.TextFieldState.this.m945getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                        androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition222;
                                        androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                        androidx.compose.ui.text.input.VisualTransformation visualTransformation7 = visualTransformation6;
                                        final androidx.compose.foundation.text.TextFieldState textFieldState3 = androidx.compose.foundation.text.TextFieldState.this;
                                        androidx.compose.ui.Modifier bringIntoViewRequester3 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final androidx.compose.foundation.text.TextLayoutResultProxy invoke() {
                                                return androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                            }
                                        }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester222);
                                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                                        final androidx.compose.foundation.text.TextFieldState textFieldState4 = androidx.compose.foundation.text.TextFieldState.this;
                                        final boolean z25 = z23;
                                        final boolean z26 = z24;
                                        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function17 = function16;
                                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue4 = textFieldValue2;
                                        final androidx.compose.ui.text.input.OffsetMapping offsetMapping3 = offsetMapping222;
                                        final androidx.compose.ui.unit.Density density3 = density222;
                                        final int i36 = i34;
                                        androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -363167407, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                invoke(composer5, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i37) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                    }
                                                    final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                                    final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function18 = function17;
                                                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue5 = textFieldValue4;
                                                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping4 = offsetMapping3;
                                                    final androidx.compose.ui.unit.Density density4 = density3;
                                                    final int i38 = i36;
                                                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                            return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                            return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                            return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i39);
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        /* renamed from: measure-3p2s80s */
                                                        public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                                                            androidx.compose.runtime.snapshots.Snapshot.Companion companion3 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                                                            androidx.compose.foundation.text.TextFieldState textFieldState6 = androidx.compose.foundation.text.TextFieldState.this;
                                                            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                            try {
                                                                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                try {
                                                                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                    androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                    createNonObservableSnapshot.dispose();
                                                                    kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                    int intValue = m925layout_EkL_Y$foundation_release.component1().intValue();
                                                                    int intValue2 = m925layout_EkL_Y$foundation_release.component2().intValue();
                                                                    androidx.compose.ui.text.TextLayoutResult component3 = m925layout_EkL_Y$foundation_release.component3();
                                                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                                                                        androidx.compose.foundation.text.TextFieldState.this.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3));
                                                                        function18.invoke(component3);
                                                                        androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                    }
                                                                    androidx.compose.foundation.text.TextFieldState.this.m946setMinHeightForSingleLineField0680j_4(density4.mo312toDpu2uoSUM(i38 == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                    return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                            invoke2(placementScope);
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }
                                                                    });
                                                                } finally {
                                                                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                }
                                                            } catch (java.lang.Throwable th) {
                                                                createNonObservableSnapshot.dispose();
                                                                throw th;
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i39) {
                                                            androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                            return androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                        }
                                                    };
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                    boolean z27 = false;
                                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion3);
                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                                    if (textFieldState4.getHandleState() != androidx.compose.foundation.text.HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                                                        if (layoutCoordinates.isAttached() && z25) {
                                                            z27 = true;
                                                        }
                                                    }
                                                    androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                    if (textFieldState4.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor && !z26 && z25) {
                                                        androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer5, 8);
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 6);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager22, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -374338080, true, function222), composer2, 448);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                function14 = function13;
                visualTransformation3 = visualTransformation522;
                brush3 = brush2;
                z8 = z5;
                i22 = i20;
                keyboardActions3 = keyboardActions2;
                z9 = z6;
                i23 = i3022;
                function33 = function32;
                z10 = z2022;
                modifier4 = modifier522;
                imeOptions3 = imeOptions422;
                mutableInteractionSource3 = mutableInteractionSource622;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i262 = i15;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i25 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            visualTransformation2 = none;
            function13 = coreTextFieldKt$CoreTextField$1;
            i21 = i27;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource4;
            textStyle2 = textStyle4;
            mutableInteractionSource2 = mutableInteractionSource5222;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.ui.focus.FocusRequester focusRequester222 = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> localTextInputService222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume1122 = startRestartGroup.consume(localTextInputService222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textInputService = (androidx.compose.ui.text.input.TextInputService) consume1122;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2222 = startRestartGroup.consume(localDensity222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.unit.Density density222 = (androidx.compose.ui.unit.Density) consume2222;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3222 = startRestartGroup.consume(localFontFamilyResolver222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.text.font.FontFamily.Resolver resolver222 = (androidx.compose.ui.text.font.FontFamily.Resolver) consume3222;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors222 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4222 = startRestartGroup.consume(localTextSelectionColors222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long backgroundColor222 = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume4222).getBackgroundColor();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> localFocusManager222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume5222 = startRestartGroup.consume(localFocusManager222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.focus.FocusManager focusManager222 = (androidx.compose.ui.focus.FocusManager) consume5222;
            androidx.compose.ui.Modifier modifier5222 = modifier3;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume6222 = startRestartGroup.consume(localWindowInfo222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.platform.WindowInfo windowInfo222 = (androidx.compose.ui.platform.WindowInfo) consume6222;
            int i29222 = i262;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> localSoftwareKeyboardController222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume7222 = startRestartGroup.consume(localSoftwareKeyboardController222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController222 = (androidx.compose.ui.platform.SoftwareKeyboardController) consume7222;
            final int i30222 = i21;
            final androidx.compose.foundation.gestures.Orientation orientation222 = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
            java.lang.Object[] objArr222 = {orientation222};
            androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> saver222 = androidx.compose.foundation.text.TextFieldScrollerPosition.INSTANCE.getSaver();
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource2;
            startRestartGroup.startReplaceableGroup(294183095);
            changed = startRestartGroup.changed(orientation222);
            final androidx.compose.ui.text.input.ImeOptions imeOptions4222 = imeOptions2;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.text.TextFieldScrollerPosition invoke() {
                    return new androidx.compose.foundation.text.TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation.this, 0.0f, 2, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition222 = (androidx.compose.foundation.text.TextFieldScrollerPosition) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222, (androidx.compose.runtime.saveable.Saver) saver222, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 72, 4);
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
            composition = textFieldValue.getComposition();
            if (composition != null) {
            }
            rememberedValue3 = filterWithValidation;
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.ui.text.input.TransformedText transformedText222 = (androidx.compose.ui.text.input.TransformedText) rememberedValue3;
            androidx.compose.ui.text.AnnotatedString text222 = transformedText222.getText();
            final androidx.compose.ui.text.input.OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
            androidx.compose.runtime.RecomposeScope currentRecomposeScope222 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(softwareKeyboardController222);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = new androidx.compose.foundation.text.TextFieldState(new androidx.compose.foundation.text.TextDelegate(text222, textStyle2, 0, 0, z5, 0, density222, resolver222, null, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope222, softwareKeyboardController222);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text.TextFieldState textFieldState222 = (androidx.compose.foundation.text.TextFieldState) rememberedValue4;
            textFieldState222.m947updatefnh65Uc(textFieldValue.getAnnotatedString(), text222, textStyle2, z5, density222, resolver222, function1, keyboardActions2, focusManager222, backgroundColor222);
            textFieldState222.getProcessor().reset(textFieldValue, textFieldState222.getInputSession());
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text.UndoManager undoManager222 = (androidx.compose.foundation.text.UndoManager) rememberedValue5;
            androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(undoManager222, textFieldValue, 0L, 2, null);
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager222 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) rememberedValue6;
            textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
            textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager222.setOnValueChange$foundation_release(textFieldState222.getOnValueChange());
            textFieldSelectionManager222.setState$foundation_release(textFieldState222);
            textFieldSelectionManager222.setValue$foundation_release(textFieldValue);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume8222 = startRestartGroup.consume(localClipboardManager222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setClipboardManager$foundation_release((androidx.compose.ui.platform.ClipboardManager) consume8222);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume9222 = startRestartGroup.consume(localTextToolbar222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume9222);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume10222 = startRestartGroup.consume(localHapticFeedback222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume10222);
            textFieldSelectionManager222.setFocusRequester(focusRequester222);
            textFieldSelectionManager222.setEditable(!z6);
            startRestartGroup.startReplaceableGroup(773894976);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester222 = (androidx.compose.foundation.relocation.BringIntoViewRequester) rememberedValue8;
            final boolean z13222 = z4;
            final boolean z14222 = z6;
            androidx.compose.ui.Modifier textFieldFocusModifier222 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(androidx.compose.ui.Modifier.INSTANCE, z4, focusRequester222, mutableInteractionSource6222, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                    invoke2(focusState);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                    if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                        return;
                    }
                    androidx.compose.foundation.text.TextFieldState.this.setHasFocus(focusState.isFocused());
                    if (textInputService != null) {
                        if (!androidx.compose.foundation.text.TextFieldState.this.getHasFocus() || !z13222 || z14222) {
                            androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                        } else {
                            androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldValue, imeOptions4222, offsetMapping222);
                        }
                        if (focusState.isFocused() && (layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult()) != null) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester222, textFieldValue, androidx.compose.foundation.text.TextFieldState.this, layoutResult, offsetMapping222, null), 3, null);
                        }
                    }
                    if (focusState.isFocused()) {
                        return;
                    }
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222, null, 1, null);
                }
            });
            startRestartGroup.startReplaceableGroup(-55007276);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
            if (textInputService != null) {
            }
            startRestartGroup.endReplaceableGroup();
            final boolean z15222 = z6;
            androidx.compose.ui.Modifier pointerHoverIcon$default222 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                    invoke(bool.booleanValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(boolean z16222) {
                    androidx.compose.foundation.text.TextFieldState.this.setInTouchMode(z16222);
                }
            }), mutableInteractionSource6222, z4, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    m869invokek4lQ0M(offset.getPackedValue());
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m869invokek4lQ0M(long j) {
                    androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester222, !z15222);
                    if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                        if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() != androidx.compose.foundation.text.HandleState.Selection) {
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                androidx.compose.foundation.text.TextFieldState textFieldState2222 = androidx.compose.foundation.text.TextFieldState.this;
                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m926setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2222.getProcessor(), offsetMapping222, textFieldState2222.getOnValueChange());
                                if (textFieldState2222.getTextDelegate().getText().length() > 0) {
                                    textFieldState2222.setHandleState(androidx.compose.foundation.text.HandleState.Cursor);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        textFieldSelectionManager222.m1074deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
                    }
                }
            }), textFieldSelectionManager222.getMouseSelectionObserver(), textFieldSelectionManager222.getTouchSelectionObserver()), androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            final androidx.compose.ui.Modifier drawBehind222 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    invoke2(drawScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                        androidx.compose.ui.text.input.OffsetMapping offsetMapping2222 = offsetMapping222;
                        androidx.compose.foundation.text.TextFieldState textFieldState2222 = androidx.compose.foundation.text.TextFieldState.this;
                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping2222, layoutResult.getValue(), textFieldState2222.getSelectionPaint());
                    }
                }
            });
            final boolean z16222 = z4;
            final androidx.compose.ui.Modifier onGloballyPositioned322 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                    androidx.compose.foundation.text.TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                    }
                    if (z16222) {
                        if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection) {
                            if (androidx.compose.foundation.text.TextFieldState.this.getShowFloatingToolbar() && androidx.compose.foundation.text.CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo222)) {
                                textFieldSelectionManager222.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager222.hideSelectionToolbar$foundation_release();
                            }
                            androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleStart(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                            androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleEnd(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, false));
                            androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()));
                        } else if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor) {
                            androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                        }
                        androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue, offsetMapping222);
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                        if (layoutResult2 != null) {
                            androidx.compose.foundation.text.TextFieldState textFieldState2222 = androidx.compose.foundation.text.TextFieldState.this;
                            androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                            androidx.compose.ui.text.input.OffsetMapping offsetMapping2222 = offsetMapping222;
                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState2222.getInputSession();
                            if (inputSession == null || !textFieldState2222.getHasFocus()) {
                                return;
                            }
                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2222, layoutResult2);
                        }
                    }
                }
            });
            final boolean z17222 = visualTransformation2 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
            final boolean z18222 = z4;
            final boolean z19222 = z6;
            androidx.compose.ui.Modifier semantics222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.Modifier.INSTANCE, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, androidx.compose.ui.text.input.TransformedText.this.getText());
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                    if (!z18222) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                    }
                    if (z17222) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    }
                    final androidx.compose.foundation.text.TextFieldState textFieldState2222 = textFieldState222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                            boolean z20222;
                            if (androidx.compose.foundation.text.TextFieldState.this.getLayoutResult() != null) {
                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
                                list.add(layoutResult.getValue());
                                z20222 = true;
                            } else {
                                z20222 = false;
                            }
                            return java.lang.Boolean.valueOf(z20222);
                        }
                    }, 1, null);
                    final boolean z20222 = z19222;
                    final boolean z21222 = z18222;
                    final androidx.compose.foundation.text.TextFieldState textFieldState3 = textFieldState222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                            kotlin.Unit unit;
                            if (z20222 || !z21222) {
                                return false;
                            }
                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState3.getInputSession();
                            if (inputSession != null) {
                                androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState3;
                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                unit = kotlin.Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                textFieldState3.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(annotatedString.getText(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString.getText().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                    final boolean z22222 = z19222;
                    final boolean z23 = z18222;
                    final androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState222;
                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                            kotlin.Unit unit;
                            if (z22222 || !z23) {
                                return false;
                            }
                            androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState4.getInputSession();
                            if (inputSession != null) {
                                androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                unit = kotlin.Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                textFieldState4.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) textFieldValue3.getText(), androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()), (java.lang.CharSequence) annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping2222 = offsetMapping222;
                    final boolean z24 = z18222;
                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue;
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                    final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                        }

                        public final java.lang.Boolean invoke(int i31222, int i32, boolean z25) {
                            if (!z25) {
                                i31222 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i31222);
                            }
                            if (!z25) {
                                i32 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i32);
                            }
                            boolean z26 = false;
                            if (z24 && (i31222 != androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) || i32 != androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()))) {
                                if (java.lang.Math.min(i31222, i32) >= 0 && java.lang.Math.max(i31222, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                    if (z25 || i31222 == i32) {
                                        textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                    } else {
                                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2222, false, 1, null);
                                    }
                                    textFieldState5.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(textFieldValue3.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i31222, i32), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                    z26 = true;
                                } else {
                                    textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                }
                            }
                            return java.lang.Boolean.valueOf(z26);
                        }
                    }, 1, null);
                    int imeAction = imeOptions4222.getImeAction();
                    final androidx.compose.foundation.text.TextFieldState textFieldState6 = textFieldState222;
                    final androidx.compose.ui.text.input.ImeOptions imeOptions5 = imeOptions4222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            androidx.compose.foundation.text.TextFieldState.this.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeOptions5.getImeAction()));
                            return true;
                        }
                    }, 2, null);
                    final androidx.compose.foundation.text.TextFieldState textFieldState7 = textFieldState222;
                    final androidx.compose.ui.focus.FocusRequester focusRequester2222 = focusRequester222;
                    final boolean z25 = z19222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester2222, !z25);
                            return true;
                        }
                    }, 1, null);
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && !z17222) {
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (z18222 && !z19222) {
                            final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.cut$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    }
                    if (!z18222 || z19222) {
                        return;
                    }
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.paste$foundation_release();
                            return true;
                        }
                    }, 1, null);
                }
            });
            final androidx.compose.ui.Modifier cursor222 = androidx.compose.foundation.text.TextFieldCursorKt.cursor(androidx.compose.ui.Modifier.INSTANCE, textFieldState222, textFieldValue, offsetMapping222, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo222)) ? false : true);
            androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionManager222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2222 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
            androidx.compose.runtime.EffectsKt.DisposableEffect(imeOptions4222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    if (androidx.compose.ui.text.input.TextInputService.this != null && textFieldState222.getHasFocus()) {
                        textFieldState222.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService.this, textFieldValue, textFieldState222.getProcessor(), imeOptions4222, textFieldState222.getOnValueChange(), textFieldState222.getOnImeActionPerformed()));
                    }
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, startRestartGroup, (i29222 >> 3) & 14);
            androidx.compose.ui.Modifier onGloballyPositioned2222 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier5222.then(textFieldFocusModifier222), textFieldState222, focusManager222), textFieldState222, textFieldSelectionManager222).then(androidx.compose.foundation.text.TextFieldKeyInputKt.m933textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier.INSTANCE, textFieldState222, textFieldSelectionManager222, textFieldValue, textFieldState222.getOnValueChange(), !z6, i30222 == 1, offsetMapping222, undoManager222, imeOptions4222.getImeAction())), textFieldScrollerPosition222, mutableInteractionSource6222, z4).then(pointerHoverIcon$default222).then(semantics222), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                }
            });
            if (z4) {
            }
            if (z7) {
            }
            final androidx.compose.ui.Modifier modifier6222 = companion;
            final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34222 = function32;
            final androidx.compose.ui.text.TextStyle textStyle5222 = textStyle2;
            final int i31222 = i20;
            boolean z20222 = z4;
            final androidx.compose.ui.text.input.VisualTransformation visualTransformation4222 = visualTransformation2;
            androidx.compose.ui.text.input.VisualTransformation visualTransformation5222 = visualTransformation2;
            final boolean z21222 = z7;
            final boolean z22222 = z6;
            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function15222 = function13;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                    if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                        }
                        kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34222;
                        final androidx.compose.foundation.text.TextFieldState textFieldState2222 = textFieldState222;
                        final androidx.compose.ui.text.TextStyle textStyle6 = textStyle5222;
                        final int i33 = i31222;
                        final int i34 = i30222;
                        final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition2222 = textFieldScrollerPosition222;
                        final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                        final androidx.compose.ui.text.input.VisualTransformation visualTransformation6 = visualTransformation4222;
                        final androidx.compose.ui.Modifier modifier7 = cursor222;
                        final androidx.compose.ui.Modifier modifier8 = drawBehind222;
                        final androidx.compose.ui.Modifier modifier9 = onGloballyPositioned322;
                        final androidx.compose.ui.Modifier modifier10 = modifier6222;
                        final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester2222 = bringIntoViewRequester222;
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                        final boolean z23 = z21222;
                        final boolean z24 = z22222;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function16 = function15222;
                        final androidx.compose.ui.text.input.OffsetMapping offsetMapping2222 = offsetMapping222;
                        final androidx.compose.ui.unit.Density density2222 = density222;
                        function35.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                invoke(composer4, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i35) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                    }
                                    androidx.compose.ui.Modifier heightInLines = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.text.TextFieldState.this.m945getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                    androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2222;
                                    androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                    androidx.compose.ui.text.input.VisualTransformation visualTransformation7 = visualTransformation6;
                                    final androidx.compose.foundation.text.TextFieldState textFieldState3 = androidx.compose.foundation.text.TextFieldState.this;
                                    androidx.compose.ui.Modifier bringIntoViewRequester3 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final androidx.compose.foundation.text.TextLayoutResultProxy invoke() {
                                            return androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                        }
                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2222);
                                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                                    final androidx.compose.foundation.text.TextFieldState textFieldState4 = androidx.compose.foundation.text.TextFieldState.this;
                                    final boolean z25 = z23;
                                    final boolean z26 = z24;
                                    final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function17 = function16;
                                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue4 = textFieldValue2;
                                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping3 = offsetMapping2222;
                                    final androidx.compose.ui.unit.Density density3 = density2222;
                                    final int i36 = i34;
                                    androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -363167407, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i37) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                            if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                }
                                                final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                                final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function18 = function17;
                                                final androidx.compose.ui.text.input.TextFieldValue textFieldValue5 = textFieldValue4;
                                                final androidx.compose.ui.text.input.OffsetMapping offsetMapping4 = offsetMapping3;
                                                final androidx.compose.ui.unit.Density density4 = density3;
                                                final int i38 = i36;
                                                androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i39);
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    /* renamed from: measure-3p2s80s */
                                                    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                                                        androidx.compose.runtime.snapshots.Snapshot.Companion companion3 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                                                        androidx.compose.foundation.text.TextFieldState textFieldState6 = androidx.compose.foundation.text.TextFieldState.this;
                                                        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                        try {
                                                            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                            try {
                                                                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                createNonObservableSnapshot.dispose();
                                                                kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                int intValue = m925layout_EkL_Y$foundation_release.component1().intValue();
                                                                int intValue2 = m925layout_EkL_Y$foundation_release.component2().intValue();
                                                                androidx.compose.ui.text.TextLayoutResult component3 = m925layout_EkL_Y$foundation_release.component3();
                                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                                                                    androidx.compose.foundation.text.TextFieldState.this.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3));
                                                                    function18.invoke(component3);
                                                                    androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                }
                                                                androidx.compose.foundation.text.TextFieldState.this.m946setMinHeightForSingleLineField0680j_4(density4.mo312toDpu2uoSUM(i38 == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                        invoke2(placementScope);
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }
                                                                });
                                                            } finally {
                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                            }
                                                        } catch (java.lang.Throwable th) {
                                                            createNonObservableSnapshot.dispose();
                                                            throw th;
                                                        }
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i39) {
                                                        androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                        return androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                    }
                                                };
                                                composer5.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                boolean z27 = false;
                                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion3);
                                                if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                                if (textFieldState4.getHandleState() != androidx.compose.foundation.text.HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                                                    if (layoutCoordinates.isAttached() && z25) {
                                                        z27 = true;
                                                    }
                                                }
                                                androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                if (textFieldState4.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor && !z26 && z25) {
                                                    androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer5, 8);
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -374338080, true, function2222), composer2, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            function14 = function13;
            visualTransformation3 = visualTransformation5222;
            brush3 = brush2;
            z8 = z5;
            i22 = i20;
            keyboardActions3 = keyboardActions2;
            z9 = z6;
            i23 = i30222;
            function33 = function32;
            z10 = z20222;
            modifier4 = modifier5222;
            imeOptions3 = imeOptions4222;
            mutableInteractionSource3 = mutableInteractionSource6222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i2622 = i15;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i25 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        visualTransformation2 = none;
        function13 = coreTextFieldKt$CoreTextField$1;
        i21 = i27;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource4;
        textStyle2 = textStyle4;
        mutableInteractionSource2 = mutableInteractionSource52222;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.ui.focus.FocusRequester focusRequester2222 = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> localTextInputService2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume11222 = startRestartGroup.consume(localTextInputService2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textInputService = (androidx.compose.ui.text.input.TextInputService) consume11222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22222 = startRestartGroup.consume(localDensity2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.unit.Density density2222 = (androidx.compose.ui.unit.Density) consume22222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> localFontFamilyResolver2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32222 = startRestartGroup.consume(localFontFamilyResolver2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.text.font.FontFamily.Resolver resolver2222 = (androidx.compose.ui.text.font.FontFamily.Resolver) consume32222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors2222 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume42222 = startRestartGroup.consume(localTextSelectionColors2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long backgroundColor2222 = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume42222).getBackgroundColor();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> localFocusManager2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume52222 = startRestartGroup.consume(localFocusManager2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.focus.FocusManager focusManager2222 = (androidx.compose.ui.focus.FocusManager) consume52222;
        androidx.compose.ui.Modifier modifier52222 = modifier3;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume62222 = startRestartGroup.consume(localWindowInfo2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.platform.WindowInfo windowInfo2222 = (androidx.compose.ui.platform.WindowInfo) consume62222;
        int i292222 = i2622;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> localSoftwareKeyboardController2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume72222 = startRestartGroup.consume(localSoftwareKeyboardController2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2222 = (androidx.compose.ui.platform.SoftwareKeyboardController) consume72222;
        final int i302222 = i21;
        final androidx.compose.foundation.gestures.Orientation orientation2222 = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
        java.lang.Object[] objArr2222 = {orientation2222};
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> saver2222 = androidx.compose.foundation.text.TextFieldScrollerPosition.INSTANCE.getSaver();
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource2;
        startRestartGroup.startReplaceableGroup(294183095);
        changed = startRestartGroup.changed(orientation2222);
        final androidx.compose.ui.text.input.ImeOptions imeOptions42222 = imeOptions2;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.foundation.text.TextFieldScrollerPosition invoke() {
                return new androidx.compose.foundation.text.TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation.this, 0.0f, 2, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition2222 = (androidx.compose.foundation.text.TextFieldScrollerPosition) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2222, (androidx.compose.runtime.saveable.Saver) saver2222, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 72, 4);
        startRestartGroup.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        filterWithValidation = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
        composition = textFieldValue.getComposition();
        if (composition != null) {
        }
        rememberedValue3 = filterWithValidation;
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.ui.text.input.TransformedText transformedText2222 = (androidx.compose.ui.text.input.TransformedText) rememberedValue3;
        androidx.compose.ui.text.AnnotatedString text2222 = transformedText2222.getText();
        final androidx.compose.ui.text.input.OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
        androidx.compose.runtime.RecomposeScope currentRecomposeScope2222 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(softwareKeyboardController2222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = new androidx.compose.foundation.text.TextFieldState(new androidx.compose.foundation.text.TextDelegate(text2222, textStyle2, 0, 0, z5, 0, density2222, resolver2222, null, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2222, softwareKeyboardController2222);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text.TextFieldState textFieldState2222 = (androidx.compose.foundation.text.TextFieldState) rememberedValue4;
        textFieldState2222.m947updatefnh65Uc(textFieldValue.getAnnotatedString(), text2222, textStyle2, z5, density2222, resolver2222, function1, keyboardActions2, focusManager2222, backgroundColor2222);
        textFieldState2222.getProcessor().reset(textFieldValue, textFieldState2222.getInputSession());
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.text.UndoManager undoManager2222 = (androidx.compose.foundation.text.UndoManager) rememberedValue5;
        androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(undoManager2222, textFieldValue, 0L, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2222 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) rememberedValue6;
        textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
        textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation2);
        textFieldSelectionManager2222.setOnValueChange$foundation_release(textFieldState2222.getOnValueChange());
        textFieldSelectionManager2222.setState$foundation_release(textFieldState2222);
        textFieldSelectionManager2222.setValue$foundation_release(textFieldValue);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume82222 = startRestartGroup.consume(localClipboardManager2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setClipboardManager$foundation_release((androidx.compose.ui.platform.ClipboardManager) consume82222);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume92222 = startRestartGroup.consume(localTextToolbar2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume92222);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume102222 = startRestartGroup.consume(localHapticFeedback2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume102222);
        textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
        textFieldSelectionManager2222.setEditable(!z6);
        startRestartGroup.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final kotlinx.coroutines.CoroutineScope coroutineScope2222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester2222 = (androidx.compose.foundation.relocation.BringIntoViewRequester) rememberedValue8;
        final boolean z132222 = z4;
        final boolean z142222 = z6;
        androidx.compose.ui.Modifier textFieldFocusModifier2222 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(androidx.compose.ui.Modifier.INSTANCE, z4, focusRequester2222, mutableInteractionSource62222, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                invoke2(focusState);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                    return;
                }
                androidx.compose.foundation.text.TextFieldState.this.setHasFocus(focusState.isFocused());
                if (textInputService != null) {
                    if (!androidx.compose.foundation.text.TextFieldState.this.getHasFocus() || !z132222 || z142222) {
                        androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                    } else {
                        androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldValue, imeOptions42222, offsetMapping2222);
                    }
                    if (focusState.isFocused() && (layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult()) != null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2222, textFieldValue, androidx.compose.foundation.text.TextFieldState.this, layoutResult, offsetMapping2222, null), 3, null);
                    }
                }
                if (focusState.isFocused()) {
                    return;
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2222, null, 1, null);
            }
        });
        startRestartGroup.startReplaceableGroup(-55007276);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
        if (textInputService != null) {
        }
        startRestartGroup.endReplaceableGroup();
        final boolean z152222 = z6;
        androidx.compose.ui.Modifier pointerHoverIcon$default2222 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput(androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                invoke(bool.booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(boolean z162222) {
                androidx.compose.foundation.text.TextFieldState.this.setInTouchMode(z162222);
            }
        }), mutableInteractionSource62222, z4, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                m869invokek4lQ0M(offset.getPackedValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m869invokek4lQ0M(long j) {
                androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester2222, !z152222);
                if (androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                    if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() != androidx.compose.foundation.text.HandleState.Selection) {
                        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            androidx.compose.foundation.text.TextFieldState textFieldState22222 = androidx.compose.foundation.text.TextFieldState.this;
                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m926setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState22222.getProcessor(), offsetMapping2222, textFieldState22222.getOnValueChange());
                            if (textFieldState22222.getTextDelegate().getText().length() > 0) {
                                textFieldState22222.setHandleState(androidx.compose.foundation.text.HandleState.Cursor);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    textFieldSelectionManager2222.m1074deselect_kEHs6E$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
                }
            }
        }), textFieldSelectionManager2222.getMouseSelectionObserver(), textFieldSelectionManager2222.getTouchSelectionObserver()), androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        final androidx.compose.ui.Modifier drawBehind2222 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                invoke2(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                    androidx.compose.ui.text.input.OffsetMapping offsetMapping22222 = offsetMapping2222;
                    androidx.compose.foundation.text.TextFieldState textFieldState22222 = androidx.compose.foundation.text.TextFieldState.this;
                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping22222, layoutResult.getValue(), textFieldState22222.getSelectionPaint());
                }
            }
        });
        final boolean z162222 = z4;
        final androidx.compose.ui.Modifier onGloballyPositioned3222 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.foundation.text.TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                }
                if (z162222) {
                    if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection) {
                        if (androidx.compose.foundation.text.TextFieldState.this.getShowFloatingToolbar() && androidx.compose.foundation.text.CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo2222)) {
                            textFieldSelectionManager2222.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager2222.hideSelectionToolbar$foundation_release();
                        }
                        androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleStart(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                        androidx.compose.foundation.text.TextFieldState.this.setShowSelectionHandleEnd(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, false));
                        androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()));
                    } else if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor) {
                        androidx.compose.foundation.text.TextFieldState.this.setShowCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                    }
                    androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue, offsetMapping2222);
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                    if (layoutResult2 != null) {
                        androidx.compose.foundation.text.TextFieldState textFieldState22222 = androidx.compose.foundation.text.TextFieldState.this;
                        androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                        androidx.compose.ui.text.input.OffsetMapping offsetMapping22222 = offsetMapping2222;
                        androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState22222.getInputSession();
                        if (inputSession == null || !textFieldState22222.getHasFocus()) {
                            return;
                        }
                        androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22222, layoutResult2);
                    }
                }
            }
        });
        final boolean z172222 = visualTransformation2 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
        final boolean z182222 = z4;
        final boolean z192222 = z6;
        androidx.compose.ui.Modifier semantics2222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.Modifier.INSTANCE, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, androidx.compose.ui.text.input.TransformedText.this.getText());
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m3809setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                if (!z182222) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                if (z172222) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                }
                final androidx.compose.foundation.text.TextFieldState textFieldState22222 = textFieldState2222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> list) {
                        boolean z202222;
                        if (androidx.compose.foundation.text.TextFieldState.this.getLayoutResult() != null) {
                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
                            list.add(layoutResult.getValue());
                            z202222 = true;
                        } else {
                            z202222 = false;
                        }
                        return java.lang.Boolean.valueOf(z202222);
                    }
                }, 1, null);
                final boolean z202222 = z192222;
                final boolean z212222 = z182222;
                final androidx.compose.foundation.text.TextFieldState textFieldState3 = textFieldState2222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                        kotlin.Unit unit;
                        if (z202222 || !z212222) {
                            return false;
                        }
                        androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState3.getInputSession();
                        if (inputSession != null) {
                            androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState3;
                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                            unit = kotlin.Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            textFieldState3.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(annotatedString.getText(), androidx.compose.ui.text.TextRangeKt.TextRange(annotatedString.getText().length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                        return true;
                    }
                }, 1, null);
                final boolean z222222 = z192222;
                final boolean z23 = z182222;
                final androidx.compose.foundation.text.TextFieldState textFieldState4 = textFieldState2222;
                final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(androidx.compose.ui.text.AnnotatedString annotatedString) {
                        kotlin.Unit unit;
                        if (z222222 || !z23) {
                            return false;
                        }
                        androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState4.getInputSession();
                        if (inputSession != null) {
                            androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.FinishComposingTextCommand(), new androidx.compose.ui.text.input.CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                            unit = kotlin.Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                            textFieldState4.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) textFieldValue3.getText(), androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()), androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()), (java.lang.CharSequence) annotatedString).toString(), androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                        return true;
                    }
                }, 1, null);
                final androidx.compose.ui.text.input.OffsetMapping offsetMapping22222 = offsetMapping2222;
                final boolean z24 = z182222;
                final androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue;
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState2222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                    }

                    public final java.lang.Boolean invoke(int i312222, int i32, boolean z25) {
                        if (!z25) {
                            i312222 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i312222);
                        }
                        if (!z25) {
                            i32 = androidx.compose.ui.text.input.OffsetMapping.this.transformedToOriginal(i32);
                        }
                        boolean z26 = false;
                        if (z24 && (i312222 != androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue3.getSelection()) || i32 != androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue3.getSelection()))) {
                            if (java.lang.Math.min(i312222, i32) >= 0 && java.lang.Math.max(i312222, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                if (z25 || i312222 == i32) {
                                    textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                } else {
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22222, false, 1, null);
                                }
                                textFieldState5.getOnValueChange().invoke(new androidx.compose.ui.text.input.TextFieldValue(textFieldValue3.getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(i312222, i32), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                z26 = true;
                            } else {
                                textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                            }
                        }
                        return java.lang.Boolean.valueOf(z26);
                    }
                }, 1, null);
                int imeAction = imeOptions42222.getImeAction();
                final androidx.compose.foundation.text.TextFieldState textFieldState6 = textFieldState2222;
                final androidx.compose.ui.text.input.ImeOptions imeOptions5 = imeOptions42222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m3805onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        androidx.compose.foundation.text.TextFieldState.this.getOnImeActionPerformed().invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeOptions5.getImeAction()));
                        return true;
                    }
                }, 2, null);
                final androidx.compose.foundation.text.TextFieldState textFieldState7 = textFieldState2222;
                final androidx.compose.ui.focus.FocusRequester focusRequester22222 = focusRequester2222;
                final boolean z25 = z192222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        androidx.compose.foundation.text.CoreTextFieldKt.tapToFocus(androidx.compose.foundation.text.TextFieldState.this, focusRequester22222, !z25);
                        return true;
                    }
                }, 1, null);
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                        return true;
                    }
                }, 1, null);
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldValue.getSelection()) && !z172222) {
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2222;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager.copy$foundation_release$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (z182222 && !z192222) {
                        final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2222;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.cut$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                }
                if (!z182222 || z192222) {
                    return;
                }
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2222;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.paste$foundation_release();
                        return true;
                    }
                }, 1, null);
            }
        });
        final androidx.compose.ui.Modifier cursor2222 = androidx.compose.foundation.text.TextFieldCursorKt.cursor(androidx.compose.ui.Modifier.INSTANCE, textFieldState2222, textFieldValue, offsetMapping2222, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo2222)) ? false : true);
        androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionManager2222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22222 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
            }
        }, startRestartGroup, 8);
        androidx.compose.runtime.EffectsKt.DisposableEffect(imeOptions42222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                if (androidx.compose.ui.text.input.TextInputService.this != null && textFieldState2222.getHasFocus()) {
                    textFieldState2222.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService.this, textFieldValue, textFieldState2222.getProcessor(), imeOptions42222, textFieldState2222.getOnValueChange(), textFieldState2222.getOnImeActionPerformed()));
                }
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, (i292222 >> 3) & 14);
        androidx.compose.ui.Modifier onGloballyPositioned22222 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier52222.then(textFieldFocusModifier2222), textFieldState2222, focusManager2222), textFieldState2222, textFieldSelectionManager2222).then(androidx.compose.foundation.text.TextFieldKeyInputKt.m933textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier.INSTANCE, textFieldState2222, textFieldSelectionManager2222, textFieldValue, textFieldState2222.getOnValueChange(), !z6, i302222 == 1, offsetMapping2222, undoManager2222, imeOptions42222.getImeAction())), textFieldScrollerPosition2222, mutableInteractionSource62222, z4).then(pointerHoverIcon$default2222).then(semantics2222), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
            }
        });
        if (z4) {
        }
        if (z7) {
        }
        final androidx.compose.ui.Modifier modifier62222 = companion;
        final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342222 = function32;
        final androidx.compose.ui.text.TextStyle textStyle52222 = textStyle2;
        final int i312222 = i20;
        boolean z202222 = z4;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation42222 = visualTransformation2;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation52222 = visualTransformation2;
        final boolean z212222 = z7;
        final boolean z222222 = z6;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function152222 = function13;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22222 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

            public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                    }
                    kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function342222;
                    final androidx.compose.foundation.text.TextFieldState textFieldState22222 = textFieldState2222;
                    final androidx.compose.ui.text.TextStyle textStyle6 = textStyle52222;
                    final int i33 = i312222;
                    final int i34 = i302222;
                    final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition22222 = textFieldScrollerPosition2222;
                    final androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = textFieldValue;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation6 = visualTransformation42222;
                    final androidx.compose.ui.Modifier modifier7 = cursor2222;
                    final androidx.compose.ui.Modifier modifier8 = drawBehind2222;
                    final androidx.compose.ui.Modifier modifier9 = onGloballyPositioned3222;
                    final androidx.compose.ui.Modifier modifier10 = modifier62222;
                    final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester22222 = bringIntoViewRequester2222;
                    final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                    final boolean z23 = z212222;
                    final boolean z24 = z222222;
                    final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function16 = function152222;
                    final androidx.compose.ui.text.input.OffsetMapping offsetMapping22222 = offsetMapping2222;
                    final androidx.compose.ui.unit.Density density22222 = density2222;
                    function35.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                            invoke(composer4, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer4, int i35) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                            if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                }
                                androidx.compose.ui.Modifier heightInLines = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.text.TextFieldState.this.m945getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22222;
                                androidx.compose.ui.text.input.TextFieldValue textFieldValue3 = textFieldValue2;
                                androidx.compose.ui.text.input.VisualTransformation visualTransformation7 = visualTransformation6;
                                final androidx.compose.foundation.text.TextFieldState textFieldState3 = androidx.compose.foundation.text.TextFieldState.this;
                                androidx.compose.ui.Modifier bringIntoViewRequester3 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final androidx.compose.foundation.text.TextLayoutResultProxy invoke() {
                                        return androidx.compose.foundation.text.TextFieldState.this.getLayoutResult();
                                    }
                                }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22222);
                                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                                final androidx.compose.foundation.text.TextFieldState textFieldState4 = androidx.compose.foundation.text.TextFieldState.this;
                                final boolean z25 = z23;
                                final boolean z26 = z24;
                                final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function17 = function16;
                                final androidx.compose.ui.text.input.TextFieldValue textFieldValue4 = textFieldValue2;
                                final androidx.compose.ui.text.input.OffsetMapping offsetMapping3 = offsetMapping22222;
                                final androidx.compose.ui.unit.Density density3 = density22222;
                                final int i36 = i34;
                                androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -363167407, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer5, int i37) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                        if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                            }
                                            final androidx.compose.foundation.text.TextFieldState textFieldState5 = textFieldState4;
                                            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function18 = function17;
                                            final androidx.compose.ui.text.input.TextFieldValue textFieldValue5 = textFieldValue4;
                                            final androidx.compose.ui.text.input.OffsetMapping offsetMapping4 = offsetMapping3;
                                            final androidx.compose.ui.unit.Density density4 = density3;
                                            final int i38 = i36;
                                            androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i39);
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i39) {
                                                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i39);
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                                                    androidx.compose.runtime.snapshots.Snapshot.Companion companion3 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                                                    androidx.compose.foundation.text.TextFieldState textFieldState6 = androidx.compose.foundation.text.TextFieldState.this;
                                                    androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                    try {
                                                        androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                        try {
                                                            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                            androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                            createNonObservableSnapshot.dispose();
                                                            kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                            int intValue = m925layout_EkL_Y$foundation_release.component1().intValue();
                                                            int intValue2 = m925layout_EkL_Y$foundation_release.component2().intValue();
                                                            androidx.compose.ui.text.TextLayoutResult component3 = m925layout_EkL_Y$foundation_release.component3();
                                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                                                                androidx.compose.foundation.text.TextFieldState.this.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3));
                                                                function18.invoke(component3);
                                                                androidx.compose.foundation.text.CoreTextFieldKt.notifyFocusedRect(androidx.compose.foundation.text.TextFieldState.this, textFieldValue5, offsetMapping4);
                                                            }
                                                            androidx.compose.foundation.text.TextFieldState.this.m946setMinHeightForSingleLineField0680j_4(density4.mo312toDpu2uoSUM(i38 == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                            return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return kotlin.Unit.INSTANCE;
                                                                }
                                                            });
                                                        } finally {
                                                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                        }
                                                    } catch (java.lang.Throwable th) {
                                                        createNonObservableSnapshot.dispose();
                                                        throw th;
                                                    }
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i39) {
                                                    androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                    return androidx.compose.foundation.text.TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                }
                                            };
                                            composer5.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                            boolean z27 = false;
                                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion3);
                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager4 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                                            if (textFieldState4.getHandleState() != androidx.compose.foundation.text.HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
                                                if (layoutCoordinates.isAttached() && z25) {
                                                    z27 = true;
                                                }
                                            }
                                            androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                            if (textFieldState4.getHandleState() == androidx.compose.foundation.text.HandleState.Cursor && !z26 && z25) {
                                                androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer5, 8);
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -374338080, true, function22222), composer2, 448);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        function14 = function13;
        visualTransformation3 = visualTransformation52222;
        brush3 = brush2;
        z8 = z5;
        i22 = i20;
        keyboardActions3 = keyboardActions2;
        z9 = z6;
        i23 = i302222;
        function33 = function32;
        z10 = z202222;
        modifier4 = modifier52222;
        imeOptions3 = imeOptions42222;
        mutableInteractionSource3 = mutableInteractionSource62222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-20551815);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)747@33825L95:CoreTextField.kt#423gt5");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087268488, "C748@33881L33:CoreTextField.kt#423gt5");
        startRestartGroup.startReplaceableGroup(-1985516685);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ContextMenuArea)P(1)29@1062L9:ContextMenu.android.kt#423gt5");
        function2.invoke(startRestartGroup, java.lang.Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox(androidx.compose.ui.Modifier.this, textFieldSelectionManager, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final androidx.compose.ui.Modifier previewKeyEventToDeselectOnBack(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.TextFieldState textFieldState, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        return androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                return m871invokeZmokQxo(keyEvent.m3123unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final java.lang.Boolean m871invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (androidx.compose.foundation.text.TextFieldState.this.getHandleState() == androidx.compose.foundation.text.HandleState.Selection && androidx.compose.foundation.text.KeyEventHelpers_androidKt.m873cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1070deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.ui.focus.FocusRequester focusRequester, boolean z) {
        androidx.compose.ui.platform.SoftwareKeyboardController keyboardController;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = textFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        textFieldState.setInputSession(androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(androidx.compose.foundation.text.TextFieldState textFieldState) {
        androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final java.lang.Object bringSelectionEndIntoView(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.geometry.Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 1.0f, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        java.lang.Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(626339208);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)1101@48248L202:CoreTextField.kt#423gt5");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z) {
            androidx.compose.foundation.text.TextFieldState state = textFieldSelectionManager.getState();
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
            if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                if (!(textFieldSelectionManager.getState() != null ? r3.getIsLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    androidx.compose.ui.text.style.ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    androidx.compose.ui.text.style.ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(java.lang.Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498386756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "1094@47925L203");
                    androidx.compose.foundation.text.TextFieldState state2 = textFieldSelectionManager.getState();
                    if (state2 != null && state2.getShowSelectionHandleStart()) {
                        androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.text.TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleEnd()) {
                        androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                androidx.compose.foundation.text.TextFieldState state4 = textFieldSelectionManager.getState();
                if (state4 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state4.setShowFloatingToolbar(false);
                    }
                    if (state4.getHasFocus()) {
                        if (state4.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, z, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.ui.text.AnnotatedString transformedText$foundation_release;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)1127@49342L50,1128@49455L7,1129@49472L1101:CoreTextField.kt#423gt5");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        androidx.compose.foundation.text.TextFieldState state = textFieldSelectionManager.getState();
        if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textFieldSelectionManager);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text.TextDragObserver textDragObserver = (androidx.compose.foundation.text.TextDragObserver) rememberedValue;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final long m1076getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m1076getCursorPositiontuRUvjQ$foundation_release((androidx.compose.ui.unit.Density) consume);
            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, textDragObserver, new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, textFieldSelectionManager, null));
            startRestartGroup.startReplaceableGroup(294220498);
            boolean changed2 = startRestartGroup.changed(m1076getCursorPositiontuRUvjQ$foundation_release);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.getSelectionHandleInfoKey(), new androidx.compose.foundation.text.selection.SelectionHandleInfo(androidx.compose.foundation.text.Handle.Cursor, m1076getCursorPositiontuRUvjQ$foundation_release, androidx.compose.foundation.text.selection.SelectionHandleAnchor.Middle, true, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.m849CursorHandleULxng0E(m1076getCursorPositiontuRUvjQ$foundation_release, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(pointerInput, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                androidx.compose.ui.text.input.TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
