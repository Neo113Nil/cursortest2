package androidx.compose.foundation.text;

/* compiled from: BasicTextField.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010&\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020%X\u008a\u008e\u0002"}, d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3, int i, int i2, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4, final int i5) {
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
        androidx.compose.ui.Modifier.Companion companion;
        boolean z4;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i20;
        boolean z5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        int i21;
        int i22;
        androidx.compose.ui.graphics.SolidColor solidColor;
        int i23;
        kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.ui.graphics.Brush brush2;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        boolean z6;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        boolean z7;
        int i24;
        int i25;
        java.lang.Object rememberedValue;
        boolean changed;
        java.lang.Object rememberedValue2;
        boolean changed2;
        java.lang.Object rememberedValue3;
        boolean changed3;
        java.lang.Object rememberedValue4;
        boolean z8;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        int i26;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation3;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        boolean z9;
        int i27;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i28;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(945255183);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)141@8417L39,148@8811L57,154@9153L227,163@9701L41,165@9748L1032:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i29 = i5 & 4;
        if (i29 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z3) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 1879048192) == 0) {
                    if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                        i28 = 536870912;
                        i6 |= i28;
                    }
                    i28 = 268435456;
                    i6 |= i28;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i30 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i30 |= 384;
                } else if ((i4 & 896) == 0) {
                    i30 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i30 |= 3072;
                    } else if ((i4 & 7168) == 0) {
                        i30 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i30 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i30 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i30 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i30 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i30) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i29 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                z4 = i7 != 0 ? true : z;
                                boolean z10 = i8 != 0 ? false : z2;
                                androidx.compose.ui.text.TextStyle textStyle4 = i9 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i10 != 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                keyboardActions2 = i11 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z11 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i20 = z11 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i31 = i13 != 0 ? 1 : i2;
                                androidx.compose.ui.text.input.VisualTransformation none = i15 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 basicTextFieldKt$BasicTextField$1 = i16 != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i17 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    z5 = z11;
                                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue5;
                                } else {
                                    z5 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 != 0) {
                                    i21 = i6;
                                    i22 = i31;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                } else {
                                    i21 = i6;
                                    i22 = i31;
                                    solidColor = brush;
                                }
                                if (i19 != 0) {
                                    i23 = i22;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush2 = solidColor;
                                    function32 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE.m864getLambda1$foundation_release();
                                } else {
                                    i23 = i22;
                                    function32 = function3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush2 = solidColor;
                                }
                                visualTransformation2 = none;
                                function13 = basicTextFieldKt$BasicTextField$1;
                                z6 = z10;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                z7 = z5;
                                i24 = i21;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                companion = modifier;
                                z4 = z;
                                z6 = z2;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i20 = i;
                                i23 = i2;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                i24 = i6;
                                textStyle2 = textStyle;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                i25 = i20;
                                androidx.compose.runtime.ComposerKt.traceEventStart(945255183, i24, i30, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:145)");
                            } else {
                                i25 = i20;
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                            final androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default = androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null);
                            startRestartGroup.startReplaceableGroup(623728715);
                            changed = startRestartGroup.changed(m4201copy3r_uNRQ$default) | startRestartGroup.changed(mutableState);
                            boolean z12 = z6;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                        invoke2();
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2;
                                        androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$22;
                                        long selection = androidx.compose.ui.text.input.TextFieldValue.this.getSelection();
                                        BasicTextField$lambda$2 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState);
                                        if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(selection, BasicTextField$lambda$2.getSelection())) {
                                            androidx.compose.ui.text.TextRange composition = androidx.compose.ui.text.input.TextFieldValue.this.getComposition();
                                            BasicTextField$lambda$22 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState);
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(composition, BasicTextField$lambda$22.getComposition())) {
                                                return;
                                            }
                                        }
                                        mutableState.setValue(androidx.compose.ui.text.input.TextFieldValue.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(str);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                            androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z13 = !z7;
                            int i32 = z7 ? 1 : i23;
                            int i33 = z7 ? 1 : i25;
                            startRestartGroup.startReplaceableGroup(623729370);
                            androidx.compose.foundation.text.KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            changed3 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(function1);
                            boolean z14 = z7;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                                        invoke2(textFieldValue);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                                        java.lang.String BasicTextField$lambda$6;
                                        mutableState.setValue(textFieldValue);
                                        BasicTextField$lambda$6 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$6(mutableState2);
                                        boolean z15 = !kotlin.jvm.internal.Intrinsics.areEqual(BasicTextField$lambda$6, textFieldValue.getText());
                                        mutableState2.setValue(textFieldValue.getText());
                                        if (z15) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i34 = i30 << 9;
                            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(m4201copy3r_uNRQ$default, (kotlin.jvm.functions.Function1) rememberedValue4, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z13, i33, i32, imeOptions$foundation_release, keyboardActions2, z4, z12, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i34 & 57344) | (i34 & 458752) | (3670016 & i34) | (i34 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z8 = z12;
                            keyboardOptions3 = keyboardOptions5;
                            i26 = i23;
                            textStyle3 = textStyle2;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            function33 = function32;
                            z9 = z14;
                            i27 = i25;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z;
                            z8 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z9 = z3;
                            i27 = i;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function33 = function3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final boolean z15 = z4;
                            final boolean z16 = z8;
                            final androidx.compose.ui.text.TextStyle textStyle5 = textStyle3;
                            final androidx.compose.foundation.text.KeyboardOptions keyboardOptions6 = keyboardOptions3;
                            final androidx.compose.foundation.text.KeyboardActions keyboardActions3 = keyboardActions2;
                            final boolean z17 = z9;
                            final int i35 = i27;
                            final int i36 = i26;
                            final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation3;
                            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function15 = function14;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            final androidx.compose.ui.graphics.Brush brush3 = brush2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i37) {
                                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(str, function1, modifier3, z15, z16, textStyle5, keyboardOptions6, keyboardActions3, z17, i35, i36, visualTransformation4, function15, mutableInteractionSource4, brush3, function33, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
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
                    if (i29 != 0) {
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
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
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
                    function13 = basicTextFieldKt$BasicTextField$1;
                    z6 = z10;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    z7 = z5;
                    i24 = i21;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue;
                    final androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default2 = androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState3), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null);
                    startRestartGroup.startReplaceableGroup(623728715);
                    changed = startRestartGroup.changed(m4201copy3r_uNRQ$default2) | startRestartGroup.changed(mutableState3);
                    boolean z122 = z6;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2;
                            androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$22;
                            long selection = androidx.compose.ui.text.input.TextFieldValue.this.getSelection();
                            BasicTextField$lambda$2 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState3);
                            if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(selection, BasicTextField$lambda$2.getSelection())) {
                                androidx.compose.ui.text.TextRange composition = androidx.compose.ui.text.input.TextFieldValue.this.getComposition();
                                BasicTextField$lambda$22 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState3);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(composition, BasicTextField$lambda$22.getComposition())) {
                                    return;
                                }
                            }
                            mutableState3.setValue(androidx.compose.ui.text.input.TextFieldValue.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(str);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState<java.lang.String> mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue3;
                    androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z132 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    startRestartGroup.startReplaceableGroup(623729370);
                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions52 = keyboardOptions2;
                    changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(function1);
                    boolean z142 = z7;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                            java.lang.String BasicTextField$lambda$6;
                            mutableState3.setValue(textFieldValue);
                            BasicTextField$lambda$6 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$6(mutableState22);
                            boolean z152 = !kotlin.jvm.internal.Intrinsics.areEqual(BasicTextField$lambda$6, textFieldValue.getText());
                            mutableState22.setValue(textFieldValue.getText());
                            if (z152) {
                                function1.invoke(textFieldValue.getText());
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    int i342 = i30 << 9;
                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(m4201copy3r_uNRQ$default2, (kotlin.jvm.functions.Function1) rememberedValue4, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z132, i33, i32, imeOptions$foundation_release2, keyboardActions2, z4, z122, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i342 & 57344) | (i342 & 458752) | (3670016 & i342) | (i342 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z8 = z122;
                    keyboardOptions3 = keyboardOptions52;
                    i26 = i23;
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation2;
                    function14 = function13;
                    function33 = function32;
                    z9 = z142;
                    i27 = i25;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
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
                if (i29 != 0) {
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
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
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
                function13 = basicTextFieldKt$BasicTextField$1;
                z6 = z10;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z5;
                i24 = i21;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState32 = (androidx.compose.runtime.MutableState) rememberedValue;
                final androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default22 = androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState32), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null);
                startRestartGroup.startReplaceableGroup(623728715);
                changed = startRestartGroup.changed(m4201copy3r_uNRQ$default22) | startRestartGroup.changed(mutableState32);
                boolean z1222 = z6;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2;
                        androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$22;
                        long selection = androidx.compose.ui.text.input.TextFieldValue.this.getSelection();
                        BasicTextField$lambda$2 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState32);
                        if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(selection, BasicTextField$lambda$2.getSelection())) {
                            androidx.compose.ui.text.TextRange composition = androidx.compose.ui.text.input.TextFieldValue.this.getComposition();
                            BasicTextField$lambda$22 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState32);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(composition, BasicTextField$lambda$22.getComposition())) {
                                return;
                            }
                        }
                        mutableState32.setValue(androidx.compose.ui.text.input.TextFieldValue.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(str);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.MutableState<java.lang.String> mutableState222 = (androidx.compose.runtime.MutableState) rememberedValue3;
                androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z1322 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                startRestartGroup.startReplaceableGroup(623729370);
                androidx.compose.foundation.text.KeyboardOptions keyboardOptions522 = keyboardOptions2;
                changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(function1);
                boolean z1422 = z7;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                        java.lang.String BasicTextField$lambda$6;
                        mutableState32.setValue(textFieldValue);
                        BasicTextField$lambda$6 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$6(mutableState222);
                        boolean z152 = !kotlin.jvm.internal.Intrinsics.areEqual(BasicTextField$lambda$6, textFieldValue.getText());
                        mutableState222.setValue(textFieldValue.getText());
                        if (z152) {
                            function1.invoke(textFieldValue.getText());
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                int i3422 = i30 << 9;
                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(m4201copy3r_uNRQ$default22, (kotlin.jvm.functions.Function1) rememberedValue4, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z1322, i33, i32, imeOptions$foundation_release22, keyboardActions2, z4, z1222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i3422 & 57344) | (i3422 & 458752) | (3670016 & i3422) | (i3422 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z8 = z1222;
                keyboardOptions3 = keyboardOptions522;
                i26 = i23;
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation2;
                function14 = function13;
                function33 = function32;
                z9 = z1422;
                i27 = i25;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
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
            if ((i3 & 1879048192) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i302 = i14;
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
            if (i29 != 0) {
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
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
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
            function13 = basicTextFieldKt$BasicTextField$1;
            z6 = z10;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z5;
            i24 = i21;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState322 = (androidx.compose.runtime.MutableState) rememberedValue;
            final androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default222 = androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState322), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null);
            startRestartGroup.startReplaceableGroup(623728715);
            changed = startRestartGroup.changed(m4201copy3r_uNRQ$default222) | startRestartGroup.changed(mutableState322);
            boolean z12222 = z6;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2;
                    androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$22;
                    long selection = androidx.compose.ui.text.input.TextFieldValue.this.getSelection();
                    BasicTextField$lambda$2 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState322);
                    if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(selection, BasicTextField$lambda$2.getSelection())) {
                        androidx.compose.ui.text.TextRange composition = androidx.compose.ui.text.input.TextFieldValue.this.getComposition();
                        BasicTextField$lambda$22 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState322);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(composition, BasicTextField$lambda$22.getComposition())) {
                            return;
                        }
                    }
                    mutableState322.setValue(androidx.compose.ui.text.input.TextFieldValue.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(str);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState2222 = (androidx.compose.runtime.MutableState) rememberedValue3;
            androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z13222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            startRestartGroup.startReplaceableGroup(623729370);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions5222 = keyboardOptions2;
            changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changed(mutableState2222) | startRestartGroup.changedInstance(function1);
            boolean z14222 = z7;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                    invoke2(textFieldValue);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                    java.lang.String BasicTextField$lambda$6;
                    mutableState322.setValue(textFieldValue);
                    BasicTextField$lambda$6 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$6(mutableState2222);
                    boolean z152 = !kotlin.jvm.internal.Intrinsics.areEqual(BasicTextField$lambda$6, textFieldValue.getText());
                    mutableState2222.setValue(textFieldValue.getText());
                    if (z152) {
                        function1.invoke(textFieldValue.getText());
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            int i34222 = i302 << 9;
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(m4201copy3r_uNRQ$default222, (kotlin.jvm.functions.Function1) rememberedValue4, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z13222, i33, i32, imeOptions$foundation_release222, keyboardActions2, z4, z12222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i34222 & 57344) | (i34222 & 458752) | (3670016 & i34222) | (i34222 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i302 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            z8 = z12222;
            keyboardOptions3 = keyboardOptions5222;
            i26 = i23;
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation2;
            function14 = function13;
            function33 = function32;
            z9 = z14222;
            i27 = i25;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        if ((i3 & 1879048192) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3022 = i14;
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
        if (i29 != 0) {
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
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
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
        function13 = basicTextFieldKt$BasicTextField$1;
        z6 = z10;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z5;
        i24 = i21;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState3222 = (androidx.compose.runtime.MutableState) rememberedValue;
        final androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default2222 = androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState3222), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null);
        startRestartGroup.startReplaceableGroup(623728715);
        changed = startRestartGroup.changed(m4201copy3r_uNRQ$default2222) | startRestartGroup.changed(mutableState3222);
        boolean z122222 = z6;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2;
                androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$22;
                long selection = androidx.compose.ui.text.input.TextFieldValue.this.getSelection();
                BasicTextField$lambda$2 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState3222);
                if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(selection, BasicTextField$lambda$2.getSelection())) {
                    androidx.compose.ui.text.TextRange composition = androidx.compose.ui.text.input.TextFieldValue.this.getComposition();
                    BasicTextField$lambda$22 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$2(mutableState3222);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(composition, BasicTextField$lambda$22.getComposition())) {
                        return;
                    }
                }
                mutableState3222.setValue(androidx.compose.ui.text.input.TextFieldValue.this);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(str);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState<java.lang.String> mutableState22222 = (androidx.compose.runtime.MutableState) rememberedValue3;
        androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z132222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        startRestartGroup.startReplaceableGroup(623729370);
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions52222 = keyboardOptions2;
        changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(mutableState22222) | startRestartGroup.changedInstance(function1);
        boolean z142222 = z7;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                java.lang.String BasicTextField$lambda$6;
                mutableState3222.setValue(textFieldValue);
                BasicTextField$lambda$6 = androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField$lambda$6(mutableState22222);
                boolean z152 = !kotlin.jvm.internal.Intrinsics.areEqual(BasicTextField$lambda$6, textFieldValue.getText());
                mutableState22222.setValue(textFieldValue.getText());
                if (z152) {
                    function1.invoke(textFieldValue.getText());
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        int i342222 = i3022 << 9;
        androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(m4201copy3r_uNRQ$default2222, (kotlin.jvm.functions.Function1) rememberedValue4, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z132222, i33, i32, imeOptions$foundation_release2222, keyboardActions2, z4, z122222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i342222 & 57344) | (i342222 & 458752) | (3670016 & i342222) | (i342222 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i3022 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z8 = z122222;
        keyboardOptions3 = keyboardOptions52222;
        i26 = i23;
        textStyle3 = textStyle2;
        visualTransformation3 = visualTransformation2;
        function14 = function13;
        function33 = function32;
        z9 = z142222;
        i27 = i25;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.TextFieldValue BasicTextField$lambda$2(androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String BasicTextField$lambda$6(androidx.compose.runtime.MutableState<java.lang.String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3, int i, int i2, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4, final int i5) {
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
        int i20;
        boolean z4;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i21;
        androidx.compose.ui.graphics.SolidColor solidColor;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.ui.graphics.Brush brush2;
        int i22;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        boolean z5;
        int i23;
        boolean z6;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        boolean z7;
        int i24;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final boolean z10;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        final int i25;
        final int i26;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function14;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.ui.graphics.Brush brush3;
        final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i27;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1804514146);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)291@17267L39,296@17507L740:BasicTextField.kt#423gt5");
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
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z3) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 1879048192) == 0) {
                    if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                        i27 = 536870912;
                        i6 |= i27;
                    }
                    i27 = 268435456;
                    i6 |= i27;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i29 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i29 |= 384;
                } else if ((i4 & 896) == 0) {
                    i29 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i29 |= 3072;
                    } else if ((i4 & 7168) == 0) {
                        i29 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i29 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i29 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i29 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i29 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i29) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                androidx.compose.ui.Modifier.Companion companion = i28 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z11 = i7 != 0 ? true : z;
                                boolean z12 = i8 != 0 ? false : z2;
                                androidx.compose.ui.text.TextStyle textStyle4 = i9 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i10 != 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                androidx.compose.foundation.text.KeyboardActions keyboardActions4 = i11 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z13 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i20 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i30 = i13 != 0 ? 1 : i2;
                                androidx.compose.ui.text.input.VisualTransformation none = i15 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6 basicTextFieldKt$BasicTextField$6 = i16 != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i17 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    z4 = z13;
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                                } else {
                                    z4 = z13;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 != 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = brush;
                                }
                                if (i19 != 0) {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    brush2 = solidColor;
                                    function32 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE.m865getLambda2$foundation_release();
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    function32 = function3;
                                    brush2 = solidColor;
                                }
                                i22 = i30;
                                visualTransformation2 = none;
                                modifier2 = companion;
                                function13 = basicTextFieldKt$BasicTextField$6;
                                keyboardActions2 = keyboardActions4;
                                z5 = z11;
                                i23 = i20;
                                z6 = z12;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                z7 = z4;
                                i24 = i21;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i23 = i;
                                i22 = i2;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                i24 = i6;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1804514146, i24, i29, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:295)");
                            }
                            androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z14 = !z7;
                            int i31 = z7 ? 1 : i22;
                            int i32 = z7 ? 1 : i23;
                            startRestartGroup.startReplaceableGroup(623737120);
                            changed = startRestartGroup.changed(textFieldValue) | startRestartGroup.changedInstance(function1);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.input.TextFieldValue.this, textFieldValue2)) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i33 = i29 << 9;
                            composer2 = startRestartGroup;
                            boolean z15 = z7;
                            androidx.compose.foundation.text.KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(textFieldValue, (kotlin.jvm.functions.Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z14, i32, i31, imeOptions$foundation_release, keyboardActions2, z5, z6, function32, composer2, (i24 & 14) | (i24 & 896) | ((i24 >> 6) & 7168) | (i33 & 57344) | (i33 & 458752) | (3670016 & i33) | (i33 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z8 = z5;
                            z9 = z6;
                            textStyle3 = textStyle2;
                            z10 = z15;
                            keyboardActions3 = keyboardActions2;
                            i25 = i23;
                            i26 = i22;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            keyboardOptions3 = keyboardOptions5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            brush3 = brush2;
                            function33 = function32;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z8 = z;
                            z9 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z3;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush3 = brush;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i25 = i;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i34) {
                                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue.this, function1, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i25, i26, visualTransformation3, function14, mutableInteractionSource5, brush3, function33, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
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
                    if (i28 != 0) {
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
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    i22 = i30;
                    visualTransformation2 = none;
                    modifier2 = companion;
                    function13 = basicTextFieldKt$BasicTextField$6;
                    keyboardActions2 = keyboardActions4;
                    z5 = z11;
                    i23 = i20;
                    z6 = z12;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    z7 = z4;
                    i24 = i21;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z142 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    startRestartGroup.startReplaceableGroup(623737120);
                    changed = startRestartGroup.changed(textFieldValue) | startRestartGroup.changedInstance(function1);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.input.TextFieldValue.this, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    int i332 = i29 << 9;
                    composer2 = startRestartGroup;
                    boolean z152 = z7;
                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions52 = keyboardOptions2;
                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(textFieldValue, (kotlin.jvm.functions.Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z142, i32, i31, imeOptions$foundation_release2, keyboardActions2, z5, z6, function32, composer2, (i24 & 14) | (i24 & 896) | ((i24 >> 6) & 7168) | (i332 & 57344) | (i332 & 458752) | (3670016 & i332) | (i332 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z8 = z5;
                    z9 = z6;
                    textStyle3 = textStyle2;
                    z10 = z152;
                    keyboardActions3 = keyboardActions2;
                    i25 = i23;
                    i26 = i22;
                    visualTransformation3 = visualTransformation2;
                    function14 = function13;
                    keyboardOptions3 = keyboardOptions52;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    brush3 = brush2;
                    function33 = function32;
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
                if (i28 != 0) {
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
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                i22 = i30;
                visualTransformation2 = none;
                modifier2 = companion;
                function13 = basicTextFieldKt$BasicTextField$6;
                keyboardActions2 = keyboardActions4;
                z5 = z11;
                i23 = i20;
                z6 = z12;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z4;
                i24 = i21;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z1422 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                startRestartGroup.startReplaceableGroup(623737120);
                changed = startRestartGroup.changed(textFieldValue) | startRestartGroup.changedInstance(function1);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.input.TextFieldValue.this, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                int i3322 = i29 << 9;
                composer2 = startRestartGroup;
                boolean z1522 = z7;
                androidx.compose.foundation.text.KeyboardOptions keyboardOptions522 = keyboardOptions2;
                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(textFieldValue, (kotlin.jvm.functions.Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z1422, i32, i31, imeOptions$foundation_release22, keyboardActions2, z5, z6, function32, composer2, (i24 & 14) | (i24 & 896) | ((i24 >> 6) & 7168) | (i3322 & 57344) | (i3322 & 458752) | (3670016 & i3322) | (i3322 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z8 = z5;
                z9 = z6;
                textStyle3 = textStyle2;
                z10 = z1522;
                keyboardActions3 = keyboardActions2;
                i25 = i23;
                i26 = i22;
                visualTransformation3 = visualTransformation2;
                function14 = function13;
                keyboardOptions3 = keyboardOptions522;
                mutableInteractionSource5 = mutableInteractionSource4;
                brush3 = brush2;
                function33 = function32;
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
            if ((i3 & 1879048192) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i292 = i14;
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
            if (i28 != 0) {
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
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            i22 = i30;
            visualTransformation2 = none;
            modifier2 = companion;
            function13 = basicTextFieldKt$BasicTextField$6;
            keyboardActions2 = keyboardActions4;
            z5 = z11;
            i23 = i20;
            z6 = z12;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z4;
            i24 = i21;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z14222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            startRestartGroup.startReplaceableGroup(623737120);
            changed = startRestartGroup.changed(textFieldValue) | startRestartGroup.changedInstance(function1);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                    invoke2(textFieldValue2);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.input.TextFieldValue.this, textFieldValue2)) {
                        return;
                    }
                    function1.invoke(textFieldValue2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i33222 = i292 << 9;
            composer2 = startRestartGroup;
            boolean z15222 = z7;
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions5222 = keyboardOptions2;
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(textFieldValue, (kotlin.jvm.functions.Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z14222, i32, i31, imeOptions$foundation_release222, keyboardActions2, z5, z6, function32, composer2, (i24 & 14) | (i24 & 896) | ((i24 >> 6) & 7168) | (i33222 & 57344) | (i33222 & 458752) | (3670016 & i33222) | (i33222 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i292 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z8 = z5;
            z9 = z6;
            textStyle3 = textStyle2;
            z10 = z15222;
            keyboardActions3 = keyboardActions2;
            i25 = i23;
            i26 = i22;
            visualTransformation3 = visualTransformation2;
            function14 = function13;
            keyboardOptions3 = keyboardOptions5222;
            mutableInteractionSource5 = mutableInteractionSource4;
            brush3 = brush2;
            function33 = function32;
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
        if ((i3 & 1879048192) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i2922 = i14;
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
        if (i28 != 0) {
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
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        i22 = i30;
        visualTransformation2 = none;
        modifier2 = companion;
        function13 = basicTextFieldKt$BasicTextField$6;
        keyboardActions2 = keyboardActions4;
        z5 = z11;
        i23 = i20;
        z6 = z12;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z4;
        i24 = i21;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.text.input.ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z142222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        startRestartGroup.startReplaceableGroup(623737120);
        changed = startRestartGroup.changed(textFieldValue) | startRestartGroup.changedInstance(function1);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                invoke2(textFieldValue2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.text.input.TextFieldValue textFieldValue2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.input.TextFieldValue.this, textFieldValue2)) {
                    return;
                }
                function1.invoke(textFieldValue2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i332222 = i2922 << 9;
        composer2 = startRestartGroup;
        boolean z152222 = z7;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions52222 = keyboardOptions2;
        androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(textFieldValue, (kotlin.jvm.functions.Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z142222, i32, i31, imeOptions$foundation_release2222, keyboardActions2, z5, z6, function32, composer2, (i24 & 14) | (i24 & 896) | ((i24 >> 6) & 7168) | (i332222 & 57344) | (i332222 & 458752) | (3670016 & i332222) | (i332222 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i2922 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z8 = z5;
        z9 = z6;
        textStyle3 = textStyle2;
        z10 = z152222;
        keyboardActions3 = keyboardActions2;
        i25 = i23;
        i26 = i22;
        visualTransformation3 = visualTransformation2;
        function14 = function13;
        keyboardOptions3 = keyboardOptions52222;
        mutableInteractionSource5 = mutableInteractionSource4;
        brush3 = brush2;
        function33 = function32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String str, final kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3, int i, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
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
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.graphics.SolidColor solidColor;
        final androidx.compose.ui.graphics.Brush brush2;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        final kotlin.jvm.functions.Function3 function32;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        final boolean z4;
        final androidx.compose.ui.text.TextStyle textStyle2;
        final boolean z5;
        final int i20;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        final kotlin.jvm.functions.Function1 function13;
        final boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-454732590);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)335@18937L39,340@19177L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= startRestartGroup.changed(z3) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                    }
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                        i15 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i15 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                    } else {
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i15 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                    }
                    int i21 = i15;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        i21 |= 384;
                    } else if ((i3 & 896) == 0) {
                        i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        i18 = i4 & 8192;
                        if (i18 != 0) {
                            i21 |= 3072;
                        } else if ((i3 & 7168) == 0) {
                            i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i21 |= 24576;
                            } else if ((i3 & 57344) == 0) {
                                i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                            }
                            if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z7 = i7 == 0 ? true : z;
                                boolean z8 = i8 == 0 ? false : z2;
                                androidx.compose.ui.text.TextStyle textStyle3 = i9 == 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                androidx.compose.foundation.text.KeyboardOptions keyboardOptions3 = i10 == 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                androidx.compose.foundation.text.KeyboardActions keyboardActions3 = i11 == 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z9 = i12 == 0 ? false : z3;
                                int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                androidx.compose.ui.text.input.VisualTransformation none = i14 == 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10 basicTextFieldKt$BasicTextField$10 = i16 == 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i17 == 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    composer2 = startRestartGroup;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                } else {
                                    composer2 = startRestartGroup;
                                    solidColor = brush;
                                }
                                kotlin.jvm.functions.Function3 m866getLambda3$foundation_release = i19 == 0 ? androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE.m866getLambda3$foundation_release() : function3;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-454732590, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:339)");
                                }
                                int i23 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                                int i24 = i21 << 3;
                                BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                brush2 = solidColor;
                                visualTransformation2 = none;
                                function32 = m866getLambda3$foundation_release;
                                modifier2 = companion;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z10 = z7;
                                function13 = basicTextFieldKt$BasicTextField$10;
                                z6 = z10;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z6 = z;
                                z4 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z5 = z3;
                                i20 = i;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
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
                                        androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(str, function1, modifier2, z6, z4, textStyle2, keyboardOptions2, keyboardActions2, z5, i20, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i19 = i4 & 16384;
                        if (i19 == 0) {
                        }
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i232 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                        int i242 = i21 << 3;
                        BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (i242 & 57344) | (i242 & 458752), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        brush2 = solidColor;
                        visualTransformation2 = none;
                        function32 = m866getLambda3$foundation_release;
                        modifier2 = companion;
                        keyboardActions2 = keyboardActions3;
                        z4 = z8;
                        textStyle2 = textStyle3;
                        z5 = z9;
                        i20 = i22;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardOptions2 = keyboardOptions3;
                        boolean z102 = z7;
                        function13 = basicTextFieldKt$BasicTextField$10;
                        z6 = z102;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i18 = i4 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i4 & 16384;
                    if (i19 == 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i2322 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                    int i2422 = i21 << 3;
                    BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i2322, (i2422 & 112) | 6 | (i2422 & 896) | (i2422 & 7168) | (i2422 & 57344) | (i2422 & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    brush2 = solidColor;
                    visualTransformation2 = none;
                    function32 = m866getLambda3$foundation_release;
                    modifier2 = companion;
                    keyboardActions2 = keyboardActions3;
                    z4 = z8;
                    textStyle2 = textStyle3;
                    z5 = z9;
                    i20 = i22;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardOptions2 = keyboardOptions3;
                    boolean z1022 = z7;
                    function13 = basicTextFieldKt$BasicTextField$10;
                    z6 = z1022;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i4 & 1024;
                if (i14 == 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i212 = i15;
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                i18 = i4 & 8192;
                if (i18 != 0) {
                }
                i19 = i4 & 16384;
                if (i19 == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i23222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                int i24222 = i212 << 3;
                BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i23222, (i24222 & 112) | 6 | (i24222 & 896) | (i24222 & 7168) | (i24222 & 57344) | (i24222 & 458752), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                brush2 = solidColor;
                visualTransformation2 = none;
                function32 = m866getLambda3$foundation_release;
                modifier2 = companion;
                keyboardActions2 = keyboardActions3;
                z4 = z8;
                textStyle2 = textStyle3;
                z5 = z9;
                i20 = i22;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardOptions2 = keyboardOptions3;
                boolean z10222 = z7;
                function13 = basicTextFieldKt$BasicTextField$10;
                z6 = z10222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i4 & 1024;
            if (i14 == 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i2122 = i15;
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            i18 = i4 & 8192;
            if (i18 != 0) {
            }
            i19 = i4 & 16384;
            if (i19 == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i232222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
            int i242222 = i2122 << 3;
            BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i232222, (i242222 & 112) | 6 | (i242222 & 896) | (i242222 & 7168) | (i242222 & 57344) | (i242222 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            brush2 = solidColor;
            visualTransformation2 = none;
            function32 = m866getLambda3$foundation_release;
            modifier2 = companion;
            keyboardActions2 = keyboardActions3;
            z4 = z8;
            textStyle2 = textStyle3;
            z5 = z9;
            i20 = i22;
            mutableInteractionSource3 = mutableInteractionSource2;
            keyboardOptions2 = keyboardOptions3;
            boolean z102222 = z7;
            function13 = basicTextFieldKt$BasicTextField$10;
            z6 = z102222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i4 & 1024;
        if (i14 == 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i21222 = i15;
        i17 = i4 & 4096;
        if (i17 == 0) {
        }
        i18 = i4 & 8192;
        if (i18 != 0) {
        }
        i19 = i4 & 16384;
        if (i19 == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i2322222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
        int i2422222 = i21222 << 3;
        BasicTextField(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m866getLambda3$foundation_release, composer2, i2322222, (i2422222 & 112) | 6 | (i2422222 & 896) | (i2422222 & 7168) | (i2422222 & 57344) | (i2422222 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        brush2 = solidColor;
        visualTransformation2 = none;
        function32 = m866getLambda3$foundation_release;
        modifier2 = companion;
        keyboardActions2 = keyboardActions3;
        z4 = z8;
        textStyle2 = textStyle3;
        z5 = z9;
        i20 = i22;
        mutableInteractionSource3 = mutableInteractionSource2;
        keyboardOptions2 = keyboardOptions3;
        boolean z1022222 = z7;
        function13 = basicTextFieldKt$BasicTextField$10;
        z6 = z1022222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3, int i, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
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
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.graphics.SolidColor solidColor;
        final androidx.compose.ui.graphics.Brush brush2;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        final kotlin.jvm.functions.Function3 function32;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        final boolean z4;
        final androidx.compose.ui.text.TextStyle textStyle2;
        final boolean z5;
        final int i20;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        final kotlin.jvm.functions.Function1 function13;
        final boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-560482651);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)375@20462L39,380@20702L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= startRestartGroup.changed(z3) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                    }
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                        i15 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i15 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                    } else {
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i15 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                    }
                    int i21 = i15;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        i21 |= 384;
                    } else if ((i3 & 896) == 0) {
                        i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        i18 = i4 & 8192;
                        if (i18 != 0) {
                            i21 |= 3072;
                        } else if ((i3 & 7168) == 0) {
                            i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i21 |= 24576;
                            } else if ((i3 & 57344) == 0) {
                                i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                            }
                            if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z7 = i7 == 0 ? true : z;
                                boolean z8 = i8 == 0 ? false : z2;
                                androidx.compose.ui.text.TextStyle textStyle3 = i9 == 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                androidx.compose.foundation.text.KeyboardOptions keyboardOptions3 = i10 == 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                androidx.compose.foundation.text.KeyboardActions keyboardActions3 = i11 == 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z9 = i12 == 0 ? false : z3;
                                int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                androidx.compose.ui.text.input.VisualTransformation none = i14 == 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13 basicTextFieldKt$BasicTextField$13 = i16 == 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i17 == 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    composer2 = startRestartGroup;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                } else {
                                    composer2 = startRestartGroup;
                                    solidColor = brush;
                                }
                                kotlin.jvm.functions.Function3 m867getLambda4$foundation_release = i19 == 0 ? androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE.m867getLambda4$foundation_release() : function3;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-560482651, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:379)");
                                }
                                int i23 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                                int i24 = i21 << 3;
                                BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                brush2 = solidColor;
                                visualTransformation2 = none;
                                function32 = m867getLambda4$foundation_release;
                                modifier2 = companion;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z10 = z7;
                                function13 = basicTextFieldKt$BasicTextField$13;
                                z6 = z10;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z6 = z;
                                z4 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z5 = z3;
                                i20 = i;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
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
                                        androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue.this, function1, modifier2, z6, z4, textStyle2, keyboardOptions2, keyboardActions2, z5, i20, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i19 = i4 & 16384;
                        if (i19 == 0) {
                        }
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i232 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                        int i242 = i21 << 3;
                        BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (i242 & 57344) | (i242 & 458752), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        brush2 = solidColor;
                        visualTransformation2 = none;
                        function32 = m867getLambda4$foundation_release;
                        modifier2 = companion;
                        keyboardActions2 = keyboardActions3;
                        z4 = z8;
                        textStyle2 = textStyle3;
                        z5 = z9;
                        i20 = i22;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardOptions2 = keyboardOptions3;
                        boolean z102 = z7;
                        function13 = basicTextFieldKt$BasicTextField$13;
                        z6 = z102;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i18 = i4 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i4 & 16384;
                    if (i19 == 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i2322 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                    int i2422 = i21 << 3;
                    BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i2322, (i2422 & 112) | 6 | (i2422 & 896) | (i2422 & 7168) | (i2422 & 57344) | (i2422 & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    brush2 = solidColor;
                    visualTransformation2 = none;
                    function32 = m867getLambda4$foundation_release;
                    modifier2 = companion;
                    keyboardActions2 = keyboardActions3;
                    z4 = z8;
                    textStyle2 = textStyle3;
                    z5 = z9;
                    i20 = i22;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardOptions2 = keyboardOptions3;
                    boolean z1022 = z7;
                    function13 = basicTextFieldKt$BasicTextField$13;
                    z6 = z1022;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i4 & 1024;
                if (i14 == 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i212 = i15;
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                i18 = i4 & 8192;
                if (i18 != 0) {
                }
                i19 = i4 & 16384;
                if (i19 == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i23222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
                int i24222 = i212 << 3;
                BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i23222, (i24222 & 112) | 6 | (i24222 & 896) | (i24222 & 7168) | (i24222 & 57344) | (i24222 & 458752), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                brush2 = solidColor;
                visualTransformation2 = none;
                function32 = m867getLambda4$foundation_release;
                modifier2 = companion;
                keyboardActions2 = keyboardActions3;
                z4 = z8;
                textStyle2 = textStyle3;
                z5 = z9;
                i20 = i22;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardOptions2 = keyboardOptions3;
                boolean z10222 = z7;
                function13 = basicTextFieldKt$BasicTextField$13;
                z6 = z10222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i4 & 1024;
            if (i14 == 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i2122 = i15;
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            i18 = i4 & 8192;
            if (i18 != 0) {
            }
            i19 = i4 & 16384;
            if (i19 == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i232222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
            int i242222 = i2122 << 3;
            BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i232222, (i242222 & 112) | 6 | (i242222 & 896) | (i242222 & 7168) | (i242222 & 57344) | (i242222 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            brush2 = solidColor;
            visualTransformation2 = none;
            function32 = m867getLambda4$foundation_release;
            modifier2 = companion;
            keyboardActions2 = keyboardActions3;
            z4 = z8;
            textStyle2 = textStyle3;
            z5 = z9;
            i20 = i22;
            mutableInteractionSource3 = mutableInteractionSource2;
            keyboardOptions2 = keyboardOptions3;
            boolean z102222 = z7;
            function13 = basicTextFieldKt$BasicTextField$13;
            z6 = z102222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i4 & 1024;
        if (i14 == 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i21222 = i15;
        i17 = i4 & 4096;
        if (i17 == 0) {
        }
        i18 = i4 & 8192;
        if (i18 != 0) {
        }
        i19 = i4 & 16384;
        if (i19 == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i2322222 = (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
        int i2422222 = i21222 << 3;
        BasicTextField(textFieldValue, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) m867getLambda4$foundation_release, composer2, i2322222, (i2422222 & 112) | 6 | (i2422222 & 896) | (i2422222 & 7168) | (i2422222 & 57344) | (i2422222 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        brush2 = solidColor;
        visualTransformation2 = none;
        function32 = m867getLambda4$foundation_release;
        modifier2 = companion;
        keyboardActions2 = keyboardActions3;
        z4 = z8;
        textStyle2 = textStyle3;
        z5 = z9;
        i20 = i22;
        mutableInteractionSource3 = mutableInteractionSource2;
        keyboardOptions2 = keyboardOptions3;
        boolean z1022222 = z7;
        function13 = basicTextFieldKt$BasicTextField$13;
        z6 = z1022222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
