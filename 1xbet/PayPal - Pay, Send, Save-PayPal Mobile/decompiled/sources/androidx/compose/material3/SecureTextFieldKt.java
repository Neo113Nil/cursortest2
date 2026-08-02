package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008f\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"28\b\u0002\u0010#\u001a2\u0012\u0004\u0012\u00020%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010&0\u0012¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0001\u0018\u00010$¢\u0006\u0002\b\u00102\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\b2\u00103\u001a\u008f\u0003\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"28\b\u0002\u0010#\u001a2\u0012\u0004\u0012\u00020%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010&0\u0012¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0001\u0018\u00010$¢\u0006\u0002\b\u00102\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\b5\u00103\"\u000e\u00106\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"SecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "Lkotlin/Function0;", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "SecureTextField-XvU6IwQ", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedSecureTextField", "OutlinedSecureTextField-XvU6IwQ", "SecureTextFieldKeyboardOptions", "DefaultObfuscationCharacter", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SecureTextFieldKt {
    private static final androidx.compose.foundation.text.KeyboardOptions getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.KeyboardOptions(0, java.lang.Boolean.FALSE, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 121, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c2, code lost:
    
        if (r0.changed(r97) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0283  */
    /* renamed from: SecureTextField-XvU6IwQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3690SecureTextFieldXvU6IwQ(final androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, boolean z2, androidx.compose.foundation.text.input.InputTransformation inputTransformation, int i, char c, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function27, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4, final int i5) {
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
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z3;
        final androidx.compose.ui.text.TextStyle textStyle2;
        final androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition2;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        final boolean z4;
        final androidx.compose.foundation.text.input.InputTransformation inputTransformation2;
        final int i27;
        final char c2;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        final androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function214;
        final androidx.compose.ui.graphics.Shape shape2;
        final androidx.compose.material3.TextFieldColors textFieldColors2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.material3.TextFieldLabelPosition.Attached attached;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215;
        int i28;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function216;
        androidx.compose.ui.graphics.Shape shape3;
        androidx.compose.ui.graphics.Shape shape4;
        androidx.compose.material3.TextFieldColors textFieldColors3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.graphics.Shape shape5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.material3.TextFieldColors textFieldColors4;
        androidx.compose.foundation.layout.PaddingValues paddingValues4;
        int i29;
        int i30;
        char c3;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z6;
        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler3;
        kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function217;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219;
        int i31;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function222;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function223;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function224;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        int i32;
        int i33;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1177133806);
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i5 & 8) == 0 && startRestartGroup.changed(textStyle)) {
                        i33 = 2048;
                        i6 |= i33;
                    }
                    i33 = 1024;
                    i6 |= i33;
                }
                int i35 = 16384;
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0 && startRestartGroup.changed(textFieldLabelPosition)) {
                        i32 = 16384;
                        i6 |= i32;
                    }
                    i32 = 8192;
                    i6 |= i32;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i6 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i6 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i6 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i6 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i14 = i3 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 48) == 0) {
                    i14 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                i16 = i14;
                i17 = i5 & 4096;
                if (i17 != 0) {
                    i16 |= 384;
                } else if ((i3 & 384) == 0) {
                    i16 |= startRestartGroup.changed(z2) ? 256 : 128;
                    i18 = i5 & 8192;
                    if (i18 == 0) {
                        i16 |= 3072;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if ((i3 & 3072) == 0) {
                            i16 |= startRestartGroup.changed(inputTransformation) ? 2048 : 1024;
                            if ((i3 & 24576) == 0) {
                                if ((i5 & 16384) != 0) {
                                }
                                i35 = 8192;
                                i16 |= i35;
                            }
                            i20 = i5 & 32768;
                            if (i20 != 0) {
                                i16 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i16 |= startRestartGroup.changed(c) ? 131072 : 65536;
                            }
                            i21 = i5 & 65536;
                            if (i21 != 0) {
                                i16 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i16 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                            }
                            i22 = i5 & 131072;
                            if (i22 != 0) {
                                i16 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i16 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                            }
                            i23 = i5 & 262144;
                            if (i23 != 0) {
                                i16 |= 100663296;
                            } else if ((i3 & 100663296) == 0) {
                                i16 |= startRestartGroup.changedInstance(function27) ? 67108864 : 33554432;
                            }
                            if ((i3 & 805306368) == 0) {
                                i16 |= ((i5 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                            }
                            if ((i4 & 6) == 0) {
                                i24 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                            } else {
                                i24 = i4;
                            }
                            if ((i4 & 48) == 0) {
                                i24 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(paddingValues)) ? 32 : 16;
                            }
                            i25 = i24;
                            i26 = i5 & 4194304;
                            if (i26 != 0) {
                                i25 |= 384;
                            } else if ((i4 & 384) == 0) {
                                i25 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        if ((i5 & 16384) != 0) {
                                            i16 &= -57345;
                                        }
                                        if ((i5 & 524288) != 0) {
                                            i16 &= -1879048193;
                                        }
                                        companion = modifier;
                                        z5 = z;
                                        textStyle3 = textStyle;
                                        attached = textFieldLabelPosition;
                                        function33 = function3;
                                        function218 = function2;
                                        function215 = function22;
                                        function222 = function23;
                                        function221 = function25;
                                        z6 = z2;
                                        inputTransformation3 = inputTransformation;
                                        i30 = i;
                                        c3 = c;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        function217 = function27;
                                        shape5 = shape;
                                        textFieldColors4 = textFieldColors;
                                        paddingValues4 = paddingValues;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        i29 = i6;
                                        i31 = i16;
                                        function219 = function24;
                                        function220 = function26;
                                    } else {
                                        companion = i34 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        z5 = i7 != 0 ? true : z;
                                        if ((i5 & 8) != 0) {
                                            textStyle3 = (androidx.compose.ui.text.TextStyle) startRestartGroup.consume(androidx.compose.material3.TextKt.getLocalTextStyle());
                                            i6 &= -7169;
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        if ((i5 & 16) != 0) {
                                            attached = new androidx.compose.material3.TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                            i6 &= -57345;
                                        } else {
                                            attached = textFieldLabelPosition;
                                        }
                                        kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = i8 != 0 ? null : function3;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function225 = i9 != 0 ? null : function2;
                                        function215 = i10 != 0 ? null : function22;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function226 = i11 != 0 ? null : function23;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function227 = i12 != 0 ? null : function24;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function228 = i13 != 0 ? null : function25;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function229 = i15 != 0 ? null : function26;
                                        boolean z7 = i17 != 0 ? false : z2;
                                        androidx.compose.foundation.text.input.InputTransformation inputTransformation4 = i19 != 0 ? null : inputTransformation;
                                        if ((i5 & 16384) != 0) {
                                            i28 = androidx.compose.foundation.text.input.TextObfuscationMode.INSTANCE.m2202getRevealLastTypedvTwcZD0();
                                            i16 &= -57345;
                                        } else {
                                            i28 = i;
                                        }
                                        char c4 = i20 != 0 ? (char) 8226 : c;
                                        androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i21 != 0 ? getHighSpeedVideoFpsRanges : keyboardOptions;
                                        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler4 = i22 != 0 ? null : keyboardActionHandler;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function230 = i23 != 0 ? null : function27;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function231 = function226;
                                        if ((i5 & 524288) != 0) {
                                            function216 = function227;
                                            shape3 = androidx.compose.material3.TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            i16 &= -1879048193;
                                        } else {
                                            function216 = function227;
                                            shape3 = shape;
                                        }
                                        if ((i5 & 1048576) != 0) {
                                            shape4 = shape3;
                                            textFieldColors3 = androidx.compose.material3.TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        } else {
                                            shape4 = shape3;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        if ((2097152 & i5) == 0) {
                                            paddingValues3 = paddingValues;
                                        } else if (function34 == null || (attached instanceof androidx.compose.material3.TextFieldLabelPosition.Above)) {
                                            paddingValues3 = androidx.compose.material3.TextFieldDefaults.m3951contentPaddingWithoutLabela9UjIt4$default(androidx.compose.material3.TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValues3 = androidx.compose.material3.TextFieldDefaults.m3950contentPaddingWithLabela9UjIt4$default(androidx.compose.material3.TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        shape5 = shape4;
                                        if (i26 != 0) {
                                            textFieldColors4 = textFieldColors3;
                                            paddingValues4 = paddingValues3;
                                            i29 = i6;
                                            i30 = i28;
                                            c3 = c4;
                                            keyboardOptions3 = keyboardOptions4;
                                            z6 = z7;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            function33 = function34;
                                            function217 = function230;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            textFieldColors4 = textFieldColors3;
                                            paddingValues4 = paddingValues3;
                                            i29 = i6;
                                            i30 = i28;
                                            c3 = c4;
                                            keyboardOptions3 = keyboardOptions4;
                                            z6 = z7;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            function33 = function34;
                                            function217 = function230;
                                        }
                                        function218 = function225;
                                        function219 = function216;
                                        i31 = i16;
                                        function220 = function229;
                                        function221 = function228;
                                        function222 = function231;
                                        inputTransformation3 = inputTransformation4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        function224 = function220;
                                        function223 = function221;
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1177133806, i29, i31, "androidx.compose.material3.SecureTextField (SecureTextField.kt:155)");
                                    } else {
                                        function223 = function221;
                                        function224 = function220;
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-413168883);
                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1649239306);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    startRestartGroup.startReplaceGroup(1649245416);
                                    long m8069getColor0d7_KjU = textStyle3.m8069getColor0d7_KjU();
                                    if (m8069getColor0d7_KjU == 16) {
                                        m8069getColor0d7_KjU = textFieldColors4.m3946textColorXeAY9LY$material3(z5, z6, androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final androidx.compose.ui.text.TextStyle merge = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m8069getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777214, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                    final androidx.compose.ui.Modifier modifier3 = companion;
                                    final boolean z8 = z6;
                                    final androidx.compose.material3.TextFieldColors textFieldColors5 = textFieldColors4;
                                    final boolean z9 = z5;
                                    final androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition3 = attached;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = function33;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function232 = function218;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function233 = function215;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function234 = function222;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function235 = function219;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function236 = function223;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function237 = function224;
                                    final androidx.compose.foundation.layout.PaddingValues paddingValues5 = paddingValues4;
                                    final androidx.compose.foundation.text.input.InputTransformation inputTransformation5 = inputTransformation3;
                                    final androidx.compose.foundation.text.KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    final androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler5 = keyboardActionHandler3;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function238 = function217;
                                    final int i36 = i30;
                                    final char c5 = c3;
                                    final androidx.compose.ui.graphics.Shape shape6 = shape5;
                                    kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function33;
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4.getTextSelectionColors()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2072926674, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SecureTextFieldKt$SecureTextField$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            androidx.compose.runtime.Composer composer3 = composer2;
                                            int intValue = num.intValue();
                                            if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-2072926674, intValue, -1, "androidx.compose.material3.SecureTextField.<anonymous> (SecureTextField.kt:167)");
                                                }
                                                androidx.compose.ui.Modifier modifier4 = androidx.compose.ui.Modifier.this;
                                                boolean z10 = z8;
                                                androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                                                androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1724defaultMinSizeVpY3zN4(androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics(modifier4, z10, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.ui.R.string.default_error_message), composer3, 0)), androidx.compose.material3.TextFieldDefaults.INSTANCE.m3967getMinWidthD9Ej5fM(), androidx.compose.material3.TextFieldDefaults.INSTANCE.m3966getMinHeightD9Ej5fM());
                                                androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(textFieldColors5.m3896cursorColorvNxB06k$material3(z8), null);
                                                androidx.compose.material3.TextFieldDefaults textFieldDefaults = androidx.compose.material3.TextFieldDefaults.INSTANCE;
                                                androidx.compose.foundation.text.input.TextFieldState textFieldState2 = textFieldState;
                                                boolean z11 = z9;
                                                androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine singleLine = androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE;
                                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                                androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition4 = textFieldLabelPosition3;
                                                kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function35;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function239 = function232;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function240 = function233;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function241 = function234;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function242 = function235;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function243 = function236;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function244 = function237;
                                                boolean z12 = z8;
                                                androidx.compose.material3.TextFieldColors textFieldColors6 = textFieldColors5;
                                                androidx.compose.foundation.layout.PaddingValues paddingValues6 = paddingValues5;
                                                final boolean z13 = z9;
                                                final boolean z14 = z8;
                                                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                                final androidx.compose.material3.TextFieldColors textFieldColors7 = textFieldColors5;
                                                final androidx.compose.ui.graphics.Shape shape7 = shape6;
                                                androidx.compose.foundation.text.BasicSecureTextFieldKt.m1983BasicSecureTextFieldegD4TGM(textFieldState, m1724defaultMinSizeVpY3zN4, z9, false, inputTransformation5, merge, keyboardOptions5, keyboardActionHandler5, function238, mutableInteractionSource4, solidColor, textFieldDefaults.decorator(textFieldState2, z11, singleLine, null, mutableInteractionSource5, textFieldLabelPosition4, function37, function239, function240, function241, function242, function243, function244, z12, textFieldColors6, paddingValues6, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-43781811, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SecureTextFieldKt$SecureTextField$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                                        androidx.compose.runtime.Composer composer5 = composer4;
                                                        int intValue2 = num2.intValue();
                                                        if (!composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                        } else {
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(-43781811, intValue2, -1, "androidx.compose.material3.SecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:205)");
                                                            }
                                                            androidx.compose.material3.TextFieldDefaults.INSTANCE.m3960Container4EFweAY(z13, z14, mutableInteractionSource6, null, textFieldColors7, shape7, 0.0f, 0.0f, composer5, 100663296, 200);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }, composer3, 54), composer3, 3456, 14155776, 0), i36, c5, composer3, 0, 0, 8);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    function32 = function36;
                                    function28 = function218;
                                    modifier2 = companion;
                                    z4 = z6;
                                    function29 = function215;
                                    textFieldColors2 = textFieldColors4;
                                    textFieldLabelPosition2 = attached;
                                    i27 = i30;
                                    c2 = c3;
                                    keyboardOptions2 = keyboardOptions3;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    function214 = function217;
                                    shape2 = shape5;
                                    paddingValues2 = paddingValues4;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    inputTransformation2 = inputTransformation3;
                                    function213 = function224;
                                    function212 = function223;
                                    boolean z10 = z5;
                                    function210 = function222;
                                    z3 = z10;
                                    androidx.compose.ui.text.TextStyle textStyle4 = textStyle3;
                                    function211 = function219;
                                    textStyle2 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    z3 = z;
                                    textStyle2 = textStyle;
                                    textFieldLabelPosition2 = textFieldLabelPosition;
                                    function32 = function3;
                                    function28 = function2;
                                    function29 = function22;
                                    function210 = function23;
                                    function211 = function24;
                                    function212 = function25;
                                    function213 = function26;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    i27 = i;
                                    c2 = c;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    function214 = function27;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SecureTextFieldKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.compose.material3.SecureTextFieldKt.m3688$r8$lambda$05OZ6QWA_6tckvBGw9qgTneCQE(androidx.compose.foundation.text.input.TextFieldState.this, modifier2, z3, textStyle2, textFieldLabelPosition2, function32, function28, function29, function210, function211, function212, function213, z4, inputTransformation2, i27, c2, keyboardOptions2, keyboardActionHandler2, function214, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i2, i3, i4, i5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i20 = i5 & 32768;
                    if (i20 != 0) {
                    }
                    i21 = i5 & 65536;
                    if (i21 != 0) {
                    }
                    i22 = i5 & 131072;
                    if (i22 != 0) {
                    }
                    i23 = i5 & 262144;
                    if (i23 != 0) {
                    }
                    if ((i3 & 805306368) == 0) {
                    }
                    if ((i4 & 6) == 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    i25 = i24;
                    i26 = i5 & 4194304;
                    if (i26 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i18 = i5 & 8192;
                if (i18 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i20 = i5 & 32768;
                if (i20 != 0) {
                }
                i21 = i5 & 65536;
                if (i21 != 0) {
                }
                i22 = i5 & 131072;
                if (i22 != 0) {
                }
                i23 = i5 & 262144;
                if (i23 != 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                if ((i4 & 6) == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                i25 = i24;
                i26 = i5 & 4194304;
                if (i26 != 0) {
                }
                if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 3072) == 0) {
            }
            int i352 = 16384;
            if ((i2 & 24576) == 0) {
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            i16 = i14;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            i18 = i5 & 8192;
            if (i18 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i20 = i5 & 32768;
            if (i20 != 0) {
            }
            i21 = i5 & 65536;
            if (i21 != 0) {
            }
            i22 = i5 & 131072;
            if (i22 != 0) {
            }
            i23 = i5 & 262144;
            if (i23 != 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            if ((i4 & 6) == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            i25 = i24;
            i26 = i5 & 4194304;
            if (i26 != 0) {
            }
            if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i3522 = 16384;
        if ((i2 & 24576) == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        i16 = i14;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        i18 = i5 & 8192;
        if (i18 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i20 = i5 & 32768;
        if (i20 != 0) {
        }
        i21 = i5 & 65536;
        if (i21 != 0) {
        }
        i22 = i5 & 131072;
        if (i22 != 0) {
        }
        i23 = i5 & 262144;
        if (i23 != 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        if ((i4 & 6) == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i25 = i24;
        i26 = i5 & 4194304;
        if (i26 != 0) {
        }
        if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c2, code lost:
    
        if (r0.changed(r97) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0283  */
    /* renamed from: OutlinedSecureTextField-XvU6IwQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3689OutlinedSecureTextFieldXvU6IwQ(final androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, boolean z2, androidx.compose.foundation.text.input.InputTransformation inputTransformation, int i, char c, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function27, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4, final int i5) {
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
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z3;
        final androidx.compose.ui.text.TextStyle textStyle2;
        final androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition2;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        final boolean z4;
        final androidx.compose.foundation.text.input.InputTransformation inputTransformation2;
        final int i27;
        final char c2;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        final androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function214;
        final androidx.compose.ui.graphics.Shape shape2;
        final androidx.compose.material3.TextFieldColors textFieldColors2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.material3.TextFieldLabelPosition.Attached attached;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215;
        int i28;
        androidx.compose.ui.graphics.Shape shape3;
        androidx.compose.ui.graphics.Shape shape4;
        androidx.compose.material3.TextFieldColors textFieldColors3;
        androidx.compose.ui.graphics.Shape shape5;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.material3.TextFieldColors textFieldColors4;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        int i29;
        int i30;
        char c3;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z6;
        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler3;
        kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function216;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function217;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218;
        int i31;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function222;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function223;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        int i32;
        int i33;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-273370384);
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i5 & 8) == 0 && startRestartGroup.changed(textStyle)) {
                        i33 = 2048;
                        i6 |= i33;
                    }
                    i33 = 1024;
                    i6 |= i33;
                }
                int i35 = 16384;
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0 && startRestartGroup.changed(textFieldLabelPosition)) {
                        i32 = 16384;
                        i6 |= i32;
                    }
                    i32 = 8192;
                    i6 |= i32;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i6 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i6 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i6 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i6 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i14 = i3 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 48) == 0) {
                    i14 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                i16 = i14;
                i17 = i5 & 4096;
                if (i17 != 0) {
                    i16 |= 384;
                } else if ((i3 & 384) == 0) {
                    i16 |= startRestartGroup.changed(z2) ? 256 : 128;
                    i18 = i5 & 8192;
                    if (i18 == 0) {
                        i16 |= 3072;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if ((i3 & 3072) == 0) {
                            i16 |= startRestartGroup.changed(inputTransformation) ? 2048 : 1024;
                            if ((i3 & 24576) == 0) {
                                if ((i5 & 16384) != 0) {
                                }
                                i35 = 8192;
                                i16 |= i35;
                            }
                            i20 = i5 & 32768;
                            if (i20 != 0) {
                                i16 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i16 |= startRestartGroup.changed(c) ? 131072 : 65536;
                            }
                            i21 = i5 & 65536;
                            if (i21 != 0) {
                                i16 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i16 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                            }
                            i22 = i5 & 131072;
                            if (i22 != 0) {
                                i16 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i16 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                            }
                            i23 = i5 & 262144;
                            if (i23 != 0) {
                                i16 |= 100663296;
                            } else if ((i3 & 100663296) == 0) {
                                i16 |= startRestartGroup.changedInstance(function27) ? 67108864 : 33554432;
                            }
                            if ((i3 & 805306368) == 0) {
                                i16 |= ((i5 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                            }
                            if ((i4 & 6) == 0) {
                                i24 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                            } else {
                                i24 = i4;
                            }
                            if ((i4 & 48) == 0) {
                                i24 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(paddingValues)) ? 32 : 16;
                            }
                            i25 = i24;
                            i26 = i5 & 4194304;
                            if (i26 != 0) {
                                i25 |= 384;
                            } else if ((i4 & 384) == 0) {
                                i25 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        if ((i5 & 16384) != 0) {
                                            i16 &= -57345;
                                        }
                                        if ((i5 & 524288) != 0) {
                                            i16 &= -1879048193;
                                        }
                                        companion = modifier;
                                        z5 = z;
                                        textStyle3 = textStyle;
                                        attached = textFieldLabelPosition;
                                        function33 = function3;
                                        function217 = function2;
                                        function215 = function22;
                                        function221 = function23;
                                        function220 = function25;
                                        z6 = z2;
                                        inputTransformation3 = inputTransformation;
                                        i30 = i;
                                        c3 = c;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        function216 = function27;
                                        shape5 = shape;
                                        textFieldColors4 = textFieldColors;
                                        paddingValues3 = paddingValues;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        i29 = i6;
                                        i31 = i16;
                                        function218 = function24;
                                        function219 = function26;
                                    } else {
                                        companion = i34 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        z5 = i7 != 0 ? true : z;
                                        if ((i5 & 8) != 0) {
                                            textStyle3 = (androidx.compose.ui.text.TextStyle) startRestartGroup.consume(androidx.compose.material3.TextKt.getLocalTextStyle());
                                            i6 &= -7169;
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        if ((i5 & 16) != 0) {
                                            attached = new androidx.compose.material3.TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                            i6 &= -57345;
                                        } else {
                                            attached = textFieldLabelPosition;
                                        }
                                        kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = i8 != 0 ? null : function3;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function224 = i9 != 0 ? null : function2;
                                        function215 = i10 != 0 ? null : function22;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function225 = i11 != 0 ? null : function23;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function226 = i12 != 0 ? null : function24;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function227 = i13 != 0 ? null : function25;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function228 = i15 != 0 ? null : function26;
                                        boolean z7 = i17 != 0 ? false : z2;
                                        androidx.compose.foundation.text.input.InputTransformation inputTransformation4 = i19 != 0 ? null : inputTransformation;
                                        if ((i5 & 16384) != 0) {
                                            i28 = androidx.compose.foundation.text.input.TextObfuscationMode.INSTANCE.m2202getRevealLastTypedvTwcZD0();
                                            i16 &= -57345;
                                        } else {
                                            i28 = i;
                                        }
                                        char c4 = i20 != 0 ? (char) 8226 : c;
                                        androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i21 != 0 ? getHighSpeedVideoFpsRanges : keyboardOptions;
                                        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler4 = i22 != 0 ? null : keyboardActionHandler;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function229 = i23 != 0 ? null : function27;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function230 = function225;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function231 = function226;
                                        if ((i5 & 524288) != 0) {
                                            shape3 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            i16 &= -1879048193;
                                        } else {
                                            shape3 = shape;
                                        }
                                        if ((i5 & 1048576) != 0) {
                                            shape4 = shape3;
                                            textFieldColors3 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        } else {
                                            shape4 = shape3;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        androidx.compose.foundation.layout.PaddingValues m3580contentPaddinga9UjIt4$default = (2097152 & i5) != 0 ? androidx.compose.material3.OutlinedTextFieldDefaults.m3580contentPaddinga9UjIt4$default(androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
                                        shape5 = shape4;
                                        if (i26 != 0) {
                                            textFieldColors4 = textFieldColors3;
                                            paddingValues3 = m3580contentPaddinga9UjIt4$default;
                                            i29 = i6;
                                            i30 = i28;
                                            c3 = c4;
                                            keyboardOptions3 = keyboardOptions4;
                                            z6 = z7;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            function33 = function34;
                                            function216 = function229;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            textFieldColors4 = textFieldColors3;
                                            paddingValues3 = m3580contentPaddinga9UjIt4$default;
                                            i29 = i6;
                                            i30 = i28;
                                            c3 = c4;
                                            keyboardOptions3 = keyboardOptions4;
                                            z6 = z7;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            function33 = function34;
                                            function216 = function229;
                                        }
                                        function217 = function224;
                                        function218 = function231;
                                        i31 = i16;
                                        function219 = function228;
                                        function220 = function227;
                                        function221 = function230;
                                        inputTransformation3 = inputTransformation4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        function223 = function219;
                                        function222 = function220;
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-273370384, i29, i31, "androidx.compose.material3.OutlinedSecureTextField (SecureTextField.kt:315)");
                                    } else {
                                        function222 = function220;
                                        function223 = function219;
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-717679893);
                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-715888276);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    startRestartGroup.startReplaceGroup(-715882166);
                                    long m8069getColor0d7_KjU = textStyle3.m8069getColor0d7_KjU();
                                    if (m8069getColor0d7_KjU == 16) {
                                        m8069getColor0d7_KjU = textFieldColors4.m3946textColorXeAY9LY$material3(z5, z6, androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = function33;
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4.getTextSelectionColors()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1147500080, true, new androidx.compose.material3.SecureTextFieldKt$OutlinedSecureTextField$1(companion, function33, attached, z6, textFieldColors4, textFieldState, z5, mutableInteractionSource4, function217, function215, function221, function218, function222, function223, paddingValues3, inputTransformation3, textStyle3.merge(new androidx.compose.ui.text.TextStyle(m8069getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777214, (kotlin.jvm.internal.DefaultConstructorMarker) null)), keyboardOptions3, keyboardActionHandler3, function216, i30, c3, shape5), startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    function32 = function35;
                                    function28 = function217;
                                    modifier2 = companion;
                                    z4 = z6;
                                    function29 = function215;
                                    textFieldColors2 = textFieldColors4;
                                    textFieldLabelPosition2 = attached;
                                    i27 = i30;
                                    c2 = c3;
                                    keyboardOptions2 = keyboardOptions3;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    function214 = function216;
                                    shape2 = shape5;
                                    paddingValues2 = paddingValues3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    inputTransformation2 = inputTransformation3;
                                    function213 = function223;
                                    function212 = function222;
                                    boolean z8 = z5;
                                    function210 = function221;
                                    z3 = z8;
                                    androidx.compose.ui.text.TextStyle textStyle4 = textStyle3;
                                    function211 = function218;
                                    textStyle2 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    z3 = z;
                                    textStyle2 = textStyle;
                                    textFieldLabelPosition2 = textFieldLabelPosition;
                                    function32 = function3;
                                    function28 = function2;
                                    function29 = function22;
                                    function210 = function23;
                                    function211 = function24;
                                    function212 = function25;
                                    function213 = function26;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    i27 = i;
                                    c2 = c;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    function214 = function27;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SecureTextFieldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.compose.material3.SecureTextFieldKt.$r8$lambda$WnyQhMsiKwsUU4fnKzjPoAjvjpc(androidx.compose.foundation.text.input.TextFieldState.this, modifier2, z3, textStyle2, textFieldLabelPosition2, function32, function28, function29, function210, function211, function212, function213, z4, inputTransformation2, i27, c2, keyboardOptions2, keyboardActionHandler2, function214, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i2, i3, i4, i5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i20 = i5 & 32768;
                    if (i20 != 0) {
                    }
                    i21 = i5 & 65536;
                    if (i21 != 0) {
                    }
                    i22 = i5 & 131072;
                    if (i22 != 0) {
                    }
                    i23 = i5 & 262144;
                    if (i23 != 0) {
                    }
                    if ((i3 & 805306368) == 0) {
                    }
                    if ((i4 & 6) == 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    i25 = i24;
                    i26 = i5 & 4194304;
                    if (i26 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i18 = i5 & 8192;
                if (i18 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i20 = i5 & 32768;
                if (i20 != 0) {
                }
                i21 = i5 & 65536;
                if (i21 != 0) {
                }
                i22 = i5 & 131072;
                if (i22 != 0) {
                }
                i23 = i5 & 262144;
                if (i23 != 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                if ((i4 & 6) == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                i25 = i24;
                i26 = i5 & 4194304;
                if (i26 != 0) {
                }
                if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 3072) == 0) {
            }
            int i352 = 16384;
            if ((i2 & 24576) == 0) {
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            i16 = i14;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            i18 = i5 & 8192;
            if (i18 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i20 = i5 & 32768;
            if (i20 != 0) {
            }
            i21 = i5 & 65536;
            if (i21 != 0) {
            }
            i22 = i5 & 131072;
            if (i22 != 0) {
            }
            i23 = i5 & 262144;
            if (i23 != 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            if ((i4 & 6) == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            i25 = i24;
            i26 = i5 & 4194304;
            if (i26 != 0) {
            }
            if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i3522 = 16384;
        if ((i2 & 24576) == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        i16 = i14;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        i18 = i5 & 8192;
        if (i18 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i20 = i5 & 32768;
        if (i20 != 0) {
        }
        i21 = i5 & 65536;
        if (i21 != 0) {
        }
        i22 = i5 & 131072;
        if (i22 != 0) {
        }
        i23 = i5 & 262144;
        if (i23 != 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        if ((i4 & 6) == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i25 = i24;
        i26 = i5 & 4194304;
        if (i26 != 0) {
        }
        if (!startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i16) == 306783378 && (i25 & 147) == 146) ? false : true, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$05OZ6QWA_6tckvBGw9qgTneC-QE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3688$r8$lambda$05OZ6QWA_6tckvBGw9qgTneCQE(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, kotlin.jvm.functions.Function2 function26, boolean z2, androidx.compose.foundation.text.input.InputTransformation inputTransformation, int i, char c, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2 function27, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, androidx.compose.runtime.Composer composer, int i6) {
        m3690SecureTextFieldXvU6IwQ(textFieldState, modifier, z, textStyle, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, function27, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WnyQhMsiKwsUU4fnKzjPoAjvjpc(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, kotlin.jvm.functions.Function2 function26, boolean z2, androidx.compose.foundation.text.input.InputTransformation inputTransformation, int i, char c, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, kotlin.jvm.functions.Function2 function27, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, androidx.compose.runtime.Composer composer, int i6) {
        m3689OutlinedSecureTextFieldXvU6IwQ(textFieldState, modifier, z, textStyle, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, function27, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return kotlin.Unit.INSTANCE;
    }
}
