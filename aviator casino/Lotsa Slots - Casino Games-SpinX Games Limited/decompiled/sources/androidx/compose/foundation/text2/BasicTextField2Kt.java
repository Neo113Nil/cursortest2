package androidx.compose.foundation.text2;

/* compiled from: BasicTextField2.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aÙ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)\u001aí\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050-2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\u001a\u0015\u00103\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "getDefaultTextFieldDecorator$annotations", "()V", "BasicTextField2", "", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "lineLimits", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "value", "", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "valueWithSelection", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextField2Kt {
    private static final androidx.compose.foundation.text2.TextFieldDecorator DefaultTextFieldDecorator = androidx.compose.foundation.text2.BasicTextField2Kt$DefaultTextFieldDecorator$1.INSTANCE;

    private static /* synthetic */ void getDefaultTextFieldDecorator$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.foundation.text2.input.InputTransformation inputTransformation, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation, androidx.compose.foundation.text2.TextFieldDecorator textFieldDecorator, androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
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
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.ui.graphics.SolidColor solidColor;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.foundation.ScrollState scrollState2;
        androidx.compose.foundation.text2.TextFieldDecorator textFieldDecorator2;
        androidx.compose.ui.graphics.Brush brush2;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation2;
        int i18;
        boolean z3;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function22;
        boolean z4;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation2;
        androidx.compose.ui.text.TextStyle textStyle2;
        java.lang.Object rememberedValue;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function23;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.ui.graphics.Brush brush3;
        java.lang.Object rememberedValue2;
        boolean changed;
        java.lang.Object rememberedValue3;
        final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits3;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function24;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        androidx.compose.ui.graphics.Brush brush4;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.text.TextStyle textStyle3;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        final androidx.compose.foundation.ScrollState scrollState3;
        boolean z5;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation3;
        boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-797091052);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField2)P(15,11,9,3,12,4,14,7,6,8,10,5,1)186@11484L21,190@11642L213,200@12048L174,210@12291L1011:BasicTextField2.kt#g98mwb");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(inputTransformation) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(keyboardOptions) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(keyboardActions) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(textFieldLineLimits) ? 536870912 : 268435456;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i13 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i13 = i2;
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i2 & 112) == 0) {
                    i13 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                }
                int i20 = i13;
                i15 = i3 & 4096;
                if (i15 != 0) {
                    i20 |= 384;
                } else if ((i2 & 896) == 0) {
                    i20 |= startRestartGroup.changed(brush) ? 256 : 128;
                    i16 = i3 & 8192;
                    if (i16 == 0) {
                        i20 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i20 |= startRestartGroup.changed(codepointTransformation) ? 2048 : 1024;
                        i17 = i3 & 16384;
                        if (i17 != 0) {
                            i20 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i20 |= startRestartGroup.changed(textFieldDecorator) ? 16384 : 8192;
                        }
                        if ((i2 & 458752) == 0) {
                            i20 |= ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                        }
                        if ((i4 & 1533916891) == 306783378 || (374491 & i20) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i19 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z7 = i5 != 0 ? true : z;
                                boolean z8 = i6 != 0 ? false : z2;
                                androidx.compose.foundation.text2.input.InputTransformation inputTransformation4 = i7 != 0 ? null : inputTransformation;
                                androidx.compose.ui.text.TextStyle textStyle4 = i8 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                keyboardOptions2 = i9 != 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                androidx.compose.foundation.text.KeyboardActions keyboardActions4 = i10 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits4 = i11 != 0 ? androidx.compose.foundation.text2.input.TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function25 = i12 != 0 ? null : function2;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = i14 != 0 ? null : mutableInteractionSource;
                                if (i15 != 0) {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = brush;
                                }
                                androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation3 = i16 != 0 ? null : codepointTransformation;
                                androidx.compose.foundation.text2.TextFieldDecorator textFieldDecorator3 = i17 != 0 ? null : textFieldDecorator;
                                if ((i3 & 32768) != 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20 & (-458753);
                                    scrollState2 = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    z3 = z8;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function25;
                                    brush2 = solidColor;
                                    inputTransformation2 = inputTransformation4;
                                    textStyle2 = textStyle4;
                                    keyboardActions2 = keyboardActions4;
                                    z4 = z7;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    scrollState2 = scrollState;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    brush2 = solidColor;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20;
                                    z3 = z8;
                                    keyboardActions2 = keyboardActions4;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function25;
                                    z4 = z7;
                                    inputTransformation2 = inputTransformation4;
                                    textStyle2 = textStyle4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32768) != 0) {
                                    i20 &= -458753;
                                }
                                companion = modifier;
                                z4 = z;
                                z3 = z2;
                                inputTransformation2 = inputTransformation;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                textFieldLineLimits2 = textFieldLineLimits;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                codepointTransformation2 = codepointTransformation;
                                textFieldDecorator2 = textFieldDecorator;
                                scrollState2 = scrollState;
                                i18 = i20;
                                function22 = function2;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-797091052, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:189)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                brush3 = brush2;
                                rememberedValue = new androidx.compose.foundation.text2.input.TextFieldState(str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                brush3 = brush2;
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.foundation.text2.input.TextFieldState textFieldState = (androidx.compose.foundation.text2.input.TextFieldState) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue(str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                            mutableState.setValue(androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
                            androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$2 = BasicTextField2$lambda$2(mutableState);
                            startRestartGroup.startReplaceableGroup(1290401378);
                            changed = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(function1);
                            androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits2;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                                        androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$22;
                                        java.lang.String text = textFieldValue.getText();
                                        BasicTextField2$lambda$22 = androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2$lambda$2(mutableState);
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(text, BasicTextField2$lambda$22.getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i21 = i4 >> 3;
                            int i22 = (i21 & 234881024) | (i21 & 896) | 6 | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (3670016 & i21) | (29360128 & i21) | ((i18 << 27) & 1879048192);
                            int i23 = i18 >> 3;
                            BasicTextField2(textFieldState, androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt.syncTextFieldState(companion, textFieldState, BasicTextField2$lambda$2, (kotlin.jvm.functions.Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits5, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, i22, (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            textFieldLineLimits3 = textFieldLineLimits5;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            brush4 = brush3;
                            modifier2 = companion;
                            textStyle3 = textStyle2;
                            keyboardActions3 = keyboardActions2;
                            scrollState3 = scrollState2;
                            z5 = z3;
                            inputTransformation3 = inputTransformation2;
                            z6 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z6 = z;
                            z5 = z2;
                            inputTransformation3 = inputTransformation;
                            textStyle3 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            textFieldLineLimits3 = textFieldLineLimits;
                            function24 = function2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush4 = brush;
                            codepointTransformation2 = codepointTransformation;
                            textFieldDecorator2 = textFieldDecorator;
                            scrollState3 = scrollState;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final boolean z9 = z6;
                            final boolean z10 = z5;
                            final androidx.compose.foundation.text2.input.InputTransformation inputTransformation5 = inputTransformation3;
                            final androidx.compose.ui.text.TextStyle textStyle5 = textStyle3;
                            final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3 = keyboardOptions2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function24;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                            final androidx.compose.ui.graphics.Brush brush5 = brush4;
                            final androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation4 = codepointTransformation2;
                            final androidx.compose.foundation.text2.TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$2
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i24) {
                                    androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2(str, function1, modifier3, z9, z10, inputTransformation5, textStyle5, keyboardOptions3, keyboardActions3, textFieldLineLimits3, function26, mutableInteractionSource7, brush5, codepointTransformation4, textFieldDecorator4, scrollState3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i17 = i3 & 16384;
                    if (i17 != 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
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
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i3 & 32768) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.text2.input.TextFieldState textFieldState2 = (androidx.compose.foundation.text2.input.TextFieldState) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                    mutableState2.setValue(androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState2), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
                    androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$22 = BasicTextField2$lambda$2(mutableState2);
                    startRestartGroup.startReplaceableGroup(1290401378);
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(function1);
                    androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits52 = textFieldLineLimits2;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                            androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$222;
                            java.lang.String text = textFieldValue.getText();
                            BasicTextField2$lambda$222 = androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2$lambda$2(mutableState2);
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(text, BasicTextField2$lambda$222.getText())) {
                                function1.invoke(textFieldValue.getText());
                            }
                            mutableState2.setValue(textFieldValue);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    int i212 = i4 >> 3;
                    int i222 = (i212 & 234881024) | (i212 & 896) | 6 | (i212 & 7168) | (i212 & 57344) | (i212 & 458752) | (3670016 & i212) | (29360128 & i212) | ((i18 << 27) & 1879048192);
                    int i232 = i18 >> 3;
                    BasicTextField2(textFieldState2, androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2, BasicTextField2$lambda$22, (kotlin.jvm.functions.Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits52, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, i222, (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    textFieldLineLimits3 = textFieldLineLimits52;
                    function24 = function23;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    brush4 = brush3;
                    modifier2 = companion;
                    textStyle3 = textStyle2;
                    keyboardActions3 = keyboardActions2;
                    scrollState3 = scrollState2;
                    z5 = z3;
                    inputTransformation3 = inputTransformation2;
                    z6 = z4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i16 = i3 & 8192;
                if (i16 == 0) {
                }
                i17 = i3 & 16384;
                if (i17 != 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
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
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.text2.input.TextFieldState textFieldState22 = (androidx.compose.foundation.text2.input.TextFieldState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue2;
                mutableState22.setValue(androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState22), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
                androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$222 = BasicTextField2$lambda$2(mutableState22);
                startRestartGroup.startReplaceableGroup(1290401378);
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(function1);
                androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits522 = textFieldLineLimits2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                        androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$2222;
                        java.lang.String text = textFieldValue.getText();
                        BasicTextField2$lambda$2222 = androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2$lambda$2(mutableState22);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(text, BasicTextField2$lambda$2222.getText())) {
                            function1.invoke(textFieldValue.getText());
                        }
                        mutableState22.setValue(textFieldValue);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                int i2122 = i4 >> 3;
                int i2222 = (i2122 & 234881024) | (i2122 & 896) | 6 | (i2122 & 7168) | (i2122 & 57344) | (i2122 & 458752) | (3670016 & i2122) | (29360128 & i2122) | ((i18 << 27) & 1879048192);
                int i2322 = i18 >> 3;
                BasicTextField2(textFieldState22, androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt.syncTextFieldState(companion, textFieldState22, BasicTextField2$lambda$222, (kotlin.jvm.functions.Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits522, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, i2222, (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                textFieldLineLimits3 = textFieldLineLimits522;
                function24 = function23;
                mutableInteractionSource5 = mutableInteractionSource4;
                brush4 = brush3;
                modifier2 = companion;
                textStyle3 = textStyle2;
                keyboardActions3 = keyboardActions2;
                scrollState3 = scrollState2;
                z5 = z3;
                inputTransformation3 = inputTransformation2;
                z6 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            int i202 = i13;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            i16 = i3 & 8192;
            if (i16 == 0) {
            }
            i17 = i3 & 16384;
            if (i17 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
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
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text2.input.TextFieldState textFieldState222 = (androidx.compose.foundation.text2.input.TextFieldState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState222 = (androidx.compose.runtime.MutableState) rememberedValue2;
            mutableState222.setValue(androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState222), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
            androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$2222 = BasicTextField2$lambda$2(mutableState222);
            startRestartGroup.startReplaceableGroup(1290401378);
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(function1);
            androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits5222 = textFieldLineLimits2;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                    androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$22222;
                    java.lang.String text = textFieldValue.getText();
                    BasicTextField2$lambda$22222 = androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2$lambda$2(mutableState222);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(text, BasicTextField2$lambda$22222.getText())) {
                        function1.invoke(textFieldValue.getText());
                    }
                    mutableState222.setValue(textFieldValue);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            int i21222 = i4 >> 3;
            int i22222 = (i21222 & 234881024) | (i21222 & 896) | 6 | (i21222 & 7168) | (i21222 & 57344) | (i21222 & 458752) | (3670016 & i21222) | (29360128 & i21222) | ((i18 << 27) & 1879048192);
            int i23222 = i18 >> 3;
            BasicTextField2(textFieldState222, androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt.syncTextFieldState(companion, textFieldState222, BasicTextField2$lambda$2222, (kotlin.jvm.functions.Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits5222, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, i22222, (i23222 & 14) | (i23222 & 112) | (i23222 & 896) | (i23222 & 7168) | (i23222 & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            textFieldLineLimits3 = textFieldLineLimits5222;
            function24 = function23;
            mutableInteractionSource5 = mutableInteractionSource4;
            brush4 = brush3;
            modifier2 = companion;
            textStyle3 = textStyle2;
            keyboardActions3 = keyboardActions2;
            scrollState3 = scrollState2;
            z5 = z3;
            inputTransformation3 = inputTransformation2;
            z6 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        int i2022 = i13;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        i16 = i3 & 8192;
        if (i16 == 0) {
        }
        i17 = i3 & 16384;
        if (i17 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
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
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.text2.input.TextFieldState textFieldState2222 = (androidx.compose.foundation.text2.input.TextFieldState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState2222 = (androidx.compose.runtime.MutableState) rememberedValue2;
        mutableState2222.setValue(androidx.compose.ui.text.input.TextFieldValue.m4201copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState2222), str, 0L, (androidx.compose.ui.text.TextRange) null, 6, (java.lang.Object) null));
        androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$22222 = BasicTextField2$lambda$2(mutableState2222);
        startRestartGroup.startReplaceableGroup(1290401378);
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changedInstance(function1);
        androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits52222 = textFieldLineLimits2;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$222222;
                java.lang.String text = textFieldValue.getText();
                BasicTextField2$lambda$222222 = androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2$lambda$2(mutableState2222);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(text, BasicTextField2$lambda$222222.getText())) {
                    function1.invoke(textFieldValue.getText());
                }
                mutableState2222.setValue(textFieldValue);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        int i212222 = i4 >> 3;
        int i222222 = (i212222 & 234881024) | (i212222 & 896) | 6 | (i212222 & 7168) | (i212222 & 57344) | (i212222 & 458752) | (3670016 & i212222) | (29360128 & i212222) | ((i18 << 27) & 1879048192);
        int i232222 = i18 >> 3;
        BasicTextField2(textFieldState2222, androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2222, BasicTextField2$lambda$22222, (kotlin.jvm.functions.Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits52222, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, i222222, (i232222 & 14) | (i232222 & 112) | (i232222 & 896) | (i232222 & 7168) | (i232222 & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        textFieldLineLimits3 = textFieldLineLimits52222;
        function24 = function23;
        mutableInteractionSource5 = mutableInteractionSource4;
        brush4 = brush3;
        modifier2 = companion;
        textStyle3 = textStyle2;
        keyboardActions3 = keyboardActions2;
        scrollState3 = scrollState2;
        z5 = z3;
        inputTransformation3 = inputTransformation2;
        z6 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.TextFieldValue BasicTextField2$lambda$2(androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x03c0, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x042c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0420  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r50v0, types: [androidx.compose.foundation.text2.TextFieldDecorator, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(final androidx.compose.foundation.text2.input.TextFieldState textFieldState, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.foundation.text2.input.InputTransformation inputTransformation, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Brush brush, androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation, androidx.compose.foundation.text2.TextFieldDecorator textFieldDecorator, androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
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
        androidx.compose.ui.Modifier.Companion companion;
        boolean z3;
        boolean z4;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits2;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation2;
        androidx.compose.ui.graphics.SolidColor solidColor;
        androidx.compose.foundation.ScrollState scrollState2;
        int i18;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation3;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation4;
        androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits3;
        androidx.compose.ui.graphics.Brush brush2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function22;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        boolean changed;
        androidx.compose.ui.unit.LayoutDirection layoutDirection;
        androidx.compose.foundation.text2.input.SingleLineCodepointTransformation singleLineCodepointTransformation;
        boolean changed2;
        java.lang.Object rememberedValue;
        boolean changed3;
        java.lang.Object rememberedValue2;
        androidx.compose.ui.Modifier scrollable;
        int currentCompositeKeyHash;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer m1641constructorimpl;
        final androidx.compose.foundation.text2.input.InputTransformation inputTransformation3;
        final boolean z5;
        final boolean z6;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        final androidx.compose.ui.graphics.Brush brush3;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        final androidx.compose.foundation.ScrollState scrollState3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function23;
        final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits4;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final ?? r14;
        final androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(437246650);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField2)P(13,9,3,11,4,14,7,6,8,10,5,1)331@19539L21,335@19712L7,336@19767L7,337@19812L7,343@20182L25,346@20295L598,357@21091L48,359@21175L319,369@21547L7,370@21611L7,371@21665L7,372@21677L440,385@22123L125,423@23614L2468:BasicTextField2.kt#g98mwb");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 7168) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    int i20 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 57344) == 0) {
                        i4 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changed(textFieldLineLimits) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i14 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i14 |= startRestartGroup.changed(brush) ? 32 : 16;
                    }
                    int i21 = i14;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i21 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i21 |= startRestartGroup.changed(codepointTransformation) ? 256 : 128;
                        i17 = i3 & 8192;
                        if (i17 != 0) {
                            i21 |= 3072;
                        } else if ((i2 & 7168) == 0) {
                            i21 |= startRestartGroup.changed((java.lang.Object) textFieldDecorator) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                    i20 = 16384;
                                }
                                i21 |= i20;
                            }
                            if ((i4 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i19 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                    z3 = i5 == 0 ? true : z;
                                    z4 = i6 == 0 ? false : z2;
                                    androidx.compose.foundation.text2.input.InputTransformation inputTransformation4 = i7 == 0 ? null : inputTransformation;
                                    textStyle2 = i8 == 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle;
                                    keyboardOptions2 = i9 == 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    keyboardActions2 = i10 == 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits5 = i11 == 0 ? androidx.compose.foundation.text2.input.TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                    kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function24 = i12 == 0 ? null : function2;
                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = i13 == 0 ? null : mutableInteractionSource;
                                    if (i15 == 0) {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
                                    } else {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = brush;
                                    }
                                    androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation6 = i16 == 0 ? codepointTransformation2 : codepointTransformation;
                                    androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation7 = i17 == 0 ? codepointTransformation2 : textFieldDecorator;
                                    if ((i3 & 16384) == 0) {
                                        scrollState2 = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        i21 &= -57345;
                                    } else {
                                        scrollState2 = scrollState;
                                    }
                                    i18 = i21;
                                    codepointTransformation3 = codepointTransformation7;
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    codepointTransformation4 = codepointTransformation6;
                                    textFieldLineLimits3 = textFieldLineLimits2;
                                    brush2 = solidColor;
                                    function22 = function24;
                                    inputTransformation2 = inputTransformation4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    companion = modifier;
                                    z3 = z;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    textStyle2 = textStyle;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    function22 = function2;
                                    brush2 = brush;
                                    codepointTransformation4 = codepointTransformation;
                                    codepointTransformation3 = textFieldDecorator;
                                    scrollState2 = scrollState;
                                    i18 = i21;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(437246650, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:334)");
                                }
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function25 = function22;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = startRestartGroup.consume(localWindowInfo);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                androidx.compose.ui.platform.WindowInfo windowInfo = (androidx.compose.ui.platform.WindowInfo) consume3;
                                final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
                                final androidx.compose.ui.graphics.Brush brush4 = brush2;
                                startRestartGroup.startReplaceableGroup(-957633428);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                                if (mutableInteractionSource2 != null) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue3;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.foundation.gestures.Orientation orientation = !areEqual ? androidx.compose.foundation.gestures.Orientation.Horizontal : androidx.compose.foundation.gestures.Orientation.Vertical;
                                final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits3;
                                androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation8 = codepointTransformation3;
                                final boolean booleanValue = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                                final boolean isWindowFocused = windowInfo.isWindowFocused();
                                startRestartGroup.startReplaceableGroup(1618982084);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                                final androidx.compose.foundation.gestures.Orientation orientation2 = orientation;
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (changed) {
                                    layoutDirection = layoutDirection2;
                                } else {
                                    layoutDirection = layoutDirection2;
                                }
                                if (codepointTransformation4 != null) {
                                    androidx.compose.foundation.text2.input.SingleLineCodepointTransformation singleLineCodepointTransformation2 = androidx.compose.foundation.text2.input.SingleLineCodepointTransformation.INSTANCE;
                                    if (!areEqual) {
                                        singleLineCodepointTransformation2 = null;
                                    }
                                    singleLineCodepointTransformation = singleLineCodepointTransformation2;
                                } else {
                                    singleLineCodepointTransformation = codepointTransformation4;
                                }
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                                startRestartGroup.updateRememberedValue(transformedTextFieldState);
                                rememberedValue4 = transformedTextFieldState;
                                startRestartGroup.endReplaceableGroup();
                                final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue4;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transformedTextFieldState2);
                                androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation9 = codepointTransformation4;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transformedTextFieldState2);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState2, textLayoutState, density, z3, z4, !booleanValue && isWindowFocused);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = startRestartGroup.consume(localHapticFeedback);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = startRestartGroup.consume(localClipboardManager);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final androidx.compose.ui.platform.ClipboardManager clipboardManager = (androidx.compose.ui.platform.ClipboardManager) consume5;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume6 = startRestartGroup.consume(localTextToolbar);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final androidx.compose.ui.platform.TextToolbar textToolbar = (androidx.compose.ui.platform.TextToolbar) consume6;
                                final boolean z7 = z3;
                                final boolean z8 = z4;
                                androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback, clipboardManager, textToolbar, density, z7, z8);
                                    }
                                }, startRestartGroup, 0);
                                androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                        final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                                        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                                            }
                                        };
                                    }
                                }, startRestartGroup, 8);
                                scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState2, textLayoutState, textFieldSelectionState, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual)), z3, mutableInteractionSource7), scrollState2, orientation2, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation2, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource7);
                                startRestartGroup.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
                                modifier2 = companion;
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                                final androidx.compose.ui.text.TextStyle textStyle4 = textStyle2;
                                final boolean z9 = z3;
                                final boolean z10 = z4;
                                final androidx.compose.foundation.ScrollState scrollState4 = scrollState2;
                                (codepointTransformation8 != null ? DefaultTextFieldDecorator : codepointTransformation8).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                                        int i23;
                                        int i24;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                                        if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                            }
                                            androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                                            if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                                                i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                                i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                                            } else {
                                                i23 = 1;
                                                i24 = 1;
                                            }
                                            androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4, i23, i24), textStyle4)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue && isWindowFocused, textLayoutState, transformedTextFieldState2, textFieldSelectionState, brush4, z9 && !z10, scrollState4, orientation2));
                                            androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2 = textLayoutState;
                                            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                                            androidx.compose.ui.text.TextStyle textStyle5 = textStyle4;
                                            boolean z11 = areEqual;
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function25;
                                            boolean z12 = z9;
                                            boolean z13 = booleanValue;
                                            boolean z14 = isWindowFocused;
                                            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                            boolean z15 = z10;
                                            composer2.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
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
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                                m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                                m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                            androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState2, transformedTextFieldState3, textStyle5, z11, function26), composer2, 0);
                                            composer2.startReplaceableGroup(-39277302);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                            if (z12 && z13 && z14 && textFieldSelectionState2.isInTouchMode()) {
                                                androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState2, composer2, 8);
                                                if (!z15) {
                                                    androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState2, composer2, 8);
                                                }
                                            }
                                            composer2.endReplaceableGroup();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, 6);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                inputTransformation3 = inputTransformation2;
                                z5 = z3;
                                z6 = z4;
                                keyboardActions3 = keyboardActions2;
                                brush3 = brush4;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                scrollState3 = scrollState2;
                                function23 = function25;
                                textFieldLineLimits4 = textFieldLineLimits6;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                r14 = codepointTransformation8;
                                codepointTransformation5 = codepointTransformation9;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                inputTransformation3 = inputTransformation;
                                textStyle3 = textStyle;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                textFieldLineLimits4 = textFieldLineLimits;
                                function23 = function2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                brush3 = brush;
                                codepointTransformation5 = codepointTransformation;
                                r14 = textFieldDecorator;
                                scrollState3 = scrollState;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$6
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

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                                        androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2(androidx.compose.foundation.text2.input.TextFieldState.this, modifier3, z5, z6, inputTransformation3, textStyle3, keyboardOptions3, keyboardActions3, textFieldLineLimits4, function23, mutableInteractionSource5, brush3, codepointTransformation5, r14, scrollState3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i5 == 0) {
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
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        i18 = i21;
                        codepointTransformation3 = codepointTransformation7;
                        mutableInteractionSource2 = mutableInteractionSource6;
                        codepointTransformation4 = codepointTransformation6;
                        textFieldLineLimits3 = textFieldLineLimits2;
                        brush2 = solidColor;
                        function22 = function24;
                        inputTransformation2 = inputTransformation4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume7 = startRestartGroup.consume(localDensity2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume7;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) consume22;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function252 = function22;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume32 = startRestartGroup.consume(localWindowInfo2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        androidx.compose.ui.platform.WindowInfo windowInfo2 = (androidx.compose.ui.platform.WindowInfo) consume32;
                        final boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
                        final androidx.compose.ui.graphics.Brush brush42 = brush2;
                        startRestartGroup.startReplaceableGroup(-957633428);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                        if (mutableInteractionSource2 != null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (!areEqual2) {
                        }
                        final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits62 = textFieldLineLimits3;
                        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation82 = codepointTransformation3;
                        final boolean booleanValue2 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                        final boolean isWindowFocused2 = windowInfo2.isWindowFocused();
                        startRestartGroup.startReplaceableGroup(1618982084);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                        final androidx.compose.foundation.gestures.Orientation orientation22 = orientation;
                        java.lang.Object rememberedValue42 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        if (codepointTransformation4 != null) {
                        }
                        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                        startRestartGroup.updateRememberedValue(transformedTextFieldState3);
                        rememberedValue42 = transformedTextFieldState3;
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState22 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue42;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transformedTextFieldState22);
                        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation92 = codepointTransformation4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2 = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transformedTextFieldState22);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState22, textLayoutState2, density2, z3, z4, !booleanValue2 && isWindowFocused2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume42 = startRestartGroup.consume(localHapticFeedback2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback2 = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume42;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume52 = startRestartGroup.consume(localClipboardManager2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final androidx.compose.ui.platform.ClipboardManager clipboardManager2 = (androidx.compose.ui.platform.ClipboardManager) consume52;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume62 = startRestartGroup.consume(localTextToolbar2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final androidx.compose.ui.platform.TextToolbar textToolbar2 = (androidx.compose.ui.platform.TextToolbar) consume62;
                        final boolean z72 = z3;
                        final boolean z82 = z4;
                        androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback2, clipboardManager2, textToolbar2, density2, z72, z82);
                            }
                        }, startRestartGroup, 0);
                        androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState2, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                        scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState22, textLayoutState2, textFieldSelectionState2, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual2)), z3, mutableInteractionSource72), scrollState2, orientation22, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState2.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation22, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource72);
                        startRestartGroup.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
                        modifier2 = companion;
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting()) {
                        }
                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                        final androidx.compose.ui.text.TextStyle textStyle42 = textStyle2;
                        final boolean z92 = z3;
                        final boolean z102 = z4;
                        final androidx.compose.foundation.ScrollState scrollState42 = scrollState2;
                        (codepointTransformation82 != null ? DefaultTextFieldDecorator : codepointTransformation82).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                                int i23;
                                int i24;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                                if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                    }
                                    androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                                    if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                                        i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                        i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                                    } else {
                                        i23 = 1;
                                        i24 = 1;
                                    }
                                    androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState2.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i23, i24), textStyle42)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue2 && isWindowFocused2, textLayoutState2, transformedTextFieldState22, textFieldSelectionState2, brush42, z92 && !z102, scrollState42, orientation22));
                                    androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState22 = textLayoutState2;
                                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState32 = transformedTextFieldState22;
                                    androidx.compose.ui.text.TextStyle textStyle5 = textStyle42;
                                    boolean z11 = areEqual2;
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function252;
                                    boolean z12 = z92;
                                    boolean z13 = booleanValue2;
                                    boolean z14 = isWindowFocused2;
                                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22 = textFieldSelectionState2;
                                    boolean z15 = z102;
                                    composer2.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor22);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                        m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                        m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                    }
                                    modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                    androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState22, transformedTextFieldState32, textStyle5, z11, function26), composer2, 0);
                                    composer2.startReplaceableGroup(-39277302);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                    if (z12 && z13 && z14 && textFieldSelectionState22.isInTouchMode()) {
                                        androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState22, composer2, 8);
                                        if (!z15) {
                                            androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState22, composer2, 8);
                                        }
                                    }
                                    composer2.endReplaceableGroup();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, 6);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        inputTransformation3 = inputTransformation2;
                        z5 = z3;
                        z6 = z4;
                        keyboardActions3 = keyboardActions2;
                        brush3 = brush42;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        scrollState3 = scrollState2;
                        function23 = function252;
                        textFieldLineLimits4 = textFieldLineLimits62;
                        mutableInteractionSource5 = mutableInteractionSource3;
                        r14 = codepointTransformation82;
                        codepointTransformation5 = codepointTransformation92;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i17 = i3 & 8192;
                    if (i17 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i5 == 0) {
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
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    i18 = i21;
                    codepointTransformation3 = codepointTransformation7;
                    mutableInteractionSource2 = mutableInteractionSource6;
                    codepointTransformation4 = codepointTransformation6;
                    textFieldLineLimits3 = textFieldLineLimits2;
                    brush2 = solidColor;
                    function22 = function24;
                    inputTransformation2 = inputTransformation4;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume72 = startRestartGroup.consume(localDensity22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume72;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection222 = (androidx.compose.ui.unit.LayoutDirection) consume222;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2522 = function22;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume322 = startRestartGroup.consume(localWindowInfo22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.platform.WindowInfo windowInfo22 = (androidx.compose.ui.platform.WindowInfo) consume322;
                    final boolean areEqual22 = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
                    final androidx.compose.ui.graphics.Brush brush422 = brush2;
                    startRestartGroup.startReplaceableGroup(-957633428);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                    if (mutableInteractionSource2 != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!areEqual22) {
                    }
                    final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits622 = textFieldLineLimits3;
                    androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation822 = codepointTransformation3;
                    final boolean booleanValue22 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                    final boolean isWindowFocused22 = windowInfo22.isWindowFocused();
                    startRestartGroup.startReplaceableGroup(1618982084);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                    final androidx.compose.foundation.gestures.Orientation orientation222 = orientation;
                    java.lang.Object rememberedValue422 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    if (codepointTransformation4 != null) {
                    }
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState32 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                    startRestartGroup.updateRememberedValue(transformedTextFieldState32);
                    rememberedValue422 = transformedTextFieldState32;
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState222 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue422;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transformedTextFieldState222);
                    androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation922 = codepointTransformation4;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState22 = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transformedTextFieldState222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState222, textLayoutState22, density22, z3, z4, !booleanValue22 && isWindowFocused22);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume422 = startRestartGroup.consume(localHapticFeedback22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback22 = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume422;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume522 = startRestartGroup.consume(localClipboardManager22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.platform.ClipboardManager clipboardManager22 = (androidx.compose.ui.platform.ClipboardManager) consume522;
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume622 = startRestartGroup.consume(localTextToolbar22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.platform.TextToolbar textToolbar22 = (androidx.compose.ui.platform.TextToolbar) consume622;
                    final boolean z722 = z3;
                    final boolean z822 = z4;
                    androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback22, clipboardManager22, textToolbar22, density22, z722, z822);
                        }
                    }, startRestartGroup, 0);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState22, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                            final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState222 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState222, textLayoutState22, textFieldSelectionState22, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual22)), z3, mutableInteractionSource722), scrollState2, orientation222, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState22.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation222, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource722);
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
                    modifier2 = companion;
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                    final androidx.compose.ui.text.TextStyle textStyle422 = textStyle2;
                    final boolean z922 = z3;
                    final boolean z1022 = z4;
                    final androidx.compose.foundation.ScrollState scrollState422 = scrollState2;
                    (codepointTransformation822 != null ? DefaultTextFieldDecorator : codepointTransformation822).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                            int i23;
                            int i24;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                }
                                androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                                if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                                    i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                    i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                                } else {
                                    i23 = 1;
                                    i24 = 1;
                                }
                                androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState22.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle422, i23, i24), textStyle422)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue22 && isWindowFocused22, textLayoutState22, transformedTextFieldState222, textFieldSelectionState22, brush422, z922 && !z1022, scrollState422, orientation222));
                                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState222 = textLayoutState22;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState322 = transformedTextFieldState222;
                                androidx.compose.ui.text.TextStyle textStyle5 = textStyle422;
                                boolean z11 = areEqual22;
                                kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function2522;
                                boolean z12 = z922;
                                boolean z13 = booleanValue22;
                                boolean z14 = isWindowFocused22;
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState222 = textFieldSelectionState22;
                                boolean z15 = z1022;
                                composer2.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor222);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                }
                                modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState222, transformedTextFieldState322, textStyle5, z11, function26), composer2, 0);
                                composer2.startReplaceableGroup(-39277302);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                if (z12 && z13 && z14 && textFieldSelectionState222.isInTouchMode()) {
                                    androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState222, composer2, 8);
                                    if (!z15) {
                                        androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState222, composer2, 8);
                                    }
                                }
                                composer2.endReplaceableGroup();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 6);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    inputTransformation3 = inputTransformation2;
                    z5 = z3;
                    z6 = z4;
                    keyboardActions3 = keyboardActions2;
                    brush3 = brush422;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    scrollState3 = scrollState2;
                    function23 = function2522;
                    textFieldLineLimits4 = textFieldLineLimits622;
                    mutableInteractionSource5 = mutableInteractionSource3;
                    r14 = codepointTransformation822;
                    codepointTransformation5 = codepointTransformation922;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                int i202 = 8192;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i212 = i14;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i17 = i3 & 8192;
                if (i17 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i5 == 0) {
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
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                i18 = i212;
                codepointTransformation3 = codepointTransformation7;
                mutableInteractionSource2 = mutableInteractionSource6;
                codepointTransformation4 = codepointTransformation6;
                textFieldLineLimits3 = textFieldLineLimits2;
                brush2 = solidColor;
                function22 = function24;
                inputTransformation2 = inputTransformation4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume722 = startRestartGroup.consume(localDensity222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.unit.Density density222 = (androidx.compose.ui.unit.Density) consume722;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection2222 = (androidx.compose.ui.unit.LayoutDirection) consume2222;
                final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function25222 = function22;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume3222 = startRestartGroup.consume(localWindowInfo222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.WindowInfo windowInfo222 = (androidx.compose.ui.platform.WindowInfo) consume3222;
                final boolean areEqual222 = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
                final androidx.compose.ui.graphics.Brush brush4222 = brush2;
                startRestartGroup.startReplaceableGroup(-957633428);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                if (mutableInteractionSource2 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!areEqual222) {
                }
                final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits6222 = textFieldLineLimits3;
                androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation8222 = codepointTransformation3;
                final boolean booleanValue222 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                final boolean isWindowFocused222 = windowInfo222.isWindowFocused();
                startRestartGroup.startReplaceableGroup(1618982084);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                final androidx.compose.foundation.gestures.Orientation orientation2222 = orientation;
                java.lang.Object rememberedValue4222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                if (codepointTransformation4 != null) {
                }
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState322 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                startRestartGroup.updateRememberedValue(transformedTextFieldState322);
                rememberedValue4222 = transformedTextFieldState322;
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2222 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue4222;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transformedTextFieldState2222);
                androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation9222 = codepointTransformation4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState222 = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transformedTextFieldState2222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState2222, textLayoutState222, density222, z3, z4, !booleanValue222 && isWindowFocused222);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState222 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume4222 = startRestartGroup.consume(localHapticFeedback222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback222 = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume4222;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume5222 = startRestartGroup.consume(localClipboardManager222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.platform.ClipboardManager clipboardManager222 = (androidx.compose.ui.platform.ClipboardManager) consume5222;
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource4;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume6222 = startRestartGroup.consume(localTextToolbar222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.platform.TextToolbar textToolbar222 = (androidx.compose.ui.platform.TextToolbar) consume6222;
                final boolean z7222 = z3;
                final boolean z8222 = z4;
                androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback222, clipboardManager222, textToolbar222, density222, z7222, z8222);
                    }
                }, startRestartGroup, 0);
                androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                        final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2222 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState2222, textLayoutState222, textFieldSelectionState222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual222)), z3, mutableInteractionSource7222), scrollState2, orientation2222, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState222.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation2222, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource7222);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
                modifier2 = companion;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                final androidx.compose.ui.text.TextStyle textStyle4222 = textStyle2;
                final boolean z9222 = z3;
                final boolean z10222 = z4;
                final androidx.compose.foundation.ScrollState scrollState4222 = scrollState2;
                (codepointTransformation8222 != null ? DefaultTextFieldDecorator : codepointTransformation8222).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                        int i23;
                        int i24;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                        if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                            }
                            androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                            if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                                i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                            } else {
                                i23 = 1;
                                i24 = 1;
                            }
                            androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState222.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4222, i23, i24), textStyle4222)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue222 && isWindowFocused222, textLayoutState222, transformedTextFieldState2222, textFieldSelectionState222, brush4222, z9222 && !z10222, scrollState4222, orientation2222));
                            androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2222 = textLayoutState222;
                            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3222 = transformedTextFieldState2222;
                            androidx.compose.ui.text.TextStyle textStyle5 = textStyle4222;
                            boolean z11 = areEqual222;
                            kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function25222;
                            boolean z12 = z9222;
                            boolean z13 = booleanValue222;
                            boolean z14 = isWindowFocused222;
                            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2222 = textFieldSelectionState222;
                            boolean z15 = z10222;
                            composer2.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2222);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                            }
                            modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                            androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState2222, transformedTextFieldState3222, textStyle5, z11, function26), composer2, 0);
                            composer2.startReplaceableGroup(-39277302);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                            if (z12 && z13 && z14 && textFieldSelectionState2222.isInTouchMode()) {
                                androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState2222, composer2, 8);
                                if (!z15) {
                                    androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState2222, composer2, 8);
                                }
                            }
                            composer2.endReplaceableGroup();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 6);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                inputTransformation3 = inputTransformation2;
                z5 = z3;
                z6 = z4;
                keyboardActions3 = keyboardActions2;
                brush3 = brush4222;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                scrollState3 = scrollState2;
                function23 = function25222;
                textFieldLineLimits4 = textFieldLineLimits6222;
                mutableInteractionSource5 = mutableInteractionSource3;
                r14 = codepointTransformation8222;
                codepointTransformation5 = codepointTransformation9222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            int i2022 = 8192;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i2122 = i14;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i17 = i3 & 8192;
            if (i17 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i5 == 0) {
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
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            i18 = i2122;
            codepointTransformation3 = codepointTransformation7;
            mutableInteractionSource2 = mutableInteractionSource6;
            codepointTransformation4 = codepointTransformation6;
            textFieldLineLimits3 = textFieldLineLimits2;
            brush2 = solidColor;
            function22 = function24;
            inputTransformation2 = inputTransformation4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume7222 = startRestartGroup.consume(localDensity2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.unit.Density density2222 = (androidx.compose.ui.unit.Density) consume7222;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection22222 = (androidx.compose.ui.unit.LayoutDirection) consume22222;
            final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function252222 = function22;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume32222 = startRestartGroup.consume(localWindowInfo2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.WindowInfo windowInfo2222 = (androidx.compose.ui.platform.WindowInfo) consume32222;
            final boolean areEqual2222 = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
            final androidx.compose.ui.graphics.Brush brush42222 = brush2;
            startRestartGroup.startReplaceableGroup(-957633428);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
            if (mutableInteractionSource2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!areEqual2222) {
            }
            final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits62222 = textFieldLineLimits3;
            androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation82222 = codepointTransformation3;
            final boolean booleanValue2222 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
            final boolean isWindowFocused2222 = windowInfo2222.isWindowFocused();
            startRestartGroup.startReplaceableGroup(1618982084);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
            final androidx.compose.foundation.gestures.Orientation orientation22222 = orientation;
            java.lang.Object rememberedValue42222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            if (codepointTransformation4 != null) {
            }
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3222 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
            startRestartGroup.updateRememberedValue(transformedTextFieldState3222);
            rememberedValue42222 = transformedTextFieldState3222;
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState22222 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue42222;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transformedTextFieldState22222);
            androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation92222 = codepointTransformation4;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2222 = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transformedTextFieldState22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState22222, textLayoutState2222, density2222, z3, z4, !booleanValue2222 && isWindowFocused2222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2222 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume42222 = startRestartGroup.consume(localHapticFeedback2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback2222 = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume42222;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume52222 = startRestartGroup.consume(localClipboardManager2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.platform.ClipboardManager clipboardManager2222 = (androidx.compose.ui.platform.ClipboardManager) consume52222;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource4;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume62222 = startRestartGroup.consume(localTextToolbar2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.platform.TextToolbar textToolbar2222 = (androidx.compose.ui.platform.TextToolbar) consume62222;
            final boolean z72222 = z3;
            final boolean z82222 = z4;
            androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback2222, clipboardManager2222, textToolbar2222, density2222, z72222, z82222);
                }
            }, startRestartGroup, 0);
            androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState2222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22222 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                        }
                    };
                }
            }, startRestartGroup, 8);
            scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState22222, textLayoutState2222, textFieldSelectionState2222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual2222)), z3, mutableInteractionSource72222), scrollState2, orientation22222, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState2222.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation22222, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource72222);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
            modifier2 = companion;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
            final androidx.compose.ui.text.TextStyle textStyle42222 = textStyle2;
            final boolean z92222 = z3;
            final boolean z102222 = z4;
            final androidx.compose.foundation.ScrollState scrollState42222 = scrollState2;
            (codepointTransformation82222 != null ? DefaultTextFieldDecorator : codepointTransformation82222).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                    int i23;
                    int i24;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                    if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                        }
                        androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                        if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                            i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                            i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                        } else {
                            i23 = 1;
                            i24 = 1;
                        }
                        androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState2222.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42222, i23, i24), textStyle42222)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue2222 && isWindowFocused2222, textLayoutState2222, transformedTextFieldState22222, textFieldSelectionState2222, brush42222, z92222 && !z102222, scrollState42222, orientation22222));
                        androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState22222 = textLayoutState2222;
                        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState32222 = transformedTextFieldState22222;
                        androidx.compose.ui.text.TextStyle textStyle5 = textStyle42222;
                        boolean z11 = areEqual2222;
                        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function252222;
                        boolean z12 = z92222;
                        boolean z13 = booleanValue2222;
                        boolean z14 = isWindowFocused2222;
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22222 = textFieldSelectionState2222;
                        boolean z15 = z102222;
                        composer2.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor22222);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                        }
                        modifierMaterializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                        androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState22222, transformedTextFieldState32222, textStyle5, z11, function26), composer2, 0);
                        composer2.startReplaceableGroup(-39277302);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                        if (z12 && z13 && z14 && textFieldSelectionState22222.isInTouchMode()) {
                            androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState22222, composer2, 8);
                            if (!z15) {
                                androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState22222, composer2, 8);
                            }
                        }
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            inputTransformation3 = inputTransformation2;
            z5 = z3;
            z6 = z4;
            keyboardActions3 = keyboardActions2;
            brush3 = brush42222;
            textStyle3 = textStyle2;
            keyboardOptions3 = keyboardOptions2;
            scrollState3 = scrollState2;
            function23 = function252222;
            textFieldLineLimits4 = textFieldLineLimits62222;
            mutableInteractionSource5 = mutableInteractionSource3;
            r14 = codepointTransformation82222;
            codepointTransformation5 = codepointTransformation92222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        int i20222 = 8192;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i21222 = i14;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i17 = i3 & 8192;
        if (i17 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i5 == 0) {
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
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        i18 = i21222;
        codepointTransformation3 = codepointTransformation7;
        mutableInteractionSource2 = mutableInteractionSource6;
        codepointTransformation4 = codepointTransformation6;
        textFieldLineLimits3 = textFieldLineLimits2;
        brush2 = solidColor;
        function22 = function24;
        inputTransformation2 = inputTransformation4;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume72222 = startRestartGroup.consume(localDensity22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.unit.Density density22222 = (androidx.compose.ui.unit.Density) consume72222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection222222 = (androidx.compose.ui.unit.LayoutDirection) consume222222;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2522222 = function22;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> localWindowInfo22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume322222 = startRestartGroup.consume(localWindowInfo22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.WindowInfo windowInfo22222 = (androidx.compose.ui.platform.WindowInfo) consume322222;
        final boolean areEqual22222 = kotlin.jvm.internal.Intrinsics.areEqual(textFieldLineLimits3, androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE);
        final androidx.compose.ui.graphics.Brush brush422222 = brush2;
        startRestartGroup.startReplaceableGroup(-957633428);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
        if (mutableInteractionSource2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!areEqual22222) {
        }
        final androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits622222 = textFieldLineLimits3;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation822222 = codepointTransformation3;
        final boolean booleanValue22222 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
        final boolean isWindowFocused22222 = windowInfo22222.isWindowFocused();
        startRestartGroup.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
        final androidx.compose.foundation.gestures.Orientation orientation222222 = orientation;
        java.lang.Object rememberedValue422222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        if (codepointTransformation4 != null) {
        }
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState32222 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
        startRestartGroup.updateRememberedValue(transformedTextFieldState32222);
        rememberedValue422222 = transformedTextFieldState32222;
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState222222 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) rememberedValue422222;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transformedTextFieldState222222);
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation922222 = codepointTransformation4;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue = new androidx.compose.foundation.text2.input.internal.TextLayoutState();
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState22222 = (androidx.compose.foundation.text2.input.internal.TextLayoutState) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transformedTextFieldState222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState(transformedTextFieldState222222, textLayoutState22222, density22222, z3, z4, !booleanValue22222 && isWindowFocused22222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState22222 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) rememberedValue2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume422222 = startRestartGroup.consume(localHapticFeedback22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback22222 = (androidx.compose.ui.hapticfeedback.HapticFeedback) consume422222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume522222 = startRestartGroup.consume(localClipboardManager22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.platform.ClipboardManager clipboardManager22222 = (androidx.compose.ui.platform.ClipboardManager) consume522222;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource722222 = mutableInteractionSource4;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume622222 = startRestartGroup.consume(localTextToolbar22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.platform.TextToolbar textToolbar22222 = (androidx.compose.ui.platform.TextToolbar) consume622222;
        final boolean z722222 = z3;
        final boolean z822222 = z4;
        androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
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
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.update(hapticFeedback22222, clipboardManager22222, textToolbar22222, density22222, z722222, z822222);
            }
        }, startRestartGroup, 0);
        androidx.compose.runtime.EffectsKt.DisposableEffect(textFieldSelectionState22222, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState222222 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        scrollable = androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.foundation.FocusableKt.focusable(companion.then(new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(transformedTextFieldState222222, textLayoutState22222, textFieldSelectionState22222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual22222)), z3, mutableInteractionSource722222), scrollState2, orientation222222, (r14 & 4) != 0 ? true : !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState22222.getDraggingHandle() == null, (r14 & 8) != 0 ? false : androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation222222, false), (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : mutableInteractionSource722222);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(scrollable);
        modifier2 = companion;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
        final androidx.compose.ui.text.TextStyle textStyle422222 = textStyle2;
        final boolean z922222 = z3;
        final boolean z1022222 = z4;
        final androidx.compose.foundation.ScrollState scrollState422222 = scrollState2;
        (codepointTransformation822222 != null ? DefaultTextFieldDecorator : codepointTransformation822222).Decoration(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i22) {
                int i23;
                int i24;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                    }
                    androidx.compose.foundation.text2.input.TextFieldLineLimits textFieldLineLimits7 = androidx.compose.foundation.text2.input.TextFieldLineLimits.this;
                    if (textFieldLineLimits7 instanceof androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) {
                        i23 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                        i24 = ((androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) androidx.compose.foundation.text2.input.TextFieldLineLimits.this).getMaxHeightInLines();
                    } else {
                        i23 = 1;
                        i24 = 1;
                    }
                    androidx.compose.ui.Modifier then = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize(androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, textLayoutState22222.m1156getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle422222, i23, i24), textStyle422222)).then(new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(booleanValue22222 && isWindowFocused22222, textLayoutState22222, transformedTextFieldState222222, textFieldSelectionState22222, brush422222, z922222 && !z1022222, scrollState422222, orientation222222));
                    androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState222222 = textLayoutState22222;
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState322222 = transformedTextFieldState222222;
                    androidx.compose.ui.text.TextStyle textStyle5 = textStyle422222;
                    boolean z11 = areEqual22222;
                    kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function26 = function2522222;
                    boolean z12 = z922222;
                    boolean z13 = booleanValue22222;
                    boolean z14 = isWindowFocused22222;
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState222222 = textFieldSelectionState22222;
                    boolean z15 = z1022222;
                    composer2.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor222222);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy222222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap222222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                    }
                    modifierMaterializerOf222222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                    androidx.compose.foundation.layout.BoxKt.Box(new androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier(textLayoutState222222, transformedTextFieldState322222, textStyle5, z11, function26), composer2, 0);
                    composer2.startReplaceableGroup(-39277302);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                    if (z12 && z13 && z14 && textFieldSelectionState222222.isInTouchMode()) {
                        androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState222222, composer2, 8);
                        if (!z15) {
                            androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState222222, composer2, 8);
                        }
                    }
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 6);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        inputTransformation3 = inputTransformation2;
        z5 = z3;
        z6 = z4;
        keyboardActions3 = keyboardActions2;
        brush3 = brush422222;
        textStyle3 = textStyle2;
        keyboardOptions3 = keyboardOptions2;
        scrollState3 = scrollState2;
        function23 = function2522222;
        textFieldLineLimits4 = textFieldLineLimits622222;
        mutableInteractionSource5 = mutableInteractionSource3;
        r14 = codepointTransformation822222;
        codepointTransformation5 = codepointTransformation922222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldCursorHandle(final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(773754631);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)490@26277L629:BasicTextField2.kt#g98mwb");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(773754631, i, -1, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)");
        }
        final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState cursorHandle = textFieldSelectionState.getCursorHandle();
        if (cursorHandle.getVisible()) {
            long m1181getPositionF1C5BW0 = cursorHandle.m1181getPositionF1C5BW0();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(1290415310);
            boolean changed = startRestartGroup.changed(cursorHandle);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$1$1
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
                        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.getSelectionHandleInfoKey(), new androidx.compose.foundation.text.selection.SelectionHandleInfo(androidx.compose.foundation.text.Handle.Cursor, androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.this.m1181getPositionF1C5BW0(), androidx.compose.foundation.text.selection.SelectionHandleAnchor.Middle, true, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.m849CursorHandleULxng0E(m1181getPositionF1C5BW0, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), textFieldSelectionState, new androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$2(textFieldSelectionState, null)), null, startRestartGroup, 384);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$3
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
                    androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1194626330);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandles)528@27633L397:BasicTextField2.kt#g98mwb");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1194626330, i, -1, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)");
        }
        androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState startSelectionHandle = textFieldSelectionState.getStartSelectionHandle();
        startRestartGroup.startReplaceableGroup(-1453543870);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "515@27123L401");
        if (startSelectionHandle.getVisible()) {
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle(new androidx.compose.foundation.text.selection.OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$1
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo850provideF1C5BW0() {
                    return androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getStartSelectionHandle().m1181getPositionF1C5BW0();
                }
            }, true, startSelectionHandle.getDirection(), startSelectionHandle.getHandlesCrossed(), androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, textFieldSelectionState, new androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$2(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState endSelectionHandle = textFieldSelectionState.getEndSelectionHandle();
        if (endSelectionHandle.getVisible()) {
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle(new androidx.compose.foundation.text.selection.OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$3
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo850provideF1C5BW0() {
                    return androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getEndSelectionHandle().m1181getPositionF1C5BW0();
                }
            }, false, endSelectionHandle.getDirection(), endSelectionHandle.getHandlesCrossed(), androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, textFieldSelectionState, new androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$4(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$5
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
                    androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
